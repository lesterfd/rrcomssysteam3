using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using System.Xml.Serialization;
using System.Xml.Schema;

namespace RRComSSys.CVM.ObjectModel.XCMLWorkflowModel
{
	public class WorkflowGCMLItem : WorkflowItem
	{
		#region Member Variables
		private String _gcmlPath = "";
		private XCMLDocument _xcmlDocument;
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "GCMLLoc", Form = XmlSchemaForm.Unqualified)]
		public String GCMLPath
		{
			get { return _gcmlPath; }
			set { _gcmlPath = value; }
		}

		[XmlIgnore]
		public XCMLDocument XCMLDocument
		{
			get { return _xcmlDocument; }
			set { _xcmlDocument = value; }
		}
		#endregion
	}
}
