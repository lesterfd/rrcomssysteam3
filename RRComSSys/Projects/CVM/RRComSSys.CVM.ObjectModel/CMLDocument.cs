using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using RRComSSys.CVM.Common;
using System.Xml;
using System.Xml.Serialization;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;

namespace RRComSSys.CVM.ObjectModel
{
	public class CMLDocument
	{
		#region Member Variables
		private String _documentLoadedFrom;
		private CMLType _documentType;
		#endregion

		#region Events
		public event EventHandler DocumentLoaded;
		#endregion

		#region Properties
		public CMLType DocumentType
		{
			get { return _documentType; }
		}
		#endregion

		#region Static Methods

		public static TDoc LoadDocument<TDoc>(String fileName)
			where TDoc : CMLDocument
		{
			FileInfo file = new FileInfo(fileName);
			return LoadDocument<TDoc>(file);
		}

		public static TDoc LoadDocument<TDoc>(FileInfo file)
			where TDoc : CMLDocument
		{
			// Setup out params
			CMLType docType = CMLType.Other;
			Type fileType = null;

			// Error check and get document info
			DoErrorCheck(file);
			GetDocumentInfo(file, out docType, out fileType);

			// Load document
			String xmlText = LoadDocumentToText(file);
			CMLDocument result = LoadDocumentFromText<TDoc>(xmlText);

			// Post process and return
			result._documentLoadedFrom = file.FullName;
			return (TDoc) result;
		}

		public static TDoc LoadDocumentFromText<TDoc>(String xmlText)
			where TDoc : CMLDocument
		{
			// Deserialize
			CMLDocument result = null;
			result = Deserialize<TDoc>(xmlText);
			result._documentType = GetDocumentType(typeof(TDoc));

			// Throw exception on null result
			if (result == null)
				throw new CMLDocumentException(Constants.Messages.MSG_ERROR_DESERIALIZE);

			// Run onLoad
			result.OnLoad();
			if (result.DocumentLoaded != null)
				result.DocumentLoaded(result, EventArgs.Empty);

			return (TDoc)result;
		}

		public static String LoadDocumentToText(String fileName)
		{
			return LoadDocumentToText(new FileInfo(fileName));
		}

		public static String LoadDocumentToText(FileInfo file)
		{
			// Read document into a string
			String xmlText = null;
			try
			{
				using (FileStream fs = new FileStream(file.FullName, FileMode.Open, FileAccess.Read))
				using (StreamReader sr = new StreamReader(fs))
					xmlText = sr.ReadToEnd();
			}
			catch (Exception e)
			{
				throw new CMLDocumentException(
					String.Format(
						Constants.Messages.MSG_ERROR_LOAD,
						file.Name), e);
			}

			return xmlText;
		}

		public static TDoc Deserialize<TDoc>(String xmlText)
			where TDoc : CMLDocument
		{
			StringReader stringReader = new StringReader(xmlText);
			XmlTextReader xmlTextReader = new XmlTextReader(stringReader);
			XmlSerializer xmlSerializer = new XmlSerializer(typeof(TDoc));
			return (TDoc)xmlSerializer.Deserialize(xmlTextReader);
		}

		public static CMLType GetDocumentType(String fileName)
		{
			return GetDocumentType(new FileInfo(fileName));
		}

		public static CMLType GetDocumentType(FileInfo file)
		{
			if (!file.Exists) return CMLType.Other;
			else if (file.Extension.Equals(Constants.Extensions.GCML, StringComparison.CurrentCultureIgnoreCase))
				return CMLType.GCML;
			else if (file.Extension.Equals(Constants.Extensions.GCMLWorkflow, StringComparison.CurrentCultureIgnoreCase))
				return CMLType.GCMLWorkflow;
			else if (file.Extension.Equals(Constants.Extensions.XCML, StringComparison.CurrentCultureIgnoreCase))
				return CMLType.XCML;
			else if (file.Extension.Equals(Constants.Extensions.XCMLWorkflow, StringComparison.CurrentCultureIgnoreCase))
				return CMLType.XCMLWorkflow;
			else
				return CMLType.Other;
		}

		public static CMLType GetDocumentType(Type fileType)
		{
			if (fileType == typeof(XCMLDocument))
				return CMLType.XCML;
			else if (fileType == typeof(XCMLWorkflowDocument))
				return CMLType.XCMLWorkflow;
			else
				return CMLType.Other;
		}

		#endregion

		#region Public Methods
		public override string ToString()
		{
			return Serialize();
		}

		public bool SaveDocument()
		{
			return SaveDocument(_documentLoadedFrom);
		}

		public bool SaveDocument(String fileName)
		{
			Exception result;
			return SaveDocument(fileName, out result);
		}

		public bool SaveDocument(String fileName, out Exception exception)
		{
			exception = null;
			try
			{
				String xmlString = Serialize();
				FileInfo xmlFile = new FileInfo(fileName);
				StreamWriter streamWriter = xmlFile.CreateText();
				streamWriter.WriteLine(xmlString);
				streamWriter.Close();
				return true;
			}
			catch (System.Exception e)
			{
				exception = e;
				return false;
			}
		}
		#endregion

		#region Private Methods
		private static void GetDocumentInfo(FileInfo file, out CMLType cmlType, out Type fileType)
		{
			// Setup out params
			fileType = null;
			cmlType = CMLType.XCML;

			// Setup info
			if (file.Extension.Equals(Constants.Extensions.XCML, StringComparison.CurrentCultureIgnoreCase))
			{
				cmlType = CMLType.XCML;
				fileType = typeof(XCMLDocument);
			}
			else if (file.Extension.Equals(Constants.Extensions.XCMLWorkflow, StringComparison.CurrentCultureIgnoreCase))
			{
				cmlType = CMLType.XCMLWorkflow;
				fileType = typeof(XCMLWorkflowDocument);
			}
			else
				throw new CMLDocumentException(String.Format(Constants.Messages.MSG_NOT_SUPPORTED,
						file.Name));
		}

		private static void DoErrorCheck(FileInfo file)
		{
			if (!file.Exists)
				throw new FileNotFoundException(String.Format(Constants.Messages.MSG_FILE_NOT_EXISTS,
						file.Name));
			if (Directory.Exists(file.FullName))
				throw new ArgumentException(String.Format(Constants.Messages.MSG_NOT_A_FILE,
						file.Name));
		}

		protected String Serialize()
		{
			XmlSerializer xmlSerializer = new XmlSerializer(this.GetType());
			MemoryStream memoryStream = new MemoryStream();
			xmlSerializer.Serialize(memoryStream, this);
			memoryStream.Seek(0, SeekOrigin.Begin);
			StreamReader streamReader = new StreamReader(memoryStream);
			return streamReader.ReadToEnd();
		}

		protected virtual void OnLoad() { }
		#endregion
	}

	public enum CMLType
	{
		Other,
		GCML,
		GCMLWorkflow,
		XCML,
		XCMLWorkflow
	}
}
