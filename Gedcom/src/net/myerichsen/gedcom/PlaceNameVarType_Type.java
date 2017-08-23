
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
public class PlaceNameVarType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PlaceNameVarType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PlaceNameVarType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PlaceNameVarType(addr, PlaceNameVarType_Type.this);
  			   PlaceNameVarType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PlaceNameVarType(addr, PlaceNameVarType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = PlaceNameVarType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.PlaceNameVarType");
  /** @generated */
  final Feature casFeat_group;
 
  /** @generated */
  final int     casFeatCode_group;
  /** @generated */
  final Feature casFeat_pNVString;
  /** @generated */
  final int     casFeatCode_pNVString;
  /** @generated */
  final Feature casFeat_placePart;
    
   /** @generated */
  final int     casFeatCode_placePart;
   
  /** @generated */
  final Feature casFeat_language;
 
 
  /** @generated */
  final int     casFeatCode_language;
  /** @generated */
  final Feature casFeat_pNVMethod;
  /** @generated */
  final int     casFeatCode_pNVMethod;
  /** @generated */
  final Feature casFeat_pNVType;
    
   /** @generated */
  final int     casFeatCode_pNVType;
   
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PlaceNameVarType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_group = jcas.getRequiredFeatureDE(casType, "group", "uima.cas.StringArray", featOkTst);
    casFeatCode_group  = (null == casFeat_group) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_group).getCode();

 
    casFeat_pNVString = jcas.getRequiredFeatureDE(casType, "pNVString", "uima.cas.StringArray", featOkTst);
    casFeatCode_pNVString  = (null == casFeat_pNVString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pNVString).getCode();

 
    casFeat_placePart = jcas.getRequiredFeatureDE(casType, "placePart", "uima.cas.FSArray", featOkTst);
    casFeatCode_placePart  = (null == casFeat_placePart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_placePart).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_pNVMethod = jcas.getRequiredFeatureDE(casType, "pNVMethod", "uima.cas.String", featOkTst);
    casFeatCode_pNVMethod  = (null == casFeat_pNVMethod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pNVMethod).getCode();

 
    casFeat_pNVType = jcas.getRequiredFeatureDE(casType, "pNVType", "uima.cas.String", featOkTst);
    casFeatCode_pNVType  = (null == casFeat_pNVType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pNVType).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getGroup(int addr) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameVarType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_group);
  }
  /** @generated */
  public String getGroup(int addr, int i) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameVarType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  }
   
  /** @generated */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.PlaceNameVarType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
   /** @generated */ 
  public int getPlacePart(int addr) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameVarType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_placePart);
  }
  /** @generated */
  public int getPlacePart(int addr, int i) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameVarType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
  }
   
  /** @generated */ 
  public String getPNVMethod(int addr) {
        if (featOkTst && casFeat_pNVMethod == null)
      jcas.throwFeatMissing("pNVMethod", "net.myerichsen.gedcom.PlaceNameVarType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pNVMethod);
  }
  /** @generated */ 
  public int getPNVString(int addr) {
        if (featOkTst && casFeat_pNVString == null)
      jcas.throwFeatMissing("pNVString", "net.myerichsen.gedcom.PlaceNameVarType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_pNVString);
  }
  /** @generated */
  public String getPNVString(int addr, int i) {
        if (featOkTst && casFeat_pNVString == null)
      jcas.throwFeatMissing("pNVString", "net.myerichsen.gedcom.PlaceNameVarType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_pNVString), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_pNVString), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_pNVString), i);
  }
   
  /** @generated */ 
  public String getPNVType(int addr) {
        if (featOkTst && casFeat_pNVType == null)
      jcas.throwFeatMissing("pNVType", "net.myerichsen.gedcom.PlaceNameVarType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pNVType);
  }
  /** @generated */    
  public void setGroup(int addr, int v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameVarType");
    ll_cas.ll_setRefValue(addr, casFeatCode_group, v);}
    
  /** @generated */ 
  public void setGroup(int addr, int i, String v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameVarType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v);
  }
 
 
  /** @generated */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.PlaceNameVarType");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */    
  public void setPlacePart(int addr, int v) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameVarType");
    ll_cas.ll_setRefValue(addr, casFeatCode_placePart, v);}
    
  /** @generated */ 
  public void setPlacePart(int addr, int i, int v) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameVarType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, v);
  }
 
 
  /** @generated */    
  public void setPNVMethod(int addr, String v) {
        if (featOkTst && casFeat_pNVMethod == null)
      jcas.throwFeatMissing("pNVMethod", "net.myerichsen.gedcom.PlaceNameVarType");
    ll_cas.ll_setStringValue(addr, casFeatCode_pNVMethod, v);}
    
  
 
  /** @generated */    
  public void setPNVString(int addr, int v) {
        if (featOkTst && casFeat_pNVString == null)
      jcas.throwFeatMissing("pNVString", "net.myerichsen.gedcom.PlaceNameVarType");
    ll_cas.ll_setRefValue(addr, casFeatCode_pNVString, v);}
    
  /** @generated */ 
  public void setPNVString(int addr, int i, String v) {
        if (featOkTst && casFeat_pNVString == null)
      jcas.throwFeatMissing("pNVString", "net.myerichsen.gedcom.PlaceNameVarType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_pNVString), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_pNVString), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_pNVString), i, v);
  }
 
 
  /** @generated */    
  public void setPNVType(int addr, String v) {
        if (featOkTst && casFeat_pNVType == null)
      jcas.throwFeatMissing("pNVType", "net.myerichsen.gedcom.PlaceNameVarType");
    ll_cas.ll_setStringValue(addr, casFeatCode_pNVType, v);}
    
  



}



    