package dk.xact.xtoolrdz.geneditor;

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
 * @version 1.0.1
 */

public class GenConfiguration extends SourceViewerConfiguration {
	private GenDoubleClickStrategy doubleClickStrategy;
	private GenTagScanner tagScanner;
	private GenScanner scanner;
	private ColorManager colorManager;
	private static IPreferenceStore store = Activator.getDefault()
			.getPreferenceStore();

	public GenConfiguration(ColorManager colorManager) {
		this.colorManager = colorManager;
	}

	@Override
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { IDocument.DEFAULT_CONTENT_TYPE,
				GenPartitionScanner.GEN_COMMENT, GenPartitionScanner.GEN_TAG };
	}

	@Override
	public ITextDoubleClickStrategy getDoubleClickStrategy(
			ISourceViewer sourceViewer, String contentType) {
		if (doubleClickStrategy == null)
			doubleClickStrategy = new GenDoubleClickStrategy();
		return doubleClickStrategy;
	}

	protected GenScanner getGenScanner() {
		if (scanner == null) {
			scanner = new GenScanner(colorManager);
			scanner.setDefaultReturnToken(new Token(new TextAttribute(
					colorManager.getColor(IGenColorConstants.DEFAULT))));
		}
		return scanner;
	}

	protected GenTagScanner getGenTagScanner() {
		if (tagScanner == null) {
			tagScanner = new GenTagScanner(colorManager);
			tagScanner.setDefaultReturnToken(new Token(new TextAttribute(
					colorManager.getColor(String2RGB(store
							.getString(GenConstants.TAG_COLOUR_PREFERENCE))))));
		}
		return tagScanner;
	}

	@Override
	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();

		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(
				getGenTagScanner());
		reconciler.setDamager(dr, GenPartitionScanner.GEN_TAG);
		reconciler.setRepairer(dr, GenPartitionScanner.GEN_TAG);

		dr = new DefaultDamagerRepairer(getGenScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		NonRuleBasedDamagerRepairer ndr = new NonRuleBasedDamagerRepairer(
				new TextAttribute(
						colorManager.getColor(IGenColorConstants.GEN_COMMENT)));
		reconciler.setDamager(ndr, GenPartitionScanner.GEN_COMMENT);
		reconciler.setRepairer(ndr, GenPartitionScanner.GEN_COMMENT);

		return reconciler;
	}

	private RGB String2RGB(String s) {
		String[] colours = s.split(",");
		return new RGB(Integer.parseInt(colours[0].trim()),
				Integer.parseInt(colours[1].trim()),
				Integer.parseInt(colours[2].trim()));
	}
}