using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public class Connection
	{
		#region Member Variables
		private String _id = "";
		private String _bandwidth = "";
		private List<Device> _deviceList = new List<Device>();
		private List<String> _mediaRefList = new List<String>();
		private List<Medium> _media = new List<Medium>();
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "connectionID")]
		public String ID
		{
			get { return _id; }
			set { _id = value; }
		}

		[XmlAttribute(AttributeName = "bandwidth")]
		public String Bandwidth
		{
			get { return _bandwidth; }
			set { _bandwidth = value; }
		}

		[XmlElement(ElementName = "device")]
		public List<Device> Devices
		{
			get { return _deviceList; }
			set { _deviceList = value; }
		}

		[XmlElement(ElementName = "mediumTypeNameRef")]
		public List<String> MediaNameReferences
		{
			get { return _mediaRefList; }
			set { _mediaRefList = value; }
		}

		[XmlIgnore]
		public List<Medium> Media
		{
			get { return _media; }

		}
		#endregion

		#region Public Methods
		public Medium GetMediumByName(List<Medium> mediumList, String name)
		{
			foreach (Medium medium in mediumList)
				if (medium.Name.Equals(name))
					return medium;
			return null;
		}
		#endregion

		#region Private Methods
		internal void InitializeMedia(List<Medium> media)
		{
			foreach (String mediaRef in _mediaRefList)
			{
				Medium medium = GetMediumByName(media, mediaRef);
				if (medium == null)
					continue;
				_media.Add(medium);
			}
		}
		#endregion
	}
}
