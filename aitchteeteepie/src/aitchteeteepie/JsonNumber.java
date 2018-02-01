/**
 */
package aitchteeteepie;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aitchteeteepie.JsonNumber#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see aitchteeteepie.AitchteeteepiePackage#getJsonNumber()
 * @model
 * @generated
 */
public interface JsonNumber extends JsonType {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see aitchteeteepie.AitchteeteepiePackage#getJsonNumber_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link aitchteeteepie.JsonNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);
} // JsonNumber
