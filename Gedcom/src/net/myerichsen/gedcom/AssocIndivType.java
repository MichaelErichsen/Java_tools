

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:31 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class AssocIndivType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(AssocIndivType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected AssocIndivType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AssocIndivType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AssocIndivType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AssocIndivType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for association - gets 
   * @generated */
  public String getAssociation() {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_association == null)
      jcasType.jcas.throwFeatMissing("association", "net.myerichsen.gedcom.AssocIndivType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_association);}
    
  /** getter for citation - gets 
   * @generated */
  public FSArray getCitation() {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.AssocIndivType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_citation)));}
    
  //*--------------*
  //* Feature: link

  /** indexed getter for citation - gets an indexed value - 
   * @generated */
  public CitationType getCitation(int i) {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.AssocIndivType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_citation), i);
    return (CitationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_citation), i)));}

  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.AssocIndivType");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_link)));}
    
  //*--------------*
  //* Feature: association

  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.AssocIndivType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_note)));}
    
  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.AssocIndivType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_note), i)));}

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
    
  /** setter for association - sets  
   * @generated */
  public void setAssociation(String v) {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_association == null)
      jcasType.jcas.throwFeatMissing("association", "net.myerichsen.gedcom.AssocIndivType");
    jcasType.ll_cas.ll_setStringValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_association, v);}    
   
    
  /** setter for citation - sets  
   * @generated */
  public void setCitation(FSArray v) {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.AssocIndivType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_citation, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: citation

  /** indexed setter for citation - sets an indexed value - 
   * @generated */
  public void setCitation(int i, CitationType v) { 
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.AssocIndivType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_citation), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_citation), i, jcasType.ll_cas.ll_getFSRef(v));}
                                                  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.AssocIndivType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.AssocIndivType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (AssocIndivType_Type.featOkTst && ((AssocIndivType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.AssocIndivType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AssocIndivType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
}

    