
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
public class HusbFathType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (HusbFathType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = HusbFathType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new HusbFathType(addr, HusbFathType_Type.this);
  			   HusbFathType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new HusbFathType(addr, HusbFathType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = HusbFathType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.HusbFathType");
  /** @generated */
  final Feature casFeat_link;
 
  /** @generated */
  final int     casFeatCode_link;
  /** @generated */
  final Feature casFeat_familyNbr;
  /** @generated */
  final int     casFeatCode_familyNbr;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public HusbFathType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "net.myerichsen.gedcom.LinkType", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

 
    casFeat_familyNbr = jcas.getRequiredFeatureDE(casType, "familyNbr", "net.myerichsen.gedcom.FamilyNbrType", featOkTst);
    casFeatCode_familyNbr  = (null == casFeat_familyNbr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_familyNbr).getCode();

  }
  /** @generated */ 
  public int getFamilyNbr(int addr) {
        if (featOkTst && casFeat_familyNbr == null)
      jcas.throwFeatMissing("familyNbr", "net.myerichsen.gedcom.HusbFathType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_familyNbr);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.HusbFathType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */    
  public void setFamilyNbr(int addr, int v) {
        if (featOkTst && casFeat_familyNbr == null)
      jcas.throwFeatMissing("familyNbr", "net.myerichsen.gedcom.HusbFathType");
    ll_cas.ll_setRefValue(addr, casFeatCode_familyNbr, v);}
    
  



  /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.HusbFathType");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
  
 
}



    