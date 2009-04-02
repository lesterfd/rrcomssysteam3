/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Attached</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCML.IsAttached#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link GCML.IsAttached#getPersonID <em>Person ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getIsAttached()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
public interface IsAttached extends Shape {
	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' reference.
	 * @see #setDeviceID(Device)
	 * @see GCML.GCMLPackage#getIsAttached_DeviceID()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='DeviceID' namespace=''"
	 * @generated
	 */
	Device getDeviceID();

	/**
	 * Sets the value of the '{@link GCML.IsAttached#getDeviceID <em>Device ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' reference.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(Device value);

	/**
	 * Returns the value of the '<em><b>Person ID</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person ID</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person ID</em>' reference.
	 * @see #setPersonID(Person)
	 * @see GCML.GCMLPackage#getIsAttached_PersonID()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='PersonID'"
	 * @generated
	 */
	Person getPersonID();

	/**
	 * Sets the value of the '{@link GCML.IsAttached#getPersonID <em>Person ID</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person ID</em>' reference.
	 * @see #getPersonID()
	 * @generated
	 */
	void setPersonID(Person value);

} // IsAttached
