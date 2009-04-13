namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	partial class MissingInformationForm
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

		#region Windows Form Designer generated code

		/// <summary>
		/// Required method for Designer support - do not modify
		/// the contents of this method with the code editor.
		/// </summary>
		private void InitializeComponent()
		{
			this.grpParticipants = new System.Windows.Forms.GroupBox();
			this.flpParticipants = new System.Windows.Forms.FlowLayoutPanel();
			this.grpMedia = new System.Windows.Forms.GroupBox();
			this.grpConnections = new System.Windows.Forms.GroupBox();
			this.flpMedia = new System.Windows.Forms.FlowLayoutPanel();
			this.flpConnections = new System.Windows.Forms.FlowLayoutPanel();
			this.grpParticipants.SuspendLayout();
			this.grpMedia.SuspendLayout();
			this.grpConnections.SuspendLayout();
			this.SuspendLayout();
			// 
			// grpParticipants
			// 
			this.grpParticipants.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
						| System.Windows.Forms.AnchorStyles.Left)));
			this.grpParticipants.Controls.Add(this.flpParticipants);
			this.grpParticipants.Location = new System.Drawing.Point(12, 12);
			this.grpParticipants.Name = "grpParticipants";
			this.grpParticipants.Size = new System.Drawing.Size(237, 391);
			this.grpParticipants.TabIndex = 0;
			this.grpParticipants.TabStop = false;
			this.grpParticipants.Text = "Participants";
			// 
			// flpParticipants
			// 
			this.flpParticipants.Anchor = ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
						| System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.flpParticipants.AutoScroll = true;
			this.flpParticipants.FlowDirection = System.Windows.Forms.FlowDirection.TopDown;
			this.flpParticipants.Location = new System.Drawing.Point(6, 21);
			this.flpParticipants.Name = "flpParticipants";
			this.flpParticipants.Size = new System.Drawing.Size(225, 358);
			this.flpParticipants.TabIndex = 0;
			// 
			// grpMedia
			// 
			this.grpMedia.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
						| System.Windows.Forms.AnchorStyles.Left)));
			this.grpMedia.Controls.Add(this.flpMedia);
			this.grpMedia.Location = new System.Drawing.Point(255, 12);
			this.grpMedia.Name = "grpMedia";
			this.grpMedia.Size = new System.Drawing.Size(365, 391);
			this.grpMedia.TabIndex = 1;
			this.grpMedia.TabStop = false;
			this.grpMedia.Text = "Media";
			// 
			// grpConnections
			// 
			this.grpConnections.Anchor = ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
						| System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.grpConnections.Controls.Add(this.flpConnections);
			this.grpConnections.Location = new System.Drawing.Point(626, 12);
			this.grpConnections.Name = "grpConnections";
			this.grpConnections.Size = new System.Drawing.Size(365, 391);
			this.grpConnections.TabIndex = 2;
			this.grpConnections.TabStop = false;
			this.grpConnections.Text = "Connections";
			// 
			// flpMedia
			// 
			this.flpMedia.Anchor = ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
						| System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.flpMedia.AutoScroll = true;
			this.flpMedia.AutoSize = true;
			this.flpMedia.FlowDirection = System.Windows.Forms.FlowDirection.TopDown;
			this.flpMedia.Location = new System.Drawing.Point(6, 21);
			this.flpMedia.Name = "flpMedia";
			this.flpMedia.Size = new System.Drawing.Size(353, 362);
			this.flpMedia.TabIndex = 0;
			// 
			// flpConnections
			// 
			this.flpConnections.Anchor = ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
						| System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.flpConnections.AutoScroll = true;
			this.flpConnections.FlowDirection = System.Windows.Forms.FlowDirection.TopDown;
			this.flpConnections.Location = new System.Drawing.Point(7, 22);
			this.flpConnections.Name = "flpConnections";
			this.flpConnections.Size = new System.Drawing.Size(352, 363);
			this.flpConnections.TabIndex = 0;
			// 
			// MissingInformationForm
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.ClientSize = new System.Drawing.Size(999, 415);
			this.Controls.Add(this.grpMedia);
			this.Controls.Add(this.grpConnections);
			this.Controls.Add(this.grpParticipants);
			this.Name = "MissingInformationForm";
			this.ShowIcon = false;
			this.Text = "Schema Transformer";
			this.grpParticipants.ResumeLayout(false);
			this.grpMedia.ResumeLayout(false);
			this.grpMedia.PerformLayout();
			this.grpConnections.ResumeLayout(false);
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.GroupBox grpParticipants;
		private System.Windows.Forms.FlowLayoutPanel flpParticipants;
		private System.Windows.Forms.GroupBox grpMedia;
		private System.Windows.Forms.FlowLayoutPanel flpMedia;
		private System.Windows.Forms.GroupBox grpConnections;
		private System.Windows.Forms.FlowLayoutPanel flpConnections;
	}
}