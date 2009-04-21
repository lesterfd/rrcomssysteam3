using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public class Medium : IXCMLItem
	{
		#region Member Variables
		private String _name = "";
		private String _suggestedApplication = "";
		private String _voiceCommand = "";
		private CapabilityType _capabilityType = CapabilityType.Text;
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "mediumTypeName")]
		public String Name
		{
			get { return _name; }
			set { _name = value; }
		}

		[XmlAttribute(AttributeName = "suggestedApplication")]
		public String SuggestedApplication
		{
			get { return _suggestedApplication; }
			set { _suggestedApplication = value; }
		}

		[XmlAttribute(AttributeName = "voiceCommand")]
		public String VoiceCommand
		{
			get { return _voiceCommand; }
			set { _voiceCommand = value; }
		}

		[XmlAttribute(AttributeName = "derivedFromBuiltInType")]
		public CapabilityType BuiltInType
		{
			get { return _capabilityType; }
			set { _capabilityType = value; }
		}
		#endregion
	}
}
