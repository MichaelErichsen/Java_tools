
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
public class BasedOnType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BasedOnType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BasedOnType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BasedOnType(addr, BasedOnType_Type.this);
  			   BasedOnType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BasedOnType(addr, BasedOnType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = BasedOnType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.BasedOnType");
  /** @generated */
  final Feature casFeat_link;
 
  /** @generated */
  final int     casFeatCode_link;
  /** @generated */
  final Feature casFeat_note;
  /** @generated */
  final int     casFeatCode_note;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BasedOnType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "uima.cas.FSArray", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "uima.cas.FSArray", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

  }
   /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.BasedOnType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */
  public int getLink(int addr, int i) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.BasedOnType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_link), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_link), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_link), i);
  }
   
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.BasedOnType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.BasedOnType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.BasedOnType");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
   /** @generated */ 
  public void setLink(int addr, int i, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.BasedOnType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_link), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_link), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_link), i, v);
  }
 
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.BasedOnType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.BasedOnType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 



}



    