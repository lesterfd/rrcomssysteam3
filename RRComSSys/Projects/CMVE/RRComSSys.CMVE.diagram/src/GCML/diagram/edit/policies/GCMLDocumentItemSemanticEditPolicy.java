package GCML.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import GCML.GCMLPackage;
import GCML.diagram.edit.commands.CapabilityCreateCommand;
import GCML.diagram.edit.commands.ConnectionCreateCommand;
import GCML.diagram.edit.commands.DeviceCreateCommand;
import GCML.diagram.edit.commands.IsAttachedCreateCommand;
import GCML.diagram.edit.commands.MediumCreateCommand;
import GCML.diagram.edit.commands.PersonCreateCommand;
import GCML.diagram.providers.GCMLElementTypes;

/**
 * @generated
 */
public class GCMLDocumentItemSemanticEditPolicy extends
		GCMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (GCMLElementTypes.IsAttached_1001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCMLPackage.eINSTANCE
						.getGCMLDocument_IsAttached());
			}
			return getGEFWrapper(new IsAttachedCreateCommand(req));
		}
		if (GCMLElementTypes.Capability_1002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCMLPackage.eINSTANCE
						.getGCMLDocument_Capability());
			}
			return getGEFWrapper(new CapabilityCreateCommand(req));
		}
		if (GCMLElementTypes.Device_1003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCMLPackage.eINSTANCE
						.getGCMLDocument_Device());
			}
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (GCMLElementTypes.Connection_1004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCMLPackage.eINSTANCE
						.getGCMLDocument_Connection());
			}
			return getGEFWrapper(new ConnectionCreateCommand(req));
		}
		if (GCMLElementTypes.Person_1005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCMLPackage.eINSTANCE
						.getGCMLDocument_Person());
			}
			return getGEFWrapper(new PersonCreateCommand(req));
		}
		if (GCMLElementTypes.Medium_1006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(GCMLPackage.eINSTANCE
						.getGCMLDocument_Medium());
			}
			return getGEFWrapper(new MediumCreateCommand(req));
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
