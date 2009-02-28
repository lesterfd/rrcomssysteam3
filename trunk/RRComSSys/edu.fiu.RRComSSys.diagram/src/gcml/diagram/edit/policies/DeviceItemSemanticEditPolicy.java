package gcml.diagram.edit.policies;

import gcml.diagram.edit.commands.ConnectionDevicesCreateCommand;
import gcml.diagram.edit.commands.ConnectionDevicesReorientCommand;
import gcml.diagram.edit.commands.DeviceCapabilitiesCreateCommand;
import gcml.diagram.edit.commands.DeviceCapabilitiesReorientCommand;
import gcml.diagram.edit.commands.IsAttachedConnectToDeviceCreateCommand;
import gcml.diagram.edit.commands.IsAttachedConnectToDeviceReorientCommand;
import gcml.diagram.edit.parts.ConnectionDevicesEditPart;
import gcml.diagram.edit.parts.DeviceCapabilitiesEditPart;
import gcml.diagram.edit.parts.IsAttachedConnectToDeviceEditPart;
import gcml.diagram.providers.GCMLElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;

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
		if (GCMLElementTypes.IsAttachedConnectToDevice_3001 == req
				.getElementType()) {
			return null;
		}
		if (GCMLElementTypes.DeviceCapabilities_3003 == req.getElementType()) {
			return getGEFWrapper(new DeviceCapabilitiesCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (GCMLElementTypes.ConnectionDevices_3004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (GCMLElementTypes.IsAttachedConnectToDevice_3001 == req
				.getElementType()) {
			return getGEFWrapper(new IsAttachedConnectToDeviceCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (GCMLElementTypes.DeviceCapabilities_3003 == req.getElementType()) {
			return null;
		}
		if (GCMLElementTypes.ConnectionDevices_3004 == req.getElementType()) {
			return getGEFWrapper(new ConnectionDevicesCreateCommand(req, req
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
		case IsAttachedConnectToDeviceEditPart.VISUAL_ID:
			return getGEFWrapper(new IsAttachedConnectToDeviceReorientCommand(
					req));
		case DeviceCapabilitiesEditPart.VISUAL_ID:
			return getGEFWrapper(new DeviceCapabilitiesReorientCommand(req));
		case ConnectionDevicesEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectionDevicesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
