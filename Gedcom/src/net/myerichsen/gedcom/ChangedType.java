

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:32 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class ChangedType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ChangedType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected ChangedType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ChangedType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ChangedType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ChangedType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for changedDate - gets 
   * @generated */
  public String getChangedDate() {
    if (ChangedType_Type.featOkTst && ((ChangedType_Type)jcasType).casFeat_changedDate == null)
      jcasType.jcas.throwFeatMissing("changedDate", "net.myerichsen.gedcom.ChangedType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ChangedType_Type)jcasType).casFeatCode_changedDate);}
    
  /** getter for changedTime - gets 
   * @generated */
  public String getChangedTime() {
    if (ChangedType_Type.featOkTst && ((ChangedType_Type)jcasType).casFeat_changedTime == null)
      jcasType.jcas.throwFeatMissing("changedTime", "net.myerichsen.gedcom.ChangedType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ChangedType_Type)jcasType).casFeatCode_changedTime);}
    
  //*--------------*
  //* Feature: contact

  /** getter for contact - gets 
   * @generated */
  public ContactType getContact() {
    if (ChangedType_Type.featOkTst && ((ChangedType_Type)jcasType).casFeat_contact == null)
      jcasType.jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.ChangedType");
    return (ContactType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ChangedType_Type)jcasType).casFeatCode_contact)));}
    
  /** getter for note - gets 
   * @generated */
  public NoteType getNote() {
    if (ChangedType_Type.featOkTst && ((ChangedType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.ChangedType");
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ChangedType_Type)jcasType).casFeatCode_note)));}
    
  //*--------------*
  //* Feature: note

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: changedDate

  /** setter for changedDate - sets  
   * @generated */
  public void setChangedDate(String v) {
    if (ChangedType_Type.featOkTst && ((ChangedType_Type)jcasType).casFeat_changedDate == null)
      jcasType.jcas.throwFeatMissing("changedDate", "net.myerichsen.gedcom.ChangedType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ChangedType_Type)jcasType).casFeatCode_changedDate, v);}    
   
    
  /** setter for changedTime - sets  
   * @generated */
  public void setChangedTime(String v) {
    if (ChangedType_Type.featOkTst && ((ChangedType_Type)jcasType).casFeat_changedTime == null)
      jcasType.jcas.throwFeatMissing("changedTime", "net.myerichsen.gedcom.ChangedType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ChangedType_Type)jcasType).casFeatCode_changedTime, v);}    
                                                  //*--------------*
  //* Feature: changedTime

  /** setter for contact - sets  
   * @generated */
  public void setContact(ContactType v) {
    if (ChangedType_Type.featOkTst && ((ChangedType_Type)jcasType).casFeat_contact == null)
      jcasType.jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.ChangedType");
    jcasType.ll_cas.ll_setRefValue(addr, ((ChangedType_Type)jcasType).casFeatCode_contact, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for note - sets  
   * @generated */
  public void setNote(NoteType v) {
    if (ChangedType_Type.featOkTst && ((ChangedType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.ChangedType");
    jcasType.ll_cas.ll_setRefValue(addr, ((ChangedType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
}

    