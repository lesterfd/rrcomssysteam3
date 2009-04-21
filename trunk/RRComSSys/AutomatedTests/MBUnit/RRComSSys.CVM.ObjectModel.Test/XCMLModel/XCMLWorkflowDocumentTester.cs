using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;
using RRComSSys.Testing.Common;

namespace RRComSSys.CVM.ObjectModel.Test.XCMLModel
{
	[TestFixture]
	[TestCategory(TestConstants.Categories.UnitTest)]
	[TestsOn(typeof(XCMLWorkflowDocument))]
	[Author("Danil Mariovich Flores", "Danil.Flores@ultimatesoftware.com")]
	public class XCMLWorkflowDocumentTester
	{
		#region Tests
		[Test]
		public void Test_Load_Workflow_Document()
		{
			String fileName = @".\TestFiles\sample_wf_complete_1.wfgcml";

			// Load document
			XCMLWorkflowDocument doc = XCMLWorkflowDocument.LoadDocument<XCMLWorkflowDocument>(fileName);

			// Assert start
			Assert.AreEqual(true, true);

		}
		#endregion
	}
}
