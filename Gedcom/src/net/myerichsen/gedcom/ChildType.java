

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:32 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class ChildType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ChildType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected ChildType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ChildType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ChildType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ChildType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for childNbr - gets 
   * @generated */
  public String getChildNbr() {
    if (ChildType_Type.featOkTst && ((ChildType_Type)jcasType).casFeat_childNbr == null)
      jcasType.jcas.throwFeatMissing("childNbr", "net.myerichsen.gedcom.ChildType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ChildType_Type)jcasType).casFeatCode_childNbr);}
    
  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (ChildType_Type.featOkTst && ((ChildType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.ChildType");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ChildType_Type)jcasType).casFeatCode_link)));}
    
  //*--------------*
  //* Feature: link

  /** getter for relToFath - gets 
   * @generated */
  public String getRelToFath() {
    if (ChildType_Type.featOkTst && ((ChildType_Type)jcasType).casFeat_relToFath == null)
      jcasType.jcas.throwFeatMissing("relToFath", "net.myerichsen.gedcom.ChildType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ChildType_Type)jcasType).casFeatCode_relToFath);}
    
  /** getter for relToMoth - gets 
   * @generated */
  public String getRelToMoth() {
    if (ChildType_Type.featOkTst && ((ChildType_Type)jcasType).casFeat_relToMoth == null)
      jcasType.jcas.throwFeatMissing("relToMoth", "net.myerichsen.gedcom.ChildType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ChildType_Type)jcasType).casFeatCode_relToMoth);}
    
  //*--------------*
  //* Feature: childNbr

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: relToFath

  /** setter for childNbr - sets  
   * @generated */
  public void setChildNbr(String v) {
    if (ChildType_Type.featOkTst && ((ChildType_Type)jcasType).casFeat_childNbr == null)
      jcasType.jcas.throwFeatMissing("childNbr", "net.myerichsen.gedcom.ChildType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ChildType_Type)jcasType).casFeatCode_childNbr, v);}    
   
    
  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (ChildType_Type.featOkTst && ((ChildType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.ChildType");
    jcasType.ll_cas.ll_setRefValue(addr, ((ChildType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relToMoth

  /** setter for relToFath - sets  
   * @generated */
  public void setRelToFath(String v) {
    if (ChildType_Type.featOkTst && ((ChildType_Type)jcasType).casFeat_relToFath == null)
      jcasType.jcas.throwFeatMissing("relToFath", "net.myerichsen.gedcom.ChildType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ChildType_Type)jcasType).casFeatCode_relToFath, v);}    
   
    
  /** setter for relToMoth - sets  
   * @generated */
  public void setRelToMoth(String v) {
    if (ChildType_Type.featOkTst && ((ChildType_Type)jcasType).casFeat_relToMoth == null)
      jcasType.jcas.throwFeatMissing("relToMoth", "net.myerichsen.gedcom.ChildType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ChildType_Type)jcasType).casFeatCode_relToMoth, v);}    
  }

    