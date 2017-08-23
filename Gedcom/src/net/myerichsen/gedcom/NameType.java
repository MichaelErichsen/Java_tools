

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
public class NameType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(NameType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected NameType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NameType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NameType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NameType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for language - gets 
   * @generated */
  public String getLanguage() {
    if (NameType_Type.featOkTst && ((NameType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.NameType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NameType_Type)jcasType).casFeatCode_language);}
    
  /** getter for nType - gets 
   * @generated */
  public String getNType() {
    if (NameType_Type.featOkTst && ((NameType_Type)jcasType).casFeat_nType == null)
      jcasType.jcas.throwFeatMissing("nType", "net.myerichsen.gedcom.NameType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NameType_Type)jcasType).casFeatCode_nType);}
    
  //*--------------*
  //* Feature: language

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: nType

  /** setter for language - sets  
   * @generated */
  public void setLanguage(String v) {
    if (NameType_Type.featOkTst && ((NameType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.NameType");
    jcasType.ll_cas.ll_setStringValue(addr, ((NameType_Type)jcasType).casFeatCode_language, v);}    
   
    
  /** setter for nType - sets  
   * @generated */
  public void setNType(String v) {
    if (NameType_Type.featOkTst && ((NameType_Type)jcasType).casFeat_nType == null)
      jcasType.jcas.throwFeatMissing("nType", "net.myerichsen.gedcom.NameType");
    jcasType.ll_cas.ll_setStringValue(addr, ((NameType_Type)jcasType).casFeatCode_nType, v);}    
  }

    