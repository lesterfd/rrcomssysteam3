package edu.fiu.cis.rrcomssys.cvm.ste;

import edu.fiu.cis.rrcomssys.cvm.mte.CMLDocument;

public interface ISchemaTransformationEngine
{
	public CMLDocument transformToInstance(CMLDocument doc);
}
