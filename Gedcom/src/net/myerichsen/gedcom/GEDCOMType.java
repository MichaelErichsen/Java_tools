

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
public class GEDCOMType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(GEDCOMType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected GEDCOMType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GEDCOMType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GEDCOMType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GEDCOMType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for contactRec - gets 
   * @generated */
  public FSArray getContactRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_contactRec == null)
      jcasType.jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.GEDCOMType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_contactRec)));}
    
  /** indexed getter for contactRec - gets an indexed value - 
   * @generated */
  public ContactRecType getContactRec(int i) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_contactRec == null)
      jcasType.jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_contactRec), i);
    return (ContactRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_contactRec), i)));}

  //*--------------*
  //* Feature: headerRec

  /** getter for eventRec - gets 
   * @generated */
  public FSArray getEventRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_eventRec == null)
      jcasType.jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.GEDCOMType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_eventRec)));}
    
  /** indexed getter for eventRec - gets an indexed value - 
   * @generated */
  public EventRecType getEventRec(int i) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_eventRec == null)
      jcasType.jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_eventRec), i);
    return (EventRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_eventRec), i)));}

  //*--------------*
  //* Feature: familyRec

  /** getter for familyRec - gets 
   * @generated */
  public FSArray getFamilyRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_familyRec == null)
      jcasType.jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.GEDCOMType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_familyRec)));}
    
  /** indexed getter for familyRec - gets an indexed value - 
   * @generated */
  public FamilyRecType getFamilyRec(int i) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_familyRec == null)
      jcasType.jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_familyRec), i);
    return (FamilyRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_familyRec), i)));}

  /** getter for groupRec - gets 
   * @generated */
  public FSArray getGroupRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_groupRec == null)
      jcasType.jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.GEDCOMType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_groupRec)));}
    
  /** indexed getter for groupRec - gets an indexed value - 
   * @generated */
  public GroupRecType getGroupRec(int i) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_groupRec == null)
      jcasType.jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_groupRec), i);
    return (GroupRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_groupRec), i)));}

  //*--------------*
  //* Feature: individualRec

  /** getter for headerRec - gets 
   * @generated */
  public HeaderRecType getHeaderRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_headerRec == null)
      jcasType.jcas.throwFeatMissing("headerRec", "net.myerichsen.gedcom.GEDCOMType");
    return (HeaderRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_headerRec)));}
    
  /** getter for individualRec - gets 
   * @generated */
  public FSArray getIndividualRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_individualRec == null)
      jcasType.jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.GEDCOMType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_individualRec)));}
    
  /** indexed getter for individualRec - gets an indexed value - 
   * @generated */
  public IndividualRecType getIndividualRec(int i) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_individualRec == null)
      jcasType.jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_individualRec), i);
    return (IndividualRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_individualRec), i)));}

  /** getter for lDSOrdRec - gets 
   * @generated */
  public FSArray getLDSOrdRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_lDSOrdRec == null)
      jcasType.jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.GEDCOMType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_lDSOrdRec)));}
    
  //*--------------*
  //* Feature: eventRec

  /** indexed getter for lDSOrdRec - gets an indexed value - 
   * @generated */
  public LDSOrdRecType getLDSOrdRec(int i) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_lDSOrdRec == null)
      jcasType.jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_lDSOrdRec), i);
    return (LDSOrdRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_lDSOrdRec), i)));}

  /** getter for repositoryRec - gets 
   * @generated */
  public FSArray getRepositoryRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_repositoryRec == null)
      jcasType.jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.GEDCOMType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_repositoryRec)));}
    
  /** indexed getter for repositoryRec - gets an indexed value - 
   * @generated */
  public RepositoryRecType getRepositoryRec(int i) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_repositoryRec == null)
      jcasType.jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_repositoryRec), i);
    return (RepositoryRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_repositoryRec), i)));}

  /** getter for sourceRec - gets 
   * @generated */
  public FSArray getSourceRec() {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_sourceRec == null)
      jcasType.jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.GEDCOMType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_sourceRec)));}
    
  //*--------------*
  //* Feature: lDSOrdRec

  /** indexed getter for sourceRec - gets an indexed value - 
   * @generated */
  public SourceRecType getSourceRec(int i) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_sourceRec == null)
      jcasType.jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_sourceRec), i);
    return (SourceRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_sourceRec), i)));}

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}

  /** setter for contactRec - sets  
   * @generated */
  public void setContactRec(FSArray v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_contactRec == null)
      jcasType.jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_contactRec, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: contactRec

  /** indexed setter for contactRec - sets an indexed value - 
   * @generated */
  public void setContactRec(int i, ContactRecType v) { 
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_contactRec == null)
      jcasType.jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_contactRec), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_contactRec), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for eventRec - sets  
   * @generated */
  public void setEventRec(FSArray v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_eventRec == null)
      jcasType.jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_eventRec, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for eventRec - sets an indexed value - 
   * @generated */
  public void setEventRec(int i, EventRecType v) { 
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_eventRec == null)
      jcasType.jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_eventRec), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_eventRec), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for familyRec - sets  
   * @generated */
  public void setFamilyRec(FSArray v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_familyRec == null)
      jcasType.jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_familyRec, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: sourceRec

  /** indexed setter for familyRec - sets an indexed value - 
   * @generated */
  public void setFamilyRec(int i, FamilyRecType v) { 
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_familyRec == null)
      jcasType.jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_familyRec), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_familyRec), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for groupRec - sets  
   * @generated */
  public void setGroupRec(FSArray v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_groupRec == null)
      jcasType.jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_groupRec, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for groupRec - sets an indexed value - 
   * @generated */
  public void setGroupRec(int i, GroupRecType v) { 
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_groupRec == null)
      jcasType.jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_groupRec), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_groupRec), i, jcasType.ll_cas.ll_getFSRef(v));}
                                                  /** setter for headerRec - sets  
   * @generated */
  public void setHeaderRec(HeaderRecType v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_headerRec == null)
      jcasType.jcas.throwFeatMissing("headerRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_headerRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: repositoryRec

  /** setter for individualRec - sets  
   * @generated */
  public void setIndividualRec(FSArray v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_individualRec == null)
      jcasType.jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_individualRec, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for individualRec - sets an indexed value - 
   * @generated */
  public void setIndividualRec(int i, IndividualRecType v) { 
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_individualRec == null)
      jcasType.jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_individualRec), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_individualRec), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for lDSOrdRec - sets  
   * @generated */
  public void setLDSOrdRec(FSArray v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_lDSOrdRec == null)
      jcasType.jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_lDSOrdRec, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for lDSOrdRec - sets an indexed value - 
   * @generated */
  public void setLDSOrdRec(int i, LDSOrdRecType v) { 
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_lDSOrdRec == null)
      jcasType.jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_lDSOrdRec), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_lDSOrdRec), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: groupRec

  /** setter for repositoryRec - sets  
   * @generated */
  public void setRepositoryRec(FSArray v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_repositoryRec == null)
      jcasType.jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_repositoryRec, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for repositoryRec - sets an indexed value - 
   * @generated */
  public void setRepositoryRec(int i, RepositoryRecType v) { 
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_repositoryRec == null)
      jcasType.jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_repositoryRec), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_repositoryRec), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for sourceRec - sets  
   * @generated */
  public void setSourceRec(FSArray v) {
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_sourceRec == null)
      jcasType.jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_sourceRec, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for sourceRec - sets an indexed value - 
   * @generated */
  public void setSourceRec(int i, SourceRecType v) { 
    if (GEDCOMType_Type.featOkTst && ((GEDCOMType_Type)jcasType).casFeat_sourceRec == null)
      jcasType.jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.GEDCOMType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_sourceRec), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GEDCOMType_Type)jcasType).casFeatCode_sourceRec), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
}

    