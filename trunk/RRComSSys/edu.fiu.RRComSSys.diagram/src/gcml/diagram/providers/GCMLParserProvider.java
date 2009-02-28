package gcml.diagram.providers;

import gcml.GcmlPackage;
import gcml.diagram.edit.parts.CapabilityBuiltInTypeEditPart;
import gcml.diagram.edit.parts.DeviceDeviceIDEditPart;
import gcml.diagram.edit.parts.PersonPersonIDEditPart;
import gcml.diagram.edit.parts.PersonPersonNameEditPart;
import gcml.diagram.edit.parts.PersonPersonRoleEditPart;
import gcml.diagram.parsers.MessageFormatParser;
import gcml.diagram.part.GCMLVisualIDRegistry;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class GCMLParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser capabilityBuiltInType_4001Parser;

	/**
	 * @generated
	 */
	private IParser getCapabilityBuiltInType_4001Parser() {
		if (capabilityBuiltInType_4001Parser == null) {
			capabilityBuiltInType_4001Parser = createCapabilityBuiltInType_4001Parser();
		}
		return capabilityBuiltInType_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCapabilityBuiltInType_4001Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getCapability_BuiltInType(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonName_4002Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonName_4002Parser() {
		if (personPersonName_4002Parser == null) {
			personPersonName_4002Parser = createPersonPersonName_4002Parser();
		}
		return personPersonName_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonName_4002Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonName(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonID_4003Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonID_4003Parser() {
		if (personPersonID_4003Parser == null) {
			personPersonID_4003Parser = createPersonPersonID_4003Parser();
		}
		return personPersonID_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonID_4003Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser personPersonRole_4004Parser;

	/**
	 * @generated
	 */
	private IParser getPersonPersonRole_4004Parser() {
		if (personPersonRole_4004Parser == null) {
			personPersonRole_4004Parser = createPersonPersonRole_4004Parser();
		}
		return personPersonRole_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPersonPersonRole_4004Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getPerson_PersonRole(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser deviceDeviceID_4005Parser;

	/**
	 * @generated
	 */
	private IParser getDeviceDeviceID_4005Parser() {
		if (deviceDeviceID_4005Parser == null) {
			deviceDeviceID_4005Parser = createDeviceDeviceID_4005Parser();
		}
		return deviceDeviceID_4005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createDeviceDeviceID_4005Parser() {
		EAttribute[] features = new EAttribute[] { GcmlPackage.eINSTANCE
				.getDevice_DeviceID(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case CapabilityBuiltInTypeEditPart.VISUAL_ID:
			return getCapabilityBuiltInType_4001Parser();
		case PersonPersonNameEditPart.VISUAL_ID:
			return getPersonPersonName_4002Parser();
		case PersonPersonIDEditPart.VISUAL_ID:
			return getPersonPersonID_4003Parser();
		case PersonPersonRoleEditPart.VISUAL_ID:
			return getPersonPersonRole_4004Parser();
		case DeviceDeviceIDEditPart.VISUAL_ID:
			return getDeviceDeviceID_4005Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(GCMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(GCMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (GCMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
