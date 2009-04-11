package edu.fiu.cis.rrcomssys.cvm.mte;

import java.io.File;
import java.io.FileNotFoundException;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel.XCMLDocument;
import edu.fiu.cis.rrcomssys.cvm.mte.xcmlwfmodel.XCMLWorkflowDocument;

public abstract class CMLDocument
{
	/* Constants */
	private static final String MSG_FILE_NOT_EXISTS = "The file: '%1$s' does not exist";
	private static final String MSG_NOT_A_FILE = "The file: '%1$s' is not a valid file";
	private static final String MSG_BAD_EXTENSION = "The file: '%1$s' has a bad extension";
	private static final String MSG_NOT_SUPPORTED = "The file: '%1$s' is not a supported file type";
	private static final String MSG_ERROR_XCML = "An error ocurred while loading the XCML file: '%1$s'";
	private static final String MSG_ERROR_WF = "An error ocurred while loading the XCML Workflow file: '%1$s'";

	private static final String EXT_XCML = ".xcml";
	private static final String EXT_WF = ".xcmlwf";

	/* Static Methods */
	public static CMLDocument loadDocument(String fileName)
			throws FileNotFoundException, IllegalArgumentException, CMLDocumentException
	{
		return loadDocument(new File(fileName));
	}

	public static CMLDocument loadDocument(File file)
			throws FileNotFoundException, IllegalArgumentException,
			CMLDocumentException
	{
		// Get extension
		int dotIndex = file.getName().lastIndexOf('.');

		// Error checking
		if (!file.exists())
			throw new FileNotFoundException(String.format(MSG_FILE_NOT_EXISTS,
					file.getName()));
		if (!file.isFile())
			throw new IllegalArgumentException(String.format(MSG_NOT_A_FILE,
					file.getName()));
		if (dotIndex < 0)
			throw new IllegalArgumentException(String.format(MSG_BAD_EXTENSION,
					file.getName()));
		
		// Load either WF or XCML based on extension
		String extension = file.getName().substring(dotIndex);
		Serializer serializer = new Persister();
		CMLDocument result = null;
		if (extension.equalsIgnoreCase(EXT_XCML))
			try { result = serializer.read(XCMLDocument.class, file); } 
			catch (Exception e) { throw new CMLDocumentException(MSG_ERROR_XCML, e); }
		else if (extension.equalsIgnoreCase(EXT_WF))
			try { result = serializer.read(XCMLWorkflowDocument.class, file); } 
			catch (Exception e) { throw new CMLDocumentException(MSG_ERROR_WF, e); }
		else
			throw new CMLDocumentException(String.format(MSG_NOT_SUPPORTED,
					file.getName()));
		
		// Run onLoad
		result.onLoad();
		
		// Throw exception on null result
		if(result == null)
			throw new CMLDocumentException(String.format(MSG_NOT_A_FILE,
					file.getName()));
		
		return result;
	}

	/* Private Methods */
	protected void onLoad() { }
}
