
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
public class PlaceType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (PlaceType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = PlaceType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new PlaceType(addr, PlaceType_Type.this);
  			   PlaceType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new PlaceType(addr, PlaceType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = PlaceType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.PlaceType");
  /** @generated */
  final Feature casFeat_placeName;
 
  /** @generated */
  final int     casFeatCode_placeName;
  /** @generated */
  final Feature casFeat_coordinates;
  /** @generated */
  final int     casFeatCode_coordinates;
  /** @generated */
  final Feature casFeat_placeNameVar;
    
  
 
  /** @generated */
  final int     casFeatCode_placeNameVar;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public PlaceType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_placeName = jcas.getRequiredFeatureDE(casType, "placeName", "net.myerichsen.gedcom.PlaceNameType", featOkTst);
    casFeatCode_placeName  = (null == casFeat_placeName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_placeName).getCode();

 
    casFeat_coordinates = jcas.getRequiredFeatureDE(casType, "coordinates", "uima.cas.String", featOkTst);
    casFeatCode_coordinates  = (null == casFeat_coordinates) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_coordinates).getCode();

 
    casFeat_placeNameVar = jcas.getRequiredFeatureDE(casType, "placeNameVar", "uima.cas.FSArray", featOkTst);
    casFeatCode_placeNameVar  = (null == casFeat_placeNameVar) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_placeNameVar).getCode();

  }
  /** @generated */ 
  public String getCoordinates(int addr) {
        if (featOkTst && casFeat_coordinates == null)
      jcas.throwFeatMissing("coordinates", "net.myerichsen.gedcom.PlaceType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_coordinates);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getPlaceName(int addr) {
        if (featOkTst && casFeat_placeName == null)
      jcas.throwFeatMissing("placeName", "net.myerichsen.gedcom.PlaceType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_placeName);
  }
  /** @generated */ 
  public int getPlaceNameVar(int addr) {
        if (featOkTst && casFeat_placeNameVar == null)
      jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.PlaceType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_placeNameVar);
  }
  /** @generated */
  public int getPlaceNameVar(int addr, int i) {
        if (featOkTst && casFeat_placeNameVar == null)
      jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.PlaceType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placeNameVar), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_placeNameVar), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placeNameVar), i);
  }
   
  /** @generated */    
  public void setCoordinates(int addr, String v) {
        if (featOkTst && casFeat_coordinates == null)
      jcas.throwFeatMissing("coordinates", "net.myerichsen.gedcom.PlaceType");
    ll_cas.ll_setStringValue(addr, casFeatCode_coordinates, v);}
    
  
 
   /** @generated */    
  public void setPlaceName(int addr, int v) {
        if (featOkTst && casFeat_placeName == null)
      jcas.throwFeatMissing("placeName", "net.myerichsen.gedcom.PlaceType");
    ll_cas.ll_setRefValue(addr, casFeatCode_placeName, v);}
    
  
 
  /** @generated */    
  public void setPlaceNameVar(int addr, int v) {
        if (featOkTst && casFeat_placeNameVar == null)
      jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.PlaceType");
    ll_cas.ll_setRefValue(addr, casFeatCode_placeNameVar, v);}
    
  /** @generated */ 
  public void setPlaceNameVar(int addr, int i, int v) {
        if (featOkTst && casFeat_placeNameVar == null)
      jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.PlaceType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placeNameVar), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_placeNameVar), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_placeNameVar), i, v);
  }
 



}



    