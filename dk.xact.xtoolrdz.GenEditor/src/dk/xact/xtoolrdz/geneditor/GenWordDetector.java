/**
 * 
 */
package dk.xact.xtoolrdz.geneditor;

import org.eclipse.jface.text.rules.IWordDetector;

/**
 * @author Michael Erichsen, Xact Consulting
 * @version 1.0.1
 */
public class GenWordDetector implements IWordDetector {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordPart(char)
	 */
	@Override
	public boolean isWordPart(char c) {
		return !(c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.text.rules.IWordDetector#isWordStart(char)
	 */
	@Override
	public boolean isWordStart(char c) {
		return !(c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}

}
