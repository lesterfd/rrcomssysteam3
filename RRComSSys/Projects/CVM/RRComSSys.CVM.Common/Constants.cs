using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace RRComSSys.CVM.Common
{
	public static class Constants
	{
		public static class Messages
		{
			public const String MSG_TOSTRING_ERROR = "Error rendering XML document";
			public const String MSG_TOO_MANY_LOCAL = "Validation Error: The document has more than one local person";
			public const String MSG_ELEMENT_DOES_NOT_EXIST = "Validation Error: An element of type '{0}' with ID '{1}' does not exist";
			public const String MSG_FILE_NOT_EXISTS = "The file: '{0}' does not exist";
			public const String MSG_NOT_A_FILE = "The file: '{0}' is not a valid file";
			public const String MSG_BAD_EXTENSION = "The file: '{0}' has a bad extension";
			public const String MSG_NOT_SUPPORTED = "The file: '{0}' is not a supported file type";
			public const String MSG_ERROR_XCML = "An error ocurred while loading the XCML file: '{0}'";
			public const String MSG_ERROR_WF = "An error ocurred while loading the XCML Workflow file: '{0}'";
		}

		public static class Extensions
		{
			public const String XCML = ".xcml";
			public const String XCMLWorkflow = ".wfxcml";
			public const String GCML = ".gcml";
			public const String GCMLWorkflow = ".wfgcml";
		}
	}
}
