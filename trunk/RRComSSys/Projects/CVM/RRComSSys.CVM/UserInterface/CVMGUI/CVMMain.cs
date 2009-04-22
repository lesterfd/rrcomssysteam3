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
            OpenFileDialog openFileDialog = new OpenFileDialog();
			openFileDialog.RestoreDirectory = true;
            openFileDialog.InitialDirectory = Environment.GetFolderPath(Environment.SpecialFolder.Personal);
			openFileDialog.Filter = "GCML Diagram Files (*.gcml)|*.gcml|XCML Files (*.xcml)|*.xcml|Workflow Files (*.wfgcml)|*.wfgcml";
            if (openFileDialog.ShowDialog(this) == DialogResult.OK)
            {
                string fileName = openFileDialog.FileName;
				ModelManagementEngine.LoadDocument(fileName);
            }
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
