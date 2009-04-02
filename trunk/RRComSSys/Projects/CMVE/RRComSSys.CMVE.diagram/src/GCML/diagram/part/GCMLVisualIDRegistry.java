package GCML.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import GCML.GCMLDocument;
import GCML.GCMLPackage;
import GCML.diagram.edit.parts.CapabilityBuiltInTypeEditPart;
import GCML.diagram.edit.parts.CapabilityEditPart;
import GCML.diagram.edit.parts.ConnectionEditPart;
import GCML.diagram.edit.parts.DeviceEditPart;
import GCML.diagram.edit.parts.GCMLDocumentEditPart;
import GCML.diagram.edit.parts.IsAttachedEditPart;
import GCML.diagram.edit.parts.MediumActionEditPart;
import GCML.diagram.edit.parts.MediumBuiltInTypeEditPart;
import GCML.diagram.edit.parts.MediumEditPart;
import GCML.diagram.edit.parts.MediumMediumURLEditPart;
import GCML.diagram.edit.parts.PersonEditPart;
import GCML.diagram.edit.parts.PersonPersonIDEditPart;
import GCML.diagram.edit.parts.PersonPersonNameEditPart;
import GCML.diagram.edit.parts.PersonPersonRoleEditPart;

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
			if (GCMLDocumentEditPart.MODEL_ID.equals(view.getType())) {
				return GCMLDocumentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return GCML.diagram.part.GCMLVisualIDRegistry.getVisualID(view
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
		if (GCMLPackage.eINSTANCE.getGCMLDocument().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((GCMLDocument) domainElement)) {
			return GCMLDocumentEditPart.VISUAL_ID;
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
		String containerModelID = GCML.diagram.part.GCMLVisualIDRegistry
				.getModelID(containerView);
		if (!GCMLDocumentEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (GCMLDocumentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = GCML.diagram.part.GCMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GCMLDocumentEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case GCMLDocumentEditPart.VISUAL_ID:
			if (GCMLPackage.eINSTANCE.getIsAttached().isSuperTypeOf(
					domainElement.eClass())) {
				return IsAttachedEditPart.VISUAL_ID;
			}
			if (GCMLPackage.eINSTANCE.getCapability().isSuperTypeOf(
					domainElement.eClass())) {
				return CapabilityEditPart.VISUAL_ID;
			}
			if (GCMLPackage.eINSTANCE.getDevice().isSuperTypeOf(
					domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (GCMLPackage.eINSTANCE.getConnection().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectionEditPart.VISUAL_ID;
			}
			if (GCMLPackage.eINSTANCE.getPerson().isSuperTypeOf(
					domainElement.eClass())) {
				return PersonEditPart.VISUAL_ID;
			}
			if (GCMLPackage.eINSTANCE.getMedium().isSuperTypeOf(
					domainElement.eClass())) {
				return MediumEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = GCML.diagram.part.GCMLVisualIDRegistry
				.getModelID(containerView);
		if (!GCMLDocumentEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (GCMLDocumentEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = GCML.diagram.part.GCMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = GCMLDocumentEditPart.VISUAL_ID;
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
		case MediumEditPart.VISUAL_ID:
			if (MediumMediumURLEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumBuiltInTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GCMLDocumentEditPart.VISUAL_ID:
			if (IsAttachedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CapabilityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PersonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MediumEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(GCMLDocument element) {
		return true;
	}

}
