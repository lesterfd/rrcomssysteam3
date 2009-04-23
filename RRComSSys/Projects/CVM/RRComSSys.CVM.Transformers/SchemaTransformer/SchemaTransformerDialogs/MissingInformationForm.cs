using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.ObjectModel;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public partial class MissingInformationForm : Form
	{
		#region Member Variables
		private CMLDocument _document;
		private List<ICMLDocumentView> _documentViews = new List<ICMLDocumentView>();
		#endregion

		#region Constructors & Initializers
		public MissingInformationForm()
		{
			InitializeComponent();
		}
		#endregion

		#region Properties
		public CMLDocument Document
		{
			get { return _document; }
			set { InitializeDocument(value); }
		}
		#endregion

		#region Event Handlers
		private void btnSave_Click(object sender, EventArgs e)
		{
			Save();
		}

		private void btnValidate_Click(object sender, EventArgs e)
		{
			Validate();
		}

		private void btnCancel_Click(object sender, EventArgs e)
		{
			Cancel();
		}
		#endregion

		#region Private Methods
		private void InitializeDocument(CMLDocument doc)
		{
			_document = doc;
			if (doc.GetType() == typeof(XCMLDocument))
			{
				XCMLDocumentPanel panel = new XCMLDocumentPanel();
				panel.Document = (XCMLDocument) doc;
				panel.Dock = DockStyle.Fill;
				tbcDocumentTabs.TabPages.Add(doc.Name);
				tbcDocumentTabs.TabPages[0].Controls.Add(panel);
			}
			else if (doc.GetType() == typeof(XCMLWorkflowDocument))
			{
				XCMLWorkflowDocument workflow = (XCMLWorkflowDocument) doc;
				XCMLWorkflowDocumentPanel wfPanel = new XCMLWorkflowDocumentPanel();
				wfPanel.Document = workflow;
				wfPanel.Dock = DockStyle.Fill;
				tbcDocumentTabs.TabPages.Add(doc.Name);
				tbcDocumentTabs.TabPages[0].Controls.Add(wfPanel);

				int i = 1;
				List<WorkflowGCMLItem> gcmlItems = workflow.GetAllItems<WorkflowGCMLItem>();
				foreach (WorkflowGCMLItem item in gcmlItems)
				{
					if (String.IsNullOrEmpty(item.GCMLPath))
						continue;
					XCMLDocumentPanel xcmlPanel = new XCMLDocumentPanel();
					XCMLDocument xcmlDoc = item.XCMLDocument;
					xcmlPanel.Document = xcmlDoc;
					xcmlPanel.Dock = DockStyle.Fill;
					tbcDocumentTabs.TabPages.Add(xcmlDoc.Name);
					tbcDocumentTabs.TabPages[i++].Controls.Add(xcmlPanel);
				}
			}
		}

		private void Save()
		{
			if (Validate())
			{
				foreach (ICMLDocumentView view in _documentViews)
				{
					view.Save();
					if (view is XCMLDocumentPanel)
					{
						XCMLDocumentPanel xcmlView = view as XCMLDocumentPanel;
						if (xcmlView.Document.LocalUser == null)
						{
							MessageBox.Show(
								"Please select a local user for each XCML document",
								"Validation Error",
								MessageBoxButtons.OK,
								MessageBoxIcon.Exclamation);
							return;
						}
					}
				}
				this.DialogResult = DialogResult.OK;
				this.Close();
			}
		}

		private new bool Validate()
		{
			bool isValid = true;
			foreach (ICMLDocumentView view in _documentViews)
				if (!view.Validate())
					isValid = false;
			return isValid;
		}

		private void Cancel()
		{
			foreach (ICMLDocumentView view in _documentViews)
				view.Reset();
			this.DialogResult = DialogResult.Cancel;
			this.Close();
		}
		#endregion
	}
}
