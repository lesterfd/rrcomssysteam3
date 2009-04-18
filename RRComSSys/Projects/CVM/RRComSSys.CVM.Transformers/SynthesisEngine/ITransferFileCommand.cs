using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public interface ITransferFileCommand : IAPICommand
	{
		String FileName { get; set; }
		String[] Users { get; set; }
	}
}
