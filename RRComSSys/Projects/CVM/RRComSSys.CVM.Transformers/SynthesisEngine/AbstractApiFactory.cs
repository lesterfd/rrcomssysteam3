using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CMVE.SynthesisEngine
{
	public abstract class AbstractApiFactory
	{
		public abstract AbstractAPI API { get; }
	}
}
