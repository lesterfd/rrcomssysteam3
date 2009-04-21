using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine.SkypeAPI
{
	public class SkypeApiFactory : AbstractApiFactory
	{
		public override AbstractAPI API
		{
			get
			{
				return new SkypeAPI();
			}
		}
	}
}
