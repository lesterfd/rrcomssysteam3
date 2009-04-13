/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GCML.Person#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link GCML.Person#getPersonID <em>Person ID</em>}</li>
 *   <li>{@link GCML.Person#getPersonRole <em>Person Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see GCML.GCMLPackage#getPerson()
 * @model extendedMetaData="kind='empty'"
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Name</em>' attribute.
	 * @see #setPersonName(String)
	 * @see GCML.GCMLPackage#getPerson_PersonName()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getPersonName();

	/**
	 * Sets the value of the '{@link GCML.Person#getPersonName <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' attribute.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(String value);

	/**
	 * Returns the value of the '<em><b>Person ID</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person ID</em>' attribute.
	 * @see #isSetPersonID()
	 * @see #unsetPersonID()
	 * @see #setPersonID(String)
	 * @see GCML.GCMLPackage#getPerson_PersonID()
	 * @model default="" unsettable="true" id="true" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getPersonID();

	/**
	 * Sets the value of the '{@link GCML.Person#getPersonID <em>Person ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person ID</em>' attribute.
	 * @see #isSetPersonID()
	 * @see #unsetPersonID()
	 * @see #getPersonID()
	 * @generated
	 */
	void setPersonID(String value);

	/**
	 * Unsets the value of the '{@link GCML.Person#getPersonID <em>Person ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersonID()
	 * @see #getPersonID()
	 * @see #setPersonID(String)
	 * @generated
	 */
	void unsetPersonID();

	/**
	 * Returns whether the value of the '{@link GCML.Person#getPersonID <em>Person ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Person ID</em>' attribute is set.
	 * @see #unsetPersonID()
	 * @see #getPersonID()
	 * @see #setPersonID(String)
	 * @generated
	 */
	boolean isSetPersonID();

	/**
	 * Returns the value of the '<em><b>Person Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Role</em>' attribute.
	 * @see #setPersonRole(String)
	 * @see GCML.GCMLPackage#getPerson_PersonRole()
	 * @model unique="false" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getPersonRole();

	/**
	 * Sets the value of the '{@link GCML.Person#getPersonRole <em>Person Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Role</em>' attribute.
	 * @see #getPersonRole()
	 * @generated
	 */
	void setPersonRole(String value);

} // Person
