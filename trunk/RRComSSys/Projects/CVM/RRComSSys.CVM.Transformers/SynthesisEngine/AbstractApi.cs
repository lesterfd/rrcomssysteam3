using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CMVE.SynthesisEngine
{
	public abstract class AbstractAPI : ICommunicationAPI
	{

		#region ICommunicationAPI Members

		public abstract IAPICommand TransferFile();

		public abstract IAPICommand VoiceCall();

		#endregion
	}
}
