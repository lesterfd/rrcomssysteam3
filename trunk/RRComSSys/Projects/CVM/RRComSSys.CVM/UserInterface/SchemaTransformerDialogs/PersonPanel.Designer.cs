namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	partial class PersonPanel
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
			System.Windows.Forms.Label nameLabel;
			System.Windows.Forms.Label roleLabel;
			this.iDTextBox = new System.Windows.Forms.TextBox();
			this.peopleBindingSource = new System.Windows.Forms.BindingSource(this.components);
			this.nameTextBox = new System.Windows.Forms.TextBox();
			this.roleTextBox = new System.Windows.Forms.TextBox();
			this.grpPerson = new System.Windows.Forms.GroupBox();
			iDLabel = new System.Windows.Forms.Label();
			nameLabel = new System.Windows.Forms.Label();
			roleLabel = new System.Windows.Forms.Label();
			((System.ComponentModel.ISupportInitialize) (this.peopleBindingSource)).BeginInit();
			this.grpPerson.SuspendLayout();
			this.SuspendLayout();
			// 
			// iDLabel
			// 
			iDLabel.AutoSize = true;
			iDLabel.Location = new System.Drawing.Point(6, 18);
			iDLabel.Name = "iDLabel";
			iDLabel.Size = new System.Drawing.Size(25, 17);
			iDLabel.TabIndex = 1;
			iDLabel.Text = "ID:";
			// 
			// nameLabel
			// 
			nameLabel.AutoSize = true;
			nameLabel.Location = new System.Drawing.Point(6, 46);
			nameLabel.Name = "nameLabel";
			nameLabel.Size = new System.Drawing.Size(49, 17);
			nameLabel.TabIndex = 3;
			nameLabel.Text = "Name:";
			// 
			// roleLabel
			// 
			roleLabel.AutoSize = true;
			roleLabel.Location = new System.Drawing.Point(6, 74);
			roleLabel.Name = "roleLabel";
			roleLabel.Size = new System.Drawing.Size(41, 17);
			roleLabel.TabIndex = 5;
			roleLabel.Text = "Role:";
			// 
			// iDTextBox
			// 
			this.iDTextBox.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.iDTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.peopleBindingSource, "ID", true));
			this.iDTextBox.Location = new System.Drawing.Point(61, 15);
			this.iDTextBox.Name = "iDTextBox";
			this.iDTextBox.Size = new System.Drawing.Size(113, 22);
			this.iDTextBox.TabIndex = 2;
			// 
			// peopleBindingSource
			// 
			this.peopleBindingSource.AllowNew = false;
			this.peopleBindingSource.DataSource = typeof(RRComSSys.CVM.ObjectModel.XCMLModel.Person);
			// 
			// nameTextBox
			// 
			this.nameTextBox.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.nameTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.peopleBindingSource, "Name", true));
			this.nameTextBox.Location = new System.Drawing.Point(61, 43);
			this.nameTextBox.Name = "nameTextBox";
			this.nameTextBox.Size = new System.Drawing.Size(113, 22);
			this.nameTextBox.TabIndex = 4;
			// 
			// roleTextBox
			// 
			this.roleTextBox.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.roleTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.peopleBindingSource, "Role", true));
			this.roleTextBox.Location = new System.Drawing.Point(61, 71);
			this.roleTextBox.Name = "roleTextBox";
			this.roleTextBox.Size = new System.Drawing.Size(113, 22);
			this.roleTextBox.TabIndex = 6;
			// 
			// grpPerson
			// 
			this.grpPerson.Controls.Add(iDLabel);
			this.grpPerson.Controls.Add(this.roleTextBox);
			this.grpPerson.Controls.Add(this.iDTextBox);
			this.grpPerson.Controls.Add(roleLabel);
			this.grpPerson.Controls.Add(nameLabel);
			this.grpPerson.Controls.Add(this.nameTextBox);
			this.grpPerson.Location = new System.Drawing.Point(3, 3);
			this.grpPerson.Name = "grpPerson";
			this.grpPerson.Size = new System.Drawing.Size(200, 101);
			this.grpPerson.TabIndex = 7;
			this.grpPerson.TabStop = false;
			this.grpPerson.Text = "Person";
			// 
			// PersonPanel
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.grpPerson);
			this.Name = "PersonPanel";
			this.Size = new System.Drawing.Size(206, 107);
			((System.ComponentModel.ISupportInitialize) (this.peopleBindingSource)).EndInit();
			this.grpPerson.ResumeLayout(false);
			this.grpPerson.PerformLayout();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.BindingSource peopleBindingSource;
		private System.Windows.Forms.TextBox iDTextBox;
		private System.Windows.Forms.TextBox nameTextBox;
		private System.Windows.Forms.TextBox roleTextBox;
		private System.Windows.Forms.GroupBox grpPerson;
	}
}
