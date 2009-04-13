using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.ObjectModel.XCMLModel;

namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	public partial class ConnectionPanel : BaseXCMLView
	{
		public ConnectionPanel()
		{
			InitializeComponent();
			base.BindingSource = connectionsBindingSource;
			base.RequiredFields.Add(iDTextBox);
			base.RequiredFields.Add(bandwidthTextBox);
		}

		#region Properties
		public override object DataSource
		{
			get { return base.DataSource; }
			set
			{
				InitializeDevices((Connection) value);
				base.DataSource = value; 
			}
		}
		#endregion

		#region Private Methods
		private void InitializeDevices(Connection connection)
		{
			foreach (Device device in connection.Devices)
			{
				DevicePanel panel = new DevicePanel();
				panel.DataSource = device;
				flpDevices.Controls.Add(panel);
			}
		}

		protected void Connection_BindingComplete(Object sender, BindingCompleteEventArgs e)
		{
			InitializeDevices((Connection) e.Binding.DataSource);
		}
		#endregion
	}
}
