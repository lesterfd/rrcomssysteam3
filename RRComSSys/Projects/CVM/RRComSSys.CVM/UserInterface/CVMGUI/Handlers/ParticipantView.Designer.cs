namespace RRComSSys.CVM.UserInterface.CVMGUI.Handlers
{
	partial class ParticipantView
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
			this.lblCallStatus = new System.Windows.Forms.Label();
			this.lblNameLabel = new System.Windows.Forms.Label();
			this.callStatusLabel = new System.Windows.Forms.Label();
			this.pictureBox1 = new System.Windows.Forms.PictureBox();
			this.lblName = new System.Windows.Forms.Label();
			((System.ComponentModel.ISupportInitialize) (this.pictureBox1)).BeginInit();
			this.SuspendLayout();
			// 
			// lblCallStatus
			// 
			this.lblCallStatus.AutoSize = true;
			this.lblCallStatus.Location = new System.Drawing.Point(139, 49);
			this.lblCallStatus.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
			this.lblCallStatus.Name = "lblCallStatus";
			this.lblCallStatus.Size = new System.Drawing.Size(79, 17);
			this.lblCallStatus.TabIndex = 16;
			this.lblCallStatus.Text = "[CallStatus]";
			this.lblCallStatus.Visible = false;
			// 
			// lblNameLabel
			// 
			this.lblNameLabel.AutoSize = true;
			this.lblNameLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblNameLabel.Location = new System.Drawing.Point(133, 4);
			this.lblNameLabel.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
			this.lblNameLabel.Name = "lblNameLabel";
			this.lblNameLabel.Size = new System.Drawing.Size(54, 17);
			this.lblNameLabel.TabIndex = 14;
			this.lblNameLabel.Text = "Name:";
			// 
			// callStatusLabel
			// 
			this.callStatusLabel.AutoSize = true;
			this.callStatusLabel.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.callStatusLabel.Location = new System.Drawing.Point(133, 32);
			this.callStatusLabel.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
			this.callStatusLabel.Name = "callStatusLabel";
			this.callStatusLabel.Size = new System.Drawing.Size(91, 17);
			this.callStatusLabel.TabIndex = 13;
			this.callStatusLabel.Text = "Call Status:";
			this.callStatusLabel.Visible = false;
			// 
			// pictureBox1
			// 
			this.pictureBox1.Image = global::RRComSSys.CVM.Properties.Resources.Contact_128x128;
			this.pictureBox1.Location = new System.Drawing.Point(4, 4);
			this.pictureBox1.Margin = new System.Windows.Forms.Padding(4);
			this.pictureBox1.Name = "pictureBox1";
			this.pictureBox1.Size = new System.Drawing.Size(121, 132);
			this.pictureBox1.TabIndex = 15;
			this.pictureBox1.TabStop = false;
			// 
			// lblName
			// 
			this.lblName.AutoSize = true;
			this.lblName.Location = new System.Drawing.Point(194, 4);
			this.lblName.Name = "lblName";
			this.lblName.Size = new System.Drawing.Size(53, 17);
			this.lblName.TabIndex = 17;
			this.lblName.Text = "[Name]";
			// 
			// ParticipantView
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.Controls.Add(this.lblName);
			this.Controls.Add(this.lblCallStatus);
			this.Controls.Add(this.lblNameLabel);
			this.Controls.Add(this.callStatusLabel);
			this.Controls.Add(this.pictureBox1);
			this.Name = "ParticipantView";
			this.Size = new System.Drawing.Size(290, 141);
			((System.ComponentModel.ISupportInitialize) (this.pictureBox1)).EndInit();
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Label lblCallStatus;
		private System.Windows.Forms.Label lblNameLabel;
		private System.Windows.Forms.Label callStatusLabel;
		private System.Windows.Forms.PictureBox pictureBox1;
		private System.Windows.Forms.Label lblName;
	}
}
