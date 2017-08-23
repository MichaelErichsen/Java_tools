
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
public class IndivNameType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (IndivNameType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = IndivNameType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new IndivNameType(addr, IndivNameType_Type.this);
  			   IndivNameType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new IndivNameType(addr, IndivNameType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = IndivNameType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.IndivNameType");
  /** @generated */
  final Feature casFeat_group;
 
  /** @generated */
  final int     casFeatCode_group;
  /** @generated */
  final Feature casFeat_iNString;
  /** @generated */
  final int     casFeatCode_iNString;
  /** @generated */
  final Feature casFeat_namePart;
    
   /** @generated */
  final int     casFeatCode_namePart;
   
  /** @generated */
  final Feature casFeat_indivNameVariation;
 
 
  /** @generated */
  final int     casFeatCode_indivNameVariation;
  /** @generated */
  final Feature casFeat_indNameMethod;
  /** @generated */
  final int     casFeatCode_indNameMethod;
  /** @generated */
  final Feature casFeat_indNameType;
    
   /** @generated */
  final int     casFeatCode_indNameType;
   
  /** @generated */
  final Feature casFeat_language;
 
 
  /** @generated */
  final int     casFeatCode_language;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public IndivNameType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_group = jcas.getRequiredFeatureDE(casType, "group", "uima.cas.StringArray", featOkTst);
    casFeatCode_group  = (null == casFeat_group) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_group).getCode();

 
    casFeat_iNString = jcas.getRequiredFeatureDE(casType, "iNString", "uima.cas.StringArray", featOkTst);
    casFeatCode_iNString  = (null == casFeat_iNString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_iNString).getCode();

 
    casFeat_namePart = jcas.getRequiredFeatureDE(casType, "namePart", "uima.cas.FSArray", featOkTst);
    casFeatCode_namePart  = (null == casFeat_namePart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_namePart).getCode();

 
    casFeat_indivNameVariation = jcas.getRequiredFeatureDE(casType, "indivNameVariation", "uima.cas.FSArray", featOkTst);
    casFeatCode_indivNameVariation  = (null == casFeat_indivNameVariation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indivNameVariation).getCode();

 
    casFeat_indNameMethod = jcas.getRequiredFeatureDE(casType, "indNameMethod", "uima.cas.String", featOkTst);
    casFeatCode_indNameMethod  = (null == casFeat_indNameMethod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indNameMethod).getCode();

 
    casFeat_indNameType = jcas.getRequiredFeatureDE(casType, "indNameType", "net.myerichsen.gedcom.IndNameTypeType", featOkTst);
    casFeatCode_indNameType  = (null == casFeat_indNameType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indNameType).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getGroup(int addr) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_group);
  }
   /** @generated */
  public String getGroup(int addr, int i) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  }
   
  /** @generated */ 
  public int getIndivNameVariation(int addr) {
        if (featOkTst && casFeat_indivNameVariation == null)
      jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.IndivNameType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_indivNameVariation);
  }
  /** @generated */
  public int getIndivNameVariation(int addr, int i) {
        if (featOkTst && casFeat_indivNameVariation == null)
      jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.IndivNameType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indivNameVariation), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_indivNameVariation), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indivNameVariation), i);
  }
   
  /** @generated */ 
  public String getIndNameMethod(int addr) {
        if (featOkTst && casFeat_indNameMethod == null)
      jcas.throwFeatMissing("indNameMethod", "net.myerichsen.gedcom.IndivNameType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_indNameMethod);
  }
  /** @generated */ 
  public String getIndNameType(int addr) {
        if (featOkTst && casFeat_indNameType == null)
      jcas.throwFeatMissing("indNameType", "net.myerichsen.gedcom.IndivNameType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_indNameType);
  }
  /** @generated */ 
  public int getINString(int addr) {
        if (featOkTst && casFeat_iNString == null)
      jcas.throwFeatMissing("iNString", "net.myerichsen.gedcom.IndivNameType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_iNString);
  }
   /** @generated */
  public String getINString(int addr, int i) {
        if (featOkTst && casFeat_iNString == null)
      jcas.throwFeatMissing("iNString", "net.myerichsen.gedcom.IndivNameType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_iNString), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_iNString), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_iNString), i);
  }
   
  /** @generated */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.IndivNameType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated */ 
  public int getNamePart(int addr) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_namePart);
  }
  /** @generated */
  public int getNamePart(int addr, int i) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i);
  }
   
  /** @generated */    
  public void setGroup(int addr, int v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameType");
    ll_cas.ll_setRefValue(addr, casFeatCode_group, v);}
    
  /** @generated */ 
  public void setGroup(int addr, int i, String v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.IndivNameType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v);
  }
 
 
  /** @generated */    
  public void setIndivNameVariation(int addr, int v) {
        if (featOkTst && casFeat_indivNameVariation == null)
      jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.IndivNameType");
    ll_cas.ll_setRefValue(addr, casFeatCode_indivNameVariation, v);}
    
  /** @generated */ 
  public void setIndivNameVariation(int addr, int i, int v) {
        if (featOkTst && casFeat_indivNameVariation == null)
      jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.IndivNameType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indivNameVariation), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_indivNameVariation), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indivNameVariation), i, v);
  }
 
 
  /** @generated */    
  public void setIndNameMethod(int addr, String v) {
        if (featOkTst && casFeat_indNameMethod == null)
      jcas.throwFeatMissing("indNameMethod", "net.myerichsen.gedcom.IndivNameType");
    ll_cas.ll_setStringValue(addr, casFeatCode_indNameMethod, v);}
    
  
 
  /** @generated */    
  public void setIndNameType(int addr, String v) {
        if (featOkTst && casFeat_indNameType == null)
      jcas.throwFeatMissing("indNameType", "net.myerichsen.gedcom.IndivNameType");
    ll_cas.ll_setStringValue(addr, casFeatCode_indNameType, v);}
    
  
 
  /** @generated */    
  public void setINString(int addr, int v) {
        if (featOkTst && casFeat_iNString == null)
      jcas.throwFeatMissing("iNString", "net.myerichsen.gedcom.IndivNameType");
    ll_cas.ll_setRefValue(addr, casFeatCode_iNString, v);}
    
  /** @generated */ 
  public void setINString(int addr, int i, String v) {
        if (featOkTst && casFeat_iNString == null)
      jcas.throwFeatMissing("iNString", "net.myerichsen.gedcom.IndivNameType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_iNString), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_iNString), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_iNString), i, v);
  }
 
 
  /** @generated */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.IndivNameType");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  



  /** @generated */    
  public void setNamePart(int addr, int v) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameType");
    ll_cas.ll_setRefValue(addr, casFeatCode_namePart, v);}
    
  /** @generated */ 
  public void setNamePart(int addr, int i, int v) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.IndivNameType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_namePart), i, v);
  }
 
 
}



    