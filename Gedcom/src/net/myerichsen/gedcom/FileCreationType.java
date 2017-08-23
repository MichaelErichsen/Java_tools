

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
public class FileCreationType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(FileCreationType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected FileCreationType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public FileCreationType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public FileCreationType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public FileCreationType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for copyright - gets 
   * @generated */
  public String getCopyright() {
    if (FileCreationType_Type.featOkTst && ((FileCreationType_Type)jcasType).casFeat_copyright == null)
      jcasType.jcas.throwFeatMissing("copyright", "net.myerichsen.gedcom.FileCreationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FileCreationType_Type)jcasType).casFeatCode_copyright);}
    
  /** getter for fileCreationDate - gets 
   * @generated */
  public String getFileCreationDate() {
    if (FileCreationType_Type.featOkTst && ((FileCreationType_Type)jcasType).casFeat_fileCreationDate == null)
      jcasType.jcas.throwFeatMissing("fileCreationDate", "net.myerichsen.gedcom.FileCreationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FileCreationType_Type)jcasType).casFeatCode_fileCreationDate);}
    
  //*--------------*
  //* Feature: product

  /** getter for fileCreationTime - gets 
   * @generated */
  public String getFileCreationTime() {
    if (FileCreationType_Type.featOkTst && ((FileCreationType_Type)jcasType).casFeat_fileCreationTime == null)
      jcasType.jcas.throwFeatMissing("fileCreationTime", "net.myerichsen.gedcom.FileCreationType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((FileCreationType_Type)jcasType).casFeatCode_fileCreationTime);}
    
  /** getter for product - gets 
   * @generated */
  public ProductType getProduct() {
    if (FileCreationType_Type.featOkTst && ((FileCreationType_Type)jcasType).casFeat_product == null)
      jcasType.jcas.throwFeatMissing("product", "net.myerichsen.gedcom.FileCreationType");
    return (ProductType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((FileCreationType_Type)jcasType).casFeatCode_product)));}
    
  //*--------------*
  //* Feature: copyright

  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: fileCreationDate

  /** setter for copyright - sets  
   * @generated */
  public void setCopyright(String v) {
    if (FileCreationType_Type.featOkTst && ((FileCreationType_Type)jcasType).casFeat_copyright == null)
      jcasType.jcas.throwFeatMissing("copyright", "net.myerichsen.gedcom.FileCreationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((FileCreationType_Type)jcasType).casFeatCode_copyright, v);}    
   
    
  /** setter for fileCreationDate - sets  
   * @generated */
  public void setFileCreationDate(String v) {
    if (FileCreationType_Type.featOkTst && ((FileCreationType_Type)jcasType).casFeat_fileCreationDate == null)
      jcasType.jcas.throwFeatMissing("fileCreationDate", "net.myerichsen.gedcom.FileCreationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((FileCreationType_Type)jcasType).casFeatCode_fileCreationDate, v);}    
   
    
  //*--------------*
  //* Feature: fileCreationTime

  /** setter for fileCreationTime - sets  
   * @generated */
  public void setFileCreationTime(String v) {
    if (FileCreationType_Type.featOkTst && ((FileCreationType_Type)jcasType).casFeat_fileCreationTime == null)
      jcasType.jcas.throwFeatMissing("fileCreationTime", "net.myerichsen.gedcom.FileCreationType");
    jcasType.ll_cas.ll_setStringValue(addr, ((FileCreationType_Type)jcasType).casFeatCode_fileCreationTime, v);}    
                                                  /** setter for product - sets  
   * @generated */
  public void setProduct(ProductType v) {
    if (FileCreationType_Type.featOkTst && ((FileCreationType_Type)jcasType).casFeat_product == null)
      jcasType.jcas.throwFeatMissing("product", "net.myerichsen.gedcom.FileCreationType");
    jcasType.ll_cas.ll_setRefValue(addr, ((FileCreationType_Type)jcasType).casFeatCode_product, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
}

    