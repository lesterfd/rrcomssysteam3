/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package gcml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gcml.Capability#getBuiltInType <em>Built In Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see gcml.GcmlPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends Shape {
	/**
	 * Returns the value of the '<em><b>Built In Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Built In Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Built In Type</em>' attribute.
	 * @see #setBuiltInType(String)
	 * @see gcml.GcmlPackage#getCapability_BuiltInType()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getBuiltInType();

	/**
	 * Sets the value of the '{@link gcml.Capability#getBuiltInType <em>Built In Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Built In Type</em>' attribute.
	 * @see #getBuiltInType()
	 * @generated
	 */
	void setBuiltInType(String value);

} // Capability
