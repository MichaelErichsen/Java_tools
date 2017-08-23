package dk.xact.xtoolrdz.geneditor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

/**
 * Defines the interface by which WhitespaceRule determines whether a given
 * character is to be considered whitespace in the current context.
 * 
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.1
 * 
 */

public class GenWhitespaceDetector implements IWhitespaceDetector {

	@Override
	public boolean isWhitespace(char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
}
