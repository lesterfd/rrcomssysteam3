/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Next</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfgcml.HasNext#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfgcml.WfgcmlPackage#getHasNext()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface HasNext extends EObject {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(IsNext)
	 * @see wfgcml.WfgcmlPackage#getHasNext_Next()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	IsNext getNext();

	/**
	 * Sets the value of the '{@link wfgcml.HasNext#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(IsNext value);

} // HasNext
