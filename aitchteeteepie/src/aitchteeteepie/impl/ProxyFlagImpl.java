/**
 */
package aitchteeteepie.impl;

import aitchteeteepie.AitchteeteepiePackage;
import aitchteeteepie.ProxyFlag;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Flag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link aitchteeteepie.impl.ProxyFlagImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link aitchteeteepie.impl.ProxyFlagImpl#getProxyProtocol <em>Proxy Protocol</em>}</li>
 *   <li>{@link aitchteeteepie.impl.ProxyFlagImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link aitchteeteepie.impl.ProxyFlagImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link aitchteeteepie.impl.ProxyFlagImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link aitchteeteepie.impl.ProxyFlagImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProxyFlagImpl extends FlagImpl implements ProxyFlag {
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
	 * The default value of the '{@link #getProxyProtocol() <em>Proxy Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROXY_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProxyProtocol() <em>Proxy Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyProtocol()
	 * @generated
	 * @ordered
	 */
	protected String proxyProtocol = PROXY_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProxyFlagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AitchteeteepiePackage.Literals.PROXY_FLAG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.PROXY_FLAG__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProxyProtocol() {
		return proxyProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyProtocol(String newProxyProtocol) {
		String oldProxyProtocol = proxyProtocol;
		proxyProtocol = newProxyProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.PROXY_FLAG__PROXY_PROTOCOL, oldProxyProtocol, proxyProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.PROXY_FLAG__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.PROXY_FLAG__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.PROXY_FLAG__HOSTNAME, oldHostname, hostname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AitchteeteepiePackage.PROXY_FLAG__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AitchteeteepiePackage.PROXY_FLAG__PROTOCOL:
				return getProtocol();
			case AitchteeteepiePackage.PROXY_FLAG__PROXY_PROTOCOL:
				return getProxyProtocol();
			case AitchteeteepiePackage.PROXY_FLAG__USERNAME:
				return getUsername();
			case AitchteeteepiePackage.PROXY_FLAG__PASSWORD:
				return getPassword();
			case AitchteeteepiePackage.PROXY_FLAG__HOSTNAME:
				return getHostname();
			case AitchteeteepiePackage.PROXY_FLAG__PORT:
				return getPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AitchteeteepiePackage.PROXY_FLAG__PROTOCOL:
				setProtocol((String)newValue);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__PROXY_PROTOCOL:
				setProxyProtocol((String)newValue);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__USERNAME:
				setUsername((String)newValue);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__PASSWORD:
				setPassword((String)newValue);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__HOSTNAME:
				setHostname((String)newValue);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__PORT:
				setPort((Integer)newValue);
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
			case AitchteeteepiePackage.PROXY_FLAG__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__PROXY_PROTOCOL:
				setProxyProtocol(PROXY_PROTOCOL_EDEFAULT);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__HOSTNAME:
				setHostname(HOSTNAME_EDEFAULT);
				return;
			case AitchteeteepiePackage.PROXY_FLAG__PORT:
				setPort(PORT_EDEFAULT);
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
			case AitchteeteepiePackage.PROXY_FLAG__PROTOCOL:
				return PROTOCOL_EDEFAULT == null ? protocol != null : !PROTOCOL_EDEFAULT.equals(protocol);
			case AitchteeteepiePackage.PROXY_FLAG__PROXY_PROTOCOL:
				return PROXY_PROTOCOL_EDEFAULT == null ? proxyProtocol != null : !PROXY_PROTOCOL_EDEFAULT.equals(proxyProtocol);
			case AitchteeteepiePackage.PROXY_FLAG__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case AitchteeteepiePackage.PROXY_FLAG__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case AitchteeteepiePackage.PROXY_FLAG__HOSTNAME:
				return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
			case AitchteeteepiePackage.PROXY_FLAG__PORT:
				return port != PORT_EDEFAULT;
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
		result.append(" (protocol: ");
		result.append(protocol);
		result.append(", proxyProtocol: ");
		result.append(proxyProtocol);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //ProxyFlagImpl
