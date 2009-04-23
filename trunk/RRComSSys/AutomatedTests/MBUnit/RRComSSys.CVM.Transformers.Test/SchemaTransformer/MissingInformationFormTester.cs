using System;
using System.Windows.Forms;
using MbUnit.Core.Exceptions;
using MbUnit.Framework;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;
using RRComSSys.CVM.Transformers.ModelTransformer;
using RRComSSys.CVM.Transformers.SchemaTransformer;

namespace RRComSSys.CVM.Test.UserInterface
{
	[TestFixture]
	public class MissingInformationFormTester
	{
		#region Tests
		[Test]
		public void Test_Missing_Info_XCML()
		{
			String fileName = @".\TestFiles\sample_xcml_missinginfo_1.xcml";

			// Load document
			XCMLDocument doc = (XCMLDocument)ModelTransformationEngine.LoadCMLDocument(fileName);
			Exception exception = null;
			MissingInformationForm form = new MissingInformationForm();
			form.Document = doc;
			form.Activated += new EventHandler(delegate(object sender, EventArgs e)
				{
					try
					{
						//Assert.IsTrue(form.FindControl(
						//    c => c.GetType() == typeof(TextBox) ) != null);
						//Assert.IsTrue(form.Exists<TextBox>(
						//    c => false));
						//Assert.IsTrue(form.Exists<TextBox>(
						//    c => false ));
					}
					catch (AssertionException ex) { exception = ex; }
					//form.Close();
				});
			form.ShowDialog();
			if(exception != null)
				throw exception;
		}

		[Test]
		public void Test_Missing_Info_Workflow()
		{
			Application.EnableVisualStyles();
			Application.SetCompatibleTextRenderingDefault(false);
			String fileName = @".\TestFiles\sample_wf_complete_1.wfgcml";

			// Load document
			XCMLWorkflowDocument doc = (XCMLWorkflowDocument) ModelTransformationEngine.LoadCMLDocument(fileName);
			Exception exception = null;
			MissingInformationForm form = new MissingInformationForm();
			form.Document = doc;
			form.Activated += new EventHandler(delegate(object sender, EventArgs e)
			{
				try
				{
					//Assert.IsTrue(form.FindControl(
					//    c => c.GetType() == typeof(TextBox) ) != null);
					//Assert.IsTrue(form.Exists<TextBox>(
					//    c => false));
					//Assert.IsTrue(form.Exists<TextBox>(
					//    c => false ));
				}
				catch (AssertionException ex) { exception = ex; }
				//form.Close();
			});
			form.ShowDialog();
			if (exception != null)
				throw exception;
		}
		#endregion

		#region Helper Methods

		#endregion
	}
}
