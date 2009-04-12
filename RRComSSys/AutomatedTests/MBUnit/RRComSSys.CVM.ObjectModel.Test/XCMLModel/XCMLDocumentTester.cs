using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using System.Diagnostics;
using System.IO;

namespace RRComSSys.CVM.ObjectModel.Test.XCMLModel
{
	[TestFixture]
	[TestsOn(typeof(XCMLDocument))]
	public class XCMLDocumentTester
	{
		#region Tests
		[Test]
		public void Test_Load_XCML_Document_With_Elements()
		{
			String fileName = @".\TestFiles\sample_xcml_1.xcml";

			// Load document
			XCMLDocument doc = (XCMLDocument) XCMLDocument.LoadDocument(fileName);

			// Assert Document
			Assert.AreEqual("_9eTzYesBEd2LR6qNXxImpg", doc.CommunicationID);

			// Assert Users
			Assert.AreEqual(true, doc.LocalUser != null);
			Assert.AreEqual(2, doc.RemoteUsers.Count);
			Assert.AreEqual(3, doc.AllUsers.Count);
			AssertUserDefinition(doc.LocalUser, "Danny", "dflor003",
					"Researcher", "_fzHMkOwDEd2M0Nk-sntj1A", true);
			AssertUserDefinition(doc.RemoteUsers[0], "Lester", "ldiaz004",
					"Physicist", "_vFOEsOwDEd2M0Nk-sntj1A", false);
			AssertUserDefinition(doc.RemoteUsers[1], "Amanda", "mcrick001",
					"Biochemist", "_mQzEbOwDEd2M0Nk-sntj1A", false);

			// Assert Connections
			Assert.AreEqual(1, doc.Connections.Count);
			Connection connection = doc.Connections[0];
			Assert.AreEqual("_0yCBEOwEEd2M0Nk-sntj1A", connection.ID);

			// Assert Devices
			Assert.AreEqual(3, connection.Devices.Count);
			AssertDevice(connection.Devices[0], "_fzHMkOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });
			AssertDevice(connection.Devices[1], "_vFOEsOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });
			AssertDevice(connection.Devices[2], "_mQzEbOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });

			// Assert media
			Assert.AreEqual(2, doc.AllMedia.Count);
			AssertMedium(doc.AllMedia[0], "SomeFile", "QuickTime", CapabilityType.AudioVideoFile);
			AssertMedium(doc.AllMedia[1], "LiveStream", "Windows Media Player", CapabilityType.LiveAudio);
			AssertMedium(connection.Media[0], "SomeFile", "QuickTime", CapabilityType.AudioVideoFile);
			AssertMedium(connection.Media[1], "LiveStream", "Windows Media Player", CapabilityType.LiveAudio);
		}
		#endregion

		#region Helper Methods
		private void AssertUserDefinition(UserDefinition user, String pName,
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

		private void AssertDevice(Device device, String id,
				CapabilityType[] capabilities)
		{
			Assert.AreEqual(id, device.ID);
			foreach (CapabilityType capability in capabilities)
				Assert.AreEqual(true, device.Capabilities.Contains(
						capability));
		}

		private void AssertMedium(Medium medium, String name, String suggestedApp, CapabilityType builtInType)
		{
			Assert.AreEqual(medium.Name, name);
			Assert.AreEqual(medium.SuggestedApplication, suggestedApp);
			Assert.AreEqual(medium.BuiltInType, builtInType);
		}
		#endregion
	}
}
