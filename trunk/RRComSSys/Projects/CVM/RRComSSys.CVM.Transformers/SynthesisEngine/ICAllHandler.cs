using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SKYPE4COMLib;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{

	public interface ICallHandler
	{
		void SetStatus(Call pCall, TCallStatus status);
	}
}
