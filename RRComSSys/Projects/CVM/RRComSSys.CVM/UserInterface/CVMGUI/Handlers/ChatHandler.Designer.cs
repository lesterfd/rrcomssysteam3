namespace RRComSSys.CVM.UserInterface.CVMGUI.Handlers
{
	partial class ChatHandler
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
			this.grpParticipant = new System.Windows.Forms.GroupBox();
			this.flpParticipants = new System.Windows.Forms.FlowLayoutPanel();
			this.sendButton = new System.Windows.Forms.Button();
			this.messageTextBox = new System.Windows.Forms.TextBox();
			this.messageBox = new System.Windows.Forms.RichTextBox();
			this.grpParticipant.SuspendLayout();
			this.SuspendLayout();
			// 
			// grpParticipant
			// 
			this.grpParticipant.AutoSize = true;
			this.grpParticipant.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.grpParticipant.BackColor = System.Drawing.Color.Wheat;
			this.grpParticipant.Controls.Add(this.flpParticipants);
			this.grpParticipant.Controls.Add(this.sendButton);
			this.grpParticipant.Controls.Add(this.messageTextBox);
			this.grpParticipant.Controls.Add(this.messageBox);
			this.grpParticipant.Location = new System.Drawing.Point(4, 4);
			this.grpParticipant.Margin = new System.Windows.Forms.Padding(4);
			this.grpParticipant.Name = "grpParticipant";
			this.grpParticipant.Padding = new System.Windows.Forms.Padding(4);
			this.grpParticipant.Size = new System.Drawing.Size(510, 182);
			this.grpParticipant.TabIndex = 7;
			this.grpParticipant.TabStop = false;
			this.grpParticipant.Text = "Chat";
			// 
			// flpParticipants
			// 
			this.flpParticipants.AutoSize = true;
			this.flpParticipants.FlowDirection = System.Windows.Forms.FlowDirection.TopDown;
			this.flpParticipants.Location = new System.Drawing.Point(309, 22);
			this.flpParticipants.Name = "flpParticipants";
			this.flpParticipants.Size = new System.Drawing.Size(194, 137);
			this.flpParticipants.TabIndex = 8;
			// 
			// sendButton
			// 
			this.sendButton.Location = new System.Drawing.Point(8, 131);
			this.sendButton.Margin = new System.Windows.Forms.Padding(4);
			this.sendButton.Name = "sendButton";
			this.sendButton.Size = new System.Drawing.Size(69, 28);
			this.sendButton.TabIndex = 7;
			this.sendButton.Text = "Send";
			this.sendButton.UseVisualStyleBackColor = true;
			this.sendButton.Click += new System.EventHandler(this.sendButton_Click);
			// 
			// messageTextBox
			// 
			this.messageTextBox.Location = new System.Drawing.Point(84, 134);
			this.messageTextBox.Margin = new System.Windows.Forms.Padding(4);
			this.messageTextBox.Name = "messageTextBox";
			this.messageTextBox.Size = new System.Drawing.Size(212, 22);
			this.messageTextBox.TabIndex = 5;
			// 
			// messageBox
			// 
			this.messageBox.BackColor = System.Drawing.Color.White;
			this.messageBox.Location = new System.Drawing.Point(8, 23);
			this.messageBox.Margin = new System.Windows.Forms.Padding(4);
			this.messageBox.Name = "messageBox";
			this.messageBox.ReadOnly = true;
			this.messageBox.Size = new System.Drawing.Size(288, 100);
			this.messageBox.TabIndex = 4;
			this.messageBox.Text = "";
			// 
			// ChatHandler
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.grpParticipant);
			this.Name = "ChatHandler";
			this.Size = new System.Drawing.Size(518, 190);
			this.grpParticipant.ResumeLayout(false);
			this.grpParticipant.PerformLayout();
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.GroupBox grpParticipant;
		private System.Windows.Forms.Button sendButton;
		private System.Windows.Forms.TextBox messageTextBox;
		private System.Windows.Forms.RichTextBox messageBox;
		private System.Windows.Forms.FlowLayoutPanel flpParticipants;

	}
}
