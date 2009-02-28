package gcml.diagram.providers;

import gcml.GcmlPackage;
import gcml.diagram.part.GCMLDiagramEditorPlugin;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class GCMLElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private GCMLElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType UserSchema_79 = getElementType("edu.fiu.RRComSSys.diagram.UserSchema_79"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttached_1001 = getElementType("edu.fiu.RRComSSys.diagram.IsAttached_1001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_1002 = getElementType("edu.fiu.RRComSSys.diagram.Connection_1002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_1003 = getElementType("edu.fiu.RRComSSys.diagram.Capability_1003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Person_1004 = getElementType("edu.fiu.RRComSSys.diagram.Person_1004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_1005 = getElementType("edu.fiu.RRComSSys.diagram.Device_1005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttachedConnectToDevice_3001 = getElementType("edu.fiu.RRComSSys.diagram.IsAttachedConnectToDevice_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttachedConnectToPerson_3002 = getElementType("edu.fiu.RRComSSys.diagram.IsAttachedConnectToPerson_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeviceCapabilities_3003 = getElementType("edu.fiu.RRComSSys.diagram.DeviceCapabilities_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionDevices_3004 = getElementType("edu.fiu.RRComSSys.diagram.ConnectionDevices_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return GCMLDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(UserSchema_79, GcmlPackage.eINSTANCE.getUserSchema());

			elements
					.put(IsAttached_1001, GcmlPackage.eINSTANCE.getIsAttached());

			elements
					.put(Connection_1002, GcmlPackage.eINSTANCE.getConnection());

			elements
					.put(Capability_1003, GcmlPackage.eINSTANCE.getCapability());

			elements.put(Person_1004, GcmlPackage.eINSTANCE.getPerson());

			elements.put(Device_1005, GcmlPackage.eINSTANCE.getDevice());

			elements.put(IsAttachedConnectToDevice_3001, GcmlPackage.eINSTANCE
					.getIsAttached_ConnectToDevice());

			elements.put(IsAttachedConnectToPerson_3002, GcmlPackage.eINSTANCE
					.getIsAttached_ConnectToPerson());

			elements.put(DeviceCapabilities_3003, GcmlPackage.eINSTANCE
					.getDevice_Capabilities());

			elements.put(ConnectionDevices_3004, GcmlPackage.eINSTANCE
					.getConnection_Devices());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(UserSchema_79);
			KNOWN_ELEMENT_TYPES.add(IsAttached_1001);
			KNOWN_ELEMENT_TYPES.add(Connection_1002);
			KNOWN_ELEMENT_TYPES.add(Capability_1003);
			KNOWN_ELEMENT_TYPES.add(Person_1004);
			KNOWN_ELEMENT_TYPES.add(Device_1005);
			KNOWN_ELEMENT_TYPES.add(IsAttachedConnectToDevice_3001);
			KNOWN_ELEMENT_TYPES.add(IsAttachedConnectToPerson_3002);
			KNOWN_ELEMENT_TYPES.add(DeviceCapabilities_3003);
			KNOWN_ELEMENT_TYPES.add(ConnectionDevices_3004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
