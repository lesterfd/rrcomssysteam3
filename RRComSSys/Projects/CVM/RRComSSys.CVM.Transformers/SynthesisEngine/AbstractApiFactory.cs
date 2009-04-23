using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.CVM.Transformers.SynthesisEngine.SkypeAPI;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public abstract class AbstractApiFactory
	{

		public abstract AbstractAPI API { get; }


		public static AbstractApiFactory GetFactory(string factoryType)
		{
			switch (factoryType)
			{
				case "Skype":
					return new SkypeApiFactory();
				default:
					throw new NoSuchFactoryException();
			}
		}
	}
}
