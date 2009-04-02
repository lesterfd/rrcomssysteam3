package GCML.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import GCML.Capability;
import GCML.Connection;
import GCML.Device;
import GCML.GCMLDocument;
import GCML.GCMLPackage;
import GCML.IsAttached;
import GCML.Medium;
import GCML.Person;
import GCML.Shape;
import GCML.diagram.edit.parts.CapabilityEditPart;
import GCML.diagram.edit.parts.ConnectionDeviceEditPart;
import GCML.diagram.edit.parts.ConnectionEditPart;
import GCML.diagram.edit.parts.ConnectionMediumEditPart;
import GCML.diagram.edit.parts.DeviceCapabilityEditPart;
import GCML.diagram.edit.parts.DeviceEditPart;
import GCML.diagram.edit.parts.GCMLDocumentEditPart;
import GCML.diagram.edit.parts.IsAttachedDeviceIDEditPart;
import GCML.diagram.edit.parts.IsAttachedEditPart;
import GCML.diagram.edit.parts.IsAttachedPersonIDEditPart;
import GCML.diagram.edit.parts.MediumEditPart;
import GCML.diagram.edit.parts.PersonEditPart;
import GCML.diagram.providers.GCMLElementTypes;

/**
 * @generated
 */
public class GCMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (GCMLVisualIDRegistry.getVisualID(view)) {
		case GCMLDocumentEditPart.VISUAL_ID:
			return getGCMLDocument_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGCMLDocument_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		GCMLDocument modelElement = (GCMLDocument) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getShape().iterator(); it.hasNext();) {
			Shape childElement = (Shape) it.next();
			int visualID = GCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IsAttachedEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CapabilityEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConnectionEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PersonEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MediumEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (GCMLVisualIDRegistry.getVisualID(view)) {
		case GCMLDocumentEditPart.VISUAL_ID:
			return getGCMLDocument_1000ContainedLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2001ContainedLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_2002ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2003ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2004ContainedLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2005ContainedLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2006ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (GCMLVisualIDRegistry.getVisualID(view)) {
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2001IncomingLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_2002IncomingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2003IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2004IncomingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2005IncomingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2006IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (GCMLVisualIDRegistry.getVisualID(view)) {
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_2001OutgoingLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_2002OutgoingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2003OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_2004OutgoingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_2005OutgoingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_2006OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGCMLDocument_1000ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_2001ContainedLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_PersonID_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_DeviceID_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCapability_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2003ContainedLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_Capability_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2004ContainedLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Device_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Medium_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMedium_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_2001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCapability_2002IncomingLinks(View view) {
		Capability modelElement = (Capability) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Device_Capability_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2003IncomingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Device_4001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_DeviceID_4004(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2005IncomingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_PersonID_4003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMedium_2006IncomingLinks(View view) {
		Medium modelElement = (Medium) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Medium_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_2001OutgoingLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_PersonID_4003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_DeviceID_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCapability_2002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDevice_2003OutgoingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_Capability_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_2004OutgoingLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Device_4001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Medium_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_2005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMedium_2006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Connection_Device_4001(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getConnection_Device()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.ConnectionDevice_4001,
						ConnectionDeviceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Connection_Medium_4002(
			Medium target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getConnection_Medium()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.ConnectionMedium_4002,
						ConnectionMediumEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_PersonID_4003(
			Person target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getIsAttached_PersonID()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.IsAttachedPersonID_4003,
						IsAttachedPersonIDEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_DeviceID_4004(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getIsAttached_DeviceID()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.IsAttachedDeviceID_4004,
						IsAttachedDeviceIDEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Device_Capability_4005(
			Capability target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getDevice_Capability()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.DeviceCapability_4005,
						DeviceCapabilityEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Connection_Device_4001(
			Connection source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDevice().iterator(); destinations
				.hasNext();) {
			Device destination = (Device) destinations.next();
			result.add(new GCMLLinkDescriptor(source, destination,
					GCMLElementTypes.ConnectionDevice_4001,
					ConnectionDeviceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Connection_Medium_4002(
			Connection source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getMedium().iterator(); destinations
				.hasNext();) {
			Medium destination = (Medium) destinations.next();
			result.add(new GCMLLinkDescriptor(source, destination,
					GCMLElementTypes.ConnectionMedium_4002,
					ConnectionMediumEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_PersonID_4003(
			IsAttached source) {
		Collection result = new LinkedList();
		Person destination = source.getPersonID();
		if (destination == null) {
			return result;
		}
		result.add(new GCMLLinkDescriptor(source, destination,
				GCMLElementTypes.IsAttachedPersonID_4003,
				IsAttachedPersonIDEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_DeviceID_4004(
			IsAttached source) {
		Collection result = new LinkedList();
		Device destination = source.getDeviceID();
		if (destination == null) {
			return result;
		}
		result.add(new GCMLLinkDescriptor(source, destination,
				GCMLElementTypes.IsAttachedDeviceID_4004,
				IsAttachedDeviceIDEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Device_Capability_4005(
			Device source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getCapability().iterator(); destinations
				.hasNext();) {
			Capability destination = (Capability) destinations.next();
			result.add(new GCMLLinkDescriptor(source, destination,
					GCMLElementTypes.DeviceCapability_4005,
					DeviceCapabilityEditPart.VISUAL_ID));
		}
		return result;
	}

}
