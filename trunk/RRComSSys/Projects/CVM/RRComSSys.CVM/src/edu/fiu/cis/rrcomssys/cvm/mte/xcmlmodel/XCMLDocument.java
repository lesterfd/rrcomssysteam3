package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel;

import java.io.StringWriter;
import java.util.LinkedList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import edu.fiu.cis.rrcomssys.cvm.mte.CMLDocument;
import edu.fiu.cis.rrcomssys.cvm.mte.CMLValidationException;

@Root(name = "userSchema", strict = false)
public class XCMLDocument extends CMLDocument
{
	/* Constants */
	private static final String MSG_TOSTRING_ERROR = "Error rendering XML document";
	private static final String MSG_TOO_MANY_LOCAL = "Validation Error: The document has more than one local person";
	private static final String MSG_ELEMENT_DOES_NOT_EXIST = "Validation Error: An element of type '%1$s' with ID '%2$s' does not exist";

	/* Attributes */
	@Attribute(name = "communicationID", required = true)
	private String _communicationID = "";

	/* Elements */
	@ElementList(entry = "connection", inline = true, required = true)
	private List<Connection> _connectionList = new LinkedList<Connection>();

	@ElementList(entry = "mediumType", inline = true, required = false)
	private List<Medium> _mediumList = new LinkedList<Medium>();

	@ElementList(entry = "person", inline = true, required = false)
	private List<Person> _personList = new LinkedList<Person>();

	@ElementList(entry = "isAttached", inline = true, required = false)
	private List<IsAttached> _isAttachedList = new LinkedList<IsAttached>();

	/* Member Variables */
	private UserDefinition _localUser;
	private List<UserDefinition> _remoteUsers = new LinkedList<UserDefinition>();

	/* Constructors & Initializers */
	public XCMLDocument()
	{}

	/* Properties */
	public String getCommunicationID()
	{
		return _communicationID;
	}

	public void setCommunicationID(String value)
	{
		_communicationID = value;
	}

	public List<Connection> getConnections()
	{
		return _connectionList;
	}

	public List<Medium> getAllMedia()
	{
		return _mediumList;
	}

	public UserDefinition getLocalUser()
	{
		return _localUser;
	}

	public List<UserDefinition> getRemoteUsers()
	{
		return _remoteUsers;
	}

	public List<UserDefinition> getAllUsers()
	{
		List<UserDefinition> result = new LinkedList<UserDefinition>();
		result.add(_localUser);
		result.addAll(_remoteUsers);
		return result;
	}

	/* Public Methods */
	@Override
	public String toString()
	{
		StringWriter writer = new StringWriter();
		Serializer serializer = new Persister();
		try
		{
			serializer.write(this, writer);
		} catch (Exception e)
		{
			return MSG_TOSTRING_ERROR;
		}
		return writer.toString();
	}

	/* Private Methods */
	@Override
	protected void onLoad()
	{
		try
		{
			processUsers();
			processMedia();
		} catch (CMLValidationException e)
		{
			System.err.println("Error --- " + e.getMessage());
		}
	}

	private void processUsers() throws CMLValidationException
	{
		// Make user definitions
		for (IsAttached isAttached : _isAttachedList)
		{
			// Retrieve person and device
			Person person = getPersonById(isAttached.getPersonID());
			Device device = getDeviceById(isAttached.getDeviceID());
			
			// Error checking
			if (person == null)
				throw new CMLValidationException(String.format(
						MSG_ELEMENT_DOES_NOT_EXIST, Person.class
								.getSimpleName(), isAttached.getPersonID()));
			if (device == null)
				throw new CMLValidationException(String.format(
						MSG_ELEMENT_DOES_NOT_EXIST, Device.class
								.getSimpleName(), isAttached.getDeviceID()));
			
			// Add user to document
			UserDefinition user = new UserDefinition(person, isAttached, device);
			if(_localUser == null && user.isLocal())
			{
				_localUser = user;
				continue;
			}
			else if(_localUser != null && user.isLocal())
				throw new CMLValidationException(MSG_TOO_MANY_LOCAL);
			else
				_remoteUsers.add(user);
		}
		
	}

	private void processMedia()
	{
		for(Connection connection : _connectionList)
			connection.initializeMedia(_mediumList);
	}
	
	private Person getPersonById(String id)
	{
		for (Person person : _personList)
			if (person.getID().equals(id))
				return person;
		return null;
	}

	private Device getDeviceById(String id)
	{
		for (Connection connection : _connectionList)
			for (Device device : connection.getDevices())
				if (device.getID().equals(id))
					return device;
		return null;
	}
}
