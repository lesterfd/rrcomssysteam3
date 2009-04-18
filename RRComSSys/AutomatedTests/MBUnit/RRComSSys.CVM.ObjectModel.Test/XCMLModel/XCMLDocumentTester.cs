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
			String fileName = @".\TestFiles\sample_xcml_1.xcml";

			// Load document
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
			// File name
			String fileName = @".\TestFiles\sample_xcml_1.xcml";

			// Read document from file into text
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
		#endregion

	}
}
