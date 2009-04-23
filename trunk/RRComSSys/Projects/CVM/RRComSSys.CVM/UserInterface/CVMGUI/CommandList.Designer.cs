namespace RRComSSys.CVM.UserInterface.CVMGUI
{
	partial class CommandList
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
			this.lstCommands = new System.Windows.Forms.ListBox();
			this.btnExecute = new System.Windows.Forms.Button();
			this.SuspendLayout();
			// 
			// lstCommands
			// 
			this.lstCommands.Anchor = ((System.Windows.Forms.AnchorStyles) ((((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Bottom)
						| System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.lstCommands.FormattingEnabled = true;
			this.lstCommands.ItemHeight = 16;
			this.lstCommands.Location = new System.Drawing.Point(3, 3);
			this.lstCommands.Name = "lstCommands";
			this.lstCommands.Size = new System.Drawing.Size(327, 180);
			this.lstCommands.TabIndex = 0;
			// 
			// btnExecute
			// 
			this.btnExecute.Anchor = ((System.Windows.Forms.AnchorStyles) ((System.Windows.Forms.AnchorStyles.Bottom | System.Windows.Forms.AnchorStyles.Right)));
			this.btnExecute.AutoSize = true;
			this.btnExecute.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.btnExecute.Location = new System.Drawing.Point(262, 190);
			this.btnExecute.Name = "btnExecute";
			this.btnExecute.Size = new System.Drawing.Size(68, 27);
			this.btnExecute.TabIndex = 1;
			this.btnExecute.Text = "Execute";
			this.btnExecute.UseVisualStyleBackColor = true;
			this.btnExecute.Click += new System.EventHandler(this.btnExecute_Click);
			// 
			// CommandList
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.btnExecute);
			this.Controls.Add(this.lstCommands);
			this.Name = "CommandList";
			this.Size = new System.Drawing.Size(333, 222);
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.ListBox lstCommands;
		private System.Windows.Forms.Button btnExecute;
	}
}
