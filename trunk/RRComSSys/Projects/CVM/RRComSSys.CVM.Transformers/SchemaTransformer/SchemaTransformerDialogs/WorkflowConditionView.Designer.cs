namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	partial class WorkflowConditionView
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
			System.Windows.Forms.Label altNextIDLabel;
			System.Windows.Forms.Label iDLabel;
			System.Windows.Forms.Label nextIDLabel;
			this.pnlCondition = new System.Windows.Forms.Panel();
			this.lblCondition = new System.Windows.Forms.Label();
			this.altNextIDTextBox = new System.Windows.Forms.TextBox();
			this.workflowConditionBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.iDTextBox = new System.Windows.Forms.TextBox();
			this.nextIDTextBox = new System.Windows.Forms.TextBox();
			altNextIDLabel = new System.Windows.Forms.Label();
			iDLabel = new System.Windows.Forms.Label();
			nextIDLabel = new System.Windows.Forms.Label();
			this.pnlCondition.SuspendLayout();
			((System.ComponentModel.ISupportInitialize) (this.workflowConditionBindingSource)).BeginInit();
			this.SuspendLayout();
			// 
			// altNextIDLabel
			// 
			altNextIDLabel.AutoSize = true;
			altNextIDLabel.Location = new System.Drawing.Point(9, 31);
			altNextIDLabel.Name = "altNextIDLabel";
			altNextIDLabel.Size = new System.Drawing.Size(77, 17);
			altNextIDLabel.TabIndex = 0;
			altNextIDLabel.Text = "Alt Next ID:";
			// 
			// iDLabel
			// 
			iDLabel.AutoSize = true;
			iDLabel.Location = new System.Drawing.Point(9, 59);
			iDLabel.Name = "iDLabel";
			iDLabel.Size = new System.Drawing.Size(25, 17);
			iDLabel.TabIndex = 2;
			iDLabel.Text = "ID:";
			// 
			// nextIDLabel
			// 
			nextIDLabel.AutoSize = true;
			nextIDLabel.Location = new System.Drawing.Point(9, 87);
			nextIDLabel.Name = "nextIDLabel";
			nextIDLabel.Size = new System.Drawing.Size(57, 17);
			nextIDLabel.TabIndex = 4;
			nextIDLabel.Text = "Next ID:";
			// 
			// pnlCondition
			// 
			this.pnlCondition.BackColor = System.Drawing.Color.AliceBlue;
			this.pnlCondition.Controls.Add(this.lblCondition);
			this.pnlCondition.Controls.Add(altNextIDLabel);
			this.pnlCondition.Controls.Add(this.altNextIDTextBox);
			this.pnlCondition.Controls.Add(iDLabel);
			this.pnlCondition.Controls.Add(this.iDTextBox);
			this.pnlCondition.Controls.Add(nextIDLabel);
			this.pnlCondition.Controls.Add(this.nextIDTextBox);
			this.pnlCondition.Location = new System.Drawing.Point(3, 3);
			this.pnlCondition.Name = "pnlCondition";
			this.pnlCondition.Size = new System.Drawing.Size(259, 114);
			this.pnlCondition.TabIndex = 0;
			// 
			// lblCondition
			// 
			this.lblCondition.AutoSize = true;
			this.lblCondition.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblCondition.Location = new System.Drawing.Point(3, 5);
			this.lblCondition.Name = "lblCondition";
			this.lblCondition.Size = new System.Drawing.Size(146, 17);
			this.lblCondition.TabIndex = 6;
			this.lblCondition.Text = "Workflow Condition";
			// 
			// altNextIDTextBox
			// 
			this.altNextIDTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.workflowConditionBindingSource, "AltNextID", true));
			this.altNextIDTextBox.Location = new System.Drawing.Point(92, 28);
			this.altNextIDTextBox.Name = "altNextIDTextBox";
			this.altNextIDTextBox.ReadOnly = true;
			this.altNextIDTextBox.Size = new System.Drawing.Size(141, 22);
			this.altNextIDTextBox.TabIndex = 1;
			// 
			// workflowConditionBindingSource
			// 
			this.workflowConditionBindingSource.DataSource = typeof(RRComSSys.CVM.ObjectModel.XCMLWorkflowModel.WorkflowCondition);
			// 
			// iDTextBox
			// 
			this.iDTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.workflowConditionBindingSource, "ID", true));
			this.iDTextBox.Location = new System.Drawing.Point(92, 56);
			this.iDTextBox.Name = "iDTextBox";
			this.iDTextBox.ReadOnly = true;
			this.iDTextBox.Size = new System.Drawing.Size(141, 22);
			this.iDTextBox.TabIndex = 3;
			// 
			// nextIDTextBox
			// 
			this.nextIDTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.workflowConditionBindingSource, "NextID", true));
			this.nextIDTextBox.Location = new System.Drawing.Point(92, 84);
			this.nextIDTextBox.Name = "nextIDTextBox";
			this.nextIDTextBox.ReadOnly = true;
			this.nextIDTextBox.Size = new System.Drawing.Size(141, 22);
			this.nextIDTextBox.TabIndex = 5;
			// 
			// WorkflowConditionView
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.pnlCondition);
			this.Name = "WorkflowConditionView";
			this.Size = new System.Drawing.Size(265, 120);
			this.pnlCondition.ResumeLayout(false);
			this.pnlCondition.PerformLayout();
			((System.ComponentModel.ISupportInitialize) (this.workflowConditionBindingSource)).EndInit();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.Panel pnlCondition;
		private System.Windows.Forms.Label lblCondition;
		private System.Windows.Forms.TextBox altNextIDTextBox;
		private System.Windows.Forms.BindingSource workflowConditionBindingSource;
		private System.Windows.Forms.TextBox iDTextBox;
		private System.Windows.Forms.TextBox nextIDTextBox;
	}
}
