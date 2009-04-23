using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.Transformers.SynthesisEngine;
using SKYPE4COMLib;

namespace RRComSSys.CVM.UserInterface.CVMGUI.Handlers
{
	public partial class FileTransferHandler : UserControl, IFileTransferHandler
	{
		delegate void FileStatusHandler(IFileTransfer fileTransfer, TFileTransferStatus status);

		public FileTransferHandler()
		{
			InitializeComponent();
		}

		public String Status
		{
			get { return lblStatus.Text; }
			set { lblStatus.Text = value; }
		}

		public String FileName
		{
			get { return lblFileName.Text; }
			set { lblFileName.Text = value; }
		}

		public void SetStatus(IFileTransfer fileTransfer, TFileTransferStatus status)
		{
			this.Invoke(new FileStatusHandler(SetStatusImpl), fileTransfer, status);
		}

		private void SetStatusImpl(IFileTransfer fileTransfer, TFileTransferStatus status)
		{
			this.Status = status.ToString();
			this.FileName = fileTransfer.Filename;
		}
		public void Close()
		{
			this.Controls.Clear();
			this.Controls.Add(new Label() { Text = "Voice Call Command Failed!" });
		}
	}
}
