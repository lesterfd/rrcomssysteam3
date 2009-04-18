using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class LastItemSucceeded : IAPICommand
    {
        private WorkFlowItem lastItem = null;

        public LastItemSucceeded(WorkFlowItem last)
        { lastItem = last; }

        public void Execute()
        {
            
        }

    }
}
