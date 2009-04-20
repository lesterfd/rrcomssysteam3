/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCML Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfgcml.GCMLInstance#getGCMLLoc <em>GCML Loc</em>}</li>
 *   <li>{@link wfgcml.GCMLInstance#getID <em>ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfgcml.WfgcmlPackage#getGCMLInstance()
 * @model extendedMetaData="kind='elementOnly'"
 * @generated
 */
public interface GCMLInstance extends HasNext, IsNext {
	/**
	 * Returns the value of the '<em><b>GCML Loc</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GCML Loc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GCML Loc</em>' attribute.
	 * @see #setGCMLLoc(String)
	 * @see wfgcml.WfgcmlPackage#getGCMLInstance_GCMLLoc()
	 * @model default="" required="true"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getGCMLLoc();

	/**
	 * Sets the value of the '{@link wfgcml.GCMLInstance#getGCMLLoc <em>GCML Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GCML Loc</em>' attribute.
	 * @see #getGCMLLoc()
	 * @generated
	 */
	void setGCMLLoc(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see wfgcml.WfgcmlPackage#getGCMLInstance_ID()
	 * @model id="true" required="true" changeable="false"
	 * @generated
	 */
	String getID();

} // GCMLInstance
