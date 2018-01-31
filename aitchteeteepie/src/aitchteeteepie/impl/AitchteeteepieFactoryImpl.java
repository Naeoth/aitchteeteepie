/**
 */
package aitchteeteepie.impl;

import aitchteeteepie.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AitchteeteepieFactoryImpl extends EFactoryImpl implements AitchteeteepieFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AitchteeteepieFactory init() {
		try {
			AitchteeteepieFactory theAitchteeteepieFactory = (AitchteeteepieFactory)EPackage.Registry.INSTANCE.getEFactory(AitchteeteepiePackage.eNS_URI);
			if (theAitchteeteepieFactory != null) {
				return theAitchteeteepieFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AitchteeteepieFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AitchteeteepieFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AitchteeteepiePackage.FORM_FILE_FIELD_ITEM: return createFormFileFieldItem();
			case AitchteeteepiePackage.PROXY_FLAG: return createProxyFlag();
			case AitchteeteepiePackage.FORM_FLAG: return createFormFlag();
			case AitchteeteepiePackage.AUTH_FLAG: return createAuthFlag();
			case AitchteeteepiePackage.DOWNLOAD_FLAG: return createDownloadFlag();
			case AitchteeteepiePackage.BODY_FLAG: return createBodyFlag();
			case AitchteeteepiePackage.JSON_BOOLEAN: return createJsonBoolean();
			case AitchteeteepiePackage.VERSION_FLAG: return createVersionFlag();
			case AitchteeteepiePackage.DATA_FIELD_ITEM: return createDataFieldItem();
			case AitchteeteepiePackage.JSON_FLAG: return createJsonFlag();
			case AitchteeteepiePackage.HTTP_HEADER_ITEM: return createHttpHeaderItem();
			case AitchteeteepiePackage.JSON_OBJECT: return createJsonObject();
			case AitchteeteepiePackage.HELP_FLAG: return createHelpFlag();
			case AitchteeteepiePackage.HEADERS_FLAG: return createHeadersFlag();
			case AitchteeteepiePackage.URL_PARAMETER_ITEM: return createUrlParameterItem();
			case AitchteeteepiePackage.JSON_ARRAY: return createJsonArray();
			case AitchteeteepiePackage.VERBOSE_FLAG: return createVerboseFlag();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE: return createCommandLineInterface();
			case AitchteeteepiePackage.JSON_NUMBER: return createJsonNumber();
			case AitchteeteepiePackage.TIMEOUT_FLAG: return createTimeoutFlag();
			case AitchteeteepiePackage.RAW_JSON_FIELD_ITEM: return createRawJsonFieldItem();
			case AitchteeteepiePackage.JSON_STRING: return createJsonString();
			case AitchteeteepiePackage.JSON_NULL: return createJsonNull();
			case AitchteeteepiePackage.MEMBER: return createMember();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AitchteeteepiePackage.METHOD:
				return createMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AitchteeteepiePackage.METHOD:
				return convertMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFileFieldItem createFormFileFieldItem() {
		FormFileFieldItemImpl formFileFieldItem = new FormFileFieldItemImpl();
		return formFileFieldItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProxyFlag createProxyFlag() {
		ProxyFlagImpl proxyFlag = new ProxyFlagImpl();
		return proxyFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormFlag createFormFlag() {
		FormFlagImpl formFlag = new FormFlagImpl();
		return formFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthFlag createAuthFlag() {
		AuthFlagImpl authFlag = new AuthFlagImpl();
		return authFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DownloadFlag createDownloadFlag() {
		DownloadFlagImpl downloadFlag = new DownloadFlagImpl();
		return downloadFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyFlag createBodyFlag() {
		BodyFlagImpl bodyFlag = new BodyFlagImpl();
		return bodyFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonBoolean createJsonBoolean() {
		JsonBooleanImpl jsonBoolean = new JsonBooleanImpl();
		return jsonBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionFlag createVersionFlag() {
		VersionFlagImpl versionFlag = new VersionFlagImpl();
		return versionFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFieldItem createDataFieldItem() {
		DataFieldItemImpl dataFieldItem = new DataFieldItemImpl();
		return dataFieldItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonFlag createJsonFlag() {
		JsonFlagImpl jsonFlag = new JsonFlagImpl();
		return jsonFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpHeaderItem createHttpHeaderItem() {
		HttpHeaderItemImpl httpHeaderItem = new HttpHeaderItemImpl();
		return httpHeaderItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonObject createJsonObject() {
		JsonObjectImpl jsonObject = new JsonObjectImpl();
		return jsonObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpFlag createHelpFlag() {
		HelpFlagImpl helpFlag = new HelpFlagImpl();
		return helpFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadersFlag createHeadersFlag() {
		HeadersFlagImpl headersFlag = new HeadersFlagImpl();
		return headersFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UrlParameterItem createUrlParameterItem() {
		UrlParameterItemImpl urlParameterItem = new UrlParameterItemImpl();
		return urlParameterItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonArray createJsonArray() {
		JsonArrayImpl jsonArray = new JsonArrayImpl();
		return jsonArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerboseFlag createVerboseFlag() {
		VerboseFlagImpl verboseFlag = new VerboseFlagImpl();
		return verboseFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLineInterface createCommandLineInterface() {
		CommandLineInterfaceImpl commandLineInterface = new CommandLineInterfaceImpl();
		return commandLineInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonNumber createJsonNumber() {
		JsonNumberImpl jsonNumber = new JsonNumberImpl();
		return jsonNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeoutFlag createTimeoutFlag() {
		TimeoutFlagImpl timeoutFlag = new TimeoutFlagImpl();
		return timeoutFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawJsonFieldItem createRawJsonFieldItem() {
		RawJsonFieldItemImpl rawJsonFieldItem = new RawJsonFieldItemImpl();
		return rawJsonFieldItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonString createJsonString() {
		JsonStringImpl jsonString = new JsonStringImpl();
		return jsonString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonNull createJsonNull() {
		JsonNullImpl jsonNull = new JsonNullImpl();
		return jsonNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method createMethodFromString(EDataType eDataType, String initialValue) {
		Method result = Method.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AitchteeteepiePackage getAitchteeteepiePackage() {
		return (AitchteeteepiePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AitchteeteepiePackage getPackage() {
		return AitchteeteepiePackage.eINSTANCE;
	}

} //AitchteeteepieFactoryImpl
