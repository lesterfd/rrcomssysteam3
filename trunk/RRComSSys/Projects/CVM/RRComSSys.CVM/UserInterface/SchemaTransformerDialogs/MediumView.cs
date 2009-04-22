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
	public partial class MediumView : BaseCMLView
	{
		public MediumView()
		{
			InitializeComponent();
			base.BindingSource = allMediaBindingSource;
			base.RequiredFields.Add(builtInTypeComboBox);
			base.RequiredFields.Add(nameTextBox);
			foreach (CapabilityType capability in Enum.GetValues(typeof(CapabilityType)))
				builtInTypeComboBox.Items.Add(capability);
		}
	}
}
