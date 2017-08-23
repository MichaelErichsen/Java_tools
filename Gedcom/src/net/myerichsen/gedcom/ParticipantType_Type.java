
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
 * Updated by JCasGen Wed Apr 10 09:47:37 CEST 2013
 * @generated */
public class ParticipantType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (ParticipantType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = ParticipantType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new ParticipantType(addr, ParticipantType_Type.this);
  			   ParticipantType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new ParticipantType(addr, ParticipantType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = ParticipantType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.ParticipantType");
  /** @generated */
  final Feature casFeat_link;
 
  /** @generated */
  final int     casFeatCode_link;
  /** @generated */
  final Feature casFeat_role;
  /** @generated */
  final int     casFeatCode_role;
  /** @generated */
  final Feature casFeat_living;
    
  
 
  /** @generated */
  final int     casFeatCode_living;
  /** @generated */
  final Feature casFeat_age;
  /** @generated */
  final int     casFeatCode_age;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public ParticipantType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "net.myerichsen.gedcom.LinkType", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

 
    casFeat_role = jcas.getRequiredFeatureDE(casType, "role", "uima.cas.String", featOkTst);
    casFeatCode_role  = (null == casFeat_role) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_role).getCode();

 
    casFeat_living = jcas.getRequiredFeatureDE(casType, "living", "net.myerichsen.gedcom.LivingType", featOkTst);
    casFeatCode_living  = (null == casFeat_living) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_living).getCode();

 
    casFeat_age = jcas.getRequiredFeatureDE(casType, "age", "uima.cas.String", featOkTst);
    casFeatCode_age  = (null == casFeat_age) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_age).getCode();

  }
  /** @generated */ 
  public String getAge(int addr) {
        if (featOkTst && casFeat_age == null)
      jcas.throwFeatMissing("age", "net.myerichsen.gedcom.ParticipantType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_age);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.ParticipantType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */ 
  public String getLiving(int addr) {
        if (featOkTst && casFeat_living == null)
      jcas.throwFeatMissing("living", "net.myerichsen.gedcom.ParticipantType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_living);
  }
  /** @generated */ 
  public String getRole(int addr) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "net.myerichsen.gedcom.ParticipantType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_role);
  }
  /** @generated */    
  public void setAge(int addr, String v) {
        if (featOkTst && casFeat_age == null)
      jcas.throwFeatMissing("age", "net.myerichsen.gedcom.ParticipantType");
    ll_cas.ll_setStringValue(addr, casFeatCode_age, v);}
    
  



  /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.ParticipantType");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
  
 
  /** @generated */    
  public void setLiving(int addr, String v) {
        if (featOkTst && casFeat_living == null)
      jcas.throwFeatMissing("living", "net.myerichsen.gedcom.ParticipantType");
    ll_cas.ll_setStringValue(addr, casFeatCode_living, v);}
    
  
 
  /** @generated */    
  public void setRole(int addr, String v) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "net.myerichsen.gedcom.ParticipantType");
    ll_cas.ll_setStringValue(addr, casFeatCode_role, v);}
    
  
 
}



    