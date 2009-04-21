using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	public class Connection : IXCMLContainer, IXCMLItem
	{
		#region Member Variables
		private String _id = "";
		private String _bandwidth = "";
		private List<Device> _deviceList = new List<Device>();
		private List<String> _mediaRefList = new List<String>();
		private List<Medium> _media = new List<Medium>();
		private List<IXCMLItem> _allItems = new List<IXCMLItem>();
		private List<UserDefinition> _remoteUsers = new List<UserDefinition>();
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
		
		[XmlIgnore]
		public List<UserDefinition> RemoteUsers
		{
			get { return _remoteUsers; }
		}
		#endregion

		#region Public Methods
		public TXCMLItem FindItem<TXCMLItem>(Predicate<TXCMLItem> predicate)
			where TXCMLItem : IXCMLItem
		{
			foreach (IXCMLItem item in _allItems)
				if (item.GetType() == typeof(TXCMLItem) && 
					predicate((TXCMLItem) item))
					return (TXCMLItem) item;
			return default(TXCMLItem);
		}

		public List<TXCMLItem> FindItems<TXCMLItem>(Predicate<TXCMLItem> predicate) 
			where TXCMLItem : IXCMLItem
		{
			List<TXCMLItem> result = new List<TXCMLItem>();
			foreach (IXCMLItem item in _allItems)
				if (item.GetType() == typeof(TXCMLItem) &&
					predicate((TXCMLItem) item))
					result.Add((TXCMLItem) item);
			return result;
		}

		public bool Contains<TXCMLItem>(Predicate<TXCMLItem> predicate)
			where TXCMLItem : IXCMLItem
		{
			return FindItem<TXCMLItem>(predicate) != null;
		}
		#endregion

		#region Private Methods
		internal void InitializeReferences(XCMLDocument doc)
		{
			foreach (String mediaRef in _mediaRefList)
			{
				Medium medium = doc.FindItem<Medium>(m => m.Name == mediaRef);
				if (medium == null)
					continue;
				_media.Add(medium);
				_allItems.Add(medium);
			}

			foreach (Device device in _deviceList)
				_allItems.Add(device);

			foreach (UserDefinition user in doc.FindItems<UserDefinition>(u => Devices.Contains(u.Device)))
			{
				_allItems.Add(user);
				if (!user.IsLocal) 
					_remoteUsers.Add(user);
			}
		}
		#endregion
	}
}
