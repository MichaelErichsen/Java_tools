
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
 * Updated by JCasGen Wed Apr 10 09:47:36 CEST 2013
 * @generated */
public class IndivNameVariationType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (IndivNameVariationType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = IndivNameVariationType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new IndivNameVariationType(addr, IndivNameVariationType_Type.this);
  			   IndivNameVariationType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new IndivNameVariationType(addr, IndivNameVariationType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = IndivNameVariationType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.IndivNameVariationType");
  /** @generated */
  final Feature casFeat_group;
 
  /** @generated */
  final int     casFeatCode_group;
  /** @generated */
  final Feature casFeat_iNVString;
  /** @generated */
  final int     casFeatCode_iNVString;
  /** @generated */
  final Feature casFeat_namePart;
    
   /** @generated */
  final int     casFeatCode_namePart;
   
  /** @generated */
  final Feature casFeat_iNVMethod;
 
 
  /** @generated */
  final int     casFeatCode_iNVMethod;
  /** @generated */
  final Feature casFeat_iNVType;
  /** @generated */
  final int     casFeatCode_iNVType;
  /** @generated */
  final Feature casFeat_language;
    
   /** @generated */
  final int     casFeatCode_language;
   
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public IndivNameVariationType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_group = jcas.getRequiredFeatureDE(casType, "group", "uima.cas.StringArray", featOkTst);
    casFeatCode_group  = (null == casFeat_group) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_group).getCode();

 
    casFeat_iNVString = jcas.getRequiredFeatureDE(casType, "iNVString", "uima.cas.StringArray", featOkTst);
    casFeatCode_iNVString  = (null == casFeat_iNVString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_iNVString).getCode();

 
    casFeat_namePart = jcas.getRequiredFeatureDE(casType, "namePart", "uima.cas.FSArray", featOkTst);
    casFeatCode_namePart  = (null == casFeat_namePart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_namePart).getCode();

 
    casFeat_iNVMethod = jcas.getRequiredFeatureDE(casType, "iNVMethod", "uima.cas.String", featOkTst);
    casFeatCode_iNVMethod  = (null == casFeat_iNVMethod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_iNVMethod).getCode();

 
    casFeat_iNVType = jcas.getRequiredFeatureDE(casType, "iNVType", "uima.cas.String", featOkTst);
    casFeatCode_iNVType  = (null == casFeat_iNVType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_iNVType).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getGroup(int addr) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameVariationType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_group);
  }
  /** @generated */
  public String getGroup(int addr, int i) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameVariationType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  }
   
  /** @generated */ 
  public String getINVMethod(int addr) {
        if (featOkTst && casFeat_iNVMethod == null)
      jcas.throwFeatMissing("iNVMethod", "net.myerichsen.gedcom.IndivNameVariationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_iNVMethod);
  }
   /** @generated */ 
  public int getINVString(int addr) {
        if (featOkTst && casFeat_iNVString == null)
      jcas.throwFeatMissing("iNVString", "net.myerichsen.gedcom.IndivNameVariationType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_iNVString);
  }
  /** @generated */
  public String getINVString(int addr, int i) {
        if (featOkTst && casFeat_iNVString == null)
      jcas.throwFeatMissing("iNVString", "net.myerichsen.gedcom.IndivNameVariationType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_iNVString), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_iNVString), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_iNVString), i);
  }
   
  /** @generated */ 
  public String getINVType(int addr) {
        if (featOkTst && casFeat_iNVType == null)
      jcas.throwFeatMissing("iNVType", "net.myerichsen.gedcom.IndivNameVariationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_iNVType);
  }
  /** @generated */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.IndivNameVariationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated */ 
  public int getNamePart(int addr) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameVariationType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_namePart);
  }
  /** @generated */
  public int getNamePart(int addr, int i) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameVariationType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i);
  }
   
  /** @generated */    
  public void setGroup(int addr, int v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameVariationType");
    ll_cas.ll_setRefValue(addr, casFeatCode_group, v);}
    
  /** @generated */ 
  public void setGroup(int addr, int i, String v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameVariationType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v);
  }
 
 
  /** @generated */    
  public void setINVMethod(int addr, String v) {
        if (featOkTst && casFeat_iNVMethod == null)
      jcas.throwFeatMissing("iNVMethod", "net.myerichsen.gedcom.IndivNameVariationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_iNVMethod, v);}
    
  
 
  /** @generated */    
  public void setINVString(int addr, int v) {
        if (featOkTst && casFeat_iNVString == null)
      jcas.throwFeatMissing("iNVString", "net.myerichsen.gedcom.IndivNameVariationType");
    ll_cas.ll_setRefValue(addr, casFeatCode_iNVString, v);}
    
  /** @generated */ 
  public void setINVString(int addr, int i, String v) {
        if (featOkTst && casFeat_iNVString == null)
      jcas.throwFeatMissing("iNVString", "net.myerichsen.gedcom.IndivNameVariationType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_iNVString), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_iNVString), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_iNVString), i, v);
  }
 
 
  /** @generated */    
  public void setINVType(int addr, String v) {
        if (featOkTst && casFeat_iNVType == null)
      jcas.throwFeatMissing("iNVType", "net.myerichsen.gedcom.IndivNameVariationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_iNVType, v);}
    
  
 
  /** @generated */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.IndivNameVariationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  



  /** @generated */    
  public void setNamePart(int addr, int v) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameVariationType");
    ll_cas.ll_setRefValue(addr, casFeatCode_namePart, v);}
    
  /** @generated */ 
  public void setNamePart(int addr, int i, int v) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameVariationType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i, v);
  }
 
 
}



    