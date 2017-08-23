
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
public class ExternalIDType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ExternalIDType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ExternalIDType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ExternalIDType(addr, ExternalIDType_Type.this);
  			   ExternalIDType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ExternalIDType(addr, ExternalIDType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = ExternalIDType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.ExternalIDType");
  /** @generated */
  final Feature casFeat_externalIdType;
 
  /** @generated */
  final int     casFeatCode_externalIdType;
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ExternalIDType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_externalIdType = jcas.getRequiredFeatureDE(casType, "externalIdType", "net.myerichsen.gedcom.ExternalIdTypeType", featOkTst);
    casFeatCode_externalIdType  = (null == casFeat_externalIdType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_externalIdType).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

  }
  /** @generated */ 
  public String getExternalIdType(int addr) {
        if (featOkTst && casFeat_externalIdType == null)
      jcas.throwFeatMissing("externalIdType", "net.myerichsen.gedcom.ExternalIDType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_externalIdType);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.ExternalIDType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */    
  public void setExternalIdType(int addr, String v) {
        if (featOkTst && casFeat_externalIdType == null)
      jcas.throwFeatMissing("externalIdType", "net.myerichsen.gedcom.ExternalIDType");
    ll_cas.ll_setStringValue(addr, casFeatCode_externalIdType, v);}
    
  
 
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.ExternalIDType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  



}



    