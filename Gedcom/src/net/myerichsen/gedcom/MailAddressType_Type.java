
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
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * @generated */
public class MailAddressType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MailAddressType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MailAddressType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MailAddressType(addr, MailAddressType_Type.this);
  			   MailAddressType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MailAddressType(addr, MailAddressType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = MailAddressType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.MailAddressType");
  /** @generated */
  final Feature casFeat_addrLine;
 
  /** @generated */
  final int     casFeatCode_addrLine;
  /** @generated */
  final Feature casFeat_language;
  /** @generated */
  final int     casFeatCode_language;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MailAddressType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_addrLine = jcas.getRequiredFeatureDE(casType, "addrLine", "uima.cas.FSArray", featOkTst);
    casFeatCode_addrLine  = (null == casFeat_addrLine) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_addrLine).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

  }
   /** @generated */ 
  public int getAddrLine(int addr) {
        if (featOkTst && casFeat_addrLine == null)
      jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.MailAddressType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_addrLine);
  }
  /** @generated */
  public int getAddrLine(int addr, int i) {
        if (featOkTst && casFeat_addrLine == null)
      jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.MailAddressType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_addrLine), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_addrLine), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_addrLine), i);
  }
   
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.MailAddressType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated */    
  public void setAddrLine(int addr, int v) {
        if (featOkTst && casFeat_addrLine == null)
      jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.MailAddressType");
    ll_cas.ll_setRefValue(addr, casFeatCode_addrLine, v);}
    
  /** @generated */ 
  public void setAddrLine(int addr, int i, int v) {
        if (featOkTst && casFeat_addrLine == null)
      jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.MailAddressType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_addrLine), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_addrLine), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_addrLine), i, v);
  }
 
 
  /** @generated */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.MailAddressType");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  



}



    