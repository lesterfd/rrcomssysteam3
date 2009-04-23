namespace RRComSSys.CVM.UserInterface.CVMGUI
{
	partial class WorkflowRunner
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
			this.lblWorkflow = new System.Windows.Forms.Label();
			this.btnRunWorkflow = new System.Windows.Forms.Button();
			this.SuspendLayout();
			// 
			// lblWorkflow
			// 
			this.lblWorkflow.AutoSize = true;
			this.lblWorkflow.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblWorkflow.Location = new System.Drawing.Point(3, 0);
			this.lblWorkflow.Name = "lblWorkflow";
			this.lblWorkflow.Size = new System.Drawing.Size(73, 17);
			this.lblWorkflow.TabIndex = 0;
			this.lblWorkflow.Text = "Workflow";
			// 
			// btnRunWorkflow
			// 
			this.btnRunWorkflow.AutoSize = true;
			this.btnRunWorkflow.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.btnRunWorkflow.Location = new System.Drawing.Point(3, 20);
			this.btnRunWorkflow.Name = "btnRunWorkflow";
			this.btnRunWorkflow.Size = new System.Drawing.Size(105, 27);
			this.btnRunWorkflow.TabIndex = 1;
			this.btnRunWorkflow.Text = "Run Workflow";
			this.btnRunWorkflow.UseVisualStyleBackColor = true;
			this.btnRunWorkflow.Click += new System.EventHandler(this.btnRunWorkflow_Click);
			// 
			// WorkflowRunner
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.Controls.Add(this.btnRunWorkflow);
			this.Controls.Add(this.lblWorkflow);
			this.Name = "WorkflowRunner";
			this.Size = new System.Drawing.Size(123, 56);
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.Label lblWorkflow;
		private System.Windows.Forms.Button btnRunWorkflow;
	}
}
