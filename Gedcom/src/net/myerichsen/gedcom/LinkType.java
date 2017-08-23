

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class LinkType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(LinkType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected LinkType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public LinkType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public LinkType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public LinkType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for ref - gets 
   * @generated */
  public String getRef() {
    if (LinkType_Type.featOkTst && ((LinkType_Type)jcasType).casFeat_ref == null)
      jcasType.jcas.throwFeatMissing("ref", "net.myerichsen.gedcom.LinkType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LinkType_Type)jcasType).casFeatCode_ref);}
    
  /** getter for target - gets 
   * @generated */
  public String getTarget() {
    if (LinkType_Type.featOkTst && ((LinkType_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "net.myerichsen.gedcom.LinkType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LinkType_Type)jcasType).casFeatCode_target);}
    
  //*--------------*
  //* Feature: ref

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: target

  /** setter for ref - sets  
   * @generated */
  public void setRef(String v) {
    if (LinkType_Type.featOkTst && ((LinkType_Type)jcasType).casFeat_ref == null)
      jcasType.jcas.throwFeatMissing("ref", "net.myerichsen.gedcom.LinkType");
    jcasType.ll_cas.ll_setStringValue(addr, ((LinkType_Type)jcasType).casFeatCode_ref, v);}    
   
    
  /** setter for target - sets  
   * @generated */
  public void setTarget(String v) {
    if (LinkType_Type.featOkTst && ((LinkType_Type)jcasType).casFeat_target == null)
      jcasType.jcas.throwFeatMissing("target", "net.myerichsen.gedcom.LinkType");
    jcasType.ll_cas.ll_setStringValue(addr, ((LinkType_Type)jcasType).casFeatCode_target, v);}    
  }

    