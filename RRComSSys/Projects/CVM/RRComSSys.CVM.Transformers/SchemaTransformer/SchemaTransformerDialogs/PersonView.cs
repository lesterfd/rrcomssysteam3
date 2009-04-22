using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public partial class PersonView : BaseCMLView
	{
		public PersonView()
		{
			InitializeComponent();
			base.BindingSource = peopleBindingSource;
			base.RequiredFields.Add(iDTextBox);
			base.RequiredFields.Add(nameTextBox);
			base.RequiredFields.Add(roleTextBox);
		}
	}
}
