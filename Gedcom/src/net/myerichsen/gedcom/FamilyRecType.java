

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
public class FamilyRecType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(FamilyRecType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected FamilyRecType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public FamilyRecType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public FamilyRecType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public FamilyRecType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for basedOn - gets 
   * @generated */
  public BasedOnType getBasedOn() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_basedOn == null)
      jcasType.jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.FamilyRecType");
    return (BasedOnType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_basedOn)));}
    
  /** getter for changed - gets 
   * @generated */
  public FSArray getChanged() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.FamilyRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_changed)));}
    
  //*--------------*
  //* Feature: husbFath

  /** indexed getter for changed - gets an indexed value - 
   * @generated */
  public ChangedType getChanged(int i) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_changed), i);
    return (ChangedType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_changed), i)));}

  /** getter for child - gets 
   * @generated */
  public FSArray getChild() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_child == null)
      jcasType.jcas.throwFeatMissing("child", "net.myerichsen.gedcom.FamilyRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_child)));}
    
  //*--------------*
  //* Feature: wifeMoth

  /** indexed getter for child - gets an indexed value - 
   * @generated */
  public ChildType getChild(int i) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_child == null)
      jcasType.jcas.throwFeatMissing("child", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_child), i);
    return (ChildType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_child), i)));}

  /** getter for enrichment - gets 
   * @generated */
  public FSArray getEnrichment() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.FamilyRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_enrichment)));}
    
  //*--------------*
  //* Feature: child

  /** indexed getter for enrichment - gets an indexed value - 
   * @generated */
  public EnrichmentType getEnrichment(int i) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_enrichment), i);
    return (EnrichmentType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_enrichment), i)));}

  /** getter for evidence - gets 
   * @generated */
  public FSArray getEvidence() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.FamilyRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_evidence)));}
    
  /** indexed getter for evidence - gets an indexed value - 
   * @generated */
  public EvidenceType getEvidence(int i) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_evidence), i);
    return (EvidenceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_evidence), i)));}

  /** getter for externalID - gets 
   * @generated */
  public FSArray getExternalID() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.FamilyRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_externalID)));}
    
  //*--------------*
  //* Feature: basedOn

  /** indexed getter for externalID - gets an indexed value - 
   * @generated */
  public ExternalIDType getExternalID(int i) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_externalID), i);
    return (ExternalIDType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_externalID), i)));}

  /** getter for husbFath - gets 
   * @generated */
  public HusbFathType getHusbFath() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_husbFath == null)
      jcasType.jcas.throwFeatMissing("husbFath", "net.myerichsen.gedcom.FamilyRecType");
    return (HusbFathType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_husbFath)));}
    
  //*--------------*
  //* Feature: externalID

  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.FamilyRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_id);}
    
  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.FamilyRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_note)));}
    
  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_note), i)));}

  /** getter for submitter - gets 
   * @generated */
  public SubmitterType getSubmitter() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.FamilyRecType");
    return (SubmitterType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_submitter)));}
    
  //*--------------*
  //* Feature: submitter

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** getter for wifeMoth - gets 
   * @generated */
  public WifeMothType getWifeMoth() {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_wifeMoth == null)
      jcasType.jcas.throwFeatMissing("wifeMoth", "net.myerichsen.gedcom.FamilyRecType");
    return (WifeMothType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_wifeMoth)));}
    
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for basedOn - sets  
   * @generated */
  public void setBasedOn(BasedOnType v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_basedOn == null)
      jcasType.jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_basedOn, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for changed - sets  
   * @generated */
  public void setChanged(FSArray v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_changed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for changed - sets an indexed value - 
   * @generated */
  public void setChanged(int i, ChangedType v) { 
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_changed), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_changed), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: evidence

  /** setter for child - sets  
   * @generated */
  public void setChild(FSArray v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_child == null)
      jcasType.jcas.throwFeatMissing("child", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_child, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for child - sets an indexed value - 
   * @generated */
  public void setChild(int i, ChildType v) { 
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_child == null)
      jcasType.jcas.throwFeatMissing("child", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_child), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_child), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for enrichment - sets  
   * @generated */
  public void setEnrichment(FSArray v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_enrichment, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for enrichment - sets an indexed value - 
   * @generated */
  public void setEnrichment(int i, EnrichmentType v) { 
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_enrichment), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_enrichment), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: enrichment

  /** setter for evidence - sets  
   * @generated */
  public void setEvidence(FSArray v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_evidence, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for evidence - sets an indexed value - 
   * @generated */
  public void setEvidence(int i, EvidenceType v) { 
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_evidence), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_evidence), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for externalID - sets  
   * @generated */
  public void setExternalID(FSArray v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_externalID, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for externalID - sets an indexed value - 
   * @generated */
  public void setExternalID(int i, ExternalIDType v) { 
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_externalID), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_externalID), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: changed

  /** setter for husbFath - sets  
   * @generated */
  public void setHusbFath(HusbFathType v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_husbFath == null)
      jcasType.jcas.throwFeatMissing("husbFath", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_husbFath, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_id, v);}    
                                                  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: id

  /** setter for submitter - sets  
   * @generated */
  public void setSubmitter(SubmitterType v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_submitter, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for wifeMoth - sets  
   * @generated */
  public void setWifeMoth(WifeMothType v) {
    if (FamilyRecType_Type.featOkTst && ((FamilyRecType_Type)jcasType).casFeat_wifeMoth == null)
      jcasType.jcas.throwFeatMissing("wifeMoth", "net.myerichsen.gedcom.FamilyRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FamilyRecType_Type)jcasType).casFeatCode_wifeMoth, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
}

    