

/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class NamePartType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NamePartType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected NamePartType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NamePartType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NamePartType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NamePartType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for nPLevel - gets 
   * @generated */
  public String getNPLevel() {
    if (NamePartType_Type.featOkTst && ((NamePartType_Type)jcasType).casFeat_nPLevel == null)
      jcasType.jcas.throwFeatMissing("nPLevel", "net.myerichsen.gedcom.NamePartType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamePartType_Type)jcasType).casFeatCode_nPLevel);}
    
  /** getter for nPType - gets 
   * @generated */
  public String getNPType() {
    if (NamePartType_Type.featOkTst && ((NamePartType_Type)jcasType).casFeat_nPType == null)
      jcasType.jcas.throwFeatMissing("nPType", "net.myerichsen.gedcom.NamePartType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NamePartType_Type)jcasType).casFeatCode_nPType);}
    
  //*--------------*
  //* Feature: nPLevel

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: nPType

  /** setter for nPLevel - sets  
   * @generated */
  public void setNPLevel(String v) {
    if (NamePartType_Type.featOkTst && ((NamePartType_Type)jcasType).casFeat_nPLevel == null)
      jcasType.jcas.throwFeatMissing("nPLevel", "net.myerichsen.gedcom.NamePartType");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamePartType_Type)jcasType).casFeatCode_nPLevel, v);}    
   
    
  /** setter for nPType - sets  
   * @generated */
  public void setNPType(String v) {
    if (NamePartType_Type.featOkTst && ((NamePartType_Type)jcasType).casFeat_nPType == null)
      jcasType.jcas.throwFeatMissing("nPType", "net.myerichsen.gedcom.NamePartType");
    jcasType.ll_cas.ll_setStringValue(addr, ((NamePartType_Type)jcasType).casFeatCode_nPType, v);}    
  }

    