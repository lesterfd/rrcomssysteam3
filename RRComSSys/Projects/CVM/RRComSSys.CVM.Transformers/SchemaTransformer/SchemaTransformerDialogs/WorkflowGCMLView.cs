using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public partial class WorkflowGCMLView : BaseCMLView
	{
		public WorkflowGCMLView()
		{
			InitializeComponent();
			this.BindingSource = workflowGCMLItemBindingSource;
			this.RequiredFields.Add(gCMLPathTextBox);
		}

		public override bool ValidateRequiredFields()
		{
			bool result = base.ValidateRequiredFields();
			return
				!String.IsNullOrEmpty(gCMLPathTextBox.Text) &&
				File.Exists(gCMLPathTextBox.Text) &&
				result;
		}

		private void btnGCMLFile_Click(object sender, EventArgs e)
		{
			if (dlgOpenGCML.ShowDialog() == DialogResult.OK)
			{
				gCMLPathTextBox.Text = dlgOpenGCML.FileName;

			}
		}
	}
}
