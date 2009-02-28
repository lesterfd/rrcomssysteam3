package gcml.diagram.edit.parts;

import gcml.diagram.edit.policies.IsAttachedConnectToDeviceItemSemanticEditPolicy;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class IsAttachedConnectToDeviceEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 */
	public IsAttachedConnectToDeviceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new IsAttachedConnectToDeviceItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new IsAttachedConnectToDeviceFigure();
	}

	/**
	 * @generated
	 */
	public IsAttachedConnectToDeviceFigure getPrimaryShape() {
		return (IsAttachedConnectToDeviceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class IsAttachedConnectToDeviceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public IsAttachedConnectToDeviceFigure() {
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
