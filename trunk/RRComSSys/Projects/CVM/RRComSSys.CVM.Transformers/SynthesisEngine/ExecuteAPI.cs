using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public static class ExecuteAPI
	{
		private static IList<IAPICommand> _commands = new List<IAPICommand>();
		private static bool _lastSucceeded = false;

		public static IList<IAPICommand> Commands
		{
			get { return _commands; }
		}

		public static bool LastCommandSucceeded
		{
			get { return _lastSucceeded; }
			set { _lastSucceeded = value; }
		}

		public static void ExecuteCommands()
		{
			foreach (IAPICommand command in _commands)
			{
				try { command.Execute(); }
				catch
				{
					_lastSucceeded = false;
					continue;
				}
				_lastSucceeded = true;
			}
		}
	}
}
