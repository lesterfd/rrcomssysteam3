using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;
using System.Xml.Schema;

namespace RRComSSys.CVM.ObjectModel.XCMLWorkflowModel
{
	public class WorkflowCondition : WorkflowItem
	{
		#region Member Variables
		private String _altNextId = "";
		private WorkflowItem _altNext;
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "altnext", Form = XmlSchemaForm.Unqualified)]
		public String AltNextID
		{
			get { return _altNextId; }
			set { _altNextId = value.Replace("#", ""); }
		}

		[XmlIgnore]
		public WorkflowItem AltNext
		{
			get { return _altNext; }
			set { _altNext = value; }
		}
		#endregion
	}
}
