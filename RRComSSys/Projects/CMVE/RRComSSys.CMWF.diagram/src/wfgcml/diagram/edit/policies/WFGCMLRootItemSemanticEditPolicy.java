package wfgcml.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import wfgcml.WfgcmlPackage;
import wfgcml.diagram.edit.commands.ConditionCreateCommand;
import wfgcml.diagram.edit.commands.FinalCreateCommand;
import wfgcml.diagram.edit.commands.GCMLInstanceCreateCommand;
import wfgcml.diagram.edit.commands.StartCreateCommand;
import wfgcml.diagram.providers.WFGCMLElementTypes;

/**
 * @generated
 */
public class WFGCMLRootItemSemanticEditPolicy extends
		WFGCMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WFGCMLElementTypes.GCMLInstance_1001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WfgcmlPackage.eINSTANCE
						.getWFGCMLRoot_GCML());
			}
			return getGEFWrapper(new GCMLInstanceCreateCommand(req));
		}
		if (WFGCMLElementTypes.Start_1002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WfgcmlPackage.eINSTANCE
						.getWFGCMLRoot_Start());
			}
			return getGEFWrapper(new StartCreateCommand(req));
		}
		if (WFGCMLElementTypes.Final_1003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WfgcmlPackage.eINSTANCE
						.getWFGCMLRoot_Final());
			}
			return getGEFWrapper(new FinalCreateCommand(req));
		}
		if (WFGCMLElementTypes.Condition_1004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(WfgcmlPackage.eINSTANCE
						.getWFGCMLRoot_Condition());
			}
			return getGEFWrapper(new ConditionCreateCommand(req));
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
