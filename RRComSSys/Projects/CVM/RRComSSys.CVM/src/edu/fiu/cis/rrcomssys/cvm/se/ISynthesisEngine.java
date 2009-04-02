package edu.fiu.cis.rrcomssys.cvm.se;

import edu.fiu.cis.rrcomssys.cvm.mte.CMLDocument;

public interface ISynthesisEngine
{
	public void generateCommands(CMLDocument doc);
	public void executeCommands(CMLDocument doc);
}
