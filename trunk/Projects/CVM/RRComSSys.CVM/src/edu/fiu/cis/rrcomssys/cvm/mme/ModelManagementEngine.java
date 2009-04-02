package edu.fiu.cis.rrcomssys.cvm.mme;

import edu.fiu.cis.rrcomssys.cvm.mte.CMLDocument;
import edu.fiu.cis.rrcomssys.cvm.se.SynthesisEngine;

public class ModelManagementEngine implements IModelManagementEngine
{
	/* Member Variables */
	private static ModelManagementEngine _instance;
	
	/* Constructors & Initializers */
	private ModelManagementEngine() { }
	
	/* Properties */
	public static IModelManagementEngine getInstance()
	{
		if(_instance == null)
			_instance = new ModelManagementEngine();
		return _instance;
	}
	
	/* Public Methods */
	@Override
	public CMLDocument loadCMLDocument(String fileName)
	{
		CMLDocument result = processInModelTransformer(fileName);
		result = processInSchemaTransformer(result);
		processInSynthesisEngine(result);
		return result;
	}
	
	@Override
	public void executeModel(CMLDocument doc)
	{
		SynthesisEngine.getInstance().executeCommands(doc);
	}
	
	/* Private Methods */
	private CMLDocument processInModelTransformer(String fileName)
	{
		// TODO Implement Me
		return null;
	}
	
	private CMLDocument processInSchemaTransformer(CMLDocument doc)
	{
		// TODO Implement Me
		return null;
	}
	
	private void processInSynthesisEngine(CMLDocument doc)
	{
		// TODO Implement Me
	}
}
