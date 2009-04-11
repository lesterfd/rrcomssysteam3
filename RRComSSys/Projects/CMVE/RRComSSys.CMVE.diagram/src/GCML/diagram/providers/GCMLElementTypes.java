package GCML.diagram.providers;

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

import GCML.GCMLPackage;
import GCML.diagram.part.GCMLDiagramEditorPlugin;

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
	public static final IElementType GCMLDocument_79 = getElementType("RRComSSys.CMVE.diagram.GCMLDocument_79"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IsAttached_1001 = getElementType("RRComSSys.CMVE.diagram.IsAttached_1001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Capability_1002 = getElementType("RRComSSys.CMVE.diagram.Capability_1002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Device_1003 = getElementType("RRComSSys.CMVE.diagram.Device_1003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connection_1004 = getElementType("RRComSSys.CMVE.diagram.Connection_1004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Person_1005 = getElementType("RRComSSys.CMVE.diagram.Person_1005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Medium_1006 = getElementType("RRComSSys.CMVE.diagram.Medium_1006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectionDevice_3001 = getElementType("RRComSSys.CMVE.diagram.ConnectionDevice_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectionMedium_3002 = getElementType("RRComSSys.CMVE.diagram.ConnectionMedium_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IsAttachedPersonID_3003 = getElementType("RRComSSys.CMVE.diagram.IsAttachedPersonID_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IsAttachedDeviceID_3004 = getElementType("RRComSSys.CMVE.diagram.IsAttachedDeviceID_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DeviceCapability_3005 = getElementType("RRComSSys.CMVE.diagram.DeviceCapability_3005"); //$NON-NLS-1$

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

			elements.put(GCMLDocument_79, GCMLPackage.eINSTANCE
					.getGCMLDocument());

			elements
					.put(IsAttached_1001, GCMLPackage.eINSTANCE.getIsAttached());

			elements
					.put(Capability_1002, GCMLPackage.eINSTANCE.getCapability());

			elements.put(Device_1003, GCMLPackage.eINSTANCE.getDevice());

			elements
					.put(Connection_1004, GCMLPackage.eINSTANCE.getConnection());

			elements.put(Person_1005, GCMLPackage.eINSTANCE.getPerson());

			elements.put(Medium_1006, GCMLPackage.eINSTANCE.getMedium());

			elements.put(ConnectionDevice_3001, GCMLPackage.eINSTANCE
					.getConnection_Device());

			elements.put(ConnectionMedium_3002, GCMLPackage.eINSTANCE
					.getConnection_Medium());

			elements.put(IsAttachedPersonID_3003, GCMLPackage.eINSTANCE
					.getIsAttached_PersonID());

			elements.put(IsAttachedDeviceID_3004, GCMLPackage.eINSTANCE
					.getIsAttached_DeviceID());

			elements.put(DeviceCapability_3005, GCMLPackage.eINSTANCE
					.getDevice_Capability());
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
			KNOWN_ELEMENT_TYPES.add(GCMLDocument_79);
			KNOWN_ELEMENT_TYPES.add(IsAttached_1001);
			KNOWN_ELEMENT_TYPES.add(Capability_1002);
			KNOWN_ELEMENT_TYPES.add(Device_1003);
			KNOWN_ELEMENT_TYPES.add(Connection_1004);
			KNOWN_ELEMENT_TYPES.add(Person_1005);
			KNOWN_ELEMENT_TYPES.add(Medium_1006);
			KNOWN_ELEMENT_TYPES.add(ConnectionDevice_3001);
			KNOWN_ELEMENT_TYPES.add(ConnectionMedium_3002);
			KNOWN_ELEMENT_TYPES.add(IsAttachedPersonID_3003);
			KNOWN_ELEMENT_TYPES.add(IsAttachedDeviceID_3004);
			KNOWN_ELEMENT_TYPES.add(DeviceCapability_3005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
