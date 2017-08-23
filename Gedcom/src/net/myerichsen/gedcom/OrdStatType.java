

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
public class OrdStatType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(OrdStatType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected OrdStatType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public OrdStatType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public OrdStatType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public OrdStatType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for date - gets 
   * @generated */
  public DateType getDate() {
    if (OrdStatType_Type.featOkTst && ((OrdStatType_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.OrdStatType");
    return (DateType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((OrdStatType_Type)jcasType).casFeatCode_date)));}
    
  /** getter for oSCode - gets 
   * @generated */
  public String getOSCode() {
    if (OrdStatType_Type.featOkTst && ((OrdStatType_Type)jcasType).casFeat_oSCode == null)
      jcasType.jcas.throwFeatMissing("oSCode", "net.myerichsen.gedcom.OrdStatType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((OrdStatType_Type)jcasType).casFeatCode_oSCode);}
    
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
  //* Feature: oSCode

  /** setter for date - sets  
   * @generated */
  public void setDate(DateType v) {
    if (OrdStatType_Type.featOkTst && ((OrdStatType_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.OrdStatType");
    jcasType.ll_cas.ll_setRefValue(addr, ((OrdStatType_Type)jcasType).casFeatCode_date, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for oSCode - sets  
   * @generated */
  public void setOSCode(String v) {
    if (OrdStatType_Type.featOkTst && ((OrdStatType_Type)jcasType).casFeat_oSCode == null)
      jcasType.jcas.throwFeatMissing("oSCode", "net.myerichsen.gedcom.OrdStatType");
    jcasType.ll_cas.ll_setStringValue(addr, ((OrdStatType_Type)jcasType).casFeatCode_oSCode, v);}    
  }

    