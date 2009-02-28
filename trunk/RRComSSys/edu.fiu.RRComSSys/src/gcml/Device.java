/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Device#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link gcml.Device#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getDevice()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface Device extends Shape {
	/**
	 * Returns the value of the '<em><b>Device ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device ID</em>' attribute.
	 * @see #setDeviceID(long)
	 * @see gcml.GcmlPackage#getDevice_DeviceID()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	long getDeviceID();

	/**
	 * Sets the value of the '{@link gcml.Device#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(long value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference list.
	 * The list contents are of type {@link gcml.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference list.
	 * @see gcml.GcmlPackage#getDevice_Capabilities()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='Capabilities' namespace=''"
	 * @generated
	 */
	EList<Capability> getCapabilities();

} // Device
