/**
 */
package aitchteeteepie.provider;


import aitchteeteepie.AitchteeteepieFactory;
import aitchteeteepie.AitchteeteepiePackage;
import aitchteeteepie.CommandLineInterface;
import aitchteeteepie.Method;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aitchteeteepie.CommandLineInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandLineInterfaceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandLineInterfaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMethodPropertyDescriptor(object);
			addProtocolPropertyDescriptor(object);
			addUrlPropertyDescriptor(object);
			addPortPropertyDescriptor(object);
			addResourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineInterface_method_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineInterface_method_feature", "_UI_CommandLineInterface_type"),
				 AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Protocol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProtocolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineInterface_protocol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineInterface_protocol_feature", "_UI_CommandLineInterface_type"),
				 AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__PROTOCOL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineInterface_url_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineInterface_url_feature", "_UI_CommandLineInterface_type"),
				 AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineInterface_port_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineInterface_port_feature", "_UI_CommandLineInterface_type"),
				 AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resource feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CommandLineInterface_resource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CommandLineInterface_resource_feature", "_UI_CommandLineInterface_type"),
				 AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__RESOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS);
			childrenFeatures.add(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__ITEMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CommandLineInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommandLineInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Method labelValue = ((CommandLineInterface)object).getMethod();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CommandLineInterface_type") :
			getString("_UI_CommandLineInterface_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CommandLineInterface.class)) {
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__METHOD:
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PROTOCOL:
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__URL:
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__PORT:
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__RESOURCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__FLAGS:
			case AitchteeteepiePackage.COMMAND_LINE_INTERFACE__ITEMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createProxyFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createFormFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createAuthFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createDownloadFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createBodyFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createVersionFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createJsonFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createHelpFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createHeadersFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createVerboseFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__FLAGS,
				 AitchteeteepieFactory.eINSTANCE.createTimeoutFlag()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__ITEMS,
				 AitchteeteepieFactory.eINSTANCE.createFormFileFieldItem()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__ITEMS,
				 AitchteeteepieFactory.eINSTANCE.createDataFieldItem()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__ITEMS,
				 AitchteeteepieFactory.eINSTANCE.createHttpHeaderItem()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__ITEMS,
				 AitchteeteepieFactory.eINSTANCE.createUrlParameterItem()));

		newChildDescriptors.add
			(createChildParameter
				(AitchteeteepiePackage.Literals.COMMAND_LINE_INTERFACE__ITEMS,
				 AitchteeteepieFactory.eINSTANCE.createRawJsonFieldItem()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AitchteeteepieEditPlugin.INSTANCE;
	}

}
