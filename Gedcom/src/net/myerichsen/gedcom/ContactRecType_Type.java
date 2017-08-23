
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
public class ContactRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ContactRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ContactRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ContactRecType(addr, ContactRecType_Type.this);
  			   ContactRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ContactRecType(addr, ContactRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = ContactRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.ContactRecType");
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
  final Feature casFeat_public;
 
 
  /** @generated */
  final int     casFeatCode_public;
  /** @generated */
  final Feature casFeat_note;
  /** @generated */
  final int     casFeatCode_note;
  /** @generated */
  final Feature casFeat_changed;
    
   /** @generated */
  final int     casFeatCode_changed;
   
  /** @generated */
  final Feature casFeat_sameIndiv;
 
 
  /** @generated */
  final int     casFeatCode_sameIndiv;
  /** @generated */
  final Feature casFeat_contactType;
  /** @generated */
  final int     casFeatCode_contactType;
  /** @generated */
  final Feature casFeat_id;
    
   /** @generated */
  final int     casFeatCode_id;
   
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ContactRecType_Type(JCas jcas, Type casType) {
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

 
    casFeat_public = jcas.getRequiredFeatureDE(casType, "public", "net.myerichsen.gedcom.PublicType", featOkTst);
    casFeatCode_public  = (null == casFeat_public) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_public).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "uima.cas.FSArray", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

 
    casFeat_changed = jcas.getRequiredFeatureDE(casType, "changed", "uima.cas.FSArray", featOkTst);
    casFeatCode_changed  = (null == casFeat_changed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changed).getCode();

 
    casFeat_sameIndiv = jcas.getRequiredFeatureDE(casType, "sameIndiv", "uima.cas.FSArray", featOkTst);
    casFeatCode_sameIndiv  = (null == casFeat_sameIndiv) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sameIndiv).getCode();

 
    casFeat_contactType = jcas.getRequiredFeatureDE(casType, "contactType", "uima.cas.String", featOkTst);
    casFeatCode_contactType  = (null == casFeat_contactType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contactType).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

  }
  /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */
  public int getChanged(int addr, int i) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  }
   
  /** @generated */ 
  public String getContactType(int addr) {
        if (featOkTst && casFeat_contactType == null)
      jcas.throwFeatMissing("contactType", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_contactType);
  }
  /** @generated */ 
  public int getEmail(int addr) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_email);
  }
   /** @generated */
  public String getEmail(int addr, int i) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.ContactRecType");
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
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */ 
  public int getMailAddress(int addr) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress);
  }
  /** @generated */
  public int getMailAddress(int addr, int i) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
  }
   
  /** @generated */ 
  public int getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_name);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */ 
  public int getPhone(int addr) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_phone);
  }
  /** @generated */
  public int getPhone(int addr, int i) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
  }
   
   /** @generated */ 
  public String getPublic(int addr) {
        if (featOkTst && casFeat_public == null)
      jcas.throwFeatMissing("public", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_public);
  }
  /** @generated */ 
  public int getSameIndiv(int addr) {
        if (featOkTst && casFeat_sameIndiv == null)
      jcas.throwFeatMissing("sameIndiv", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sameIndiv);
  }
  /** @generated */
  public int getSameIndiv(int addr, int i) {
        if (featOkTst && casFeat_sameIndiv == null)
      jcas.throwFeatMissing("sameIndiv", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sameIndiv), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sameIndiv), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sameIndiv), i);
  }
   
  /** @generated */ 
  public int getURI(int addr) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.ContactRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_uRI);
  }
  /** @generated */
  public String getURI(int addr, int i) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
  }
   
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
   /** @generated */ 
  public void setChanged(int addr, int i, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v);
  }
 
 
  /** @generated */    
  public void setContactType(int addr, String v) {
        if (featOkTst && casFeat_contactType == null)
      jcas.throwFeatMissing("contactType", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_contactType, v);}
    
  
 
  /** @generated */    
  public void setEmail(int addr, int v) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_email, v);}
    
  /** @generated */ 
  public void setEmail(int addr, int i, String v) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_email), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_email), i, v);
  }
 
 
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  



  /** @generated */    
  public void setMailAddress(int addr, int v) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_mailAddress, v);}
    
   /** @generated */ 
  public void setMailAddress(int addr, int i, int v) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress), i, v);
  }
 
 
  /** @generated */    
  public void setName(int addr, int v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
  /** @generated */    
  public void setPhone(int addr, int v) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_phone, v);}
    
  /** @generated */ 
  public void setPhone(int addr, int i, int v) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_phone), i, v);
  }
 
 
  /** @generated */    
  public void setPublic(int addr, String v) {
        if (featOkTst && casFeat_public == null)
      jcas.throwFeatMissing("public", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_public, v);}
    
  
 
  /** @generated */    
  public void setSameIndiv(int addr, int v) {
        if (featOkTst && casFeat_sameIndiv == null)
      jcas.throwFeatMissing("sameIndiv", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_sameIndiv, v);}
    
  /** @generated */ 
  public void setSameIndiv(int addr, int i, int v) {
        if (featOkTst && casFeat_sameIndiv == null)
      jcas.throwFeatMissing("sameIndiv", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sameIndiv), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sameIndiv), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sameIndiv), i, v);
  }
 
 
  /** @generated */    
  public void setURI(int addr, int v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.ContactRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_uRI, v);}
    
  /** @generated */ 
  public void setURI(int addr, int i, String v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.ContactRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, v);
  }
 
 
}



    