using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public partial class BaseCMLView : UserControl, IBoundView
	{
		#region Member Variables
		private List<Control> _requiredFields = new List<Control>();
		private BindingSource _bindingSource = null;
		#endregion

		#region Constructors & Initializers
		public BaseCMLView()
		{
			InitializeComponent();
		}
		#endregion

		#region Properties

		public virtual object DataSource
		{
			get { return _bindingSource.DataSource; }
			set
			{
				_bindingSource.DataSource = value;
			}
		}

		protected List<Control> RequiredFields
		{
			get { return _requiredFields; }
		}

		protected BindingSource BindingSource
		{
			get { return _bindingSource; }
			set { _bindingSource = value; }
		}

		#endregion

		#region Public Methods

		public void Save()
		{
			_bindingSource.EndEdit();
		}

		public void Reset()
		{
			_bindingSource.CancelEdit();
			ValidateRequiredFields();
		}

		#endregion

		#region Private Methods
		public virtual bool ValidateRequiredFields()
		{
			bool isValid = true;
			foreach (Control control in _requiredFields)
				if (IsBlank(control))
				{
					control.ClearError(_errorProvider);
					control.SetError(_errorProvider, "Required Field");
					isValid = false;
				}
				else
					control.ClearError(_errorProvider);
			return isValid;
		}

		private bool IsBlank(Control control)
		{
			if (control is TextBox)
			{
				TextBox txt = control as TextBox;
				String text = txt.Text ?? "";
				return String.IsNullOrEmpty(text.Trim());
			}
			else if (control is ComboBox)
			{
				ComboBox cbo = control as ComboBox;
				String text = cbo.Text ?? "";
				return String.IsNullOrEmpty(text.Trim());
			}
			else
				return false;
		}
		#endregion
	}
}
