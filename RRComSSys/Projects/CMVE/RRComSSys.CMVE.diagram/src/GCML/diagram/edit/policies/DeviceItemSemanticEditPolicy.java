package GCML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

import GCML.diagram.edit.commands.ConnectionDeviceCreateCommand;
import GCML.diagram.edit.commands.ConnectionDeviceReorientCommand;
import GCML.diagram.edit.commands.DeviceCapabilityCreateCommand;
import GCML.diagram.edit.commands.DeviceCapabilityReorientCommand;
import GCML.diagram.edit.commands.IsAttachedDeviceIDCreateCommand;
import GCML.diagram.edit.commands.IsAttachedDeviceIDReorientCommand;
import GCML.diagram.edit.parts.ConnectionDeviceEditPart;
import GCML.diagram.edit.parts.DeviceCapabilityEditPart;
import GCML.diagram.edit.parts.IsAttachedDeviceIDEditPart;
import GCML.diagram.providers.GCMLElementTypes;

/**
 * @generated
 */
public class DeviceItemSemanticEditPolicy extends
		GCMLBaseItemSemanticEditPolicy {

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
		if (GCMLElementTypes.ConnectionDevice_3001 == req.getElementType()) {
			return null;
		}
		if (GCMLElementTypes.IsAttachedDeviceID_3004 == req.getElementType()) {
			return null;
		}
		if (GCMLElementTypes.DeviceCapability_3005 == req.getElementType()) {
			return getGEFWrapper(new DeviceCapabilityCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GCMLElementTypes.ConnectionDevice_3001 == req.getElementType()) {
			return getGEFWrapper(new ConnectionDeviceCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GCMLElementTypes.IsAttachedDeviceID_3004 == req.getElementType()) {
			return getGEFWrapper(new IsAttachedDeviceIDCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GCMLElementTypes.DeviceCapability_3005 == req.getElementType()) {
			return null;
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
		case ConnectionDeviceEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectionDeviceReorientCommand(req));
		case IsAttachedDeviceIDEditPart.VISUAL_ID:
			return getGEFWrapper(new IsAttachedDeviceIDReorientCommand(req));
		case DeviceCapabilityEditPart.VISUAL_ID:
			return getGEFWrapper(new DeviceCapabilityReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
