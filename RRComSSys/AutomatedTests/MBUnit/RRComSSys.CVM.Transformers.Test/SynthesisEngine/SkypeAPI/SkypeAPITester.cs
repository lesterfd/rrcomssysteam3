using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.CVM.Transformers.SynthesisEngine;
using RRComSSys.CVM.Transformers.SynthesisEngine.SkypeAPI;
using System.IO;
using SKYPE4COMLib;
using System.Threading;
using System.Diagnostics;

namespace RRComSSys.CVM.Transformers.Test.SynthesisEngine.SkypeAPI
{
	[TestFixture]
	public class SkypeAPITester
	{
		[Test]
		public void Test_File_Transfer_Command()
		{
			String filePath = new FileInfo(@".\TestFiles\sample_gcml_01.gcml").FullName;
			ITransferFileCommand command = new SkypeApiFactory().API.TransferFile;
			command.FileLocation = filePath;
			command.Users = new String[] { "msan001" };
			command.Handler = new FileTransferHandler();
			command.Execute();
			Thread.Sleep(20000);
		}

		[Test]
		public void Test_Voice_Call_Single_Command()
		{
			IVoiceCallCommand command = new SkypeApiFactory().API.VoiceCall;
			command.Users = new String[] { "msan001" };
			command.Handler = new CallHandler();
			command.Execute();
			Thread.Sleep(20000);
		}

		[Test]
		public void Test_Voice_Conference_Call()
		{
			IVoiceCallCommand command = new SkypeApiFactory().API.VoiceCall;
			command.Users = new String[] { "msan001", "kuzuye" };
			command.Handler = new CallHandler();
			command.Execute();
			Thread.Sleep(20000);
		}

		[Test]
		[ExpectedException(typeof(CommunicationException))]
		public void Test_Voice_Conference_Fail()
		{
			IVoiceCallCommand command = new SkypeApiFactory().API.VoiceCall;
			command.Users = new String[] { "msan001", "kuzuye" };
			command.Handler = new CallHandler();
			command.Execute();
		}

		[Test]
		public void Test_Receive_Chat_Message()
		{
			IChatCommand command = new SkypeApiFactory().API.TextChat;
			command.Users = new String[] { "msan001"};
			command.Handler = new ChatHandler();
			command.TextMessage = "Yooooooooooooo";
			command.Execute();
			Thread.Sleep(15000);
		}

		public class FileTransferHandler : IFileTransferHandler
		{
			public void SetStatus(IFileTransfer fileTransfer, TFileTransferStatus status)
			{
				Debug.WriteLine(status.ToString());
			}
		}

		public class CallHandler : ICallHandler
		{
			public void SetStatus(Call pCall, TCallStatus status)
			{
				Debug.WriteLine(status.ToString());
			}
		}

		public class ChatHandler : IChatHandler
		{
			public void MessageReceived(ChatMessage message, TChatMessageStatus status)
			{
				if (status == TChatMessageStatus.cmsReceived)
					Debug.WriteLine(message.Body);
			}
		}
	}
}
