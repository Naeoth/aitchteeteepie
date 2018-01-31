/**
 */
package aitchteeteepie.provider;

import aitchteeteepie.util.AitchteeteepieAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AitchteeteepieItemProviderAdapterFactory extends AitchteeteepieAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AitchteeteepieItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.FormFileFieldItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormFileFieldItemItemProvider formFileFieldItemItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.FormFileFieldItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormFileFieldItemAdapter() {
		if (formFileFieldItemItemProvider == null) {
			formFileFieldItemItemProvider = new FormFileFieldItemItemProvider(this);
		}

		return formFileFieldItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.ProxyFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyFlagItemProvider proxyFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.ProxyFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProxyFlagAdapter() {
		if (proxyFlagItemProvider == null) {
			proxyFlagItemProvider = new ProxyFlagItemProvider(this);
		}

		return proxyFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.FormFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormFlagItemProvider formFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.FormFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormFlagAdapter() {
		if (formFlagItemProvider == null) {
			formFlagItemProvider = new FormFlagItemProvider(this);
		}

		return formFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.AuthFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthFlagItemProvider authFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.AuthFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAuthFlagAdapter() {
		if (authFlagItemProvider == null) {
			authFlagItemProvider = new AuthFlagItemProvider(this);
		}

		return authFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.DownloadFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DownloadFlagItemProvider downloadFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.DownloadFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDownloadFlagAdapter() {
		if (downloadFlagItemProvider == null) {
			downloadFlagItemProvider = new DownloadFlagItemProvider(this);
		}

		return downloadFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.BodyFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyFlagItemProvider bodyFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.BodyFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBodyFlagAdapter() {
		if (bodyFlagItemProvider == null) {
			bodyFlagItemProvider = new BodyFlagItemProvider(this);
		}

		return bodyFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.JsonBoolean} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonBooleanItemProvider jsonBooleanItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.JsonBoolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonBooleanAdapter() {
		if (jsonBooleanItemProvider == null) {
			jsonBooleanItemProvider = new JsonBooleanItemProvider(this);
		}

		return jsonBooleanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.VersionFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionFlagItemProvider versionFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.VersionFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVersionFlagAdapter() {
		if (versionFlagItemProvider == null) {
			versionFlagItemProvider = new VersionFlagItemProvider(this);
		}

		return versionFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.DataFieldItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFieldItemItemProvider dataFieldItemItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.DataFieldItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataFieldItemAdapter() {
		if (dataFieldItemItemProvider == null) {
			dataFieldItemItemProvider = new DataFieldItemItemProvider(this);
		}

		return dataFieldItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.JsonFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonFlagItemProvider jsonFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.JsonFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonFlagAdapter() {
		if (jsonFlagItemProvider == null) {
			jsonFlagItemProvider = new JsonFlagItemProvider(this);
		}

		return jsonFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.HttpHeaderItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpHeaderItemItemProvider httpHeaderItemItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.HttpHeaderItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHttpHeaderItemAdapter() {
		if (httpHeaderItemItemProvider == null) {
			httpHeaderItemItemProvider = new HttpHeaderItemItemProvider(this);
		}

		return httpHeaderItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.JsonObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonObjectItemProvider jsonObjectItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.JsonObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonObjectAdapter() {
		if (jsonObjectItemProvider == null) {
			jsonObjectItemProvider = new JsonObjectItemProvider(this);
		}

		return jsonObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.HelpFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HelpFlagItemProvider helpFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.HelpFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHelpFlagAdapter() {
		if (helpFlagItemProvider == null) {
			helpFlagItemProvider = new HelpFlagItemProvider(this);
		}

		return helpFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.HeadersFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadersFlagItemProvider headersFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.HeadersFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHeadersFlagAdapter() {
		if (headersFlagItemProvider == null) {
			headersFlagItemProvider = new HeadersFlagItemProvider(this);
		}

		return headersFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.UrlParameterItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UrlParameterItemItemProvider urlParameterItemItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.UrlParameterItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUrlParameterItemAdapter() {
		if (urlParameterItemItemProvider == null) {
			urlParameterItemItemProvider = new UrlParameterItemItemProvider(this);
		}

		return urlParameterItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.JsonArray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonArrayItemProvider jsonArrayItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.JsonArray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonArrayAdapter() {
		if (jsonArrayItemProvider == null) {
			jsonArrayItemProvider = new JsonArrayItemProvider(this);
		}

		return jsonArrayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.VerboseFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerboseFlagItemProvider verboseFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.VerboseFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVerboseFlagAdapter() {
		if (verboseFlagItemProvider == null) {
			verboseFlagItemProvider = new VerboseFlagItemProvider(this);
		}

		return verboseFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.CommandLineInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineInterfaceItemProvider commandLineInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.CommandLineInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandLineInterfaceAdapter() {
		if (commandLineInterfaceItemProvider == null) {
			commandLineInterfaceItemProvider = new CommandLineInterfaceItemProvider(this);
		}

		return commandLineInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.JsonNumber} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonNumberItemProvider jsonNumberItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.JsonNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonNumberAdapter() {
		if (jsonNumberItemProvider == null) {
			jsonNumberItemProvider = new JsonNumberItemProvider(this);
		}

		return jsonNumberItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.TimeoutFlag} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeoutFlagItemProvider timeoutFlagItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.TimeoutFlag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeoutFlagAdapter() {
		if (timeoutFlagItemProvider == null) {
			timeoutFlagItemProvider = new TimeoutFlagItemProvider(this);
		}

		return timeoutFlagItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.RawJsonFieldItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RawJsonFieldItemItemProvider rawJsonFieldItemItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.RawJsonFieldItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRawJsonFieldItemAdapter() {
		if (rawJsonFieldItemItemProvider == null) {
			rawJsonFieldItemItemProvider = new RawJsonFieldItemItemProvider(this);
		}

		return rawJsonFieldItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.JsonString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonStringItemProvider jsonStringItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.JsonString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonStringAdapter() {
		if (jsonStringItemProvider == null) {
			jsonStringItemProvider = new JsonStringItemProvider(this);
		}

		return jsonStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.JsonNull} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonNullItemProvider jsonNullItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.JsonNull}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJsonNullAdapter() {
		if (jsonNullItemProvider == null) {
			jsonNullItemProvider = new JsonNullItemProvider(this);
		}

		return jsonNullItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link aitchteeteepie.Member} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberItemProvider memberItemProvider;

	/**
	 * This creates an adapter for a {@link aitchteeteepie.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemberAdapter() {
		if (memberItemProvider == null) {
			memberItemProvider = new MemberItemProvider(this);
		}

		return memberItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (formFileFieldItemItemProvider != null) formFileFieldItemItemProvider.dispose();
		if (proxyFlagItemProvider != null) proxyFlagItemProvider.dispose();
		if (formFlagItemProvider != null) formFlagItemProvider.dispose();
		if (authFlagItemProvider != null) authFlagItemProvider.dispose();
		if (downloadFlagItemProvider != null) downloadFlagItemProvider.dispose();
		if (bodyFlagItemProvider != null) bodyFlagItemProvider.dispose();
		if (jsonBooleanItemProvider != null) jsonBooleanItemProvider.dispose();
		if (versionFlagItemProvider != null) versionFlagItemProvider.dispose();
		if (dataFieldItemItemProvider != null) dataFieldItemItemProvider.dispose();
		if (jsonFlagItemProvider != null) jsonFlagItemProvider.dispose();
		if (httpHeaderItemItemProvider != null) httpHeaderItemItemProvider.dispose();
		if (jsonObjectItemProvider != null) jsonObjectItemProvider.dispose();
		if (helpFlagItemProvider != null) helpFlagItemProvider.dispose();
		if (headersFlagItemProvider != null) headersFlagItemProvider.dispose();
		if (urlParameterItemItemProvider != null) urlParameterItemItemProvider.dispose();
		if (jsonArrayItemProvider != null) jsonArrayItemProvider.dispose();
		if (verboseFlagItemProvider != null) verboseFlagItemProvider.dispose();
		if (commandLineInterfaceItemProvider != null) commandLineInterfaceItemProvider.dispose();
		if (jsonNumberItemProvider != null) jsonNumberItemProvider.dispose();
		if (timeoutFlagItemProvider != null) timeoutFlagItemProvider.dispose();
		if (rawJsonFieldItemItemProvider != null) rawJsonFieldItemItemProvider.dispose();
		if (jsonStringItemProvider != null) jsonStringItemProvider.dispose();
		if (jsonNullItemProvider != null) jsonNullItemProvider.dispose();
		if (memberItemProvider != null) memberItemProvider.dispose();
	}

}
