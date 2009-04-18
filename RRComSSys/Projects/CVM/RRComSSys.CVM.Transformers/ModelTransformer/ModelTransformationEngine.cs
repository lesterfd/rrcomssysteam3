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
		#region Member Variables
		private const String _defaultMappingFileName = "MappingGCMLToXCML.xslt";
		#endregion

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

		private static XCMLDocument LoadXCMLDocument(FileInfo file)
		{
			throw new NotImplementedException();
		}

		private static XCMLDocument LoadGCMLDocument(FileInfo file)
		{
			throw new NotImplementedException();
		}

		private static XCMLWorkflowDocument LoadXCMLWorkflowDocument(FileInfo file)
		{
			throw new NotImplementedException();
		}

		private static XCMLWorkflowDocument LoadGCMLWorkflowDocument(FileInfo file)
		{
			throw new NotImplementedException();
		}

		private static void TransformGCMLToXCML(String inputFile, String outputFile)
        {
			TransformGCMLToXCML(inputFile, outputFile, _defaultMappingFileName);
        }

        private static void TransformGCMLToXCML(String inputFile, String outputFile, String xslt)
        {
            XmlTextWriter writer = new XmlTextWriter(outputFile, null);
            XslCompiledTransform xsltrans = new XslCompiledTransform();
            xsltrans.Load(xslt);
            XPathDocument doc = new XPathDocument(inputFile);
            xsltrans.Transform(doc, null, writer);
            writer.Close();
        }

        private static void TransformWFGCMLToWFXCML(String intputFile, String outputFile)
        {
            // TODO
		}
		#endregion
	}
}