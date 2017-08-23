
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
public class SourceRecType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (SourceRecType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = SourceRecType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new SourceRecType(addr, SourceRecType_Type.this);
  			   SourceRecType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new SourceRecType(addr, SourceRecType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = SourceRecType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.SourceRecType");
  /** @generated */
  final Feature casFeat_repository;
 
  /** @generated */
  final int     casFeatCode_repository;
  /** @generated */
  final Feature casFeat_title;
  /** @generated */
  final int     casFeatCode_title;
  /** @generated */
  final Feature casFeat_article;
    
   /** @generated */
  final int     casFeatCode_article;
   
  /** @generated */
  final Feature casFeat_author;
 
 
  /** @generated */
  final int     casFeatCode_author;
  /** @generated */
  final Feature casFeat_uRI;
  /** @generated */
  final int     casFeatCode_uRI;
  /** @generated */
  final Feature casFeat_publishing;
    
  
 
  /** @generated */
  final int     casFeatCode_publishing;
  /** @generated */
  final Feature casFeat_note;
  /** @generated */
  final int     casFeatCode_note;
  /** @generated */
  final Feature casFeat_changed;
    
  
 
  /** @generated */
  final int     casFeatCode_changed;
  /** @generated */
  final Feature casFeat_id;
  /** @generated */
  final int     casFeatCode_id;
  /** @generated */
  final Feature casFeat_language;
    
  
 
  /** @generated */
  final int     casFeatCode_language;
  /** @generated */
  final Feature casFeat_sourceType;
  /** @generated */
  final int     casFeatCode_sourceType;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public SourceRecType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_repository = jcas.getRequiredFeatureDE(casType, "repository", "uima.cas.FSArray", featOkTst);
    casFeatCode_repository  = (null == casFeat_repository) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_repository).getCode();

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_article = jcas.getRequiredFeatureDE(casType, "article", "uima.cas.String", featOkTst);
    casFeatCode_article  = (null == casFeat_article) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_article).getCode();

 
    casFeat_author = jcas.getRequiredFeatureDE(casType, "author", "uima.cas.String", featOkTst);
    casFeatCode_author  = (null == casFeat_author) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_author).getCode();

 
    casFeat_uRI = jcas.getRequiredFeatureDE(casType, "uRI", "uima.cas.StringArray", featOkTst);
    casFeatCode_uRI  = (null == casFeat_uRI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uRI).getCode();

 
    casFeat_publishing = jcas.getRequiredFeatureDE(casType, "publishing", "net.myerichsen.gedcom.PublishingType", featOkTst);
    casFeatCode_publishing  = (null == casFeat_publishing) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_publishing).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "uima.cas.FSArray", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

 
    casFeat_changed = jcas.getRequiredFeatureDE(casType, "changed", "uima.cas.FSArray", featOkTst);
    casFeatCode_changed  = (null == casFeat_changed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changed).getCode();

 
    casFeat_id = jcas.getRequiredFeatureDE(casType, "id", "uima.cas.String", featOkTst);
    casFeatCode_id  = (null == casFeat_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_id).getCode();

 
    casFeat_language = jcas.getRequiredFeatureDE(casType, "language", "uima.cas.String", featOkTst);
    casFeatCode_language  = (null == casFeat_language) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_language).getCode();

 
    casFeat_sourceType = jcas.getRequiredFeatureDE(casType, "sourceType", "uima.cas.String", featOkTst);
    casFeatCode_sourceType  = (null == casFeat_sourceType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceType).getCode();

  }
   /** @generated */ 
  public String getArticle(int addr) {
        if (featOkTst && casFeat_article == null)
      jcas.throwFeatMissing("article", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_article);
  }
  /** @generated */ 
  public String getAuthor(int addr) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_author);
  }
  /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */
  public int getChanged(int addr, int i) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.SourceRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
  }
   
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public String getId(int addr) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_id);
  }
  /** @generated */ 
  public String getLanguage(int addr) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_language);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */
  public int getNote(int addr, int i) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.SourceRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
  }
   
  /** @generated */ 
  public int getPublishing(int addr) {
        if (featOkTst && casFeat_publishing == null)
      jcas.throwFeatMissing("publishing", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_publishing);
  }
   /** @generated */ 
  public int getRepository(int addr) {
        if (featOkTst && casFeat_repository == null)
      jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_repository);
  }
  /** @generated */
  public int getRepository(int addr, int i) {
        if (featOkTst && casFeat_repository == null)
      jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.SourceRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_repository), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_repository), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_repository), i);
  }
   
  /** @generated */ 
  public String getSourceType(int addr) {
        if (featOkTst && casFeat_sourceType == null)
      jcas.throwFeatMissing("sourceType", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sourceType);
  }
  /** @generated */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated */ 
  public int getURI(int addr) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.SourceRecType");
    return ll_cas.ll_getRefValue(addr, casFeatCode_uRI);
  }
  /** @generated */
  public String getURI(int addr, int i) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.SourceRecType");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
  }
   
   /** @generated */    
  public void setArticle(int addr, String v) {
        if (featOkTst && casFeat_article == null)
      jcas.throwFeatMissing("article", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_article, v);}
    
  
 
  /** @generated */    
  public void setAuthor(int addr, String v) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_author, v);}
    
  
 
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
  /** @generated */ 
  public void setChanged(int addr, int i, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.SourceRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_changed), i, v);
  }
 
 
  /** @generated */    
  public void setId(int addr, String v) {
        if (featOkTst && casFeat_id == null)
      jcas.throwFeatMissing("id", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_id, v);}
    
  
 
  /** @generated */    
  public void setLanguage(int addr, String v) {
        if (featOkTst && casFeat_language == null)
      jcas.throwFeatMissing("language", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_language, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  /** @generated */ 
  public void setNote(int addr, int i, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.SourceRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_note), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_note), i, v);
  }
 
 
  /** @generated */    
  public void setPublishing(int addr, int v) {
        if (featOkTst && casFeat_publishing == null)
      jcas.throwFeatMissing("publishing", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_publishing, v);}
    
  
 
  /** @generated */    
  public void setRepository(int addr, int v) {
        if (featOkTst && casFeat_repository == null)
      jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_repository, v);}
    
  /** @generated */ 
  public void setRepository(int addr, int i, int v) {
        if (featOkTst && casFeat_repository == null)
      jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.SourceRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_repository), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_repository), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_repository), i, v);
  }
 
 
  /** @generated */    
  public void setSourceType(int addr, String v) {
        if (featOkTst && casFeat_sourceType == null)
      jcas.throwFeatMissing("sourceType", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_sourceType, v);}
    
  



  /** @generated */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
  /** @generated */    
  public void setURI(int addr, int v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.SourceRecType");
    ll_cas.ll_setRefValue(addr, casFeatCode_uRI, v);}
    
  /** @generated */ 
  public void setURI(int addr, int i, String v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.SourceRecType");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_uRI), i, v);
  }
 
 
}



    