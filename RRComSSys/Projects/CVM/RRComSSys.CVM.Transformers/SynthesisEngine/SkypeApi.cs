using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public class SkypeAPI : AbstractAPI
	{
		public override ITransferFileCommand TransferFile
		{
			get { return new SkypeTransferFile(); }
		}

		public override IVoiceCallCommand VoiceCall
		{
			get { return new SkypeVoiceCall(); }
		}

		public override ILiveVideoCommand LiveVideo
		{
			get { return new SkypeLiveVideo(); }
		}

		public class SkypeTransferFile : ITransferFileCommand
		{
			public void Execute()
			{
				Console.WriteLine("Skype Transfer File");
			}

			public string FileName
			{
				get
				{
					throw new NotImplementedException();
				}
				set
				{
					throw new NotImplementedException();
				}
			}

			public string[] Users
			{
				get
				{
					throw new NotImplementedException();
				}
				set
				{
					throw new NotImplementedException();
				}
			}
		}

		public class SkypeVoiceCall : IVoiceCallCommand
		{
			public void Execute()
			{
				Console.WriteLine("Skype Voice Call");
			}


			public string[] Users
			{
				get
				{
					throw new NotImplementedException();
				}
				set
				{
					throw new NotImplementedException();
				}
			}
		}

		public class SkypeLiveVideo : ILiveVideoCommand
		{
			public void Execute()
			{
				Console.WriteLine("Skype Live Video");
			}

			public string[] Users
			{
				get
				{
					throw new NotImplementedException();
				}
				set
				{
					throw new NotImplementedException();
				}
			}
		}
	}
}
