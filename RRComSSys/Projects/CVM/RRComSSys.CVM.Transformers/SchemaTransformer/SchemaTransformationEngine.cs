using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using RRComSSys.CVM.ObjectModel;
using RRComSSys.CVM.ObjectModel.XCMLWorkflowModel;

namespace RRComSSys.CVM.Transformers.SchemaTransformer
{
	public static class SchemaTransformationEngine
	{
		public static CMLDocument Transform(CMLDocument document)
		{
			if (document is XCMLWorkflowDocument)
				return document;

		}
	}
}
