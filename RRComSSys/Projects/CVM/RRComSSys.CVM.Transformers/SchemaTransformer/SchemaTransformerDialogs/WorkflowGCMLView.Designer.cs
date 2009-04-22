namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	partial class WorkflowGCMLView
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
			this.components = new System.ComponentModel.Container();
			System.Windows.Forms.Label gCMLPathLabel;
			System.Windows.Forms.Label iDLabel;
			System.Windows.Forms.Label nextIDLabel;
			this.pnlGCMLView = new System.Windows.Forms.Panel();
			this.btnGCMLFile = new System.Windows.Forms.Button();
			this.lblGCML = new System.Windows.Forms.Label();
			this.gCMLPathTextBox = new System.Windows.Forms.TextBox();
			this.workflowGCMLItemBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.iDTextBox = new System.Windows.Forms.TextBox();
			this.nextIDTextBox = new System.Windows.Forms.TextBox();
			this.dlgOpenGCML = new System.Windows.Forms.OpenFileDialog();
			gCMLPathLabel = new System.Windows.Forms.Label();
			iDLabel = new System.Windows.Forms.Label();
			nextIDLabel = new System.Windows.Forms.Label();
			this.pnlGCMLView.SuspendLayout();
			((System.ComponentModel.ISupportInitialize) (this.workflowGCMLItemBindingSource)).BeginInit();
			this.SuspendLayout();
			// 
			// gCMLPathLabel
			// 
			gCMLPathLabel.AutoSize = true;
			gCMLPathLabel.Location = new System.Drawing.Point(12, 32);
			gCMLPathLabel.Name = "gCMLPathLabel";
			gCMLPathLabel.Size = new System.Drawing.Size(84, 17);
			gCMLPathLabel.TabIndex = 0;
			gCMLPathLabel.Text = "GCML Path:";
			// 
			// iDLabel
			// 
			iDLabel.AutoSize = true;
			iDLabel.Location = new System.Drawing.Point(12, 60);
			iDLabel.Name = "iDLabel";
			iDLabel.Size = new System.Drawing.Size(25, 17);
			iDLabel.TabIndex = 2;
			iDLabel.Text = "ID:";
			// 
			// nextIDLabel
			// 
			nextIDLabel.AutoSize = true;
			nextIDLabel.Location = new System.Drawing.Point(12, 88);
			nextIDLabel.Name = "nextIDLabel";
			nextIDLabel.Size = new System.Drawing.Size(57, 17);
			nextIDLabel.TabIndex = 4;
			nextIDLabel.Text = "Next ID:";
			// 
			// pnlGCMLView
			// 
			this.pnlGCMLView.BackColor = System.Drawing.Color.AliceBlue;
			this.pnlGCMLView.Controls.Add(this.btnGCMLFile);
			this.pnlGCMLView.Controls.Add(this.lblGCML);
			this.pnlGCMLView.Controls.Add(gCMLPathLabel);
			this.pnlGCMLView.Controls.Add(this.gCMLPathTextBox);
			this.pnlGCMLView.Controls.Add(iDLabel);
			this.pnlGCMLView.Controls.Add(this.iDTextBox);
			this.pnlGCMLView.Controls.Add(nextIDLabel);
			this.pnlGCMLView.Controls.Add(this.nextIDTextBox);
			this.pnlGCMLView.Location = new System.Drawing.Point(3, 3);
			this.pnlGCMLView.Name = "pnlGCMLView";
			this.pnlGCMLView.Size = new System.Drawing.Size(280, 120);
			this.pnlGCMLView.TabIndex = 0;
			// 
			// btnGCMLFile
			// 
			this.btnGCMLFile.AutoSize = true;
			this.btnGCMLFile.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.btnGCMLFile.Location = new System.Drawing.Point(102, 27);
			this.btnGCMLFile.Name = "btnGCMLFile";
			this.btnGCMLFile.Size = new System.Drawing.Size(30, 27);
			this.btnGCMLFile.TabIndex = 1;
			this.btnGCMLFile.Text = "...";
			this.btnGCMLFile.UseVisualStyleBackColor = true;
			this.btnGCMLFile.Click += new System.EventHandler(this.btnGCMLFile_Click);
			// 
			// lblGCML
			// 
			this.lblGCML.AutoSize = true;
			this.lblGCML.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblGCML.Location = new System.Drawing.Point(3, 4);
			this.lblGCML.Name = "lblGCML";
			this.lblGCML.Size = new System.Drawing.Size(156, 17);
			this.lblGCML.TabIndex = 6;
			this.lblGCML.Text = "GCML Workflow Item";
			// 
			// gCMLPathTextBox
			// 
			this.gCMLPathTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.workflowGCMLItemBindingSource, "GCMLPath", true));
			this.gCMLPathTextBox.Location = new System.Drawing.Point(138, 29);
			this.gCMLPathTextBox.Name = "gCMLPathTextBox";
			this.gCMLPathTextBox.ReadOnly = true;
			this.gCMLPathTextBox.Size = new System.Drawing.Size(116, 22);
			this.gCMLPathTextBox.TabIndex = 1;
			// 
			// workflowGCMLItemBindingSource
			// 
			this.workflowGCMLItemBindingSource.DataSource = typeof(RRComSSys.CVM.ObjectModel.XCMLWorkflowModel.WorkflowGCMLItem);
			// 
			// iDTextBox
			// 
			this.iDTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.workflowGCMLItemBindingSource, "ID", true));
			this.iDTextBox.Location = new System.Drawing.Point(102, 57);
			this.iDTextBox.Name = "iDTextBox";
			this.iDTextBox.ReadOnly = true;
			this.iDTextBox.Size = new System.Drawing.Size(152, 22);
			this.iDTextBox.TabIndex = 3;
			// 
			// nextIDTextBox
			// 
			this.nextIDTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.workflowGCMLItemBindingSource, "NextID", true));
			this.nextIDTextBox.Location = new System.Drawing.Point(102, 85);
			this.nextIDTextBox.Name = "nextIDTextBox";
			this.nextIDTextBox.ReadOnly = true;
			this.nextIDTextBox.Size = new System.Drawing.Size(152, 22);
			this.nextIDTextBox.TabIndex = 5;
			// 
			// dlgOpenGCML
			// 
			this.dlgOpenGCML.Filter = "GCML Files|*.gcml|XCML Files|*.xcml";
			this.dlgOpenGCML.Title = "Select GCML File";
			// 
			// WorkflowGCMLView
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.pnlGCMLView);
			this.Name = "WorkflowGCMLView";
			this.Size = new System.Drawing.Size(286, 126);
			this.pnlGCMLView.ResumeLayout(false);
			this.pnlGCMLView.PerformLayout();
			((System.ComponentModel.ISupportInitialize) (this.workflowGCMLItemBindingSource)).EndInit();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.Panel pnlGCMLView;
		private System.Windows.Forms.Button btnGCMLFile;
		private System.Windows.Forms.Label lblGCML;
		private System.Windows.Forms.TextBox gCMLPathTextBox;
		private System.Windows.Forms.BindingSource workflowGCMLItemBindingSource;
		private System.Windows.Forms.TextBox iDTextBox;
		private System.Windows.Forms.TextBox nextIDTextBox;
		private System.Windows.Forms.OpenFileDialog dlgOpenGCML;
	}
}
