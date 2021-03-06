
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
public class RepositoryType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (RepositoryType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = RepositoryType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new RepositoryType(addr, RepositoryType_Type.this);
  			   RepositoryType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new RepositoryType(addr, RepositoryType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = RepositoryType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.RepositoryType");
  /** @generated */
  final Feature casFeat_link;
 
  /** @generated */
  final int     casFeatCode_link;
  /** @generated */
  final Feature casFeat_callNbr;
  /** @generated */
  final int     casFeatCode_callNbr;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public RepositoryType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "net.myerichsen.gedcom.LinkType", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

 
    casFeat_callNbr = jcas.getRequiredFeatureDE(casType, "callNbr", "uima.cas.String", featOkTst);
    casFeatCode_callNbr  = (null == casFeat_callNbr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_callNbr).getCode();

  }
  /** @generated */ 
  public String getCallNbr(int addr) {
        if (featOkTst && casFeat_callNbr == null)
      jcas.throwFeatMissing("callNbr", "net.myerichsen.gedcom.RepositoryType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_callNbr);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.RepositoryType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */    
  public void setCallNbr(int addr, String v) {
        if (featOkTst && casFeat_callNbr == null)
      jcas.throwFeatMissing("callNbr", "net.myerichsen.gedcom.RepositoryType");
    ll_cas.ll_setStringValue(addr, casFeatCode_callNbr, v);}
    
  



  /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.RepositoryType");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
  
 
}



    