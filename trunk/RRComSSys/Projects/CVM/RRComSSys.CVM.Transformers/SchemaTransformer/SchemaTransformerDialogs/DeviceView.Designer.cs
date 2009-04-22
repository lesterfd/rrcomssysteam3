namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	partial class DeviceView
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
			System.Windows.Forms.Label iDLabel;
			System.Windows.Forms.Label isLocalLabel;
			System.Windows.Forms.Label isVirtualLabel;
			this.capabilitiesListBox = new System.Windows.Forms.ListBox();
			this.capabilitiesBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.devicesBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.iDTextBox = new System.Windows.Forms.TextBox();
			this.isLocalCheckBox = new System.Windows.Forms.CheckBox();
			this.isVirtualCheckBox = new System.Windows.Forms.CheckBox();
			this.pnlDevice = new System.Windows.Forms.Panel();
			this.lblDevice = new System.Windows.Forms.Label();
			iDLabel = new System.Windows.Forms.Label();
			isLocalLabel = new System.Windows.Forms.Label();
			isVirtualLabel = new System.Windows.Forms.Label();
			((System.ComponentModel.ISupportInitialize) (this.capabilitiesBindingSource)).BeginInit();
			((System.ComponentModel.ISupportInitialize) (this.devicesBindingSource)).BeginInit();
			this.pnlDevice.SuspendLayout();
			this.SuspendLayout();
			// 
			// iDLabel
			// 
			iDLabel.AutoSize = true;
			iDLabel.Location = new System.Drawing.Point(3, 17);
			iDLabel.Name = "iDLabel";
			iDLabel.Size = new System.Drawing.Size(25, 17);
			iDLabel.TabIndex = 0;
			iDLabel.Text = "ID:";
			// 
			// isLocalLabel
			// 
			isLocalLabel.AutoSize = true;
			isLocalLabel.Location = new System.Drawing.Point(3, 47);
			isLocalLabel.Name = "isLocalLabel";
			isLocalLabel.Size = new System.Drawing.Size(60, 17);
			isLocalLabel.TabIndex = 2;
			isLocalLabel.Text = "Is Local:";
			// 
			// isVirtualLabel
			// 
			isVirtualLabel.AutoSize = true;
			isVirtualLabel.Location = new System.Drawing.Point(3, 77);
			isVirtualLabel.Name = "isVirtualLabel";
			isVirtualLabel.Size = new System.Drawing.Size(66, 17);
			isVirtualLabel.TabIndex = 4;
			isVirtualLabel.Text = "Is Virtual:";
			// 
			// capabilitiesListBox
			// 
			this.capabilitiesListBox.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.capabilitiesListBox.DataSource = this.capabilitiesBindingSource;
			this.capabilitiesListBox.FormattingEnabled = true;
			this.capabilitiesListBox.ItemHeight = 16;
			this.capabilitiesListBox.Location = new System.Drawing.Point(6, 102);
			this.capabilitiesListBox.Name = "capabilitiesListBox";
			this.capabilitiesListBox.Size = new System.Drawing.Size(259, 116);
			this.capabilitiesListBox.TabIndex = 6;
			// 
			// capabilitiesBindingSource
			// 
			this.capabilitiesBindingSource.DataMember = "Capabilities";
			this.capabilitiesBindingSource.DataSource = this.devicesBindingSource;
			// 
			// devicesBindingSource
			// 
			this.devicesBindingSource.DataSource = typeof(RRComSSys.CVM.ObjectModel.XCMLModel.Device);
			// 
			// iDTextBox
			// 
			this.iDTextBox.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.iDTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.devicesBindingSource, "ID", true));
			this.iDTextBox.Location = new System.Drawing.Point(75, 14);
			this.iDTextBox.Name = "iDTextBox";
			this.iDTextBox.ReadOnly = true;
			this.iDTextBox.Size = new System.Drawing.Size(160, 22);
			this.iDTextBox.TabIndex = 1;
			// 
			// isLocalCheckBox
			// 
			this.isLocalCheckBox.DataBindings.Add(new System.Windows.Forms.Binding("CheckState", this.devicesBindingSource, "IsLocal", true));
			this.isLocalCheckBox.Location = new System.Drawing.Point(75, 42);
			this.isLocalCheckBox.Name = "isLocalCheckBox";
			this.isLocalCheckBox.Size = new System.Drawing.Size(104, 24);
			this.isLocalCheckBox.TabIndex = 3;
			this.isLocalCheckBox.UseVisualStyleBackColor = true;
			// 
			// isVirtualCheckBox
			// 
			this.isVirtualCheckBox.DataBindings.Add(new System.Windows.Forms.Binding("CheckState", this.devicesBindingSource, "IsVirtual", true));
			this.isVirtualCheckBox.Enabled = false;
			this.isVirtualCheckBox.Location = new System.Drawing.Point(75, 72);
			this.isVirtualCheckBox.Name = "isVirtualCheckBox";
			this.isVirtualCheckBox.Size = new System.Drawing.Size(104, 24);
			this.isVirtualCheckBox.TabIndex = 5;
			this.isVirtualCheckBox.UseVisualStyleBackColor = true;
			// 
			// pnlDevice
			// 
			this.pnlDevice.BackColor = System.Drawing.Color.AliceBlue;
			this.pnlDevice.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
			this.pnlDevice.Controls.Add(this.lblDevice);
			this.pnlDevice.Controls.Add(this.capabilitiesListBox);
			this.pnlDevice.Controls.Add(iDLabel);
			this.pnlDevice.Controls.Add(this.isVirtualCheckBox);
			this.pnlDevice.Controls.Add(this.iDTextBox);
			this.pnlDevice.Controls.Add(isVirtualLabel);
			this.pnlDevice.Controls.Add(isLocalLabel);
			this.pnlDevice.Controls.Add(this.isLocalCheckBox);
			this.pnlDevice.Location = new System.Drawing.Point(3, 3);
			this.pnlDevice.Name = "pnlDevice";
			this.pnlDevice.Size = new System.Drawing.Size(272, 229);
			this.pnlDevice.TabIndex = 1;
			// 
			// lblDevice
			// 
			this.lblDevice.AutoSize = true;
			this.lblDevice.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblDevice.ForeColor = System.Drawing.Color.Blue;
			this.lblDevice.Location = new System.Drawing.Point(3, 0);
			this.lblDevice.Name = "lblDevice";
			this.lblDevice.Size = new System.Drawing.Size(57, 17);
			this.lblDevice.TabIndex = 2;
			this.lblDevice.Text = "Device";
			// 
			// DevicePanel
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.pnlDevice);
			this.Name = "DevicePanel";
			this.Size = new System.Drawing.Size(278, 235);
			((System.ComponentModel.ISupportInitialize) (this.capabilitiesBindingSource)).EndInit();
			((System.ComponentModel.ISupportInitialize) (this.devicesBindingSource)).EndInit();
			this.pnlDevice.ResumeLayout(false);
			this.pnlDevice.PerformLayout();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.ListBox capabilitiesListBox;
		private System.Windows.Forms.BindingSource capabilitiesBindingSource;
		private System.Windows.Forms.BindingSource devicesBindingSource;
		private System.Windows.Forms.TextBox iDTextBox;
		private System.Windows.Forms.CheckBox isLocalCheckBox;
		private System.Windows.Forms.CheckBox isVirtualCheckBox;
		private System.Windows.Forms.Panel pnlDevice;
		private System.Windows.Forms.Label lblDevice;
	}
}
