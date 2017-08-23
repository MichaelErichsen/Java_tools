

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:36 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class IndivNameVariationType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(IndivNameVariationType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected IndivNameVariationType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public IndivNameVariationType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public IndivNameVariationType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public IndivNameVariationType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for group - gets 
   * @generated */
  public StringArray getGroup() {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameVariationType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_group)));}
    
  /** indexed getter for group - gets an indexed value - 
   * @generated */
  public String getGroup(int i) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_group), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_group), i);}

  //*--------------*
  //* Feature: group

  /** getter for iNVMethod - gets 
   * @generated */
  public String getINVMethod() {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_iNVMethod == null)
      jcasType.jcas.throwFeatMissing("iNVMethod", "net.myerichsen.gedcom.IndivNameVariationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVMethod);}
    
  /** getter for iNVString - gets 
   * @generated */
  public StringArray getINVString() {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_iNVString == null)
      jcasType.jcas.throwFeatMissing("iNVString", "net.myerichsen.gedcom.IndivNameVariationType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVString)));}
    
  /** indexed getter for iNVString - gets an indexed value - 
   * @generated */
  public String getINVString(int i) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_iNVString == null)
      jcasType.jcas.throwFeatMissing("iNVString", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVString), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVString), i);}

  /** getter for iNVType - gets 
   * @generated */
  public String getINVType() {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_iNVType == null)
      jcasType.jcas.throwFeatMissing("iNVType", "net.myerichsen.gedcom.IndivNameVariationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVType);}
    
  //*--------------*
  //* Feature: iNVString

  /** getter for language - gets 
   * @generated */
  public String getLanguage() {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.IndivNameVariationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_language);}
    
  /** getter for namePart - gets 
   * @generated */
  public FSArray getNamePart() {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameVariationType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_namePart)));}
    
  /** indexed getter for namePart - gets an indexed value - 
   * @generated */
  public NamePartType getNamePart(int i) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_namePart), i);
    return (NamePartType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_namePart), i)));}

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** indexed setter for group - sets an indexed value - 
   * @generated */
  public void setGroup(int i, String v) { 
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_group), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_group), i, v);}
   
    
  /** setter for group - sets  
   * @generated */
  public void setGroup(StringArray v) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_group, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for iNVMethod - sets  
   * @generated */
  public void setINVMethod(String v) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_iNVMethod == null)
      jcasType.jcas.throwFeatMissing("iNVMethod", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVMethod, v);}    
   
    
  //*--------------*
  //* Feature: iNVMethod

  /** indexed setter for iNVString - sets an indexed value - 
   * @generated */
  public void setINVString(int i, String v) { 
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_iNVString == null)
      jcasType.jcas.throwFeatMissing("iNVString", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVString), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVString), i, v);}
   
    
  /** setter for iNVString - sets  
   * @generated */
  public void setINVString(StringArray v) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_iNVString == null)
      jcasType.jcas.throwFeatMissing("iNVString", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVString, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: iNVType

  /** setter for iNVType - sets  
   * @generated */
  public void setINVType(String v) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_iNVType == null)
      jcasType.jcas.throwFeatMissing("iNVType", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_iNVType, v);}    
   
    
  /** setter for language - sets  
   * @generated */
  public void setLanguage(String v) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_language, v);}    
                                                  //*--------------*
  //* Feature: language

  /** setter for namePart - sets  
   * @generated */
  public void setNamePart(FSArray v) {
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_namePart, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for namePart - sets an indexed value - 
   * @generated */
  public void setNamePart(int i, NamePartType v) { 
    if (IndivNameVariationType_Type.featOkTst && ((IndivNameVariationType_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameVariationType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_namePart), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameVariationType_Type)jcasType).casFeatCode_namePart), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
}

    