/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package wfgcml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wfgcml.Final;
import wfgcml.WfgcmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Final</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinalTest extends TestCase {

	/**
	 * The fixture for this Final test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Final fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FinalTest.class);
	}

	/**
	 * Constructs a new Final test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Final test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Final fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Final test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Final getFixture() {
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
		setFixture(WfgcmlFactory.eINSTANCE.createFinal());
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

} //FinalTest
