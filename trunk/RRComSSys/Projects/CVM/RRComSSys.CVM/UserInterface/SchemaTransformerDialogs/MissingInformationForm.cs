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

		public MissingInformationForm()
		{
			InitializeComponent();
		}

		public XCMLDocument Document { get; set; }

		protected override void OnShown(EventArgs e)
		{
			base.OnShown(e);
			InitializeDataSource();
		}

		private void InitializeDataSource()
		{
			foreach (Person person in this.Document.People)
			{
				PersonPanel panel = new PersonPanel();
				panel.DataSource = person;
				flpParticipants.Controls.Add(panel);
			}

			foreach (Medium medium in this.Document.AllMedia)
			{
				MediumPanel panel = new MediumPanel();
				panel.DataSource = medium;
				flpMedia.Controls.Add(panel);
			}

			foreach (Connection connection in this.Document.Connections)
			{
				ConnectionPanel panel = new ConnectionPanel();
				panel.DataSource = connection;
				flpConnections.Controls.Add(panel);
			}
		}
	}
}
