using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CMVE.SynthesisEngine
{
    public class WorkFlowDecision : WorkFlowSymbol
    {
        private Boolean branchTaken = true;
        private WorkFlowItem previousItem;


        public WorkFlowDecision(WorkFlow owner)
            : base(owner)
        {  }

        public WorkFlowDecision(WorkFlow owner, WorkFlowItem prev)
            : base(owner)
        {
            previousItem = prev;
        }

        public Boolean BranchTaken
        {
            get
            {  return branchTaken;  }
            set
            {  branchTaken = value; }
        }

        public WorkFlow TrueWorkFlow
        {
            get
            {
                throw new System.NotImplementedException();
            }
            set
            {
            }
        }

        public WorkFlow FalseWorkFlow
        {
            get
            {
                throw new System.NotImplementedException();
            }
            set
            {
            }
        }



        public class WorkFlowDecisionCommand : IAPICommand
        {
            WorkFlowDecision workFlowDecision;

            public WorkFlowDecisionCommand(WorkFlowDecision wfd)
            {
                workFlowDecision = wfd;
            }


            public WorkFlowDecision WorkFlowDecision
            {
                get
                { return WorkFlowDecision; }
            }


            public virtual void Execute()
            {
                workFlowDecision.branchTaken = (workFlowDecision.previousItem.Exceptions.Count == 0);
            }

        }
    }
}
