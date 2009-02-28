package gcml.diagram.part;

import gcml.GcmlPackage;
import gcml.UserSchema;
import gcml.diagram.edit.parts.CapabilityBuiltInTypeEditPart;
import gcml.diagram.edit.parts.CapabilityEditPart;
import gcml.diagram.edit.parts.ConnectionEditPart;
import gcml.diagram.edit.parts.DeviceDeviceIDEditPart;
import gcml.diagram.edit.parts.DeviceEditPart;
import gcml.diagram.edit.parts.IsAttachedEditPart;
import gcml.diagram.edit.parts.PersonEditPart;
import gcml.diagram.edit.parts.PersonPersonIDEditPart;
import gcml.diagram.edit.parts.PersonPersonNameEditPart;
import gcml.diagram.edit.parts.PersonPersonRoleEditPart;
import gcml.diagram.edit.parts.UserSchemaEditPart;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class GCMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "edu.fiu.RRComSSys.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (UserSchemaEditPart.MODEL_ID.equals(view.getType())) {
				return UserSchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return gcml.diagram.part.GCMLVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				GCMLDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (GcmlPackage.eINSTANCE.getUserSchema().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((UserSchema) domainElement)) {
			return UserSchemaEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = gcml.diagram.part.GCMLVisualIDRegistry
				.getModelID(containerView);
		if (!UserSchemaEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (UserSchemaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gcml.diagram.part.GCMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UserSchemaEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case UserSchemaEditPart.VISUAL_ID:
			if (GcmlPackage.eINSTANCE.getIsAttached().isSuperTypeOf(
					domainElement.eClass())) {
				return IsAttachedEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getConnection().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getCapability().isSuperTypeOf(
					domainElement.eClass())) {
				return CapabilityEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getPerson().isSuperTypeOf(
					domainElement.eClass())) {
				return PersonEditPart.VISUAL_ID;
			}
			if (GcmlPackage.eINSTANCE.getDevice().isSuperTypeOf(
					domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = gcml.diagram.part.GCMLVisualIDRegistry
				.getModelID(containerView);
		if (!UserSchemaEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (UserSchemaEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = gcml.diagram.part.GCMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = UserSchemaEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CapabilityEditPart.VISUAL_ID:
			if (CapabilityBuiltInTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PersonEditPart.VISUAL_ID:
			if (PersonPersonNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonPersonIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonPersonRoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (DeviceDeviceIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserSchemaEditPart.VISUAL_ID:
			if (IsAttachedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CapabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(UserSchema element) {
		return true;
	}

}
