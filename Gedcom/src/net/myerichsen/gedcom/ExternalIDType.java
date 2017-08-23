

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:35 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class ExternalIDType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ExternalIDType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected ExternalIDType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ExternalIDType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ExternalIDType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ExternalIDType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for externalIdType - gets 
   * @generated */
  public String getExternalIdType() {
    if (ExternalIDType_Type.featOkTst && ((ExternalIDType_Type)jcasType).casFeat_externalIdType == null)
      jcasType.jcas.throwFeatMissing("externalIdType", "net.myerichsen.gedcom.ExternalIDType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ExternalIDType_Type)jcasType).casFeatCode_externalIdType);}
    
  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (ExternalIDType_Type.featOkTst && ((ExternalIDType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.ExternalIDType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ExternalIDType_Type)jcasType).casFeatCode_id);}
    
  //*--------------*
  //* Feature: externalIdType

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: id

  /** setter for externalIdType - sets  
   * @generated */
  public void setExternalIdType(String v) {
    if (ExternalIDType_Type.featOkTst && ((ExternalIDType_Type)jcasType).casFeat_externalIdType == null)
      jcasType.jcas.throwFeatMissing("externalIdType", "net.myerichsen.gedcom.ExternalIDType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ExternalIDType_Type)jcasType).casFeatCode_externalIdType, v);}    
   
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (ExternalIDType_Type.featOkTst && ((ExternalIDType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.ExternalIDType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ExternalIDType_Type)jcasType).casFeatCode_id, v);}    
  }

    