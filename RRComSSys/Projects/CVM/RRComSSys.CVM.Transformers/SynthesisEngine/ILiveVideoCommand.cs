using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public interface ILiveVideoCommand : IAPICommand
	{
		String[] Users { get; set; }
	}
}
