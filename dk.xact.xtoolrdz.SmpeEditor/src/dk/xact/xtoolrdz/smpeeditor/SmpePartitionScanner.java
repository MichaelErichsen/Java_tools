package dk.xact.xtoolrdz.smpeeditor;

import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * Scanner that exclusively uses predicate rules.
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.0
 * 
 */

public class SmpePartitionScanner extends RuleBasedPartitionScanner {
	public final static String SMPE_COMMENT = "__SMPE_comment";
	public final static String SMPE_TAG = "__SMPE_tag";

	public SmpePartitionScanner() {

		/**
		 * A token to be returned by a rule.
		 */
		IToken genComment = new Token(SMPE_COMMENT);

		/**
		 * Defines the interface for a rule used in the scanning of text for the
		 * purpose of document partitioning or text styling.
		 * 
		 * A predicate rule can only return one single token after having
		 * successfully detected content. This token is called success token.
		 * Also, it also returns a token indicating that this rule has not been
		 * successful.
		 * 
		 */

		IPredicateRule[] rules = new IPredicateRule[1];

		rules[0] = new MultiLineRule("/*", "*/", genComment);

		setPredicateRules(rules);
	}

}
