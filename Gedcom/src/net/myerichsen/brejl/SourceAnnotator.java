/**
 * 
 */
package net.myerichsen.brejl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.myerichsen.gedcom.SourceRecType;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

/**
 * @author Michael Erichsen
 * @version 1.0, 03. 12. 2011
 */
public class SourceAnnotator extends JCasAnnotator_ImplBase {
	private Pattern[] mPatterns;
	// private String[] mFormats;
	Logger logger = null;
	Level level = Level.INFO;

	/**
	 * 0-argument constructor needed to be instantiated by the framework
	 */
	public SourceAnnotator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.uima.analysis_component.AnalysisComponent_ImplBase#initialize(org.apache.uima.UimaContext)
	 */
	@Override
	public void initialize(UimaContext aContext)
	throws ResourceInitializationException {
		super.initialize(aContext);

		logger = aContext.getLogger();
		logger.setLevel(Level.OFF);
		
		// Get configuration parameter values
		String[] patternStrings = (String[]) aContext
		.getConfigParameterValue("Patterns");

		// Compile regular expressions
		mPatterns = new Pattern[patternStrings.length];
		for (int i = 0; i < patternStrings.length; i++) {
			mPatterns[i] = Pattern
			.compile(patternStrings[i], Pattern.MULTILINE);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.uima.analysis_component.JCasAnnotator_ImplBase#process(org.apache.uima.jcas.JCas)
	 */
	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {
		Pattern pattern = null;
		Matcher matcher = null;
		String s = null;
		int i;
		int sourceCounter = 1;

		logger.log(level, "Entering");

		// Get document text
		String docText = aJCas.getDocumentText();

		// Prøv først at adskille med vandrette linier
		String[] sa = docText.split("----+");

		if (sa.length == 1) 
			sa = docText.split("\r\n\r\n");

		for (i = 0; i < sa.length; i++) {
			s = sa[i];
			
			if (s.trim().length() == 0) 
				continue;

			pattern = Pattern.compile("Erik Brejl");
			matcher = pattern.matcher(s);

			if (matcher.find()) 
				continue;

			for (int j = 0; j < mPatterns.length; j++) {
				matcher = mPatterns[j].matcher(s);

				if (matcher.find()) {
					pattern = Pattern.compile(s.trim(), Pattern.MULTILINE);
					matcher = pattern.matcher(docText);
					
					if (matcher.find()) {
						SourceRecType annotation = new SourceRecType(aJCas);
						annotation.setBegin(matcher.start());
						annotation.setEnd(matcher.end());
						annotation.setId("SR" + String.format("%05d", sourceCounter++));
						annotation.setSourceType("Probate extract");
						annotation.setLanguage("da");
						annotation.setTitle("Erik Brejls hjemmeside");
						annotation.setAuthor("Erik Brejl");
						annotation.setURI(new StringArray(aJCas, 1));
						annotation.setURI(0, "http://www.brejl.dk");
						annotation.addToIndexes();

						logger.log(level, annotation.getBegin() + ", " +
								annotation.getEnd() + ", " +
								annotation.getCoveredText());
						
						break;
					} 
					break;
				}
			}
		}
	}
}