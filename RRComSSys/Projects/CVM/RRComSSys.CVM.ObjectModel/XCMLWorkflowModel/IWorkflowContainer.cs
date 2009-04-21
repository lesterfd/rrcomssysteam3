using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.ObjectModel.XCMLWorkflowModel
{
	public interface IWorkflowContainer
	{
		TWFItem FindItem<TWFItem>(Predicate<TWFItem> predicate)
			where TWFItem : IWorkflowItem;

		List<TWFItem> FindItems<TWFItem>(Predicate<TWFItem> predicate)
			where TWFItem : IWorkflowItem;

		bool Contains<TWFItem>(Predicate<TWFItem> predicate)
			where TWFItem : IWorkflowItem;
	}
}
