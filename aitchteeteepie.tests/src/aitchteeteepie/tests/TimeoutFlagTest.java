/**
 */
package aitchteeteepie.tests;

import aitchteeteepie.AitchteeteepieFactory;
import aitchteeteepie.TimeoutFlag;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timeout Flag</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeoutFlagTest extends FlagTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeoutFlagTest.class);
	}

	/**
	 * Constructs a new Timeout Flag test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeoutFlagTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timeout Flag test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeoutFlag getFixture() {
		return (TimeoutFlag)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AitchteeteepieFactory.eINSTANCE.createTimeoutFlag());
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

} //TimeoutFlagTest
