package GCML.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
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
			return getGCMLDocument_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGCMLDocument_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		GCMLDocument modelElement = (GCMLDocument) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIsAttached().iterator(); it
				.hasNext();) {
			IsAttached childElement = (IsAttached) it.next();
			int visualID = GCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IsAttachedEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getCapability().iterator(); it
				.hasNext();) {
			Capability childElement = (Capability) it.next();
			int visualID = GCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CapabilityEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getDevice().iterator(); it.hasNext();) {
			Device childElement = (Device) it.next();
			int visualID = GCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getConnection().iterator(); it
				.hasNext();) {
			Connection childElement = (Connection) it.next();
			int visualID = GCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConnectionEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getPerson().iterator(); it.hasNext();) {
			Person childElement = (Person) it.next();
			int visualID = GCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PersonEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getMedium().iterator(); it.hasNext();) {
			Medium childElement = (Medium) it.next();
			int visualID = GCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
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
			return getGCMLDocument_79ContainedLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_1001ContainedLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_1002ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_1003ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_1004ContainedLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_1005ContainedLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_1006ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (GCMLVisualIDRegistry.getVisualID(view)) {
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_1001IncomingLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_1002IncomingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_1003IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_1004IncomingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_1005IncomingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_1006IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (GCMLVisualIDRegistry.getVisualID(view)) {
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_1001OutgoingLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_1002OutgoingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_1003OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_1004OutgoingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_1005OutgoingLinks(view);
		case MediumEditPart.VISUAL_ID:
			return getMedium_1006OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGCMLDocument_79ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_1001ContainedLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_PersonID_3003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_DeviceID_3004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCapability_1002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDevice_1003ContainedLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_Capability_3005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_1004ContainedLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Device_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Medium_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_1005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMedium_1006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_1001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCapability_1002IncomingLinks(View view) {
		Capability modelElement = (Capability) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Device_Capability_3005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDevice_1003IncomingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Device_3001(
				modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_DeviceID_3004(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_1004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerson_1005IncomingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_PersonID_3003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMedium_1006IncomingLinks(View view) {
		Medium modelElement = (Medium) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingFeatureModelFacetLinks_Connection_Medium_3002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_1001OutgoingLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_PersonID_3003(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_DeviceID_3004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCapability_1002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDevice_1003OutgoingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_Capability_3005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_1004OutgoingLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Device_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Medium_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_1005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMedium_1006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Connection_Device_3001(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getConnection_Device()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.ConnectionDevice_3001,
						ConnectionDeviceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Connection_Medium_3002(
			Medium target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getConnection_Medium()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.ConnectionMedium_3002,
						ConnectionMediumEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_PersonID_3003(
			Person target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getIsAttached_PersonID()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.IsAttachedPersonID_3003,
						IsAttachedPersonIDEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_DeviceID_3004(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getIsAttached_DeviceID()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.IsAttachedDeviceID_3004,
						IsAttachedDeviceIDEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Device_Capability_3005(
			Capability target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GCMLPackage.eINSTANCE
					.getDevice_Capability()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.DeviceCapability_3005,
						DeviceCapabilityEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Connection_Device_3001(
			Connection source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDevice().iterator(); destinations
				.hasNext();) {
			Device destination = (Device) destinations.next();
			result.add(new GCMLLinkDescriptor(source, destination,
					GCMLElementTypes.ConnectionDevice_3001,
					ConnectionDeviceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Connection_Medium_3002(
			Connection source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getMedium().iterator(); destinations
				.hasNext();) {
			Medium destination = (Medium) destinations.next();
			result.add(new GCMLLinkDescriptor(source, destination,
					GCMLElementTypes.ConnectionMedium_3002,
					ConnectionMediumEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_PersonID_3003(
			IsAttached source) {
		Collection result = new LinkedList();
		Person destination = source.getPersonID();
		if (destination == null) {
			return result;
		}
		result.add(new GCMLLinkDescriptor(source, destination,
				GCMLElementTypes.IsAttachedPersonID_3003,
				IsAttachedPersonIDEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_DeviceID_3004(
			IsAttached source) {
		Collection result = new LinkedList();
		Device destination = source.getDeviceID();
		if (destination == null) {
			return result;
		}
		result.add(new GCMLLinkDescriptor(source, destination,
				GCMLElementTypes.IsAttachedDeviceID_3004,
				IsAttachedDeviceIDEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Device_Capability_3005(
			Device source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getCapability().iterator(); destinations
				.hasNext();) {
			Capability destination = (Capability) destinations.next();
			result.add(new GCMLLinkDescriptor(source, destination,
					GCMLElementTypes.DeviceCapability_3005,
					DeviceCapabilityEditPart.VISUAL_ID));
		}
		return result;
	}

}
