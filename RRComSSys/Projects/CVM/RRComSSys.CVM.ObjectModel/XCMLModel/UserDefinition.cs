using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public class UserDefinition : IXCMLItem
	{
		#region Member Variables
		public Device _device;
		#endregion

		#region Constructors & Initializers
		public UserDefinition() { }
		public UserDefinition(Person person, IsAttached isAttached, Device device)
		{
			this.Person = person;
			this.IsAttached = isAttached;
			this.Device = device;
		}
		#endregion

		#region Properties
		public Person Person { get; set; }
		public IsAttached IsAttached { get; set; }
		public Device Device
		{
			get { return _device; }
			set
			{
				_device = value;
				_device.UserDefinition = this;
			}
		}
		public bool IsLocal
		{
			get
			{
				if (this.Device == null) return false;
				return this.Device.IsLocal;
			}
			set
			{
				this.Device.IsLocal = value;
			}
		}

		public XCMLDocument Document { get; set; }
		#endregion
	}
}
