using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.ObjectModel.XCMLModel;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public partial class XCMLDocumentPanel : UserControl, ICMLDocumentView
	{
		#region Member Variables
		private List<IBoundView> _items = new List<IBoundView>();
		#endregion

		#region Constructors & Initializers
		public XCMLDocumentPanel()
		{
			InitializeComponent();
		}
		#endregion

		#region Properties
		public XCMLDocument Document { get; set; }
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
			btnSaveToFile.Enabled = chkSaveToDisk.Checked;
		}

		private void btnSaveToFile_Click(object sender, EventArgs e)
		{
			if (dlgSaveFile.ShowDialog(this) == DialogResult.OK)
				txtSaveToFile.Text = dlgSaveFile.FileName;
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
			foreach (Person person in this.Document.People)
			{
				PersonView panel = new PersonView();
				panel.DataSource = person;
				flpParticipants.Controls.Add(panel);
				_items.Add(panel);
			}

			foreach (Medium medium in this.Document.AllMedia)
			{
				MediumView panel = new MediumView();
				panel.DataSource = medium;
				flpMedia.Controls.Add(panel);
				_items.Add(panel);
			}

			foreach (Connection connection in this.Document.Connections)
			{
				ConnectionView panel = new ConnectionView();
				panel.DataSource = connection;
				flpConnections.Controls.Add(panel);
				_items.Add(panel);
			}
		}

		private bool ValidateSemantics()
		{
			bool isValid = true;
			// One local connection per device
			foreach (Connection conn in Document.Connections)
			{
				if (conn.FindItems<Device>(d => d.IsLocal).Count != 1)
				{
					isValid = false;
					MessageBox.Show(
						"Please select at least one local user per connection",
						"Validation Error",
						MessageBoxButtons.OK,
						MessageBoxIcon.Exclamation);
				}
			}

			return isValid;
		}
		#endregion
	}
}
