using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.Transformers;
using RRComSSys.CVM.Transformers.SynthesisEngine;

namespace RRComSSys.CVM.UserInterface.CVMGUI
{
	public partial class CommandList : UserControl
	{
		private List<UserControl> _handlers = new List<UserControl>();
		private IExecutionContainer _commands;

		public CommandList()
		{
			InitializeComponent();
		}

		public IExecutionContainer Commands
		{
			get { return _commands; }
			set
			{
				_commands = value;
				if (_commands is XCMLContainer)
				{
					XCMLContainer cnt = _commands as XCMLContainer;
					foreach (IAPICommand command in cnt.Commands)
						lstCommands.Items.Add(command);
				}
			}
		}

		public bool ExecuteEnabled
		{
			get { return btnExecute.Enabled; }
			set { btnExecute.Enabled  = value; }
		}

		public void SpawnHandlers()
		{
			foreach (UserControl handler in _handlers)
			{
				Form mdiForm = new Form();
				mdiForm.ShowIcon = false;
				mdiForm.MdiParent = this.ParentForm.MdiParent;
				mdiForm.AutoSize = true;
				mdiForm.AutoSizeMode = AutoSizeMode.GrowAndShrink;
				mdiForm.Controls.Add(handler);
				mdiForm.Show();
			}
		}

		private void btnExecute_Click(object sender, EventArgs e)
		{
			try
			{
				SynthesisEngineController.Instance.ExecuteCommands();
			}
			catch (Exception ex)
			{
				MessageBox.Show(
					this, 
					String.Format("An Error occurred: {0}", ex.Message),
					"CML Error", MessageBoxButtons.OK);
			}
		}

		public List<UserControl> Handlers
		{
			get { return _handlers; }
		}
	}
}
