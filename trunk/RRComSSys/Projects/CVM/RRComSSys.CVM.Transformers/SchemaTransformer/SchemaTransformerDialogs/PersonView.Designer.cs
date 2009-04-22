namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	partial class PersonView
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
			this.pnlPerson = new System.Windows.Forms.Panel();
			this.lblPerson = new System.Windows.Forms.Label();
			this.panel1 = new System.Windows.Forms.Panel();
			iDLabel = new System.Windows.Forms.Label();
			nameLabel = new System.Windows.Forms.Label();
			roleLabel = new System.Windows.Forms.Label();
			((System.ComponentModel.ISupportInitialize) (this.peopleBindingSource)).BeginInit();
			this.pnlPerson.SuspendLayout();
			this.SuspendLayout();
			// 
			// iDLabel
			// 
			iDLabel.AutoSize = true;
			iDLabel.Location = new System.Drawing.Point(3, 28);
			iDLabel.Name = "iDLabel";
			iDLabel.Size = new System.Drawing.Size(25, 17);
			iDLabel.TabIndex = 1;
			iDLabel.Text = "ID:";
			// 
			// nameLabel
			// 
			nameLabel.AutoSize = true;
			nameLabel.Location = new System.Drawing.Point(3, 56);
			nameLabel.Name = "nameLabel";
			nameLabel.Size = new System.Drawing.Size(49, 17);
			nameLabel.TabIndex = 3;
			nameLabel.Text = "Name:";
			// 
			// roleLabel
			// 
			roleLabel.AutoSize = true;
			roleLabel.Location = new System.Drawing.Point(3, 84);
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
			this.iDTextBox.Location = new System.Drawing.Point(58, 25);
			this.iDTextBox.Name = "iDTextBox";
			this.iDTextBox.ReadOnly = true;
			this.iDTextBox.Size = new System.Drawing.Size(109, 22);
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
			this.nameTextBox.Location = new System.Drawing.Point(58, 53);
			this.nameTextBox.Name = "nameTextBox";
			this.nameTextBox.Size = new System.Drawing.Size(109, 22);
			this.nameTextBox.TabIndex = 4;
			// 
			// roleTextBox
			// 
			this.roleTextBox.Anchor = ((System.Windows.Forms.AnchorStyles) (((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Left)
						| System.Windows.Forms.AnchorStyles.Right)));
			this.roleTextBox.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.peopleBindingSource, "Role", true));
			this.roleTextBox.Location = new System.Drawing.Point(58, 81);
			this.roleTextBox.Name = "roleTextBox";
			this.roleTextBox.Size = new System.Drawing.Size(109, 22);
			this.roleTextBox.TabIndex = 6;
			// 
			// pnlPerson
			// 
			this.pnlPerson.BackColor = System.Drawing.Color.AliceBlue;
			this.pnlPerson.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
			this.pnlPerson.Controls.Add(this.lblPerson);
			this.pnlPerson.Controls.Add(iDLabel);
			this.pnlPerson.Controls.Add(this.roleTextBox);
			this.pnlPerson.Controls.Add(this.nameTextBox);
			this.pnlPerson.Controls.Add(this.iDTextBox);
			this.pnlPerson.Controls.Add(nameLabel);
			this.pnlPerson.Controls.Add(roleLabel);
			this.pnlPerson.Location = new System.Drawing.Point(3, 3);
			this.pnlPerson.Name = "pnlPerson";
			this.pnlPerson.Size = new System.Drawing.Size(200, 114);
			this.pnlPerson.TabIndex = 8;
			// 
			// lblPerson
			// 
			this.lblPerson.AutoSize = true;
			this.lblPerson.Font = new System.Drawing.Font("Microsoft Sans Serif", 7.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lblPerson.ForeColor = System.Drawing.Color.Blue;
			this.lblPerson.Location = new System.Drawing.Point(6, 5);
			this.lblPerson.Name = "lblPerson";
			this.lblPerson.Size = new System.Drawing.Size(59, 17);
			this.lblPerson.TabIndex = 9;
			this.lblPerson.Text = "Person";
			// 
			// panel1
			// 
			this.panel1.Location = new System.Drawing.Point(3, 119);
			this.panel1.Name = "panel1";
			this.panel1.Size = new System.Drawing.Size(200, 101);
			this.panel1.TabIndex = 8;
			// 
			// PersonPanel
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.AutoSize = true;
			this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
			this.Controls.Add(this.pnlPerson);
			this.Name = "PersonPanel";
			this.Size = new System.Drawing.Size(206, 120);
			((System.ComponentModel.ISupportInitialize) (this.peopleBindingSource)).EndInit();
			this.pnlPerson.ResumeLayout(false);
			this.pnlPerson.PerformLayout();
			this.ResumeLayout(false);

		}

		#endregion

		private System.Windows.Forms.BindingSource peopleBindingSource;
		private System.Windows.Forms.TextBox iDTextBox;
		private System.Windows.Forms.TextBox nameTextBox;
		private System.Windows.Forms.TextBox roleTextBox;
		private System.Windows.Forms.Panel pnlPerson;
		private System.Windows.Forms.Label lblPerson;
		private System.Windows.Forms.Panel panel1;
	}
}
