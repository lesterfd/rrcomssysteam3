package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel.media;

import edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel.CapabilityType;

public abstract class MediumType
{
	public String mediumURL;

	public MediumApplication suggestedApplication;

	public static MediumType fromBuiltInType(CapabilityType type)
	{
		return null;
	}

	public void load()
	{

	}
}
