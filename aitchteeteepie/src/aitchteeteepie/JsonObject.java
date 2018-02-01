/**
 */
package aitchteeteepie;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link aitchteeteepie.JsonObject#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see aitchteeteepie.AitchteeteepiePackage#getJsonObject()
 * @model
 * @generated
 */
public interface JsonObject extends JsonType {

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link aitchteeteepie.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see aitchteeteepie.AitchteeteepiePackage#getJsonObject_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();
} // JsonObject
