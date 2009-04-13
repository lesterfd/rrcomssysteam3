using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	public partial class BaseXCMLView : UserControl, IXCMLView
	{
		#region Member Variables
		private List<Control> _requiredFields = new List<Control>();
		private BindingSource _bindingSource = null;
		#endregion

		#region Constructors & Initializers
		public BaseXCMLView()
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
				_bindingSource.BindingComplete += new BindingCompleteEventHandler(BindingSource_BindingComplete);
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

		public void Save(out bool cancel)
		{
			cancel = ValidateRequiredFields();
			if (!cancel)
				_bindingSource.EndEdit();
		}

		public void Reset()
		{
			_bindingSource.ResetBindings(false);
			ValidateRequiredFields();
		}

		public void Cancel()
		{
			_bindingSource.CancelEdit();
		}

		#endregion

		#region Private Methods
		protected virtual void BindingSource_BindingComplete(object sender, BindingCompleteEventArgs e)
		{
			ValidateRequiredFields();
		}

		private bool ValidateRequiredFields()
		{
			bool hasInvalid = false;
			foreach (Control control in _requiredFields)
				if ((control is TextBox && String.IsNullOrEmpty(control.Text)) ||
					(control is ComboBox && String.IsNullOrEmpty((control as ComboBox).SelectedText)))
				{
					control.SetError(_errorProvider, "Required Field");
					hasInvalid = true;
				}
				else
					control.ClearError(_errorProvider);
			return hasInvalid;
		}
		#endregion
	}
}
