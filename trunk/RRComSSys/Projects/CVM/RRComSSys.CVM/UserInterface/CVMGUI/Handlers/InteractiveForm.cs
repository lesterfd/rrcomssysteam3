using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.Transformers.SynthesisEngine.SkypeAPI;
using RRComSSys.CVM.Transformers.SynthesisEngine;
using SKYPE4COMLib;
using RRComSSys.CVM.Properties;
namespace RRComSSys.CVM.UserInterface.CVMGUI.Handlers
{
    public partial class InteractiveForm : Form
    {
        private IChatCommand command = new SkypeApiFactory().API.TextChat;
        public delegate void ChatDelegate();
        public InteractiveForm()
        {
            InitializeComponent();

            command = new SkypeApiFactory().API.TextChat;
            command.Users = new String[] { "msan001" };
            command.Handler = new ChatHandler();
            command.TextMessage = "Yooooooooooooo";
            command.Execute();
            
        }

        private void InteractiveForm_Load(object sender, EventArgs e)
        {

        }
        public class ChatHandler : IChatHandler
        {
			public event ChatMessageHandler MessageSent;
            public void MessageReceived(ChatMessage message, TChatMessageStatus status)
            {
               // if (status == TChatMessageStatus.cmsReceived)
                
            }	
		}
        private void makeCallButton_Click(object sender, EventArgs e)
        {
        }
        private void LogMessage(string message, Color colour,RichTextBox  messageBox)
        {
            
            if (messageBox.TextLength > 0)
                messageBox.AppendText("\n");

            messageBox.AppendText(message);
            messageBox.SelectionStart =
               messageBox.TextLength - message.Length;
            messageBox.SelectionLength = message.Length;
            messageBox.SelectionColor = colour;
            messageBox.SelectionStart =
               messageBox.TextLength;
            messageBox.Focus();

            this.messageTextBox.Focus();
            this.messageTextBox.Text = String.Empty;
        }

        private void sendButton_Click(object sender, EventArgs e)
        {
          //  ((SkypeTextChat)command).
           
        }

      
    }
}
