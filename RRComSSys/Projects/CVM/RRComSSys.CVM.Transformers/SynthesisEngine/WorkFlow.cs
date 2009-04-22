using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class WorkFlow : IExecutionContainer
    {
        private List<WorkFlowItem> items;

        
        public WorkFlow()
        {
            items = new List<WorkFlowItem>();
        }

        public List<WorkFlowItem> Symbols
        {
            get
            {  return items;   }
        }

        public void Execute()
        {
            foreach (WorkFlowItem current in items)
            {
                current.Execute();
            }
        }
    }
}
