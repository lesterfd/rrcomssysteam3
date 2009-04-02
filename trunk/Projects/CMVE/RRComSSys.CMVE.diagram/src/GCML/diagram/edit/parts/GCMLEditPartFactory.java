package GCML.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import GCML.diagram.part.GCMLVisualIDRegistry;

/**
 * @generated
 */
public class GCMLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (GCMLVisualIDRegistry.getVisualID(view)) {

			case GCMLDocumentEditPart.VISUAL_ID:
				return new GCMLDocumentEditPart(view);

			case IsAttachedEditPart.VISUAL_ID:
				return new IsAttachedEditPart(view);

			case CapabilityEditPart.VISUAL_ID:
				return new CapabilityEditPart(view);

			case CapabilityBuiltInTypeEditPart.VISUAL_ID:
				return new CapabilityBuiltInTypeEditPart(view);

			case DeviceEditPart.VISUAL_ID:
				return new DeviceEditPart(view);

			case ConnectionEditPart.VISUAL_ID:
				return new ConnectionEditPart(view);

			case PersonEditPart.VISUAL_ID:
				return new PersonEditPart(view);

			case PersonPersonNameEditPart.VISUAL_ID:
				return new PersonPersonNameEditPart(view);

			case PersonPersonIDEditPart.VISUAL_ID:
				return new PersonPersonIDEditPart(view);

			case PersonPersonRoleEditPart.VISUAL_ID:
				return new PersonPersonRoleEditPart(view);

			case MediumEditPart.VISUAL_ID:
				return new MediumEditPart(view);

			case MediumMediumURLEditPart.VISUAL_ID:
				return new MediumMediumURLEditPart(view);

			case MediumBuiltInTypeEditPart.VISUAL_ID:
				return new MediumBuiltInTypeEditPart(view);

			case MediumActionEditPart.VISUAL_ID:
				return new MediumActionEditPart(view);

			case ConnectionDeviceEditPart.VISUAL_ID:
				return new ConnectionDeviceEditPart(view);

			case ConnectionMediumEditPart.VISUAL_ID:
				return new ConnectionMediumEditPart(view);

			case IsAttachedPersonIDEditPart.VISUAL_ID:
				return new IsAttachedPersonIDEditPart(view);

			case IsAttachedDeviceIDEditPart.VISUAL_ID:
				return new IsAttachedDeviceIDEditPart(view);

			case DeviceCapabilityEditPart.VISUAL_ID:
				return new DeviceCapabilityEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
