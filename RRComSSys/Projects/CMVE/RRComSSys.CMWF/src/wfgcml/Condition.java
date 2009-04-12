/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfgcml.Condition#getAltnext <em>Altnext</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfgcml.WfgcmlPackage#getCondition()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface Condition extends HasNext, IsNext {
	/**
	 * Returns the value of the '<em><b>Altnext</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altnext</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altnext</em>' reference.
	 * @see #setAltnext(IsNext)
	 * @see wfgcml.WfgcmlPackage#getCondition_Altnext()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	IsNext getAltnext();

	/**
	 * Sets the value of the '{@link wfgcml.Condition#getAltnext <em>Altnext</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altnext</em>' reference.
	 * @see #getAltnext()
	 * @generated
	 */
	void setAltnext(IsNext value);

} // Condition
