/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCML.Device#getDeviceID <em>Device ID</em>}</li>
 *   <li>{@link GCML.Device#getCapability <em>Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getDevice()
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
	 * @see GCML.GCMLPackage#getDevice_DeviceID()
	 * @model id="true" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	long getDeviceID();

	/**
	 * Sets the value of the '{@link GCML.Device#getDeviceID <em>Device ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device ID</em>' attribute.
	 * @see #getDeviceID()
	 * @generated
	 */
	void setDeviceID(long value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference list.
	 * The list contents are of type {@link GCML.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference list.
	 * @see GCML.GCMLPackage#getDevice_Capability()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='Capabilities' namespace=''"
	 * @generated
	 */
	EList<Capability> getCapability();

} // Device
