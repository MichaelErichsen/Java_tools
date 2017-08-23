

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:32 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class BasedOnType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(BasedOnType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected BasedOnType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BasedOnType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BasedOnType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BasedOnType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for link - gets 
   * @generated */
  public FSArray getLink() {
    if (BasedOnType_Type.featOkTst && ((BasedOnType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.BasedOnType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_link)));}
    
  /** indexed getter for link - gets an indexed value - 
   * @generated */
  public LinkType getLink(int i) {
    if (BasedOnType_Type.featOkTst && ((BasedOnType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.BasedOnType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_link), i);
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_link), i)));}

  //*--------------*
  //* Feature: link

  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (BasedOnType_Type.featOkTst && ((BasedOnType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.BasedOnType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_note)));}
    
  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (BasedOnType_Type.featOkTst && ((BasedOnType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.BasedOnType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_note), i)));}

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
   
    
  //*--------------*
  //* Feature: note

  /** setter for link - sets  
   * @generated */
  public void setLink(FSArray v) {
    if (BasedOnType_Type.featOkTst && ((BasedOnType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.BasedOnType");
    jcasType.ll_cas.ll_setRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for link - sets an indexed value - 
   * @generated */
  public void setLink(int i, LinkType v) { 
    if (BasedOnType_Type.featOkTst && ((BasedOnType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.BasedOnType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_link), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_link), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (BasedOnType_Type.featOkTst && ((BasedOnType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.BasedOnType");
    jcasType.ll_cas.ll_setRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (BasedOnType_Type.featOkTst && ((BasedOnType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.BasedOnType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((BasedOnType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    