namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	partial class MediumPanel
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
			this.grpMedium = new System.Windows.Forms.GroupBox();
			this.builtInTypeComboBox = new System.Windows.Forms.ComboBox();
			this.nameTextBox = new System.Windows.Forms.TextBox();
			this.suggestedApplicationTextBox = new System.Windows.Forms.TextBox();
			this.voiceCommandTextBox = new System.Windows.Forms.TextBox();
			builtInTypeLabel = new System.Windows.Forms.Label();
			nameLabel = new System.Windows.Forms.Label();
			suggestedApplicationLabel = new System.Windows.Forms.Label();
			voiceCommandLabel = new System.Windows.Forms.Label();
			((System.ComponentModel.ISupportInitialize) (this.allMediaBindingSource)).BeginInit();
			this.grpMedium.SuspendLayout();
			this.SuspendLayout();
			// 
			// builtInTypeLabel
			// 
			builtInTypeLabel.AutoSize = true;
			builtInTypeLabel.Location = new System.Drawing.Point(6, 18);
			builtInTypeLabel.Name = "builtInTypeLabel";
			builtInTypeLabel.Size = new System.Drawing.Size(90, 17);
			builtInTypeLabel.TabIndex = 0;
			builtInTypeLabel.Text = "Built In Type:";
			// 
			// nameLabel
			// 
			nameLabel.AutoSize = true;
			nameLabel.Location = new System.Drawing.Point(6, 49);
			nameLabel.Name = "nameLabel";
			nameLabel.Size = new System.Drawing.Size(49, 17);
			nameLabel.TabIndex = 2;
			nameLabel.Text = "Name:";
			// 
			// suggestedApplicationLabel
			// 
			suggestedApplicationLabel.AutoSize = true;
			suggestedApplicationLabel.Location = new System.Drawing.Point(6, 77);
			suggestedApplicationLabel.Name = "suggestedApplicationLabel";
			suggestedApplicationLabel.Size = new System.Drawing.Size(153, 17);
			suggestedApplicationLabel.TabIndex = 4;
			suggestedApplicationLabel.Text = "Suggested Application:";
			// 
			// voiceCommandLabel
			// 
			voiceCommandLabel.AutoSize = true;
			voiceCommandLabel.Location = new System.Drawing.Point(6, 105);
			voiceCommandLabel.Name = "voiceCommandLabel";
			voiceCommandLabel.Size = new System.Drawing.Size(114, 17);
			voiceCommandLabel.TabIndex = 6;
			voiceCommandLabel.Text = "Voice Command:";
			// 
			// allMediaBindingSource
			// 
			this.allMediaBindingSource.DataSource = typeof(RRComSSys.CVM.ObjectModel.XCMLModel.Medium);
			// 
			// grpMedium
			// 
			this.grpMedium.Controls.Add(builtInTypeLabel);
			this.grpMedium.Controls.Add(this.builtInTypeComboBox);
			this.grpMedium.Controls.Add(nameLabel);
			this.grpMedium.Controls.Add(this.nameTextBox);
			this.grpMedium.Controls.Add(suggestedApplicationLabel);
			this.grpMedium.Controls.Add(this.suggestedApplicationTextBox);
			this.grpMedium.Controls.Add(voiceCommandLabel);
			this.grpMedium.Controls.Add(this.voiceCommandTextBox);
			this.grpMedium.Location = new System.Drawing.Point(3, 3);
			this.grpMedium.Name = "grpMedium";
			this.grpMedium.Size = new System.Drawing.Size(321, 134);
			this.grpMedium.TabIndex = 9;
			this.grpMedium.TabStop = false;
			this.grpMedium.Text = "Medium";
			// 
			// builtInTypeComboBox
			// 
			this.builtInTypeComboBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.allMediaBindingSource, "BuiltInType", true));
			this.builtInTypeComboBox.FormattingEnabled = true;
			this.builtInTypeComboBox.Location = new System.Drawing.Point(165, 15);
			this.builtInTypeComboBox.Name = "builtInTypeComboBox";
			this.builtInTypeComboBox.Size = new System.Drawing.Size(121, 24);
			this.builtInTypeComboBox.TabIndex = 1;
			// 
			// nameTextBox
			// 
			this.nameTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.allMediaBindingSource, "Name", true));
			this.nameTextBox.Location = new System.Drawing.Point(165, 46);
			this.nameTextBox.Name = "nameTextBox";
			this.nameTextBox.Size = new System.Drawing.Size(121, 22);
			this.nameTextBox.TabIndex = 3;
			// 
			// suggestedApplicationTextBox
			// 
			this.suggestedApplicationTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.allMediaBindingSource, "SuggestedApplication", true));
			this.suggestedApplicationTextBox.Location = new System.Drawing.Point(165, 74);
			this.suggestedApplicationTextBox.Name = "suggestedApplicationTextBox";
			this.suggestedApplicationTextBox.Size = new System.Drawing.Size(121, 22);
			this.suggestedApplicationTextBox.TabIndex = 5;
			// 
			// voiceCommandTextBox
			// 
			this.voiceCommandTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.allMediaBindingSource, "VoiceCommand", true));
			this.voiceCommandTextBox.Location = new System.Drawing.Point(165, 102);
			this.voiceCommandTextBox.Name = "voiceCommandTextBox";
			this.voiceCommandTextBox.Size = new System.Drawing.Size(121, 22);
			this.voiceCommandTextBox.TabIndex = 7;
			// 
			// MediumPanel
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.Controls.Add(this.grpMedium);
			this.Name = "MediumPanel";
			this.Size = new System.Drawing.Size(332, 143);
			((System.ComponentModel.ISupportInitialize) (this.allMediaBindingSource)).EndInit();
			this.grpMedium.ResumeLayout(false);
			this.grpMedium.PerformLayout();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.BindingSource allMediaBindingSource;
		private System.Windows.Forms.GroupBox grpMedium;
		private System.Windows.Forms.ComboBox builtInTypeComboBox;
		private System.Windows.Forms.TextBox nameTextBox;
		private System.Windows.Forms.TextBox suggestedApplicationTextBox;
		private System.Windows.Forms.TextBox voiceCommandTextBox;
	}
}
