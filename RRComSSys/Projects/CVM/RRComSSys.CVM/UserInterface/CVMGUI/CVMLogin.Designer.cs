﻿namespace RRComSSys.CVM.UserInterface.CVMUI
{
    partial class CVMLogin
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

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
			this.components = new System.ComponentModel.Container();
			System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(CVMLogin));
			this.LoginBtn = new System.Windows.Forms.Button();
			this.CancelBtn = new System.Windows.Forms.Button();
			this.lHeader = new System.Windows.Forms.Label();
			this.lText = new System.Windows.Forms.Label();
			this.pbImage = new System.Windows.Forms.PictureBox();
			this.lPassword = new System.Windows.Forms.Label();
			this.lUsername = new System.Windows.Forms.Label();
			this.errorProvider = new System.Windows.Forms.ErrorProvider(this.components);
			this.tbPassword = new System.Windows.Forms.TextBox();
			this.pHeader = new System.Windows.Forms.Panel();
			this.tbUsername = new System.Windows.Forms.TextBox();
			((System.ComponentModel.ISupportInitialize) (this.pbImage)).BeginInit();
			((System.ComponentModel.ISupportInitialize) (this.errorProvider)).BeginInit();
			this.pHeader.SuspendLayout();
			this.SuspendLayout();
			// 
			// LoginBtn
			// 
			this.LoginBtn.Location = new System.Drawing.Point(167, 190);
			this.LoginBtn.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
			this.LoginBtn.Name = "LoginBtn";
			this.LoginBtn.Size = new System.Drawing.Size(100, 28);
			this.LoginBtn.TabIndex = 2;
			this.LoginBtn.Text = "Login";
			this.LoginBtn.UseVisualStyleBackColor = true;
			this.LoginBtn.Click += new System.EventHandler(this.LoginBtn_Click);
			// 
			// CancelBtn
			// 
			this.CancelBtn.DialogResult = System.Windows.Forms.DialogResult.Cancel;
			this.CancelBtn.Location = new System.Drawing.Point(427, 190);
			this.CancelBtn.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
			this.CancelBtn.Name = "CancelBtn";
			this.CancelBtn.Size = new System.Drawing.Size(100, 28);
			this.CancelBtn.TabIndex = 3;
			this.CancelBtn.Text = "Cancel";
			this.CancelBtn.UseVisualStyleBackColor = true;
			// 
			// lHeader
			// 
			this.lHeader.Font = new System.Drawing.Font("Tahoma", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lHeader.Location = new System.Drawing.Point(13, 12);
			this.lHeader.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
			this.lHeader.Name = "lHeader";
			this.lHeader.Size = new System.Drawing.Size(480, 25);
			this.lHeader.TabIndex = 3;
			this.lHeader.Text = "Login";
			this.lHeader.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
			// 
			// lText
			// 
			this.lText.Location = new System.Drawing.Point(27, 37);
			this.lText.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
			this.lText.Name = "lText";
			this.lText.Size = new System.Drawing.Size(480, 25);
			this.lText.TabIndex = 4;
			this.lText.Text = "Please enter your Username and Password.";
			this.lText.TextAlign = System.Drawing.ContentAlignment.MiddleLeft;
			// 
			// pbImage
			// 
			this.pbImage.Image = ((System.Drawing.Image) (resources.GetObject("pbImage.Image")));
			this.pbImage.Location = new System.Drawing.Point(517, 6);
			this.pbImage.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
			this.pbImage.Name = "pbImage";
			this.pbImage.Size = new System.Drawing.Size(48, 48);
			this.pbImage.SizeMode = System.Windows.Forms.PictureBoxSizeMode.AutoSize;
			this.pbImage.TabIndex = 5;
			this.pbImage.TabStop = false;
			// 
			// lPassword
			// 
			this.lPassword.Font = new System.Drawing.Font("Tahoma", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lPassword.Location = new System.Drawing.Point(33, 145);
			this.lPassword.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
			this.lPassword.Name = "lPassword";
			this.lPassword.Size = new System.Drawing.Size(107, 25);
			this.lPassword.TabIndex = 17;
			this.lPassword.Text = "Password";
			this.lPassword.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
			// 
			// lUsername
			// 
			this.lUsername.Font = new System.Drawing.Font("Tahoma", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte) (0)));
			this.lUsername.Location = new System.Drawing.Point(33, 96);
			this.lUsername.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
			this.lUsername.Name = "lUsername";
			this.lUsername.Size = new System.Drawing.Size(107, 25);
			this.lUsername.TabIndex = 16;
			this.lUsername.Text = "Username";
			this.lUsername.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
			// 
			// errorProvider
			// 
			this.errorProvider.ContainerControl = this;
			// 
			// tbPassword
			// 
			this.tbPassword.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
			this.tbPassword.Location = new System.Drawing.Point(167, 145);
			this.tbPassword.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
			this.tbPassword.Name = "tbPassword";
			this.tbPassword.PasswordChar = '*';
			this.tbPassword.Size = new System.Drawing.Size(359, 22);
			this.tbPassword.TabIndex = 1;
			// 
			// pHeader
			// 
			this.pHeader.BackColor = System.Drawing.SystemColors.ActiveCaptionText;
			this.pHeader.Controls.Add(this.lHeader);
			this.pHeader.Controls.Add(this.lText);
			this.pHeader.Controls.Add(this.pbImage);
			this.pHeader.Dock = System.Windows.Forms.DockStyle.Top;
			this.pHeader.Location = new System.Drawing.Point(0, 0);
			this.pHeader.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
			this.pHeader.Name = "pHeader";
			this.pHeader.Size = new System.Drawing.Size(587, 74);
			this.pHeader.TabIndex = 14;
			// 
			// tbUsername
			// 
			this.tbUsername.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
			this.tbUsername.Location = new System.Drawing.Point(167, 96);
			this.tbUsername.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
			this.tbUsername.Name = "tbUsername";
			this.tbUsername.Size = new System.Drawing.Size(359, 22);
			this.tbUsername.TabIndex = 0;
			// 
			// CVMLogin
			// 
			this.AcceptButton = this.LoginBtn;
			this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.CancelButton = this.CancelBtn;
			this.ClientSize = new System.Drawing.Size(587, 246);
			this.Controls.Add(this.lPassword);
			this.Controls.Add(this.lUsername);
			this.Controls.Add(this.tbPassword);
			this.Controls.Add(this.pHeader);
			this.Controls.Add(this.tbUsername);
			this.Controls.Add(this.CancelBtn);
			this.Controls.Add(this.LoginBtn);
			this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedDialog;
			this.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
			this.Name = "CVMLogin";
			this.ShowInTaskbar = false;
			this.Text = "CVMLogin";
			((System.ComponentModel.ISupportInitialize) (this.pbImage)).EndInit();
			((System.ComponentModel.ISupportInitialize) (this.errorProvider)).EndInit();
			this.pHeader.ResumeLayout(false);
			this.pHeader.PerformLayout();
			this.ResumeLayout(false);
			this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button LoginBtn;
        private System.Windows.Forms.Button CancelBtn;
        private System.Windows.Forms.Label lHeader;
        private System.Windows.Forms.Label lText;
        private System.Windows.Forms.PictureBox pbImage;
        private System.Windows.Forms.Label lPassword;
        private System.Windows.Forms.Label lUsername;
        private System.Windows.Forms.ErrorProvider errorProvider;
        private System.Windows.Forms.TextBox tbPassword;
        private System.Windows.Forms.Panel pHeader;
        private System.Windows.Forms.TextBox tbUsername;
    }
}