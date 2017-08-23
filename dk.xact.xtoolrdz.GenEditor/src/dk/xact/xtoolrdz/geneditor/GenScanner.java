package dk.xact.xtoolrdz.geneditor;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WhitespaceRule;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.graphics.RGB;

/**
 * A generic scanner which can be "programmed" with a sequence of rules.
 * 
 * The scanner is used to get the next token by evaluating its rule in sequence
 * until one is successful.
 * 
 * If a rule returns a token which is undefined, the scanner will proceed to the
 * next rule. Otherwise the token provided by the rule will be returned by the
 * scanner.
 * 
 * If no rule returned a defined token, this scanner returns a token which
 * returns true when calling isOther, unless the end of the file is reached. In
 * this case the token returns true when calling isEOF.
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.5
 * 
 */

public class GenScanner extends RuleBasedScanner {
	private static IPreferenceStore store = Activator.getDefault()
			.getPreferenceStore();
	private static GenWordDetector gwd = new GenWordDetector();
	WordRule wr = null;

	public GenScanner(ColorManager manager) {
		IToken keywordToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(GenConstants.KEYWORD_COLOUR_PREFERENCE)))));
		IToken operatorToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(GenConstants.OPERATOR_COLOUR_PREFERENCE)))));
		IToken builtinToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(GenConstants.BUILTIN_COLOUR_PREFERENCE)))));
		IToken tagToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(GenConstants.TAG_COLOUR_PREFERENCE)))));
		IToken noteToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(GenConstants.NOTE_COLOUR_PREFERENCE)))));
		IToken stringToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(GenConstants.STRING_COLOUR_PREFERENCE)))));

		IRule[] rules = new IRule[7];

		wr = new WordRule(gwd);
		for (int i = 0; i < GenConstants.keywords.length; i++) {
			wr.addWord(GenConstants.keywords[i], keywordToken);
		}
		rules[0] = wr;

		wr = new WordRule(gwd);
		for (int i = 0; i < GenConstants.builtin.length; i++) {
			wr.addWord(GenConstants.builtin[i], builtinToken);
		}
		rules[1] = wr;

		wr = new WordRule(gwd);
		for (int i = 0; i < GenConstants.tags.length; i++) {
			wr.addWord(GenConstants.tags[i], tagToken);
		}
		rules[2] = wr;

		wr = new WordRule(gwd);
		for (int i = 0; i < GenConstants.operators.length; i++) {
			wr.addWord(GenConstants.operators[i], operatorToken);
		}
		rules[3] = wr;

		rules[4] = new EndOfLineRule(GenConstants.notes[0], noteToken);
		rules[5] = new SingleLineRule("\"", "\"", stringToken);

		// Add generic whitespace rule.
		rules[6] = new WhitespaceRule(new GenWhitespaceDetector());

		setRules(rules);
	}

	// private String RGB2String(RGB rgb) {
	// return new String(rgb.red + "," + rgb.blue + "," + rgb.green);
	// }

	private RGB String2RGB(String s) {
		String[] colours = s.split(",");
		return new RGB(Integer.parseInt(colours[0].trim()),
				Integer.parseInt(colours[1].trim()),
				Integer.parseInt(colours[2].trim()));
	}
}
