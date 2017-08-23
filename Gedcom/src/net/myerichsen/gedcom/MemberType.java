

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
public class MemberType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(MemberType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected MemberType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MemberType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MemberType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public MemberType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (MemberType_Type.featOkTst && ((MemberType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.MemberType");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MemberType_Type)jcasType).casFeatCode_link)));}
    
  /** getter for role - gets 
   * @generated */
  public String getRole() {
    if (MemberType_Type.featOkTst && ((MemberType_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "net.myerichsen.gedcom.MemberType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((MemberType_Type)jcasType).casFeatCode_role);}
    
  //*--------------*
  //* Feature: link

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: role

  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (MemberType_Type.featOkTst && ((MemberType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.MemberType");
    jcasType.ll_cas.ll_setRefValue(addr, ((MemberType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for role - sets  
   * @generated */
  public void setRole(String v) {
    if (MemberType_Type.featOkTst && ((MemberType_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "net.myerichsen.gedcom.MemberType");
    jcasType.ll_cas.ll_setStringValue(addr, ((MemberType_Type)jcasType).casFeatCode_role, v);}    
  }

    