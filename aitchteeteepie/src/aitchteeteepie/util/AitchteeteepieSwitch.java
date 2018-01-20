/**
 */
package aitchteeteepie.util;

import aitchteeteepie.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see aitchteeteepie.AitchteeteepiePackage
 * @generated
 */
public class AitchteeteepieSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AitchteeteepiePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AitchteeteepieSwitch() {
		if (modelPackage == null) {
			modelPackage = AitchteeteepiePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AitchteeteepiePackage.JSON_TYPE: {
				JsonType jsonType = (JsonType)theEObject;
				T result = caseJsonType(jsonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.FORM_FILE_FIELD_ITEM: {
				FormFileFieldItem formFileFieldItem = (FormFileFieldItem)theEObject;
				T result = caseFormFileFieldItem(formFileFieldItem);
				if (result == null) result = caseItem(formFileFieldItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.PROXY_FLAG: {
				ProxyFlag proxyFlag = (ProxyFlag)theEObject;
				T result = caseProxyFlag(proxyFlag);
				if (result == null) result = caseFlag(proxyFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.DATA_TYPE_FLAG: {
				DataTypeFlag dataTypeFlag = (DataTypeFlag)theEObject;
				T result = caseDataTypeFlag(dataTypeFlag);
				if (result == null) result = caseFlag(dataTypeFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.FORM_FLAG: {
				FormFlag formFlag = (FormFlag)theEObject;
				T result = caseFormFlag(formFlag);
				if (result == null) result = caseDataTypeFlag(formFlag);
				if (result == null) result = caseFlag(formFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.AUTH_FLAG: {
				AuthFlag authFlag = (AuthFlag)theEObject;
				T result = caseAuthFlag(authFlag);
				if (result == null) result = caseFlag(authFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.DOWNLOAD_FLAG: {
				DownloadFlag downloadFlag = (DownloadFlag)theEObject;
				T result = caseDownloadFlag(downloadFlag);
				if (result == null) result = caseFlag(downloadFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.BODY_FLAG: {
				BodyFlag bodyFlag = (BodyFlag)theEObject;
				T result = caseBodyFlag(bodyFlag);
				if (result == null) result = caseResponseFlag(bodyFlag);
				if (result == null) result = caseFlag(bodyFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.JSON_BOOLEAN: {
				JsonBoolean jsonBoolean = (JsonBoolean)theEObject;
				T result = caseJsonBoolean(jsonBoolean);
				if (result == null) result = caseJsonType(jsonBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.VERSION_FLAG: {
				VersionFlag versionFlag = (VersionFlag)theEObject;
				T result = caseVersionFlag(versionFlag);
				if (result == null) result = caseFlag(versionFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.DATA_FIELD_ITEM: {
				DataFieldItem dataFieldItem = (DataFieldItem)theEObject;
				T result = caseDataFieldItem(dataFieldItem);
				if (result == null) result = caseItem(dataFieldItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.RESPONSE_FLAG: {
				ResponseFlag responseFlag = (ResponseFlag)theEObject;
				T result = caseResponseFlag(responseFlag);
				if (result == null) result = caseFlag(responseFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.JSON_FLAG: {
				JsonFlag jsonFlag = (JsonFlag)theEObject;
				T result = caseJsonFlag(jsonFlag);
				if (result == null) result = caseDataTypeFlag(jsonFlag);
				if (result == null) result = caseFlag(jsonFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.HTTP_HEADER_ITEM: {
				HttpHeaderItem httpHeaderItem = (HttpHeaderItem)theEObject;
				T result = caseHttpHeaderItem(httpHeaderItem);
				if (result == null) result = caseItem(httpHeaderItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.JSON_OBJECT: {
				JsonObject jsonObject = (JsonObject)theEObject;
				T result = caseJsonObject(jsonObject);
				if (result == null) result = caseJsonType(jsonObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.HELP_FLAG: {
				HelpFlag helpFlag = (HelpFlag)theEObject;
				T result = caseHelpFlag(helpFlag);
				if (result == null) result = caseFlag(helpFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.HEADERS_FLAG: {
				HeadersFlag headersFlag = (HeadersFlag)theEObject;
				T result = caseHeadersFlag(headersFlag);
				if (result == null) result = caseResponseFlag(headersFlag);
				if (result == null) result = caseFlag(headersFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.URL_PARAMETER_ITEM: {
				UrlParameterItem urlParameterItem = (UrlParameterItem)theEObject;
				T result = caseUrlParameterItem(urlParameterItem);
				if (result == null) result = caseItem(urlParameterItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.JSON_ARRAY: {
				JsonArray jsonArray = (JsonArray)theEObject;
				T result = caseJsonArray(jsonArray);
				if (result == null) result = caseJsonType(jsonArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.VERBOSE_FLAG: {
				VerboseFlag verboseFlag = (VerboseFlag)theEObject;
				T result = caseVerboseFlag(verboseFlag);
				if (result == null) result = caseFlag(verboseFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.FLAG: {
				Flag flag = (Flag)theEObject;
				T result = caseFlag(flag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE: {
				CommandLineInterface commandLineInterface = (CommandLineInterface)theEObject;
				T result = caseCommandLineInterface(commandLineInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.JSON_NUMBER: {
				JsonNumber jsonNumber = (JsonNumber)theEObject;
				T result = caseJsonNumber(jsonNumber);
				if (result == null) result = caseJsonType(jsonNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.TIMEOUT_FLAG: {
				TimeoutFlag timeoutFlag = (TimeoutFlag)theEObject;
				T result = caseTimeoutFlag(timeoutFlag);
				if (result == null) result = caseFlag(timeoutFlag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AitchteeteepiePackage.RAW_JSON_FIELD_ITEM: {
				RawJsonFieldItem rawJsonFieldItem = (RawJsonFieldItem)theEObject;
				T result = caseRawJsonFieldItem(rawJsonFieldItem);
				if (result == null) result = caseItem(rawJsonFieldItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonType(JsonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form File Field Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form File Field Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormFileFieldItem(FormFileFieldItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proxy Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proxy Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProxyFlag(ProxyFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeFlag(DataTypeFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormFlag(FormFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auth Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auth Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthFlag(AuthFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Download Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Download Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDownloadFlag(DownloadFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyFlag(BodyFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonBoolean(JsonBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionFlag(VersionFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Field Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Field Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFieldItem(DataFieldItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseFlag(ResponseFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonFlag(JsonFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Header Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Header Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpHeaderItem(HttpHeaderItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonObject(JsonObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Help Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Help Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelpFlag(HelpFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Headers Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Headers Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadersFlag(HeadersFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Parameter Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Parameter Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlParameterItem(UrlParameterItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonArray(JsonArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbose Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbose Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerboseFlag(VerboseFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlag(Flag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Line Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Line Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandLineInterface(CommandLineInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Json Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Json Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJsonNumber(JsonNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout Flag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout Flag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeoutFlag(TimeoutFlag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Raw Json Field Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Raw Json Field Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRawJsonFieldItem(RawJsonFieldItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AitchteeteepieSwitch
