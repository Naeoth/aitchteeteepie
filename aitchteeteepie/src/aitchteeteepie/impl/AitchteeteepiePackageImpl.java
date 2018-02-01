/**
 */
package aitchteeteepie.impl;

import aitchteeteepie.AitchteeteepieFactory;
import aitchteeteepie.AitchteeteepiePackage;
import aitchteeteepie.AuthFlag;
import aitchteeteepie.BodyFlag;
import aitchteeteepie.CommandLineInterface;
import aitchteeteepie.DataFieldItem;
import aitchteeteepie.DataTypeFlag;
import aitchteeteepie.DownloadFlag;
import aitchteeteepie.Flag;
import aitchteeteepie.FormFileFieldItem;
import aitchteeteepie.FormFlag;
import aitchteeteepie.HeadersFlag;
import aitchteeteepie.HelpFlag;
import aitchteeteepie.HttpHeaderItem;
import aitchteeteepie.Item;
import aitchteeteepie.JsonArray;
import aitchteeteepie.JsonBoolean;
import aitchteeteepie.JsonFlag;
import aitchteeteepie.JsonNull;
import aitchteeteepie.JsonNumber;
import aitchteeteepie.JsonObject;
import aitchteeteepie.JsonString;
import aitchteeteepie.JsonType;
import aitchteeteepie.Member;
import aitchteeteepie.Method;
import aitchteeteepie.ProxyFlag;
import aitchteeteepie.RawJsonFieldItem;
import aitchteeteepie.ResponseFlag;
import aitchteeteepie.TimeoutFlag;
import aitchteeteepie.UrlParameterItem;
import aitchteeteepie.VerboseFlag;
import aitchteeteepie.VersionFlag;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AitchteeteepiePackageImpl extends EPackageImpl implements AitchteeteepiePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formFileFieldItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proxyFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downloadFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFieldItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpHeaderItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helpFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headersFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlParameterItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verboseFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandLineInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeoutFlagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawJsonFieldItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum methodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see aitchteeteepie.AitchteeteepiePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AitchteeteepiePackageImpl() {
		super(eNS_URI, AitchteeteepieFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AitchteeteepiePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AitchteeteepiePackage init() {
		if (isInited) return (AitchteeteepiePackage)EPackage.Registry.INSTANCE.getEPackage(AitchteeteepiePackage.eNS_URI);

		// Obtain or create and register package
		AitchteeteepiePackageImpl theAitchteeteepiePackage = (AitchteeteepiePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AitchteeteepiePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AitchteeteepiePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAitchteeteepiePackage.createPackageContents();

		// Initialize created meta-data
		theAitchteeteepiePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAitchteeteepiePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AitchteeteepiePackage.eNS_URI, theAitchteeteepiePackage);
		return theAitchteeteepiePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonType() {
		return jsonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormFileFieldItem() {
		return formFileFieldItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormFileFieldItem_Value() {
		return (EAttribute)formFileFieldItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProxyFlag() {
		return proxyFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyFlag_Protocol() {
		return (EAttribute)proxyFlagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyFlag_ProxyProtocol() {
		return (EAttribute)proxyFlagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyFlag_Username() {
		return (EAttribute)proxyFlagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyFlag_Password() {
		return (EAttribute)proxyFlagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyFlag_Hostname() {
		return (EAttribute)proxyFlagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProxyFlag_Port() {
		return (EAttribute)proxyFlagEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeFlag() {
		return dataTypeFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormFlag() {
		return formFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthFlag() {
		return authFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthFlag_Username() {
		return (EAttribute)authFlagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthFlag_Password() {
		return (EAttribute)authFlagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthFlag_Hostname() {
		return (EAttribute)authFlagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDownloadFlag() {
		return downloadFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyFlag() {
		return bodyFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonBoolean() {
		return jsonBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonBoolean_Value() {
		return (EAttribute)jsonBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionFlag() {
		return versionFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFieldItem() {
		return dataFieldItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataFieldItem_Value() {
		return (EAttribute)dataFieldItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseFlag() {
		return responseFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonFlag() {
		return jsonFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpHeaderItem() {
		return httpHeaderItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpHeaderItem_Value() {
		return (EAttribute)httpHeaderItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonObject() {
		return jsonObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsonObject_Members() {
		return (EReference)jsonObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelpFlag() {
		return helpFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadersFlag() {
		return headersFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlParameterItem() {
		return urlParameterItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlParameterItem_Value() {
		return (EAttribute)urlParameterItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonArray() {
		return jsonArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJsonArray_Values() {
		return (EReference)jsonArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerboseFlag() {
		return verboseFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlag() {
		return flagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandLineInterface() {
		return commandLineInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineInterface_Flags() {
		return (EReference)commandLineInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandLineInterface_Items() {
		return (EReference)commandLineInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLineInterface_Method() {
		return (EAttribute)commandLineInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLineInterface_Protocol() {
		return (EAttribute)commandLineInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLineInterface_Url() {
		return (EAttribute)commandLineInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLineInterface_Port() {
		return (EAttribute)commandLineInterfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandLineInterface_Resource() {
		return (EAttribute)commandLineInterfaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_Field() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonNumber() {
		return jsonNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonNumber_Value() {
		return (EAttribute)jsonNumberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeoutFlag() {
		return timeoutFlagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeoutFlag_Timeout() {
		return (EAttribute)timeoutFlagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRawJsonFieldItem() {
		return rawJsonFieldItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRawJsonFieldItem_Value() {
		return (EReference)rawJsonFieldItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonString() {
		return jsonStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonString_Value() {
		return (EAttribute)jsonStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonNull() {
		return jsonNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Value() {
		return (EReference)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Key() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMethod() {
		return methodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AitchteeteepieFactory getAitchteeteepieFactory() {
		return (AitchteeteepieFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jsonTypeEClass = createEClass(JSON_TYPE);

		formFileFieldItemEClass = createEClass(FORM_FILE_FIELD_ITEM);
		createEAttribute(formFileFieldItemEClass, FORM_FILE_FIELD_ITEM__VALUE);

		proxyFlagEClass = createEClass(PROXY_FLAG);
		createEAttribute(proxyFlagEClass, PROXY_FLAG__PROTOCOL);
		createEAttribute(proxyFlagEClass, PROXY_FLAG__PROXY_PROTOCOL);
		createEAttribute(proxyFlagEClass, PROXY_FLAG__USERNAME);
		createEAttribute(proxyFlagEClass, PROXY_FLAG__PASSWORD);
		createEAttribute(proxyFlagEClass, PROXY_FLAG__HOSTNAME);
		createEAttribute(proxyFlagEClass, PROXY_FLAG__PORT);

		dataTypeFlagEClass = createEClass(DATA_TYPE_FLAG);

		formFlagEClass = createEClass(FORM_FLAG);

		authFlagEClass = createEClass(AUTH_FLAG);
		createEAttribute(authFlagEClass, AUTH_FLAG__USERNAME);
		createEAttribute(authFlagEClass, AUTH_FLAG__PASSWORD);
		createEAttribute(authFlagEClass, AUTH_FLAG__HOSTNAME);

		downloadFlagEClass = createEClass(DOWNLOAD_FLAG);

		bodyFlagEClass = createEClass(BODY_FLAG);

		jsonBooleanEClass = createEClass(JSON_BOOLEAN);
		createEAttribute(jsonBooleanEClass, JSON_BOOLEAN__VALUE);

		versionFlagEClass = createEClass(VERSION_FLAG);

		dataFieldItemEClass = createEClass(DATA_FIELD_ITEM);
		createEAttribute(dataFieldItemEClass, DATA_FIELD_ITEM__VALUE);

		responseFlagEClass = createEClass(RESPONSE_FLAG);

		jsonFlagEClass = createEClass(JSON_FLAG);

		httpHeaderItemEClass = createEClass(HTTP_HEADER_ITEM);
		createEAttribute(httpHeaderItemEClass, HTTP_HEADER_ITEM__VALUE);

		jsonObjectEClass = createEClass(JSON_OBJECT);
		createEReference(jsonObjectEClass, JSON_OBJECT__MEMBERS);

		helpFlagEClass = createEClass(HELP_FLAG);

		headersFlagEClass = createEClass(HEADERS_FLAG);

		urlParameterItemEClass = createEClass(URL_PARAMETER_ITEM);
		createEAttribute(urlParameterItemEClass, URL_PARAMETER_ITEM__VALUE);

		jsonArrayEClass = createEClass(JSON_ARRAY);
		createEReference(jsonArrayEClass, JSON_ARRAY__VALUES);

		verboseFlagEClass = createEClass(VERBOSE_FLAG);

		flagEClass = createEClass(FLAG);

		commandLineInterfaceEClass = createEClass(COMMAND_LINE_INTERFACE);
		createEReference(commandLineInterfaceEClass, COMMAND_LINE_INTERFACE__FLAGS);
		createEReference(commandLineInterfaceEClass, COMMAND_LINE_INTERFACE__ITEMS);
		createEAttribute(commandLineInterfaceEClass, COMMAND_LINE_INTERFACE__METHOD);
		createEAttribute(commandLineInterfaceEClass, COMMAND_LINE_INTERFACE__PROTOCOL);
		createEAttribute(commandLineInterfaceEClass, COMMAND_LINE_INTERFACE__URL);
		createEAttribute(commandLineInterfaceEClass, COMMAND_LINE_INTERFACE__PORT);
		createEAttribute(commandLineInterfaceEClass, COMMAND_LINE_INTERFACE__RESOURCE);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__FIELD);

		jsonNumberEClass = createEClass(JSON_NUMBER);
		createEAttribute(jsonNumberEClass, JSON_NUMBER__VALUE);

		timeoutFlagEClass = createEClass(TIMEOUT_FLAG);
		createEAttribute(timeoutFlagEClass, TIMEOUT_FLAG__TIMEOUT);

		rawJsonFieldItemEClass = createEClass(RAW_JSON_FIELD_ITEM);
		createEReference(rawJsonFieldItemEClass, RAW_JSON_FIELD_ITEM__VALUE);

		jsonStringEClass = createEClass(JSON_STRING);
		createEAttribute(jsonStringEClass, JSON_STRING__VALUE);

		jsonNullEClass = createEClass(JSON_NULL);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__KEY);
		createEReference(memberEClass, MEMBER__VALUE);

		// Create enums
		methodEEnum = createEEnum(METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		formFileFieldItemEClass.getESuperTypes().add(this.getItem());
		proxyFlagEClass.getESuperTypes().add(this.getFlag());
		dataTypeFlagEClass.getESuperTypes().add(this.getFlag());
		formFlagEClass.getESuperTypes().add(this.getDataTypeFlag());
		authFlagEClass.getESuperTypes().add(this.getFlag());
		downloadFlagEClass.getESuperTypes().add(this.getFlag());
		bodyFlagEClass.getESuperTypes().add(this.getResponseFlag());
		jsonBooleanEClass.getESuperTypes().add(this.getJsonType());
		versionFlagEClass.getESuperTypes().add(this.getFlag());
		dataFieldItemEClass.getESuperTypes().add(this.getItem());
		responseFlagEClass.getESuperTypes().add(this.getFlag());
		jsonFlagEClass.getESuperTypes().add(this.getDataTypeFlag());
		httpHeaderItemEClass.getESuperTypes().add(this.getItem());
		jsonObjectEClass.getESuperTypes().add(this.getJsonType());
		helpFlagEClass.getESuperTypes().add(this.getFlag());
		headersFlagEClass.getESuperTypes().add(this.getResponseFlag());
		urlParameterItemEClass.getESuperTypes().add(this.getItem());
		jsonArrayEClass.getESuperTypes().add(this.getJsonType());
		verboseFlagEClass.getESuperTypes().add(this.getFlag());
		jsonNumberEClass.getESuperTypes().add(this.getJsonType());
		timeoutFlagEClass.getESuperTypes().add(this.getFlag());
		rawJsonFieldItemEClass.getESuperTypes().add(this.getItem());
		jsonStringEClass.getESuperTypes().add(this.getJsonType());
		jsonNullEClass.getESuperTypes().add(this.getJsonType());

		// Initialize classes, features, and operations; add parameters
		initEClass(jsonTypeEClass, JsonType.class, "JsonType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formFileFieldItemEClass, FormFileFieldItem.class, "FormFileFieldItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormFileFieldItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, FormFileFieldItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(proxyFlagEClass, ProxyFlag.class, "ProxyFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProxyFlag_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, ProxyFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyFlag_ProxyProtocol(), ecorePackage.getEString(), "proxyProtocol", null, 0, 1, ProxyFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyFlag_Username(), ecorePackage.getEString(), "username", null, 0, 1, ProxyFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyFlag_Password(), ecorePackage.getEString(), "password", null, 0, 1, ProxyFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyFlag_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, ProxyFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProxyFlag_Port(), ecorePackage.getEInt(), "port", null, 0, 1, ProxyFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeFlagEClass, DataTypeFlag.class, "DataTypeFlag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formFlagEClass, FormFlag.class, "FormFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authFlagEClass, AuthFlag.class, "AuthFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthFlag_Username(), ecorePackage.getEString(), "username", null, 0, 1, AuthFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthFlag_Password(), ecorePackage.getEString(), "password", null, 0, 1, AuthFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthFlag_Hostname(), ecorePackage.getEString(), "hostname", null, 0, 1, AuthFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(downloadFlagEClass, DownloadFlag.class, "DownloadFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodyFlagEClass, BodyFlag.class, "BodyFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonBooleanEClass, JsonBoolean.class, "JsonBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonBoolean_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, JsonBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionFlagEClass, VersionFlag.class, "VersionFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFieldItemEClass, DataFieldItem.class, "DataFieldItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataFieldItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, DataFieldItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseFlagEClass, ResponseFlag.class, "ResponseFlag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonFlagEClass, JsonFlag.class, "JsonFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(httpHeaderItemEClass, HttpHeaderItem.class, "HttpHeaderItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpHeaderItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, HttpHeaderItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonObjectEClass, JsonObject.class, "JsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsonObject_Members(), this.getMember(), null, "members", null, 0, -1, JsonObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helpFlagEClass, HelpFlag.class, "HelpFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headersFlagEClass, HeadersFlag.class, "HeadersFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(urlParameterItemEClass, UrlParameterItem.class, "UrlParameterItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlParameterItem_Value(), ecorePackage.getEString(), "value", null, 0, 1, UrlParameterItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonArrayEClass, JsonArray.class, "JsonArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJsonArray_Values(), this.getJsonType(), null, "values", null, 0, -1, JsonArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verboseFlagEClass, VerboseFlag.class, "VerboseFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flagEClass, Flag.class, "Flag", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandLineInterfaceEClass, CommandLineInterface.class, "CommandLineInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandLineInterface_Flags(), this.getFlag(), null, "flags", null, 0, -1, CommandLineInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommandLineInterface_Items(), this.getItem(), null, "items", null, 0, -1, CommandLineInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandLineInterface_Method(), this.getMethod(), "method", null, 0, 1, CommandLineInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandLineInterface_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, CommandLineInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandLineInterface_Url(), ecorePackage.getEString(), "url", null, 0, 1, CommandLineInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandLineInterface_Port(), ecorePackage.getEInt(), "port", null, 0, 1, CommandLineInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommandLineInterface_Resource(), ecorePackage.getEString(), "resource", null, 0, 1, CommandLineInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Field(), ecorePackage.getEString(), "field", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonNumberEClass, JsonNumber.class, "JsonNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonNumber_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, JsonNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeoutFlagEClass, TimeoutFlag.class, "TimeoutFlag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeoutFlag_Timeout(), ecorePackage.getEFloat(), "timeout", null, 0, 1, TimeoutFlag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rawJsonFieldItemEClass, RawJsonFieldItem.class, "RawJsonFieldItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRawJsonFieldItem_Value(), this.getJsonType(), null, "value", null, 1, 1, RawJsonFieldItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonStringEClass, JsonString.class, "JsonString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonString_Value(), ecorePackage.getEString(), "value", null, 0, 1, JsonString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonNullEClass, JsonNull.class, "JsonNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_Key(), ecorePackage.getEString(), "key", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Value(), this.getJsonType(), null, "value", null, 1, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(methodEEnum, Method.class, "Method");
		addEEnumLiteral(methodEEnum, Method.GET);
		addEEnumLiteral(methodEEnum, Method.POST);
		addEEnumLiteral(methodEEnum, Method.PUT);
		addEEnumLiteral(methodEEnum, Method.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //AitchteeteepiePackageImpl
