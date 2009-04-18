using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public abstract class AbstractApiFactory
	{
		public abstract AbstractAPI API { get; }
	}
}
