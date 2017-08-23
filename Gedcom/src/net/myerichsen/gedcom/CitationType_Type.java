
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
 * Updated by JCasGen Wed Apr 10 09:47:33 CEST 2013
 * @generated */
public class CitationType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (CitationType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = CitationType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new CitationType(addr, CitationType_Type.this);
  			   CitationType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new CitationType(addr, CitationType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = CitationType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.CitationType");
  /** @generated */
  final Feature casFeat_link;
 
  /** @generated */
  final int     casFeatCode_link;
  /** @generated */
  final Feature casFeat_caption;
  /** @generated */
  final int     casFeatCode_caption;
  /** @generated */
  final Feature casFeat_whereInSource;
    
  
 
  /** @generated */
  final int     casFeatCode_whereInSource;
  /** @generated */
  final Feature casFeat_whenRecorded;
  /** @generated */
  final int     casFeatCode_whenRecorded;
  /** @generated */
  final Feature casFeat_extract;
    
  
 
  /** @generated */
  final int     casFeatCode_extract;
  /** @generated */
  final Feature casFeat_note;
  /** @generated */
  final int     casFeatCode_note;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public CitationType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "net.myerichsen.gedcom.LinkType", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

 
    casFeat_caption = jcas.getRequiredFeatureDE(casType, "caption", "uima.cas.String", featOkTst);
    casFeatCode_caption  = (null == casFeat_caption) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_caption).getCode();

 
    casFeat_whereInSource = jcas.getRequiredFeatureDE(casType, "whereInSource", "uima.cas.String", featOkTst);
    casFeatCode_whereInSource  = (null == casFeat_whereInSource) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_whereInSource).getCode();

 
    casFeat_whenRecorded = jcas.getRequiredFeatureDE(casType, "whenRecorded", "uima.cas.String", featOkTst);
    casFeatCode_whenRecorded  = (null == casFeat_whenRecorded) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_whenRecorded).getCode();

 
    casFeat_extract = jcas.getRequiredFeatureDE(casType, "extract", "uima.cas.FSArray", featOkTst);
    casFeatCode_extract  = (null == casFeat_extract) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_extract).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "uima.cas.FSArray", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

  }
  /** @generated */ 
  public String getCaption(int addr) {
        if (featOkTst && casFeat_caption == null)
      jcas.throwFeatMissing("caption", "net.myerichsen.gedcom.CitationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_caption);
  }
  /** @generated */ 
  public int getExtract(int addr) {
        if (featOkTst && casFeat_extract == null)
      jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.CitationType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_extract);
  }
  /** @generated */
  public int getExtract(int addr, int i) {
        if (featOkTst && casFeat_extract == null)
      jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.CitationType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_extract), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_extract), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_extract), i);
  }
   
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.CitationType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.CitationType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.CitationType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */ 
  public String getWhenRecorded(int addr) {
        if (featOkTst && casFeat_whenRecorded == null)
      jcas.throwFeatMissing("whenRecorded", "net.myerichsen.gedcom.CitationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_whenRecorded);
  }
   /** @generated */ 
  public String getWhereInSource(int addr) {
        if (featOkTst && casFeat_whereInSource == null)
      jcas.throwFeatMissing("whereInSource", "net.myerichsen.gedcom.CitationType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_whereInSource);
  }
  /** @generated */    
  public void setCaption(int addr, String v) {
        if (featOkTst && casFeat_caption == null)
      jcas.throwFeatMissing("caption", "net.myerichsen.gedcom.CitationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_caption, v);}
    
  
 
  /** @generated */    
  public void setExtract(int addr, int v) {
        if (featOkTst && casFeat_extract == null)
      jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.CitationType");
    ll_cas.ll_setRefValue(addr, casFeatCode_extract, v);}
    
  /** @generated */ 
  public void setExtract(int addr, int i, int v) {
        if (featOkTst && casFeat_extract == null)
      jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.CitationType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_extract), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_extract), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_extract), i, v);
  }
 
 
  /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.CitationType");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.CitationType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
   /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.CitationType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 



  /** @generated */    
  public void setWhenRecorded(int addr, String v) {
        if (featOkTst && casFeat_whenRecorded == null)
      jcas.throwFeatMissing("whenRecorded", "net.myerichsen.gedcom.CitationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_whenRecorded, v);}
    
  
 
  /** @generated */    
  public void setWhereInSource(int addr, String v) {
        if (featOkTst && casFeat_whereInSource == null)
      jcas.throwFeatMissing("whereInSource", "net.myerichsen.gedcom.CitationType");
    ll_cas.ll_setStringValue(addr, casFeatCode_whereInSource, v);}
    
  
 
}



    