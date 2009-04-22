using System;
using System.Collections.Generic;
using System.Linq;
using System.Xml;
using System.Xml.Xsl;
using System.Xml.XPath;
using System.IO;
using System.Text;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;
using RRComSSys.CVM.ObjectModel;
using RRComSSys.CVM.Common;

namespace RRComSSys.CVM.Transformers.ModelTransformer
{
	public static class ModelTransformationEngine
	{
		#region Public Methods
		public static CMLDocument LoadCMLDocument(String fileName)
		{
			return LoadCMLDocument(new FileInfo(fileName));
		}

		public static CMLDocument LoadCMLDocument(FileInfo file)
		{
			// Error checking
			if (!file.Exists)
				throw new CMLDocumentException(String.Format(Constants.Messages.MSG_FILE_NOT_EXISTS, file.Name));

			switch (CMLDocument.GetDocumentType(file))
			{
				case CMLType.GCML: return LoadGCMLDocument(file);
				case CMLType.GCMLWorkflow: return LoadGCMLWorkflowDocument(file);
				case CMLType.XCML: return LoadXCMLDocument(file);
				case CMLType.XCMLWorkflow: return LoadXCMLWorkflowDocument(file);
				default: return null;
			}
		}
		#endregion

		#region Private Methods

		private static CMLDocument LoadXCMLDocument(FileInfo file)
		{
			return XCMLDocument.LoadDocument<XCMLDocument>(file);
		}

		private static CMLDocument LoadGCMLDocument(FileInfo file)
		{
			return GCMLTransformer.Transform(file.FullName);
		}

		private static CMLDocument LoadXCMLWorkflowDocument(FileInfo file)
		{
			return LoadGCMLWorkflowDocument(file);
		}

		private static CMLDocument LoadGCMLWorkflowDocument(FileInfo file)
		{
			return XCMLWorkflowDocument.LoadDocument<XCMLWorkflowDocument>(file);
		}
		#endregion
	}
}