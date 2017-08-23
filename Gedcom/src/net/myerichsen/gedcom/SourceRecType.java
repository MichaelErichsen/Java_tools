

/* First created by JCasGen Mon Oct 10 13:28:09 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:38 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class SourceRecType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(SourceRecType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected SourceRecType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public SourceRecType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public SourceRecType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public SourceRecType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for article - gets 
   * @generated */
  public String getArticle() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_article == null)
      jcasType.jcas.throwFeatMissing("article", "net.myerichsen.gedcom.SourceRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_article);}
    
  /** getter for author - gets 
   * @generated */
  public String getAuthor() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "net.myerichsen.gedcom.SourceRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_author);}
    
  //*--------------*
  //* Feature: repository

  /** getter for changed - gets 
   * @generated */
  public FSArray getChanged() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.SourceRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_changed)));}
    
  /** indexed getter for changed - gets an indexed value - 
   * @generated */
  public ChangedType getChanged(int i) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.SourceRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_changed), i);
    return (ChangedType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_changed), i)));}

  /** getter for id - gets 
   * @generated */
  public String getId() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.SourceRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_id);}
    
  /** getter for language - gets 
   * @generated */
  public String getLanguage() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.SourceRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_language);}
    
  //*--------------*
  //* Feature: title

  /** getter for note - gets 
   * @generated */
  public FSArray getNote() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.SourceRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_note)));}
    
  /** indexed getter for note - gets an indexed value - 
   * @generated */
  public NoteType getNote(int i) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.SourceRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_note), i);
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_note), i)));}

  //*--------------*
  //* Feature: article

  /** getter for publishing - gets 
   * @generated */
  public PublishingType getPublishing() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_publishing == null)
      jcasType.jcas.throwFeatMissing("publishing", "net.myerichsen.gedcom.SourceRecType");
    return (PublishingType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_publishing)));}
    
  /** getter for repository - gets 
   * @generated */
  public FSArray getRepository() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_repository == null)
      jcasType.jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.SourceRecType");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_repository)));}
    
  //*--------------*
  //* Feature: author

  /** indexed getter for repository - gets an indexed value - 
   * @generated */
  public RepositoryType getRepository(int i) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_repository == null)
      jcasType.jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.SourceRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_repository), i);
    return (RepositoryType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_repository), i)));}

  /** getter for sourceType - gets 
   * @generated */
  public String getSourceType() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_sourceType == null)
      jcasType.jcas.throwFeatMissing("sourceType", "net.myerichsen.gedcom.SourceRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_sourceType);}
    
  //*--------------*
  //* Feature: uRI

  /** getter for title - gets 
   * @generated */
  public String getTitle() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "net.myerichsen.gedcom.SourceRecType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_title);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** getter for uRI - gets 
   * @generated */
  public StringArray getURI() {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.SourceRecType");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_uRI)));}
    
  /** indexed getter for uRI - gets an indexed value - 
   * @generated */
  public String getURI(int i) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.SourceRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_uRI), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_uRI), i);}

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for article - sets  
   * @generated */
  public void setArticle(String v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_article == null)
      jcasType.jcas.throwFeatMissing("article", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_article, v);}    
   
    
  //*--------------*
  //* Feature: note

  /** setter for author - sets  
   * @generated */
  public void setAuthor(String v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_author, v);}    
   
    
  /** setter for changed - sets  
   * @generated */
  public void setChanged(FSArray v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_changed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for changed - sets an indexed value - 
   * @generated */
  public void setChanged(int i, ChangedType v) { 
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.SourceRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_changed), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_changed), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for id - sets  
   * @generated */
  public void setId(String v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_id == null)
      jcasType.jcas.throwFeatMissing("id", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_id, v);}    
   
    
  //*--------------*
  //* Feature: changed

  /** setter for language - sets  
   * @generated */
  public void setLanguage(String v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_language == null)
      jcasType.jcas.throwFeatMissing("language", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_language, v);}    
   
    
  /** setter for note - sets  
   * @generated */
  public void setNote(FSArray v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for note - sets an indexed value - 
   * @generated */
  public void setNote(int i, NoteType v) { 
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.SourceRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_note), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_note), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  /** setter for publishing - sets  
   * @generated */
  public void setPublishing(PublishingType v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_publishing == null)
      jcasType.jcas.throwFeatMissing("publishing", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_publishing, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: id

  /** setter for repository - sets  
   * @generated */
  public void setRepository(FSArray v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_repository == null)
      jcasType.jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_repository, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for repository - sets an indexed value - 
   * @generated */
  public void setRepository(int i, RepositoryType v) { 
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_repository == null)
      jcasType.jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.SourceRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_repository), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_repository), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: language

  /** setter for sourceType - sets  
   * @generated */
  public void setSourceType(String v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_sourceType == null)
      jcasType.jcas.throwFeatMissing("sourceType", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_sourceType, v);}    
                                                  /** setter for title - sets  
   * @generated */
  public void setTitle(String v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setStringValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_title, v);}    
   
    
  //*--------------*
  //* Feature: sourceType

  /** indexed setter for uRI - sets an indexed value - 
   * @generated */
  public void setURI(int i, String v) { 
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.SourceRecType");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_uRI), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_uRI), i, v);}
   
    
  /** setter for uRI - sets  
   * @generated */
  public void setURI(StringArray v) {
    if (SourceRecType_Type.featOkTst && ((SourceRecType_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.SourceRecType");
    jcasType.ll_cas.ll_setRefValue(addr, ((SourceRecType_Type)jcasType).casFeatCode_uRI, jcasType.ll_cas.ll_getFSRef(v));}    
    
}

    