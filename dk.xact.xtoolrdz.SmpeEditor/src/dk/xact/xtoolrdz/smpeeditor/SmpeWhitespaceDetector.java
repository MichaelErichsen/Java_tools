package dk.xact.xtoolrdz.smpeeditor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

/**
 * Defines the interface by which WhitespaceRule determines whether a given
 * character is to be considered whitespace in the current context.
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.0
 * 
 */

public class SmpeWhitespaceDetector implements IWhitespaceDetector {

	@Override
	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '('
				|| c == ')' || c == '=');
	}
}
