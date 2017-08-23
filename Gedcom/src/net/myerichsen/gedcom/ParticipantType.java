

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
public class ParticipantType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ParticipantType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected ParticipantType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ParticipantType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ParticipantType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ParticipantType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for age - gets 
   * @generated */
  public String getAge() {
    if (ParticipantType_Type.featOkTst && ((ParticipantType_Type)jcasType).casFeat_age == null)
      jcasType.jcas.throwFeatMissing("age", "net.myerichsen.gedcom.ParticipantType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ParticipantType_Type)jcasType).casFeatCode_age);}
    
  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (ParticipantType_Type.featOkTst && ((ParticipantType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.ParticipantType");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ParticipantType_Type)jcasType).casFeatCode_link)));}
    
  //*--------------*
  //* Feature: link

  /** getter for living - gets 
   * @generated */
  public String getLiving() {
    if (ParticipantType_Type.featOkTst && ((ParticipantType_Type)jcasType).casFeat_living == null)
      jcasType.jcas.throwFeatMissing("living", "net.myerichsen.gedcom.ParticipantType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ParticipantType_Type)jcasType).casFeatCode_living);}
    
  /** getter for role - gets 
   * @generated */
  public String getRole() {
    if (ParticipantType_Type.featOkTst && ((ParticipantType_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "net.myerichsen.gedcom.ParticipantType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ParticipantType_Type)jcasType).casFeatCode_role);}
    
  //*--------------*
  //* Feature: role

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: living

  /** setter for age - sets  
   * @generated */
  public void setAge(String v) {
    if (ParticipantType_Type.featOkTst && ((ParticipantType_Type)jcasType).casFeat_age == null)
      jcasType.jcas.throwFeatMissing("age", "net.myerichsen.gedcom.ParticipantType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ParticipantType_Type)jcasType).casFeatCode_age, v);}    
                                                  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (ParticipantType_Type.featOkTst && ((ParticipantType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.ParticipantType");
    jcasType.ll_cas.ll_setRefValue(addr, ((ParticipantType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: age

  /** setter for living - sets  
   * @generated */
  public void setLiving(String v) {
    if (ParticipantType_Type.featOkTst && ((ParticipantType_Type)jcasType).casFeat_living == null)
      jcasType.jcas.throwFeatMissing("living", "net.myerichsen.gedcom.ParticipantType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ParticipantType_Type)jcasType).casFeatCode_living, v);}    
   
    
  /** setter for role - sets  
   * @generated */
  public void setRole(String v) {
    if (ParticipantType_Type.featOkTst && ((ParticipantType_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "net.myerichsen.gedcom.ParticipantType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ParticipantType_Type)jcasType).casFeatCode_role, v);}    
   
    
}

    