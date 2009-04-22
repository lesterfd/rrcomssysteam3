using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RRComSSys.Testing.Common
{
	public static class WinFormsHelper
	{
		#region Find Control Extensions
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

		public static TControl FindControl<TControl>(this Control parent, Predicate<TControl> predicate)
			where TControl : Control
		{
			foreach (Control control in parent.Controls)
			{
				if (control.GetType() != typeof(TControl) ||
					!control.GetType().IsSubclassOf(typeof(TControl)))
					continue;
				if (predicate((TControl) control))
					return (TControl) control;
				if (control.Controls.Count != 0)
				{
					TControl inner = control.FindControl<TControl>(predicate);
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

		public static List<TControl> FindControls<TControl>(this Control parent, Predicate<TControl> predicate)
			where TControl : Control
		{
			List<TControl> results = new List<TControl>();
			FindControls<TControl>(parent, predicate, results);
			return results;
		}

		private static void FindControls<TControl>(Control parent, Predicate<TControl> predicate, List<TControl> accumulator)
			where TControl : Control
		{
			foreach (Control control in parent.Controls)
			{
				if (control.GetType() != typeof(TControl) ||
					!control.GetType().IsSubclassOf(typeof(TControl)))
					continue;
				if (predicate((TControl)control))
					accumulator.Add((TControl) control);
				if (control.Controls.Count != 0)
					FindControls(control, predicate, accumulator);
			}
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
		#endregion

		#region Assert Extensions
		public static bool Exists<TControl>(this Control parent, Predicate<TControl> predicate)
			where TControl : Control
		{
			return parent.FindControl<TControl>(predicate) != null;
		}
		#endregion
	}
}
