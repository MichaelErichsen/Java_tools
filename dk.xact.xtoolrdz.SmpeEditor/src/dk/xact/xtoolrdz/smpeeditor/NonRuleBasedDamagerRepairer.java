package dk.xact.xtoolrdz.smpeeditor;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.presentation.IPresentationDamager;
import org.eclipse.jface.text.presentation.IPresentationRepairer;
import org.eclipse.swt.custom.StyleRange;

/**
 * A presentation damager is a strategy used by a presentation reconciler to
 * determine the region of the document's presentation which must be rebuilt
 * because of a document change. A presentation damager is assumed to be
 * specific for a particular document content type. A presentation damager is
 * expected to return a damage region which is a valid input for a presentation
 * repairer. I.e. having access to the damage region only the repairer must be
 * able to derive all the information needed to successfully repair this region.
 * <p>
 * This interface must either be implemented by clients or clients use the
 * rule-based default implementation
 * {@link org.eclipse.jface.text.rules.DefaultDamagerRepairer}. Implementers
 * should be registered with a presentation reconciler in order get involved in
 * the reconciling process.
 * </p>
 * 
 * 
 * A presentation repairer is a strategy used by a presentation reconciler to
 * rebuild a damaged region in a document's presentation. A presentation
 * repairer is assumed to be specific for a particular document content type.
 * The presentation repairer gets the region which it should repair and
 * constructs a "repair description". The presentation repairer merges the steps
 * contained within this description into the text presentation passed into
 * <code>createPresentation</code>.
 * <p>
 * This interface may be implemented by clients. Alternatively, clients may use
 * the rule-based default implementation
 * {@link org.eclipse.jface.text.rules.DefaultDamagerRepairer}. Implementers
 * should be registered with a presentation reconciler in order get involved in
 * the reconciling process.
 * </p>
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.0
 */

public class NonRuleBasedDamagerRepairer implements IPresentationDamager,
		IPresentationRepairer {

	/** The document this object works on */
	protected IDocument fDocument;
	/**
	 * The default text attribute if non is returned as data by the current
	 * token
	 */
	protected TextAttribute fDefaultTextAttribute;

	/**
	 * Constructor for NonRuleBasedDamagerRepairer.
	 */
	public NonRuleBasedDamagerRepairer(TextAttribute defaultTextAttribute) {
		Assert.isNotNull(defaultTextAttribute);

		fDefaultTextAttribute = defaultTextAttribute;
	}

	/**
	 * Adds style information to the given text presentation.
	 * 
	 * @param presentation
	 *            the text presentation to be extended
	 * @param offset
	 *            the offset of the range to be styled
	 * @param length
	 *            the length of the range to be styled
	 * @param attr
	 *            the attribute describing the style of the range to be styled
	 */
	protected void addRange(TextPresentation presentation, int offset,
			int length, TextAttribute attr) {
		if (attr != null)
			presentation.addStyleRange(new StyleRange(offset, length, attr
					.getForeground(), attr.getBackground(), attr.getStyle()));
	}

	/**
	 * @see IPresentationRepairer#createPresentation(TextPresentation,
	 *      ITypedRegion)
	 */
	@Override
	public void createPresentation(TextPresentation presentation,
			ITypedRegion region) {
		addRange(presentation, region.getOffset(), region.getLength(),
				fDefaultTextAttribute);
	}

	/**
	 * Returns the end offset of the line that contains the specified offset or
	 * if the offset is inside a line delimiter, the end offset of the next
	 * line.
	 * 
	 * @param offset
	 *            the offset whose line end offset must be computed
	 * @return the line end offset for the given offset
	 * @exception BadLocationException
	 *                if offset is invalid in the current document
	 */
	protected int endOfLineOf(int offset) throws BadLocationException {

		IRegion info = fDocument.getLineInformationOfOffset(offset);
		if (offset <= info.getOffset() + info.getLength())
			return info.getOffset() + info.getLength();

		int line = fDocument.getLineOfOffset(offset);
		try {
			info = fDocument.getLineInformation(line + 1);
			return info.getOffset() + info.getLength();
		} catch (BadLocationException x) {
			return fDocument.getLength();
		}
	}

	/**
	 * @see IPresentationDamager#getDamageRegion(ITypedRegion, DocumentEvent,
	 *      boolean)
	 */
	@Override
	public IRegion getDamageRegion(ITypedRegion partition, DocumentEvent event,
			boolean documentPartitioningChanged) {
		if (!documentPartitioningChanged) {
			try {

				IRegion info = fDocument.getLineInformationOfOffset(event
						.getOffset());
				int start = Math.max(partition.getOffset(), info.getOffset());

				int end = event.getOffset()
						+ (event.getText() == null ? event.getLength() : event
								.getText().length());

				if (info.getOffset() <= end
						&& end <= info.getOffset() + info.getLength()) {
					// optimize the case of the same line
					end = info.getOffset() + info.getLength();
				} else
					end = endOfLineOf(end);

				end = Math.min(partition.getOffset() + partition.getLength(),
						end);
				return new Region(start, end - start);

			} catch (BadLocationException x) {
			}
		}

		return partition;
	}

	/**
	 * @see IPresentationRepairer#setDocument(IDocument)
	 */
	@Override
	public void setDocument(IDocument document) {
		fDocument = document;
	}
}