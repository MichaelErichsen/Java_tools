

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:35 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class EventRecType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(EventRecType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected EventRecType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EventRecType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EventRecType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EventRecType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for changed - gets 
   * @generated */
  public FSArray getChanged() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.EventRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_changed)));}
    
  /** indexed getter for changed - gets an indexed value - 
   * @generated */
  public ChangedType getChanged(int i) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_changed), i);
    return (ChangedType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_changed), i)));}

  //*--------------*
  //* Feature: participant

  /** getter for date - gets 
   * @generated */
  public String getDate() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.EventRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_date);}
    
  /** getter for enrichment - gets 
   * @generated */
  public FSArray getEnrichment() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.EventRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_enrichment)));}
    
  /** indexed getter for enrichment - gets an indexed value - 
   * @generated */
  public EnrichmentType getEnrichment(int i) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_enrichment), i);
    return (EnrichmentType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_enrichment), i)));}

  /** getter for eventType - gets 
   * @generated */
  public String getEventType() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_eventType == null)
      jcasType.jcas.throwFeatMissing("eventType", "net.myerichsen.gedcom.EventRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_eventType);}
    
  //*--------------*
  //* Feature: date

  /** getter for evidence - gets 
   * @generated */
  public FSArray getEvidence() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.EventRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_evidence)));}
    
  /** indexed getter for evidence - gets an indexed value - 
   * @generated */
  public EvidenceType getEvidence(int i) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_evidence), i);
    return (EvidenceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_evidence), i)));}

  //*--------------*
  //* Feature: place

  /** getter for externalID - gets 
   * @generated */
  public FSArray getExternalID() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.EventRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_externalID)));}
    
  /** indexed getter for externalID - gets an indexed value - 
   * @generated */
  public ExternalIDType getExternalID(int i) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_externalID), i);
    return (ExternalIDType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_externalID), i)));}

  //*--------------*
  //* Feature: religion

  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.EventRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_id);}
    
  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.EventRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_note)));}
    
  //*--------------*
  //* Feature: externalID

  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_note), i)));}

  /** getter for participant - gets 
   * @generated */
  public FSArray getParticipant() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.EventRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_participant)));}
    
  /** indexed getter for participant - gets an indexed value - 
   * @generated */
  public ParticipantType getParticipant(int i) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_participant), i);
    return (ParticipantType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_participant), i)));}

  /** getter for place - gets 
   * @generated */
  public PlaceType getPlace() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "net.myerichsen.gedcom.EventRecType");
    return (PlaceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_place)));}
    
  //*--------------*
  //* Feature: submitter

  /** getter for religion - gets 
   * @generated */
  public ReligionType getReligion() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_religion == null)
      jcasType.jcas.throwFeatMissing("religion", "net.myerichsen.gedcom.EventRecType");
    return (ReligionType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_religion)));}
    
  /** getter for source - gets Added by MER
   * @generated */
  public String getSource() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "net.myerichsen.gedcom.EventRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_source);}
    
  //*--------------*
  //* Feature: note

  /** getter for submitter - gets 
   * @generated */
  public SubmitterType getSubmitter() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.EventRecType");
    return (SubmitterType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_submitter)));}
    
  /** getter for toDate - gets 
   * @generated */
  public String getToDate() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_toDate == null)
      jcasType.jcas.throwFeatMissing("toDate", "net.myerichsen.gedcom.EventRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_toDate);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** getter for vitalType - gets 
   * @generated */
  public String getVitalType() {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_vitalType == null)
      jcasType.jcas.throwFeatMissing("vitalType", "net.myerichsen.gedcom.EventRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_vitalType);}
    
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for changed - sets  
   * @generated */
  public void setChanged(FSArray v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_changed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for changed - sets an indexed value - 
   * @generated */
  public void setChanged(int i, ChangedType v) { 
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_changed), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_changed), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for date - sets  
   * @generated */
  public void setDate(String v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_date, v);}    
   
    
  //*--------------*
  //* Feature: enrichment

  /** setter for enrichment - sets  
   * @generated */
  public void setEnrichment(FSArray v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_enrichment, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for enrichment - sets an indexed value - 
   * @generated */
  public void setEnrichment(int i, EnrichmentType v) { 
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_enrichment), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_enrichment), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for eventType - sets  
   * @generated */
  public void setEventType(String v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_eventType == null)
      jcasType.jcas.throwFeatMissing("eventType", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_eventType, v);}    
   
    
  /** setter for evidence - sets  
   * @generated */
  public void setEvidence(FSArray v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_evidence, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: changed

  /** indexed setter for evidence - sets an indexed value - 
   * @generated */
  public void setEvidence(int i, EvidenceType v) { 
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_evidence), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_evidence), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for externalID - sets  
   * @generated */
  public void setExternalID(FSArray v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_externalID, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for externalID - sets an indexed value - 
   * @generated */
  public void setExternalID(int i, ExternalIDType v) { 
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_externalID), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_externalID), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: eventType

  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: id

  /** setter for participant - sets  
   * @generated */
  public void setParticipant(FSArray v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_participant, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for participant - sets an indexed value - 
   * @generated */
  public void setParticipant(int i, ParticipantType v) { 
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.EventRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_participant), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_participant), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: vitalType

  /** setter for place - sets  
   * @generated */
  public void setPlace(PlaceType v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_place, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for religion - sets  
   * @generated */
  public void setReligion(ReligionType v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_religion == null)
      jcasType.jcas.throwFeatMissing("religion", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_religion, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: source

  /** setter for source - sets Added by MER 
   * @generated */
  public void setSource(String v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_source, v);}    
   
    
  /** setter for submitter - sets  
   * @generated */
  public void setSubmitter(SubmitterType v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EventRecType_Type)jcasType).casFeatCode_submitter, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: toDate

  /** setter for toDate - sets  
   * @generated */
  public void setToDate(String v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_toDate == null)
      jcasType.jcas.throwFeatMissing("toDate", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_toDate, v);}    
                                                  /** setter for vitalType - sets  
   * @generated */
  public void setVitalType(String v) {
    if (EventRecType_Type.featOkTst && ((EventRecType_Type)jcasType).casFeat_vitalType == null)
      jcasType.jcas.throwFeatMissing("vitalType", "net.myerichsen.gedcom.EventRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((EventRecType_Type)jcasType).casFeatCode_vitalType, v);}    
   
    
}

    