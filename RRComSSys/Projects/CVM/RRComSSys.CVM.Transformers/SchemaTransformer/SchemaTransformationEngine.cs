using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.CVM.ObjectModel;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;
using RRComSSys.CVM.UserInterface.SchemaTransformerDialogs;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.Testing.Common;
using System.Windows.Forms;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public static class SchemaTransformationEngine
	{
		public static CMLDocument Transform(CMLDocument document, out bool userCancelled)
		{
			userCancelled = false;
			
			// Process XCML Workflow document
			if (document is XCMLWorkflowDocument)
				return document;

			// Process XCML document
			MissingInformationForm form = new MissingInformationForm();
			form.Document = (XCMLDocument)document;

			// Attach test event
			form.Activated += new EventHandler(delegate(object sender, EventArgs e)
				{
					form.FindControls(x => x.Name == "NameTextBox");
				});

			// Show dialog
			DialogResult result = form.ShowDialog();
			if (result == DialogResult.Cancel)
				userCancelled = true;

			return document;
		}
	}
}
