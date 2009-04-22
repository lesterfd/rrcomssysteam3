using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public interface IBoundView
	{
		Object DataSource { get; set; }
		void Save();
		void Reset();
		bool ValidateRequiredFields();
	}
}
