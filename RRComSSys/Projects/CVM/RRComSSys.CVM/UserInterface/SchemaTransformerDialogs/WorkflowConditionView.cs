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
	public partial class WorkflowConditionView : BaseCMLView
	{
		public WorkflowConditionView()
		{
			InitializeComponent();
			this.BindingSource = workflowConditionBindingSource;
		}
	}
}
