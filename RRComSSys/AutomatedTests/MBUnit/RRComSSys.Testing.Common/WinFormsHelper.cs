using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RRComSSys.Testing.Common
{
	public static class WinFormsHelper
	{
		public static Control FindControl(this Control parent, Predicate<Control> predicate)
		{
			foreach (Control control in parent.Controls)
			{
				if (predicate(control))
					return control;
				if (control.Controls.Count != 0)
				{
					Control inner = control.FindControl(predicate);
					if (inner != null)
						return inner;
				}
			}
			return null;
		}
		public static List<Control> FindControls(this Control parent, Predicate<Control> predicate)
		{
			List<Control> results = new List<Control>();
			FindControls(parent, predicate, results);
			return results;
		}

		private static void FindControls(Control parent, Predicate<Control> predicate, List<Control> accumulator)
		{
			foreach (Control control in parent.Controls)
			{
				if (predicate(control))
					accumulator.Add(control);
				if (control.Controls.Count != 0)
					FindControls(control, predicate, accumulator);
			}
		}
	}
}
