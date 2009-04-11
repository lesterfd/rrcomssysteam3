package edu.fiu.cis.rrcomssys.cvm.mte;

public class CMLValidationException extends Exception
{
	/* Member Variables */ 
	private static final long serialVersionUID = 9222866134317982221L;

	/* Constructors & Initializers */
	public CMLValidationException() { }

	public CMLValidationException(String arg0)
	{
		super(arg0);
	}

	public CMLValidationException(Throwable arg0)
	{
		super(arg0);
	}

	public CMLValidationException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}
}
