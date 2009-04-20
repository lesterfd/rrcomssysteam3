package wfgcml.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import wfgcml.WFGCMLRoot;
import wfgcml.WfgcmlPackage;
import wfgcml.diagram.edit.parts.ConditionEditPart;
import wfgcml.diagram.edit.parts.FinalEditPart;
import wfgcml.diagram.edit.parts.GCMLInstanceEditPart;
import wfgcml.diagram.edit.parts.GCMLInstanceGCMLLocEditPart;
import wfgcml.diagram.edit.parts.StartEditPart;
import wfgcml.diagram.edit.parts.WFGCMLRootEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WFGCMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "RRComSSys.CMWF.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WFGCMLRootEditPart.MODEL_ID.equals(view.getType())) {
				return WFGCMLRootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return wfgcml.diagram.part.WFGCMLVisualIDRegistry.getVisualID(view
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
				WFGCMLDiagramEditorPlugin.getInstance().logError(
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
		if (WfgcmlPackage.eINSTANCE.getWFGCMLRoot().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((WFGCMLRoot) domainElement)) {
			return WFGCMLRootEditPart.VISUAL_ID;
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
		String containerModelID = wfgcml.diagram.part.WFGCMLVisualIDRegistry
				.getModelID(containerView);
		if (!WFGCMLRootEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WFGCMLRootEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = wfgcml.diagram.part.WFGCMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WFGCMLRootEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WFGCMLRootEditPart.VISUAL_ID:
			if (WfgcmlPackage.eINSTANCE.getGCMLInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return GCMLInstanceEditPart.VISUAL_ID;
			}
			if (WfgcmlPackage.eINSTANCE.getStart().isSuperTypeOf(
					domainElement.eClass())) {
				return StartEditPart.VISUAL_ID;
			}
			if (WfgcmlPackage.eINSTANCE.getFinal().isSuperTypeOf(
					domainElement.eClass())) {
				return FinalEditPart.VISUAL_ID;
			}
			if (WfgcmlPackage.eINSTANCE.getCondition().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = wfgcml.diagram.part.WFGCMLVisualIDRegistry
				.getModelID(containerView);
		if (!WFGCMLRootEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WFGCMLRootEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = wfgcml.diagram.part.WFGCMLVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WFGCMLRootEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case GCMLInstanceEditPart.VISUAL_ID:
			if (GCMLInstanceGCMLLocEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WFGCMLRootEditPart.VISUAL_ID:
			if (GCMLInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FinalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(WFGCMLRoot element) {
		return true;
	}

}
