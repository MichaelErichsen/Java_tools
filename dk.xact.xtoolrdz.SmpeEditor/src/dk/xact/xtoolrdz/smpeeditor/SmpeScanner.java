package dk.xact.xtoolrdz.smpeeditor;

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
 * @version 1.0.0
 * 
 */

public class SmpeScanner extends RuleBasedScanner {
	private static IPreferenceStore store = Activator.getDefault()
			.getPreferenceStore();
	private static SmpeWordDetector gwd = new SmpeWordDetector();
	WordRule wr = null;

	public SmpeScanner(ColorManager manager) {
		IToken keywordToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(SmpeConstants.KEYWORD_COLOUR_PREFERENCE)))));
		IToken operatorToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(SmpeConstants.OPERATOR_COLOUR_PREFERENCE)))));
		IToken builtinToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(SmpeConstants.BUILTIN_COLOUR_PREFERENCE)))));
		IToken tagToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(SmpeConstants.TAG_COLOUR_PREFERENCE)))));
		IToken noteToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(SmpeConstants.NOTE_COLOUR_PREFERENCE)))));
		IToken stringToken = new Token(new TextAttribute(
				manager.getColor(String2RGB(store
						.getString(SmpeConstants.STRING_COLOUR_PREFERENCE)))));

		IRule[] rules = new IRule[7];

		wr = new WordRule(gwd);
		for (int i = 0; i < SmpeConstants.mcs.length; i++) {
			wr.addWord(SmpeConstants.mcs[i], keywordToken);
		}
		rules[0] = wr;

		wr = new WordRule(gwd);
		for (int i = 0; i < SmpeConstants.subparameters.length; i++) {
			wr.addWord(SmpeConstants.subparameters[i], builtinToken);
		}
		rules[1] = wr;

		wr = new WordRule(gwd);
		for (int i = 0; i < SmpeConstants.tags.length; i++) {
			wr.addWord(SmpeConstants.tags[i], tagToken);
		}
		rules[2] = wr;

		wr = new WordRule(gwd);
		for (int i = 0; i < SmpeConstants.opcodes.length; i++) {
			wr.addWord(SmpeConstants.opcodes[i], operatorToken);
		}
		rules[3] = wr;

		rules[4] = new EndOfLineRule(SmpeConstants.languages[0], noteToken);
		rules[5] = new SingleLineRule("\"", "\"", stringToken);

		// Add generic whitespace rule.
		rules[6] = new WhitespaceRule(new SmpeWhitespaceDetector());

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
