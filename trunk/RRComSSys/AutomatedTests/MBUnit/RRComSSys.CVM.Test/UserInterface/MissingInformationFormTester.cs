using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.CVM.UserInterface;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.UserInterface.SchemaTransformerDialogs;
using System.Drawing;

namespace RRComSSys.CVM.Test.UserInterface
{
	[TestFixture]
	public class MissingInformationFormTester
	{
		#region Tests
		[Test]
		public void TestPopulatePeople()
		{
			String fileName = @".\TestFiles\sample_xcml_missinginfo_1.xcml";

			// Load document
			XCMLDocument doc = (XCMLDocument) XCMLDocument.LoadDocument(fileName);
			Exception exception = null;
			MissingInformationForm form = new MissingInformationForm();
			form.Document = doc;
			form.Activated += new EventHandler(delegate(object sender, EventArgs e)
				{
					try
					{
						Assert.AreNotEqual(null, form.FindControl(
							c =>
								c.BackColor == Color.Bisque &&
								String.IsNullOrEmpty(c.Text) &&
								c.Parent.FindControl(
									c2 => c2.Text.Equals("ldiaz004")) != null));
					}
					catch (Exception ex) { exception = ex; }
					//form.Close();
				});
			form.ShowDialog();
			if(exception != null)
				throw exception;
		}
		#endregion

		#region Helper Methods

		#endregion
	}
}
