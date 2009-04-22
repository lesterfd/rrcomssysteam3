using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;
using System.Xml.Schema;
using System.IO;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.Common;

namespace RRComSSys.CVM.ObjectModel.XCMLWorkflowModel
{
	[XmlRoot(ElementName = "WFGCMLRoot", IsNullable = false, Namespace = "http://wfgcml/1.0")]
	public class XCMLWorkflowDocument : CMLDocument, IWorkflowContainer
	{
		#region Member Variables
		private List<WorkflowItem> _workflowItems = new List<WorkflowItem>();
		private WorkflowStart _start;
		private List<IWorkflowItem> _allItems = new List<IWorkflowItem>();
		#endregion

		#region Properties
		[XmlElement(ElementName = "start", Form = XmlSchemaForm.Unqualified)]
		public WorkflowStart Start
		{
			get { return _start; }
			set { _start = value; }
		}

		[XmlElement(ElementName = "condition", Type = typeof(WorkflowCondition), Form = XmlSchemaForm.Unqualified)]
		[XmlElement(ElementName = "GCML", Type = typeof(WorkflowGCMLItem), Form = XmlSchemaForm.Unqualified)]
		public List<WorkflowItem> Elements
		{
			get { return _workflowItems; }
		}
		#endregion

		#region Public Methods
		public TWFItem FindItem<TWFItem>(Predicate<TWFItem> predicate)
			where TWFItem : IWorkflowItem
		{
			foreach (IWorkflowItem item in _allItems)
				if (IsTypeOrSubclass(item, typeof(TWFItem)) &&
					predicate((TWFItem) item))
					return (TWFItem) item;
			return default(TWFItem);
		}

		public List<TWFItem> FindItems<TWFItem>(Predicate<TWFItem> predicate)
			where TWFItem : IWorkflowItem
		{
			List<TWFItem> result = new List<TWFItem>();
			foreach (IWorkflowItem item in _allItems)
				if (IsTypeOrSubclass(item, typeof(TWFItem)) &&
					predicate((TWFItem) item))
					result.Add((TWFItem) item);
			return result;
		}

		public bool Contains<TWFItem>(Predicate<TWFItem> predicate)
			where TWFItem : IWorkflowItem
		{
			return FindItem<TWFItem>(predicate) != null;
		}

		public List<TWFItem> GetAllItems<TWFItem>()
			where TWFItem : IWorkflowItem
		{
			List<TWFItem> result = new List<TWFItem>();
			foreach (IWorkflowItem item in _allItems)
				if (item.GetType() == typeof(TWFItem))
					result.Add((TWFItem)item);
			return result;
		}
		#endregion

		#region Private Methods
		protected override void OnLoad()
		{
			PreProcessElements();
			ProcessNextNodes();
			ProcessXCMLDocuments();
		}

		private void PreProcessElements()
		{
			foreach (IWorkflowItem item in this.Elements)
				_allItems.Add(item);
		}

		private void ProcessNextNodes()
		{
			// Setup start
			Start.First = this.FindItem<WorkflowItem>(x => x.ID == Start.FirstID);

			// Setup the rest of the elements
			foreach (WorkflowItem element in Elements)
			{
				element.Next = FindItem<WorkflowItem>(x => x.ID == element.NextID);
				if (element is WorkflowCondition)
				{
					WorkflowCondition condition = (WorkflowCondition) element;
					condition.AltNext = FindItem<WorkflowItem>(x => x.ID == condition.AltNextID);
				}
			}
		}

		private void ProcessXCMLDocuments()
		{
			List<WorkflowGCMLItem> validGCMLItems = this.FindItems<WorkflowGCMLItem>(
				x => !String.IsNullOrEmpty(x.GCMLPath));
			foreach (WorkflowGCMLItem item in validGCMLItems)
			{
				if (!File.Exists(item.GCMLPath))
				{
					String sameDirPath = item.GCMLPath;
					int indexLastSlash = sameDirPath.LastIndexOf('\\');
					sameDirPath = sameDirPath.Substring(indexLastSlash);
					item.GCMLPath = this.Path + sameDirPath;
					if (!File.Exists(item.GCMLPath))
					{
						item.GCMLPath = "";
						continue;
					}
				}
				XCMLDocument xcmlDoc = null;
				if (item.GCMLPath.EndsWith(Constants.Extensions.GCML))
					xcmlDoc = GCMLTransformer.Transform(item.GCMLPath);
				else if (item.GCMLPath.EndsWith(Constants.Extensions.XCML))
					xcmlDoc = XCMLDocument.LoadDocument<XCMLDocument>(item.GCMLPath);
				item.XCMLDocument = xcmlDoc;
			}
		}

		private bool IsTypeOrSubclass(Object obj, Type type)
		{
			return
				obj.GetType() == type ||
				obj.GetType().IsSubclassOf(type);
		}
		#endregion
	}
}
