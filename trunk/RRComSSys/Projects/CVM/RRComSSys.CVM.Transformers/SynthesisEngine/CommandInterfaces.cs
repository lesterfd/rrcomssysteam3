using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public interface IAPICommand
	{
		String[] Users { get; set; }
		void Execute();
	}

	public interface IChatCommand : IAPICommand
	{
		IChatHandler Handler { get; set; }
		String TextMessage { get; set; }
	}

	public interface ILiveVideoCommand : IAPICommand
	{
	}

	public interface ITransferFileCommand : IAPICommand
	{
		String FileLocation { get; set; }
		IFileTransferHandler Handler { get; set; }
	}

	public interface IVoiceCallCommand : IAPICommand
	{
		ICallHandler Handler { get; set; }
	}

	public interface IEndCallCommand : IAPICommand
	{
	}
}
