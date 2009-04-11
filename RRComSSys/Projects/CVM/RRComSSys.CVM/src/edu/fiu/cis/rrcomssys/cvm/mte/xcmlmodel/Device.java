package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel;

import java.util.LinkedList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class Device
{
	/* Attributes */
	@Attribute(name = "deviceID", required = true)
	private String _id = "";

	@Attribute(name = "isLocal", required = true)
	private boolean _isLocal = false;

	@Attribute(name = "isVirtual", required = true)
	private boolean _isVirtual = false;

	/* Elements */
	@ElementList(entry = "deviceCapability", inline = true, required = true)
	private List<CapabilityType> _capabilitiesList = new LinkedList<CapabilityType>();

	/* Constructors & Initializers */
	public Device()
	{}

	/* Properties */
	public String getID()
	{
		return _id;
	}

	public void setID(String value)
	{
		_id = value;
	}

	public boolean isLocal()
	{
		return _isLocal;
	}

	public void setIsLocal(boolean value)
	{
		_isLocal = value;
	}

	public boolean isVirtual()
	{
		return _isVirtual;
	}

	public void setIsVirtual(boolean value)
	{
		_isVirtual = value;
	}

	public List<CapabilityType> getCapabilities()
	{
		return _capabilitiesList;
	}
}
