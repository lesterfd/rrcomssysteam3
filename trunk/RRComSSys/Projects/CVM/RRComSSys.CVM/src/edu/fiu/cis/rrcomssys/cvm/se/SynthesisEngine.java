package edu.fiu.cis.rrcomssys.cvm.se;

import edu.fiu.cis.rrcomssys.cvm.mte.CMLDocument;

public class SynthesisEngine implements ISynthesisEngine
{
	/* Member Variables */
	private static SynthesisEngine _instance;
	
	/* Constructors & Initializers */
	private SynthesisEngine() { }
	
	/* Properties */
	public static ISynthesisEngine getInstance()
	{
		if(_instance == null)
			_instance = new SynthesisEngine();
		return _instance;
	}

	/* Public Methods */
	@Override
	public void executeCommands(CMLDocument doc)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void generateCommands(CMLDocument doc)
	{
		// TODO Auto-generated method stub

	}
	
	/* Private Methods */

}