package edu.fiu.cis.rrcomssys.cvm.ste;

import edu.fiu.cis.rrcomssys.cvm.mte.CMLDocument;

public class SchemaTransformationEngine implements ISchemaTransformationEngine
{
	/* Member Variables */
	private static SchemaTransformationEngine _instance;
	
	/* Constructors & Initializers */
	private SchemaTransformationEngine() { }
	
	/* Properties */
	public static ISchemaTransformationEngine getInstance()
	{
		if(_instance == null)
			_instance = new SchemaTransformationEngine();
		return _instance;
	}

	/* Public Methods */
	@Override
	public CMLDocument transformToInstance(CMLDocument doc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	/* Private Methods */

}