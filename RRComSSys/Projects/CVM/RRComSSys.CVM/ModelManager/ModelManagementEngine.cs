using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.CVM.Transformers.ModelTransformer;
using RRComSSys.CVM.ObjectModel;
using System.Windows;
using RRComSSys.CVM.Transformers.SchemaTransformer;

namespace RRComSSys.CVM.ModelManager
{
	public static class ModelManagementEngine
	{
		public static void LoadDocument(String fileName)
		{
			// Load document through MTE
			CMLDocument document = null;
			try
			{
				document = ModelTransformationEngine.LoadCMLDocument(fileName);
			}
			catch (Exception e)
			{
				MessageBox.Show(
					String.Format("An error occured while loading the document: {0}", e.Message),
					"Error Loading Document",
					MessageBoxButton.OK,
					MessageBoxImage.Error);
				return;
			}

			// Transform document to instance
			bool cancelled = false;
			try
			{
				document = SchemaTransformationEngine.Transform(document, out cancelled);
			}
			catch (Exception e)
			{
				MessageBox.Show(
					String.Format("An error occured while schema-transforming the document: {0}", e.Message),
					"Error Schema Transforming Document",
					MessageBoxButton.OK,
					MessageBoxImage.Error);
				return;
			}
			if (cancelled) return;
		}
	}
}
