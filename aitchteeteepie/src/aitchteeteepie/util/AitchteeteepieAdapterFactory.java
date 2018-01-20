/**
 */
package aitchteeteepie.util;

import aitchteeteepie.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see aitchteeteepie.AitchteeteepiePackage
 * @generated
 */
public class AitchteeteepieAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AitchteeteepiePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AitchteeteepieAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AitchteeteepiePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AitchteeteepieSwitch<Adapter> modelSwitch =
		new AitchteeteepieSwitch<Adapter>() {
			@Override
			public Adapter caseJsonType(JsonType object) {
				return createJsonTypeAdapter();
			}
			@Override
			public Adapter caseFormFileFieldItem(FormFileFieldItem object) {
				return createFormFileFieldItemAdapter();
			}
			@Override
			public Adapter caseProxyFlag(ProxyFlag object) {
				return createProxyFlagAdapter();
			}
			@Override
			public Adapter caseDataTypeFlag(DataTypeFlag object) {
				return createDataTypeFlagAdapter();
			}
			@Override
			public Adapter caseFormFlag(FormFlag object) {
				return createFormFlagAdapter();
			}
			@Override
			public Adapter caseAuthFlag(AuthFlag object) {
				return createAuthFlagAdapter();
			}
			@Override
			public Adapter caseDownloadFlag(DownloadFlag object) {
				return createDownloadFlagAdapter();
			}
			@Override
			public Adapter caseBodyFlag(BodyFlag object) {
				return createBodyFlagAdapter();
			}
			@Override
			public Adapter caseJsonBoolean(JsonBoolean object) {
				return createJsonBooleanAdapter();
			}
			@Override
			public Adapter caseVersionFlag(VersionFlag object) {
				return createVersionFlagAdapter();
			}
			@Override
			public Adapter caseDataFieldItem(DataFieldItem object) {
				return createDataFieldItemAdapter();
			}
			@Override
			public Adapter caseResponseFlag(ResponseFlag object) {
				return createResponseFlagAdapter();
			}
			@Override
			public Adapter caseJsonFlag(JsonFlag object) {
				return createJsonFlagAdapter();
			}
			@Override
			public Adapter caseHttpHeaderItem(HttpHeaderItem object) {
				return createHttpHeaderItemAdapter();
			}
			@Override
			public Adapter caseJsonObject(JsonObject object) {
				return createJsonObjectAdapter();
			}
			@Override
			public Adapter caseHelpFlag(HelpFlag object) {
				return createHelpFlagAdapter();
			}
			@Override
			public Adapter caseHeadersFlag(HeadersFlag object) {
				return createHeadersFlagAdapter();
			}
			@Override
			public Adapter caseUrlParameterItem(UrlParameterItem object) {
				return createUrlParameterItemAdapter();
			}
			@Override
			public Adapter caseJsonArray(JsonArray object) {
				return createJsonArrayAdapter();
			}
			@Override
			public Adapter caseVerboseFlag(VerboseFlag object) {
				return createVerboseFlagAdapter();
			}
			@Override
			public Adapter caseFlag(Flag object) {
				return createFlagAdapter();
			}
			@Override
			public Adapter caseCommandLineInterface(CommandLineInterface object) {
				return createCommandLineInterfaceAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseJsonNumber(JsonNumber object) {
				return createJsonNumberAdapter();
			}
			@Override
			public Adapter caseTimeoutFlag(TimeoutFlag object) {
				return createTimeoutFlagAdapter();
			}
			@Override
			public Adapter caseRawJsonFieldItem(RawJsonFieldItem object) {
				return createRawJsonFieldItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.JsonType <em>Json Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.JsonType
	 * @generated
	 */
	public Adapter createJsonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.FormFileFieldItem <em>Form File Field Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.FormFileFieldItem
	 * @generated
	 */
	public Adapter createFormFileFieldItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.ProxyFlag <em>Proxy Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.ProxyFlag
	 * @generated
	 */
	public Adapter createProxyFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.DataTypeFlag <em>Data Type Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.DataTypeFlag
	 * @generated
	 */
	public Adapter createDataTypeFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.FormFlag <em>Form Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.FormFlag
	 * @generated
	 */
	public Adapter createFormFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.AuthFlag <em>Auth Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.AuthFlag
	 * @generated
	 */
	public Adapter createAuthFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.DownloadFlag <em>Download Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.DownloadFlag
	 * @generated
	 */
	public Adapter createDownloadFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.BodyFlag <em>Body Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.BodyFlag
	 * @generated
	 */
	public Adapter createBodyFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.JsonBoolean <em>Json Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.JsonBoolean
	 * @generated
	 */
	public Adapter createJsonBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.VersionFlag <em>Version Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.VersionFlag
	 * @generated
	 */
	public Adapter createVersionFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.DataFieldItem <em>Data Field Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.DataFieldItem
	 * @generated
	 */
	public Adapter createDataFieldItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.ResponseFlag <em>Response Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.ResponseFlag
	 * @generated
	 */
	public Adapter createResponseFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.JsonFlag <em>Json Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.JsonFlag
	 * @generated
	 */
	public Adapter createJsonFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.HttpHeaderItem <em>Http Header Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.HttpHeaderItem
	 * @generated
	 */
	public Adapter createHttpHeaderItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.JsonObject <em>Json Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.JsonObject
	 * @generated
	 */
	public Adapter createJsonObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.HelpFlag <em>Help Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.HelpFlag
	 * @generated
	 */
	public Adapter createHelpFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.HeadersFlag <em>Headers Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.HeadersFlag
	 * @generated
	 */
	public Adapter createHeadersFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.UrlParameterItem <em>Url Parameter Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.UrlParameterItem
	 * @generated
	 */
	public Adapter createUrlParameterItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.JsonArray <em>Json Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.JsonArray
	 * @generated
	 */
	public Adapter createJsonArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.VerboseFlag <em>Verbose Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.VerboseFlag
	 * @generated
	 */
	public Adapter createVerboseFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.Flag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.Flag
	 * @generated
	 */
	public Adapter createFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.CommandLineInterface <em>Command Line Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.CommandLineInterface
	 * @generated
	 */
	public Adapter createCommandLineInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.JsonNumber <em>Json Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.JsonNumber
	 * @generated
	 */
	public Adapter createJsonNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.TimeoutFlag <em>Timeout Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.TimeoutFlag
	 * @generated
	 */
	public Adapter createTimeoutFlagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link aitchteeteepie.RawJsonFieldItem <em>Raw Json Field Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see aitchteeteepie.RawJsonFieldItem
	 * @generated
	 */
	public Adapter createRawJsonFieldItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AitchteeteepieAdapterFactory
