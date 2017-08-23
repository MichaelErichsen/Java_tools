package net.myerichsen.vendsyssel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.myerichsen.gedcom.CitationType;
import net.myerichsen.gedcom.DateType;
import net.myerichsen.gedcom.EventRecType;
import net.myerichsen.gedcom.EvidenceType;
import net.myerichsen.gedcom.ExtractType;
import net.myerichsen.gedcom.IndividualRecType;
import net.myerichsen.gedcom.ParticipantType;
import net.myerichsen.gedcom.PlaceType;
import net.myerichsen.gedcom.SourceRecType;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.AnalysisComponent;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.cas.FSIndex;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.util.Level;
import org.apache.uima.util.Logger;

/**
 * @author Michael Erichsen
 * @version 1.2, 05. 05. 2013
 */
public class ProbateAnnotator extends JCasAnnotator_ImplBase {
	private Logger logger = null;
	private Level level = Level.SEVERE;

	private String[] patternStrings;
	private String[] dates;
	private String[] dateFormats;

	/**
	 * no-arg c:tor is needed to be instantiated by the framework
	 */
	public ProbateAnnotator() {
	}

	/**
	 * @param event
	 * @param ds
	 * 
	 */
	private String cleanupDate(String ds) {
		String out = ds.trim();
		String s = "0000-01-01";
		Locale locale = new Locale("en");
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", locale);
		Date date;
		StringBuffer sb;
		Pattern pattern;
		Matcher matcher;

		logger.log(Level.INFO, "Date: " + out);

		for (int i = 0; i < dates.length; i++) {
			pattern = Pattern.compile(dates[i]);
			matcher = pattern.matcher(out);

			if (matcher.matches()) {
				s = matcher.group();

				s = s.replaceAll("xx\\.xx\\.", "");

				try {
					logger.log(Level.INFO, "Patterns: " + dates[i] + " "
							+ dateFormats[i]);

					formatter.applyPattern(dateFormats[i]);
					date = formatter.parse(s.trim());
					formatter.applyPattern("yyyy-MM-dd");
					sb = new StringBuffer(formatter.format(date));
					s = sb.toString();
				} catch (ParseException e) {
					logger.log(Level.SEVERE, e.getMessage());
					s = "0000-01-01";
				}
				break;
			}
		}

		return s;
	}

	/**
	 * Create a single probate event
	 * 
	 * @param aJCas
	 * @param start
	 * @param end
	 * @param sourceFile
	 * @return
	 */
	private EventRecType createEvent(JCas aJCas, int idCounter, int start,
			int end) {
		FSIndex<Annotation> sourceIndex = aJCas
				.getAnnotationIndex(SourceRecType.type);
		Iterator<Annotation> sourceIter = null;
		SourceRecType source = null;
		SourceRecType nextSource = null;

		FSIndex<Annotation> nameIndex = aJCas
				.getAnnotationIndex(IndividualRecType.type);
		Iterator<Annotation> nameIter = null;
		IndividualRecType name = null;

		FSIndex<Annotation> placeIndex = aJCas
				.getAnnotationIndex(PlaceType.type);
		Iterator<Annotation> placeIter = null;
		PlaceType place = null;

		FSIndex<Annotation> dateIndex = aJCas.getAnnotationIndex(DateType.type);
		Iterator<Annotation> dateIter = null;
		DateType date = null;

		EventRecType event = null;

		ParticipantType p = null;
		Vector<ParticipantType> pv = new Vector<ParticipantType>();
		Vector<IndividualRecType> indV = new Vector<IndividualRecType>();
		FSArray participants = null;
		FSArray individuals = null;

		CitationType citation = null;
		FSArray citations = null;
		ExtractType extract = null;
		FSArray extracts = null;
		EvidenceType evidence = null;
		FSArray evidences = null;

		int nIndex = 0;
		int minBegin = start;
		int maxEnd = end;
		int placeBeginLimit = start;

		// Create a new probate event
		event = new EventRecType(aJCas);
		event.setId("PR" + String.format("%05d", idCounter++));
		event.setEventType("will probate");
		event.setVitalType("death");
		event.setBegin(minBegin);
		event.setEnd(maxEnd);

		// Get the source
		sourceIter = sourceIndex.iterator();

		while (sourceIter.hasNext()) {
			if (source == null) {
				source = (SourceRecType) sourceIter.next();
				break;
			}

			source = nextSource;
			nextSource = (SourceRecType) sourceIter.next();

			if (nextSource.getBegin() < minBegin)
				continue;

			if (nextSource.getBegin() >= maxEnd)
				break;
		}

		if (source == null) {
			logger.log(Level.SEVERE, "Source ikke fundet af annotator");
			return null;
		}

		event.setSource(source.getCoveredText().trim());

		// Get the name of the principal
		nameIter = nameIndex.iterator();
		pv.clear();
		nIndex = 0;
		indV = new Vector<IndividualRecType>();

		while (nameIter.hasNext()) {
			name = (IndividualRecType) nameIter.next();
			if (name.getBegin() < minBegin)
				continue;

			if (name.getBegin() >= maxEnd)
				break;

			logger.log(Level.INFO, "Name: " + name.getCoveredText());

			if (nIndex == 0) {
				p = new ParticipantType(aJCas, name.getBegin(), name.getEnd());
				p.setLiving("N");
				p.setRole("Principal");
				placeBeginLimit = name.getBegin();
			} else {
				p = new ParticipantType(aJCas, name.getBegin(), name.getEnd());
				p.setRole("Witness");
			}

			pv.add(p);
			indV.add(name);
			maxEnd = Math.max(maxEnd, name.getEnd());
			nIndex++;
		}

		participants = new FSArray(aJCas, pv.size());
		int index = 0;
		for (Iterator<ParticipantType> iterator = pv.iterator(); iterator
				.hasNext();) {
			participants.set(index++, iterator.next());
		}

		individuals = new FSArray(aJCas, index);
		index = 0;
		for (Iterator<IndividualRecType> iteratorI = indV.iterator(); iteratorI
				.hasNext();) {
			individuals.set(index++, iteratorI.next());
		}

		event.setParticipant(participants);

		// Get the date or dates
		dateIter = dateIndex.iterator();
		while (dateIter.hasNext()) {
			date = (DateType) dateIter.next();

			if (date.getBegin() > minBegin) {
				if (date.getBegin() < maxEnd) {
					maxEnd = Math.max(maxEnd, date.getEnd());

					String sDate = cleanupDate(date.getCoveredText());

					if (sDate.equals("0000-01-01")) {
						event.setDate(sDate);
						event.setToDate("9999-12-31");
					} else {
						event.setDate(sDate);
						event.setToDate(sDate);
					}

					if (placeBeginLimit < date.getBegin()) {
						placeBeginLimit = date.getBegin();
					}

					break;
				}
			}
		}

		// Get the place
		placeIter = placeIndex.iterator();
		while (placeIter.hasNext()) {
			place = (PlaceType) placeIter.next();
			if (place.getBegin() > placeBeginLimit) {
				if (place.getBegin() < maxEnd) {
					maxEnd = Math.max(maxEnd, place.getEnd());
					event.setPlace(place);
				}
				break;
			}
		}

		extract = new ExtractType(aJCas);
		extract.setBegin(minBegin);
		extract.setEnd(maxEnd);
		extract.setLanguage("dk");
		extracts = new FSArray(aJCas, 1);
		extracts.set(0, extract);
		citation = new CitationType(aJCas);
		if (date.getCoveredText() != null)
			citation.setWhenRecorded(date.getCoveredText());
		citation.setExtract(extracts);
		citation.setCaption("Godsskifter Vendsyssel");
		citations = new FSArray(aJCas, 1);
		citations.set(0, citation);
		evidence = new EvidenceType(aJCas);
		evidence.setCitation(citations);
		evidences = new FSArray(aJCas, 1);
		evidences.set(0, evidence);
		event.setEvidence(evidences);

		event.setBegin(minBegin);
		event.setEnd(maxEnd);

		logger.log(Level.INFO,
				"Event: " + event.getBegin() + ", " + event.getEnd());
		if (event.getEnd() - event.getBegin() > 0)
			logger.log(Level.INFO, "Event: " + event.getCoveredText());

		return event;
	}

	/**
	 * @see AnalysisComponent#initialize(UimaContext)
	 */
	@Override
	public void initialize(UimaContext aContext)
			throws ResourceInitializationException {
		super.initialize(aContext);

		logger = aContext.getLogger();
		logger.setLevel(level);

		// Get configuration parameter values
		patternStrings = (String[]) aContext
				.getConfigParameterValue("Patterns");
		dates = (String[]) aContext.getConfigParameterValue("Dates");
		dateFormats = (String[]) aContext
				.getConfigParameterValue("DateFormats");
	}

	/**
	 * @see JCasAnnotator_ImplBase#process(JCas)
	 */
	@Override
	public void process(JCas aJCas) {
		String[] sa = null;
		String s = null;
		Pattern pattern = null;
		Matcher matcher = null;
		EventRecType event = null;
		int idCounter = 1;
		int previousEnd = 0;
		int offset = 0;

		String doctext = aJCas.getDocumentText();
		// logger.log(Level.INFO, doctext);

		for (String string : patternStrings) {
			sa = doctext.split(string);

			if (sa.length == 1) {
				continue;
			}

			logger.log(Level.INFO, "Probates in file: " + sa.length);
			previousEnd = 0;

			// Spring over den første
			for (int i = 0; i < sa.length - 1; i++) {
				s = sa[i];

				logger.log(Level.INFO, "Probate: " + s);

				pattern = Pattern.compile(s, Pattern.LITERAL | Pattern.DOTALL);
				matcher = pattern.matcher(doctext);

				if (matcher.find()) {
					if (i > 0) {
						if (previousEnd < matcher.start())
							offset = previousEnd;
						else
							offset = matcher.start();
						event = createEvent(aJCas, idCounter++, offset,
								matcher.end());
						event.addToIndexes();
					}
					previousEnd = matcher.end();
				}
			}
			break;
		}
	}
}