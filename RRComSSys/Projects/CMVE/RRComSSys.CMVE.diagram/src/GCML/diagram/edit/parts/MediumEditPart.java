package GCML.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import GCML.diagram.edit.policies.MediumItemSemanticEditPolicy;
import GCML.diagram.part.GCMLVisualIDRegistry;

/**
 * @generated
 */
public class MediumEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1006;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public MediumEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MediumItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child,
					EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		MediumFigure figure = new MediumFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public MediumFigure getPrimaryShape() {
		return (MediumFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MediumMediumURLEditPart) {
			((MediumMediumURLEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediumMediumURLFigure());
			return true;
		}
		if (childEditPart instanceof MediumBuiltInTypeEditPart) {
			((MediumBuiltInTypeEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMediumBuiltInTypeFigure());
			return true;
		}
		if (childEditPart instanceof MediumActionEditPart) {
			((MediumActionEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureMediumActionFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(GCMLVisualIDRegistry
				.getType(MediumMediumURLEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class MediumFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumMediumURLFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumBuiltInTypeFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureMediumActionFigure;

		/**
		 * @generated
		 */
		public MediumFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(2);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrappingLabel lblMedium0 = new WrappingLabel();
			lblMedium0.setText("Medium");

			lblMedium0.setFont(LBLMEDIUM0_FONT);

			this.add(lblMedium0);

			fFigureMediumMediumURLFigure = new WrappingLabel();
			fFigureMediumMediumURLFigure.setText("<...>");

			this.add(fFigureMediumMediumURLFigure);

			fFigureMediumBuiltInTypeFigure = new WrappingLabel();
			fFigureMediumBuiltInTypeFigure.setText("<...>");

			this.add(fFigureMediumBuiltInTypeFigure);

			fFigureMediumActionFigure = new WrappingLabel();
			fFigureMediumActionFigure.setText("<...>");

			this.add(fFigureMediumActionFigure);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumMediumURLFigure() {
			return fFigureMediumMediumURLFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumBuiltInTypeFigure() {
			return fFigureMediumBuiltInTypeFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMediumActionFigure() {
			return fFigureMediumActionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font LBLMEDIUM0_FONT = new Font(Display.getCurrent(),
			"Verdana", 9, SWT.BOLD);

}
