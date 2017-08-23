

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:33 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class CitationType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(CitationType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected CitationType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public CitationType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public CitationType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public CitationType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for caption - gets 
   * @generated */
  public String getCaption() {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_caption == null)
      jcasType.jcas.throwFeatMissing("caption", "net.myerichsen.gedcom.CitationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CitationType_Type)jcasType).casFeatCode_caption);}
    
  /** getter for extract - gets 
   * @generated */
  public FSArray getExtract() {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_extract == null)
      jcasType.jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.CitationType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_extract)));}
    
  //*--------------*
  //* Feature: link

  /** indexed getter for extract - gets an indexed value - 
   * @generated */
  public ExtractType getExtract(int i) {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_extract == null)
      jcasType.jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.CitationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_extract), i);
    return (ExtractType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_extract), i)));}

  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.CitationType");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_link)));}
    
  //*--------------*
  //* Feature: caption

  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.CitationType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_note)));}
    
  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.CitationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_note), i)));}

  //*--------------*
  //* Feature: whereInSource

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** getter for whenRecorded - gets 
   * @generated */
  public String getWhenRecorded() {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_whenRecorded == null)
      jcasType.jcas.throwFeatMissing("whenRecorded", "net.myerichsen.gedcom.CitationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CitationType_Type)jcasType).casFeatCode_whenRecorded);}
    
  //*--------------*
  //* Feature: whenRecorded

  /** getter for whereInSource - gets 
   * @generated */
  public String getWhereInSource() {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_whereInSource == null)
      jcasType.jcas.throwFeatMissing("whereInSource", "net.myerichsen.gedcom.CitationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((CitationType_Type)jcasType).casFeatCode_whereInSource);}
    
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: extract

  /** setter for caption - sets  
   * @generated */
  public void setCaption(String v) {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_caption == null)
      jcasType.jcas.throwFeatMissing("caption", "net.myerichsen.gedcom.CitationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((CitationType_Type)jcasType).casFeatCode_caption, v);}    
   
    
  /** setter for extract - sets  
   * @generated */
  public void setExtract(FSArray v) {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_extract == null)
      jcasType.jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.CitationType");
    jcasType.ll_cas.ll_setRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_extract, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for extract - sets an indexed value - 
   * @generated */
  public void setExtract(int i, ExtractType v) { 
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_extract == null)
      jcasType.jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.CitationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_extract), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_extract), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.CitationType");
    jcasType.ll_cas.ll_setRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: note

  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.CitationType");
    jcasType.ll_cas.ll_setRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.CitationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((CitationType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
                                                  /** setter for whenRecorded - sets  
   * @generated */
  public void setWhenRecorded(String v) {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_whenRecorded == null)
      jcasType.jcas.throwFeatMissing("whenRecorded", "net.myerichsen.gedcom.CitationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((CitationType_Type)jcasType).casFeatCode_whenRecorded, v);}    
   
    
  /** setter for whereInSource - sets  
   * @generated */
  public void setWhereInSource(String v) {
    if (CitationType_Type.featOkTst && ((CitationType_Type)jcasType).casFeat_whereInSource == null)
      jcasType.jcas.throwFeatMissing("whereInSource", "net.myerichsen.gedcom.CitationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((CitationType_Type)jcasType).casFeatCode_whereInSource, v);}    
   
    
}

    