using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.CVM.Transformers.SynthesisEngine;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public abstract class AbstractAPI : ICommunicationAPI
	{
		public abstract ITransferFileCommand TransferFile { get; }

		public abstract ILiveVideoCommand LiveVideo { get; }

		public abstract IVoiceCallCommand VoiceCall { get; }

		public abstract IChatCommand  TextChat { get; }

        public abstract IEndCallCommand EndCall { get; }


	}
}
