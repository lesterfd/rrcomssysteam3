package gcml.diagram.part;

import gcml.Capability;
import gcml.Connection;
import gcml.Device;
import gcml.GcmlPackage;
import gcml.IsAttached;
import gcml.Person;
import gcml.Shape;
import gcml.UserSchema;
import gcml.diagram.edit.parts.CapabilityEditPart;
import gcml.diagram.edit.parts.ConnectionDevicesEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.DeviceCapabilitiesEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.IsAttachedConnectToDeviceEditPart;
import gcml.diagram.edit.parts.IsAttachedConnectToPersonEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.PersonEditPart;
import gcml.diagram.edit.parts.UserSchemaEditPart;
import gcml.diagram.providers.GCMLElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GCMLDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (GCMLVisualIDRegistry.getVisualID(view)) {
		case UserSchemaEditPart.VISUAL_ID:
			return getUserSchema_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUserSchema_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		UserSchema modelElement = (UserSchema) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getContainsShapes().iterator(); it
				.hasNext();) {
			Shape childElement = (Shape) it.next();
			int visualID = GCMLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == IsAttachedEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConnectionEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == CapabilityEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == PersonEditPart.VISUAL_ID) {
				result.add(new GCMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeviceEditPart.VISUAL_ID) {
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
		case UserSchemaEditPart.VISUAL_ID:
			return getUserSchema_79ContainedLinks(view);
		case IsAttachedEditPart.VISUAL_ID:
			return getIsAttached_1001ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_1002ContainedLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_1003ContainedLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_1004ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_1005ContainedLinks(view);
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
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_1002IncomingLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_1003IncomingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_1004IncomingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_1005IncomingLinks(view);
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
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_1002OutgoingLinks(view);
		case CapabilityEditPart.VISUAL_ID:
			return getCapability_1003OutgoingLinks(view);
		case PersonEditPart.VISUAL_ID:
			return getPerson_1004OutgoingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_1005OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUserSchema_79ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsAttached_1001ContainedLinks(View view) {
		IsAttached modelElement = (IsAttached) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_ConnectToDevice_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_ConnectToPerson_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_1002ContainedLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Devices_3004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCapability_1003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerson_1004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDevice_1005ContainedLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_Capabilities_3003(modelElement));
		return result;
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
	public static List getConnection_1002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCapability_1003IncomingLinks(View view) {
		Capability modelElement = (Capability) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_Device_Capabilities_3003(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPerson_1004IncomingLinks(View view) {
		Person modelElement = (Person) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_ConnectToPerson_3002(
						modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDevice_1005IncomingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result
				.addAll(getIncomingFeatureModelFacetLinks_IsAttached_ConnectToDevice_3001(
						modelElement, crossReferences));
		result
				.addAll(getIncomingFeatureModelFacetLinks_Connection_Devices_3004(
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
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_ConnectToDevice_3001(modelElement));
		result
				.addAll(getOutgoingFeatureModelFacetLinks_IsAttached_ConnectToPerson_3002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getConnection_1002OutgoingLinks(View view) {
		Connection modelElement = (Connection) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Connection_Devices_3004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCapability_1003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPerson_1004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDevice_1005OutgoingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingFeatureModelFacetLinks_Device_Capabilities_3003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_ConnectToDevice_3001(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getIsAttached_ConnectToDevice()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.IsAttachedConnectToDevice_3001,
						IsAttachedConnectToDeviceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_IsAttached_ConnectToPerson_3002(
			Person target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getIsAttached_ConnectToPerson()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.IsAttachedConnectToPerson_3002,
						IsAttachedConnectToPersonEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Device_Capabilities_3003(
			Capability target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getDevice_Capabilities()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.DeviceCapabilities_3003,
						DeviceCapabilitiesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingFeatureModelFacetLinks_Connection_Devices_3004(
			Device target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() == GcmlPackage.eINSTANCE
					.getConnection_Devices()) {
				result.add(new GCMLLinkDescriptor(setting.getEObject(), target,
						GCMLElementTypes.ConnectionDevices_3004,
						ConnectionDevicesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_ConnectToDevice_3001(
			IsAttached source) {
		Collection result = new LinkedList();
		Device destination = source.getConnectToDevice();
		if (destination == null) {
			return result;
		}
		result.add(new GCMLLinkDescriptor(source, destination,
				GCMLElementTypes.IsAttachedConnectToDevice_3001,
				IsAttachedConnectToDeviceEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_IsAttached_ConnectToPerson_3002(
			IsAttached source) {
		Collection result = new LinkedList();
		Person destination = source.getConnectToPerson();
		if (destination == null) {
			return result;
		}
		result.add(new GCMLLinkDescriptor(source, destination,
				GCMLElementTypes.IsAttachedConnectToPerson_3002,
				IsAttachedConnectToPersonEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Device_Capabilities_3003(
			Device source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getCapabilities().iterator(); destinations
				.hasNext();) {
			Capability destination = (Capability) destinations.next();
			result.add(new GCMLLinkDescriptor(source, destination,
					GCMLElementTypes.DeviceCapabilities_3003,
					DeviceCapabilitiesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingFeatureModelFacetLinks_Connection_Devices_3004(
			Connection source) {
		Collection result = new LinkedList();
		for (Iterator destinations = source.getDevices().iterator(); destinations
				.hasNext();) {
			Device destination = (Device) destinations.next();
			result.add(new GCMLLinkDescriptor(source, destination,
					GCMLElementTypes.ConnectionDevices_3004,
					ConnectionDevicesEditPart.VISUAL_ID));
		}
		return result;
	}

}
