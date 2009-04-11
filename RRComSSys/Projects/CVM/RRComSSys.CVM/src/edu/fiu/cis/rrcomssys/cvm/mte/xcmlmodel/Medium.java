package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel;

import org.simpleframework.xml.Attribute;

public class Medium
{
	/* Attributes */
	@Attribute(name = "mediumTypeName", required = true)
	private String _name = "";

	@Attribute(name = "suggestedApplication", required = false)
	private String _suggestedApplication = "";

	@Attribute(name = "voiceCommand", required = false)
	private String _voiceCommand = "";

	@Attribute(name = "derivedFromBuiltInType", required = true)
	private CapabilityType _capabilityType = CapabilityType.Text;

	/* Constructors & Initializers */
	public Medium()
	{}

	/* Properties */
	public String getName()
	{
		return _name;
	}

	public void setName(String value)
	{
		_name = value;
	}

	public String getSuggestedApplication()
	{
		return _suggestedApplication;
	}

	public void setSuggestedApplication(String value)
	{
		_suggestedApplication = value;
	}

	public String getVoiceCommand()
	{
		return _voiceCommand;
	}

	public void setVoiceCommand(String value)
	{
		_voiceCommand = value;
	}

	public CapabilityType getBuiltInType()
	{
		return _capabilityType;
	}

	public void setBuiltInType(CapabilityType value)
	{
		_capabilityType = value;
	}
}
