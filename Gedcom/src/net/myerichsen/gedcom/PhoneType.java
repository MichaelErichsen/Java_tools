

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
public class PhoneType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(PhoneType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected PhoneType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PhoneType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PhoneType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PhoneType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for pType - gets 
   * @generated */
  public String getPType() {
    if (PhoneType_Type.featOkTst && ((PhoneType_Type)jcasType).casFeat_pType == null)
      jcasType.jcas.throwFeatMissing("pType", "net.myerichsen.gedcom.PhoneType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PhoneType_Type)jcasType).casFeatCode_pType);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for pType - sets  
   * @generated */
  public void setPType(String v) {
    if (PhoneType_Type.featOkTst && ((PhoneType_Type)jcasType).casFeat_pType == null)
      jcasType.jcas.throwFeatMissing("pType", "net.myerichsen.gedcom.PhoneType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PhoneType_Type)jcasType).casFeatCode_pType, v);}    
  }

    