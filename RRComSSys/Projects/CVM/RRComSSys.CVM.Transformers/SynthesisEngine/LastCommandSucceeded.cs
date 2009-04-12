using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CMVE.SynthesisEngine
{
    public class LastItemSucceeded : RRComSSys.CMVE.SynthesisEngine.IAPICommand
    {
        private WorkFlowItem lastItem = null;

        public LastItemSucceeded(WorkFlowItem last)
        { lastItem = last; }

        public void Execute()
        {
            
        }

    }
}
