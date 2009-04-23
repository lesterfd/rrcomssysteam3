using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Data;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using RRComSSys.CVM.Transformers.SynthesisEngine;
using SKYPE4COMLib;

namespace RRComSSys.CVM.UserInterface.CVMGUI.Handlers
{
	public partial class ChatHandler : UserControl, IChatHandler
	{
		private delegate void MessageReceivedHandler(ChatMessage message, TChatMessageStatus status);

		public ChatHandler()
		{
			InitializeComponent();
		}

		public event ChatMessageHandler  MessageSent;

		public void MessageReceived(ChatMessage message, TChatMessageStatus status)
		{
			this.Invoke(new MessageReceivedHandler(MessageReceivedImpl), message, status);
		}

		public void MessageReceivedImpl(ChatMessage message, TChatMessageStatus status)
		{
			if (status != TChatMessageStatus.cmsReceived)
				return;
			AppendMessage(message.FromDisplayName, message.Body);
		}

		public void InitializeUsers(String[] users)
		{
			foreach (String user in users)
			{
				ParticipantView view = new ParticipantView();
				view.Username = user;
				flpParticipants.Controls.Add(view);
			}
		}

		public void AppendMessage(String from, String message)
		{
			String msg = String.Format("{0}: {1}", from, message);
			if (messageBox.TextLength > 0)
				messageBox.AppendText("\n");

			messageBox.AppendText(msg);
			messageBox.SelectionStart =
			   messageBox.TextLength - msg.Length;
			messageBox.SelectionLength = msg.Length;
			messageBox.SelectionColor = Color.Black;
			messageBox.SelectionStart =
			   messageBox.TextLength;
			messageBox.Focus();

			this.messageTextBox.Focus();
		}

		private void sendButton_Click(object sender, EventArgs e)
		{
			AppendMessage("Me", this.messageTextBox.Text);
			if (MessageSent != null)
				MessageSent(this.messageTextBox.Text);
			this.messageTextBox.Text = String.Empty;
		}

		public void Close()
		{
			this.Controls.Clear();
			this.Controls.Add(new Label() { Text = "Voice Call Command Failed!" });
		}
	}
}
