using System;
using System.Collections.Generic;
using System.Text;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;
using System.Threading;
using RRComSSys.CVM.ObjectModel.XCMLModel;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class WorkFlow : IExecutionContainer
    {
        private List<WorkflowItem> items;

        private XCMLWorkflowDocument wfDoc;

        private bool lastFailed;

        public WorkFlow()
        {
            items = new List<WorkflowItem>();
        }

        public WorkFlow(XCMLWorkflowDocument doc)
        {
            wfDoc = doc;
        }

        public List<WorkflowItem> Symbols
        {
            get
            {  return items;   }
        }

        public void Execute()
        {
            ExecutionSynthesizer xs = new ExecutionSynthesizer();
            WorkflowItem current = wfDoc.Start.First;
            while(current != null)
            {
                if (current is WorkflowGCMLItem)
                {
                    XCMLDocument xcml = ((WorkflowGCMLItem)current).XCMLDocument;
                    XCMLContainer container = (XCMLContainer)xs.SynthesizeExecutionContainer(xcml);
                    try
                    {
                        container.Execute();
                        Thread.Sleep(20000);
                        lastFailed = false;
                    }
                    catch
                    {
                        lastFailed = true;
                    }
                    finally {current = current.Next;}
                }
                else
                {
                    if (lastFailed)
                        current = ((WorkflowCondition)current).AltNext;
                    else
                        current = current.Next;
                }
            }
        }
    }
}
