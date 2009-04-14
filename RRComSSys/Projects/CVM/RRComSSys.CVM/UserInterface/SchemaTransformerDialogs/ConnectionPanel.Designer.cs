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
			this.flpDevices = new System.Windows.Forms.FlowLayoutPanel();
			this.bandwidthTextBox = new System.Windows.Forms.TextBox();
			this.connectionsBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.iDTextBox = new System.Windows.Forms.TextBox();
			this.panel1 = new System.Windows.Forms.Panel();
			this.lblDevices = new System.Windows.Forms.Label();
			this.lblConnection = new System.Windows.Forms.Label();
			this.label2 = new System.Windows.Forms.Label();
			this.label1 = new System.Windows.Forms.Label();
			bandwidthLabel = new System.Windows.Forms.Label();
			iDLabel = new System.Windows.Forms.Label();
			((System.ComponentModel.ISupportInitialize) (this.connectionsBindingSource)).BeginInit();
			this.panel1.SuspendLayout();
			this.SuspendLayout();
			// 
			// bandwidthLabel
			// 
			bandwidthLabel.AutoSize = true;
			bandwidthLabel.Location = new System.Drawing.Point(3, 54);
			bandwidthLabel.Name = "bandwidthLabel";
			bandwidthLabel.Size = new System.Drawing.Size(77, 17);
			bandwidthLabel.TabIndex = 0;
			bandwidthLabel.Text = "Bandwidth:";
			// 
			// iDLabel
			// 
			iDLabel.AutoSize = true;
			iDLabel.Location = new System.Drawing.Point(3, 26);
			iDLabel.Name = "iDLabel";
			iDLabel.Size = new System.Drawing.Size(25, 17);
			iDLabel.TabIndex = 2;
			iDLabel.Text = "ID:";
			// 
			// flpDevices
			// 
			this.flpDevices.AutoSize = true;
			this.flpDevices.FlowDirection = System.Windows.Forms.FlowDirection.TopDown;
			this.flpDevices.Location = new System.Drawing.Point(6, 103);
			this.flpDevices.Name = "flpDevices";
			this.flpDevices.Size = new System.Drawing.Size(298, 16);
			this.flpDevices.TabIndex = 0;
			// 
			// bandwidthTextBox
			// 
			this.bandwidthTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.connectionsBindingSource, "Bandwidth", true));
			this.bandwidthTextBox.Location = new System.Drawing.Point(86, 51);
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
			this.iDTextBox.Location = new System.Drawing.Point(86, 23);
			this.iDTextBox.Name = "iDTextBox";
			this.iDTextBox.ReadOnly = true;
			this.iDTextBox.Size = new System.Drawing.Size(192, 22);
			this.iDTextBox.TabIndex = 3;
			// 
			// panel1
			// 
			this.panel1.AutoSize = true;
			this.panel1.BackColor = System.Drawing.SystemColors.ControlLight;
			this.panel1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
			this.panel1.Controls.Add(this.lblDevices);
			this.panel1.Controls.Add(this.flpDevices);
			this.panel1.Controls.Add(this.lblConnection);
			this.panel1.Controls.Add(iDLabel);
			this.panel1.Controls.Add(bandwidthLabel);
			this.panel1.Controls.Add(this.iDTextBox);
			this.panel1.Controls.Add(this.bandwidthTextBox);
			this.panel1.Location = new System.Drawing.Point(3, 3);
			this.panel1.Name = "panel1";
			this.panel1.Size = new System.Drawing.Size(311, 130);
			this.panel1.TabIndex = 1;
			// 
			// lblDevices
			// 
			this.lblDevices.AutoSize = true;
			this.lblDevices.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblDevices.Location = new System.Drawing.Point(15, 83);
			this.lblDevices.Name = "lblDevices";
			this.lblDevices.Size = new System.Drawing.Size(65, 17);
			this.lblDevices.TabIndex = 2;
			this.lblDevices.Text = "Devices";
			// 
			// lblConnection
			// 
			this.lblConnection.AutoSize = true;
			this.lblConnection.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblConnection.Location = new System.Drawing.Point(3, 0);
			this.lblConnection.Name = "lblConnection";
			this.lblConnection.Size = new System.Drawing.Size(89, 17);
			this.lblConnection.TabIndex = 3;
			this.lblConnection.Text = "Connection";
			// 
			// label2
			// 
			this.label2.AutoSize = true;
			this.label2.Location = new System.Drawing.Point(374, 15);
			this.label2.Name = "label2";
			this.label2.Size = new System.Drawing.Size(46, 17);
			this.label2.TabIndex = 3;
			this.label2.Text = "label2";
			// 
			// label1
			// 
			this.label1.AutoSize = true;
			this.label1.Location = new System.Drawing.Point(383, 40);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(46, 17);
			this.label1.TabIndex = 2;
			this.label1.Text = "label1";
			// 
			// ConnectionPanel
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.panel1);
			this.Name = "ConnectionPanel";
			this.Size = new System.Drawing.Size(317, 136);
			((System.ComponentModel.ISupportInitialize) (this.connectionsBindingSource)).EndInit();
			this.panel1.ResumeLayout(false);
			this.panel1.PerformLayout();
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.TextBox bandwidthTextBox;
		private System.Windows.Forms.BindingSource connectionsBindingSource;
		private System.Windows.Forms.TextBox iDTextBox;
		private System.Windows.Forms.FlowLayoutPanel flpDevices;
		private System.Windows.Forms.Panel panel1;
		private System.Windows.Forms.Label lblDevices;
		private System.Windows.Forms.Label lblConnection;
		private System.Windows.Forms.Label label2;
		private System.Windows.Forms.Label label1;
	}
}
