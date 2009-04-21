using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public class Device : IXCMLItem
	{
		#region Member Variables
		private String _id = "";
		private bool _isLocal = false;
		private bool _isVirtual = false;
		private List<CapabilityType> _capabilitiesList = new List<CapabilityType>();
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "deviceID")]
		public String ID
		{
			get { return _id; }
			set { _id = value; }
		}

		[XmlAttribute(AttributeName = "isLocal")]
		public bool IsLocal
		{
			get { return _isLocal; }
			set { _isLocal = value; }
		}

		[XmlAttribute(AttributeName = "isVirtual")]
		public bool IsVirtual
		{
			get { return _isVirtual; }
			set { _isVirtual = value; }
		}

		[XmlElement(ElementName = "deviceCapability")]
		public List<CapabilityType> Capabilities
		{
			get { return _capabilitiesList; }
			set { _capabilitiesList = value; }
		}
		#endregion
	}
}
