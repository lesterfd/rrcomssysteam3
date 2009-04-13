using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	public interface IXCMLView
	{
		Object DataSource { get; set; }
		void Save(out bool cancel);
		void Reset();
		void Cancel();
	}
}
