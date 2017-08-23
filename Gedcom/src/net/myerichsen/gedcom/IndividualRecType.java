

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:36 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class IndividualRecType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(IndividualRecType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected IndividualRecType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public IndividualRecType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public IndividualRecType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public IndividualRecType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for assocIndiv - gets 
   * @generated */
  public FSArray getAssocIndiv() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_assocIndiv == null)
      jcasType.jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_assocIndiv)));}
    
  /** indexed getter for assocIndiv - gets an indexed value - 
   * @generated */
  public AssocIndivType getAssocIndiv(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_assocIndiv == null)
      jcasType.jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_assocIndiv), i);
    return (AssocIndivType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_assocIndiv), i)));}

  //*--------------*
  //* Feature: indivName

  /** getter for changed - gets 
   * @generated */
  public FSArray getChanged() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_changed)));}
    
  /** indexed getter for changed - gets an indexed value - 
   * @generated */
  public ChangedType getChanged(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_changed), i);
    return (ChangedType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_changed), i)));}

  /** getter for deathStatus - gets 
   * @generated */
  public String getDeathStatus() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_deathStatus == null)
      jcasType.jcas.throwFeatMissing("deathStatus", "net.myerichsen.gedcom.IndividualRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_deathStatus);}
    
  /** getter for dupIndiv - gets 
   * @generated */
  public FSArray getDupIndiv() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_dupIndiv == null)
      jcasType.jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_dupIndiv)));}
    
  //*--------------*
  //* Feature: gender

  /** indexed getter for dupIndiv - gets an indexed value - 
   * @generated */
  public DupIndivType getDupIndiv(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_dupIndiv == null)
      jcasType.jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_dupIndiv), i);
    return (DupIndivType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_dupIndiv), i)));}

  /** getter for enrichment - gets 
   * @generated */
  public FSArray getEnrichment() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_enrichment)));}
    
  //*--------------*
  //* Feature: deathStatus

  /** indexed getter for enrichment - gets an indexed value - 
   * @generated */
  public EnrichmentType getEnrichment(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_enrichment), i);
    return (EnrichmentType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_enrichment), i)));}

  /** getter for evidence - gets 
   * @generated */
  public FSArray getEvidence() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_evidence)));}
    
  //*--------------*
  //* Feature: persInfo

  /** indexed getter for evidence - gets an indexed value - 
   * @generated */
  public EvidenceType getEvidence(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_evidence), i);
    return (EvidenceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_evidence), i)));}

  /** getter for externalID - gets 
   * @generated */
  public FSArray getExternalID() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_externalID)));}
    
  /** indexed getter for externalID - gets an indexed value - 
   * @generated */
  public ExternalIDType getExternalID(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_externalID), i);
    return (ExternalIDType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_externalID), i)));}

  /** getter for gender - gets 
   * @generated */
  public String getGender() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_gender == null)
      jcasType.jcas.throwFeatMissing("gender", "net.myerichsen.gedcom.IndividualRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_gender);}
    
  //*--------------*
  //* Feature: assocIndiv

  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.IndividualRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_id);}
    
  /** getter for indivName - gets 
   * @generated */
  public FSArray getIndivName() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_indivName == null)
      jcasType.jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_indivName)));}
    
  /** indexed getter for indivName - gets an indexed value - 
   * @generated */
  public IndivNameType getIndivName(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_indivName == null)
      jcasType.jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_indivName), i);
    return (IndivNameType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_indivName), i)));}

  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_note)));}
    
  //*--------------*
  //* Feature: dupIndiv

  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_note), i)));}

  /** getter for persInfo - gets 
   * @generated */
  public FSArray getPersInfo() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_persInfo == null)
      jcasType.jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.IndividualRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_persInfo)));}
    
  /** indexed getter for persInfo - gets an indexed value - 
   * @generated */
  public PersInfoType getPersInfo(int i) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_persInfo == null)
      jcasType.jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_persInfo), i);
    return (PersInfoType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_persInfo), i)));}

  /** getter for source - gets Added by MER
   * @generated */
  public String getSource() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "net.myerichsen.gedcom.IndividualRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_source);}
    
  //*--------------*
  //* Feature: externalID

  /** getter for submitter - gets 
   * @generated */
  public SubmitterType getSubmitter() {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.IndividualRecType");
    return (SubmitterType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_submitter)));}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}

  /** setter for assocIndiv - sets  
   * @generated */
  public void setAssocIndiv(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_assocIndiv == null)
      jcasType.jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_assocIndiv, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: submitter

  /** indexed setter for assocIndiv - sets an indexed value - 
   * @generated */
  public void setAssocIndiv(int i, AssocIndivType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_assocIndiv == null)
      jcasType.jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_assocIndiv), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_assocIndiv), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for changed - sets  
   * @generated */
  public void setChanged(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_changed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: note

  /** indexed setter for changed - sets an indexed value - 
   * @generated */
  public void setChanged(int i, ChangedType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_changed), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_changed), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for deathStatus - sets  
   * @generated */
  public void setDeathStatus(String v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_deathStatus == null)
      jcasType.jcas.throwFeatMissing("deathStatus", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_deathStatus, v);}    
   
    
  /** setter for dupIndiv - sets  
   * @generated */
  public void setDupIndiv(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_dupIndiv == null)
      jcasType.jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_dupIndiv, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for dupIndiv - sets an indexed value - 
   * @generated */
  public void setDupIndiv(int i, DupIndivType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_dupIndiv == null)
      jcasType.jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_dupIndiv), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_dupIndiv), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: evidence

  /** setter for enrichment - sets  
   * @generated */
  public void setEnrichment(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_enrichment, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for enrichment - sets an indexed value - 
   * @generated */
  public void setEnrichment(int i, EnrichmentType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_enrichment), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_enrichment), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for evidence - sets  
   * @generated */
  public void setEvidence(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_evidence, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for evidence - sets an indexed value - 
   * @generated */
  public void setEvidence(int i, EvidenceType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_evidence), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_evidence), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: enrichment

  /** setter for externalID - sets  
   * @generated */
  public void setExternalID(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_externalID, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for externalID - sets an indexed value - 
   * @generated */
  public void setExternalID(int i, ExternalIDType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_externalID), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_externalID), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for gender - sets  
   * @generated */
  public void setGender(String v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_gender == null)
      jcasType.jcas.throwFeatMissing("gender", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_gender, v);}    
   
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: changed

  /** setter for indivName - sets  
   * @generated */
  public void setIndivName(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_indivName == null)
      jcasType.jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_indivName, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for indivName - sets an indexed value - 
   * @generated */
  public void setIndivName(int i, IndivNameType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_indivName == null)
      jcasType.jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_indivName), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_indivName), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: id

  /** setter for persInfo - sets  
   * @generated */
  public void setPersInfo(FSArray v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_persInfo == null)
      jcasType.jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_persInfo, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for persInfo - sets an indexed value - 
   * @generated */
  public void setPersInfo(int i, PersInfoType v) { 
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_persInfo == null)
      jcasType.jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_persInfo), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_persInfo), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: source

  /** setter for source - sets Added by MER 
   * @generated */
  public void setSource(String v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_source, v);}    
                                                  /** setter for submitter - sets  
   * @generated */
  public void setSubmitter(SubmitterType v) {
    if (IndividualRecType_Type.featOkTst && ((IndividualRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.IndividualRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndividualRecType_Type)jcasType).casFeatCode_submitter, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
}

    