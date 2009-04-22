namespace RRComSSys.CVM.Transformers.SchemaTransformer
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
			this.tbcDocumentTabs = new System.Windows.Forms.TabControl();
			this.pnlButtons = new System.Windows.Forms.Panel();
			this.btnValidate = new System.Windows.Forms.Button();
			this.btnCancel = new System.Windows.Forms.Button();
			this.btnSave = new System.Windows.Forms.Button();
			this.pnlButtons.SuspendLayout();
			this.SuspendLayout();
			// 
			// tbcDocumentTabs
			// 
			this.tbcDocumentTabs.Dock = System.Windows.Forms.DockStyle.Fill;
			this.tbcDocumentTabs.Location = new System.Drawing.Point(5, 5);
			this.tbcDocumentTabs.Name = "tbcDocumentTabs";
			this.tbcDocumentTabs.SelectedIndex = 0;
			this.tbcDocumentTabs.Size = new System.Drawing.Size(1006, 677);
			this.tbcDocumentTabs.TabIndex = 0;
			// 
			// pnlButtons
			// 
			this.pnlButtons.Controls.Add(this.btnSave);
			this.pnlButtons.Controls.Add(this.btnCancel);
			this.pnlButtons.Controls.Add(this.btnValidate);
			this.pnlButtons.Dock = System.Windows.Forms.DockStyle.Bottom;
			this.pnlButtons.Location = new System.Drawing.Point(5, 682);
			this.pnlButtons.Name = "pnlButtons";
			this.pnlButtons.Size = new System.Drawing.Size(1006, 36);
			this.pnlButtons.TabIndex = 1;
			// 
			// btnValidate
			// 
			this.btnValidate.AutoSize = true;
			this.btnValidate.Location = new System.Drawing.Point(843, 6);
			this.btnValidate.Name = "btnValidate";
			this.btnValidate.Size = new System.Drawing.Size(88, 27);
			this.btnValidate.TabIndex = 0;
			this.btnValidate.Text = "Validate All";
			this.btnValidate.UseVisualStyleBackColor = true;
			this.btnValidate.Click += new System.EventHandler(this.btnValidate_Click);
			// 
			// btnCancel
			// 
			this.btnCancel.AutoSize = true;
			this.btnCancel.Location = new System.Drawing.Point(942, 6);
			this.btnCancel.Name = "btnCancel";
			this.btnCancel.Size = new System.Drawing.Size(61, 27);
			this.btnCancel.TabIndex = 1;
			this.btnCancel.Text = "Cancel";
			this.btnCancel.UseVisualStyleBackColor = true;
			this.btnCancel.Click += new System.EventHandler(this.btnCancel_Click);
			// 
			// btnSave
			// 
			this.btnSave.AutoSize = true;
			this.btnSave.Location = new System.Drawing.Point(768, 6);
			this.btnSave.Name = "btnSave";
			this.btnSave.Size = new System.Drawing.Size(69, 27);
			this.btnSave.TabIndex = 2;
			this.btnSave.Text = "Save All";
			this.btnSave.UseVisualStyleBackColor = true;
			this.btnSave.Click += new System.EventHandler(this.btnSave_Click);
			// 
			// MissingInformationForm
			// 
			this.AcceptButton = this.btnSave;
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.CancelButton = this.btnCancel;
			this.ClientSize = new System.Drawing.Size(1016, 723);
			this.Controls.Add(this.tbcDocumentTabs);
			this.Controls.Add(this.pnlButtons);
			this.MinimumSize = new System.Drawing.Size(1024, 768);
			this.Name = "MissingInformationForm";
			this.Padding = new System.Windows.Forms.Padding(5);
			this.ShowIcon = false;
			this.Text = "Schema Transformer";
			this.pnlButtons.ResumeLayout(false);
			this.pnlButtons.PerformLayout();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.TabControl tbcDocumentTabs;
		private System.Windows.Forms.Panel pnlButtons;
		private System.Windows.Forms.Button btnSave;
		private System.Windows.Forms.Button btnCancel;
		private System.Windows.Forms.Button btnValidate;


	}
}