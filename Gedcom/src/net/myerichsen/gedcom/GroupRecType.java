

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:36 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class GroupRecType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(GroupRecType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected GroupRecType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GroupRecType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GroupRecType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GroupRecType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for changed - gets 
   * @generated */
  public FSArray getChanged() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_changed)));}
    
  /** indexed getter for changed - gets an indexed value - 
   * @generated */
  public ChangedType getChanged(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_changed), i);
    return (ChangedType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_changed), i)));}

  //*--------------*
  //* Feature: name

  /** getter for contact - gets 
   * @generated */
  public FSArray getContact() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_contact == null)
      jcasType.jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_contact)));}
    
  /** indexed getter for contact - gets an indexed value - 
   * @generated */
  public ContactType getContact(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_contact == null)
      jcasType.jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_contact), i);
    return (ContactType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_contact), i)));}

  //*--------------*
  //* Feature: contact

  /** getter for email - gets 
   * @generated */
  public StringArray getEmail() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.GroupRecType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_email)));}
    
  /** indexed getter for email - gets an indexed value - 
   * @generated */
  public String getEmail(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_email), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_email), i);}

  /** getter for enrichment - gets 
   * @generated */
  public FSArray getEnrichment() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_enrichment)));}
    
  /** indexed getter for enrichment - gets an indexed value - 
   * @generated */
  public EnrichmentType getEnrichment(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_enrichment), i);
    return (EnrichmentType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_enrichment), i)));}

  //*--------------*
  //* Feature: member

  /** getter for evidence - gets 
   * @generated */
  public FSArray getEvidence() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_evidence)));}
    
  /** indexed getter for evidence - gets an indexed value - 
   * @generated */
  public EvidenceType getEvidence(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_evidence), i);
    return (EvidenceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_evidence), i)));}

  /** getter for externalID - gets 
   * @generated */
  public FSArray getExternalID() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_externalID)));}
    
  /** indexed getter for externalID - gets an indexed value - 
   * @generated */
  public ExternalIDType getExternalID(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_externalID), i);
    return (ExternalIDType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_externalID), i)));}

  //*--------------*
  //* Feature: parentGroup

  /** getter for groupType - gets 
   * @generated */
  public String getGroupType() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_groupType == null)
      jcasType.jcas.throwFeatMissing("groupType", "net.myerichsen.gedcom.GroupRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_groupType);}
    
  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.GroupRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_id);}
    
  /** getter for mailAddress - gets 
   * @generated */
  public FSArray getMailAddress() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_mailAddress)));}
    
  /** indexed getter for mailAddress - gets an indexed value - 
   * @generated */
  public MailAddressType getMailAddress(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_mailAddress), i);
    return (MailAddressType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_mailAddress), i)));}

  //*--------------*
  //* Feature: mailAddress

  /** getter for member - gets 
   * @generated */
  public FSArray getMember() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_member == null)
      jcasType.jcas.throwFeatMissing("member", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_member)));}
    
  /** indexed getter for member - gets an indexed value - 
   * @generated */
  public MemberType getMember(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_member == null)
      jcasType.jcas.throwFeatMissing("member", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_member), i);
    return (MemberType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_member), i)));}

  /** getter for name - gets 
   * @generated */
  public NameType getName() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "net.myerichsen.gedcom.GroupRecType");
    return (NameType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_name)));}
    
  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_note)));}
    
  //*--------------*
  //* Feature: phone

  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_note), i)));}

  /** getter for parentGroup - gets 
   * @generated */
  public FSArray getParentGroup() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_parentGroup == null)
      jcasType.jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_parentGroup)));}
    
  /** indexed getter for parentGroup - gets an indexed value - 
   * @generated */
  public ParentGroupType getParentGroup(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_parentGroup == null)
      jcasType.jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_parentGroup), i);
    return (ParentGroupType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_parentGroup), i)));}

  /** getter for phone - gets 
   * @generated */
  public FSArray getPhone() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.GroupRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_phone)));}
    
  //*--------------*
  //* Feature: email

  /** indexed getter for phone - gets an indexed value - 
   * @generated */
  public PhoneType getPhone(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_phone), i);
    return (PhoneType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_phone), i)));}

  /** getter for submitter - gets 
   * @generated */
  public SubmitterType getSubmitter() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.GroupRecType");
    return (SubmitterType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_submitter)));}
    
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** getter for uRI - gets 
   * @generated */
  public StringArray getURI() {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.GroupRecType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_uRI)));}
    
  //*--------------*
  //* Feature: uRI

  /** indexed getter for uRI - gets an indexed value - 
   * @generated */
  public String getURI(int i) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_uRI), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_uRI), i);}

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
    
  /** setter for changed - sets  
   * @generated */
  public void setChanged(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_changed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for changed - sets an indexed value - 
   * @generated */
  public void setChanged(int i, ChangedType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_changed), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_changed), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: externalID

  /** setter for contact - sets  
   * @generated */
  public void setContact(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_contact == null)
      jcasType.jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_contact, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for contact - sets an indexed value - 
   * @generated */
  public void setContact(int i, ContactType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_contact == null)
      jcasType.jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_contact), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_contact), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** indexed setter for email - sets an indexed value - 
   * @generated */
  public void setEmail(int i, String v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_email), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_email), i, v);}
   
    
  /** setter for email - sets  
   * @generated */
  public void setEmail(StringArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_email, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: submitter

  /** setter for enrichment - sets  
   * @generated */
  public void setEnrichment(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_enrichment, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for enrichment - sets an indexed value - 
   * @generated */
  public void setEnrichment(int i, EnrichmentType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_enrichment), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_enrichment), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: note

  /** setter for evidence - sets  
   * @generated */
  public void setEvidence(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_evidence, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for evidence - sets an indexed value - 
   * @generated */
  public void setEvidence(int i, EvidenceType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_evidence), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_evidence), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for externalID - sets  
   * @generated */
  public void setExternalID(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_externalID, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for externalID - sets an indexed value - 
   * @generated */
  public void setExternalID(int i, ExternalIDType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_externalID), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_externalID), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: evidence

  /** setter for groupType - sets  
   * @generated */
  public void setGroupType(String v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_groupType == null)
      jcasType.jcas.throwFeatMissing("groupType", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_groupType, v);}    
   
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_id, v);}    
                                                  /** setter for mailAddress - sets  
   * @generated */
  public void setMailAddress(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_mailAddress, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for mailAddress - sets an indexed value - 
   * @generated */
  public void setMailAddress(int i, MailAddressType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_mailAddress), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_mailAddress), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: enrichment

  /** setter for member - sets  
   * @generated */
  public void setMember(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_member == null)
      jcasType.jcas.throwFeatMissing("member", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_member, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for member - sets an indexed value - 
   * @generated */
  public void setMember(int i, MemberType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_member == null)
      jcasType.jcas.throwFeatMissing("member", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_member), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_member), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for name - sets  
   * @generated */
  public void setName(NameType v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_name, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: changed

  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for parentGroup - sets  
   * @generated */
  public void setParentGroup(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_parentGroup == null)
      jcasType.jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_parentGroup, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for parentGroup - sets an indexed value - 
   * @generated */
  public void setParentGroup(int i, ParentGroupType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_parentGroup == null)
      jcasType.jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_parentGroup), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_parentGroup), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for phone - sets  
   * @generated */
  public void setPhone(FSArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_phone, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: groupType

  /** indexed setter for phone - sets an indexed value - 
   * @generated */
  public void setPhone(int i, PhoneType v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_phone), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_phone), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for submitter - sets  
   * @generated */
  public void setSubmitter(SubmitterType v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_submitter, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: id

  /** indexed setter for uRI - sets an indexed value - 
   * @generated */
  public void setURI(int i, String v) { 
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.GroupRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_uRI), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_uRI), i, v);}
   
    
  /** setter for uRI - sets  
   * @generated */
  public void setURI(StringArray v) {
    if (GroupRecType_Type.featOkTst && ((GroupRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.GroupRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((GroupRecType_Type)jcasType).casFeatCode_uRI, jcasType.ll_cas.ll_getFSRef(v));}    
    
}

    