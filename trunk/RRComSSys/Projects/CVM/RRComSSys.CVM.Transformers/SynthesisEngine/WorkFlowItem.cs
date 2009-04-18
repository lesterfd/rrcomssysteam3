using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class WorkFlowItem : WorkFlowSymbol
    {
        private WorkFlowDecision previousDecision = null;
        private Boolean decisionBranch = false;
        private List<Exception> exceptions;

        public WorkFlowItem(WorkFlow wf)
            :base(wf)
        {
            this.exceptions = new List<Exception>();
        }

        public WorkFlowItem(WorkFlow wf, WorkFlowDecision prev, Boolean branch)
            :base(wf)
        {
            this.previousDecision = prev;
            this.decisionBranch = branch;
            this.exceptions = new List<Exception>();
        }

        public Boolean DecisionBranch
        {
            get
            {   return decisionBranch;    }
        }

        public List<System.Exception> Exceptions
        {
            get
            {  return exceptions;  }
        }

        public override void Execute()
       {
           try
           {
               if (previousDecision == null || decisionBranch == previousDecision.BranchTaken)
               {
                   base.Execute();
               }
           }
           catch (Exception e)
           {  exceptions.Add(e); }

       }
    }
}