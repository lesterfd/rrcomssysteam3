package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel;

import org.simpleframework.xml.Attribute;

public class IsAttached
{
	/* Attributes */
	@Attribute(name = "personID", required = true)
	private String _personID = "";

	@Attribute(name = "deviceID", required = true)
	private String _deviceID = "";

	/* Constructors & Initializers */
	public IsAttached()
	{}

	/* Properties */
	public String getPersonID()
	{
		return _personID;
	}

	public void setPersonID(String value)
	{
		_personID = value;
	}

	public String getDeviceID()
	{
		return _deviceID;
	}

	public void setDeviceID(String value)
	{
		_deviceID = value;
	}
}
