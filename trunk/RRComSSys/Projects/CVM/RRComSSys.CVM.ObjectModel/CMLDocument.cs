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
		#region Events
		public event EventHandler DocumentLoaded;
		#endregion

		#region Static Methods

		public static CMLDocument LoadDocument(String fileName)
		{
			FileInfo file = new FileInfo(fileName);
			return LoadDocument(file);
		}

		public static CMLDocument LoadDocument(FileInfo file)
		{
			// Error checking
			if (!file.Exists)
				throw new FileNotFoundException(String.Format(Constants.Messages.MSG_FILE_NOT_EXISTS,
						file.Name));
			if (Directory.Exists(file.FullName))
				throw new ArgumentException(String.Format(Constants.Messages.MSG_NOT_A_FILE,
						file.Name));

			// Load either WF or XCML based on extension
			CMLDocument result = null;
			Type fileType = null;
			String errorMessage = null;
			if (file.Extension.Equals(Constants.Extensions.XCML, StringComparison.CurrentCultureIgnoreCase))
			{
				fileType = typeof(XCMLDocument);
				errorMessage = Constants.Messages.MSG_ERROR_XCML;
			}
			else if (file.Extension.Equals(Constants.Extensions.XCMLWorkflow, StringComparison.CurrentCultureIgnoreCase))
			{
				fileType = typeof(XCMLWorkflowDocument);
				errorMessage = Constants.Messages.MSG_ERROR_WF;
			}
			else
				throw new CMLDocumentException(String.Format(Constants.Messages.MSG_NOT_SUPPORTED,
						file.Name));
			try
			{
				String xmlText = null;
				using(FileStream fs = new FileStream(file.FullName, FileMode.Open, FileAccess.Read))
				using(StreamReader sr = new StreamReader(fs))
				{
					xmlText = sr.ReadToEnd();
				}
				StringReader stringReader = new StringReader(xmlText);
				XmlTextReader xmlTextReader = new XmlTextReader(stringReader);
				XmlSerializer xmlSerializer = new XmlSerializer(fileType);
				result = (CMLDocument) xmlSerializer.Deserialize(xmlTextReader);
			}
			catch (Exception e)
			{
				throw new CMLDocumentException(errorMessage, e); 
			}

			// Throw exception on null result
			if (result == null)
				throw new CMLDocumentException(String.Format(Constants.Messages.MSG_NOT_A_FILE,
						file.Name));

			// Run onLoad
			if (result.DocumentLoaded != null)
				result.DocumentLoaded(result, EventArgs.Empty);
			result.OnLoad();

			return result;
		}

		#endregion

		#region Private Methods
		protected virtual void OnLoad() { }
		#endregion
	}
}
