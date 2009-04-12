package wfgcml.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import wfgcml.diagram.edit.commands.ConditionAltnextCreateCommand;
import wfgcml.diagram.edit.commands.ConditionAltnextReorientCommand;
import wfgcml.diagram.edit.commands.HasNextNextCreateCommand;
import wfgcml.diagram.edit.commands.HasNextNextReorientCommand;
import wfgcml.diagram.edit.parts.ConditionAltnextEditPart;
import wfgcml.diagram.edit.parts.HasNextNextEditPart;
import wfgcml.diagram.providers.WFGCMLElementTypes;

/**
 * @generated
 */
public class FinalItemSemanticEditPolicy extends
		WFGCMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WFGCMLElementTypes.ConditionAltnext_3001 == req.getElementType()) {
			return null;
		}
		if (WFGCMLElementTypes.HasNextNext_3002 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (WFGCMLElementTypes.ConditionAltnext_3001 == req.getElementType()) {
			return getGEFWrapper(new ConditionAltnextCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (WFGCMLElementTypes.HasNextNext_3002 == req.getElementType()) {
			return getGEFWrapper(new HasNextNextCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConditionAltnextEditPart.VISUAL_ID:
			return getGEFWrapper(new ConditionAltnextReorientCommand(req));
		case HasNextNextEditPart.VISUAL_ID:
			return getGEFWrapper(new HasNextNextReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
