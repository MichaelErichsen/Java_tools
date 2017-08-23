
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
public class DupIndivType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DupIndivType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DupIndivType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DupIndivType(addr, DupIndivType_Type.this);
  			   DupIndivType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DupIndivType(addr, DupIndivType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = DupIndivType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.DupIndivType");
  /** @generated */
  final Feature casFeat_link;
 
  /** @generated */
  final int     casFeatCode_link;
  /** @generated */
  final Feature casFeat_note;
  /** @generated */
  final int     casFeatCode_note;
  /** @generated */
  final Feature casFeat_citation;
    
  
 
  /** @generated */
  final int     casFeatCode_citation;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DupIndivType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "net.myerichsen.gedcom.LinkType", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "uima.cas.FSArray", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

 
    casFeat_citation = jcas.getRequiredFeatureDE(casType, "citation", "uima.cas.FSArray", featOkTst);
    casFeatCode_citation  = (null == casFeat_citation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_citation).getCode();

  }
  /** @generated */ 
  public int getCitation(int addr) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.DupIndivType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_citation);
  }
  /** @generated */
  public int getCitation(int addr, int i) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.DupIndivType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i);
  }
   
   /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.DupIndivType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.DupIndivType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.DupIndivType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */    
  public void setCitation(int addr, int v) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.DupIndivType");
    ll_cas.ll_setRefValue(addr, casFeatCode_citation, v);}
    
  /** @generated */ 
  public void setCitation(int addr, int i, int v) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.DupIndivType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i, v);
  }
 



   /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.DupIndivType");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.DupIndivType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.DupIndivType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
}



    