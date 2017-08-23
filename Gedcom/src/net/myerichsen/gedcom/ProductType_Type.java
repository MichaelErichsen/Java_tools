
/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Apr 10 09:47:38 CEST 2013
 * @generated */
public class ProductType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ProductType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ProductType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ProductType(addr, ProductType_Type.this);
  			   ProductType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ProductType(addr, ProductType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = ProductType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.ProductType");
  /** @generated */
  final Feature casFeat_productID;
 
  /** @generated */
  final int     casFeatCode_productID;
  /** @generated */
  final Feature casFeat_version;
  /** @generated */
  final int     casFeatCode_version;
  /** @generated */
  final Feature casFeat_name;
    
  
 
  /** @generated */
  final int     casFeatCode_name;
  /** @generated */
  final Feature casFeat_supplier;
  /** @generated */
  final int     casFeatCode_supplier;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ProductType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_productID = jcas.getRequiredFeatureDE(casType, "productID", "uima.cas.String", featOkTst);
    casFeatCode_productID  = (null == casFeat_productID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_productID).getCode();

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.String", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "net.myerichsen.gedcom.NameType", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_supplier = jcas.getRequiredFeatureDE(casType, "supplier", "net.myerichsen.gedcom.SupplierType", featOkTst);
    casFeatCode_supplier  = (null == casFeat_supplier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_supplier).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.ProductType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_name);
  }
  /** @generated */ 
  public String getProductID(int addr) {
        if (featOkTst && casFeat_productID == null)
      jcas.throwFeatMissing("productID", "net.myerichsen.gedcom.ProductType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_productID);
  }
  /** @generated */ 
  public int getSupplier(int addr) {
        if (featOkTst && casFeat_supplier == null)
      jcas.throwFeatMissing("supplier", "net.myerichsen.gedcom.ProductType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_supplier);
  }
  /** @generated */ 
  public String getVersion(int addr) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "net.myerichsen.gedcom.ProductType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_version);
  }
  /** @generated */    
  public void setName(int addr, int v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.ProductType");
    ll_cas.ll_setRefValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */    
  public void setProductID(int addr, String v) {
        if (featOkTst && casFeat_productID == null)
      jcas.throwFeatMissing("productID", "net.myerichsen.gedcom.ProductType");
    ll_cas.ll_setStringValue(addr, casFeatCode_productID, v);}
    
  
 
  /** @generated */    
  public void setSupplier(int addr, int v) {
        if (featOkTst && casFeat_supplier == null)
      jcas.throwFeatMissing("supplier", "net.myerichsen.gedcom.ProductType");
    ll_cas.ll_setRefValue(addr, casFeatCode_supplier, v);}
    
  



  /** @generated */    
  public void setVersion(int addr, String v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "net.myerichsen.gedcom.ProductType");
    ll_cas.ll_setStringValue(addr, casFeatCode_version, v);}
    
  
 
}



    