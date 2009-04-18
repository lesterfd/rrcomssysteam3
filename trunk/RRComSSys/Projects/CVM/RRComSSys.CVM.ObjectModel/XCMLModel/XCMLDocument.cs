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
	public class XCMLDocument : CMLDocument
	{
		#region Member Variables
		private UserDefinition _localUser;
		private String _communicationID;
		private List<Connection> _connectionList = new List<Connection>();
		private List<Medium> _mediumList = new List<Medium>();
		private List<Person> _personList = new List<Person>();
		private List<IsAttached> _isAttachedList = new List<IsAttached>();
		private List<UserDefinition> _remoteUsers = new List<UserDefinition>();
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

		#endregion

		#region Public Methods
		#endregion

		#region Private Methods
		protected override void OnLoad()
		{
			try
			{
				processUsers();
				processMedia();
			}
			catch (CMLValidationException e)
			{
				Debug.WriteLine("Error --- " + e.Message);
			}
		}

		private void processUsers()
		{
			// Make user definitions
			foreach (IsAttached isAttached in _isAttachedList)
			{
				// Retrieve person and device
				Person person = getPersonById(isAttached.PersonID);
				Device device = getDeviceById(isAttached.DeviceID);

				// Error checking
				if (person == null)
					throw new CMLValidationException(String.Format(
							Constants.Messages.MSG_ELEMENT_DOES_NOT_EXIST, typeof(Person).Name, isAttached.PersonID));
				if (device == null)
					throw new CMLValidationException(String.Format(
							Constants.Messages.MSG_ELEMENT_DOES_NOT_EXIST, typeof(Device).Name, isAttached.DeviceID));

				// Add user to document
				UserDefinition user = new UserDefinition(person, isAttached, device);
				if (_localUser == null && user.IsLocal)
				{
					_localUser = user;
					continue;
				}
				else if (_localUser != null && user.IsLocal)
					throw new CMLValidationException(Constants.Messages.MSG_TOO_MANY_LOCAL);
				else
					_remoteUsers.Add(user);
			}
		}

		private void processMedia()
		{
			foreach (Connection connection in _connectionList)
				connection.InitializeMedia(_mediumList);
		}

		private Person getPersonById(String id)
		{
			foreach (Person person in _personList)
				if (person.ID.Equals(id))
					return person;
			return null;
		}

		private Device getDeviceById(String id)
		{
			foreach (Connection connection in _connectionList)
				foreach (Device device in connection.Devices)
					if (device.ID.Equals(id))
						return device;
			return null;
		}
		#endregion
	}
}
