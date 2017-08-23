
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
public class GroupRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GroupRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GroupRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GroupRecType(addr, GroupRecType_Type.this);
  			   GroupRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GroupRecType(addr, GroupRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = GroupRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.GroupRecType");
  /** @generated */
  final Feature casFeat_name;
 
  /** @generated */
  final int     casFeatCode_name;
  /** @generated */
  final Feature casFeat_contact;
  /** @generated */
  final int     casFeatCode_contact;
  /** @generated */
  final Feature casFeat_member;
    
  
 
  /** @generated */
  final int     casFeatCode_member;
  /** @generated */
  final Feature casFeat_parentGroup;
  /** @generated */
  final int     casFeatCode_parentGroup;
  /** @generated */
  final Feature casFeat_mailAddress;
    
   /** @generated */
  final int     casFeatCode_mailAddress;
   
  /** @generated */
  final Feature casFeat_phone;
 
 
  /** @generated */
  final int     casFeatCode_phone;
  /** @generated */
  final Feature casFeat_email;
  /** @generated */
  final int     casFeatCode_email;
  /** @generated */
  final Feature casFeat_uRI;
    
   /** @generated */
  final int     casFeatCode_uRI;
   
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
  final Feature casFeat_groupType;
 
 
  /** @generated */
  final int     casFeatCode_groupType;
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GroupRecType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "net.myerichsen.gedcom.NameType", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_contact = jcas.getRequiredFeatureDE(casType, "contact", "uima.cas.FSArray", featOkTst);
    casFeatCode_contact  = (null == casFeat_contact) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contact).getCode();

 
    casFeat_member = jcas.getRequiredFeatureDE(casType, "member", "uima.cas.FSArray", featOkTst);
    casFeatCode_member  = (null == casFeat_member) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_member).getCode();

 
    casFeat_parentGroup = jcas.getRequiredFeatureDE(casType, "parentGroup", "uima.cas.FSArray", featOkTst);
    casFeatCode_parentGroup  = (null == casFeat_parentGroup) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parentGroup).getCode();

 
    casFeat_mailAddress = jcas.getRequiredFeatureDE(casType, "mailAddress", "uima.cas.FSArray", featOkTst);
    casFeatCode_mailAddress  = (null == casFeat_mailAddress) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mailAddress).getCode();

 
    casFeat_phone = jcas.getRequiredFeatureDE(casType, "phone", "uima.cas.FSArray", featOkTst);
    casFeatCode_phone  = (null == casFeat_phone) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phone).getCode();

 
    casFeat_email = jcas.getRequiredFeatureDE(casType, "email", "uima.cas.StringArray", featOkTst);
    casFeatCode_email  = (null == casFeat_email) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_email).getCode();

 
    casFeat_uRI = jcas.getRequiredFeatureDE(casType, "uRI", "uima.cas.StringArray", featOkTst);
    casFeatCode_uRI  = (null == casFeat_uRI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uRI).getCode();

 
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

 
    casFeat_groupType = jcas.getRequiredFeatureDE(casType, "groupType", "uima.cas.String", featOkTst);
    casFeatCode_groupType  = (null == casFeat_groupType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_groupType).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

  }
   /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */
  public int getChanged(int addr, int i) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  }
   
  /** @generated */ 
  public int getContact(int addr) {
        if (featOkTst && casFeat_contact == null)
      jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_contact);
  }
  /** @generated */
  public int getContact(int addr, int i) {
        if (featOkTst && casFeat_contact == null)
      jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contact), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_contact), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contact), i);
  }
   
  /** @generated */ 
  public int getEmail(int addr) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_email);
  }
  /** @generated */
  public String getEmail(int addr, int i) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_email), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i);
  }
   
   /** @generated */ 
  public int getEnrichment(int addr) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_enrichment);
  }
  /** @generated */
  public int getEnrichment(int addr, int i) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
  }
   
  /** @generated */ 
  public int getEvidence(int addr) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evidence);
  }
  /** @generated */
  public int getEvidence(int addr, int i) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
  }
   
  /** @generated */ 
  public int getExternalID(int addr) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_externalID);
  }
  /** @generated */
  public int getExternalID(int addr, int i) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
  }
   
   /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getGroupType(int addr) {
        if (featOkTst && casFeat_groupType == null)
      jcas.throwFeatMissing("groupType", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_groupType);
  }
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */ 
  public int getMailAddress(int addr) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress);
  }
  /** @generated */
  public int getMailAddress(int addr, int i) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
  }
   
  /** @generated */ 
  public int getMember(int addr) {
        if (featOkTst && casFeat_member == null)
      jcas.throwFeatMissing("member", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_member);
  }
   /** @generated */
  public int getMember(int addr, int i) {
        if (featOkTst && casFeat_member == null)
      jcas.throwFeatMissing("member", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_member), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_member), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_member), i);
  }
   
  /** @generated */ 
  public int getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_name);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */ 
  public int getParentGroup(int addr) {
        if (featOkTst && casFeat_parentGroup == null)
      jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_parentGroup);
  }
  /** @generated */
  public int getParentGroup(int addr, int i) {
        if (featOkTst && casFeat_parentGroup == null)
      jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_parentGroup), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_parentGroup), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_parentGroup), i);
  }
   
  /** @generated */ 
  public int getPhone(int addr) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_phone);
  }
  /** @generated */
  public int getPhone(int addr, int i) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
  }
   
  /** @generated */ 
  public int getSubmitter(int addr) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_submitter);
  }
  /** @generated */ 
  public int getURI(int addr) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.GroupRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_uRI);
  }
   /** @generated */
  public String getURI(int addr, int i) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
  }
   
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
  /** @generated */ 
  public void setChanged(int addr, int i, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v);
  }
 
 
  /** @generated */    
  public void setContact(int addr, int v) {
        if (featOkTst && casFeat_contact == null)
      jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_contact, v);}
    
  /** @generated */ 
  public void setContact(int addr, int i, int v) {
        if (featOkTst && casFeat_contact == null)
      jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contact), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_contact), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contact), i, v);
  }
 
 
  /** @generated */    
  public void setEmail(int addr, int v) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_email, v);}
    
   /** @generated */ 
  public void setEmail(int addr, int i, String v) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_email), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i, v);
  }
 
 
  /** @generated */    
  public void setEnrichment(int addr, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_enrichment, v);}
    
  /** @generated */ 
  public void setEnrichment(int addr, int i, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_enrichment), i, v);
  }
 
 
  /** @generated */    
  public void setEvidence(int addr, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_evidence, v);}
    
  /** @generated */ 
  public void setEvidence(int addr, int i, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_evidence), i, v);
  }
 
 
  /** @generated */    
  public void setExternalID(int addr, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_externalID, v);}
    
   /** @generated */ 
  public void setExternalID(int addr, int i, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_externalID), i, v);
  }
 
 
  /** @generated */    
  public void setGroupType(int addr, String v) {
        if (featOkTst && casFeat_groupType == null)
      jcas.throwFeatMissing("groupType", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_groupType, v);}
    
  
 
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  



  /** @generated */    
  public void setMailAddress(int addr, int v) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_mailAddress, v);}
    
  /** @generated */ 
  public void setMailAddress(int addr, int i, int v) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, v);
  }
 
 
  /** @generated */    
  public void setMember(int addr, int v) {
        if (featOkTst && casFeat_member == null)
      jcas.throwFeatMissing("member", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_member, v);}
    
   /** @generated */ 
  public void setMember(int addr, int i, int v) {
        if (featOkTst && casFeat_member == null)
      jcas.throwFeatMissing("member", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_member), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_member), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_member), i, v);
  }
 
 
  /** @generated */    
  public void setName(int addr, int v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
  /** @generated */    
  public void setParentGroup(int addr, int v) {
        if (featOkTst && casFeat_parentGroup == null)
      jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_parentGroup, v);}
    
  /** @generated */ 
  public void setParentGroup(int addr, int i, int v) {
        if (featOkTst && casFeat_parentGroup == null)
      jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_parentGroup), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_parentGroup), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_parentGroup), i, v);
  }
 
 
  /** @generated */    
  public void setPhone(int addr, int v) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_phone, v);}
    
  /** @generated */ 
  public void setPhone(int addr, int i, int v) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, v);
  }
 
 
  /** @generated */    
  public void setSubmitter(int addr, int v) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_submitter, v);}
    
  
 
  /** @generated */    
  public void setURI(int addr, int v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.GroupRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_uRI, v);}
    
  /** @generated */ 
  public void setURI(int addr, int i, String v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.GroupRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, v);
  }
 
 
}



    