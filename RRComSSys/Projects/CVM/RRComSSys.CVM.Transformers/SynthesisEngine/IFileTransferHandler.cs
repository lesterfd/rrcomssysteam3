using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SKYPE4COMLib;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public interface IFileTransferHandler
	{
		void SetStatus(IFileTransfer fileTransfer, TFileTransferStatus status);
	}
}
