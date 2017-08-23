

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
public class ProductType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ProductType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected ProductType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ProductType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ProductType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ProductType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for name - gets 
   * @generated */
  public NameType getName() {
    if (ProductType_Type.featOkTst && ((ProductType_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "net.myerichsen.gedcom.ProductType");
    return (NameType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProductType_Type)jcasType).casFeatCode_name)));}
    
  /** getter for productID - gets 
   * @generated */
  public String getProductID() {
    if (ProductType_Type.featOkTst && ((ProductType_Type)jcasType).casFeat_productID == null)
      jcasType.jcas.throwFeatMissing("productID", "net.myerichsen.gedcom.ProductType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ProductType_Type)jcasType).casFeatCode_productID);}
    
  //*--------------*
  //* Feature: productID

  /** getter for supplier - gets 
   * @generated */
  public SupplierType getSupplier() {
    if (ProductType_Type.featOkTst && ((ProductType_Type)jcasType).casFeat_supplier == null)
      jcasType.jcas.throwFeatMissing("supplier", "net.myerichsen.gedcom.ProductType");
    return (SupplierType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((ProductType_Type)jcasType).casFeatCode_supplier)));}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  //*--------------*
  //* Feature: version

  /** getter for version - gets 
   * @generated */
  public String getVersion() {
    if (ProductType_Type.featOkTst && ((ProductType_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "net.myerichsen.gedcom.ProductType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((ProductType_Type)jcasType).casFeatCode_version);}
    
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}    
   
    
  //*--------------*
  //* Feature: name

  /** setter for name - sets  
   * @generated */
  public void setName(NameType v) {
    if (ProductType_Type.featOkTst && ((ProductType_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "net.myerichsen.gedcom.ProductType");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProductType_Type)jcasType).casFeatCode_name, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for productID - sets  
   * @generated */
  public void setProductID(String v) {
    if (ProductType_Type.featOkTst && ((ProductType_Type)jcasType).casFeat_productID == null)
      jcasType.jcas.throwFeatMissing("productID", "net.myerichsen.gedcom.ProductType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ProductType_Type)jcasType).casFeatCode_productID, v);}    
   
    
  //*--------------*
  //* Feature: supplier

  /** setter for supplier - sets  
   * @generated */
  public void setSupplier(SupplierType v) {
    if (ProductType_Type.featOkTst && ((ProductType_Type)jcasType).casFeat_supplier == null)
      jcasType.jcas.throwFeatMissing("supplier", "net.myerichsen.gedcom.ProductType");
    jcasType.ll_cas.ll_setRefValue(addr, ((ProductType_Type)jcasType).casFeatCode_supplier, jcasType.ll_cas.ll_getFSRef(v));}    
                                                  /** setter for version - sets  
   * @generated */
  public void setVersion(String v) {
    if (ProductType_Type.featOkTst && ((ProductType_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "net.myerichsen.gedcom.ProductType");
    jcasType.ll_cas.ll_setStringValue(addr, ((ProductType_Type)jcasType).casFeatCode_version, v);}    
   
    
}

    