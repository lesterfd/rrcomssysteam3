package GCML.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import GCML.IsAttached;
import GCML.Person;
import GCML.diagram.edit.policies.GCMLBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class IsAttachedPersonIDReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public IsAttachedPersonIDReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof IsAttached) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Person && newEnd instanceof IsAttached)) {
			return false;
		}
		return GCMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistIsAttachedPersonID_4003(getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Person && newEnd instanceof Person)) {
			return false;
		}
		return GCMLBaseItemSemanticEditPolicy.LinkConstraints
				.canExistIsAttachedPersonID_4003(getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setPersonID(null);
		getNewSource().setPersonID(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setPersonID(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected IsAttached getOldSource() {
		return (IsAttached) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected IsAttached getNewSource() {
		return (IsAttached) newEnd;
	}

	/**
	 * @generated
	 */
	protected Person getOldTarget() {
		return (Person) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Person getNewTarget() {
		return (Person) newEnd;
	}
}
