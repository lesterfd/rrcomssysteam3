package gcml.diagram.edit.policies;

import gcml.GcmlPackage;
import gcml.diagram.edit.commands.CapabilityCreateCommand;
import gcml.diagram.edit.commands.ConnectionCreateCommand;
import gcml.diagram.edit.commands.DeviceCreateCommand;
import gcml.diagram.edit.commands.IsAttachedCreateCommand;
import gcml.diagram.edit.commands.PersonCreateCommand;
import gcml.diagram.providers.GCMLElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class UserSchemaItemSemanticEditPolicy extends
		GCMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GCMLElementTypes.IsAttached_1001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getUserSchema_ContainsShapes());
			}
			return getGEFWrapper(new IsAttachedCreateCommand(req));
		}
		if (GCMLElementTypes.Connection_1002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getUserSchema_ContainsShapes());
			}
			return getGEFWrapper(new ConnectionCreateCommand(req));
		}
		if (GCMLElementTypes.Capability_1003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getUserSchema_ContainsShapes());
			}
			return getGEFWrapper(new CapabilityCreateCommand(req));
		}
		if (GCMLElementTypes.Person_1004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getUserSchema_ContainsShapes());
			}
			return getGEFWrapper(new PersonCreateCommand(req));
		}
		if (GCMLElementTypes.Device_1005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GcmlPackage.eINSTANCE
						.getUserSchema_ContainsShapes());
			}
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
