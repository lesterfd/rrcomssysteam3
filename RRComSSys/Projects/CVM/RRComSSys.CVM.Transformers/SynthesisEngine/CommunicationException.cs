using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Transformers.SynthesisEngine
{
	public class CommunicationException : Exception
	{
		public CommunicationException()
			: base() { }

		public CommunicationException(String message)
			: base(message) { }

		public CommunicationException(String message, Exception innerException)
			: base(message, innerException) { }
	}
}
