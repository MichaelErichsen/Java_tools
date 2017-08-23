package dk.xact.xtoolrdz.geneditor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

/**
 * Shared document provider specialized for file resources (<code>IFile</code>).
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.6
 * 
 */

public class GenDocumentProvider extends FileDocumentProvider {

	@Override
	protected IDocument createDocument(Object element) throws CoreException {

		/**
		 * An IDocument represents text providing support for text manipulation
		 * positions partitions line information document change listeners
		 * document partition change listeners
		 * 
		 * A document allows to set its content and to manipulate it. For
		 * manipulation a document provides the replace method which substitutes
		 * a given string for a specified text range in the document. On each
		 * document change, all registered document listeners are informed
		 * exactly once.
		 * 
		 * Positions are stickers to the document's text that are updated when
		 * the document is changed. Positions are updated by IPositionUpdaters.
		 * Position updaters are managed as a list. The list defines the
		 * sequence in which position updaters are invoked. This way, position
		 * updaters may rely on each other. Positions are grouped into
		 * categories. A category is a ordered list of positions. the document
		 * defines the order of position in a category based on the position's
		 * offset based on the implementation of the method
		 * computeIndexInCategory. Each document must support a default position
		 * category whose name is specified by this interface.
		 * 
		 * A document can be considered consisting of a sequence of not
		 * overlapping partitions. A partition is defined by its offset, its
		 * length, and its type. Partitions are updated on every document
		 * manipulation and ensured to be up-to-date when the document listeners
		 * are informed. A document uses an IDocumentPartitioner to manage its
		 * partitions. A document may be unpartitioned which happens when there
		 * is no partitioner. In this case, the document is considered as one
		 * single partition of a default type. The default type is specified by
		 * this interface. If a document change changes the document's
		 * partitioning all registered partitioning listeners are informed
		 * exactly once. The extension interface IDocumentExtension3 introduced
		 * in version 3.0 extends the concept of partitions and allows a
		 * document to not only manage one but multiple partitioning. Each
		 * partitioning has an id which must be used to refer to a particular
		 * partitioning.
		 * 
		 * An IDocument provides methods to map line numbers and character
		 * positions onto each other based on the document's line delimiters.
		 * When moving text between documents using different line delimiters,
		 * the text must be converted to use the target document's line
		 * delimiters.
		 * 
		 * An IDocument does not care about mixed line delimiters. Clients who
		 * want to ensure a single line delimiter in their document should use
		 * the line delimiter returned by
		 * TextUtilities.getDefaultLineDelimiter(IDocument).
		 * 
		 * IDocument throws BadLocationException if the parameters of queries or
		 * manipulation requests are not inside the bounds of the document. The
		 * purpose of this style of exception handling is
		 * 
		 * prepare document for multi-thread access allow clients to implement
		 * backtracking recovery methods prevent clients from up-front contract
		 * checking when dealing with documents.
		 * 
		 * A document support for searching has deprecated since version 3.0.
		 * The recommended way for searching is to use a
		 * FindReplaceDocumentAdapter.
		 * 
		 * In order to provide backward compatibility for clients of IDocument,
		 * extension interfaces are used to provide a means of evolution. The
		 * following extension interfaces exist:
		 * 
		 * IDocumentExtension since version 2.0 introducing the concept of post
		 * notification replaces in order to allow document listeners to
		 * manipulate the document while receiving a document change
		 * notification IDocumentExtension2 since version 2.1 introducing
		 * configuration methods for post notification replaces and document
		 * change notification. IDocumentExtension3 since version 3.0 replacing
		 * the original partitioning concept by allowing multiple partitionings
		 * at the same time and introducing zero- length partitions in
		 * conjunction with the distinction between open and closed partitions.
		 * IDocumentExtension4 since version 3.1 introducing the concept of
		 * rewrite sessions. A rewrite session is a sequence of document replace
		 * operations that form a semantic unit. It also introduces a
		 * modification stamp and the ability to set the initial line delimiter
		 * and to query the default line delimiter.
		 * 
		 * Clients may implement this interface and its extension interfaces or
		 * use the default implementation provided by AbstractDocument and
		 * Document.
		 */

		IDocument document = super.createDocument(element);
		if (document != null) {

			/**
			 * Connects the partitioner to a document. Connect indicates the
			 * begin of the usage of the receiver as partitioner of the given
			 * document. Thus, resources the partitioner needs to be operational
			 * for this document should be allocated.
			 * <p>
			 * 
			 * The caller of this method must ensure that this partitioner is
			 * also set as the document's document partitioner.
			 * <p>
			 * 
			 * This method has been replaced with
			 * {@link IDocumentPartitionerExtension3#connect(IDocument, boolean)}
			 * . Implementers should default a call
			 * <code>connect(document)</code> to
			 * <code>connect(document, false)</code> in order to sustain the
			 * same semantics.
			 * 
			 * @param document
			 *            the document to be connected to
			 */

			IDocumentPartitioner partitioner = new FastPartitioner(
					new GenPartitionScanner(), new String[] {
							GenPartitionScanner.GEN_TAG,
							GenPartitionScanner.GEN_COMMENT });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}