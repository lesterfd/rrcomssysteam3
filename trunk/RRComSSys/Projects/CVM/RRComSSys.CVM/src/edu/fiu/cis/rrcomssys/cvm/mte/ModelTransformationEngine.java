package edu.fiu.cis.rrcomssys.cvm.mte;

import java.io.File;

import edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel.XCMLDocument;
import edu.fiu.cis.rrcomssys.cvm.mte.xcmlwfmodel.XCMLWorkflowDocument;



public class ModelTransformationEngine implements IModelTransformationEngine
{
	/* Member Variables */
	private static ModelTransformationEngine _instance;

	/* Constructors & Initializers */
	private ModelTransformationEngine() { }
	
	/* Properties */
	/**
	 * Gets an instance of ModelTransformationEngine.
	 * @return an instance of ModelTransformationEngine
	 */
	public static IModelTransformationEngine getInstance()
	{
		if(_instance == null)
			_instance = new ModelTransformationEngine();
		return _instance;
	}

	/* Public Methods */
	@Override
	public CMLDocument loadCMLDocument(String fileName)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/* Private Methods */
	/** */
	private XCMLDocument loadXCMLDocument(File file)
    {
		// TODO Implement Me!
		return null;
    }
    
    /** */
    private XCMLDocument loadGCMLDocument(File file)
    {
    	// TODO Implement Me!
		return null;
    }
    
    /** */
    private XCMLWorkflowDocument loadXCMLWorkflowDocument(File file)
    {
    	// TODO Implement Me!
		return null;
    }
    
    /** */
    private XCMLWorkflowDocument loadGCMLWorkflowDocument(File file)
    {
    	// TODO Implement Me!
		return null;
    }
    
    /** */
    private void transformGCMLToXCML(String inputFile, String outputFile)
    {
    	// TODO Implement Me!
    }
    
    /** */
    private void transformWFGCMLToWFXCML(String intputFile, String outputFile)
    {
    	// TODO Implement Me!
    }
}