/**
 */
package aitchteeteepie.tests;

import aitchteeteepie.AitchteeteepieFactory;
import aitchteeteepie.JsonNull;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Json Null</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonNullTest extends JsonTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JsonNullTest.class);
	}

	/**
	 * Constructs a new Json Null test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonNullTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Json Null test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JsonNull getFixture() {
		return (JsonNull)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AitchteeteepieFactory.eINSTANCE.createJsonNull());
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

} //JsonNullTest
