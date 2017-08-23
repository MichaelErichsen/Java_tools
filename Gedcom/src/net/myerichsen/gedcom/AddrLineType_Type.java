
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
 * Updated by JCasGen Wed Apr 10 09:47:31 CEST 2013
 * @generated */
public class AddrLineType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AddrLineType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AddrLineType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AddrLineType(addr, AddrLineType_Type.this);
  			   AddrLineType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AddrLineType(addr, AddrLineType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = AddrLineType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.AddrLineType");
  /** @generated */
  final Feature casFeat_mixed;
 
  /** @generated */
  final int     casFeatCode_mixed;
  /** @generated */
  final Feature casFeat_group;
  /** @generated */
  final int     casFeatCode_group;
  /** @generated */
  final Feature casFeat_aLString;
    
   /** @generated */
  final int     casFeatCode_aLString;
   
  /** @generated */
  final Feature casFeat_addressee;
 
 
  /** @generated */
  final int     casFeatCode_addressee;
  /** @generated */
  final Feature casFeat_placePart;
  /** @generated */
  final int     casFeatCode_placePart;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AddrLineType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_mixed = jcas.getRequiredFeatureDE(casType, "mixed", "uima.cas.StringArray", featOkTst);
    casFeatCode_mixed  = (null == casFeat_mixed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mixed).getCode();

 
    casFeat_group = jcas.getRequiredFeatureDE(casType, "group", "uima.cas.StringArray", featOkTst);
    casFeatCode_group  = (null == casFeat_group) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_group).getCode();

 
    casFeat_aLString = jcas.getRequiredFeatureDE(casType, "aLString", "uima.cas.StringArray", featOkTst);
    casFeatCode_aLString  = (null == casFeat_aLString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_aLString).getCode();

 
    casFeat_addressee = jcas.getRequiredFeatureDE(casType, "addressee", "uima.cas.StringArray", featOkTst);
    casFeatCode_addressee  = (null == casFeat_addressee) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_addressee).getCode();

 
    casFeat_placePart = jcas.getRequiredFeatureDE(casType, "placePart", "uima.cas.FSArray", featOkTst);
    casFeatCode_placePart  = (null == casFeat_placePart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_placePart).getCode();

  }
   /** @generated */ 
  public int getAddressee(int addr) {
        if (featOkTst && casFeat_addressee == null)
      jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.AddrLineType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_addressee);
  }
  /** @generated */
  public String getAddressee(int addr, int i) {
        if (featOkTst && casFeat_addressee == null)
      jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_addressee), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_addressee), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_addressee), i);
  }
   
  /** @generated */ 
  public int getALString(int addr) {
        if (featOkTst && casFeat_aLString == null)
      jcas.throwFeatMissing("aLString", "net.myerichsen.gedcom.AddrLineType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_aLString);
  }
  /** @generated */
  public String getALString(int addr, int i) {
        if (featOkTst && casFeat_aLString == null)
      jcas.throwFeatMissing("aLString", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_aLString), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_aLString), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_aLString), i);
  }
   
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getGroup(int addr) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.AddrLineType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_group);
  }
   /** @generated */
  public String getGroup(int addr, int i) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  }
   
  /** @generated */ 
  public int getMixed(int addr) {
        if (featOkTst && casFeat_mixed == null)
      jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.AddrLineType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mixed);
  }
  /** @generated */
  public String getMixed(int addr, int i) {
        if (featOkTst && casFeat_mixed == null)
      jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i);
  }
   
  /** @generated */ 
  public int getPlacePart(int addr) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.AddrLineType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_placePart);
  }
  /** @generated */
  public int getPlacePart(int addr, int i) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
  }
   
  /** @generated */    
  public void setAddressee(int addr, int v) {
        if (featOkTst && casFeat_addressee == null)
      jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.AddrLineType");
    ll_cas.ll_setRefValue(addr, casFeatCode_addressee, v);}
    
   /** @generated */ 
  public void setAddressee(int addr, int i, String v) {
        if (featOkTst && casFeat_addressee == null)
      jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_addressee), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_addressee), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_addressee), i, v);
  }
 
 
  /** @generated */    
  public void setALString(int addr, int v) {
        if (featOkTst && casFeat_aLString == null)
      jcas.throwFeatMissing("aLString", "net.myerichsen.gedcom.AddrLineType");
    ll_cas.ll_setRefValue(addr, casFeatCode_aLString, v);}
    
  /** @generated */ 
  public void setALString(int addr, int i, String v) {
        if (featOkTst && casFeat_aLString == null)
      jcas.throwFeatMissing("aLString", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_aLString), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_aLString), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_aLString), i, v);
  }
 
 
  /** @generated */    
  public void setGroup(int addr, int v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.AddrLineType");
    ll_cas.ll_setRefValue(addr, casFeatCode_group, v);}
    
  /** @generated */ 
  public void setGroup(int addr, int i, String v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v);
  }
 
 
  /** @generated */    
  public void setMixed(int addr, int v) {
        if (featOkTst && casFeat_mixed == null)
      jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.AddrLineType");
    ll_cas.ll_setRefValue(addr, casFeatCode_mixed, v);}
    
   /** @generated */ 
  public void setMixed(int addr, int i, String v) {
        if (featOkTst && casFeat_mixed == null)
      jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i, v);
  }
 
 
  /** @generated */    
  public void setPlacePart(int addr, int v) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.AddrLineType");
    ll_cas.ll_setRefValue(addr, casFeatCode_placePart, v);}
    
  /** @generated */ 
  public void setPlacePart(int addr, int i, int v) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.AddrLineType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, v);
  }
 



}



    