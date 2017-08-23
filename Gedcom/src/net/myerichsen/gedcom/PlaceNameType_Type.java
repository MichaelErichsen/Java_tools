
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
public class PlaceNameType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PlaceNameType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PlaceNameType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PlaceNameType(addr, PlaceNameType_Type.this);
  			   PlaceNameType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PlaceNameType(addr, PlaceNameType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = PlaceNameType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.PlaceNameType");
  /** @generated */
  final Feature casFeat_group;
 
  /** @generated */
  final int     casFeatCode_group;
  /** @generated */
  final Feature casFeat_pNString;
  /** @generated */
  final int     casFeatCode_pNString;
  /** @generated */
  final Feature casFeat_placePart;
    
   /** @generated */
  final int     casFeatCode_placePart;
   
  /** @generated */
  final Feature casFeat_language;
 
 
  /** @generated */
  final int     casFeatCode_language;
  /** @generated */
  final Feature casFeat_pNMethod;
  /** @generated */
  final int     casFeatCode_pNMethod;
  /** @generated */
  final Feature casFeat_pNType;
    
   /** @generated */
  final int     casFeatCode_pNType;
   
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PlaceNameType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_group = jcas.getRequiredFeatureDE(casType, "group", "uima.cas.StringArray", featOkTst);
    casFeatCode_group  = (null == casFeat_group) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_group).getCode();

 
    casFeat_pNString = jcas.getRequiredFeatureDE(casType, "pNString", "uima.cas.StringArray", featOkTst);
    casFeatCode_pNString  = (null == casFeat_pNString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pNString).getCode();

 
    casFeat_placePart = jcas.getRequiredFeatureDE(casType, "placePart", "uima.cas.FSArray", featOkTst);
    casFeatCode_placePart  = (null == casFeat_placePart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_placePart).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_pNMethod = jcas.getRequiredFeatureDE(casType, "pNMethod", "uima.cas.String", featOkTst);
    casFeatCode_pNMethod  = (null == casFeat_pNMethod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pNMethod).getCode();

 
    casFeat_pNType = jcas.getRequiredFeatureDE(casType, "pNType", "uima.cas.String", featOkTst);
    casFeatCode_pNType  = (null == casFeat_pNType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_pNType).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getGroup(int addr) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_group);
  }
  /** @generated */
  public String getGroup(int addr, int i) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
  }
   
  /** @generated */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.PlaceNameType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
   /** @generated */ 
  public int getPlacePart(int addr) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_placePart);
  }
  /** @generated */
  public int getPlacePart(int addr, int i) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
  }
   
  /** @generated */ 
  public String getPNMethod(int addr) {
        if (featOkTst && casFeat_pNMethod == null)
      jcas.throwFeatMissing("pNMethod", "net.myerichsen.gedcom.PlaceNameType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pNMethod);
  }
  /** @generated */ 
  public int getPNString(int addr) {
        if (featOkTst && casFeat_pNString == null)
      jcas.throwFeatMissing("pNString", "net.myerichsen.gedcom.PlaceNameType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_pNString);
  }
  /** @generated */
  public String getPNString(int addr, int i) {
        if (featOkTst && casFeat_pNString == null)
      jcas.throwFeatMissing("pNString", "net.myerichsen.gedcom.PlaceNameType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_pNString), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_pNString), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_pNString), i);
  }
   
  /** @generated */ 
  public String getPNType(int addr) {
        if (featOkTst && casFeat_pNType == null)
      jcas.throwFeatMissing("pNType", "net.myerichsen.gedcom.PlaceNameType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_pNType);
  }
  /** @generated */    
  public void setGroup(int addr, int v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameType");
    ll_cas.ll_setRefValue(addr, casFeatCode_group, v);}
    
  /** @generated */ 
  public void setGroup(int addr, int i, String v) {
        if (featOkTst && casFeat_group == null)
      jcas.throwFeatMissing("group", "net.myerichsen.gedcom.PlaceNameType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_group), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_group), i, v);
  }
 
 
  /** @generated */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.PlaceNameType");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */    
  public void setPlacePart(int addr, int v) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameType");
    ll_cas.ll_setRefValue(addr, casFeatCode_placePart, v);}
    
  /** @generated */ 
  public void setPlacePart(int addr, int i, int v) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.PlaceNameType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placePart), i, v);
  }
 
 
  /** @generated */    
  public void setPNMethod(int addr, String v) {
        if (featOkTst && casFeat_pNMethod == null)
      jcas.throwFeatMissing("pNMethod", "net.myerichsen.gedcom.PlaceNameType");
    ll_cas.ll_setStringValue(addr, casFeatCode_pNMethod, v);}
    
  
 
  /** @generated */    
  public void setPNString(int addr, int v) {
        if (featOkTst && casFeat_pNString == null)
      jcas.throwFeatMissing("pNString", "net.myerichsen.gedcom.PlaceNameType");
    ll_cas.ll_setRefValue(addr, casFeatCode_pNString, v);}
    
  /** @generated */ 
  public void setPNString(int addr, int i, String v) {
        if (featOkTst && casFeat_pNString == null)
      jcas.throwFeatMissing("pNString", "net.myerichsen.gedcom.PlaceNameType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_pNString), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_pNString), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_pNString), i, v);
  }
 
 
  /** @generated */    
  public void setPNType(int addr, String v) {
        if (featOkTst && casFeat_pNType == null)
      jcas.throwFeatMissing("pNType", "net.myerichsen.gedcom.PlaceNameType");
    ll_cas.ll_setStringValue(addr, casFeatCode_pNType, v);}
    
  



}



    