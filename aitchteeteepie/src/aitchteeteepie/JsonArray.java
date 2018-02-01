/**
 */
package aitchteeteepie;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aitchteeteepie.JsonArray#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see aitchteeteepie.AitchteeteepiePackage#getJsonArray()
 * @model
 * @generated
 */
public interface JsonArray extends JsonType {

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link aitchteeteepie.JsonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see aitchteeteepie.AitchteeteepiePackage#getJsonArray_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<JsonType> getValues();
} // JsonArray
