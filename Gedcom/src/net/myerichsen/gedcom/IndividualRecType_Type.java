
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
public class IndividualRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (IndividualRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = IndividualRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new IndividualRecType(addr, IndividualRecType_Type.this);
  			   IndividualRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new IndividualRecType(addr, IndividualRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = IndividualRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.IndividualRecType");
  /** @generated */
  final Feature casFeat_indivName;
 
  /** @generated */
  final int     casFeatCode_indivName;
  /** @generated */
  final Feature casFeat_gender;
  /** @generated */
  final int     casFeatCode_gender;
  /** @generated */
  final Feature casFeat_deathStatus;
    
   /** @generated */
  final int     casFeatCode_deathStatus;
   
  /** @generated */
  final Feature casFeat_persInfo;
 
 
  /** @generated */
  final int     casFeatCode_persInfo;
  /** @generated */
  final Feature casFeat_assocIndiv;
  /** @generated */
  final int     casFeatCode_assocIndiv;
  /** @generated */
  final Feature casFeat_dupIndiv;
    
  
 
  /** @generated */
  final int     casFeatCode_dupIndiv;
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
  final Feature casFeat_source;
 
 
  /** @generated */
  final int     casFeatCode_source;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public IndividualRecType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_indivName = jcas.getRequiredFeatureDE(casType, "indivName", "uima.cas.FSArray", featOkTst);
    casFeatCode_indivName  = (null == casFeat_indivName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indivName).getCode();

 
    casFeat_gender = jcas.getRequiredFeatureDE(casType, "gender", "net.myerichsen.gedcom.GenderType", featOkTst);
    casFeatCode_gender  = (null == casFeat_gender) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gender).getCode();

 
    casFeat_deathStatus = jcas.getRequiredFeatureDE(casType, "deathStatus", "net.myerichsen.gedcom.DeathStatusType", featOkTst);
    casFeatCode_deathStatus  = (null == casFeat_deathStatus) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_deathStatus).getCode();

 
    casFeat_persInfo = jcas.getRequiredFeatureDE(casType, "persInfo", "uima.cas.FSArray", featOkTst);
    casFeatCode_persInfo  = (null == casFeat_persInfo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_persInfo).getCode();

 
    casFeat_assocIndiv = jcas.getRequiredFeatureDE(casType, "assocIndiv", "uima.cas.FSArray", featOkTst);
    casFeatCode_assocIndiv  = (null == casFeat_assocIndiv) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_assocIndiv).getCode();

 
    casFeat_dupIndiv = jcas.getRequiredFeatureDE(casType, "dupIndiv", "uima.cas.FSArray", featOkTst);
    casFeatCode_dupIndiv  = (null == casFeat_dupIndiv) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dupIndiv).getCode();

 
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

 
    casFeat_source = jcas.getRequiredFeatureDE(casType, "source", "uima.cas.String", featOkTst);
    casFeatCode_source  = (null == casFeat_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_source).getCode();

  }
  /** @generated */ 
  public int getAssocIndiv(int addr) {
        if (featOkTst && casFeat_assocIndiv == null)
      jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_assocIndiv);
  }
  /** @generated */
  public int getAssocIndiv(int addr, int i) {
        if (featOkTst && casFeat_assocIndiv == null)
      jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_assocIndiv), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_assocIndiv), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_assocIndiv), i);
  }
   
   /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */
  public int getChanged(int addr, int i) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  }
   
  /** @generated */ 
  public String getDeathStatus(int addr) {
        if (featOkTst && casFeat_deathStatus == null)
      jcas.throwFeatMissing("deathStatus", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_deathStatus);
  }
  /** @generated */ 
  public int getDupIndiv(int addr) {
        if (featOkTst && casFeat_dupIndiv == null)
      jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_dupIndiv);
  }
  /** @generated */
  public int getDupIndiv(int addr, int i) {
        if (featOkTst && casFeat_dupIndiv == null)
      jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_dupIndiv), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_dupIndiv), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_dupIndiv), i);
  }
   
  /** @generated */ 
  public int getEnrichment(int addr) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_enrichment);
  }
   /** @generated */
  public int getEnrichment(int addr, int i) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  }
   
  /** @generated */ 
  public int getEvidence(int addr) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evidence);
  }
  /** @generated */
  public int getEvidence(int addr, int i) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  }
   
  /** @generated */ 
  public int getExternalID(int addr) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_externalID);
  }
  /** @generated */
  public int getExternalID(int addr, int i) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
  }
   
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getGender(int addr) {
        if (featOkTst && casFeat_gender == null)
      jcas.throwFeatMissing("gender", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gender);
  }
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */ 
  public int getIndivName(int addr) {
        if (featOkTst && casFeat_indivName == null)
      jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_indivName);
  }
  /** @generated */
  public int getIndivName(int addr, int i) {
        if (featOkTst && casFeat_indivName == null)
      jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indivName), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_indivName), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indivName), i);
  }
   
   /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */ 
  public int getPersInfo(int addr) {
        if (featOkTst && casFeat_persInfo == null)
      jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_persInfo);
  }
  /** @generated */
  public int getPersInfo(int addr, int i) {
        if (featOkTst && casFeat_persInfo == null)
      jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_persInfo), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_persInfo), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_persInfo), i);
  }
   
  /** @generated */ 
  public String getSource(int addr) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_source);
  }
  /** @generated */ 
  public int getSubmitter(int addr) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.IndividualRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_submitter);
  }
   /** @generated */    
  public void setAssocIndiv(int addr, int v) {
        if (featOkTst && casFeat_assocIndiv == null)
      jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_assocIndiv, v);}
    
  /** @generated */ 
  public void setAssocIndiv(int addr, int i, int v) {
        if (featOkTst && casFeat_assocIndiv == null)
      jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_assocIndiv), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_assocIndiv), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_assocIndiv), i, v);
  }
 
 
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
  /** @generated */ 
  public void setChanged(int addr, int i, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v);
  }
 
 
  /** @generated */    
  public void setDeathStatus(int addr, String v) {
        if (featOkTst && casFeat_deathStatus == null)
      jcas.throwFeatMissing("deathStatus", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_deathStatus, v);}
    
  
 
  /** @generated */    
  public void setDupIndiv(int addr, int v) {
        if (featOkTst && casFeat_dupIndiv == null)
      jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_dupIndiv, v);}
    
   /** @generated */ 
  public void setDupIndiv(int addr, int i, int v) {
        if (featOkTst && casFeat_dupIndiv == null)
      jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_dupIndiv), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_dupIndiv), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_dupIndiv), i, v);
  }
 
 
  /** @generated */    
  public void setEnrichment(int addr, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_enrichment, v);}
    
  /** @generated */ 
  public void setEnrichment(int addr, int i, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v);
  }
 
 
  /** @generated */    
  public void setEvidence(int addr, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_evidence, v);}
    
  /** @generated */ 
  public void setEvidence(int addr, int i, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v);
  }
 
 
  /** @generated */    
  public void setExternalID(int addr, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_externalID, v);}
    
   /** @generated */ 
  public void setExternalID(int addr, int i, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v);
  }
 
 
  /** @generated */    
  public void setGender(int addr, String v) {
        if (featOkTst && casFeat_gender == null)
      jcas.throwFeatMissing("gender", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_gender, v);}
    
  
 
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */    
  public void setIndivName(int addr, int v) {
        if (featOkTst && casFeat_indivName == null)
      jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_indivName, v);}
    
  /** @generated */ 
  public void setIndivName(int addr, int i, int v) {
        if (featOkTst && casFeat_indivName == null)
      jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indivName), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_indivName), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_indivName), i, v);
  }
 
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
  /** @generated */    
  public void setPersInfo(int addr, int v) {
        if (featOkTst && casFeat_persInfo == null)
      jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_persInfo, v);}
    
  /** @generated */ 
  public void setPersInfo(int addr, int i, int v) {
        if (featOkTst && casFeat_persInfo == null)
      jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.IndividualRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_persInfo), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_persInfo), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_persInfo), i, v);
  }
 
 
  /** @generated */    
  public void setSource(int addr, String v) {
        if (featOkTst && casFeat_source == null)
      jcas.throwFeatMissing("source", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_source, v);}
    
  



  /** @generated */    
  public void setSubmitter(int addr, int v) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.IndividualRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_submitter, v);}
    
  
 
}



    