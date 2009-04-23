namespace RRComSSys.CVM.UserInterface.CVMGUI.Handlers
{
	partial class FileTransferHandler
	{
		/// <summary> 
		/// Required designer variable.
		/// </summary>
		private System.ComponentModel.IContainer components = null;

		/// <summary> 
		/// Clean up any resources being used.
		/// </summary>
		/// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
		protected override void Dispose(bool disposing)
		{
			if (disposing && (components != null))
			{
				components.Dispose();
			}
			base.Dispose(disposing);
		}

		#region Component Designer generated code

		/// <summary> 
		/// Required method for Designer support - do not modify 
		/// the contents of this method with the code editor.
		/// </summary>
		private void InitializeComponent()
		{
			this.lblStatusLabel = new System.Windows.Forms.Label();
			this.lblStatus = new System.Windows.Forms.Label();
			this.lblFileNameLabel = new System.Windows.Forms.Label();
			this.lblFileName = new System.Windows.Forms.Label();
			this.SuspendLayout();
			// 
			// lblStatusLabel
			// 
			this.lblStatusLabel.AutoSize = true;
			this.lblStatusLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblStatusLabel.Location = new System.Drawing.Point(6, 3);
			this.lblStatusLabel.Name = "lblStatusLabel";
			this.lblStatusLabel.Size = new System.Drawing.Size(59, 17);
			this.lblStatusLabel.TabIndex = 1;
			this.lblStatusLabel.Text = "Status:";
			// 
			// lblStatus
			// 
			this.lblStatus.AutoSize = true;
			this.lblStatus.Location = new System.Drawing.Point(92, 3);
			this.lblStatus.Name = "lblStatus";
			this.lblStatus.Size = new System.Drawing.Size(56, 17);
			this.lblStatus.TabIndex = 1;
			this.lblStatus.Text = "[Status]";
			// 
			// lblFileNameLabel
			// 
			this.lblFileNameLabel.AutoSize = true;
			this.lblFileNameLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblFileNameLabel.Location = new System.Drawing.Point(6, 29);
			this.lblFileNameLabel.Name = "lblFileNameLabel";
			this.lblFileNameLabel.Size = new System.Drawing.Size(80, 17);
			this.lblFileNameLabel.TabIndex = 2;
			this.lblFileNameLabel.Text = "FileName:";
			// 
			// lblFileName
			// 
			this.lblFileName.AutoSize = true;
			this.lblFileName.Location = new System.Drawing.Point(92, 29);
			this.lblFileName.Name = "lblFileName";
			this.lblFileName.Size = new System.Drawing.Size(75, 17);
			this.lblFileName.TabIndex = 3;
			this.lblFileName.Text = "[FileName]";
			// 
			// FileTransferHandler
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.lblFileName);
			this.Controls.Add(this.lblFileNameLabel);
			this.Controls.Add(this.lblStatus);
			this.Controls.Add(this.lblStatusLabel);
			this.Name = "FileTransferHandler";
			this.Padding = new System.Windows.Forms.Padding(3);
			this.Size = new System.Drawing.Size(173, 49);
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Label lblStatusLabel;
		private System.Windows.Forms.Label lblStatus;
		private System.Windows.Forms.Label lblFileNameLabel;
		private System.Windows.Forms.Label lblFileName;
	}
}
