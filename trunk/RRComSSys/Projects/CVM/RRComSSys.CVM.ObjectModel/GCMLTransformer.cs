using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Xml.Xsl;
using System.Xml.XPath;
using RRComSSys.CVM.ObjectModel.XCMLModel;

namespace RRComSSys.CVM.ObjectModel
{
	public static class GCMLTransformer
	{
		#region Member Variables
		private const String _defaultMappingFileName = "./MappingGCMLToXCML.xslt";
		#endregion

		#region Public Methods
		public static String TransformToText(String inputFile)
		{
			return TransformToText(inputFile, _defaultMappingFileName);
		}

		public static String TransformToText(String inputFile, String xslt)
		{
			StringWriter writer = new StringWriter();
			XslCompiledTransform xsltrans = new XslCompiledTransform();
			xsltrans.Load(xslt);
			XPathDocument doc = new XPathDocument(inputFile);
			xsltrans.Transform(doc, null, writer);
			return writer.ToString();
		}

		public static XCMLDocument Transform(String inputFile)
		{
			String text = TransformToText(inputFile);
			return XCMLDocument.LoadDocumentFromText<XCMLDocument>(text);
		}
		#endregion
	}
}
