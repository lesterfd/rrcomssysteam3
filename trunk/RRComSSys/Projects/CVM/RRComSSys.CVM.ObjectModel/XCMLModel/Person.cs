using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public class Person : IXCMLItem
	{
		#region Member Variables
		private String _name;
		private String _id;
		private String _role;
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "personName")]
		public String Name
		{
			get { return _name; }
			set { _name = value; }
		}

		[XmlAttribute(AttributeName = "personID")]
		public String ID
		{
			get { return _id; }
			set { _id = value; }
		}

		[XmlAttribute(AttributeName = "personRole")]
		public String Role
		{
			get { return _role; }
			set { _role = value; }
		}
		#endregion
	}
}
