

/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:39 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class WifeMothType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(WifeMothType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected WifeMothType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public WifeMothType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public WifeMothType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public WifeMothType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for familyNbr - gets 
   * @generated */
  public FamilyNbrType getFamilyNbr() {
    if (WifeMothType_Type.featOkTst && ((WifeMothType_Type)jcasType).casFeat_familyNbr == null)
      jcasType.jcas.throwFeatMissing("familyNbr", "net.myerichsen.gedcom.WifeMothType");
    return (FamilyNbrType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WifeMothType_Type)jcasType).casFeatCode_familyNbr)));}
    
  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (WifeMothType_Type.featOkTst && ((WifeMothType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.WifeMothType");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((WifeMothType_Type)jcasType).casFeatCode_link)));}
    
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
  //* Feature: familyNbr

  /** setter for familyNbr - sets  
   * @generated */
  public void setFamilyNbr(FamilyNbrType v) {
    if (WifeMothType_Type.featOkTst && ((WifeMothType_Type)jcasType).casFeat_familyNbr == null)
      jcasType.jcas.throwFeatMissing("familyNbr", "net.myerichsen.gedcom.WifeMothType");
    jcasType.ll_cas.ll_setRefValue(addr, ((WifeMothType_Type)jcasType).casFeatCode_familyNbr, jcasType.ll_cas.ll_getFSRef(v));}    
                                                  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (WifeMothType_Type.featOkTst && ((WifeMothType_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.WifeMothType");
    jcasType.ll_cas.ll_setRefValue(addr, ((WifeMothType_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
}

    