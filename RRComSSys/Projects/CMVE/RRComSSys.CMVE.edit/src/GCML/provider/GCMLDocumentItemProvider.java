/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GCML.provider;


import GCML.GCMLDocument;
import GCML.GCMLFactory;
import GCML.GCMLPackage;

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
 * This is the item provider adapter for a {@link GCML.GCMLDocument} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GCMLDocumentItemProvider
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
	public GCMLDocumentItemProvider(AdapterFactory adapterFactory) {
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

			addCommunicationIDPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Communication ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GCMLDocument_CommunicationID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GCMLDocument_CommunicationID_feature", "_UI_GCMLDocument_type"),
				 GCMLPackage.Literals.GCML_DOCUMENT__COMMUNICATION_ID,
				 false,
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
			childrenFeatures.add(GCMLPackage.Literals.GCML_DOCUMENT__PERSON);
			childrenFeatures.add(GCMLPackage.Literals.GCML_DOCUMENT__IS_ATTACHED);
			childrenFeatures.add(GCMLPackage.Literals.GCML_DOCUMENT__DEVICE);
			childrenFeatures.add(GCMLPackage.Literals.GCML_DOCUMENT__CAPABILITY);
			childrenFeatures.add(GCMLPackage.Literals.GCML_DOCUMENT__MEDIUM);
			childrenFeatures.add(GCMLPackage.Literals.GCML_DOCUMENT__CONNECTION);
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
	 * This returns GCMLDocument.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GCMLDocument"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GCMLDocument)object).getCommunicationID();
		return label == null || label.length() == 0 ?
			getString("_UI_GCMLDocument_type") :
			getString("_UI_GCMLDocument_type") + " " + label;
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

		switch (notification.getFeatureID(GCMLDocument.class)) {
			case GCMLPackage.GCML_DOCUMENT__COMMUNICATION_ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GCMLPackage.GCML_DOCUMENT__PERSON:
			case GCMLPackage.GCML_DOCUMENT__IS_ATTACHED:
			case GCMLPackage.GCML_DOCUMENT__DEVICE:
			case GCMLPackage.GCML_DOCUMENT__CAPABILITY:
			case GCMLPackage.GCML_DOCUMENT__MEDIUM:
			case GCMLPackage.GCML_DOCUMENT__CONNECTION:
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
				(GCMLPackage.Literals.GCML_DOCUMENT__PERSON,
				 GCMLFactory.eINSTANCE.createPerson()));

		newChildDescriptors.add
			(createChildParameter
				(GCMLPackage.Literals.GCML_DOCUMENT__IS_ATTACHED,
				 GCMLFactory.eINSTANCE.createIsAttached()));

		newChildDescriptors.add
			(createChildParameter
				(GCMLPackage.Literals.GCML_DOCUMENT__DEVICE,
				 GCMLFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(GCMLPackage.Literals.GCML_DOCUMENT__CAPABILITY,
				 GCMLFactory.eINSTANCE.createCapability()));

		newChildDescriptors.add
			(createChildParameter
				(GCMLPackage.Literals.GCML_DOCUMENT__MEDIUM,
				 GCMLFactory.eINSTANCE.createMedium()));

		newChildDescriptors.add
			(createChildParameter
				(GCMLPackage.Literals.GCML_DOCUMENT__CONNECTION,
				 GCMLFactory.eINSTANCE.createConnection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GCMLEditPlugin.INSTANCE;
	}

}
