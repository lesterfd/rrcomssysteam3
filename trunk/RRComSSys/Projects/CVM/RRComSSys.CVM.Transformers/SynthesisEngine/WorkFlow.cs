﻿using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class WorkFlow : IAPICommand, IExecutionContainer
    {
        private List<WorkFlowSymbol> symbols;

        
        public WorkFlow()
        {
            symbols = new List<WorkFlowSymbol>();
        }

        public List<WorkFlowSymbol> Symbols
        {
            get
            {  return symbols;   }
        }

        public void Execute()
        {
            foreach(WorkFlowSymbol current in symbols)
            {
                current.Execute();
            }
        }
    }
}