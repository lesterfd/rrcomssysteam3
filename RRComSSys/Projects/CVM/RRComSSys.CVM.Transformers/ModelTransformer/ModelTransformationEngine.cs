using System;
using System.Collections.Generic;
using System.Linq;
using System.Xml;
using System.Xml.Xsl;
using System.Xml.XPath;
using System.IO;
using System.Text;

namespace RRComSSys.CVM.Transformers.ModelTransformer
{
    static class ModelTransformationEngine
    {
        public static void transformGCMLToXCML(String inputFile, String outputFile)
        {
            transformGCMLToXCML(inputFile, outputFile, "MappingGCMLToXCML.xslt");
        }

        private static void transformGCMLToXCML(String inputFile, String outputFile, String xslt)
        {
            XmlTextWriter writer = new XmlTextWriter(outputFile, null);
            XslCompiledTransform xsltrans = new XslCompiledTransform();
            xsltrans.Load(xslt);
            XPathDocument doc = new XPathDocument(inputFile);
            xsltrans.Transform(doc, null, writer);
            writer.Close();
        }

        private static void transformWFGCMLToWFXCML(String intputFile, String outputFile)
        {
            // TODO
        }
    }
}