using System;
using System.Collections.Generic;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
    public class NoSuchFactoryException : Exception
    {
        public NoSuchFactoryException()
            : base("This factory does not exist.")
        {        }
    }
}
