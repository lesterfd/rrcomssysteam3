namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	partial class MediumView
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
			System.Windows.Forms.Label builtInTypeLabel;
			System.Windows.Forms.Label nameLabel;
			System.Windows.Forms.Label suggestedApplicationLabel;
			System.Windows.Forms.Label voiceCommandLabel;
			this.allMediaBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.builtInTypeComboBox = new System.Windows.Forms.ComboBox();
			this.nameTextBox = new System.Windows.Forms.TextBox();
			this.suggestedApplicationTextBox = new System.Windows.Forms.TextBox();
			this.voiceCommandTextBox = new System.Windows.Forms.TextBox();
			this.panel1 = new System.Windows.Forms.Panel();
			this.lblMedium = new System.Windows.Forms.Label();
			builtInTypeLabel = new System.Windows.Forms.Label();
			nameLabel = new System.Windows.Forms.Label();
			suggestedApplicationLabel = new System.Windows.Forms.Label();
			voiceCommandLabel = new System.Windows.Forms.Label();
			((System.ComponentModel.ISupportInitialize) (this.allMediaBindingSource)).BeginInit();
			this.panel1.SuspendLayout();
			this.SuspendLayout();
			// 
			// builtInTypeLabel
			// 
			builtInTypeLabel.AutoSize = true;
			builtInTypeLabel.Location = new System.Drawing.Point(3, 32);
			builtInTypeLabel.Name = "builtInTypeLabel";
			builtInTypeLabel.Size = new System.Drawing.Size(90, 17);
			builtInTypeLabel.TabIndex = 0;
			builtInTypeLabel.Text = "Built In Type:";
			// 
			// nameLabel
			// 
			nameLabel.AutoSize = true;
			nameLabel.Location = new System.Drawing.Point(3, 63);
			nameLabel.Name = "nameLabel";
			nameLabel.Size = new System.Drawing.Size(49, 17);
			nameLabel.TabIndex = 2;
			nameLabel.Text = "Name:";
			// 
			// suggestedApplicationLabel
			// 
			suggestedApplicationLabel.AutoSize = true;
			suggestedApplicationLabel.Location = new System.Drawing.Point(3, 91);
			suggestedApplicationLabel.Name = "suggestedApplicationLabel";
			suggestedApplicationLabel.Size = new System.Drawing.Size(153, 17);
			suggestedApplicationLabel.TabIndex = 4;
			suggestedApplicationLabel.Text = "Suggested Application:";
			// 
			// voiceCommandLabel
			// 
			voiceCommandLabel.AutoSize = true;
			voiceCommandLabel.Location = new System.Drawing.Point(3, 119);
			voiceCommandLabel.Name = "voiceCommandLabel";
			voiceCommandLabel.Size = new System.Drawing.Size(114, 17);
			voiceCommandLabel.TabIndex = 6;
			voiceCommandLabel.Text = "Voice Command:";
			// 
			// allMediaBindingSource
			// 
			this.allMediaBindingSource.AllowNew = false;
			this.allMediaBindingSource.DataSource = typeof(RRComSSys.CVM.ObjectModel.XCMLModel.Medium);
			// 
			// builtInTypeComboBox
			// 
			this.builtInTypeComboBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.allMediaBindingSource, "BuiltInType", true));
			this.builtInTypeComboBox.DataBindings.Add(new System.Windows.Forms.Binding("SelectedValue", this.allMediaBindingSource, "BuiltInType", true));
			this.builtInTypeComboBox.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
			this.builtInTypeComboBox.FormattingEnabled = true;
			this.builtInTypeComboBox.Location = new System.Drawing.Point(162, 29);
			this.builtInTypeComboBox.Name = "builtInTypeComboBox";
			this.builtInTypeComboBox.Size = new System.Drawing.Size(121, 24);
			this.builtInTypeComboBox.TabIndex = 1;
			// 
			// nameTextBox
			// 
			this.nameTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.allMediaBindingSource, "Name", true));
			this.nameTextBox.Location = new System.Drawing.Point(162, 60);
			this.nameTextBox.Name = "nameTextBox";
			this.nameTextBox.Size = new System.Drawing.Size(121, 22);
			this.nameTextBox.TabIndex = 3;
			// 
			// suggestedApplicationTextBox
			// 
			this.suggestedApplicationTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.allMediaBindingSource, "SuggestedApplication", true));
			this.suggestedApplicationTextBox.Location = new System.Drawing.Point(162, 88);
			this.suggestedApplicationTextBox.Name = "suggestedApplicationTextBox";
			this.suggestedApplicationTextBox.Size = new System.Drawing.Size(121, 22);
			this.suggestedApplicationTextBox.TabIndex = 5;
			// 
			// voiceCommandTextBox
			// 
			this.voiceCommandTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.allMediaBindingSource, "VoiceCommand", true));
			this.voiceCommandTextBox.Location = new System.Drawing.Point(162, 116);
			this.voiceCommandTextBox.Name = "voiceCommandTextBox";
			this.voiceCommandTextBox.Size = new System.Drawing.Size(121, 22);
			this.voiceCommandTextBox.TabIndex = 7;
			// 
			// panel1
			// 
			this.panel1.BackColor = System.Drawing.Color.AliceBlue;
			this.panel1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
			this.panel1.Controls.Add(this.lblMedium);
			this.panel1.Controls.Add(builtInTypeLabel);
			this.panel1.Controls.Add(this.builtInTypeComboBox);
			this.panel1.Controls.Add(this.voiceCommandTextBox);
			this.panel1.Controls.Add(nameLabel);
			this.panel1.Controls.Add(voiceCommandLabel);
			this.panel1.Controls.Add(this.nameTextBox);
			this.panel1.Controls.Add(this.suggestedApplicationTextBox);
			this.panel1.Controls.Add(suggestedApplicationLabel);
			this.panel1.Location = new System.Drawing.Point(3, 3);
			this.panel1.Name = "panel1";
			this.panel1.Size = new System.Drawing.Size(321, 145);
			this.panel1.TabIndex = 10;
			// 
			// lblMedium
			// 
			this.lblMedium.AutoSize = true;
			this.lblMedium.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblMedium.ForeColor = System.Drawing.Color.Blue;
			this.lblMedium.Location = new System.Drawing.Point(6, 6);
			this.lblMedium.Name = "lblMedium";
			this.lblMedium.Size = new System.Drawing.Size(63, 17);
			this.lblMedium.TabIndex = 11;
			this.lblMedium.Text = "Medium";
			// 
			// MediumPanel
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.panel1);
			this.Name = "MediumPanel";
			this.Size = new System.Drawing.Size(327, 151);
			((System.ComponentModel.ISupportInitialize) (this.allMediaBindingSource)).EndInit();
			this.panel1.ResumeLayout(false);
			this.panel1.PerformLayout();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.BindingSource allMediaBindingSource;
		private System.Windows.Forms.ComboBox builtInTypeComboBox;
		private System.Windows.Forms.TextBox nameTextBox;
		private System.Windows.Forms.TextBox suggestedApplicationTextBox;
		private System.Windows.Forms.TextBox voiceCommandTextBox;
		private System.Windows.Forms.Panel panel1;
		private System.Windows.Forms.Label lblMedium;
	}
}
