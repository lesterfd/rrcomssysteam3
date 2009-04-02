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
	public static final IElementType GCMLDocument_1000 = getElementType("edu.fiu.RRComSSys.diagram.GCMLDocument_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttached_2001 = getElementType("edu.fiu.RRComSSys.diagram.IsAttached_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Capability_2002 = getElementType("edu.fiu.RRComSSys.diagram.Capability_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Device_2003 = getElementType("edu.fiu.RRComSSys.diagram.Device_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Connection_2004 = getElementType("edu.fiu.RRComSSys.diagram.Connection_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Person_2005 = getElementType("edu.fiu.RRComSSys.diagram.Person_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Medium_2006 = getElementType("edu.fiu.RRComSSys.diagram.Medium_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionDevice_4001 = getElementType("edu.fiu.RRComSSys.diagram.ConnectionDevice_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConnectionMedium_4002 = getElementType("edu.fiu.RRComSSys.diagram.ConnectionMedium_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttachedPersonID_4003 = getElementType("edu.fiu.RRComSSys.diagram.IsAttachedPersonID_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType IsAttachedDeviceID_4004 = getElementType("edu.fiu.RRComSSys.diagram.IsAttachedDeviceID_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DeviceCapability_4005 = getElementType("edu.fiu.RRComSSys.diagram.DeviceCapability_4005"); //$NON-NLS-1$

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

			elements.put(GCMLDocument_1000, GCMLPackage.eINSTANCE
					.getGCMLDocument());

			elements
					.put(IsAttached_2001, GCMLPackage.eINSTANCE.getIsAttached());

			elements
					.put(Capability_2002, GCMLPackage.eINSTANCE.getCapability());

			elements.put(Device_2003, GCMLPackage.eINSTANCE.getDevice());

			elements
					.put(Connection_2004, GCMLPackage.eINSTANCE.getConnection());

			elements.put(Person_2005, GCMLPackage.eINSTANCE.getPerson());

			elements.put(Medium_2006, GCMLPackage.eINSTANCE.getMedium());

			elements.put(ConnectionDevice_4001, GCMLPackage.eINSTANCE
					.getConnection_Device());

			elements.put(ConnectionMedium_4002, GCMLPackage.eINSTANCE
					.getConnection_Medium());

			elements.put(IsAttachedPersonID_4003, GCMLPackage.eINSTANCE
					.getIsAttached_PersonID());

			elements.put(IsAttachedDeviceID_4004, GCMLPackage.eINSTANCE
					.getIsAttached_DeviceID());

			elements.put(DeviceCapability_4005, GCMLPackage.eINSTANCE
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
			KNOWN_ELEMENT_TYPES.add(GCMLDocument_1000);
			KNOWN_ELEMENT_TYPES.add(IsAttached_2001);
			KNOWN_ELEMENT_TYPES.add(Capability_2002);
			KNOWN_ELEMENT_TYPES.add(Device_2003);
			KNOWN_ELEMENT_TYPES.add(Connection_2004);
			KNOWN_ELEMENT_TYPES.add(Person_2005);
			KNOWN_ELEMENT_TYPES.add(Medium_2006);
			KNOWN_ELEMENT_TYPES.add(ConnectionDevice_4001);
			KNOWN_ELEMENT_TYPES.add(ConnectionMedium_4002);
			KNOWN_ELEMENT_TYPES.add(IsAttachedPersonID_4003);
			KNOWN_ELEMENT_TYPES.add(IsAttachedDeviceID_4004);
			KNOWN_ELEMENT_TYPES.add(DeviceCapability_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
