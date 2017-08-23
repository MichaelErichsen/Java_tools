

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:30 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class AddrLineType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(AddrLineType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected AddrLineType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AddrLineType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AddrLineType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AddrLineType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for addressee - gets 
   * @generated */
  public StringArray getAddressee() {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_addressee == null)
      jcasType.jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.AddrLineType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_addressee)));}
    
  /** indexed getter for addressee - gets an indexed value - 
   * @generated */
  public String getAddressee(int i) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_addressee == null)
      jcasType.jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_addressee), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_addressee), i);}

  //*--------------*
  //* Feature: mixed

  /** getter for aLString - gets 
   * @generated */
  public StringArray getALString() {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_aLString == null)
      jcasType.jcas.throwFeatMissing("aLString", "net.myerichsen.gedcom.AddrLineType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_aLString)));}
    
  /** indexed getter for aLString - gets an indexed value - 
   * @generated */
  public String getALString(int i) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_aLString == null)
      jcasType.jcas.throwFeatMissing("aLString", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_aLString), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_aLString), i);}

  /** getter for group - gets 
   * @generated */
  public StringArray getGroup() {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.AddrLineType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_group)));}
    
  /** indexed getter for group - gets an indexed value - 
   * @generated */
  public String getGroup(int i) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_group), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_group), i);}

  //*--------------*
  //* Feature: group

  /** getter for mixed - gets 
   * @generated */
  public StringArray getMixed() {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_mixed == null)
      jcasType.jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.AddrLineType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_mixed)));}
    
  /** indexed getter for mixed - gets an indexed value - 
   * @generated */
  public String getMixed(int i) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_mixed == null)
      jcasType.jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_mixed), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_mixed), i);}

  /** getter for placePart - gets 
   * @generated */
  public FSArray getPlacePart() {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.AddrLineType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_placePart)));}
    
  /** indexed getter for placePart - gets an indexed value - 
   * @generated */
  public PlacePartType getPlacePart(int i) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_placePart), i);
    return (PlacePartType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_placePart), i)));}

  //*--------------*
  //* Feature: aLString

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
    
  /** indexed setter for addressee - sets an indexed value - 
   * @generated */
  public void setAddressee(int i, String v) { 
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_addressee == null)
      jcasType.jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_addressee), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_addressee), i, v);}
   
    
  /** setter for addressee - sets  
   * @generated */
  public void setAddressee(StringArray v) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_addressee == null)
      jcasType.jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.AddrLineType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_addressee, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: addressee

  /** indexed setter for aLString - sets an indexed value - 
   * @generated */
  public void setALString(int i, String v) { 
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_aLString == null)
      jcasType.jcas.throwFeatMissing("aLString", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_aLString), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_aLString), i, v);}
   
    
  /** setter for aLString - sets  
   * @generated */
  public void setALString(StringArray v) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_aLString == null)
      jcasType.jcas.throwFeatMissing("aLString", "net.myerichsen.gedcom.AddrLineType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_aLString, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for group - sets an indexed value - 
   * @generated */
  public void setGroup(int i, String v) { 
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_group), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_group), i, v);}
   
    
  /** setter for group - sets  
   * @generated */
  public void setGroup(StringArray v) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_group == null)
      jcasType.jcas.throwFeatMissing("group", "net.myerichsen.gedcom.AddrLineType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_group, jcasType.ll_cas.ll_getFSRef(v));}    
    
  //*--------------*
  //* Feature: placePart

  /** indexed setter for mixed - sets an indexed value - 
   * @generated */
  public void setMixed(int i, String v) { 
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_mixed == null)
      jcasType.jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_mixed), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_mixed), i, v);}
   
    
  /** setter for mixed - sets  
   * @generated */
  public void setMixed(StringArray v) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_mixed == null)
      jcasType.jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.AddrLineType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_mixed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for placePart - sets  
   * @generated */
  public void setPlacePart(FSArray v) {
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.AddrLineType");
    jcasType.ll_cas.ll_setRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_placePart, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for placePart - sets an indexed value - 
   * @generated */
  public void setPlacePart(int i, PlacePartType v) { 
    if (AddrLineType_Type.featOkTst && ((AddrLineType_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.AddrLineType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_placePart), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AddrLineType_Type)jcasType).casFeatCode_placePart), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    