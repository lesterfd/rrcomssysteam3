using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CMVE.SynthesisEngine
{
	public class SkypeAPI : AbstractAPI
	{
		#region ICommunicationAPI Members

		public override IAPICommand TransferFile()
		{
			return new SkypeTransferFile();
		}

		public override IAPICommand VoiceCall()
		{
			return new SkypeVoiceCall();
		}

		#endregion

		public class SkypeTransferFile : IAPICommand
		{

			#region IAPICommand Members

			public void Execute()
			{
				Console.WriteLine("Skype Transfer File");
			}

			#endregion
		}

		public class SkypeVoiceCall : IAPICommand
		{

			#region IAPICommand Members

			public void Execute()
			{
				Console.WriteLine("Skype Voice Call");
			}

			#endregion
		}
	}
}
