

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
public class PlaceNameType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(PlaceNameType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected PlaceNameType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PlaceNameType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PlaceNameType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PlaceNameType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for group - gets 
   * @generated */
  public StringArray getGroup() {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_group)));}
    
  /** indexed getter for group - gets an indexed value - 
   * @generated */
  public String getGroup(int i) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_group), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_group), i);}

  //*--------------*
  //* Feature: group

  /** getter for language - gets 
   * @generated */
  public String getLanguage() {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.PlaceNameType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_language);}
    
  /** getter for placePart - gets 
   * @generated */
  public FSArray getPlacePart() {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_placePart)));}
    
  /** indexed getter for placePart - gets an indexed value - 
   * @generated */
  public PlacePartType getPlacePart(int i) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_placePart), i);
    return (PlacePartType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_placePart), i)));}

  /** getter for pNMethod - gets 
   * @generated */
  public String getPNMethod() {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_pNMethod == null)
      jcasType.jcas.throwFeatMissing("pNMethod", "net.myerichsen.gedcom.PlaceNameType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNMethod);}
    
  //*--------------*
  //* Feature: pNString

  /** getter for pNString - gets 
   * @generated */
  public StringArray getPNString() {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_pNString == null)
      jcasType.jcas.throwFeatMissing("pNString", "net.myerichsen.gedcom.PlaceNameType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNString)));}
    
  /** indexed getter for pNString - gets an indexed value - 
   * @generated */
  public String getPNString(int i) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_pNString == null)
      jcasType.jcas.throwFeatMissing("pNString", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNString), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNString), i);}

  /** getter for pNType - gets 
   * @generated */
  public String getPNType() {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_pNType == null)
      jcasType.jcas.throwFeatMissing("pNType", "net.myerichsen.gedcom.PlaceNameType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNType);}
    
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
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_group), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_group), i, v);}
   
    
  /** setter for group - sets  
   * @generated */
  public void setGroup(StringArray v) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_group, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for language - sets  
   * @generated */
  public void setLanguage(String v) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_language, v);}    
   
    
  //*--------------*
  //* Feature: language

  /** setter for placePart - sets  
   * @generated */
  public void setPlacePart(FSArray v) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_placePart, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for placePart - sets an indexed value - 
   * @generated */
  public void setPlacePart(int i, PlacePartType v) { 
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_placePart), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_placePart), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: pNMethod

  /** setter for pNMethod - sets  
   * @generated */
  public void setPNMethod(String v) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_pNMethod == null)
      jcasType.jcas.throwFeatMissing("pNMethod", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNMethod, v);}    
   
    
  /** indexed setter for pNString - sets an indexed value - 
   * @generated */
  public void setPNString(int i, String v) { 
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_pNString == null)
      jcasType.jcas.throwFeatMissing("pNString", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNString), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNString), i, v);}
   
    
  //*--------------*
  //* Feature: pNType

  /** setter for pNString - sets  
   * @generated */
  public void setPNString(StringArray v) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_pNString == null)
      jcasType.jcas.throwFeatMissing("pNString", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNString, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for pNType - sets  
   * @generated */
  public void setPNType(String v) {
    if (PlaceNameType_Type.featOkTst && ((PlaceNameType_Type)jcasType).casFeat_pNType == null)
      jcasType.jcas.throwFeatMissing("pNType", "net.myerichsen.gedcom.PlaceNameType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlaceNameType_Type)jcasType).casFeatCode_pNType, v);}    
  }

    