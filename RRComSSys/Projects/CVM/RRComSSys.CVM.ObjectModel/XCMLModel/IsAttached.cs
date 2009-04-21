using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public class IsAttached : IXCMLItem
	{
		#region Member Variables
		private String _personID = "";
		private String _deviceID = "";
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "personID")]
		public String PersonID
		{
			get { return _personID; }
			set { _personID = value; }
		}

		[XmlAttribute(AttributeName = "deviceID")]
		public String DeviceID
		{
			get { return _deviceID; }
			set { _deviceID = value; }
		}
		#endregion
	}
}
