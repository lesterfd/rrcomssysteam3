using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;
using System.Xml.Schema;

namespace RRComSSys.CVM.ObjectModel.XCMLWorkflowModel
{
	public class WorkflowStart
	{
		#region Member Variables
		private String _nextId = "";
		private WorkflowItem _first;
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "next", Form = XmlSchemaForm.Unqualified)]
		public String FirstID
		{
			get { return _nextId; }
			set
			{
				_nextId = value.Replace("#", "");
			}
		}

		[XmlIgnore]
		public WorkflowItem First
		{
			get { return _first; }
			set { _first = value; }
		}
		#endregion
	}
}
