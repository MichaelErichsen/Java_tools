

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
public class SubmitterType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(SubmitterType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected SubmitterType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SubmitterType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SubmitterType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SubmitterType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (SubmitterType_Type.featOkTst && ((SubmitterType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.SubmitterType");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SubmitterType_Type)jcasType).casFeatCode_link)));}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (SubmitterType_Type.featOkTst && ((SubmitterType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.SubmitterType");
    jcasType.ll_cas.ll_setRefValue(addr, ((SubmitterType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    