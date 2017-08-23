package dk.xact.xtoolrdz.smpeeditor;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextDoubleClickStrategy;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.swt.graphics.RGB;

/**
 * This class is the central class for configuring the editor with pluggable
 * behaviour like syntax colouring and code assistance.
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.0
 */

public class SmpeConfiguration extends SourceViewerConfiguration {
	private SmpeDoubleClickStrategy doubleClickStrategy;
	private SmpeTagScanner tagScanner;
	private SmpeScanner scanner;
	private ColorManager colorManager;
	private static IPreferenceStore store = Activator.getDefault()
			.getPreferenceStore();

	public SmpeConfiguration(ColorManager colorManager) {
		this.colorManager = colorManager;
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
				SmpePartitionScanner.SMPE_COMMENT, SmpePartitionScanner.SMPE_TAG };
	}

	@Override
	public ITextDoubleClickStrategy getDoubleClickStrategy(
			ISourceViewer sourceViewer, String contentType) {
		if (doubleClickStrategy == null)
			doubleClickStrategy = new SmpeDoubleClickStrategy();
		return doubleClickStrategy;
	}

	protected SmpeScanner getSmpeScanner() {
		if (scanner == null) {
			scanner = new SmpeScanner(colorManager);
			scanner.setDefaultReturnToken(new Token(new TextAttribute(
					colorManager.getColor(ISmpeColorConstants.DEFAULT))));
		}
		return scanner;
	}

	protected SmpeTagScanner getSmpeTagScanner() {
		if (tagScanner == null) {
			tagScanner = new SmpeTagScanner(colorManager);
			tagScanner.setDefaultReturnToken(new Token(new TextAttribute(
					colorManager.getColor(String2RGB(store
							.getString(SmpeConstants.TAG_COLOUR_PREFERENCE))))));
		}
		return tagScanner;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(
				getSmpeTagScanner());
		reconciler.setDamager(dr, SmpePartitionScanner.SMPE_TAG);
		reconciler.setRepairer(dr, SmpePartitionScanner.SMPE_TAG);

		dr = new DefaultDamagerRepairer(getSmpeScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		NonRuleBasedDamagerRepairer ndr = new NonRuleBasedDamagerRepairer(
				new TextAttribute(
						colorManager.getColor(ISmpeColorConstants.SMPE_COMMENT)));
		reconciler.setDamager(ndr, SmpePartitionScanner.SMPE_COMMENT);
		reconciler.setRepairer(ndr, SmpePartitionScanner.SMPE_COMMENT);

		return reconciler;
	}

	private RGB String2RGB(String s) {
		String[] colours = s.split(",");
		return new RGB(Integer.parseInt(colours[0].trim()),
				Integer.parseInt(colours[1].trim()),
				Integer.parseInt(colours[2].trim()));
	}
}