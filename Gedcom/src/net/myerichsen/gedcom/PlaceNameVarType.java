

/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class PlaceNameVarType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(PlaceNameVarType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected PlaceNameVarType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PlaceNameVarType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PlaceNameVarType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PlaceNameVarType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for group - gets 
   * @generated */
  public StringArray getGroup() {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameVarType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_group)));}
    
  /** indexed getter for group - gets an indexed value - 
   * @generated */
  public String getGroup(int i) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_group), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_group), i);}

  //*--------------*
  //* Feature: group

  /** getter for language - gets 
   * @generated */
  public String getLanguage() {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.PlaceNameVarType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_language);}
    
  /** getter for placePart - gets 
   * @generated */
  public FSArray getPlacePart() {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameVarType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_placePart)));}
    
  /** indexed getter for placePart - gets an indexed value - 
   * @generated */
  public PlacePartType getPlacePart(int i) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_placePart), i);
    return (PlacePartType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_placePart), i)));}

  /** getter for pNVMethod - gets 
   * @generated */
  public String getPNVMethod() {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_pNVMethod == null)
      jcasType.jcas.throwFeatMissing("pNVMethod", "net.myerichsen.gedcom.PlaceNameVarType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVMethod);}
    
  //*--------------*
  //* Feature: pNVString

  /** getter for pNVString - gets 
   * @generated */
  public StringArray getPNVString() {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_pNVString == null)
      jcasType.jcas.throwFeatMissing("pNVString", "net.myerichsen.gedcom.PlaceNameVarType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVString)));}
    
  /** indexed getter for pNVString - gets an indexed value - 
   * @generated */
  public String getPNVString(int i) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_pNVString == null)
      jcasType.jcas.throwFeatMissing("pNVString", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVString), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVString), i);}

  /** getter for pNVType - gets 
   * @generated */
  public String getPNVType() {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_pNVType == null)
      jcasType.jcas.throwFeatMissing("pNVType", "net.myerichsen.gedcom.PlaceNameVarType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVType);}
    
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
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_group), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_group), i, v);}
   
    
  /** setter for group - sets  
   * @generated */
  public void setGroup(StringArray v) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_group, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for language - sets  
   * @generated */
  public void setLanguage(String v) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_language, v);}    
   
    
  //*--------------*
  //* Feature: language

  /** setter for placePart - sets  
   * @generated */
  public void setPlacePart(FSArray v) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_placePart, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for placePart - sets an indexed value - 
   * @generated */
  public void setPlacePart(int i, PlacePartType v) { 
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_placePart), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_placePart), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: pNVMethod

  /** setter for pNVMethod - sets  
   * @generated */
  public void setPNVMethod(String v) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_pNVMethod == null)
      jcasType.jcas.throwFeatMissing("pNVMethod", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVMethod, v);}    
   
    
  /** indexed setter for pNVString - sets an indexed value - 
   * @generated */
  public void setPNVString(int i, String v) { 
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_pNVString == null)
      jcasType.jcas.throwFeatMissing("pNVString", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVString), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVString), i, v);}
   
    
  //*--------------*
  //* Feature: pNVType

  /** setter for pNVString - sets  
   * @generated */
  public void setPNVString(StringArray v) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_pNVString == null)
      jcasType.jcas.throwFeatMissing("pNVString", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVString, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for pNVType - sets  
   * @generated */
  public void setPNVType(String v) {
    if (PlaceNameVarType_Type.featOkTst && ((PlaceNameVarType_Type)jcasType).casFeat_pNVType == null)
      jcasType.jcas.throwFeatMissing("pNVType", "net.myerichsen.gedcom.PlaceNameVarType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlaceNameVarType_Type)jcasType).casFeatCode_pNVType, v);}    
  }

    