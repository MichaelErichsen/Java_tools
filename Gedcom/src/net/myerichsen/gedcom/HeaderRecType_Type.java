
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
public class HeaderRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (HeaderRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = HeaderRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new HeaderRecType(addr, HeaderRecType_Type.this);
  			   HeaderRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new HeaderRecType(addr, HeaderRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = HeaderRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.HeaderRecType");
  /** @generated */
  final Feature casFeat_fileCreation;
 
  /** @generated */
  final int     casFeatCode_fileCreation;
  /** @generated */
  final Feature casFeat_citation;
  /** @generated */
  final int     casFeatCode_citation;
  /** @generated */
  final Feature casFeat_submitter;
    
  
 
  /** @generated */
  final int     casFeatCode_submitter;
  /** @generated */
  final Feature casFeat_note;
  /** @generated */
  final int     casFeatCode_note;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public HeaderRecType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_fileCreation = jcas.getRequiredFeatureDE(casType, "fileCreation", "net.myerichsen.gedcom.FileCreationType", featOkTst);
    casFeatCode_fileCreation  = (null == casFeat_fileCreation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fileCreation).getCode();

 
    casFeat_citation = jcas.getRequiredFeatureDE(casType, "citation", "net.myerichsen.gedcom.CitationType", featOkTst);
    casFeatCode_citation  = (null == casFeat_citation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_citation).getCode();

 
    casFeat_submitter = jcas.getRequiredFeatureDE(casType, "submitter", "net.myerichsen.gedcom.SubmitterType", featOkTst);
    casFeatCode_submitter  = (null == casFeat_submitter) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_submitter).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "net.myerichsen.gedcom.NoteType", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

  }
  /** @generated */ 
  public int getCitation(int addr) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.HeaderRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_citation);
  }
  /** @generated */ 
  public int getFileCreation(int addr) {
        if (featOkTst && casFeat_fileCreation == null)
      jcas.throwFeatMissing("fileCreation", "net.myerichsen.gedcom.HeaderRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_fileCreation);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.HeaderRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */ 
  public int getSubmitter(int addr) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.HeaderRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_submitter);
  }
  /** @generated */    
  public void setCitation(int addr, int v) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.HeaderRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_citation, v);}
    
  
 
  /** @generated */    
  public void setFileCreation(int addr, int v) {
        if (featOkTst && casFeat_fileCreation == null)
      jcas.throwFeatMissing("fileCreation", "net.myerichsen.gedcom.HeaderRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_fileCreation, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.HeaderRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  



  /** @generated */    
  public void setSubmitter(int addr, int v) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.HeaderRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_submitter, v);}
    
  
 
}



    