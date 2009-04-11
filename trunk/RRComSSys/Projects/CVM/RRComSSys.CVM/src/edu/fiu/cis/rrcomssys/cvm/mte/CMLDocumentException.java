package edu.fiu.cis.rrcomssys.cvm.mte;

public class CMLDocumentException extends Exception
{
	/* Constants */
	private static final long serialVersionUID = -8804326482040251823L;

	/* Constructors & Initializers */
	public CMLDocumentException()
	{
		super();
	}

	public CMLDocumentException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public CMLDocumentException(String message)
	{
		super(message);
	}

	public CMLDocumentException(Throwable cause)
	{
		super(cause);
	}
}
