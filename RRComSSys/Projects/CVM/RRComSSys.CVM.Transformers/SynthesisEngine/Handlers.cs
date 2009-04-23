using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SKYPE4COMLib;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public delegate void ChatMessageHandler(String message);

	public interface ICallHandler
	{
		void SetStatus(Call pCall, TCallStatus status);
		void Close();
	}

	public interface IChatHandler
	{
		event ChatMessageHandler MessageSent;
		void MessageReceived(ChatMessage message, TChatMessageStatus status);
		void InitializeUsers(String[] users);
		void Close();
	}

	public interface IFileTransferHandler
	{
		void SetStatus(IFileTransfer fileTransfer, TFileTransferStatus status);
		void Close();
	}

	public interface IVideoHandler
	{
		void SetStatus(Call pCall, TCallVideoStatus Status);
	}
}
