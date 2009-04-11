package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel;

public class UserDefinition
{
	/* Member Variables */
	private Person _person;
	private IsAttached _isAttached;
	private Device _device;
	
	/* Constructors & Initializers */
	public UserDefinition(Person person, IsAttached isAttached, Device device)
	{
		_person = person;
		_isAttached = isAttached;
		_device = device;
	}
	
	/* Properties */
	public Person getPerson()
	{
		return _person;
	}

	public Device getDevice()
	{
		return _device;
	}

	public IsAttached getIsAttached()
	{
		return _isAttached;
	}

	public boolean isLocal()
	{
		return _device.isLocal();
	}
}
