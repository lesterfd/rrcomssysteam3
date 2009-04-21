using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SKYPE4COMLib;
using System.IO;
using System.Diagnostics;

namespace RRComSSys.CVM.Transformers.SynthesisEngine.SkypeAPI
{
	public class SkypeAPI : AbstractAPI
	{
		#region Member Variables

		private Skype _skype;
		private Call _Call;
		private Chat _Chat;

		#endregion

		#region Constructors & Initializers

		public SkypeAPI()
		{
			_skype = new SkypeClass();

		}

		#endregion

		#region Properties
		public Skype SkypeLib
		{
			get
			{
				if (_skype == null)
					_skype = new SkypeClass();
				return _skype;
			}
		}

		public override ITransferFileCommand TransferFile
		{
			get { return new SkypeTransferFile(this); }
		}

		public override IChatCommand TextChat
		{
			get { return new SkypeTextChat(this); }
		}
		public override IVoiceCallCommand VoiceCall
		{
			get { return new SkypeVoiceCall(this); }
		}

		public override ILiveVideoCommand LiveVideo
		{
			get { return new SkypeLiveVideo(this); }
		}

		#endregion

		#region Commands
		public class SkypeTextChat : IChatCommand
		{
			#region Member Variables
			private SkypeAPI _skypeAPI;
			private String _TextMessage;
			private String[] _Users;
			private IChatHandler _handler;
			#endregion

			#region Constructors & Initializers
			public SkypeTextChat(SkypeAPI skypeapi)
			{
				this._skypeAPI = skypeapi;
			}
			#endregion

			#region Properties
			public String[] Users
			{
				get { return this._Users; }
				set {_Users = value; }
			}

			public String TextMessage
			{
				get { return this._TextMessage; }
				set { this._TextMessage = value; }
			}

			public IChatHandler Handler
			{
				get { return _handler; }
				set { _handler = value; }
			}
			#endregion

			public void Execute()
			{
				bool success = true;
				foreach (String username in _Users)
				{
					if (String.IsNullOrEmpty(username))
						continue;
					User user = _skypeAPI._skype.get_User(username);

					if (user.OnlineStatus == TOnlineStatus.olsOffline)
					{
						success = false; break;
					}
				}
				if (!success)
					throw new CommunicationException("Cannot establish chat. One or more of the users are unavailable");

				// Create channel
				if (_Users.Length == 1)
					this._skypeAPI._Chat = this._skypeAPI._skype.CreateChatWith(this._Users[0]);
				else
				{
					UserCollectionClass users = new UserCollectionClass();
					foreach(String username in _Users)
						users.Add(_skypeAPI._skype.get_User(username));
					_skypeAPI._skype.CreateChatMultiple(users);
				}
				_skypeAPI._skype.MessageStatus += new _ISkypeEvents_MessageStatusEventHandler(
					delegate(ChatMessage msg, TChatMessageStatus status)
					{
						_handler.MessageReceived(msg, status);
					});

				// 
				if(!String.IsNullOrEmpty(_TextMessage))
					this._skypeAPI._Chat.SendMessage(this._TextMessage);
					

				Debug.WriteLine("Skype Text Chat");

			}
		}

		public class SkypeTransferFile : ITransferFileCommand
		{
			#region Member Variables
			private string[] _users;
			private string _fileLocation;
			private string _fileTransferStatus;
			private SkypeAPI _skypeAPI;
			private IFileTransferHandler _handler;
			#endregion

			#region Constructors & Initializers
			public SkypeTransferFile(SkypeAPI skypeapi)
			{
				this._skypeAPI = skypeapi;
				((_ISkypeEvents_Event) _skypeAPI.SkypeLib).FileTransferStatusChanged += new _ISkypeEvents_FileTransferStatusChangedEventHandler(SkypeTransferFile_FileTransferStatusChanged);
			}
			#endregion

			#region Properties

			public String FileLocation
			{
				get { return _fileLocation; }
				set { _fileLocation = value; }
			}

			public String[] Users
			{
				get { return this._users; }
				set { this._users = value; }
			}

			public IFileTransferHandler Handler
			{
				get { return _handler; }
				set { _handler = value; }
			}

			#endregion

			protected void SkypeTransferFile_FileTransferStatusChanged(IFileTransfer pTransfer, TFileTransferStatus Status)
			{
				_handler.SetStatus(pTransfer, Status);
			}

			public void Execute()
			{
				FileInfo file = new FileInfo(_fileLocation);
				for (int i = 0; i < this._users.Length; i++)
				{
					this._skypeAPI._skype.Client.OpenFileTransferDialog(_users[i], file.DirectoryName + "\\");
					Console.WriteLine("Skype File Transfer");
				}
			}
		}

		public class SkypeVoiceCall : IVoiceCallCommand
		{
			#region Member Variables

			private SkypeAPI _skypeAPI;
			private String[] _Users = new String[4] { "", "", "", "" };
			private bool _conference;
			private string CallStatus;
			private ICallHandler _handler;

			#endregion

			public SkypeVoiceCall(SkypeAPI skypeapi)
			{
				this._skypeAPI = skypeapi;
				this._skypeAPI.SkypeLib.CallStatus += new _ISkypeEvents_CallStatusEventHandler(SkypeVoiceCall_CallStatus);
			}

			#region Properties
			public String[] Users
			{
				get { return this._Users; }
				set
				{
					for (int i = 0; i < value.Length && i < 4; i++)
					{
						this._Users[i] = value[i];
					}
				}

			}

			public ICallHandler Handler
			{
				get { return _handler; }
				set { _handler = value; }
			}
			#endregion

			protected void SkypeVoiceCall_CallStatus(Call pCall, TCallStatus Status)
			{
				_handler.SetStatus(pCall, Status);
			}


			public void Execute()
			{
				bool success = true;
				foreach(String username in _Users)
				{
					if (String.IsNullOrEmpty(username))
						continue;
					User user = _skypeAPI._skype.get_User(username);

					if (user.OnlineStatus == TOnlineStatus.olsOffline)
					{
						success = false; break;
					}
				}

				if (success)
					this._skypeAPI._Call = this._skypeAPI._skype.PlaceCall(this._Users[0], this._Users[1], this._Users[2], this._Users[3]);
				else
					throw new CommunicationException("Cannot establish voice call with users. One or more of the users is not available.");
				//if (this._conference == false)
				//    this._skypeAPI._Call = this._skypeAPI._skype.PlaceCall(this._Users[0], this._Users[1], this._Users[2], this._Users[3]);
				//else
				//    this._skypeAPI._Call = this._skypeAPI._skype.PlaceCall(this._Users[0], "", "", "");
				Console.WriteLine("Skype Voice Call");
			}
		}

		public class SkypeLiveVideo : ILiveVideoCommand
		{
			private SkypeAPI _skypeAPI;
			private String[] _Users = new String[4] { "", "", "", "" };
			//private bool _conference;
			private string VideoStatus;
			public SkypeLiveVideo(SkypeAPI skypeapi)
			{
				this._skypeAPI = skypeapi;
				this._skypeAPI._skype.CallVideoStatusChanged += new _ISkypeEvents_CallVideoStatusChangedEventHandler(_skype_CallVideoStatusChanged);

			}

			void _skype_CallVideoStatusChanged(Call pCall, TCallVideoStatus Status)
			{
				this.VideoStatus = Status.ToString();
			}
			public String[] Users
			{
				get { return this._Users; }
				set
				{
					for (int i = 0; i < value.Length && i < 4; i++)
					{
						this._Users[i] = value[i];
					}
				}
			}
			public void Execute()
			{
				if (this._skypeAPI._Call == null)
					this._skypeAPI._Call.StartVideoSend();
				Console.WriteLine("Skype Live Video");
			}

		}
		#endregion

		public override IEndCallCommand EndCall
		{
			get { throw new NotImplementedException(); }
		}
	}
}
