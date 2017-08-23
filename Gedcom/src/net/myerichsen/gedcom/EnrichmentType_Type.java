
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
public class EnrichmentType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EnrichmentType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EnrichmentType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EnrichmentType(addr, EnrichmentType_Type.this);
  			   EnrichmentType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EnrichmentType(addr, EnrichmentType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = EnrichmentType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.EnrichmentType");
  /** @generated */
  final Feature casFeat_citation;
 
  /** @generated */
  final int     casFeatCode_citation;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public EnrichmentType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_citation = jcas.getRequiredFeatureDE(casType, "citation", "uima.cas.FSArray", featOkTst);
    casFeatCode_citation  = (null == casFeat_citation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_citation).getCode();

  }
  /** @generated */ 
  public int getCitation(int addr) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.EnrichmentType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_citation);
  }
  /** @generated */
  public int getCitation(int addr, int i) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.EnrichmentType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i);
  }
   
   /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */    
  public void setCitation(int addr, int v) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.EnrichmentType");
    ll_cas.ll_setRefValue(addr, casFeatCode_citation, v);}
    
  /** @generated */ 
  public void setCitation(int addr, int i, int v) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.EnrichmentType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_citation), i, v);
  }
 



}



    