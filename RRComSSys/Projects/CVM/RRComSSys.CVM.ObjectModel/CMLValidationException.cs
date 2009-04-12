using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Runtime.Serialization;

namespace RRComSSys.CVM.ObjectModel
{
	public class CMLValidationException : CMLDocumentException
	{
		#region Constructors & Initializers
		public CMLValidationException()
			: base() { }

		public CMLValidationException(String message)
			: base(message) { }

		public CMLValidationException(String message, Exception innerException)
			: base(message, innerException) { }

		public CMLValidationException(SerializationInfo info, StreamingContext context)
			: base(info, context) { }
		#endregion
	}
}
