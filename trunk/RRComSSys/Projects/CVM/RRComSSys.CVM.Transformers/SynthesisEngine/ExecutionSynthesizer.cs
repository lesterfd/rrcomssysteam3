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
           //if(document is WorkFlow)
           //     return SynthesizeWorkFlow(document);
           // else
                return SynthesizeXCMLContainer((XCMLDocument)document);
        }

        private static XCMLContainer SynthesizeXCMLContainer(XCMLDocument doc)
        {
            foreach (Connection conn in doc.Connections)
            {
                foreach (CapabilityType cap in doc.LocalUser.Device.Capabilities)
                {
                    List<UserDefinition> remoteUsers = conn.FindItems<UserDefinition>(
                                         user => !  user.IsLocal 
                                                 && user.Device.Capabilities.Contains(cap));
                    List<Medium> media = conn.FindItems<Medium>(
                                         med => med.BuiltInType.Equals(cap));
                }
            }
        }

        private static WorkFlow SynthesizeWorkFlow(XCMLDocument doc)
        {
            throw new System.NotImplementedException();
        }
    }
}
