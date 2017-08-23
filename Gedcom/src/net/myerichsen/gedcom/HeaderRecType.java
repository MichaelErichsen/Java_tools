

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:36 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class HeaderRecType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(HeaderRecType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected HeaderRecType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public HeaderRecType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public HeaderRecType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public HeaderRecType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for citation - gets 
   * @generated */
  public CitationType getCitation() {
    if (HeaderRecType_Type.featOkTst && ((HeaderRecType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.HeaderRecType");
    return (CitationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((HeaderRecType_Type)jcasType).casFeatCode_citation)));}
    
  /** getter for fileCreation - gets 
   * @generated */
  public FileCreationType getFileCreation() {
    if (HeaderRecType_Type.featOkTst && ((HeaderRecType_Type)jcasType).casFeat_fileCreation == null)
      jcasType.jcas.throwFeatMissing("fileCreation", "net.myerichsen.gedcom.HeaderRecType");
    return (FileCreationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((HeaderRecType_Type)jcasType).casFeatCode_fileCreation)));}
    
  //*--------------*
  //* Feature: fileCreation

  /** getter for note - gets 
   * @generated */
  public NoteType getNote() {
    if (HeaderRecType_Type.featOkTst && ((HeaderRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.HeaderRecType");
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((HeaderRecType_Type)jcasType).casFeatCode_note)));}
    
  /** getter for submitter - gets 
   * @generated */
  public SubmitterType getSubmitter() {
    if (HeaderRecType_Type.featOkTst && ((HeaderRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.HeaderRecType");
    return (SubmitterType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((HeaderRecType_Type)jcasType).casFeatCode_submitter)));}
    
  //*--------------*
  //* Feature: citation

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: submitter

  /** setter for citation - sets  
   * @generated */
  public void setCitation(CitationType v) {
    if (HeaderRecType_Type.featOkTst && ((HeaderRecType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.HeaderRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((HeaderRecType_Type)jcasType).casFeatCode_citation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for fileCreation - sets  
   * @generated */
  public void setFileCreation(FileCreationType v) {
    if (HeaderRecType_Type.featOkTst && ((HeaderRecType_Type)jcasType).casFeat_fileCreation == null)
      jcasType.jcas.throwFeatMissing("fileCreation", "net.myerichsen.gedcom.HeaderRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((HeaderRecType_Type)jcasType).casFeatCode_fileCreation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: note

  /** setter for note - sets  
   * @generated */
  public void setNote(NoteType v) {
    if (HeaderRecType_Type.featOkTst && ((HeaderRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.HeaderRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((HeaderRecType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
                                                  /** setter for submitter - sets  
   * @generated */
  public void setSubmitter(SubmitterType v) {
    if (HeaderRecType_Type.featOkTst && ((HeaderRecType_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.HeaderRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((HeaderRecType_Type)jcasType).casFeatCode_submitter, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
}

    