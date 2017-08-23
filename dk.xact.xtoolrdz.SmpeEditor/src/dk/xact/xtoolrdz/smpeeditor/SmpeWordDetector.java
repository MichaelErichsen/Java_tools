/**
 * 
 */
package dk.xact.xtoolrdz.smpeeditor;

import org.eclipse.jface.text.rules.IWordDetector;

/**
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.0
 */
public class SmpeWordDetector implements IWordDetector {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordPart(char)
	 */
	@Override
	public boolean isWordPart(char c) {
		return !(c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '('
				|| c == ')' || c == '=');
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordStart(char)
	 */
	@Override
	public boolean isWordStart(char c) {
		return !(c == ' ' || c == '\t' || c == '\n' || c == '\r' || c == '('
				|| c == ')' || c == '=');
	}

}
