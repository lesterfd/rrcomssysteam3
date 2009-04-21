using System;
using System.Collections.Generic;
using System.Text;
using RRComSSys.CVM.ObjectModel.XCMLModel;
using RRComSSys.CVM.Transformers.SynthesisEngine;
using RRComSSys.CVM.ObjectModel;


namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public static class ExecutionSynthesizer
    {

        public static IExecutionContainer SynthesizeExecutionContainer(CMLDocument document)
        {
           if(document is WorkFlow)
                return SynthesizeWorkFlow(document);
            else
                return SynthesizeXCMLContainer(document);
        }

        private static XCMLContainer SynthesizeXCMLContainer(XCMLDocument doc)
        {
            foreach(Connection conn in doc.Connections)
        }

        private static WorkFlow SynthesizeWorkFlow(XCMLDocument doc)
        {
            throw new System.NotImplementedException();
        }
    }
}
