
/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
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
 * Updated by JCasGen Wed Apr 10 09:47:35 CEST 2013
 * @generated */
public class FileCreationType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (FileCreationType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = FileCreationType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new FileCreationType(addr, FileCreationType_Type.this);
  			   FileCreationType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new FileCreationType(addr, FileCreationType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = FileCreationType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.FileCreationType");
  /** @generated */
  final Feature casFeat_product;
 
  /** @generated */
  final int     casFeatCode_product;
  /** @generated */
  final Feature casFeat_copyright;
  /** @generated */
  final int     casFeatCode_copyright;
  /** @generated */
  final Feature casFeat_fileCreationDate;
    
  
 
  /** @generated */
  final int     casFeatCode_fileCreationDate;
  /** @generated */
  final Feature casFeat_fileCreationTime;
  /** @generated */
  final int     casFeatCode_fileCreationTime;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public FileCreationType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_product = jcas.getRequiredFeatureDE(casType, "product", "net.myerichsen.gedcom.ProductType", featOkTst);
    casFeatCode_product  = (null == casFeat_product) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_product).getCode();

 
    casFeat_copyright = jcas.getRequiredFeatureDE(casType, "copyright", "uima.cas.String", featOkTst);
    casFeatCode_copyright  = (null == casFeat_copyright) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_copyright).getCode();

 
    casFeat_fileCreationDate = jcas.getRequiredFeatureDE(casType, "fileCreationDate", "uima.cas.String", featOkTst);
    casFeatCode_fileCreationDate  = (null == casFeat_fileCreationDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fileCreationDate).getCode();

 
    casFeat_fileCreationTime = jcas.getRequiredFeatureDE(casType, "fileCreationTime", "uima.cas.String", featOkTst);
    casFeatCode_fileCreationTime  = (null == casFeat_fileCreationTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fileCreationTime).getCode();

  }
  /** @generated */ 
  public String getCopyright(int addr) {
        if (featOkTst && casFeat_copyright == null)
      jcas.throwFeatMissing("copyright", "net.myerichsen.gedcom.FileCreationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_copyright);
  }
  /** @generated */ 
  public String getFileCreationDate(int addr) {
        if (featOkTst && casFeat_fileCreationDate == null)
      jcas.throwFeatMissing("fileCreationDate", "net.myerichsen.gedcom.FileCreationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fileCreationDate);
  }
  /** @generated */ 
  public String getFileCreationTime(int addr) {
        if (featOkTst && casFeat_fileCreationTime == null)
      jcas.throwFeatMissing("fileCreationTime", "net.myerichsen.gedcom.FileCreationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_fileCreationTime);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getProduct(int addr) {
        if (featOkTst && casFeat_product == null)
      jcas.throwFeatMissing("product", "net.myerichsen.gedcom.FileCreationType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_product);
  }
  /** @generated */    
  public void setCopyright(int addr, String v) {
        if (featOkTst && casFeat_copyright == null)
      jcas.throwFeatMissing("copyright", "net.myerichsen.gedcom.FileCreationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_copyright, v);}
    
  
 
  /** @generated */    
  public void setFileCreationDate(int addr, String v) {
        if (featOkTst && casFeat_fileCreationDate == null)
      jcas.throwFeatMissing("fileCreationDate", "net.myerichsen.gedcom.FileCreationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_fileCreationDate, v);}
    
  
 
  /** @generated */    
  public void setFileCreationTime(int addr, String v) {
        if (featOkTst && casFeat_fileCreationTime == null)
      jcas.throwFeatMissing("fileCreationTime", "net.myerichsen.gedcom.FileCreationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_fileCreationTime, v);}
    
  



  /** @generated */    
  public void setProduct(int addr, int v) {
        if (featOkTst && casFeat_product == null)
      jcas.throwFeatMissing("product", "net.myerichsen.gedcom.FileCreationType");
    ll_cas.ll_setRefValue(addr, casFeatCode_product, v);}
    
  
 
}



    