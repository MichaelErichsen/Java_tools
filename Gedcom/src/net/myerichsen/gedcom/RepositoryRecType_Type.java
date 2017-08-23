
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
public class RepositoryRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (RepositoryRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = RepositoryRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new RepositoryRecType(addr, RepositoryRecType_Type.this);
  			   RepositoryRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new RepositoryRecType(addr, RepositoryRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = RepositoryRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.RepositoryRecType");
  /** @generated */
  final Feature casFeat_name;
 
  /** @generated */
  final int     casFeatCode_name;
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
  final Feature casFeat_note;
 
 
  /** @generated */
  final int     casFeatCode_note;
  /** @generated */
  final Feature casFeat_changed;
  /** @generated */
  final int     casFeatCode_changed;
  /** @generated */
  final Feature casFeat_id;
    
   /** @generated */
  final int     casFeatCode_id;
   
  /** @generated */
  final Feature casFeat_repositoryType;
 
 
  /** @generated */
  final int     casFeatCode_repositoryType;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public RepositoryRecType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "net.myerichsen.gedcom.NameType", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_mailAddress = jcas.getRequiredFeatureDE(casType, "mailAddress", "uima.cas.FSArray", featOkTst);
    casFeatCode_mailAddress  = (null == casFeat_mailAddress) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mailAddress).getCode();

 
    casFeat_phone = jcas.getRequiredFeatureDE(casType, "phone", "uima.cas.FSArray", featOkTst);
    casFeatCode_phone  = (null == casFeat_phone) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phone).getCode();

 
    casFeat_email = jcas.getRequiredFeatureDE(casType, "email", "uima.cas.StringArray", featOkTst);
    casFeatCode_email  = (null == casFeat_email) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_email).getCode();

 
    casFeat_uRI = jcas.getRequiredFeatureDE(casType, "uRI", "uima.cas.StringArray", featOkTst);
    casFeatCode_uRI  = (null == casFeat_uRI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uRI).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "uima.cas.FSArray", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

 
    casFeat_changed = jcas.getRequiredFeatureDE(casType, "changed", "uima.cas.FSArray", featOkTst);
    casFeatCode_changed  = (null == casFeat_changed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changed).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_repositoryType = jcas.getRequiredFeatureDE(casType, "repositoryType", "uima.cas.String", featOkTst);
    casFeatCode_repositoryType  = (null == casFeat_repositoryType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_repositoryType).getCode();

  }
  /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */
  public int getChanged(int addr, int i) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  }
   
   /** @generated */ 
  public int getEmail(int addr) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_email);
  }
  /** @generated */
  public String getEmail(int addr, int i) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_email), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i);
  }
   
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */ 
  public int getMailAddress(int addr) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress);
  }
  /** @generated */
  public int getMailAddress(int addr, int i) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
  }
   
   /** @generated */ 
  public int getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_name);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */ 
  public int getPhone(int addr) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_phone);
  }
  /** @generated */
  public int getPhone(int addr, int i) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
  }
   
  /** @generated */ 
  public String getRepositoryType(int addr) {
        if (featOkTst && casFeat_repositoryType == null)
      jcas.throwFeatMissing("repositoryType", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_repositoryType);
  }
   /** @generated */ 
  public int getURI(int addr) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.RepositoryRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_uRI);
  }
  /** @generated */
  public String getURI(int addr, int i) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
  }
   
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
  /** @generated */ 
  public void setChanged(int addr, int i, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v);
  }
 
 
  /** @generated */    
  public void setEmail(int addr, int v) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_email, v);}
    
  /** @generated */ 
  public void setEmail(int addr, int i, String v) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_email), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i, v);
  }
 
 
   /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */    
  public void setMailAddress(int addr, int v) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_mailAddress, v);}
    
  /** @generated */ 
  public void setMailAddress(int addr, int i, int v) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, v);
  }
 
 
  /** @generated */    
  public void setName(int addr, int v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
  /** @generated */    
  public void setPhone(int addr, int v) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_phone, v);}
    
  /** @generated */ 
  public void setPhone(int addr, int i, int v) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, v);
  }
 
 
  /** @generated */    
  public void setRepositoryType(int addr, String v) {
        if (featOkTst && casFeat_repositoryType == null)
      jcas.throwFeatMissing("repositoryType", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_repositoryType, v);}
    
  



  /** @generated */    
  public void setURI(int addr, int v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.RepositoryRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_uRI, v);}
    
  /** @generated */ 
  public void setURI(int addr, int i, String v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.RepositoryRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, v);
  }
 
 
}



    