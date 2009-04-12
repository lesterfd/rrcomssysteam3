using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public class UserDefinition
	{
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
		public Device Device { get; set; }
		public bool IsLocal
		{
			get
			{
				if (this.Device == null) return false;
				return this.Device.IsLocal;
			}
		}
		#endregion
	}
}
