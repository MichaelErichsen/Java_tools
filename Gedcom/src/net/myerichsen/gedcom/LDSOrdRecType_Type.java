
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
public class LDSOrdRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LDSOrdRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LDSOrdRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LDSOrdRecType(addr, LDSOrdRecType_Type.this);
  			   LDSOrdRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LDSOrdRecType(addr, LDSOrdRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = LDSOrdRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.LDSOrdRecType");
  /** @generated */
  final Feature casFeat_participant;
 
  /** @generated */
  final int     casFeatCode_participant;
  /** @generated */
  final Feature casFeat_ordStat;
  /** @generated */
  final int     casFeatCode_ordStat;
  /** @generated */
  final Feature casFeat_templeCode;
    
   /** @generated */
  final int     casFeatCode_templeCode;
   
  /** @generated */
  final Feature casFeat_date;
 
 
  /** @generated */
  final int     casFeatCode_date;
  /** @generated */
  final Feature casFeat_place;
  /** @generated */
  final int     casFeatCode_place;
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
  /** @generated */
  final Feature casFeat_lDSOrdType;
  /** @generated */
  final int     casFeatCode_lDSOrdType;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public LDSOrdRecType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_participant = jcas.getRequiredFeatureDE(casType, "participant", "uima.cas.FSArray", featOkTst);
    casFeatCode_participant  = (null == casFeat_participant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_participant).getCode();

 
    casFeat_ordStat = jcas.getRequiredFeatureDE(casType, "ordStat", "uima.cas.FSArray", featOkTst);
    casFeatCode_ordStat  = (null == casFeat_ordStat) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ordStat).getCode();

 
    casFeat_templeCode = jcas.getRequiredFeatureDE(casType, "templeCode", "uima.cas.String", featOkTst);
    casFeatCode_templeCode  = (null == casFeat_templeCode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_templeCode).getCode();

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "net.myerichsen.gedcom.DateType", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_place = jcas.getRequiredFeatureDE(casType, "place", "net.myerichsen.gedcom.PlaceType", featOkTst);
    casFeatCode_place  = (null == casFeat_place) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_place).getCode();

 
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

 
    casFeat_lDSOrdType = jcas.getRequiredFeatureDE(casType, "lDSOrdType", "net.myerichsen.gedcom.LDSOrdTypeType", featOkTst);
    casFeatCode_lDSOrdType  = (null == casFeat_lDSOrdType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lDSOrdType).getCode();

  }
  /** @generated */ 
  public int getBasedOn(int addr) {
        if (featOkTst && casFeat_basedOn == null)
      jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_basedOn);
  }
  /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */
  public int getChanged(int addr, int i) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  }
   
  /** @generated */ 
  public int getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_date);
  }
   /** @generated */ 
  public int getEnrichment(int addr) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_enrichment);
  }
  /** @generated */
  public int getEnrichment(int addr, int i) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  }
   
  /** @generated */ 
  public int getEvidence(int addr) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evidence);
  }
  /** @generated */
  public int getEvidence(int addr, int i) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  }
   
  /** @generated */ 
  public int getExternalID(int addr) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_externalID);
  }
  /** @generated */
  public int getExternalID(int addr, int i) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
  }
   
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */ 
  public String getLDSOrdType(int addr) {
        if (featOkTst && casFeat_lDSOrdType == null)
      jcas.throwFeatMissing("lDSOrdType", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lDSOrdType);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
   /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */ 
  public int getOrdStat(int addr) {
        if (featOkTst && casFeat_ordStat == null)
      jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ordStat);
  }
  /** @generated */
  public int getOrdStat(int addr, int i) {
        if (featOkTst && casFeat_ordStat == null)
      jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ordStat), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ordStat), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ordStat), i);
  }
   
  /** @generated */ 
  public int getParticipant(int addr) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_participant);
  }
  /** @generated */
  public int getParticipant(int addr, int i) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i);
  }
   
  /** @generated */ 
  public int getPlace(int addr) {
        if (featOkTst && casFeat_place == null)
      jcas.throwFeatMissing("place", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_place);
  }
   /** @generated */ 
  public int getSubmitter(int addr) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_submitter);
  }
  /** @generated */ 
  public String getTempleCode(int addr) {
        if (featOkTst && casFeat_templeCode == null)
      jcas.throwFeatMissing("templeCode", "net.myerichsen.gedcom.LDSOrdRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_templeCode);
  }
  /** @generated */    
  public void setBasedOn(int addr, int v) {
        if (featOkTst && casFeat_basedOn == null)
      jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_basedOn, v);}
    
  
 
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
  /** @generated */ 
  public void setChanged(int addr, int i, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v);
  }
 
 
  /** @generated */    
  public void setDate(int addr, int v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_date, v);}
    
  
 
   /** @generated */    
  public void setEnrichment(int addr, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_enrichment, v);}
    
  /** @generated */ 
  public void setEnrichment(int addr, int i, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v);
  }
 
 
  /** @generated */    
  public void setEvidence(int addr, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_evidence, v);}
    
  /** @generated */ 
  public void setEvidence(int addr, int i, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v);
  }
 
 
  /** @generated */    
  public void setExternalID(int addr, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_externalID, v);}
    
  /** @generated */ 
  public void setExternalID(int addr, int i, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v);
  }
 
 
   /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */    
  public void setLDSOrdType(int addr, String v) {
        if (featOkTst && casFeat_lDSOrdType == null)
      jcas.throwFeatMissing("lDSOrdType", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_lDSOrdType, v);}
    
  



  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
  /** @generated */    
  public void setOrdStat(int addr, int v) {
        if (featOkTst && casFeat_ordStat == null)
      jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_ordStat, v);}
    
  /** @generated */ 
  public void setOrdStat(int addr, int i, int v) {
        if (featOkTst && casFeat_ordStat == null)
      jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ordStat), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ordStat), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ordStat), i, v);
  }
 
 
  /** @generated */    
  public void setParticipant(int addr, int v) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_participant, v);}
    
  /** @generated */ 
  public void setParticipant(int addr, int i, int v) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.LDSOrdRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i, v);
  }
 
 
  /** @generated */    
  public void setPlace(int addr, int v) {
        if (featOkTst && casFeat_place == null)
      jcas.throwFeatMissing("place", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_place, v);}
    
  
 
  /** @generated */    
  public void setSubmitter(int addr, int v) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_submitter, v);}
    
  
 
  /** @generated */    
  public void setTempleCode(int addr, String v) {
        if (featOkTst && casFeat_templeCode == null)
      jcas.throwFeatMissing("templeCode", "net.myerichsen.gedcom.LDSOrdRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_templeCode, v);}
    
  
 
}



    