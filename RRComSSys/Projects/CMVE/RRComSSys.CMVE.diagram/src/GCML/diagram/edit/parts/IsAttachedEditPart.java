package GCML.diagram.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import GCML.diagram.edit.policies.IsAttachedItemSemanticEditPolicy;

/**
 * @generated
 */
public class IsAttachedEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1001;

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
	public IsAttachedEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new IsAttachedItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
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
		IsAttachedFigure figure = new IsAttachedFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public IsAttachedFigure getPrimaryShape() {
		return (IsAttachedFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode()
				.DPtoLP(160), getMapMode().DPtoLP(90));
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
	public class IsAttachedFigure extends Shape {

		/**
		 * @generated
		 */
		public IsAttachedFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 3;
			layoutThis.makeColumnsEqualWidth = false;
			this.setLayoutManager(layoutThis);

			this.addPoint(new Point(getMapMode().DPtoLP(1), getMapMode()
					.DPtoLP(11)));
			this.addPoint(new Point(getMapMode().DPtoLP(11), getMapMode()
					.DPtoLP(1)));
			this.addPoint(new Point(getMapMode().DPtoLP(21), getMapMode()
					.DPtoLP(11)));
			this.addPoint(new Point(getMapMode().DPtoLP(11), getMapMode()
					.DPtoLP(21)));
			this.setLineWidth(2);
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(ColorConstants.white);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(160),
					getMapMode().DPtoLP(90)));
			this.setMinimumSize(new Dimension(getMapMode().DPtoLP(160),
					getMapMode().DPtoLP(90)));
			this.setSize(getMapMode().DPtoLP(160), getMapMode().DPtoLP(90));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure rectLeft0 = new RectangleFigure();
			rectLeft0.setFill(false);
			rectLeft0.setOutline(false);
			rectLeft0.setLineWidth(0);

			GridData constraintRectLeft0 = new GridData();
			constraintRectLeft0.verticalAlignment = GridData.CENTER;
			constraintRectLeft0.horizontalAlignment = GridData.CENTER;
			constraintRectLeft0.horizontalIndent = 0;
			constraintRectLeft0.horizontalSpan = 1;
			constraintRectLeft0.verticalSpan = 1;
			constraintRectLeft0.grabExcessHorizontalSpace = false;
			constraintRectLeft0.grabExcessVerticalSpace = false;
			this.add(rectLeft0, constraintRectLeft0);

			WrappingLabel lblIsAttached0 = new WrappingLabel();
			lblIsAttached0.setText("IsAttached");

			lblIsAttached0.setFont(LBLISATTACHED0_FONT);

			GridData constraintLblIsAttached0 = new GridData();
			constraintLblIsAttached0.verticalAlignment = GridData.CENTER;
			constraintLblIsAttached0.horizontalAlignment = GridData.CENTER;
			constraintLblIsAttached0.horizontalIndent = 0;
			constraintLblIsAttached0.horizontalSpan = 1;
			constraintLblIsAttached0.verticalSpan = 1;
			constraintLblIsAttached0.grabExcessHorizontalSpace = true;
			constraintLblIsAttached0.grabExcessVerticalSpace = false;
			this.add(lblIsAttached0, constraintLblIsAttached0);

			RectangleFigure rectRight0 = new RectangleFigure();
			rectRight0.setFill(false);
			rectRight0.setOutline(false);
			rectRight0.setLineWidth(0);

			GridData constraintRectRight0 = new GridData();
			constraintRectRight0.verticalAlignment = GridData.CENTER;
			constraintRectRight0.horizontalAlignment = GridData.CENTER;
			constraintRectRight0.horizontalIndent = 0;
			constraintRectRight0.horizontalSpan = 1;
			constraintRectRight0.verticalSpan = 1;
			constraintRectRight0.grabExcessHorizontalSpace = false;
			constraintRectRight0.grabExcessVerticalSpace = true;
			this.add(rectRight0, constraintRectRight0);

			FlowLayout layoutRectRight0 = new FlowLayout();
			layoutRectRight0.setStretchMinorAxis(false);
			layoutRectRight0.setMinorAlignment(FlowLayout.ALIGN_CENTER);

			layoutRectRight0.setMajorAlignment(FlowLayout.ALIGN_CENTER);
			layoutRectRight0.setMajorSpacing(3);
			layoutRectRight0.setMinorSpacing(3);
			layoutRectRight0.setHorizontal(false);

			rectRight0.setLayoutManager(layoutRectRight0);

			Ellipse elli1 = new Ellipse();
			elli1.setOutlineXOR(true);
			elli1.setLineWidth(2);
			elli1.setForegroundColor(ColorConstants.black);
			elli1.setBackgroundColor(ColorConstants.white);
			elli1.setSize(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20));

			rectRight0.add(elli1, BorderLayout.RIGHT);

		}

		/**
		 * @generated
		 */
		private final PointList myTemplate = new PointList();
		/**
		 * @generated
		 */
		private Rectangle myTemplateBounds;

		/**
		 * @generated
		 */
		public void addPoint(Point point) {
			myTemplate.addPoint(point);
			myTemplateBounds = null;
		}

		/**
		 * @generated
		 */
		protected void fillShape(Graphics graphics) {
			Rectangle bounds = getBounds();
			graphics.pushState();
			graphics.translate(bounds.x, bounds.y);
			graphics.fillPolygon(scalePointList());
			graphics.popState();
		}

		/**
		 * @generated
		 */
		protected void outlineShape(Graphics graphics) {
			Rectangle bounds = getBounds();
			graphics.pushState();
			graphics.translate(bounds.x, bounds.y);
			graphics.drawPolygon(scalePointList());
			graphics.popState();
		}

		/**
		 * @generated
		 */
		private Rectangle getTemplateBounds() {
			if (myTemplateBounds == null) {
				myTemplateBounds = myTemplate.getBounds().getCopy().union(0, 0);
				//just safety -- we are going to use this as divider 
				if (myTemplateBounds.width < 1) {
					myTemplateBounds.width = 1;
				}
				if (myTemplateBounds.height < 1) {
					myTemplateBounds.height = 1;
				}
			}
			return myTemplateBounds;
		}

		/**
		 * @generated
		 */
		private int[] scalePointList() {
			Rectangle pointsBounds = getTemplateBounds();
			Rectangle actualBounds = getBounds();

			float xScale = ((float) actualBounds.width) / pointsBounds.width;
			float yScale = ((float) actualBounds.height) / pointsBounds.height;

			if (xScale == 1 && yScale == 1) {
				return myTemplate.toIntArray();
			}
			int[] scaled = (int[]) myTemplate.toIntArray().clone();
			for (int i = 0; i < scaled.length; i += 2) {
				scaled[i] = (int) Math.floor(scaled[i] * xScale);
				scaled[i + 1] = (int) Math.floor(scaled[i + 1] * yScale);
			}
			return scaled;
		}

	}

	/**
	 * @generated
	 */
	static final Font LBLISATTACHED0_FONT = new Font(Display.getCurrent(),
			"Tahoma", 9, SWT.BOLD);

}
