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
	public partial class PersonPanel : BaseXCMLView
	{
		public PersonPanel()
		{
			InitializeComponent();
			base.BindingSource = peopleBindingSource;
			base.RequiredFields.Add(iDTextBox);
			base.RequiredFields.Add(nameTextBox);
			base.RequiredFields.Add(roleTextBox);
		}
	}
}
