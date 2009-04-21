using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using SKYPE4COMLib;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class SkypeAPI : AbstractAPI
    {

        private Skype _skype;
        private Call _Call;
        private Chat _Chat;

        //private string[] _Users = new String[4] { "", "", "", "" };

        //private string _aUser;
        public SkypeAPI()
        {
            _skype = new SkypeClass();

        }
        public Skype skype
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
        public class SkypeTextChat : IChatCommand
        {
            private SkypeAPI _skypeAPI;
            private String _TextMessage;
            private String[] _Users = new String[4] { "", "", "", "" };
            
            //  private bool _conference;
            //private string ChatStatus;
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
            public String TextMessage
            {
                get { return this._TextMessage; }
                set
                {
                    this._TextMessage = value;   
                }

            }

            public SkypeTextChat(SkypeAPI skypeapi)
            {
                this._skypeAPI = skypeapi;
                // this._skypeAPI._skype
            }

          


            public void Execute()
            {

                if (this._TextMessage==null || this.TextMessage=="")
                this._skypeAPI._Chat = this._skypeAPI._skype.CreateChatWith(this._TextMessage);
                Console.WriteLine("Skype Text Chat");

            }



        }


        public class SkypeTransferFile : ITransferFileCommand
        {

            private string[] _users;
            private string _fileLocation;
            private string _fileTransferStatus;
            //private _ISkypeEvents_FileTransferStatusChangedEventHandler i;

            private SkypeAPI _skypeAPI;
            public SkypeTransferFile(SkypeAPI skypeapi)
            {
                this._skypeAPI = skypeapi;
                ((_ISkypeEvents_Event)_skypeAPI).FileTransferStatusChanged += new _ISkypeEvents_FileTransferStatusChangedEventHandler(SkypeTransferFile_FileTransferStatusChanged);
            }
            void SkypeTransferFile_FileTransferStatusChanged(IFileTransfer pTransfer, TFileTransferStatus Status)
            {
                this._fileTransferStatus = Status.ToString();
            }

            public void setFileLocation(string files)
            {
                this._fileLocation = files;
            }

            public void Execute()
            {

                for (int i = 0; i < this._users.Length; i++)
                {

                    this._skypeAPI._skype.Client.OpenFileTransferDialog(_users[i], this._fileLocation);
                    Console.WriteLine("Skype File Transfer");
                }

            }
            //void OurFileTransferStatusChanged(IFileTransfer ifiletransfer, TFileTransferStatus status)
            //{
            //    this.label1.Text = status.ToString();
            //}

            public string FileLocation
            {
                get
                {
                    return _fileLocation;
                }
                set
                {
                    _fileLocation = value;
                }
            }

            public string[] Users
            {
                get
                {
                    return this._users;
                }
                set
                {
                    this._users = value;
                }
            }
        }

        public class SkypeVoiceCall : IVoiceCallCommand
        {
            private SkypeAPI _skypeAPI;
            private String[] _Users = new String[4] { "", "", "", "" };
            private bool _conference;
            private string CallStatus;
            private delegate void setstatus(Call pCall, TCallStatus Status);
            public delegate void setstatus (String s);
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

            public SkypeVoiceCall(SkypeAPI skypeapi)
            {
                this._skypeAPI = skypeapi;
                this._skypeAPI._skype.CallStatus += new _ISkypeEvents_CallStatusEventHandler(SkypeVoiceCall_CallStatus);
            }

            void SkypeVoiceCall_CallStatus(Call pCall, TCallStatus Status)
            {
                this.CallStatus = Status.ToString();
            }


            public void Execute()
            {

                if (this._conference ==false)
                    this._skypeAPI._Call=this._skypeAPI._skype.PlaceCall(this._Users[0], this._Users[1], this._Users[2], this._Users[3]);
                else
                    this._skypeAPI._Call = this._skypeAPI._skype.PlaceCall(this._Users[0],"","","");

                Console.WriteLine("Skype Voice Call");

            }


            public bool Conference
            {
                set { this._conference = value; }


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
                if (this._skypeAPI._Call ==null)
                    this._skypeAPI._Call.StartVideoSend();
                Console.WriteLine("Skype Live Video");
            }

        }
    }
}
