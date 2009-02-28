/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Attached</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.IsAttached#getConnectToDevice <em>Connect To Device</em>}</li>
 *   <li>{@link gcml.IsAttached#getConnectToPerson <em>Connect To Person</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getIsAttached()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
public interface IsAttached extends Shape {
	/**
	 * Returns the value of the '<em><b>Connect To Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To Device</em>' reference.
	 * @see #setConnectToDevice(Device)
	 * @see gcml.GcmlPackage#getIsAttached_ConnectToDevice()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='DeviceID' namespace=''"
	 * @generated
	 */
	Device getConnectToDevice();

	/**
	 * Sets the value of the '{@link gcml.IsAttached#getConnectToDevice <em>Connect To Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To Device</em>' reference.
	 * @see #getConnectToDevice()
	 * @generated
	 */
	void setConnectToDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Connect To Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect To Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect To Person</em>' reference.
	 * @see #setConnectToPerson(Person)
	 * @see gcml.GcmlPackage#getIsAttached_ConnectToPerson()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='PersonID'"
	 * @generated
	 */
	Person getConnectToPerson();

	/**
	 * Sets the value of the '{@link gcml.IsAttached#getConnectToPerson <em>Connect To Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect To Person</em>' reference.
	 * @see #getConnectToPerson()
	 * @generated
	 */
	void setConnectToPerson(Person value);

} // IsAttached
