

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
public class PersInfoType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(PersInfoType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected PersInfoType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PersInfoType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PersInfoType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PersInfoType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for date - gets 
   * @generated */
  public DateType getDate() {
    if (PersInfoType_Type.featOkTst && ((PersInfoType_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.PersInfoType");
    return (DateType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PersInfoType_Type)jcasType).casFeatCode_date)));}
    
  /** getter for information - gets 
   * @generated */
  public String getInformation() {
    if (PersInfoType_Type.featOkTst && ((PersInfoType_Type)jcasType).casFeat_information == null)
      jcasType.jcas.throwFeatMissing("information", "net.myerichsen.gedcom.PersInfoType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PersInfoType_Type)jcasType).casFeatCode_information);}
    
  //*--------------*
  //* Feature: information

  /** getter for pIType - gets 
   * @generated */
  public String getPIType() {
    if (PersInfoType_Type.featOkTst && ((PersInfoType_Type)jcasType).casFeat_pIType == null)
      jcasType.jcas.throwFeatMissing("pIType", "net.myerichsen.gedcom.PersInfoType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PersInfoType_Type)jcasType).casFeatCode_pIType);}
    
  /** getter for place - gets 
   * @generated */
  public PlaceType getPlace() {
    if (PersInfoType_Type.featOkTst && ((PersInfoType_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "net.myerichsen.gedcom.PersInfoType");
    return (PlaceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PersInfoType_Type)jcasType).casFeatCode_place)));}
    
  //*--------------*
  //* Feature: date

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: place

  /** setter for date - sets  
   * @generated */
  public void setDate(DateType v) {
    if (PersInfoType_Type.featOkTst && ((PersInfoType_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.PersInfoType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PersInfoType_Type)jcasType).casFeatCode_date, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for information - sets  
   * @generated */
  public void setInformation(String v) {
    if (PersInfoType_Type.featOkTst && ((PersInfoType_Type)jcasType).casFeat_information == null)
      jcasType.jcas.throwFeatMissing("information", "net.myerichsen.gedcom.PersInfoType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PersInfoType_Type)jcasType).casFeatCode_information, v);}    
   
    
  //*--------------*
  //* Feature: pIType

  /** setter for pIType - sets  
   * @generated */
  public void setPIType(String v) {
    if (PersInfoType_Type.featOkTst && ((PersInfoType_Type)jcasType).casFeat_pIType == null)
      jcasType.jcas.throwFeatMissing("pIType", "net.myerichsen.gedcom.PersInfoType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PersInfoType_Type)jcasType).casFeatCode_pIType, v);}    
                                                  /** setter for place - sets  
   * @generated */
  public void setPlace(PlaceType v) {
    if (PersInfoType_Type.featOkTst && ((PersInfoType_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "net.myerichsen.gedcom.PersInfoType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PersInfoType_Type)jcasType).casFeatCode_place, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
}

    