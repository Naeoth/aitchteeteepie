/**
 */
package aitchteeteepie.impl;

import aitchteeteepie.AitchteeteepiePackage;
import aitchteeteepie.CommandLineInterface;
import aitchteeteepie.Flag;
import aitchteeteepie.Item;
import aitchteeteepie.Method;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Line Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aitchteeteepie.impl.CommandLineInterfaceImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link aitchteeteepie.impl.CommandLineInterfaceImpl#getItems <em>Items</em>}</li>
 *   <li>{@link aitchteeteepie.impl.CommandLineInterfaceImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link aitchteeteepie.impl.CommandLineInterfaceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link aitchteeteepie.impl.CommandLineInterfaceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link aitchteeteepie.impl.CommandLineInterfaceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link aitchteeteepie.impl.CommandLineInterfaceImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommandLineInterfaceImpl extends MinimalEObjectImpl.Container implements CommandLineInterface {
	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected EList<Flag> flags;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Method METHOD_EDEFAULT = Method.GET;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Method method = METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected String protocol = PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected String resource = RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandLineInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flag> getFlags() {
		if (flags == null) {
			flags = new EObjectContainmentEList<Flag>(Flag.class, this, AitchteeteepiePackage.COMMAND_LINE_INTERFACE__FLAGS);
		}
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, AitchteeteepiePackage.COMMAND_LINE_INTERFACE__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		Method oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.COMMAND_LINE_INTERFACE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		String oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.COMMAND_LINE_INTERFACE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(String newResource) {
		String oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.COMMAND_LINE_INTERFACE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__FLAGS:
				return ((InternalEList<?>)getFlags()).basicRemove(otherEnd, msgs);
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__FLAGS:
				return getFlags();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__ITEMS:
				return getItems();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__METHOD:
				return getMethod();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PROTOCOL:
				return getProtocol();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__URL:
				return getUrl();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PORT:
				return getPort();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__RESOURCE:
				return getResource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__FLAGS:
				getFlags().clear();
				getFlags().addAll((Collection<? extends Flag>)newValue);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__METHOD:
				setMethod((Method)newValue);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__URL:
				setUrl((String)newValue);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PORT:
				setPort((Integer)newValue);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__RESOURCE:
				setResource((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__FLAGS:
				getFlags().clear();
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__ITEMS:
				getItems().clear();
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__FLAGS:
				return flags != null && !flags.isEmpty();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__ITEMS:
				return items != null && !items.isEmpty();
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__METHOD:
				return method != METHOD_EDEFAULT;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PORT:
				return port != PORT_EDEFAULT;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (method: ");
		result.append(method);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(", url: ");
		result.append(url);
		result.append(", port: ");
		result.append(port);
		result.append(", resource: ");
		result.append(resource);
		result.append(')');
		return result.toString();
	}

} //CommandLineInterfaceImpl
