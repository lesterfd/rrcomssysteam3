namespace RRComSSys.CVM.UserInterface.CVMGUI.Handlers
{
	partial class VoiceCallHandler
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
			this.pnlVoiceHandler = new System.Windows.Forms.Panel();
			this.lblParticipants = new System.Windows.Forms.Label();
			this.lstParticipants = new System.Windows.Forms.ListBox();
			this.pnlVoiceHandler.SuspendLayout();
			this.SuspendLayout();
			// 
			// lblStatusLabel
			// 
			this.lblStatusLabel.AutoSize = true;
			this.lblStatusLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblStatusLabel.Location = new System.Drawing.Point(6, 3);
			this.lblStatusLabel.Name = "lblStatusLabel";
			this.lblStatusLabel.Size = new System.Drawing.Size(141, 17);
			this.lblStatusLabel.TabIndex = 0;
			this.lblStatusLabel.Text = "Voice Call Status: ";
			// 
			// lblStatus
			// 
			this.lblStatus.AutoSize = true;
			this.lblStatus.Location = new System.Drawing.Point(153, 3);
			this.lblStatus.Name = "lblStatus";
			this.lblStatus.Size = new System.Drawing.Size(56, 17);
			this.lblStatus.TabIndex = 1;
			this.lblStatus.Text = "[Status]";
			// 
			// pnlVoiceHandler
			// 
			this.pnlVoiceHandler.BackColor = System.Drawing.Color.LightSteelBlue;
			this.pnlVoiceHandler.Controls.Add(this.lstParticipants);
			this.pnlVoiceHandler.Controls.Add(this.lblStatusLabel);
			this.pnlVoiceHandler.Controls.Add(this.lblParticipants);
			this.pnlVoiceHandler.Controls.Add(this.lblStatus);
			this.pnlVoiceHandler.Location = new System.Drawing.Point(6, 6);
			this.pnlVoiceHandler.Name = "pnlVoiceHandler";
			this.pnlVoiceHandler.Padding = new System.Windows.Forms.Padding(3);
			this.pnlVoiceHandler.Size = new System.Drawing.Size(272, 118);
			this.pnlVoiceHandler.TabIndex = 3;
			// 
			// lblParticipants
			// 
			this.lblParticipants.AutoSize = true;
			this.lblParticipants.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblParticipants.Location = new System.Drawing.Point(6, 20);
			this.lblParticipants.Name = "lblParticipants";
			this.lblParticipants.Size = new System.Drawing.Size(99, 17);
			this.lblParticipants.TabIndex = 4;
			this.lblParticipants.Text = "Participants:";
			// 
			// lstParticipants
			// 
			this.lstParticipants.Anchor = ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
						| System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.lstParticipants.FormattingEnabled = true;
			this.lstParticipants.ItemHeight = 16;
			this.lstParticipants.Location = new System.Drawing.Point(19, 40);
			this.lstParticipants.Name = "lstParticipants";
			this.lstParticipants.Size = new System.Drawing.Size(233, 68);
			this.lstParticipants.TabIndex = 5;
			// 
			// VoiceCallHandler
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.pnlVoiceHandler);
			this.Name = "VoiceCallHandler";
			this.Padding = new System.Windows.Forms.Padding(3);
			this.Size = new System.Drawing.Size(284, 130);
			this.pnlVoiceHandler.ResumeLayout(false);
			this.pnlVoiceHandler.PerformLayout();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.Label lblStatusLabel;
		private System.Windows.Forms.Label lblStatus;
		private System.Windows.Forms.Panel pnlVoiceHandler;
		private System.Windows.Forms.ListBox lstParticipants;
		private System.Windows.Forms.Label lblParticipants;
	}
}
