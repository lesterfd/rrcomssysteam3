using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.ModelManager;
using System.Diagnostics;
using RRComSSys.CVM.Transformers;
using RRComSSys.CVM.Transformers.SynthesisEngine;
using RRComSSys.CVM.UserInterface.CVMGUI.Handlers;
using RRComSSys.CVM.UserInterface.CVMGUI;

namespace RRComSSys.CVM.UserInterface.CVMUI
{
    public partial class CVMMain : Form
    {
        private CVMLogin CVMLogin;
		private const String CMVE_PATH = @".\CMVE\CMVE.exe";

        public CVMMain()
        {
            InitializeComponent();
            CVMLogin = new CVMLogin();
        }

        private void OpenFile(object sender, EventArgs e)
        {
            if (openFileDialog.ShowDialog(this) == DialogResult.OK)
            {
                string fileName = openFileDialog.FileName;
				IExecutionContainer container = ModelManagementEngine.LoadDocument(fileName);
				if (container != null)
					ProcessCommands(container);
            }
        }

		private void ProcessCommands(IExecutionContainer container)
		{
			if (container is WorkFlow)
				ProcessWorkflow((WorkFlow) container);
			if (container is XCMLContainer)
				ProcessXCML((XCMLContainer) container);
		}

		private CommandList ProcessXCML(XCMLContainer XCMLContainer)
		{
			Form mdiForm = new Form();
			mdiForm.MdiParent = this;
			mdiForm.AutoSizeMode = AutoSizeMode.GrowAndShrink;
			mdiForm.AutoSize = true;
			CommandList cmdList = new CommandList();
			mdiForm.Controls.Add(cmdList);
			foreach (IAPICommand command in XCMLContainer.Commands)
			{
				if (command is IVoiceCallCommand)
				{
					IVoiceCallCommand voiceCall = command as IVoiceCallCommand;
					VoiceCallHandler handler = new VoiceCallHandler();
					voiceCall.Handler = handler;
					cmdList.Handlers.Add(handler);
				}
				else if (command is IChatCommand)
				{
					IChatCommand chat = command as IChatCommand;
					ChatHandler handler = new ChatHandler();
					chat.Handler = handler;
					cmdList.Handlers.Add(handler);
				}
				else if (command is ITransferFileCommand)
				{
					ITransferFileCommand ft = command as ITransferFileCommand;
					FileTransferHandler handler = new FileTransferHandler();
					ft.Handler = handler;
					cmdList.Handlers.Add(handler);
				}
			}
			cmdList.Commands = XCMLContainer;
			mdiForm.Show();
			return cmdList;
		}

		private void ProcessWorkflow(WorkFlow workFlow)
		{
			Form mdiForm = new Form();
			mdiForm.MdiParent = this;
			mdiForm.AutoSizeMode = AutoSizeMode.GrowAndShrink;
			mdiForm.AutoSize = true;
			WorkflowRunner runner = new WorkflowRunner();
			mdiForm.Controls.Add(runner);
			workFlow.ProcessingXCML += new ProcessingXCMLHandler(delegate(XCMLContainer container)
				{
					CommandList cmds = ProcessXCML(container);
					cmds.ExecuteEnabled = false;
					cmds.SpawnHandlers();
				});
			mdiForm.Show();
		}

        private void ExitToolsStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void ToolBarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            toolStrip.Visible = toolBarToolStripMenuItem.Checked;
        }

        private void StatusBarToolStripMenuItem_Click(object sender, EventArgs e)
        {
            statusStrip.Visible = statusBarToolStripMenuItem.Checked;
        }

        private void CascadeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.Cascade);
        }

        private void TileVerticalToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.TileVertical);
        }

        private void TileHorizontalToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.TileHorizontal);
        }

        private void ArrangeIconsToolStripMenuItem_Click(object sender, EventArgs e)
        {
            LayoutMdi(MdiLayout.ArrangeIcons);
        }

        private void CloseAllToolStripMenuItem_Click(object sender, EventArgs e)
        {
            foreach (Form childForm in MdiChildren)
                childForm.Close();
        }

        private void CVMMain_Shown(object sender, EventArgs e)
        {
           if (DialogResult.Cancel == CVMLogin.ShowDialog())
               this.Close();
        }

        private void logOffToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (DialogResult.Cancel == CVMLogin.ShowDialog())
                this.Close();
        }

		private void gCMLDiagramToolStripMenuItem_Click(object sender, EventArgs e)
		{
			Process.Start(CMVE_PATH);
		}
    }
}
