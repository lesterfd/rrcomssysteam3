namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	partial class DevicePanel
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
			this.grpDevice = new System.Windows.Forms.GroupBox();
			this.capabilitiesListBox = new System.Windows.Forms.ListBox();
			this.capabilitiesBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.devicesBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.iDTextBox = new System.Windows.Forms.TextBox();
			this.isLocalCheckBox = new System.Windows.Forms.CheckBox();
			this.isVirtualCheckBox = new System.Windows.Forms.CheckBox();
			iDLabel = new System.Windows.Forms.Label();
			isLocalLabel = new System.Windows.Forms.Label();
			isVirtualLabel = new System.Windows.Forms.Label();
			this.grpDevice.SuspendLayout();
			((System.ComponentModel.ISupportInitialize) (this.capabilitiesBindingSource)).BeginInit();
			((System.ComponentModel.ISupportInitialize) (this.devicesBindingSource)).BeginInit();
			this.SuspendLayout();
			// 
			// iDLabel
			// 
			iDLabel.AutoSize = true;
			iDLabel.Location = new System.Drawing.Point(6, 18);
			iDLabel.Name = "iDLabel";
			iDLabel.Size = new System.Drawing.Size(25, 17);
			iDLabel.TabIndex = 0;
			iDLabel.Text = "ID:";
			// 
			// isLocalLabel
			// 
			isLocalLabel.AutoSize = true;
			isLocalLabel.Location = new System.Drawing.Point(6, 48);
			isLocalLabel.Name = "isLocalLabel";
			isLocalLabel.Size = new System.Drawing.Size(60, 17);
			isLocalLabel.TabIndex = 2;
			isLocalLabel.Text = "Is Local:";
			// 
			// isVirtualLabel
			// 
			isVirtualLabel.AutoSize = true;
			isVirtualLabel.Location = new System.Drawing.Point(6, 78);
			isVirtualLabel.Name = "isVirtualLabel";
			isVirtualLabel.Size = new System.Drawing.Size(66, 17);
			isVirtualLabel.TabIndex = 4;
			isVirtualLabel.Text = "Is Virtual:";
			// 
			// grpDevice
			// 
			this.grpDevice.AutoSize = true;
			this.grpDevice.Controls.Add(this.capabilitiesListBox);
			this.grpDevice.Controls.Add(iDLabel);
			this.grpDevice.Controls.Add(this.iDTextBox);
			this.grpDevice.Controls.Add(isLocalLabel);
			this.grpDevice.Controls.Add(this.isLocalCheckBox);
			this.grpDevice.Controls.Add(isVirtualLabel);
			this.grpDevice.Controls.Add(this.isVirtualCheckBox);
			this.grpDevice.Location = new System.Drawing.Point(3, 3);
			this.grpDevice.Name = "grpDevice";
			this.grpDevice.Size = new System.Drawing.Size(209, 240);
			this.grpDevice.TabIndex = 0;
			this.grpDevice.TabStop = false;
			this.grpDevice.Text = "Device";
			// 
			// capabilitiesListBox
			// 
			this.capabilitiesListBox.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.capabilitiesListBox.DataSource = this.capabilitiesBindingSource;
			this.capabilitiesListBox.FormattingEnabled = true;
			this.capabilitiesListBox.ItemHeight = 16;
			this.capabilitiesListBox.Location = new System.Drawing.Point(9, 103);
			this.capabilitiesListBox.Name = "capabilitiesListBox";
			this.capabilitiesListBox.Size = new System.Drawing.Size(190, 116);
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
			this.iDTextBox.Location = new System.Drawing.Point(78, 15);
			this.iDTextBox.Name = "iDTextBox";
			this.iDTextBox.Size = new System.Drawing.Size(101, 22);
			this.iDTextBox.TabIndex = 1;
			// 
			// isLocalCheckBox
			// 
			this.isLocalCheckBox.DataBindings.Add(new System.Windows.Forms.Binding("CheckState", this.devicesBindingSource, "IsLocal", true));
			this.isLocalCheckBox.Location = new System.Drawing.Point(78, 43);
			this.isLocalCheckBox.Name = "isLocalCheckBox";
			this.isLocalCheckBox.Size = new System.Drawing.Size(104, 24);
			this.isLocalCheckBox.TabIndex = 3;
			this.isLocalCheckBox.UseVisualStyleBackColor = true;
			// 
			// isVirtualCheckBox
			// 
			this.isVirtualCheckBox.DataBindings.Add(new System.Windows.Forms.Binding("CheckState", this.devicesBindingSource, "IsVirtual", true));
			this.isVirtualCheckBox.Location = new System.Drawing.Point(78, 73);
			this.isVirtualCheckBox.Name = "isVirtualCheckBox";
			this.isVirtualCheckBox.Size = new System.Drawing.Size(104, 24);
			this.isVirtualCheckBox.TabIndex = 5;
			this.isVirtualCheckBox.UseVisualStyleBackColor = true;
			// 
			// DevicePanel
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.grpDevice);
			this.Name = "DevicePanel";
			this.Size = new System.Drawing.Size(215, 246);
			this.grpDevice.ResumeLayout(false);
			this.grpDevice.PerformLayout();
			((System.ComponentModel.ISupportInitialize) (this.capabilitiesBindingSource)).EndInit();
			((System.ComponentModel.ISupportInitialize) (this.devicesBindingSource)).EndInit();
			this.ResumeLayout(false);
			this.PerformLayout();

		}

		#endregion

		private System.Windows.Forms.GroupBox grpDevice;
		private System.Windows.Forms.ListBox capabilitiesListBox;
		private System.Windows.Forms.BindingSource capabilitiesBindingSource;
		private System.Windows.Forms.BindingSource devicesBindingSource;
		private System.Windows.Forms.TextBox iDTextBox;
		private System.Windows.Forms.CheckBox isLocalCheckBox;
		private System.Windows.Forms.CheckBox isVirtualCheckBox;
	}
}
