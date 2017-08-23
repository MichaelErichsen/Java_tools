
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
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * @generated */
public class NameType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NameType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NameType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NameType(addr, NameType_Type.this);
  			   NameType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NameType(addr, NameType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = NameType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.NameType");
  /** @generated */
  final Feature casFeat_language;
 
  /** @generated */
  final int     casFeatCode_language;
  /** @generated */
  final Feature casFeat_nType;
  /** @generated */
  final int     casFeatCode_nType;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NameType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_nType = jcas.getRequiredFeatureDE(casType, "nType", "net.myerichsen.gedcom.NTypeType", featOkTst);
    casFeatCode_nType  = (null == casFeat_nType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nType).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.NameType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated */ 
  public String getNType(int addr) {
        if (featOkTst && casFeat_nType == null)
      jcas.throwFeatMissing("nType", "net.myerichsen.gedcom.NameType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nType);
  }
  /** @generated */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.NameType");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */    
  public void setNType(int addr, String v) {
        if (featOkTst && casFeat_nType == null)
      jcas.throwFeatMissing("nType", "net.myerichsen.gedcom.NameType");
    ll_cas.ll_setStringValue(addr, casFeatCode_nType, v);}
    
  



}



    