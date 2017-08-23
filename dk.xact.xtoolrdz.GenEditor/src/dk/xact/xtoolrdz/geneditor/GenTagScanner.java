package dk.xact.xtoolrdz.geneditor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;

/**
 * A generic scanner which can be "programmed" with a sequence of rules. The
 * scanner is used to get the next token by evaluating its rule in sequence
 * until one is successful. If a rule returns a token which is undefined, the
 * scanner will proceed to the next rule. Otherwise the token provided by the
 * rule will be returned by the scanner. If no rule returned a defined token,
 * this scanner returns a token which returns true when calling isOther, unless
 * the end of the file is reached. In this case the token returns true when
 * calling isEOF.
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.5
 * 
 */

public class GenTagScanner extends RuleBasedScanner {

	public GenTagScanner(ColorManager manager) {
		IToken string = new Token(new TextAttribute(
				manager.getColor(IGenColorConstants.STRING)));

		/**
		 * Defines the interface for a rule used in the scanning of text for the
		 * purpose of document partitioning or text styling.
		 * 
		 * Evaluates the rule by examining the characters available from the
		 * provided character scanner. The token returned by this rule returns
		 * <code>true</code> when calling <code>isUndefined</code>, if the text
		 * that the rule investigated does not match the rule's requirements.
		 * 
		 * EndOfLineRule A specific configuration of a single line rule whereby
		 * the pattern begins with a specific sequence but is only ended by a
		 * line delimiter.
		 * 
		 * MultiLineRule A rule for detecting patterns which begin with a given
		 * sequence and may end with a given sequence thereby spanning multiple
		 * lines.
		 * 
		 * NumberRule An implementation of IRule detecting a numerical value.
		 * 
		 * PatternRule Standard implementation of IPredicateRule.
		 * 
		 * SingleLineRule A specific configuration of pattern rule whereby the
		 * pattern begins with a specific sequence and may end with a specific
		 * sequence, but will not span more than a single line.
		 * 
		 * WhitespaceRule An implementation of IRule capable of detecting
		 * whitespace.
		 * 
		 * WordPatternRule A specific single line rule which stipulates that the
		 * start and end sequence occur within a single word, as defined by a
		 * word detector.
		 * 
		 * WordRule An implementation of IRule capable of detecting words. A
		 * word rule also allows to associate a token to a word. That is, not
		 * only can the rule be used to provide tokens for exact matches, but
		 * also for the generalized notion of a word in the context in which it
		 * is used. A word rule uses a word detector to determine what a word
		 * is.
		 * 
		 */

		IRule[] rules = new IRule[2];

		// Add a rule for single quotes
		rules[0] = new SingleLineRule("'", "'", string, '\\');
		// Add generic whitespace rule.
		rules[1] = new WhitespaceRule(new GenWhitespaceDetector());

		setRules(rules);
	}

}
