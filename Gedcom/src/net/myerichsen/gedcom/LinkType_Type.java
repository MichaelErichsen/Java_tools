
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
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * @generated */
public class LinkType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (LinkType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = LinkType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new LinkType(addr, LinkType_Type.this);
  			   LinkType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new LinkType(addr, LinkType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = LinkType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.LinkType");
  /** @generated */
  final Feature casFeat_ref;
 
  /** @generated */
  final int     casFeatCode_ref;
  /** @generated */
  final Feature casFeat_target;
  /** @generated */
  final int     casFeatCode_target;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public LinkType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ref = jcas.getRequiredFeatureDE(casType, "ref", "uima.cas.String", featOkTst);
    casFeatCode_ref  = (null == casFeat_ref) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ref).getCode();

 
    casFeat_target = jcas.getRequiredFeatureDE(casType, "target", "uima.cas.String", featOkTst);
    casFeatCode_target  = (null == casFeat_target) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_target).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getRef(int addr) {
        if (featOkTst && casFeat_ref == null)
      jcas.throwFeatMissing("ref", "net.myerichsen.gedcom.LinkType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_ref);
  }
  /** @generated */ 
  public String getTarget(int addr) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "net.myerichsen.gedcom.LinkType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_target);
  }
  /** @generated */    
  public void setRef(int addr, String v) {
        if (featOkTst && casFeat_ref == null)
      jcas.throwFeatMissing("ref", "net.myerichsen.gedcom.LinkType");
    ll_cas.ll_setStringValue(addr, casFeatCode_ref, v);}
    
  
 
  /** @generated */    
  public void setTarget(int addr, String v) {
        if (featOkTst && casFeat_target == null)
      jcas.throwFeatMissing("target", "net.myerichsen.gedcom.LinkType");
    ll_cas.ll_setStringValue(addr, casFeatCode_target, v);}
    
  



}



    