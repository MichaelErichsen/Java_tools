

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class LDSOrdRecType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(LDSOrdRecType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected LDSOrdRecType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public LDSOrdRecType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public LDSOrdRecType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public LDSOrdRecType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for basedOn - gets 
   * @generated */
  public BasedOnType getBasedOn() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_basedOn == null)
      jcasType.jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.LDSOrdRecType");
    return (BasedOnType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_basedOn)));}
    
  /** getter for changed - gets 
   * @generated */
  public FSArray getChanged() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.LDSOrdRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_changed)));}
    
  //*--------------*
  //* Feature: participant

  /** indexed getter for changed - gets an indexed value - 
   * @generated */
  public ChangedType getChanged(int i) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_changed), i);
    return (ChangedType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_changed), i)));}

  /** getter for date - gets 
   * @generated */
  public DateType getDate() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.LDSOrdRecType");
    return (DateType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_date)));}
    
  /** getter for enrichment - gets 
   * @generated */
  public FSArray getEnrichment() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.LDSOrdRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_enrichment)));}
    
  /** indexed getter for enrichment - gets an indexed value - 
   * @generated */
  public EnrichmentType getEnrichment(int i) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_enrichment), i);
    return (EnrichmentType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_enrichment), i)));}

  //*--------------*
  //* Feature: ordStat

  /** getter for evidence - gets 
   * @generated */
  public FSArray getEvidence() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.LDSOrdRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_evidence)));}
    
  /** indexed getter for evidence - gets an indexed value - 
   * @generated */
  public EvidenceType getEvidence(int i) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_evidence), i);
    return (EvidenceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_evidence), i)));}

  /** getter for externalID - gets 
   * @generated */
  public FSArray getExternalID() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.LDSOrdRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_externalID)));}
    
  /** indexed getter for externalID - gets an indexed value - 
   * @generated */
  public ExternalIDType getExternalID(int i) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_externalID), i);
    return (ExternalIDType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_externalID), i)));}

  //*--------------*
  //* Feature: templeCode

  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.LDSOrdRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_id);}
    
  /** getter for lDSOrdType - gets 
   * @generated */
  public String getLDSOrdType() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_lDSOrdType == null)
      jcasType.jcas.throwFeatMissing("lDSOrdType", "net.myerichsen.gedcom.LDSOrdRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_lDSOrdType);}
    
  //*--------------*
  //* Feature: date

  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.LDSOrdRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_note)));}
    
  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_note), i)));}

  //*--------------*
  //* Feature: place

  /** getter for ordStat - gets 
   * @generated */
  public FSArray getOrdStat() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_ordStat == null)
      jcasType.jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.LDSOrdRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_ordStat)));}
    
  /** indexed getter for ordStat - gets an indexed value - 
   * @generated */
  public OrdStatType getOrdStat(int i) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_ordStat == null)
      jcasType.jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_ordStat), i);
    return (OrdStatType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_ordStat), i)));}

  //*--------------*
  //* Feature: basedOn

  /** getter for participant - gets 
   * @generated */
  public FSArray getParticipant() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.LDSOrdRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_participant)));}
    
  /** indexed getter for participant - gets an indexed value - 
   * @generated */
  public ParticipantType getParticipant(int i) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_participant), i);
    return (ParticipantType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_participant), i)));}

  //*--------------*
  //* Feature: externalID

  /** getter for place - gets 
   * @generated */
  public PlaceType getPlace() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "net.myerichsen.gedcom.LDSOrdRecType");
    return (PlaceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_place)));}
    
  /** getter for submitter - gets 
   * @generated */
  public SubmitterType getSubmitter() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.LDSOrdRecType");
    return (SubmitterType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_submitter)));}
    
  /** getter for templeCode - gets 
   * @generated */
  public String getTempleCode() {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_templeCode == null)
      jcasType.jcas.throwFeatMissing("templeCode", "net.myerichsen.gedcom.LDSOrdRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_templeCode);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for basedOn - sets  
   * @generated */
  public void setBasedOn(BasedOnType v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_basedOn == null)
      jcasType.jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_basedOn, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: note

  /** setter for changed - sets  
   * @generated */
  public void setChanged(FSArray v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_changed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for changed - sets an indexed value - 
   * @generated */
  public void setChanged(int i, ChangedType v) { 
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_changed), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_changed), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for date - sets  
   * @generated */
  public void setDate(DateType v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_date, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for enrichment - sets  
   * @generated */
  public void setEnrichment(FSArray v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_enrichment, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: evidence

  /** indexed setter for enrichment - sets an indexed value - 
   * @generated */
  public void setEnrichment(int i, EnrichmentType v) { 
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_enrichment), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_enrichment), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for evidence - sets  
   * @generated */
  public void setEvidence(FSArray v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_evidence, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for evidence - sets an indexed value - 
   * @generated */
  public void setEvidence(int i, EvidenceType v) { 
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_evidence), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_evidence), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for externalID - sets  
   * @generated */
  public void setExternalID(FSArray v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_externalID, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: enrichment

  /** indexed setter for externalID - sets an indexed value - 
   * @generated */
  public void setExternalID(int i, ExternalIDType v) { 
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_externalID), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_externalID), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_id, v);}    
   
    
  /** setter for lDSOrdType - sets  
   * @generated */
  public void setLDSOrdType(String v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_lDSOrdType == null)
      jcasType.jcas.throwFeatMissing("lDSOrdType", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_lDSOrdType, v);}    
                                                  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: changed

  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for ordStat - sets  
   * @generated */
  public void setOrdStat(FSArray v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_ordStat == null)
      jcasType.jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_ordStat, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for ordStat - sets an indexed value - 
   * @generated */
  public void setOrdStat(int i, OrdStatType v) { 
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_ordStat == null)
      jcasType.jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_ordStat), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_ordStat), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for participant - sets  
   * @generated */
  public void setParticipant(FSArray v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_participant, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: id

  /** indexed setter for participant - sets an indexed value - 
   * @generated */
  public void setParticipant(int i, ParticipantType v) { 
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_participant), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_participant), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for place - sets  
   * @generated */
  public void setPlace(PlaceType v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_place, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: lDSOrdType

  /** setter for submitter - sets  
   * @generated */
  public void setSubmitter(SubmitterType v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_submitter, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for templeCode - sets  
   * @generated */
  public void setTempleCode(String v) {
    if (LDSOrdRecType_Type.featOkTst && ((LDSOrdRecType_Type)jcasType).casFeat_templeCode == null)
      jcasType.jcas.throwFeatMissing("templeCode", "net.myerichsen.gedcom.LDSOrdRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((LDSOrdRecType_Type)jcasType).casFeatCode_templeCode, v);}    
   
    
}

    