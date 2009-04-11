package edu.fiu.cis.rrcomssys.cvm.mte.xcmlmodel;

import java.util.LinkedList;
import java.util.List;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;

public class Connection
{
	/* Attributes */
	@Attribute(name = "connectionID", required = true)
	private String _id = "";

	@Attribute(name = "bandwidth", required = false)
	private String _bandwidth = "";

	/* Elements */
	@ElementList(entry = "device", inline = true, required = false)
	private List<Device> _deviceList = new LinkedList<Device>();

	@ElementList(entry = "mediumTypeNameRef", inline = true, required = false)
	private List<String> _mediaRefList = new LinkedList<String>();

//	@ElementList(entry = "formTypeNameRef", inline = true, required = false)
//	private List<String> _formRefList = new LinkedList<String>();

	/* Member Variables */
	private List<Medium> _media = new LinkedList<Medium>();

	/* Constructors & Initializers */
	public Connection()
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

	public String getBandwidth()
	{
		return _bandwidth;
	}

	public void setBandwidth(String value)
	{
		_bandwidth = value;
	}

	public List<Device> getDevices()
	{
		return _deviceList;
	}

	public List<Medium> getMedia()
	{
		return _media;
	}

	/* Private Methods */
	void initializeMedia(List<Medium> media)
	{
		for (String mediaRef : _mediaRefList)
		{
			Medium medium = getMediumByName(media, mediaRef);
			if(medium==null)
				continue;
			_media.add(medium);
		}
	}

	private Medium getMediumByName(List<Medium> mediumList, String name)
	{
		for (Medium medium : mediumList)
			if (medium.getName().equals(name))
				return medium;
		return null;
	}
}
