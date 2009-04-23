using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.ObjectModel;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public sealed class SynthesisEngineController
	{
		#region Member Variables
		private static readonly SynthesisEngineController instance = new SynthesisEngineController();
		private IExecutionContainer container;
		#endregion

		#region Constructors & Initializers
		private SynthesisEngineController() { }
		#endregion

		#region Properties
		public static SynthesisEngineController Instance
        {
            get { return instance; }
		}
		#endregion


		#region Public Methods
		public IExecutionContainer GenerateCommands(CMLDocument doc)
        {
            ExecutionSynthesizer xs = new ExecutionSynthesizer();
            container = xs.SynthesizeExecutionContainer(doc);
			return container;
        }

        public void ExecuteCommands()
        {
            container.Execute();
		}
		#endregion
	}
}
