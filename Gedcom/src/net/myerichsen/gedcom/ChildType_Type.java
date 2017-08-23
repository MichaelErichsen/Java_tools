
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
public class ChildType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ChildType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ChildType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ChildType(addr, ChildType_Type.this);
  			   ChildType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ChildType(addr, ChildType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = ChildType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.ChildType");
  /** @generated */
  final Feature casFeat_link;
 
  /** @generated */
  final int     casFeatCode_link;
  /** @generated */
  final Feature casFeat_childNbr;
  /** @generated */
  final int     casFeatCode_childNbr;
  /** @generated */
  final Feature casFeat_relToFath;
    
  
 
  /** @generated */
  final int     casFeatCode_relToFath;
  /** @generated */
  final Feature casFeat_relToMoth;
  /** @generated */
  final int     casFeatCode_relToMoth;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ChildType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "net.myerichsen.gedcom.LinkType", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

 
    casFeat_childNbr = jcas.getRequiredFeatureDE(casType, "childNbr", "uima.cas.String", featOkTst);
    casFeatCode_childNbr  = (null == casFeat_childNbr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_childNbr).getCode();

 
    casFeat_relToFath = jcas.getRequiredFeatureDE(casType, "relToFath", "net.myerichsen.gedcom.RelToFathType", featOkTst);
    casFeatCode_relToFath  = (null == casFeat_relToFath) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relToFath).getCode();

 
    casFeat_relToMoth = jcas.getRequiredFeatureDE(casType, "relToMoth", "net.myerichsen.gedcom.RelToMothType", featOkTst);
    casFeatCode_relToMoth  = (null == casFeat_relToMoth) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relToMoth).getCode();

  }
  /** @generated */ 
  public String getChildNbr(int addr) {
        if (featOkTst && casFeat_childNbr == null)
      jcas.throwFeatMissing("childNbr", "net.myerichsen.gedcom.ChildType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_childNbr);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.ChildType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */ 
  public String getRelToFath(int addr) {
        if (featOkTst && casFeat_relToFath == null)
      jcas.throwFeatMissing("relToFath", "net.myerichsen.gedcom.ChildType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relToFath);
  }
  /** @generated */ 
  public String getRelToMoth(int addr) {
        if (featOkTst && casFeat_relToMoth == null)
      jcas.throwFeatMissing("relToMoth", "net.myerichsen.gedcom.ChildType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relToMoth);
  }
  /** @generated */    
  public void setChildNbr(int addr, String v) {
        if (featOkTst && casFeat_childNbr == null)
      jcas.throwFeatMissing("childNbr", "net.myerichsen.gedcom.ChildType");
    ll_cas.ll_setStringValue(addr, casFeatCode_childNbr, v);}
    
  
 
  /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.ChildType");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
  
 
  /** @generated */    
  public void setRelToFath(int addr, String v) {
        if (featOkTst && casFeat_relToFath == null)
      jcas.throwFeatMissing("relToFath", "net.myerichsen.gedcom.ChildType");
    ll_cas.ll_setStringValue(addr, casFeatCode_relToFath, v);}
    
  
 
  /** @generated */    
  public void setRelToMoth(int addr, String v) {
        if (featOkTst && casFeat_relToMoth == null)
      jcas.throwFeatMissing("relToMoth", "net.myerichsen.gedcom.ChildType");
    ll_cas.ll_setStringValue(addr, casFeatCode_relToMoth, v);}
    
  



}



    