using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.ObjectModel.XCMLModel;

namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	public partial class MissingInformationForm : Form
	{
		#region Member Variables
		private List<IXCMLView> _items = new List<IXCMLView>();
		#endregion

		#region Constructors & Initializers
		public MissingInformationForm()
		{
			InitializeComponent();
		}
		#endregion

		#region Properties
		public XCMLDocument Document { get; set; }
		#endregion

		#region Event Handlers
		protected override void OnShown(EventArgs e)
		{
			base.OnShown(e);
			InitializeDataSource();
			Validate();
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

		private void btnCancel_Click(object sender, EventArgs e)
		{
			Cancel();
		}
		#endregion

		#region Private Methods
		private void InitializeDataSource()
		{
			foreach (Person person in this.Document.People)
			{
				PersonPanel panel = new PersonPanel();
				panel.DataSource = person;
				flpParticipants.Controls.Add(panel);
				_items.Add(panel);
			}

			foreach (Medium medium in this.Document.AllMedia)
			{
				MediumPanel panel = new MediumPanel();
				panel.DataSource = medium;
				flpMedia.Controls.Add(panel);
				_items.Add(panel);
			}

			foreach (Connection connection in this.Document.Connections)
			{
				ConnectionPanel panel = new ConnectionPanel();
				panel.DataSource = connection;
				flpConnections.Controls.Add(panel);
				_items.Add(panel);
			}
		}

		private void Reset()
		{
			foreach (IXCMLView view in _items)
				view.Reset();
		}

		private bool Validate()
		{
			bool isValid = true;
			foreach (IXCMLView view in _items)
				if (!view.ValidateRequiredFields())
					isValid = false;
			return isValid;
		}

		private void Save()
		{
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

			foreach (IXCMLView view in _items)
				view.Save();
			this.Close();
		}

		private void Cancel()
		{
			foreach (IXCMLView view in _items)
				view.Cancel();
			this.Close();
		}

		#endregion
	}
}
