
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
public class GEDCOMType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GEDCOMType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GEDCOMType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GEDCOMType(addr, GEDCOMType_Type.this);
  			   GEDCOMType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GEDCOMType(addr, GEDCOMType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = GEDCOMType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.GEDCOMType");
  /** @generated */
  final Feature casFeat_headerRec;
 
  /** @generated */
  final int     casFeatCode_headerRec;
  /** @generated */
  final Feature casFeat_familyRec;
  /** @generated */
  final int     casFeatCode_familyRec;
  /** @generated */
  final Feature casFeat_individualRec;
    
  
 
  /** @generated */
  final int     casFeatCode_individualRec;
  /** @generated */
  final Feature casFeat_eventRec;
  /** @generated */
  final int     casFeatCode_eventRec;
  /** @generated */
  final Feature casFeat_lDSOrdRec;
    
   /** @generated */
  final int     casFeatCode_lDSOrdRec;
   
  /** @generated */
  final Feature casFeat_contactRec;
 
 
  /** @generated */
  final int     casFeatCode_contactRec;
  /** @generated */
  final Feature casFeat_sourceRec;
  /** @generated */
  final int     casFeatCode_sourceRec;
  /** @generated */
  final Feature casFeat_repositoryRec;
    
   /** @generated */
  final int     casFeatCode_repositoryRec;
   
  /** @generated */
  final Feature casFeat_groupRec;
 
 
  /** @generated */
  final int     casFeatCode_groupRec;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GEDCOMType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_headerRec = jcas.getRequiredFeatureDE(casType, "headerRec", "net.myerichsen.gedcom.HeaderRecType", featOkTst);
    casFeatCode_headerRec  = (null == casFeat_headerRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_headerRec).getCode();

 
    casFeat_familyRec = jcas.getRequiredFeatureDE(casType, "familyRec", "uima.cas.FSArray", featOkTst);
    casFeatCode_familyRec  = (null == casFeat_familyRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_familyRec).getCode();

 
    casFeat_individualRec = jcas.getRequiredFeatureDE(casType, "individualRec", "uima.cas.FSArray", featOkTst);
    casFeatCode_individualRec  = (null == casFeat_individualRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_individualRec).getCode();

 
    casFeat_eventRec = jcas.getRequiredFeatureDE(casType, "eventRec", "uima.cas.FSArray", featOkTst);
    casFeatCode_eventRec  = (null == casFeat_eventRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_eventRec).getCode();

 
    casFeat_lDSOrdRec = jcas.getRequiredFeatureDE(casType, "lDSOrdRec", "uima.cas.FSArray", featOkTst);
    casFeatCode_lDSOrdRec  = (null == casFeat_lDSOrdRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lDSOrdRec).getCode();

 
    casFeat_contactRec = jcas.getRequiredFeatureDE(casType, "contactRec", "uima.cas.FSArray", featOkTst);
    casFeatCode_contactRec  = (null == casFeat_contactRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contactRec).getCode();

 
    casFeat_sourceRec = jcas.getRequiredFeatureDE(casType, "sourceRec", "uima.cas.FSArray", featOkTst);
    casFeatCode_sourceRec  = (null == casFeat_sourceRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceRec).getCode();

 
    casFeat_repositoryRec = jcas.getRequiredFeatureDE(casType, "repositoryRec", "uima.cas.FSArray", featOkTst);
    casFeatCode_repositoryRec  = (null == casFeat_repositoryRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_repositoryRec).getCode();

 
    casFeat_groupRec = jcas.getRequiredFeatureDE(casType, "groupRec", "uima.cas.FSArray", featOkTst);
    casFeatCode_groupRec  = (null == casFeat_groupRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_groupRec).getCode();

  }
  /** @generated */ 
  public int getContactRec(int addr) {
        if (featOkTst && casFeat_contactRec == null)
      jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_contactRec);
  }
  /** @generated */
  public int getContactRec(int addr, int i) {
        if (featOkTst && casFeat_contactRec == null)
      jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contactRec), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_contactRec), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contactRec), i);
  }
   
   /** @generated */ 
  public int getEventRec(int addr) {
        if (featOkTst && casFeat_eventRec == null)
      jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_eventRec);
  }
  /** @generated */
  public int getEventRec(int addr, int i) {
        if (featOkTst && casFeat_eventRec == null)
      jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_eventRec), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_eventRec), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_eventRec), i);
  }
   
  /** @generated */ 
  public int getFamilyRec(int addr) {
        if (featOkTst && casFeat_familyRec == null)
      jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_familyRec);
  }
  /** @generated */
  public int getFamilyRec(int addr, int i) {
        if (featOkTst && casFeat_familyRec == null)
      jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_familyRec), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_familyRec), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_familyRec), i);
  }
   
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getGroupRec(int addr) {
        if (featOkTst && casFeat_groupRec == null)
      jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_groupRec);
  }
   /** @generated */
  public int getGroupRec(int addr, int i) {
        if (featOkTst && casFeat_groupRec == null)
      jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_groupRec), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_groupRec), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_groupRec), i);
  }
   
  /** @generated */ 
  public int getHeaderRec(int addr) {
        if (featOkTst && casFeat_headerRec == null)
      jcas.throwFeatMissing("headerRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_headerRec);
  }
  /** @generated */ 
  public int getIndividualRec(int addr) {
        if (featOkTst && casFeat_individualRec == null)
      jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_individualRec);
  }
  /** @generated */
  public int getIndividualRec(int addr, int i) {
        if (featOkTst && casFeat_individualRec == null)
      jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_individualRec), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_individualRec), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_individualRec), i);
  }
   
  /** @generated */ 
  public int getLDSOrdRec(int addr) {
        if (featOkTst && casFeat_lDSOrdRec == null)
      jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_lDSOrdRec);
  }
  /** @generated */
  public int getLDSOrdRec(int addr, int i) {
        if (featOkTst && casFeat_lDSOrdRec == null)
      jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lDSOrdRec), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_lDSOrdRec), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lDSOrdRec), i);
  }
   
   /** @generated */ 
  public int getRepositoryRec(int addr) {
        if (featOkTst && casFeat_repositoryRec == null)
      jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_repositoryRec);
  }
  /** @generated */
  public int getRepositoryRec(int addr, int i) {
        if (featOkTst && casFeat_repositoryRec == null)
      jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_repositoryRec), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_repositoryRec), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_repositoryRec), i);
  }
   
  /** @generated */ 
  public int getSourceRec(int addr) {
        if (featOkTst && casFeat_sourceRec == null)
      jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.GEDCOMType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sourceRec);
  }
  /** @generated */
  public int getSourceRec(int addr, int i) {
        if (featOkTst && casFeat_sourceRec == null)
      jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sourceRec), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sourceRec), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sourceRec), i);
  }
   
  /** @generated */    
  public void setContactRec(int addr, int v) {
        if (featOkTst && casFeat_contactRec == null)
      jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_contactRec, v);}
    
  /** @generated */ 
  public void setContactRec(int addr, int i, int v) {
        if (featOkTst && casFeat_contactRec == null)
      jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contactRec), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_contactRec), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_contactRec), i, v);
  }
 
 
   /** @generated */    
  public void setEventRec(int addr, int v) {
        if (featOkTst && casFeat_eventRec == null)
      jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_eventRec, v);}
    
  /** @generated */ 
  public void setEventRec(int addr, int i, int v) {
        if (featOkTst && casFeat_eventRec == null)
      jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_eventRec), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_eventRec), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_eventRec), i, v);
  }
 
 
  /** @generated */    
  public void setFamilyRec(int addr, int v) {
        if (featOkTst && casFeat_familyRec == null)
      jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_familyRec, v);}
    
  /** @generated */ 
  public void setFamilyRec(int addr, int i, int v) {
        if (featOkTst && casFeat_familyRec == null)
      jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_familyRec), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_familyRec), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_familyRec), i, v);
  }
 
 
  /** @generated */    
  public void setGroupRec(int addr, int v) {
        if (featOkTst && casFeat_groupRec == null)
      jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_groupRec, v);}
    
  /** @generated */ 
  public void setGroupRec(int addr, int i, int v) {
        if (featOkTst && casFeat_groupRec == null)
      jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_groupRec), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_groupRec), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_groupRec), i, v);
  }
 



   /** @generated */    
  public void setHeaderRec(int addr, int v) {
        if (featOkTst && casFeat_headerRec == null)
      jcas.throwFeatMissing("headerRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_headerRec, v);}
    
  
 
  /** @generated */    
  public void setIndividualRec(int addr, int v) {
        if (featOkTst && casFeat_individualRec == null)
      jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_individualRec, v);}
    
  /** @generated */ 
  public void setIndividualRec(int addr, int i, int v) {
        if (featOkTst && casFeat_individualRec == null)
      jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_individualRec), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_individualRec), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_individualRec), i, v);
  }
 
 
  /** @generated */    
  public void setLDSOrdRec(int addr, int v) {
        if (featOkTst && casFeat_lDSOrdRec == null)
      jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_lDSOrdRec, v);}
    
  /** @generated */ 
  public void setLDSOrdRec(int addr, int i, int v) {
        if (featOkTst && casFeat_lDSOrdRec == null)
      jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lDSOrdRec), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_lDSOrdRec), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_lDSOrdRec), i, v);
  }
 
 
  /** @generated */    
  public void setRepositoryRec(int addr, int v) {
        if (featOkTst && casFeat_repositoryRec == null)
      jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_repositoryRec, v);}
    
   /** @generated */ 
  public void setRepositoryRec(int addr, int i, int v) {
        if (featOkTst && casFeat_repositoryRec == null)
      jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_repositoryRec), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_repositoryRec), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_repositoryRec), i, v);
  }
 
 
  /** @generated */    
  public void setSourceRec(int addr, int v) {
        if (featOkTst && casFeat_sourceRec == null)
      jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.GEDCOMType");
    ll_cas.ll_setRefValue(addr, casFeatCode_sourceRec, v);}
    
  /** @generated */ 
  public void setSourceRec(int addr, int i, int v) {
        if (featOkTst && casFeat_sourceRec == null)
      jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.GEDCOMType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sourceRec), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_sourceRec), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_sourceRec), i, v);
  }
 
 
}



    