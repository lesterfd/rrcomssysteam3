using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.Serialization;

namespace RRComSSys.CVM.ObjectModel
{
	public class CMLDocumentException : Exception
	{
		#region Constructors & Initializers
		public CMLDocumentException()
			: base() { }

		public CMLDocumentException(String message)
			: base(message) { }

		public CMLDocumentException(String message, Exception innerException)
			: base(message, innerException) { }

		public CMLDocumentException(SerializationInfo info, StreamingContext context)
			: base(info, context) { }
		#endregion
	}
}
