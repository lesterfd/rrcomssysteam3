namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	partial class ConnectionPanel
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
			System.Windows.Forms.Label bandwidthLabel;
			System.Windows.Forms.Label iDLabel;
			this.grpConnection = new System.Windows.Forms.GroupBox();
			this.grpDevices = new System.Windows.Forms.GroupBox();
			this.flpDevices = new System.Windows.Forms.FlowLayoutPanel();
			this.bandwidthTextBox = new System.Windows.Forms.TextBox();
			this.connectionsBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.iDTextBox = new System.Windows.Forms.TextBox();
			bandwidthLabel = new System.Windows.Forms.Label();
			iDLabel = new System.Windows.Forms.Label();
			this.grpConnection.SuspendLayout();
			this.grpDevices.SuspendLayout();
			((System.ComponentModel.ISupportInitialize) (this.connectionsBindingSource)).BeginInit();
			this.SuspendLayout();
			// 
			// bandwidthLabel
			// 
			bandwidthLabel.AutoSize = true;
			bandwidthLabel.Location = new System.Drawing.Point(6, 52);
			bandwidthLabel.Name = "bandwidthLabel";
			bandwidthLabel.Size = new System.Drawing.Size(77, 17);
			bandwidthLabel.TabIndex = 0;
			bandwidthLabel.Text = "Bandwidth:";
			// 
			// iDLabel
			// 
			iDLabel.AutoSize = true;
			iDLabel.Location = new System.Drawing.Point(6, 24);
			iDLabel.Name = "iDLabel";
			iDLabel.Size = new System.Drawing.Size(25, 17);
			iDLabel.TabIndex = 2;
			iDLabel.Text = "ID:";
			// 
			// grpConnection
			// 
			this.grpConnection.AutoSize = true;
			this.grpConnection.Controls.Add(this.grpDevices);
			this.grpConnection.Controls.Add(bandwidthLabel);
			this.grpConnection.Controls.Add(this.bandwidthTextBox);
			this.grpConnection.Controls.Add(iDLabel);
			this.grpConnection.Controls.Add(this.iDTextBox);
			this.grpConnection.Location = new System.Drawing.Point(3, 3);
			this.grpConnection.Name = "grpConnection";
			this.grpConnection.Size = new System.Drawing.Size(311, 156);
			this.grpConnection.TabIndex = 0;
			this.grpConnection.TabStop = false;
			this.grpConnection.Text = "Connection";
			// 
			// grpDevices
			// 
			this.grpDevices.AutoSize = true;
			this.grpDevices.Controls.Add(this.flpDevices);
			this.grpDevices.Location = new System.Drawing.Point(9, 77);
			this.grpDevices.Name = "grpDevices";
			this.grpDevices.Size = new System.Drawing.Size(296, 58);
			this.grpDevices.TabIndex = 4;
			this.grpDevices.TabStop = false;
			this.grpDevices.Text = "Devices";
			// 
			// flpDevices
			// 
			this.flpDevices.AutoSize = true;
			this.flpDevices.FlowDirection = System.Windows.Forms.FlowDirection.TopDown;
			this.flpDevices.Location = new System.Drawing.Point(6, 21);
			this.flpDevices.Name = "flpDevices";
			this.flpDevices.Size = new System.Drawing.Size(284, 16);
			this.flpDevices.TabIndex = 0;
			// 
			// bandwidthTextBox
			// 
			this.bandwidthTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.connectionsBindingSource, "Bandwidth", true));
			this.bandwidthTextBox.Location = new System.Drawing.Point(89, 49);
			this.bandwidthTextBox.Name = "bandwidthTextBox";
			this.bandwidthTextBox.Size = new System.Drawing.Size(192, 22);
			this.bandwidthTextBox.TabIndex = 1;
			// 
			// connectionsBindingSource
			// 
			this.connectionsBindingSource.DataSource = typeof(RRComSSys.CVM.ObjectModel.XCMLModel.Connection);
			// 
			// iDTextBox
			// 
			this.iDTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.connectionsBindingSource, "ID", true));
			this.iDTextBox.Location = new System.Drawing.Point(89, 21);
			this.iDTextBox.Name = "iDTextBox";
			this.iDTextBox.Size = new System.Drawing.Size(192, 22);
			this.iDTextBox.TabIndex = 3;
			// 
			// ConnectionPanel
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.grpConnection);
			this.Name = "ConnectionPanel";
			this.Size = new System.Drawing.Size(317, 162);
			this.grpConnection.ResumeLayout(false);
			this.grpConnection.PerformLayout();
			this.grpDevices.ResumeLayout(false);
			this.grpDevices.PerformLayout();
			((System.ComponentModel.ISupportInitialize) (this.connectionsBindingSource)).EndInit();
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.GroupBox grpConnection;
		private System.Windows.Forms.TextBox bandwidthTextBox;
		private System.Windows.Forms.BindingSource connectionsBindingSource;
		private System.Windows.Forms.TextBox iDTextBox;
		private System.Windows.Forms.GroupBox grpDevices;
		private System.Windows.Forms.FlowLayoutPanel flpDevices;
	}
}
