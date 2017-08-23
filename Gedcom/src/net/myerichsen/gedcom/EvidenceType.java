

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
public class EvidenceType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(EvidenceType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected EvidenceType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EvidenceType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EvidenceType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EvidenceType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for citation - gets 
   * @generated */
  public FSArray getCitation() {
    if (EvidenceType_Type.featOkTst && ((EvidenceType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.EvidenceType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EvidenceType_Type)jcasType).casFeatCode_citation)));}
    
  /** indexed getter for citation - gets an indexed value - 
   * @generated */
  public CitationType getCitation(int i) {
    if (EvidenceType_Type.featOkTst && ((EvidenceType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.EvidenceType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EvidenceType_Type)jcasType).casFeatCode_citation), i);
    return (CitationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EvidenceType_Type)jcasType).casFeatCode_citation), i)));}

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
    
  /** setter for citation - sets  
   * @generated */
  public void setCitation(FSArray v) {
    if (EvidenceType_Type.featOkTst && ((EvidenceType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.EvidenceType");
    jcasType.ll_cas.ll_setRefValue(addr, ((EvidenceType_Type)jcasType).casFeatCode_citation, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for citation - sets an indexed value - 
   * @generated */
  public void setCitation(int i, CitationType v) { 
    if (EvidenceType_Type.featOkTst && ((EvidenceType_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.EvidenceType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((EvidenceType_Type)jcasType).casFeatCode_citation), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((EvidenceType_Type)jcasType).casFeatCode_citation), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    