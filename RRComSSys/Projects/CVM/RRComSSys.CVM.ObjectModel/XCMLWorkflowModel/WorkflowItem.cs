using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;
using System.Xml.Schema;

namespace RRComSSys.CVM.ObjectModel.XCMLWorkflowModel
{
	public abstract class WorkflowItem : IWorkflowItem
	{
		#region Member Variables
		private String _id = "";
		private String _nextId = "";
		private WorkflowItem _next;
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "ID", Form = XmlSchemaForm.Unqualified)]
		public String ID
		{
			get { return _id; }
			set { _id = value; }
		}

		[XmlAttribute(AttributeName = "next", Form = XmlSchemaForm.Unqualified)]
		public String NextID
		{
			get { return _nextId; }
			set
			{
				if (value.Contains("//@final"))
					_nextId = null;
				else
					_nextId = value.Replace("#", "");
			}
		}

		[XmlIgnore]
		public WorkflowItem Next
		{
			get { return _next; }
			set { _next = value; }
		}
		#endregion
	}
}
