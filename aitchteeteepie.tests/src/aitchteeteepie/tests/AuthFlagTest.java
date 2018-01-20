/**
 */
package aitchteeteepie.tests;

import aitchteeteepie.AitchteeteepieFactory;
import aitchteeteepie.AuthFlag;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Auth Flag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthFlagTest extends FlagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AuthFlagTest.class);
	}

	/**
	 * Constructs a new Auth Flag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthFlagTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Auth Flag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AuthFlag getFixture() {
		return (AuthFlag)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AitchteeteepieFactory.eINSTANCE.createAuthFlag());
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

} //AuthFlagTest
