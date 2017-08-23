package net.myerichsen.aurelia;

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
import net.myerichsen.gedcom.IndividualRecType;
import net.myerichsen.gedcom.ExtractType;
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
 * @version 1.0, 04. 12. 2011
 */
public class ProbateAnnotator extends JCasAnnotator_ImplBase {
	Logger logger = null;
	Level level = Level.INFO;

	/**
	 * no-arg c:tor is needed to be instantiated by the framework
	 */
	public ProbateAnnotator() {
	}

	/**
	 * @see AnalysisComponent#initialize(UimaContext)
	 */
	@Override
	public void initialize(UimaContext aContext)
	throws ResourceInitializationException {
		super.initialize(aContext);

		logger = aContext.getLogger();
		logger.setLevel(Level.OFF);
	}

	/**
	 * @param event
	 * @param ds
	 */
	private String[] parseDates(String ds) {
		String[] patternStrings = {
		"(\\d+)\\s(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)/(\\d+)\\s(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\\s(\\d+)",
		"(\\d+)/(\\d+)\\s(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\\s(\\d+)",
		"(\\d+)\\s(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\\s(\\d+)/(\\d+)\\s(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec)\\s(\\d+)",
		"([12]\\d{3})" };
		String out = ds.trim();
		Pattern[] patterns = new Pattern[patternStrings.length];
		Matcher[] matchers = new Matcher[patternStrings.length];
		Locale locale = new Locale("en");
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", locale);
		Date date;
		StringBuffer sb;
		String[] sa = new String[2];

		// dd MMM yyyy
		sa[0] = out;
		sa[1] = out;

		// logger.log(level, out);

		for (int i = 0; i < patternStrings.length; i++) {
			patterns[i] = Pattern.compile(patternStrings[i],
					Pattern.CASE_INSENSITIVE);
			matchers[i] = patterns[i].matcher(out);
		}

		if (matchers[0].matches()) {
			// dd MMM/dd MMM yyyy
			sa[0] = matchers[0].replaceFirst("$1 $2 $5");
			sa[1] = matchers[0].replaceFirst("$3 $4 $5");
		} else if (matchers[1].matches()) {
			// dd/dd MMM yyyy
			sa[0] = matchers[1].replaceFirst("$1 $3 $4");
			sa[1] = matchers[1].replaceFirst("$2 $3 $4");
		} else if (matchers[2].matches()) {
			// dd MMM yyyy/dd MMM yyyy
			sa[0] = matchers[2].replaceFirst("$1 $2 $3");
			sa[1] = matchers[2].replaceFirst("$4 $5 $6");
		} else if (matchers[3].matches()) {
			// yyyy
			sa[0] = matchers[3].replaceFirst("01 Jan $1");
			sa[1] = matchers[3].replaceFirst("31 Dec $1");
		}

		// logger.log(level, sa[0] + " " + sa[1]);

		// Change to standard format
		for (int i = 0; i < sa.length; i++) {
			try {
				formatter.applyPattern("dd MMM yyyy");
				date = formatter.parse(sa[i]);
				formatter.applyPattern("yyyy-MM-dd");
				sb = new StringBuffer(formatter.format(date));
				sa[i] = sb.toString();
			} catch (ParseException e) {
				logger.log(level, e.getMessage());
				sa[i] = "9999-12-31";
			}
		}

		// logger.log(level, sa[0] + " " + sa[1]);
		return sa;
	}

	/**
	 * @see JCasAnnotator_ImplBase#process(JCas)
	 */
	@Override
	public void process(JCas aJCas) {
		// get event indexes
		FSIndex<Annotation> nameIndex = aJCas
		.getAnnotationIndex(IndividualRecType.type);
		FSIndex<Annotation> placeIndex = aJCas
		.getAnnotationIndex(PlaceType.type);
		FSIndex<Annotation> dateIndex = aJCas.getAnnotationIndex(DateType.type);
		FSIndex<Annotation> sourceIndex = aJCas
		.getAnnotationIndex(SourceRecType.type);
		Iterator<Annotation> nameIter = null;
		Iterator<Annotation> placeIter = null;
		Iterator<Annotation> dateIter = null;
		IndividualRecType name = null;
		PlaceType place = null;
		DateType date = null;
		SourceRecType source = null;
		EventRecType event = null;
		int minBegin = -1;
		int maxEnd = -1;
		int latestEnd = -1;
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
		int idCounter = 1;
		String[] sa = null;

		logger.log(level, "Entering");

		// iterate over all source records
		Iterator<Annotation> sourceIter = sourceIndex.iterator();
		while (sourceIter.hasNext()) {

			// Get the source
			source = (SourceRecType) sourceIter.next();
			// logger.log(level, source.getCoveredText());

			// Create a new probate event
			event = new EventRecType(aJCas);
			event.setId("PR" + String.format("%05d", idCounter++));
			event.setEventType("will probate");
			event.setVitalType("death");
			event.setBegin(source.getBegin());
			event.setEnd(source.getEnd());
			event.setSource(source.getCoveredText());

			minBegin = source.getBegin();
			maxEnd = source.getEnd();

			// Get the name of the principal
			nameIter = nameIndex.iterator();
			pv.clear();
			nIndex = 0;
			indV = new Vector<IndividualRecType>();

			while (nameIter.hasNext()) {
				name = (IndividualRecType) nameIter.next();
				// logger.log(level, name.getCoveredText());
				if (name.getBegin() < latestEnd) {
					continue;
				}

				if (name.getBegin() >= source.getBegin()) {
					break;
				}

				name.setSource(source.getCoveredText());
				if (nIndex == 0) {
					p = new ParticipantType(aJCas, name.getBegin(), name
							.getEnd());
					p.setLiving("N");
					p.setRole("Principal");
				} else {
					p = new ParticipantType(aJCas, name.getBegin(), name
							.getEnd());
					p.setRole("Witness");
				}

				pv.add(p);
				indV.add(name);
				minBegin = Math.min(minBegin, name.getBegin());
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

			// Get the place
			placeIter = placeIndex.iterator();
			while (placeIter.hasNext()) {
				place = (PlaceType) placeIter.next();
				if (place.getBegin() > latestEnd) {
					if (place.getBegin() < source.getBegin()) {
						minBegin = Math.min(minBegin, place.getBegin());
						maxEnd = Math.max(maxEnd, place.getEnd());
						event.setPlace(place);
					}
					break;
				}
			}

			// Get the date or dates
			dateIter = dateIndex.iterator();
			while (dateIter.hasNext()) {
				date = (DateType) dateIter.next();
				
//				logger.log(level, date.getCoveredText()
//				+ " " + date.getBegin() + " " +
//				date.getEnd() + " " + source.getBegin() + " "
//				+ minBegin + " " + maxEnd);
				
				if (date.getBegin() > latestEnd) {
					if (date.getBegin() < source.getBegin()) {
						minBegin = Math.min(minBegin, date.getBegin());
						maxEnd = Math.max(maxEnd, date.getEnd());

						String ds = date.getCoveredText();
						sa = parseDates(ds);
						event.setDate(sa[0]);
						event.setToDate(sa[1]);
					}
					break;
				}
			}

			// Wrap source in a citation
			extract = new ExtractType(aJCas);
			extract.setBegin(minBegin);
			extract.setEnd(maxEnd);
			extract.setLanguage("dk");
			extracts = new FSArray(aJCas, 1);
			extracts.set(0, extract);
			citation = new CitationType(aJCas);
			citation.setWhenRecorded(date.getCoveredText());
			citation.setExtract(extracts);
			citation.setCaption("Aurelia Clemons probate extract");
			citations = new FSArray(aJCas, 1);
			citations.set(0, citation);
			evidence = new EvidenceType(aJCas);
			evidence.setCitation(citations);
			evidences = new FSArray(aJCas, 1);
			evidences.set(0, evidence);
			event.setEvidence(evidences);

			event.setBegin(minBegin);

			// Save event to indexes
			event.addToIndexes();

			latestEnd = maxEnd;
		}
	}
}