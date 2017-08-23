

/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:38 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class RepositoryType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(RepositoryType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected RepositoryType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public RepositoryType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public RepositoryType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public RepositoryType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for callNbr - gets 
   * @generated */
  public String getCallNbr() {
    if (RepositoryType_Type.featOkTst && ((RepositoryType_Type)jcasType).casFeat_callNbr == null)
      jcasType.jcas.throwFeatMissing("callNbr", "net.myerichsen.gedcom.RepositoryType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((RepositoryType_Type)jcasType).casFeatCode_callNbr);}
    
  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (RepositoryType_Type.featOkTst && ((RepositoryType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.RepositoryType");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((RepositoryType_Type)jcasType).casFeatCode_link)));}
    
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
  //* Feature: callNbr

  /** setter for callNbr - sets  
   * @generated */
  public void setCallNbr(String v) {
    if (RepositoryType_Type.featOkTst && ((RepositoryType_Type)jcasType).casFeat_callNbr == null)
      jcasType.jcas.throwFeatMissing("callNbr", "net.myerichsen.gedcom.RepositoryType");
    jcasType.ll_cas.ll_setStringValue(addr, ((RepositoryType_Type)jcasType).casFeatCode_callNbr, v);}    
                                                  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (RepositoryType_Type.featOkTst && ((RepositoryType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.RepositoryType");
    jcasType.ll_cas.ll_setRefValue(addr, ((RepositoryType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
}

    