

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class MailAddressType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(MailAddressType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected MailAddressType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MailAddressType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MailAddressType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public MailAddressType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for addrLine - gets 
   * @generated */
  public FSArray getAddrLine() {
    if (MailAddressType_Type.featOkTst && ((MailAddressType_Type)jcasType).casFeat_addrLine == null)
      jcasType.jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.MailAddressType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MailAddressType_Type)jcasType).casFeatCode_addrLine)));}
    
  /** indexed getter for addrLine - gets an indexed value - 
   * @generated */
  public AddrLineType getAddrLine(int i) {
    if (MailAddressType_Type.featOkTst && ((MailAddressType_Type)jcasType).casFeat_addrLine == null)
      jcasType.jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.MailAddressType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MailAddressType_Type)jcasType).casFeatCode_addrLine), i);
    return (AddrLineType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MailAddressType_Type)jcasType).casFeatCode_addrLine), i)));}

  //*--------------*
  //* Feature: addrLine

  /** getter for language - gets 
   * @generated */
  public String getLanguage() {
    if (MailAddressType_Type.featOkTst && ((MailAddressType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.MailAddressType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MailAddressType_Type)jcasType).casFeatCode_language);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}

  /** setter for addrLine - sets  
   * @generated */
  public void setAddrLine(FSArray v) {
    if (MailAddressType_Type.featOkTst && ((MailAddressType_Type)jcasType).casFeat_addrLine == null)
      jcasType.jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.MailAddressType");
    jcasType.ll_cas.ll_setRefValue(addr, ((MailAddressType_Type)jcasType).casFeatCode_addrLine, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: language

  /** indexed setter for addrLine - sets an indexed value - 
   * @generated */
  public void setAddrLine(int i, AddrLineType v) { 
    if (MailAddressType_Type.featOkTst && ((MailAddressType_Type)jcasType).casFeat_addrLine == null)
      jcasType.jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.MailAddressType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MailAddressType_Type)jcasType).casFeatCode_addrLine), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MailAddressType_Type)jcasType).casFeatCode_addrLine), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for language - sets  
   * @generated */
  public void setLanguage(String v) {
    if (MailAddressType_Type.featOkTst && ((MailAddressType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.MailAddressType");
    jcasType.ll_cas.ll_setStringValue(addr, ((MailAddressType_Type)jcasType).casFeatCode_language, v);}    
  }

    