using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public interface IXCMLContainer
	{
		TXCMLItem FindItem<TXCMLItem>(Predicate<TXCMLItem> predicate)
			where TXCMLItem : IXCMLItem;

		List<TXCMLItem> FindItems<TXCMLItem>(Predicate<TXCMLItem> predicate)
			where TXCMLItem : IXCMLItem;

		bool Contains<TXCMLItem>(Predicate<TXCMLItem> predicate)
			where TXCMLItem : IXCMLItem;
	}
}
