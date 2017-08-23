

/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:38 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class RepositoryRecType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(RepositoryRecType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected RepositoryRecType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public RepositoryRecType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public RepositoryRecType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public RepositoryRecType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for changed - gets 
   * @generated */
  public FSArray getChanged() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.RepositoryRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_changed)));}
    
  /** indexed getter for changed - gets an indexed value - 
   * @generated */
  public ChangedType getChanged(int i) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_changed), i);
    return (ChangedType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_changed), i)));}

  //*--------------*
  //* Feature: name

  /** getter for email - gets 
   * @generated */
  public StringArray getEmail() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.RepositoryRecType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_email)));}
    
  /** indexed getter for email - gets an indexed value - 
   * @generated */
  public String getEmail(int i) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_email), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_email), i);}

  //*--------------*
  //* Feature: mailAddress

  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.RepositoryRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_id);}
    
  /** getter for mailAddress - gets 
   * @generated */
  public FSArray getMailAddress() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.RepositoryRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_mailAddress)));}
    
  /** indexed getter for mailAddress - gets an indexed value - 
   * @generated */
  public MailAddressType getMailAddress(int i) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_mailAddress), i);
    return (MailAddressType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_mailAddress), i)));}

  /** getter for name - gets 
   * @generated */
  public NameType getName() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "net.myerichsen.gedcom.RepositoryRecType");
    return (NameType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_name)));}
    
  //*--------------*
  //* Feature: phone

  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.RepositoryRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_note)));}
    
  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_note), i)));}

  /** getter for phone - gets 
   * @generated */
  public FSArray getPhone() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.RepositoryRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_phone)));}
    
  /** indexed getter for phone - gets an indexed value - 
   * @generated */
  public PhoneType getPhone(int i) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_phone), i);
    return (PhoneType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_phone), i)));}

  //*--------------*
  //* Feature: email

  /** getter for repositoryType - gets 
   * @generated */
  public String getRepositoryType() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_repositoryType == null)
      jcasType.jcas.throwFeatMissing("repositoryType", "net.myerichsen.gedcom.RepositoryRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_repositoryType);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** getter for uRI - gets 
   * @generated */
  public StringArray getURI() {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.RepositoryRecType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_uRI)));}
    
  /** indexed getter for uRI - gets an indexed value - 
   * @generated */
  public String getURI(int i) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_uRI), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_uRI), i);}

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for changed - sets  
   * @generated */
  public void setChanged(FSArray v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_changed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for changed - sets an indexed value - 
   * @generated */
  public void setChanged(int i, ChangedType v) { 
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_changed), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_changed), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** indexed setter for email - sets an indexed value - 
   * @generated */
  public void setEmail(int i, String v) { 
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_email), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_email), i, v);}
   
    
  //*--------------*
  //* Feature: note

  /** setter for email - sets  
   * @generated */
  public void setEmail(StringArray v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_email, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_id, v);}    
   
    
  /** setter for mailAddress - sets  
   * @generated */
  public void setMailAddress(FSArray v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_mailAddress, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for mailAddress - sets an indexed value - 
   * @generated */
  public void setMailAddress(int i, MailAddressType v) { 
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_mailAddress), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_mailAddress), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: changed

  /** setter for name - sets  
   * @generated */
  public void setName(NameType v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_name, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for phone - sets  
   * @generated */
  public void setPhone(FSArray v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_phone, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: id

  /** indexed setter for phone - sets an indexed value - 
   * @generated */
  public void setPhone(int i, PhoneType v) { 
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_phone), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_phone), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for repositoryType - sets  
   * @generated */
  public void setRepositoryType(String v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_repositoryType == null)
      jcasType.jcas.throwFeatMissing("repositoryType", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_repositoryType, v);}    
                                                  //*--------------*
  //* Feature: repositoryType

  /** indexed setter for uRI - sets an indexed value - 
   * @generated */
  public void setURI(int i, String v) { 
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_uRI), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_uRI), i, v);}
   
    
  /** setter for uRI - sets  
   * @generated */
  public void setURI(StringArray v) {
    if (RepositoryRecType_Type.featOkTst && ((RepositoryRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.RepositoryRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((RepositoryRecType_Type)jcasType).casFeatCode_uRI, jcasType.ll_cas.ll_getFSRef(v));}    
    
}

    