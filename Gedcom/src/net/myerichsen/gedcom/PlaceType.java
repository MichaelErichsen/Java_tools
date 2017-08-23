

/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:38 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class PlaceType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(PlaceType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected PlaceType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public PlaceType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public PlaceType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public PlaceType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for coordinates - gets 
   * @generated */
  public String getCoordinates() {
    if (PlaceType_Type.featOkTst && ((PlaceType_Type)jcasType).casFeat_coordinates == null)
      jcasType.jcas.throwFeatMissing("coordinates", "net.myerichsen.gedcom.PlaceType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((PlaceType_Type)jcasType).casFeatCode_coordinates);}
    
  /** getter for placeName - gets 
   * @generated */
  public PlaceNameType getPlaceName() {
    if (PlaceType_Type.featOkTst && ((PlaceType_Type)jcasType).casFeat_placeName == null)
      jcasType.jcas.throwFeatMissing("placeName", "net.myerichsen.gedcom.PlaceType");
    return (PlaceNameType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceType_Type)jcasType).casFeatCode_placeName)));}
    
  //*--------------*
  //* Feature: placeName

  /** getter for placeNameVar - gets 
   * @generated */
  public FSArray getPlaceNameVar() {
    if (PlaceType_Type.featOkTst && ((PlaceType_Type)jcasType).casFeat_placeNameVar == null)
      jcasType.jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.PlaceType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceType_Type)jcasType).casFeatCode_placeNameVar)));}
    
  /** indexed getter for placeNameVar - gets an indexed value - 
   * @generated */
  public PlaceNameVarType getPlaceNameVar(int i) {
    if (PlaceType_Type.featOkTst && ((PlaceType_Type)jcasType).casFeat_placeNameVar == null)
      jcasType.jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.PlaceType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceType_Type)jcasType).casFeatCode_placeNameVar), i);
    return (PlaceNameVarType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceType_Type)jcasType).casFeatCode_placeNameVar), i)));}

  //*--------------*
  //* Feature: coordinates

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: placeNameVar

  /** setter for coordinates - sets  
   * @generated */
  public void setCoordinates(String v) {
    if (PlaceType_Type.featOkTst && ((PlaceType_Type)jcasType).casFeat_coordinates == null)
      jcasType.jcas.throwFeatMissing("coordinates", "net.myerichsen.gedcom.PlaceType");
    jcasType.ll_cas.ll_setStringValue(addr, ((PlaceType_Type)jcasType).casFeatCode_coordinates, v);}    
   
    
  /** setter for placeName - sets  
   * @generated */
  public void setPlaceName(PlaceNameType v) {
    if (PlaceType_Type.featOkTst && ((PlaceType_Type)jcasType).casFeat_placeName == null)
      jcasType.jcas.throwFeatMissing("placeName", "net.myerichsen.gedcom.PlaceType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PlaceType_Type)jcasType).casFeatCode_placeName, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for placeNameVar - sets  
   * @generated */
  public void setPlaceNameVar(FSArray v) {
    if (PlaceType_Type.featOkTst && ((PlaceType_Type)jcasType).casFeat_placeNameVar == null)
      jcasType.jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.PlaceType");
    jcasType.ll_cas.ll_setRefValue(addr, ((PlaceType_Type)jcasType).casFeatCode_placeNameVar, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for placeNameVar - sets an indexed value - 
   * @generated */
  public void setPlaceNameVar(int i, PlaceNameVarType v) { 
    if (PlaceType_Type.featOkTst && ((PlaceType_Type)jcasType).casFeat_placeNameVar == null)
      jcasType.jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.PlaceType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceType_Type)jcasType).casFeatCode_placeNameVar), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((PlaceType_Type)jcasType).casFeatCode_placeNameVar), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    