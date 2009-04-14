using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.UserInterface.Security;

namespace RRComSSys.CVM.UserInterface.CVMUI
{
    public partial class CVMLogin : Form
    {
        private Login login;

        public CVMLogin()
        {
            InitializeComponent();
            login = new Login();
        }

        private void LoginBtn_Click(object sender, EventArgs e)
        {
            if (!login.CheckCredentials(tbUsername.Text, tbPassword.Text))
                MessageBox.Show("Invalid credentials. Login failed!");
            else
            {
                tbPassword.Clear();
                tbUsername.Clear();
                this.DialogResult = DialogResult.OK;
            }
        }
    }
}
