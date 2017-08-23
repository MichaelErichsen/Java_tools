

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:35 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class FamilyNbrType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(FamilyNbrType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected FamilyNbrType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public FamilyNbrType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public FamilyNbrType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public FamilyNbrType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (FamilyNbrType_Type.featOkTst && ((FamilyNbrType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.FamilyNbrType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FamilyNbrType_Type)jcasType).casFeatCode_id);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (FamilyNbrType_Type.featOkTst && ((FamilyNbrType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.FamilyNbrType");
    jcasType.ll_cas.ll_setStringValue(addr, ((FamilyNbrType_Type)jcasType).casFeatCode_id, v);}    
  }

    