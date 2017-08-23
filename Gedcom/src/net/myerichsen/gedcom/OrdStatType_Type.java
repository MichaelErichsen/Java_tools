
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
public class OrdStatType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (OrdStatType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = OrdStatType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new OrdStatType(addr, OrdStatType_Type.this);
  			   OrdStatType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new OrdStatType(addr, OrdStatType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = OrdStatType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.OrdStatType");
  /** @generated */
  final Feature casFeat_date;
 
  /** @generated */
  final int     casFeatCode_date;
  /** @generated */
  final Feature casFeat_oSCode;
  /** @generated */
  final int     casFeatCode_oSCode;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public OrdStatType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "net.myerichsen.gedcom.DateType", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_oSCode = jcas.getRequiredFeatureDE(casType, "oSCode", "net.myerichsen.gedcom.OSCodeType", featOkTst);
    casFeatCode_oSCode  = (null == casFeat_oSCode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_oSCode).getCode();

  }
  /** @generated */ 
  public int getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "net.myerichsen.gedcom.OrdStatType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_date);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getOSCode(int addr) {
        if (featOkTst && casFeat_oSCode == null)
      jcas.throwFeatMissing("oSCode", "net.myerichsen.gedcom.OrdStatType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_oSCode);
  }
  /** @generated */    
  public void setDate(int addr, int v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "net.myerichsen.gedcom.OrdStatType");
    ll_cas.ll_setRefValue(addr, casFeatCode_date, v);}
    
  
 
  /** @generated */    
  public void setOSCode(int addr, String v) {
        if (featOkTst && casFeat_oSCode == null)
      jcas.throwFeatMissing("oSCode", "net.myerichsen.gedcom.OrdStatType");
    ll_cas.ll_setStringValue(addr, casFeatCode_oSCode, v);}
    
  



}



    