
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
public class SubmitterType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SubmitterType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SubmitterType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SubmitterType(addr, SubmitterType_Type.this);
  			   SubmitterType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SubmitterType(addr, SubmitterType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = SubmitterType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.SubmitterType");
  /** @generated */
  final Feature casFeat_link;
 
  /** @generated */
  final int     casFeatCode_link;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SubmitterType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "net.myerichsen.gedcom.LinkType", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.SubmitterType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.SubmitterType");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
  



}



    