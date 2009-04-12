package wfgcml.diagram.providers;

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

import wfgcml.WfgcmlPackage;
import wfgcml.diagram.part.WFGCMLDiagramEditorPlugin;

/**
 * @generated
 */
public class WFGCMLElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private WFGCMLElementTypes() {
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
	public static final IElementType WFGCMLRoot_79 = getElementType("RRComSSys.CMWF.diagram.WFGCMLRoot_79"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType GCMLInstance_1001 = getElementType("RRComSSys.CMWF.diagram.GCMLInstance_1001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Start_1002 = getElementType("RRComSSys.CMWF.diagram.Start_1002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Final_1003 = getElementType("RRComSSys.CMWF.diagram.Final_1003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Condition_1004 = getElementType("RRComSSys.CMWF.diagram.Condition_1004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionAltnext_3001 = getElementType("RRComSSys.CMWF.diagram.ConditionAltnext_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType HasNextNext_3002 = getElementType("RRComSSys.CMWF.diagram.HasNextNext_3002"); //$NON-NLS-1$

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
				return WFGCMLDiagramEditorPlugin.getInstance()
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

			elements
					.put(WFGCMLRoot_79, WfgcmlPackage.eINSTANCE.getWFGCMLRoot());

			elements.put(GCMLInstance_1001, WfgcmlPackage.eINSTANCE
					.getGCMLInstance());

			elements.put(Start_1002, WfgcmlPackage.eINSTANCE.getStart());

			elements.put(Final_1003, WfgcmlPackage.eINSTANCE.getFinal());

			elements
					.put(Condition_1004, WfgcmlPackage.eINSTANCE.getCondition());

			elements.put(ConditionAltnext_3001, WfgcmlPackage.eINSTANCE
					.getCondition_Altnext());

			elements.put(HasNextNext_3002, WfgcmlPackage.eINSTANCE
					.getHasNext_Next());
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
			KNOWN_ELEMENT_TYPES.add(WFGCMLRoot_79);
			KNOWN_ELEMENT_TYPES.add(GCMLInstance_1001);
			KNOWN_ELEMENT_TYPES.add(Start_1002);
			KNOWN_ELEMENT_TYPES.add(Final_1003);
			KNOWN_ELEMENT_TYPES.add(Condition_1004);
			KNOWN_ELEMENT_TYPES.add(ConditionAltnext_3001);
			KNOWN_ELEMENT_TYPES.add(HasNextNext_3002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
