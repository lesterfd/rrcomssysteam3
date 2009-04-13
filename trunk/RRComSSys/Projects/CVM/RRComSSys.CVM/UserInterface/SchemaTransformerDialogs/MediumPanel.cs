using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	public partial class MediumPanel : BaseXCMLView
	{
		public MediumPanel()
		{
			InitializeComponent();
			base.BindingSource = allMediaBindingSource;
			base.RequiredFields.Add(builtInTypeComboBox);
			base.RequiredFields.Add(nameTextBox);
			base.RequiredFields.Add(suggestedApplicationTextBox);
			base.RequiredFields.Add(voiceCommandTextBox);
		}
	}
}
