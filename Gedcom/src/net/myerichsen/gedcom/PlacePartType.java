

/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:38 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class PlacePartType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(PlacePartType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected PlacePartType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PlacePartType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PlacePartType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PlacePartType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for pPLevel - gets 
   * @generated */
  public String getPPLevel() {
    if (PlacePartType_Type.featOkTst && ((PlacePartType_Type)jcasType).casFeat_pPLevel == null)
      jcasType.jcas.throwFeatMissing("pPLevel", "net.myerichsen.gedcom.PlacePartType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlacePartType_Type)jcasType).casFeatCode_pPLevel);}
    
  /** getter for pPType - gets 
   * @generated */
  public String getPPType() {
    if (PlacePartType_Type.featOkTst && ((PlacePartType_Type)jcasType).casFeat_pPType == null)
      jcasType.jcas.throwFeatMissing("pPType", "net.myerichsen.gedcom.PlacePartType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlacePartType_Type)jcasType).casFeatCode_pPType);}
    
  //*--------------*
  //* Feature: pPLevel

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: pPType

  /** setter for pPLevel - sets  
   * @generated */
  public void setPPLevel(String v) {
    if (PlacePartType_Type.featOkTst && ((PlacePartType_Type)jcasType).casFeat_pPLevel == null)
      jcasType.jcas.throwFeatMissing("pPLevel", "net.myerichsen.gedcom.PlacePartType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlacePartType_Type)jcasType).casFeatCode_pPLevel, v);}    
   
    
  /** setter for pPType - sets  
   * @generated */
  public void setPPType(String v) {
    if (PlacePartType_Type.featOkTst && ((PlacePartType_Type)jcasType).casFeat_pPType == null)
      jcasType.jcas.throwFeatMissing("pPType", "net.myerichsen.gedcom.PlacePartType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlacePartType_Type)jcasType).casFeatCode_pPType, v);}    
  }

    