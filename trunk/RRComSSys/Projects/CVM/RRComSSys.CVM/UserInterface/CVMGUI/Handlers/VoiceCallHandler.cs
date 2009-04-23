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
	public partial class VoiceCallHandler : UserControl, ICallHandler
	{
		private delegate void CallStatusHandler(Call call, TCallStatus status);

		public VoiceCallHandler()
		{
			InitializeComponent();
		}

		public void SetStatus(Call pCall, TCallStatus status)
		{
			lblStatus.Invoke(new CallStatusHandler(SetStatusImpl), pCall, status);
		}

		private void SetStatusImpl(Call call, TCallStatus status)
		{
			lblStatus.Text = status.ToString();
			lstParticipants.Items.Clear();
			foreach (Participant participant in call.Participants)
				lstParticipants.Items.Add(
					String.Format("{0} [{1}]", participant.DisplayName, participant.CallStatus));

		}
		public void Close()
		{
			this.Controls.Clear();
			this.Controls.Add(new Label() { Text = "Voice Call Command Failed!" });
		}

	}
}
