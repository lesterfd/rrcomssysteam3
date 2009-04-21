using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Xml.Serialization;
using System.Xml.Schema;
using System.Diagnostics;
using RRComSSys.CVM.Common;

namespace RRComSSys.CVM.ObjectModel.XCMLModel
{
	[XmlTypeAttribute(AnonymousType = true)]
	[XmlRoot(ElementName = "UserSchema", Namespace = "", IsNullable = false)]
	public class XCMLDocument : CMLDocument, IXCMLContainer
	{
		#region Member Variables
		private UserDefinition _localUser;
		private String _communicationID;
		private List<Connection> _connectionList = new List<Connection>();
		private List<Medium> _mediumList = new List<Medium>();
		private List<Person> _personList = new List<Person>();
		private List<IsAttached> _isAttachedList = new List<IsAttached>();
		private List<UserDefinition> _remoteUsers = new List<UserDefinition>();
		private List<IXCMLItem> _allItems = new List<IXCMLItem>();
		#endregion

		#region Properties
		[XmlAttribute(AttributeName = "communicationID", Form = XmlSchemaForm.Unqualified)]
		public String CommunicationID
		{
			get { return _communicationID; }
			set { _communicationID = value; }
		}

		[XmlElement(ElementName = "connection", Form = XmlSchemaForm.Unqualified)]
		public List<Connection> Connections
		{
			get { return _connectionList; }
			set { _connectionList = value; }
		}

		[XmlElement(ElementName = "mediumType", Form = XmlSchemaForm.Unqualified)]
		public List<Medium> AllMedia
		{
			get { return _mediumList; }
			set { _mediumList = value; }
		}

		[XmlElement(ElementName = "person", Form = XmlSchemaForm.Unqualified)]
		public List<Person> People
		{
			get { return _personList; }
			set { _personList = value; }
		}

		[XmlElement(ElementName = "isAttached", Form = XmlSchemaForm.Unqualified)]
		public List<IsAttached> IsAttached
		{
			get { return _isAttachedList; }
			set { _isAttachedList = value; }
		}

		[XmlIgnore]
		public UserDefinition LocalUser
		{
			get { return _localUser; }
		}

		[XmlIgnore]
		public List<UserDefinition> RemoteUsers
		{
			get { return _remoteUsers; }
		}

		[XmlIgnore]
		public List<UserDefinition> AllUsers
		{
			get
			{
				List<UserDefinition> result = new List<UserDefinition>();
				if (_localUser != null)
					result.Add(_localUser);
				result.AddRange(_remoteUsers);
				return result;
			}
		}

		[XmlIgnore]
		public List<IXCMLItem> AllItems
		{
			get { return _allItems; }
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
		protected override void OnLoad()
		{
			try
			{
				PreProcessItems();
				ProcessUsers();
				ProcessMedia();
			}
			catch (CMLValidationException e)
			{
				Debug.WriteLine("Error --- " + e.Message);
			}
		}

		private void PreProcessItems()
		{
			foreach (Person person in _personList)
				_allItems.Add(person);
			foreach (Medium medium in _mediumList)
				_allItems.Add(medium);
			foreach (IsAttached isAttached in _isAttachedList)
				_allItems.Add(isAttached);
			foreach (Connection conn in _connectionList)
			{
				foreach (Device device in conn.Devices)
					_allItems.Add(device);
				_allItems.Add(conn);
			}
		}

		private void ProcessUsers()
		{
			// Make user definitions
			foreach (IsAttached isAttached in _isAttachedList)
			{
				// Retrieve person and device
				Person person = FindItem<Person>(p => p.ID == isAttached.PersonID);
				Device device = FindItem<Device>(d => d.ID == isAttached.DeviceID);

				// Error checking
				if (person == null)
					throw new CMLValidationException(String.Format(
							Constants.Messages.MSG_ELEMENT_DOES_NOT_EXIST, typeof(Person).Name, isAttached.PersonID));
				if (device == null)
					throw new CMLValidationException(String.Format(
							Constants.Messages.MSG_ELEMENT_DOES_NOT_EXIST, typeof(Device).Name, isAttached.DeviceID));

				// Add user to document
				UserDefinition user = new UserDefinition(person, isAttached, device);
				_allItems.Add(user);
				if (_localUser == null && user.IsLocal)
					_localUser = user;
				else if (_localUser != null && user.IsLocal)
					throw new CMLValidationException(Constants.Messages.MSG_TOO_MANY_LOCAL);
				else
					_remoteUsers.Add(user);
			}
		}

		private void ProcessMedia()
		{
			foreach (Connection connection in _connectionList)
				connection.InitializeReferences(this);
		}
		#endregion
	}
}
