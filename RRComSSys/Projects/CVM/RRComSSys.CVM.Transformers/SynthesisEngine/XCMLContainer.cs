using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class XCMLContainer : IExecutionContainer
    {
        private List<IAPICommand> commands = new List<IAPICommand>();
		
		public event Action Executing;
    
        public List<IAPICommand> Commands
        {  get{  return commands;  } }

        #region IExecutionContainer Members

        public void Execute()
        {
			if(Executing != null)
				Executing();
            foreach (IAPICommand aCom in commands)
                aCom.Execute();
        }


        #endregion
    }
}
