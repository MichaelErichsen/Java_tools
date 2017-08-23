
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
 * Updated by JCasGen Wed Apr 10 09:47:32 CEST 2013
 * @generated */
public class ChangedType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ChangedType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ChangedType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ChangedType(addr, ChangedType_Type.this);
  			   ChangedType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ChangedType(addr, ChangedType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = ChangedType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.ChangedType");
  /** @generated */
  final Feature casFeat_contact;
 
  /** @generated */
  final int     casFeatCode_contact;
  /** @generated */
  final Feature casFeat_note;
  /** @generated */
  final int     casFeatCode_note;
  /** @generated */
  final Feature casFeat_changedDate;
    
  
 
  /** @generated */
  final int     casFeatCode_changedDate;
  /** @generated */
  final Feature casFeat_changedTime;
  /** @generated */
  final int     casFeatCode_changedTime;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ChangedType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_contact = jcas.getRequiredFeatureDE(casType, "contact", "net.myerichsen.gedcom.ContactType", featOkTst);
    casFeatCode_contact  = (null == casFeat_contact) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contact).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "net.myerichsen.gedcom.NoteType", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

 
    casFeat_changedDate = jcas.getRequiredFeatureDE(casType, "changedDate", "uima.cas.String", featOkTst);
    casFeatCode_changedDate  = (null == casFeat_changedDate) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changedDate).getCode();

 
    casFeat_changedTime = jcas.getRequiredFeatureDE(casType, "changedTime", "uima.cas.String", featOkTst);
    casFeatCode_changedTime  = (null == casFeat_changedTime) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changedTime).getCode();

  }
  /** @generated */ 
  public String getChangedDate(int addr) {
        if (featOkTst && casFeat_changedDate == null)
      jcas.throwFeatMissing("changedDate", "net.myerichsen.gedcom.ChangedType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_changedDate);
  }
  /** @generated */ 
  public String getChangedTime(int addr) {
        if (featOkTst && casFeat_changedTime == null)
      jcas.throwFeatMissing("changedTime", "net.myerichsen.gedcom.ChangedType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_changedTime);
  }
  /** @generated */ 
  public int getContact(int addr) {
        if (featOkTst && casFeat_contact == null)
      jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.ChangedType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_contact);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.ChangedType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */    
  public void setChangedDate(int addr, String v) {
        if (featOkTst && casFeat_changedDate == null)
      jcas.throwFeatMissing("changedDate", "net.myerichsen.gedcom.ChangedType");
    ll_cas.ll_setStringValue(addr, casFeatCode_changedDate, v);}
    
  
 
  /** @generated */    
  public void setChangedTime(int addr, String v) {
        if (featOkTst && casFeat_changedTime == null)
      jcas.throwFeatMissing("changedTime", "net.myerichsen.gedcom.ChangedType");
    ll_cas.ll_setStringValue(addr, casFeatCode_changedTime, v);}
    
  



  /** @generated */    
  public void setContact(int addr, int v) {
        if (featOkTst && casFeat_contact == null)
      jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.ChangedType");
    ll_cas.ll_setRefValue(addr, casFeatCode_contact, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.ChangedType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  
 
}



    