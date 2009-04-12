/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wfgcml.GCMLInstance;
import wfgcml.WfgcmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GCML Instance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GCMLInstanceTest extends TestCase {

	/**
	 * The fixture for this GCML Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCMLInstance fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GCMLInstanceTest.class);
	}

	/**
	 * Constructs a new GCML Instance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCMLInstanceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this GCML Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GCMLInstance fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this GCML Instance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCMLInstance getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WfgcmlFactory.eINSTANCE.createGCMLInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GCMLInstanceTest
