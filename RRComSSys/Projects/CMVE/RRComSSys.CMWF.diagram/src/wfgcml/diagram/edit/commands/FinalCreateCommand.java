package wfgcml.diagram.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import wfgcml.WFGCMLRoot;
import wfgcml.WfgcmlPackage;

/**
 * @generated
 */
public class FinalCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public FinalCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		WFGCMLRoot container = (WFGCMLRoot) getElementToEdit();
		if (container.getFinal() != null) {
			return false;
		}
		return true;
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return WfgcmlPackage.eINSTANCE.getWFGCMLRoot();
	}

}
