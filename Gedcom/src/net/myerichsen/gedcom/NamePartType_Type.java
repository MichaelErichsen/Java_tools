
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
public class NamePartType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NamePartType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NamePartType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NamePartType(addr, NamePartType_Type.this);
  			   NamePartType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NamePartType(addr, NamePartType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = NamePartType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.NamePartType");
  /** @generated */
  final Feature casFeat_nPLevel;
 
  /** @generated */
  final int     casFeatCode_nPLevel;
  /** @generated */
  final Feature casFeat_nPType;
  /** @generated */
  final int     casFeatCode_nPType;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NamePartType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_nPLevel = jcas.getRequiredFeatureDE(casType, "nPLevel", "uima.cas.String", featOkTst);
    casFeatCode_nPLevel  = (null == casFeat_nPLevel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nPLevel).getCode();

 
    casFeat_nPType = jcas.getRequiredFeatureDE(casType, "nPType", "uima.cas.String", featOkTst);
    casFeatCode_nPType  = (null == casFeat_nPType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nPType).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getNPLevel(int addr) {
        if (featOkTst && casFeat_nPLevel == null)
      jcas.throwFeatMissing("nPLevel", "net.myerichsen.gedcom.NamePartType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nPLevel);
  }
  /** @generated */ 
  public String getNPType(int addr) {
        if (featOkTst && casFeat_nPType == null)
      jcas.throwFeatMissing("nPType", "net.myerichsen.gedcom.NamePartType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_nPType);
  }
  /** @generated */    
  public void setNPLevel(int addr, String v) {
        if (featOkTst && casFeat_nPLevel == null)
      jcas.throwFeatMissing("nPLevel", "net.myerichsen.gedcom.NamePartType");
    ll_cas.ll_setStringValue(addr, casFeatCode_nPLevel, v);}
    
  
 
  /** @generated */    
  public void setNPType(int addr, String v) {
        if (featOkTst && casFeat_nPType == null)
      jcas.throwFeatMissing("nPType", "net.myerichsen.gedcom.NamePartType");
    ll_cas.ll_setStringValue(addr, casFeatCode_nPType, v);}
    
  



}



    