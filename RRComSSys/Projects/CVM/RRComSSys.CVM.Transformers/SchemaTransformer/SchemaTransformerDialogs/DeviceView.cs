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
	public partial class DeviceView : BaseCMLView
	{
		public DeviceView()
		{
			InitializeComponent();
			this.BindingSource = devicesBindingSource;
			this.RequiredFields.Add(iDTextBox);
			
		}

		protected override void OnVisibleChanged(EventArgs e)
		{
			base.OnVisibleChanged(e);
			Device device = this.DataSource as Device;
			lblUser.Text = device.UserDefinition.Person.ID;
		}
	}
}
