using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class XCMLContainer : IExecutionContainer
    {
        private List<IAPICommand> commands = new List<IAPICommand>();
    
        public List<IAPICommand> Commands
        {  get{  return commands;  } }

        #region IExecutionContainer Members

        public void Execute()
        {
            foreach (IAPICommand aCom in commands)
                aCom.Execute();
        }

        #endregion
    }
}
