
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
 * Updated by JCasGen Wed Apr 10 09:47:35 CEST 2013
 * @generated */
public class FamilyRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (FamilyRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = FamilyRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new FamilyRecType(addr, FamilyRecType_Type.this);
  			   FamilyRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new FamilyRecType(addr, FamilyRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = FamilyRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.FamilyRecType");
  /** @generated */
  final Feature casFeat_husbFath;
 
  /** @generated */
  final int     casFeatCode_husbFath;
  /** @generated */
  final Feature casFeat_wifeMoth;
  /** @generated */
  final int     casFeatCode_wifeMoth;
  /** @generated */
  final Feature casFeat_child;
    
  
 
  /** @generated */
  final int     casFeatCode_child;
  /** @generated */
  final Feature casFeat_basedOn;
  /** @generated */
  final int     casFeatCode_basedOn;
  /** @generated */
  final Feature casFeat_externalID;
    
  
 
  /** @generated */
  final int     casFeatCode_externalID;
  /** @generated */
  final Feature casFeat_submitter;
  /** @generated */
  final int     casFeatCode_submitter;
  /** @generated */
  final Feature casFeat_note;
    
   /** @generated */
  final int     casFeatCode_note;
   
  /** @generated */
  final Feature casFeat_evidence;
 
 
  /** @generated */
  final int     casFeatCode_evidence;
  /** @generated */
  final Feature casFeat_enrichment;
  /** @generated */
  final int     casFeatCode_enrichment;
  /** @generated */
  final Feature casFeat_changed;
    
  
 
  /** @generated */
  final int     casFeatCode_changed;
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public FamilyRecType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_husbFath = jcas.getRequiredFeatureDE(casType, "husbFath", "net.myerichsen.gedcom.HusbFathType", featOkTst);
    casFeatCode_husbFath  = (null == casFeat_husbFath) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_husbFath).getCode();

 
    casFeat_wifeMoth = jcas.getRequiredFeatureDE(casType, "wifeMoth", "net.myerichsen.gedcom.WifeMothType", featOkTst);
    casFeatCode_wifeMoth  = (null == casFeat_wifeMoth) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wifeMoth).getCode();

 
    casFeat_child = jcas.getRequiredFeatureDE(casType, "child", "uima.cas.FSArray", featOkTst);
    casFeatCode_child  = (null == casFeat_child) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_child).getCode();

 
    casFeat_basedOn = jcas.getRequiredFeatureDE(casType, "basedOn", "net.myerichsen.gedcom.BasedOnType", featOkTst);
    casFeatCode_basedOn  = (null == casFeat_basedOn) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_basedOn).getCode();

 
    casFeat_externalID = jcas.getRequiredFeatureDE(casType, "externalID", "uima.cas.FSArray", featOkTst);
    casFeatCode_externalID  = (null == casFeat_externalID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_externalID).getCode();

 
    casFeat_submitter = jcas.getRequiredFeatureDE(casType, "submitter", "net.myerichsen.gedcom.SubmitterType", featOkTst);
    casFeatCode_submitter  = (null == casFeat_submitter) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_submitter).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "uima.cas.FSArray", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

 
    casFeat_evidence = jcas.getRequiredFeatureDE(casType, "evidence", "uima.cas.FSArray", featOkTst);
    casFeatCode_evidence  = (null == casFeat_evidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_evidence).getCode();

 
    casFeat_enrichment = jcas.getRequiredFeatureDE(casType, "enrichment", "uima.cas.FSArray", featOkTst);
    casFeatCode_enrichment  = (null == casFeat_enrichment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_enrichment).getCode();

 
    casFeat_changed = jcas.getRequiredFeatureDE(casType, "changed", "uima.cas.FSArray", featOkTst);
    casFeatCode_changed  = (null == casFeat_changed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changed).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

  }
   /** @generated */ 
  public int getBasedOn(int addr) {
        if (featOkTst && casFeat_basedOn == null)
      jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_basedOn);
  }
  /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */
  public int getChanged(int addr, int i) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  }
   
  /** @generated */ 
  public int getChild(int addr) {
        if (featOkTst && casFeat_child == null)
      jcas.throwFeatMissing("child", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_child);
  }
  /** @generated */
  public int getChild(int addr, int i) {
        if (featOkTst && casFeat_child == null)
      jcas.throwFeatMissing("child", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_child), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_child), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_child), i);
  }
   
  /** @generated */ 
  public int getEnrichment(int addr) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_enrichment);
  }
  /** @generated */
  public int getEnrichment(int addr, int i) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  }
   
  /** @generated */ 
  public int getEvidence(int addr) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evidence);
  }
  /** @generated */
  public int getEvidence(int addr, int i) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  }
   
  /** @generated */ 
  public int getExternalID(int addr) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_externalID);
  }
   /** @generated */
  public int getExternalID(int addr, int i) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
  }
   
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getHusbFath(int addr) {
        if (featOkTst && casFeat_husbFath == null)
      jcas.throwFeatMissing("husbFath", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_husbFath);
  }
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
   /** @generated */ 
  public int getSubmitter(int addr) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_submitter);
  }
  /** @generated */ 
  public int getWifeMoth(int addr) {
        if (featOkTst && casFeat_wifeMoth == null)
      jcas.throwFeatMissing("wifeMoth", "net.myerichsen.gedcom.FamilyRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_wifeMoth);
  }
  /** @generated */    
  public void setBasedOn(int addr, int v) {
        if (featOkTst && casFeat_basedOn == null)
      jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_basedOn, v);}
    
  
 
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
  /** @generated */ 
  public void setChanged(int addr, int i, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v);
  }
 
 
  /** @generated */    
  public void setChild(int addr, int v) {
        if (featOkTst && casFeat_child == null)
      jcas.throwFeatMissing("child", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_child, v);}
    
   /** @generated */ 
  public void setChild(int addr, int i, int v) {
        if (featOkTst && casFeat_child == null)
      jcas.throwFeatMissing("child", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_child), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_child), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_child), i, v);
  }
 
 
  /** @generated */    
  public void setEnrichment(int addr, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_enrichment, v);}
    
  /** @generated */ 
  public void setEnrichment(int addr, int i, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v);
  }
 
 
  /** @generated */    
  public void setEvidence(int addr, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_evidence, v);}
    
  /** @generated */ 
  public void setEvidence(int addr, int i, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v);
  }
 
 
  /** @generated */    
  public void setExternalID(int addr, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_externalID, v);}
    
   /** @generated */ 
  public void setExternalID(int addr, int i, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v);
  }
 
 
  /** @generated */    
  public void setHusbFath(int addr, int v) {
        if (featOkTst && casFeat_husbFath == null)
      jcas.throwFeatMissing("husbFath", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_husbFath, v);}
    
  
 
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  



  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.FamilyRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
  /** @generated */    
  public void setSubmitter(int addr, int v) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_submitter, v);}
    
  
 
  /** @generated */    
  public void setWifeMoth(int addr, int v) {
        if (featOkTst && casFeat_wifeMoth == null)
      jcas.throwFeatMissing("wifeMoth", "net.myerichsen.gedcom.FamilyRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_wifeMoth, v);}
    
  
 
}



    