using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.CVM.ObjectModel.XCMLModel;

namespace RRComSSys.Testing.Common
{
	public static class XCMLHelper
	{
		#region Helper Methods
		public static void AssertUserDefinition(UserDefinition user, String pName,
			String pID, String pRole, String dID, bool isVirtual)
		{
			// Get relevant info
			Person person = user.Person;
			Device device = user.Device;
			IsAttached isAttached = user.IsAttached;

			// Assert Person properties
			Assert.AreEqual(pName, person.Name);
			Assert.AreEqual(pID, person.ID);
			Assert.AreEqual(pRole, person.Role);

			// Assert Device properties
			Assert.AreEqual(dID, device.ID);

			// Assert IsAttached properties
			Assert.AreEqual(person.ID, isAttached.PersonID);
			Assert.AreEqual(device.ID, isAttached.DeviceID);

			// Assert UserDefinition properties
			Assert.AreEqual(isVirtual, user.IsLocal);
		}

		public static void AssertDevice(Device device, String id,
				CapabilityType[] capabilities)
		{
			Assert.AreEqual(id, device.ID);
			foreach (CapabilityType capability in capabilities)
				Assert.AreEqual(true, device.Capabilities.Contains(
						capability));
		}

		public static void AssertMedium(Medium medium, String name, String suggestedApp, CapabilityType builtInType)
		{
			Assert.AreEqual(medium.Name, name);
			Assert.AreEqual(medium.SuggestedApplication, suggestedApp);
			Assert.AreEqual(medium.BuiltInType, builtInType);
		}
		#endregion

	}
}
