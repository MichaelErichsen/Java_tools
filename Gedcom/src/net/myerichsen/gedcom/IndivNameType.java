

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
public class IndivNameType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(IndivNameType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected IndivNameType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public IndivNameType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public IndivNameType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public IndivNameType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for group - gets 
   * @generated */
  public StringArray getGroup() {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_group)));}
    
  /** indexed getter for group - gets an indexed value - 
   * @generated */
  public String getGroup(int i) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_group), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_group), i);}

  //*--------------*
  //* Feature: group

  /** getter for indivNameVariation - gets 
   * @generated */
  public FSArray getIndivNameVariation() {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_indivNameVariation == null)
      jcasType.jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.IndivNameType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indivNameVariation)));}
    
  /** indexed getter for indivNameVariation - gets an indexed value - 
   * @generated */
  public IndivNameVariationType getIndivNameVariation(int i) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_indivNameVariation == null)
      jcasType.jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.IndivNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indivNameVariation), i);
    return (IndivNameVariationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indivNameVariation), i)));}

  /** getter for indNameMethod - gets 
   * @generated */
  public String getIndNameMethod() {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_indNameMethod == null)
      jcasType.jcas.throwFeatMissing("indNameMethod", "net.myerichsen.gedcom.IndivNameType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indNameMethod);}
    
  /** getter for indNameType - gets 
   * @generated */
  public String getIndNameType() {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_indNameType == null)
      jcasType.jcas.throwFeatMissing("indNameType", "net.myerichsen.gedcom.IndivNameType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indNameType);}
    
  //*--------------*
  //* Feature: iNString

  /** getter for iNString - gets 
   * @generated */
  public StringArray getINString() {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_iNString == null)
      jcasType.jcas.throwFeatMissing("iNString", "net.myerichsen.gedcom.IndivNameType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_iNString)));}
    
  /** indexed getter for iNString - gets an indexed value - 
   * @generated */
  public String getINString(int i) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_iNString == null)
      jcasType.jcas.throwFeatMissing("iNString", "net.myerichsen.gedcom.IndivNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_iNString), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_iNString), i);}

  /** getter for language - gets 
   * @generated */
  public String getLanguage() {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.IndivNameType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_language);}
    
  /** getter for namePart - gets 
   * @generated */
  public FSArray getNamePart() {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_namePart)));}
    
  //*--------------*
  //* Feature: namePart

  /** indexed getter for namePart - gets an indexed value - 
   * @generated */
  public NamePartType getNamePart(int i) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_namePart), i);
    return (NamePartType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_namePart), i)));}

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
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_group), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_group), i, v);}
   
    
  //*--------------*
  //* Feature: indivNameVariation

  /** setter for group - sets  
   * @generated */
  public void setGroup(StringArray v) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_group, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for indivNameVariation - sets  
   * @generated */
  public void setIndivNameVariation(FSArray v) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_indivNameVariation == null)
      jcasType.jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.IndivNameType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indivNameVariation, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for indivNameVariation - sets an indexed value - 
   * @generated */
  public void setIndivNameVariation(int i, IndivNameVariationType v) { 
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_indivNameVariation == null)
      jcasType.jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.IndivNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indivNameVariation), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indivNameVariation), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for indNameMethod - sets  
   * @generated */
  public void setIndNameMethod(String v) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_indNameMethod == null)
      jcasType.jcas.throwFeatMissing("indNameMethod", "net.myerichsen.gedcom.IndivNameType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indNameMethod, v);}    
   
    
  //*--------------*
  //* Feature: indNameMethod

  /** setter for indNameType - sets  
   * @generated */
  public void setIndNameType(String v) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_indNameType == null)
      jcasType.jcas.throwFeatMissing("indNameType", "net.myerichsen.gedcom.IndivNameType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_indNameType, v);}    
   
    
  /** indexed setter for iNString - sets an indexed value - 
   * @generated */
  public void setINString(int i, String v) { 
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_iNString == null)
      jcasType.jcas.throwFeatMissing("iNString", "net.myerichsen.gedcom.IndivNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_iNString), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_iNString), i, v);}
   
    
  //*--------------*
  //* Feature: indNameType

  /** setter for iNString - sets  
   * @generated */
  public void setINString(StringArray v) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_iNString == null)
      jcasType.jcas.throwFeatMissing("iNString", "net.myerichsen.gedcom.IndivNameType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_iNString, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for language - sets  
   * @generated */
  public void setLanguage(String v) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.IndivNameType");
    jcasType.ll_cas.ll_setStringValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_language, v);}    
                                                  //*--------------*
  //* Feature: language

  /** setter for namePart - sets  
   * @generated */
  public void setNamePart(FSArray v) {
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameType");
    jcasType.ll_cas.ll_setRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_namePart, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for namePart - sets an indexed value - 
   * @generated */
  public void setNamePart(int i, NamePartType v) { 
    if (IndivNameType_Type.featOkTst && ((IndivNameType_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_namePart), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((IndivNameType_Type)jcasType).casFeatCode_namePart), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
}

    