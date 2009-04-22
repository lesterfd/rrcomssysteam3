using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public class WFDecisionCommand
	{
		private WFItemCommand _branchTrue;
		private WFItemCommand _branchFalse;

		public WFItemCommand BranchTrue
		{
			get { return _branchTrue; }
			set { _branchTrue = value; }
		}

		public WFItemCommand BranchFalse
		{
			get { return _branchFalse; }
			set { _branchFalse = value; }
		}

		public void Execute()
		{
			if (ExecuteAPI.LastCommandSucceeded)
				_branchTrue.Execute();
			else
				_branchFalse.Execute();
		}
	}
}
