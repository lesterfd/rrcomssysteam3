using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.Transformers.SynthesisEngine;

namespace RRComSSys.CVM.UserInterface.CVMGUI
{
	public partial class WorkflowRunner : UserControl
	{
		public WorkflowRunner()
		{
			InitializeComponent();
		}

		private void btnRunWorkflow_Click(object sender, EventArgs e)
		{
			SynthesisEngineController.Instance.ExecuteCommands();
		}
	}
}
