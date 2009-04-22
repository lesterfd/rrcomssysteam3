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
        SynthesisEngineController() { }

        private static readonly SynthesisEngineController instance = new SynthesisEngineController();

        private IExecutionContainer container;

        public static SynthesisEngineController Instance
        {
            get { return instance; }
        }

        public void GenerateCommands(CMLDocument doc)
        {
            ExecutionSynthesizer xs = new ExecutionSynthesizer();
            container = xs.SynthesizeExecutionContainer(doc);
        }

        public void ExecuteCommands()
        {
            container.Execute();
            Thread.Sleep(20000);
        }
    }
}
