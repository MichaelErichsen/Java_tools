
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
public class PhoneType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PhoneType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PhoneType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PhoneType(addr, PhoneType_Type.this);
  			   PhoneType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PhoneType(addr, PhoneType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = PhoneType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.PhoneType");
  /** @generated */
  final Feature casFeat_pType;
 
  /** @generated */
  final int     casFeatCode_pType;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PhoneType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_pType = jcas.getRequiredFeatureDE(casType, "pType", "uima.cas.String", featOkTst);
    casFeatCode_pType  = (null == casFeat_pType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pType).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getPType(int addr) {
        if (featOkTst && casFeat_pType == null)
      jcas.throwFeatMissing("pType", "net.myerichsen.gedcom.PhoneType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pType);
  }
  /** @generated */    
  public void setPType(int addr, String v) {
        if (featOkTst && casFeat_pType == null)
      jcas.throwFeatMissing("pType", "net.myerichsen.gedcom.PhoneType");
    ll_cas.ll_setStringValue(addr, casFeatCode_pType, v);}
    
  



}



    