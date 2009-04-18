using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using MbUnit.Framework;
using RRComSSys.Testing.Common;
using RRComSSys.CVM.ObjectModel;
using RRComSSys.CVM.Transformers.ModelTransformer;
using RRComSSys.CVM.ObjectModel.XCMLModel;

namespace RRComSSys.CVM.Transformers.Test.ModelTransformer
{
	[TestFixture]
	[TestCategory(TestConstants.Categories.UnitTest)]
	[TestsOn(typeof(ModelTransformationEngine))]
	[Author("Danil Mariovich Flores", "Danil.Flores@ultimatesoftware.com")]
	public class ModelTransformationEngineTester
	{
		#region Member Variables
		#endregion

		#region Test Setup
		#endregion

		#region Tests
		[RowTest]
		[Row(@".\TestFiles\sample_gcml_01.gcml")]
		[Row(@".\TestFiles\sample_xcml_01.xcml")]
		public void Test_Load_GCML_Or_XCML_Document(String fileName)
		{
			// Load document
			XCMLDocument doc = (XCMLDocument)ModelTransformationEngine.LoadCMLDocument(fileName);

			// Assert Document
			Assert.AreEqual("_jRhGQSfREd6Bgpzny0v-Ow", doc.CommunicationID);

			// Assert Users
			Assert.AreEqual(true, doc.LocalUser == null);
			Assert.AreEqual(2, doc.RemoteUsers.Count);
			Assert.AreEqual(2, doc.AllUsers.Count);
			XCMLHelper.AssertUserDefinition(doc.RemoteUsers[0], "maung", "_jpp5cCfREd6Bgpzny0v-Ow",
					"initiator", "_qeRA0CfREd6Bgpzny0v-Ow", false);
			XCMLHelper.AssertUserDefinition(doc.RemoteUsers[1], "danny", "_8RVZ0CfREd6Bgpzny0v-Ow",
					"receiver", "_7KjX8CfREd6Bgpzny0v-Ow", false);

			// Assert Connections
			Assert.AreEqual(1, doc.Connections.Count);
			Connection connection = doc.Connections[0];
			Assert.AreEqual("_rxtlsCfREd6Bgpzny0v-Ow", connection.ID);

			// Assert Devices
			Assert.AreEqual(2, connection.Devices.Count);
			XCMLHelper.AssertDevice(connection.Devices[0], "_qeRA0CfREd6Bgpzny0v-Ow",
					new CapabilityType[] { 
					CapabilityType.TextFile });
			XCMLHelper.AssertDevice(connection.Devices[1], "_7KjX8CfREd6Bgpzny0v-Ow",
					new CapabilityType[] { 
					CapabilityType.TextFile, CapabilityType.TextFile });

			// Assert media
			Assert.AreEqual(2, doc.AllMedia.Count);
			XCMLHelper.AssertMedium(doc.AllMedia[0], "file1", "", CapabilityType.TextFile);
			XCMLHelper.AssertMedium(doc.AllMedia[1], "stream1", "", CapabilityType.Text);
			XCMLHelper.AssertMedium(connection.Media[0], "file1", "", CapabilityType.TextFile);
			XCMLHelper.AssertMedium(connection.Media[1], "stream1", "", CapabilityType.Text);
		}
		#endregion

		#region Helpers
		#endregion
	}
}
