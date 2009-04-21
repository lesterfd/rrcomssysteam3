using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using System.Diagnostics;
using System.IO;
using RRComSSys.Testing.Common;

namespace RRComSSys.CVM.ObjectModel.Test.XCMLModel
{
	[TestFixture]
	[TestCategory(TestConstants.Categories.UnitTest)]
	[TestsOn(typeof(XCMLDocument))]
	[Author("Danil Mariovich Flores", "Danil.Flores@ultimatesoftware.com")]
	public class XCMLDocumentTester
	{
		#region Tests
		[Test]
		public void Test_Load_XCML_Document_From_File()
		{
			// Load document
			String fileName = @".\TestFiles\sample_xcml_1.xcml";
			XCMLDocument doc = XCMLDocument.LoadDocument<XCMLDocument>(fileName);

			// Assert Document
			Assert.AreEqual("_9eTzYesBEd2LR6qNXxImpg", doc.CommunicationID);

			// Assert Users
			Assert.AreEqual(true, doc.LocalUser != null);
			Assert.AreEqual(2, doc.RemoteUsers.Count);
			Assert.AreEqual(3, doc.AllUsers.Count);
			XCMLHelper.AssertUserDefinition(doc.LocalUser, "Danny", "dflor003",
					"Researcher", "_fzHMkOwDEd2M0Nk-sntj1A", true);
			XCMLHelper.AssertUserDefinition(doc.RemoteUsers[0], "Lester", "ldiaz004",
					"Physicist", "_vFOEsOwDEd2M0Nk-sntj1A", false);
			XCMLHelper.AssertUserDefinition(doc.RemoteUsers[1], "Amanda", "mcrick001",
					"Biochemist", "_mQzEbOwDEd2M0Nk-sntj1A", false);

			// Assert Connections
			Assert.AreEqual(1, doc.Connections.Count);
			Connection connection = doc.Connections[0];
			Assert.AreEqual("_0yCBEOwEEd2M0Nk-sntj1A", connection.ID);

			// Assert connection remote user
			XCMLHelper.AssertUserDefinition(connection.RemoteUsers[0], "Lester", "ldiaz004",
					"Physicist", "_vFOEsOwDEd2M0Nk-sntj1A", false);
			XCMLHelper.AssertUserDefinition(connection.RemoteUsers[1], "Amanda", "mcrick001",
					"Biochemist", "_mQzEbOwDEd2M0Nk-sntj1A", false);

			// Assert Devices
			Assert.AreEqual(3, connection.Devices.Count);
			XCMLHelper.AssertDevice(connection.Devices[0], "_fzHMkOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });
			XCMLHelper.AssertDevice(connection.Devices[1], "_vFOEsOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });
			XCMLHelper.AssertDevice(connection.Devices[2], "_mQzEbOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });

			// Assert media
			Assert.AreEqual(2, doc.AllMedia.Count);
			XCMLHelper.AssertMedium(doc.AllMedia[0], "SomeFile", "QuickTime", CapabilityType.AudioVideoFile);
			XCMLHelper.AssertMedium(doc.AllMedia[1], "LiveStream", "Windows Media Player", CapabilityType.LiveAudio);
			XCMLHelper.AssertMedium(connection.Media[0], "SomeFile", "QuickTime", CapabilityType.AudioVideoFile);
			XCMLHelper.AssertMedium(connection.Media[1], "LiveStream", "Windows Media Player", CapabilityType.LiveAudio);
		}

		[Test]
		public void Test_Load_XCML_Document_From_Text()
		{
			// Read document from file into text
			String fileName = @".\TestFiles\sample_xcml_1.xcml";
			String xmlText = null;
			using (FileStream fs = new FileStream(fileName, FileMode.Open, FileAccess.Read))
			using (StreamReader sr = new StreamReader(fs))
				xmlText = sr.ReadToEnd();
			XCMLDocument doc = XCMLDocument.LoadDocumentFromText<XCMLDocument>(xmlText);

			// Assert Document
			Assert.AreEqual("_9eTzYesBEd2LR6qNXxImpg", doc.CommunicationID);

			// Assert Users
			Assert.AreEqual(true, doc.LocalUser != null);
			Assert.AreEqual(2, doc.RemoteUsers.Count);
			Assert.AreEqual(3, doc.AllUsers.Count);
			XCMLHelper.AssertUserDefinition(doc.LocalUser, "Danny", "dflor003",
					"Researcher", "_fzHMkOwDEd2M0Nk-sntj1A", true);
			XCMLHelper.AssertUserDefinition(doc.RemoteUsers[0], "Lester", "ldiaz004",
					"Physicist", "_vFOEsOwDEd2M0Nk-sntj1A", false);
			XCMLHelper.AssertUserDefinition(doc.RemoteUsers[1], "Amanda", "mcrick001",
					"Biochemist", "_mQzEbOwDEd2M0Nk-sntj1A", false);

			// Assert Connections
			Assert.AreEqual(1, doc.Connections.Count);
			Connection connection = doc.Connections[0];
			Assert.AreEqual("_0yCBEOwEEd2M0Nk-sntj1A", connection.ID);

			// Assert connection remote user
			XCMLHelper.AssertUserDefinition(connection.RemoteUsers[0], "Lester", "ldiaz004",
					"Physicist", "_vFOEsOwDEd2M0Nk-sntj1A", false);
			XCMLHelper.AssertUserDefinition(connection.RemoteUsers[1], "Amanda", "mcrick001",
					"Biochemist", "_mQzEbOwDEd2M0Nk-sntj1A", false);

			// Assert Devices
			Assert.AreEqual(3, connection.Devices.Count);
			XCMLHelper.AssertDevice(connection.Devices[0], "_fzHMkOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });
			XCMLHelper.AssertDevice(connection.Devices[1], "_vFOEsOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });
			XCMLHelper.AssertDevice(connection.Devices[2], "_mQzEbOwDEd2M0Nk-sntj1A",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio });

			// Assert media
			Assert.AreEqual(2, doc.AllMedia.Count);
			XCMLHelper.AssertMedium(doc.AllMedia[0], "SomeFile", "QuickTime", CapabilityType.AudioVideoFile);
			XCMLHelper.AssertMedium(doc.AllMedia[1], "LiveStream", "Windows Media Player", CapabilityType.LiveAudio);
			XCMLHelper.AssertMedium(connection.Media[0], "SomeFile", "QuickTime", CapabilityType.AudioVideoFile);
			XCMLHelper.AssertMedium(connection.Media[1], "LiveStream", "Windows Media Player", CapabilityType.LiveAudio);
		}

		[Test]
		public void Test_Find_Single_Item()
		{
			// Load document
			String fileName = @".\TestFiles\sample_xcml_1.xcml";
			XCMLDocument doc = XCMLDocument.LoadDocument<XCMLDocument>(fileName);

			// Find Device
			Device device = doc.FindItem<Device>(dev => dev.ID == "_fzHMkOwDEd2M0Nk-sntj1A");
			XCMLHelper.AssertDevice(device, "_fzHMkOwDEd2M0Nk-sntj1A",
				new CapabilityType[] {
					CapabilityType.TextFile, CapabilityType.TextFile, 
					CapabilityType.AudioFile, CapabilityType.LiveAudio});

			// Find Medium
			Medium medium = doc.FindItem<Medium>(m => m.Name == "SomeFile");
			XCMLHelper.AssertMedium(medium, "SomeFile", "QuickTime", CapabilityType.AudioVideoFile);

			// Find IsAttached
			IsAttached isAttached = doc.FindItem<IsAttached>(i =>
				i.PersonID == "dflor003" && i.DeviceID == "_fzHMkOwDEd2M0Nk-sntj1A");
			Assert.AreEqual(isAttached.PersonID, "dflor003");
			Assert.AreEqual(isAttached.DeviceID, "_fzHMkOwDEd2M0Nk-sntj1A");

			// Fail to find item
			IsAttached nonExistant = doc.FindItem<IsAttached>(i => i.PersonID == "bob");
			Assert.AreEqual(null, nonExistant);

			// Find User Definition
			UserDefinition user = doc.FindItem<UserDefinition>(u => u.IsLocal);
			XCMLHelper.AssertUserDefinition(user, "Danny", "dflor003",
					"Researcher", "_fzHMkOwDEd2M0Nk-sntj1A", true);

			// Find Connection
			Connection conn = doc.FindItem<Connection>(c => c.ID == "_0yCBEOwEEd2M0Nk-sntj1A");
			Assert.AreEqual("_0yCBEOwEEd2M0Nk-sntj1A", conn.ID);

			// Find Person
			Person person = doc.FindItem<Person>(p => p.Name == "Danny");
			Assert.AreEqual(person.Name, "Danny");
		}

		[Test]
		public void Test_Find_Multiple_Items()
		{
			// Load document
			String fileName = @".\TestFiles\sample_xcml_1.xcml";
			XCMLDocument doc = XCMLDocument.LoadDocument<XCMLDocument>(fileName);

			// Find devices with Text capability that are located in a certain connection
			List<Device> devices = doc.FindItems<Device>(
				d => 
					d.Capabilities.Contains(CapabilityType.Text) && 
					doc.FindItem<Connection>(
						c => c.ID == "_0yCBEOwEEd2M0Nk-sntj1A")
							.Contains<Device>(d2 => d2.ID == d.ID));
			Assert.AreEqual(3, devices.Count);
			
			// Find all user definitions that have a matching device capability to the local user
			List<UserDefinition> users = doc.Connections[0].FindItems<UserDefinition>(
				user => !user.IsLocal && user.Device.Capabilities.Contains(doc.LocalUser.Device.Capabilities[0]));
			Assert.AreEqual(2, users.Count);
		}
		#endregion

	}
}
