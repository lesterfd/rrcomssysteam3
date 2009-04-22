using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public partial class XCMLWorkflowDocumentPanel : UserControl, ICMLDocumentView
	{
		#region Member Variables
		List<IBoundView> _items = new List<IBoundView>();
		#endregion

		#region Constructors & Initializers
		public XCMLWorkflowDocumentPanel()
		{
			InitializeComponent();
		}
		#endregion

		#region Properties
		public XCMLWorkflowDocument Document { get; set; }
		#endregion

		#region Event Handlers
		protected override void OnLoad(EventArgs e)
		{
			base.OnLoad(e);
			InitializeDataSource();
			Validate();
			if (!String.IsNullOrEmpty(Document.Path))
				txtSaveToFile.Text = Document.Path;
		}

		private void btnSave_Click(object sender, EventArgs e)
		{
			Save();
		}

		private void btnValidate_Click(object sender, EventArgs e)
		{
			Validate();
		}

		private void btnReset_Click(object sender, EventArgs e)
		{
			Reset();
		}

		private void chkSaveToDisk_CheckedChanged(object sender, EventArgs e)
		{

		}

		private void btnSaveToFile_Click(object sender, EventArgs e)
		{

		}

		#endregion

		#region Public Methods
		public new bool Validate()
		{
			bool isValid = true;
			foreach (IBoundView view in _items)
				if (!view.ValidateRequiredFields())
					isValid = false;
			return isValid;
		}

		public void Reset()
		{
			foreach (IBoundView view in _items)
				view.Reset();
		}

		public void Save()
		{
			if (chkSaveToDisk.Checked && String.IsNullOrEmpty(txtSaveToFile.Text))
			{
				MessageBox.Show(
					"Please select a file name for all documents to be saved.",
					"Validation Error",
					MessageBoxButtons.OK,
					MessageBoxIcon.Exclamation);
				return;
			}

			bool isValid = Validate();
			if (!isValid)
			{
				MessageBox.Show(
					"Please fill out all required fields before continuing.",
					"Validation Error",
					MessageBoxButtons.OK,
					MessageBoxIcon.Exclamation);
				return;
			}

			foreach (IBoundView view in _items)
				view.Save();

			if (chkSaveToDisk.Checked)
				this.Document.SaveDocument(txtSaveToFile.Text);
		}
		#endregion

		#region Private Methods
		private void InitializeDataSource()
		{
			foreach (WorkflowGCMLItem gcmlItem in this.Document.GetAllItems<WorkflowGCMLItem>())
			{
				WorkflowGCMLView panel = new WorkflowGCMLView();
				panel.DataSource = gcmlItem;
				flpGCMLNodes.Controls.Add(panel);
				_items.Add(panel);
			}

			foreach (WorkflowCondition condition in this.Document.GetAllItems<WorkflowCondition>())
			{
				WorkflowConditionView panel = new WorkflowConditionView();
				panel.DataSource = condition;
				flpConditions.Controls.Add(panel);
				_items.Add(panel);
			}
		}
		#endregion
	}
}
