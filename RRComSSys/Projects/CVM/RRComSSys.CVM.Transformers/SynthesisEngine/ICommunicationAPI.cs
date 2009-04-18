using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.CVM.Transformers.SynthesisEngine;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public interface ICommunicationAPI
	{
		ITransferFileCommand TransferFile { get; }
		ILiveVideoCommand LiveVideo { get; }
		IVoiceCallCommand VoiceCall { get; }
	}
}
