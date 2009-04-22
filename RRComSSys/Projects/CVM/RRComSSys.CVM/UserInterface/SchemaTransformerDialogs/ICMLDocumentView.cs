using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.UserInterface.SchemaTransformerDialogs
{
	public interface ICMLDocumentView
	{
		bool Validate();
		void Reset();
		void Save();
	}
}
