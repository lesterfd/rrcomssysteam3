package GCML.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;

/**
 * @generated
 */
public class GCMLCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected GCMLCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected GCMLCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.GCMLCreationWizardTitle);
		setDefaultPageImageDescriptor(GCMLDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewGCMLWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new GCMLCreationWizardPage(
				"DiagramModelFile", getSelection(), "gcml_diagram"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.GCMLCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.GCMLCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new GCMLCreationWizardPage(
				"DomainModelFile", getSelection(), "gcml") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length()
							- ".gcml_diagram".length()); //$NON-NLS-1$
					setFileName(GCMLDiagramEditorUtil.getUniqueFileName(
							getContainerFullPath(), fileName, "gcml")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(Messages.GCMLCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.GCMLCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new IRunnableWithProgress() {

			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				diagram = GCMLDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(), domainModelFilePage
								.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						GCMLDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								Messages.GCMLCreationWizardOpenEditorError,
								null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.GCMLCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				GCMLDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
