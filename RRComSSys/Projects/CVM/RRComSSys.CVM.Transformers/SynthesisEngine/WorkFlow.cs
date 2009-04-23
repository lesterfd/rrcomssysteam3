using System;
using System.Collections.Generic;
using System.Text;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;
using System.Threading;
using RRComSSys.CVM.ObjectModel.XCMLModel;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public delegate void ProcessingXCMLHandler(XCMLContainer container);

    public class WorkFlow : IExecutionContainer
	{
		#region Member Variables
		private List<WorkflowItem> items;
        private XCMLWorkflowDocument wfDoc;
		private List<XCMLContainer> _xcmlContainers = new List<XCMLContainer>();
        private bool lastFailed;
		#endregion

		public event ProcessingXCMLHandler ProcessingXCML;

		#region Constructors & Initializers
		public WorkFlow()
        {
            items = new List<WorkflowItem>();
		}
		
		public WorkFlow(XCMLWorkflowDocument doc)
        {
            wfDoc = doc;
		}
		#endregion

		#region Properties
		public List<WorkflowItem> Symbols
        {
            get {  return items;   }
		}
		#endregion

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
					if (ProcessingXCML != null)
						ProcessingXCML(container);
                    try
                    {
                        container.Execute();
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
