using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public class WFItemCommand : IAPICommand
	{
		private IList<IAPICommand> _commands = new List<IAPICommand>();

		public IList<IAPICommand> Commands
		{
			get { return _commands; }
		}

		public void Execute()
		{
			foreach(IAPICommand command in _commands)
				command.Execute();
		}
	}
}
