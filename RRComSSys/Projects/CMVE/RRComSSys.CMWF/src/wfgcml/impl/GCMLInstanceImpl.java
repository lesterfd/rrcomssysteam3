/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import wfgcml.GCMLInstance;
import wfgcml.IsNext;
import wfgcml.WfgcmlPackage;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCML Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wfgcml.impl.GCMLInstanceImpl#getNext <em>Next</em>}</li>
 *   <li>{@link wfgcml.impl.GCMLInstanceImpl#getGCMLLoc <em>GCML Loc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GCMLInstanceImpl extends EObjectImpl implements GCMLInstance {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected IsNext next;

	/**
	 * The default value of the '{@link #getGCMLLoc() <em>GCML Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCMLLoc()
	 * @generated
	 * @ordered
	 */
	protected static final String GCML_LOC_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getGCMLLoc() <em>GCML Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCMLLoc()
	 * @generated
	 * @ordered
	 */
	protected String gcmlLoc = GCML_LOC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	protected GCMLInstanceImpl()
	{
		super();
		Shell s = new Shell();
	    FileDialog fd = new FileDialog(s, SWT.OPEN);
	    fd.setText("Select GCML path");
	    //fd.setFilterPath("H:/");
	    String[] filterExt = {"*.gcml"};
	    fd.setFilterExtensions(filterExt);
	    String selected = fd.open();
	    setGCMLLoc(selected);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfgcmlPackage.Literals.GCML_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNext getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (IsNext)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfgcmlPackage.GCML_INSTANCE__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsNext basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(IsNext newNext) {
		IsNext oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfgcmlPackage.GCML_INSTANCE__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGCMLLoc() {
		return gcmlLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGCMLLoc(String newGCMLLoc) {
		String oldGCMLLoc = gcmlLoc;
		gcmlLoc = newGCMLLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfgcmlPackage.GCML_INSTANCE__GCML_LOC, oldGCMLLoc, gcmlLoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WfgcmlPackage.GCML_INSTANCE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case WfgcmlPackage.GCML_INSTANCE__GCML_LOC:
				return getGCMLLoc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WfgcmlPackage.GCML_INSTANCE__NEXT:
				setNext((IsNext)newValue);
				return;
			case WfgcmlPackage.GCML_INSTANCE__GCML_LOC:
				setGCMLLoc((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WfgcmlPackage.GCML_INSTANCE__NEXT:
				setNext((IsNext)null);
				return;
			case WfgcmlPackage.GCML_INSTANCE__GCML_LOC:
				setGCMLLoc(GCML_LOC_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WfgcmlPackage.GCML_INSTANCE__NEXT:
				return next != null;
			case WfgcmlPackage.GCML_INSTANCE__GCML_LOC:
				return GCML_LOC_EDEFAULT == null ? gcmlLoc != null : !GCML_LOC_EDEFAULT.equals(gcmlLoc);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (GCMLLoc: ");
		result.append(gcmlLoc);
		result.append(')');
		return result.toString();
	}

} //GCMLInstanceImpl
