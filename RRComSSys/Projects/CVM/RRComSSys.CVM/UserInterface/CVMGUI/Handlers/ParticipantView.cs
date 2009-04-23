using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RRComSSys.CVM.UserInterface.CVMGUI.Handlers
{
	public partial class ParticipantView : UserControl
	{
		public ParticipantView()
		{
			InitializeComponent();
		}

		public String Username
		{
			get { return lblName.Text; }
			set { lblName.Text = value; }
		}

		public String Status
		{
			get { return lblCallStatus.Text; }
			set { lblCallStatus.Text = value; }
		}
	}
}
