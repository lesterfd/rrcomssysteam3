using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public interface ICMLDocumentView
	{
		bool Validate();
		void Reset();
		void Save();
	}
}
