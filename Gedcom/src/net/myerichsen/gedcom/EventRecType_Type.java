
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
public class EventRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EventRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EventRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EventRecType(addr, EventRecType_Type.this);
  			   EventRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EventRecType(addr, EventRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = EventRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.EventRecType");
  /** @generated */
  final Feature casFeat_participant;
 
  /** @generated */
  final int     casFeatCode_participant;
  /** @generated */
  final Feature casFeat_date;
  /** @generated */
  final int     casFeatCode_date;
  /** @generated */
  final Feature casFeat_place;
    
   /** @generated */
  final int     casFeatCode_place;
   
  /** @generated */
  final Feature casFeat_religion;
 
 
  /** @generated */
  final int     casFeatCode_religion;
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
  final Feature casFeat_eventType;
  /** @generated */
  final int     casFeatCode_eventType;
  /** @generated */
  final Feature casFeat_id;
    
   /** @generated */
  final int     casFeatCode_id;
   
  /** @generated */
  final Feature casFeat_vitalType;
 
 
  /** @generated */
  final int     casFeatCode_vitalType;
  /** @generated */
  final Feature casFeat_source;
  /** @generated */
  final int     casFeatCode_source;
  /** @generated */
  final Feature casFeat_toDate;
    
  
 
  /** @generated */
  final int     casFeatCode_toDate;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public EventRecType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_participant = jcas.getRequiredFeatureDE(casType, "participant", "uima.cas.FSArray", featOkTst);
    casFeatCode_participant  = (null == casFeat_participant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_participant).getCode();

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "uima.cas.String", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_place = jcas.getRequiredFeatureDE(casType, "place", "net.myerichsen.gedcom.PlaceType", featOkTst);
    casFeatCode_place  = (null == casFeat_place) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_place).getCode();

 
    casFeat_religion = jcas.getRequiredFeatureDE(casType, "religion", "net.myerichsen.gedcom.ReligionType", featOkTst);
    casFeatCode_religion  = (null == casFeat_religion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_religion).getCode();

 
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

 
    casFeat_eventType = jcas.getRequiredFeatureDE(casType, "eventType", "net.myerichsen.gedcom.EventTypeType", featOkTst);
    casFeatCode_eventType  = (null == casFeat_eventType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_eventType).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_vitalType = jcas.getRequiredFeatureDE(casType, "vitalType", "net.myerichsen.gedcom.VitalTypeType", featOkTst);
    casFeatCode_vitalType  = (null == casFeat_vitalType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vitalType).getCode();

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

 
    casFeat_toDate = jcas.getRequiredFeatureDE(casType, "toDate", "uima.cas.String", featOkTst);
    casFeatCode_toDate  = (null == casFeat_toDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_toDate).getCode();

  }
  /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */
  public int getChanged(int addr, int i) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  }
   
   /** @generated */ 
  public String getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_date);
  }
  /** @generated */ 
  public int getEnrichment(int addr) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_enrichment);
  }
  /** @generated */
  public int getEnrichment(int addr, int i) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  }
   
  /** @generated */ 
  public String getEventType(int addr) {
        if (featOkTst && casFeat_eventType == null)
      jcas.throwFeatMissing("eventType", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_eventType);
  }
  /** @generated */ 
  public int getEvidence(int addr) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evidence);
  }
  /** @generated */
  public int getEvidence(int addr, int i) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  }
   
   /** @generated */ 
  public int getExternalID(int addr) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_externalID);
  }
  /** @generated */
  public int getExternalID(int addr, int i) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.EventRecType");
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
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
   /** @generated */ 
  public int getParticipant(int addr) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_participant);
  }
  /** @generated */
  public int getParticipant(int addr, int i) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i);
  }
   
  /** @generated */ 
  public int getPlace(int addr) {
        if (featOkTst && casFeat_place == null)
      jcas.throwFeatMissing("place", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_place);
  }
  /** @generated */ 
  public int getReligion(int addr) {
        if (featOkTst && casFeat_religion == null)
      jcas.throwFeatMissing("religion", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_religion);
  }
  /** @generated */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated */ 
  public int getSubmitter(int addr) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_submitter);
  }
   /** @generated */ 
  public String getToDate(int addr) {
        if (featOkTst && casFeat_toDate == null)
      jcas.throwFeatMissing("toDate", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_toDate);
  }
  /** @generated */ 
  public String getVitalType(int addr) {
        if (featOkTst && casFeat_vitalType == null)
      jcas.throwFeatMissing("vitalType", "net.myerichsen.gedcom.EventRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_vitalType);
  }
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
  /** @generated */ 
  public void setChanged(int addr, int i, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v);
  }
 
 
  /** @generated */    
  public void setDate(int addr, String v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_date, v);}
    
  
 
  /** @generated */    
  public void setEnrichment(int addr, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_enrichment, v);}
    
  /** @generated */ 
  public void setEnrichment(int addr, int i, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v);
  }
 
 
  /** @generated */    
  public void setEventType(int addr, String v) {
        if (featOkTst && casFeat_eventType == null)
      jcas.throwFeatMissing("eventType", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_eventType, v);}
    
  
 
  /** @generated */    
  public void setEvidence(int addr, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_evidence, v);}
    
  /** @generated */ 
  public void setEvidence(int addr, int i, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v);
  }
 
 
  /** @generated */    
  public void setExternalID(int addr, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_externalID, v);}
    
  /** @generated */ 
  public void setExternalID(int addr, int i, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v);
  }
 
 
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
  /** @generated */    
  public void setParticipant(int addr, int v) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_participant, v);}
    
  /** @generated */ 
  public void setParticipant(int addr, int i, int v) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.EventRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_participant), i, v);
  }
 
 
  /** @generated */    
  public void setPlace(int addr, int v) {
        if (featOkTst && casFeat_place == null)
      jcas.throwFeatMissing("place", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_place, v);}
    
  
 
  /** @generated */    
  public void setReligion(int addr, int v) {
        if (featOkTst && casFeat_religion == null)
      jcas.throwFeatMissing("religion", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_religion, v);}
    
  
 
  /** @generated */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  
 
  /** @generated */    
  public void setSubmitter(int addr, int v) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_submitter, v);}
    
  
 
  /** @generated */    
  public void setToDate(int addr, String v) {
        if (featOkTst && casFeat_toDate == null)
      jcas.throwFeatMissing("toDate", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_toDate, v);}
    
  



  /** @generated */    
  public void setVitalType(int addr, String v) {
        if (featOkTst && casFeat_vitalType == null)
      jcas.throwFeatMissing("vitalType", "net.myerichsen.gedcom.EventRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_vitalType, v);}
    
  
 
}



    