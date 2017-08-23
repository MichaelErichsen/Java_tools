
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
public class PlacePartType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PlacePartType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PlacePartType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PlacePartType(addr, PlacePartType_Type.this);
  			   PlacePartType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PlacePartType(addr, PlacePartType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = PlacePartType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.PlacePartType");
  /** @generated */
  final Feature casFeat_pPLevel;
 
  /** @generated */
  final int     casFeatCode_pPLevel;
  /** @generated */
  final Feature casFeat_pPType;
  /** @generated */
  final int     casFeatCode_pPType;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PlacePartType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_pPLevel = jcas.getRequiredFeatureDE(casType, "pPLevel", "uima.cas.String", featOkTst);
    casFeatCode_pPLevel  = (null == casFeat_pPLevel) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pPLevel).getCode();

 
    casFeat_pPType = jcas.getRequiredFeatureDE(casType, "pPType", "uima.cas.String", featOkTst);
    casFeatCode_pPType  = (null == casFeat_pPType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pPType).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getPPLevel(int addr) {
        if (featOkTst && casFeat_pPLevel == null)
      jcas.throwFeatMissing("pPLevel", "net.myerichsen.gedcom.PlacePartType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pPLevel);
  }
  /** @generated */ 
  public String getPPType(int addr) {
        if (featOkTst && casFeat_pPType == null)
      jcas.throwFeatMissing("pPType", "net.myerichsen.gedcom.PlacePartType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pPType);
  }
  /** @generated */    
  public void setPPLevel(int addr, String v) {
        if (featOkTst && casFeat_pPLevel == null)
      jcas.throwFeatMissing("pPLevel", "net.myerichsen.gedcom.PlacePartType");
    ll_cas.ll_setStringValue(addr, casFeatCode_pPLevel, v);}
    
  
 
  /** @generated */    
  public void setPPType(int addr, String v) {
        if (featOkTst && casFeat_pPType == null)
      jcas.throwFeatMissing("pPType", "net.myerichsen.gedcom.PlacePartType");
    ll_cas.ll_setStringValue(addr, casFeatCode_pPType, v);}
    
  



}



    