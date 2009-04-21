using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using RRComSSys.CVM.UI.Security;

namespace RRComSSys.CVM.UI
{
	/// <summary>
	/// Interaction logic for Window1.xaml
	/// </summary>
	public partial class Login : Window
	{
		private SecurityManager _login = new SecurityManager();

		public Login()
		{
			InitializeComponent();
		}

		private void btnLogin_Click(object sender, RoutedEventArgs e)
		{
			if (!_login.CheckCredentials(txtUsername.Text, txtPassword.Password))
				MessageBox.Show("Invalid credentials. Login failed!");
			else
			{
				txtPassword.Clear();
				txtUsername.Clear();
				this.DialogResult = true;
				this.Close();
			}
		}

		private void btnCancel_Click(object sender, RoutedEventArgs e)
		{
			this.DialogResult = false;
			this.Close();
		}
	}
}
