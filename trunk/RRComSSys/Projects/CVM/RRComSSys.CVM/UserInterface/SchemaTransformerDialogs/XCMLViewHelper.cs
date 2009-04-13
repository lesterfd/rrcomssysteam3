using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Drawing;

namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	public static class XCMLViewHelper
	{
		public static void SetError(this Control control, ErrorProvider errorProvider, String message)
		{
			control.BackColor = Color.Bisque;
			errorProvider.SetIconPadding(control, 5);
			errorProvider.SetError(control, message);
		}

		public static void ClearError(this Control control, ErrorProvider errorProvider)
		{
			control.BackColor = SystemColors.Window;
			errorProvider.SetError(control, null);
		}
	}
}
