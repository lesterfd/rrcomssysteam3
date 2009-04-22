using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    /*Currently, WorkFlowSymbol keeps track of what TrueWorkFlow it is assigned to. This is not good design,
     * however, in Java, this can be fixed by having TrueWorkFlow extend ArrayList and then overriding add.
     * Since this is not the final implementation, creating a wrapper class would not be a good use of
     * time. Furthermore, the classes futherdown may override the add method.
     */
    public abstract class WorkFlowSymbol
    {
        private List<IAPICommand> commands;
        private WorkFlow workFlow;

        public WorkFlowSymbol(WorkFlow wf)
        {
            workFlow = wf;
            commands = new List<IAPICommand>();
        }

        protected WorkFlowSymbol(WorkFlow wf, List<IAPICommand> com)
        {
            workFlow = wf;
            commands = com;
        }

        public List<IAPICommand> Commands
        {
            get
            {  return commands; }
        }

        public WorkFlow WorkFlow
        {
            get
            { return workFlow; }
        }

        public virtual void Execute()
        {
            foreach (IAPICommand current in commands)
            { current.Execute(); }
        }
    }
}
