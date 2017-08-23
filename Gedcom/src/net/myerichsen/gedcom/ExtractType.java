

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
public class ExtractType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ExtractType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected ExtractType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ExtractType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ExtractType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ExtractType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for language - gets 
   * @generated */
  public String getLanguage() {
    if (ExtractType_Type.featOkTst && ((ExtractType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.ExtractType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ExtractType_Type)jcasType).casFeatCode_language);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for language - sets  
   * @generated */
  public void setLanguage(String v) {
    if (ExtractType_Type.featOkTst && ((ExtractType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.ExtractType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ExtractType_Type)jcasType).casFeatCode_language, v);}    
  }

    