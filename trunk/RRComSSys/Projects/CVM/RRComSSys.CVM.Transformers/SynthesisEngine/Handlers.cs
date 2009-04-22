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

	public interface IChatHandler
	{
		void MessageReceived(ChatMessage message, TChatMessageStatus status);
	}

	public interface IFileTransferHandler
	{
		void SetStatus(IFileTransfer fileTransfer, TFileTransferStatus status);
	}
}
