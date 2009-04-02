package edu.fiu.cis.rrcomssys.cvm.mme;

import edu.fiu.cis.rrcomssys.cvm.mte.CMLDocument;

public interface IModelManagementEngine
{
	public CMLDocument loadCMLDocument(String fileName);

	public void executeModel(CMLDocument doc);
}
