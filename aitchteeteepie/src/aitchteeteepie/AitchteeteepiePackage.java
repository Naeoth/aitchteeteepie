/**
 */
package aitchteeteepie;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see aitchteeteepie.AitchteeteepieFactory
 * @model kind="package"
 * @generated
 */
public interface AitchteeteepiePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aitchteeteepie";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/aitchteeteepie";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aitchteeteepie";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AitchteeteepiePackage eINSTANCE = aitchteeteepie.impl.AitchteeteepiePackageImpl.init();

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.JsonTypeImpl <em>Json Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.JsonTypeImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonType()
	 * @generated
	 */
	int JSON_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Json Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Json Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.ItemImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 22;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.FormFileFieldItemImpl <em>Form File Field Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.FormFileFieldItemImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getFormFileFieldItem()
	 * @generated
	 */
	int FORM_FILE_FIELD_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FILE_FIELD_ITEM__FIELD = ITEM__FIELD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FILE_FIELD_ITEM__VALUE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form File Field Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FILE_FIELD_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form File Field Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FILE_FIELD_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.FlagImpl <em>Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.FlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getFlag()
	 * @generated
	 */
	int FLAG = 20;

	/**
	 * The number of structural features of the '<em>Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.ProxyFlagImpl <em>Proxy Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.ProxyFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getProxyFlag()
	 * @generated
	 */
	int PROXY_FLAG = 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FLAG__PROTOCOL = FLAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proxy Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FLAG__PROXY_PROTOCOL = FLAG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FLAG__USERNAME = FLAG_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FLAG__PASSWORD = FLAG_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FLAG__HOSTNAME = FLAG_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FLAG__PORT = FLAG_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Proxy Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Proxy Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROXY_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.DataTypeFlagImpl <em>Data Type Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.DataTypeFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getDataTypeFlag()
	 * @generated
	 */
	int DATA_TYPE_FLAG = 3;

	/**
	 * The number of structural features of the '<em>Data Type Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.FormFlagImpl <em>Form Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.FormFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getFormFlag()
	 * @generated
	 */
	int FORM_FLAG = 4;

	/**
	 * The number of structural features of the '<em>Form Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FLAG_FEATURE_COUNT = DATA_TYPE_FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Form Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FLAG_OPERATION_COUNT = DATA_TYPE_FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.AuthFlagImpl <em>Auth Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.AuthFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getAuthFlag()
	 * @generated
	 */
	int AUTH_FLAG = 5;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_FLAG__USERNAME = FLAG_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_FLAG__PASSWORD = FLAG_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_FLAG__HOSTNAME = FLAG_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Auth Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Auth Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTH_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.DownloadFlagImpl <em>Download Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.DownloadFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getDownloadFlag()
	 * @generated
	 */
	int DOWNLOAD_FLAG = 6;

	/**
	 * The number of structural features of the '<em>Download Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Download Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOWNLOAD_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.ResponseFlagImpl <em>Response Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.ResponseFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getResponseFlag()
	 * @generated
	 */
	int RESPONSE_FLAG = 11;

	/**
	 * The number of structural features of the '<em>Response Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Response Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.BodyFlagImpl <em>Body Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.BodyFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getBodyFlag()
	 * @generated
	 */
	int BODY_FLAG = 7;

	/**
	 * The number of structural features of the '<em>Body Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FLAG_FEATURE_COUNT = RESPONSE_FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Body Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FLAG_OPERATION_COUNT = RESPONSE_FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.JsonBooleanImpl <em>Json Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.JsonBooleanImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonBoolean()
	 * @generated
	 */
	int JSON_BOOLEAN = 8;

	/**
	 * The number of structural features of the '<em>Json Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_BOOLEAN_FEATURE_COUNT = JSON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_BOOLEAN_OPERATION_COUNT = JSON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.VersionFlagImpl <em>Version Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.VersionFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getVersionFlag()
	 * @generated
	 */
	int VERSION_FLAG = 9;

	/**
	 * The number of structural features of the '<em>Version Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Version Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.DataFieldItemImpl <em>Data Field Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.DataFieldItemImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getDataFieldItem()
	 * @generated
	 */
	int DATA_FIELD_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_ITEM__FIELD = ITEM__FIELD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_ITEM__VALUE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Field Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Field Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.JsonFlagImpl <em>Json Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.JsonFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonFlag()
	 * @generated
	 */
	int JSON_FLAG = 12;

	/**
	 * The number of structural features of the '<em>Json Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FLAG_FEATURE_COUNT = DATA_TYPE_FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FLAG_OPERATION_COUNT = DATA_TYPE_FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.HttpHeaderItemImpl <em>Http Header Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.HttpHeaderItemImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getHttpHeaderItem()
	 * @generated
	 */
	int HTTP_HEADER_ITEM = 13;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_ITEM__FIELD = ITEM__FIELD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_ITEM__VALUE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Http Header Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Http Header Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.JsonObjectImpl <em>Json Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.JsonObjectImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonObject()
	 * @generated
	 */
	int JSON_OBJECT = 14;

	/**
	 * The number of structural features of the '<em>Json Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_FEATURE_COUNT = JSON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OBJECT_OPERATION_COUNT = JSON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.HelpFlagImpl <em>Help Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.HelpFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getHelpFlag()
	 * @generated
	 */
	int HELP_FLAG = 15;

	/**
	 * The number of structural features of the '<em>Help Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Help Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.HeadersFlagImpl <em>Headers Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.HeadersFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getHeadersFlag()
	 * @generated
	 */
	int HEADERS_FLAG = 16;

	/**
	 * The number of structural features of the '<em>Headers Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADERS_FLAG_FEATURE_COUNT = RESPONSE_FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Headers Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADERS_FLAG_OPERATION_COUNT = RESPONSE_FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.UrlParameterItemImpl <em>Url Parameter Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.UrlParameterItemImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getUrlParameterItem()
	 * @generated
	 */
	int URL_PARAMETER_ITEM = 17;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PARAMETER_ITEM__FIELD = ITEM__FIELD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PARAMETER_ITEM__VALUE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Url Parameter Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PARAMETER_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Url Parameter Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_PARAMETER_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.JsonArrayImpl <em>Json Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.JsonArrayImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonArray()
	 * @generated
	 */
	int JSON_ARRAY = 18;

	/**
	 * The number of structural features of the '<em>Json Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY_FEATURE_COUNT = JSON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_ARRAY_OPERATION_COUNT = JSON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.VerboseFlagImpl <em>Verbose Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.VerboseFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getVerboseFlag()
	 * @generated
	 */
	int VERBOSE_FLAG = 19;

	/**
	 * The number of structural features of the '<em>Verbose Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Verbose Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.CommandLineInterfaceImpl <em>Command Line Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.CommandLineInterfaceImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getCommandLineInterface()
	 * @generated
	 */
	int COMMAND_LINE_INTERFACE = 21;

	/**
	 * The feature id for the '<em><b>Flags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE__FLAGS = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE__ITEMS = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE__PROTOCOL = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE__URL = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE__PORT = 5;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE__RESOURCE = 6;

	/**
	 * The number of structural features of the '<em>Command Line Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Command Line Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_LINE_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.JsonNumberImpl <em>Json Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.JsonNumberImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonNumber()
	 * @generated
	 */
	int JSON_NUMBER = 23;

	/**
	 * The number of structural features of the '<em>Json Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NUMBER_FEATURE_COUNT = JSON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Json Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_NUMBER_OPERATION_COUNT = JSON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.TimeoutFlagImpl <em>Timeout Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.TimeoutFlagImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getTimeoutFlag()
	 * @generated
	 */
	int TIMEOUT_FLAG = 24;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_FLAG__TIMEOUT = FLAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timeout Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_FLAG_FEATURE_COUNT = FLAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timeout Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMEOUT_FLAG_OPERATION_COUNT = FLAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.impl.RawJsonFieldItemImpl <em>Raw Json Field Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.impl.RawJsonFieldItemImpl
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getRawJsonFieldItem()
	 * @generated
	 */
	int RAW_JSON_FIELD_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_JSON_FIELD_ITEM__FIELD = ITEM__FIELD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_JSON_FIELD_ITEM__VALUE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raw Json Field Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_JSON_FIELD_ITEM_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raw Json Field Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_JSON_FIELD_ITEM_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link aitchteeteepie.Method <em>Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see aitchteeteepie.Method
	 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 26;


	/**
	 * Returns the meta object for class '{@link aitchteeteepie.JsonType <em>Json Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Type</em>'.
	 * @see aitchteeteepie.JsonType
	 * @generated
	 */
	EClass getJsonType();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.FormFileFieldItem <em>Form File Field Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form File Field Item</em>'.
	 * @see aitchteeteepie.FormFileFieldItem
	 * @generated
	 */
	EClass getFormFileFieldItem();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.FormFileFieldItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see aitchteeteepie.FormFileFieldItem#getValue()
	 * @see #getFormFileFieldItem()
	 * @generated
	 */
	EAttribute getFormFileFieldItem_Value();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.ProxyFlag <em>Proxy Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proxy Flag</em>'.
	 * @see aitchteeteepie.ProxyFlag
	 * @generated
	 */
	EClass getProxyFlag();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.ProxyFlag#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see aitchteeteepie.ProxyFlag#getProtocol()
	 * @see #getProxyFlag()
	 * @generated
	 */
	EAttribute getProxyFlag_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.ProxyFlag#getProxyProtocol <em>Proxy Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy Protocol</em>'.
	 * @see aitchteeteepie.ProxyFlag#getProxyProtocol()
	 * @see #getProxyFlag()
	 * @generated
	 */
	EAttribute getProxyFlag_ProxyProtocol();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.ProxyFlag#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see aitchteeteepie.ProxyFlag#getUsername()
	 * @see #getProxyFlag()
	 * @generated
	 */
	EAttribute getProxyFlag_Username();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.ProxyFlag#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see aitchteeteepie.ProxyFlag#getPassword()
	 * @see #getProxyFlag()
	 * @generated
	 */
	EAttribute getProxyFlag_Password();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.ProxyFlag#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see aitchteeteepie.ProxyFlag#getHostname()
	 * @see #getProxyFlag()
	 * @generated
	 */
	EAttribute getProxyFlag_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.ProxyFlag#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see aitchteeteepie.ProxyFlag#getPort()
	 * @see #getProxyFlag()
	 * @generated
	 */
	EAttribute getProxyFlag_Port();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.DataTypeFlag <em>Data Type Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type Flag</em>'.
	 * @see aitchteeteepie.DataTypeFlag
	 * @generated
	 */
	EClass getDataTypeFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.FormFlag <em>Form Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Flag</em>'.
	 * @see aitchteeteepie.FormFlag
	 * @generated
	 */
	EClass getFormFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.AuthFlag <em>Auth Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auth Flag</em>'.
	 * @see aitchteeteepie.AuthFlag
	 * @generated
	 */
	EClass getAuthFlag();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.AuthFlag#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see aitchteeteepie.AuthFlag#getUsername()
	 * @see #getAuthFlag()
	 * @generated
	 */
	EAttribute getAuthFlag_Username();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.AuthFlag#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see aitchteeteepie.AuthFlag#getPassword()
	 * @see #getAuthFlag()
	 * @generated
	 */
	EAttribute getAuthFlag_Password();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.AuthFlag#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see aitchteeteepie.AuthFlag#getHostname()
	 * @see #getAuthFlag()
	 * @generated
	 */
	EAttribute getAuthFlag_Hostname();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.DownloadFlag <em>Download Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Download Flag</em>'.
	 * @see aitchteeteepie.DownloadFlag
	 * @generated
	 */
	EClass getDownloadFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.BodyFlag <em>Body Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Flag</em>'.
	 * @see aitchteeteepie.BodyFlag
	 * @generated
	 */
	EClass getBodyFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.JsonBoolean <em>Json Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Boolean</em>'.
	 * @see aitchteeteepie.JsonBoolean
	 * @generated
	 */
	EClass getJsonBoolean();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.VersionFlag <em>Version Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Flag</em>'.
	 * @see aitchteeteepie.VersionFlag
	 * @generated
	 */
	EClass getVersionFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.DataFieldItem <em>Data Field Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Field Item</em>'.
	 * @see aitchteeteepie.DataFieldItem
	 * @generated
	 */
	EClass getDataFieldItem();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.DataFieldItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see aitchteeteepie.DataFieldItem#getValue()
	 * @see #getDataFieldItem()
	 * @generated
	 */
	EAttribute getDataFieldItem_Value();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.ResponseFlag <em>Response Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Flag</em>'.
	 * @see aitchteeteepie.ResponseFlag
	 * @generated
	 */
	EClass getResponseFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.JsonFlag <em>Json Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Flag</em>'.
	 * @see aitchteeteepie.JsonFlag
	 * @generated
	 */
	EClass getJsonFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.HttpHeaderItem <em>Http Header Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Header Item</em>'.
	 * @see aitchteeteepie.HttpHeaderItem
	 * @generated
	 */
	EClass getHttpHeaderItem();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.HttpHeaderItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see aitchteeteepie.HttpHeaderItem#getValue()
	 * @see #getHttpHeaderItem()
	 * @generated
	 */
	EAttribute getHttpHeaderItem_Value();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.JsonObject <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Object</em>'.
	 * @see aitchteeteepie.JsonObject
	 * @generated
	 */
	EClass getJsonObject();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.HelpFlag <em>Help Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help Flag</em>'.
	 * @see aitchteeteepie.HelpFlag
	 * @generated
	 */
	EClass getHelpFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.HeadersFlag <em>Headers Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headers Flag</em>'.
	 * @see aitchteeteepie.HeadersFlag
	 * @generated
	 */
	EClass getHeadersFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.UrlParameterItem <em>Url Parameter Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Parameter Item</em>'.
	 * @see aitchteeteepie.UrlParameterItem
	 * @generated
	 */
	EClass getUrlParameterItem();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.UrlParameterItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see aitchteeteepie.UrlParameterItem#getValue()
	 * @see #getUrlParameterItem()
	 * @generated
	 */
	EAttribute getUrlParameterItem_Value();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.JsonArray <em>Json Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Array</em>'.
	 * @see aitchteeteepie.JsonArray
	 * @generated
	 */
	EClass getJsonArray();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.VerboseFlag <em>Verbose Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verbose Flag</em>'.
	 * @see aitchteeteepie.VerboseFlag
	 * @generated
	 */
	EClass getVerboseFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.Flag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flag</em>'.
	 * @see aitchteeteepie.Flag
	 * @generated
	 */
	EClass getFlag();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.CommandLineInterface <em>Command Line Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Line Interface</em>'.
	 * @see aitchteeteepie.CommandLineInterface
	 * @generated
	 */
	EClass getCommandLineInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link aitchteeteepie.CommandLineInterface#getFlags <em>Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flags</em>'.
	 * @see aitchteeteepie.CommandLineInterface#getFlags()
	 * @see #getCommandLineInterface()
	 * @generated
	 */
	EReference getCommandLineInterface_Flags();

	/**
	 * Returns the meta object for the containment reference list '{@link aitchteeteepie.CommandLineInterface#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see aitchteeteepie.CommandLineInterface#getItems()
	 * @see #getCommandLineInterface()
	 * @generated
	 */
	EReference getCommandLineInterface_Items();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.CommandLineInterface#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see aitchteeteepie.CommandLineInterface#getMethod()
	 * @see #getCommandLineInterface()
	 * @generated
	 */
	EAttribute getCommandLineInterface_Method();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.CommandLineInterface#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see aitchteeteepie.CommandLineInterface#getProtocol()
	 * @see #getCommandLineInterface()
	 * @generated
	 */
	EAttribute getCommandLineInterface_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.CommandLineInterface#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see aitchteeteepie.CommandLineInterface#getUrl()
	 * @see #getCommandLineInterface()
	 * @generated
	 */
	EAttribute getCommandLineInterface_Url();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.CommandLineInterface#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see aitchteeteepie.CommandLineInterface#getPort()
	 * @see #getCommandLineInterface()
	 * @generated
	 */
	EAttribute getCommandLineInterface_Port();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.CommandLineInterface#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see aitchteeteepie.CommandLineInterface#getResource()
	 * @see #getCommandLineInterface()
	 * @generated
	 */
	EAttribute getCommandLineInterface_Resource();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see aitchteeteepie.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.Item#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see aitchteeteepie.Item#getField()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Field();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.JsonNumber <em>Json Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Number</em>'.
	 * @see aitchteeteepie.JsonNumber
	 * @generated
	 */
	EClass getJsonNumber();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.TimeoutFlag <em>Timeout Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timeout Flag</em>'.
	 * @see aitchteeteepie.TimeoutFlag
	 * @generated
	 */
	EClass getTimeoutFlag();

	/**
	 * Returns the meta object for the attribute '{@link aitchteeteepie.TimeoutFlag#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see aitchteeteepie.TimeoutFlag#getTimeout()
	 * @see #getTimeoutFlag()
	 * @generated
	 */
	EAttribute getTimeoutFlag_Timeout();

	/**
	 * Returns the meta object for class '{@link aitchteeteepie.RawJsonFieldItem <em>Raw Json Field Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Json Field Item</em>'.
	 * @see aitchteeteepie.RawJsonFieldItem
	 * @generated
	 */
	EClass getRawJsonFieldItem();

	/**
	 * Returns the meta object for the reference '{@link aitchteeteepie.RawJsonFieldItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see aitchteeteepie.RawJsonFieldItem#getValue()
	 * @see #getRawJsonFieldItem()
	 * @generated
	 */
	EReference getRawJsonFieldItem_Value();

	/**
	 * Returns the meta object for enum '{@link aitchteeteepie.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method</em>'.
	 * @see aitchteeteepie.Method
	 * @generated
	 */
	EEnum getMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AitchteeteepieFactory getAitchteeteepieFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.JsonTypeImpl <em>Json Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.JsonTypeImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonType()
		 * @generated
		 */
		EClass JSON_TYPE = eINSTANCE.getJsonType();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.FormFileFieldItemImpl <em>Form File Field Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.FormFileFieldItemImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getFormFileFieldItem()
		 * @generated
		 */
		EClass FORM_FILE_FIELD_ITEM = eINSTANCE.getFormFileFieldItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_FILE_FIELD_ITEM__VALUE = eINSTANCE.getFormFileFieldItem_Value();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.ProxyFlagImpl <em>Proxy Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.ProxyFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getProxyFlag()
		 * @generated
		 */
		EClass PROXY_FLAG = eINSTANCE.getProxyFlag();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_FLAG__PROTOCOL = eINSTANCE.getProxyFlag_Protocol();

		/**
		 * The meta object literal for the '<em><b>Proxy Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_FLAG__PROXY_PROTOCOL = eINSTANCE.getProxyFlag_ProxyProtocol();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_FLAG__USERNAME = eINSTANCE.getProxyFlag_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_FLAG__PASSWORD = eINSTANCE.getProxyFlag_Password();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_FLAG__HOSTNAME = eINSTANCE.getProxyFlag_Hostname();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROXY_FLAG__PORT = eINSTANCE.getProxyFlag_Port();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.DataTypeFlagImpl <em>Data Type Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.DataTypeFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getDataTypeFlag()
		 * @generated
		 */
		EClass DATA_TYPE_FLAG = eINSTANCE.getDataTypeFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.FormFlagImpl <em>Form Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.FormFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getFormFlag()
		 * @generated
		 */
		EClass FORM_FLAG = eINSTANCE.getFormFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.AuthFlagImpl <em>Auth Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.AuthFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getAuthFlag()
		 * @generated
		 */
		EClass AUTH_FLAG = eINSTANCE.getAuthFlag();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_FLAG__USERNAME = eINSTANCE.getAuthFlag_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_FLAG__PASSWORD = eINSTANCE.getAuthFlag_Password();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTH_FLAG__HOSTNAME = eINSTANCE.getAuthFlag_Hostname();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.DownloadFlagImpl <em>Download Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.DownloadFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getDownloadFlag()
		 * @generated
		 */
		EClass DOWNLOAD_FLAG = eINSTANCE.getDownloadFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.BodyFlagImpl <em>Body Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.BodyFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getBodyFlag()
		 * @generated
		 */
		EClass BODY_FLAG = eINSTANCE.getBodyFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.JsonBooleanImpl <em>Json Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.JsonBooleanImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonBoolean()
		 * @generated
		 */
		EClass JSON_BOOLEAN = eINSTANCE.getJsonBoolean();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.VersionFlagImpl <em>Version Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.VersionFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getVersionFlag()
		 * @generated
		 */
		EClass VERSION_FLAG = eINSTANCE.getVersionFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.DataFieldItemImpl <em>Data Field Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.DataFieldItemImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getDataFieldItem()
		 * @generated
		 */
		EClass DATA_FIELD_ITEM = eINSTANCE.getDataFieldItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD_ITEM__VALUE = eINSTANCE.getDataFieldItem_Value();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.ResponseFlagImpl <em>Response Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.ResponseFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getResponseFlag()
		 * @generated
		 */
		EClass RESPONSE_FLAG = eINSTANCE.getResponseFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.JsonFlagImpl <em>Json Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.JsonFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonFlag()
		 * @generated
		 */
		EClass JSON_FLAG = eINSTANCE.getJsonFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.HttpHeaderItemImpl <em>Http Header Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.HttpHeaderItemImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getHttpHeaderItem()
		 * @generated
		 */
		EClass HTTP_HEADER_ITEM = eINSTANCE.getHttpHeaderItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HEADER_ITEM__VALUE = eINSTANCE.getHttpHeaderItem_Value();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.JsonObjectImpl <em>Json Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.JsonObjectImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonObject()
		 * @generated
		 */
		EClass JSON_OBJECT = eINSTANCE.getJsonObject();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.HelpFlagImpl <em>Help Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.HelpFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getHelpFlag()
		 * @generated
		 */
		EClass HELP_FLAG = eINSTANCE.getHelpFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.HeadersFlagImpl <em>Headers Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.HeadersFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getHeadersFlag()
		 * @generated
		 */
		EClass HEADERS_FLAG = eINSTANCE.getHeadersFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.UrlParameterItemImpl <em>Url Parameter Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.UrlParameterItemImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getUrlParameterItem()
		 * @generated
		 */
		EClass URL_PARAMETER_ITEM = eINSTANCE.getUrlParameterItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_PARAMETER_ITEM__VALUE = eINSTANCE.getUrlParameterItem_Value();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.JsonArrayImpl <em>Json Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.JsonArrayImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonArray()
		 * @generated
		 */
		EClass JSON_ARRAY = eINSTANCE.getJsonArray();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.VerboseFlagImpl <em>Verbose Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.VerboseFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getVerboseFlag()
		 * @generated
		 */
		EClass VERBOSE_FLAG = eINSTANCE.getVerboseFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.FlagImpl <em>Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.FlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getFlag()
		 * @generated
		 */
		EClass FLAG = eINSTANCE.getFlag();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.CommandLineInterfaceImpl <em>Command Line Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.CommandLineInterfaceImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getCommandLineInterface()
		 * @generated
		 */
		EClass COMMAND_LINE_INTERFACE = eINSTANCE.getCommandLineInterface();

		/**
		 * The meta object literal for the '<em><b>Flags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_INTERFACE__FLAGS = eINSTANCE.getCommandLineInterface_Flags();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_LINE_INTERFACE__ITEMS = eINSTANCE.getCommandLineInterface_Items();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE_INTERFACE__METHOD = eINSTANCE.getCommandLineInterface_Method();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE_INTERFACE__PROTOCOL = eINSTANCE.getCommandLineInterface_Protocol();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE_INTERFACE__URL = eINSTANCE.getCommandLineInterface_Url();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE_INTERFACE__PORT = eINSTANCE.getCommandLineInterface_Port();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_LINE_INTERFACE__RESOURCE = eINSTANCE.getCommandLineInterface_Resource();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.ItemImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__FIELD = eINSTANCE.getItem_Field();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.JsonNumberImpl <em>Json Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.JsonNumberImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getJsonNumber()
		 * @generated
		 */
		EClass JSON_NUMBER = eINSTANCE.getJsonNumber();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.TimeoutFlagImpl <em>Timeout Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.TimeoutFlagImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getTimeoutFlag()
		 * @generated
		 */
		EClass TIMEOUT_FLAG = eINSTANCE.getTimeoutFlag();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMEOUT_FLAG__TIMEOUT = eINSTANCE.getTimeoutFlag_Timeout();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.impl.RawJsonFieldItemImpl <em>Raw Json Field Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.impl.RawJsonFieldItemImpl
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getRawJsonFieldItem()
		 * @generated
		 */
		EClass RAW_JSON_FIELD_ITEM = eINSTANCE.getRawJsonFieldItem();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAW_JSON_FIELD_ITEM__VALUE = eINSTANCE.getRawJsonFieldItem_Value();

		/**
		 * The meta object literal for the '{@link aitchteeteepie.Method <em>Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see aitchteeteepie.Method
		 * @see aitchteeteepie.impl.AitchteeteepiePackageImpl#getMethod()
		 * @generated
		 */
		EEnum METHOD = eINSTANCE.getMethod();

	}

} //AitchteeteepiePackage
