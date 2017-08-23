

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.cas.StringArray;
import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:33 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class DocumentRoot extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(DocumentRoot.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected DocumentRoot() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DocumentRoot(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DocumentRoot(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DocumentRoot(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for addressee - gets 
   * @generated */
  public String getAddressee() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_addressee == null)
      jcasType.jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_addressee);}
    
  /** getter for addrLine - gets 
   * @generated */
  public AddrLineType getAddrLine() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_addrLine == null)
      jcasType.jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.DocumentRoot");
    return (AddrLineType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_addrLine)));}
    
  //*--------------*
  //* Feature: mixed

  /** getter for age - gets 
   * @generated */
  public String getAge() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_age == null)
      jcasType.jcas.throwFeatMissing("age", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_age);}
    
  /** getter for article - gets 
   * @generated */
  public String getArticle() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_article == null)
      jcasType.jcas.throwFeatMissing("article", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_article);}
    
  /** getter for association - gets 
   * @generated */
  public String getAssociation() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_association == null)
      jcasType.jcas.throwFeatMissing("association", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_association);}
    
  /** getter for assocIndiv - gets 
   * @generated */
  public AssocIndivType getAssocIndiv() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_assocIndiv == null)
      jcasType.jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.DocumentRoot");
    return (AssocIndivType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_assocIndiv)));}
    
  //*--------------*
  //* Feature: xMLNSPrefixMap

  /** getter for author - gets 
   * @generated */
  public String getAuthor() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_author);}
    
  /** getter for basedOn - gets 
   * @generated */
  public BasedOnType getBasedOn() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_basedOn == null)
      jcasType.jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.DocumentRoot");
    return (BasedOnType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_basedOn)));}
    
  /** getter for callNbr - gets 
   * @generated */
  public String getCallNbr() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_callNbr == null)
      jcasType.jcas.throwFeatMissing("callNbr", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_callNbr);}
    
  /** getter for caption - gets 
   * @generated */
  public String getCaption() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_caption == null)
      jcasType.jcas.throwFeatMissing("caption", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_caption);}
    
  //*--------------*
  //* Feature: xSISchemaLocation

  /** getter for changed - gets 
   * @generated */
  public ChangedType getChanged() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.DocumentRoot");
    return (ChangedType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_changed)));}
    
  /** getter for child - gets 
   * @generated */
  public ChildType getChild() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_child == null)
      jcasType.jcas.throwFeatMissing("child", "net.myerichsen.gedcom.DocumentRoot");
    return (ChildType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_child)));}
    
  /** getter for childNbr - gets 
   * @generated */
  public String getChildNbr() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_childNbr == null)
      jcasType.jcas.throwFeatMissing("childNbr", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_childNbr);}
    
  /** getter for citation - gets 
   * @generated */
  public CitationType getCitation() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.DocumentRoot");
    return (CitationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_citation)));}
    
  //*--------------*
  //* Feature: addressee

  /** getter for contact - gets 
   * @generated */
  public ContactType getContact() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_contact == null)
      jcasType.jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.DocumentRoot");
    return (ContactType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_contact)));}
    
  /** getter for contactRec - gets 
   * @generated */
  public ContactRecType getContactRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_contactRec == null)
      jcasType.jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.DocumentRoot");
    return (ContactRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_contactRec)));}
    
  //*--------------*
  //* Feature: addrLine

  /** getter for coordinates - gets 
   * @generated */
  public String getCoordinates() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_coordinates == null)
      jcasType.jcas.throwFeatMissing("coordinates", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_coordinates);}
    
  /** getter for copyright - gets 
   * @generated */
  public String getCopyright() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_copyright == null)
      jcasType.jcas.throwFeatMissing("copyright", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_copyright);}
    
  //*--------------*
  //* Feature: age

  /** getter for date - gets 
   * @generated */
  public DateType getDate() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.DocumentRoot");
    return (DateType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_date)));}
    
  /** getter for deathStatus - gets 
   * @generated */
  public String getDeathStatus() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_deathStatus == null)
      jcasType.jcas.throwFeatMissing("deathStatus", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_deathStatus);}
    
  //*--------------*
  //* Feature: article

  /** getter for dupIndiv - gets 
   * @generated */
  public DupIndivType getDupIndiv() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_dupIndiv == null)
      jcasType.jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.DocumentRoot");
    return (DupIndivType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_dupIndiv)));}
    
  /** getter for email - gets 
   * @generated */
  public String getEmail() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_email);}
    
  //*--------------*
  //* Feature: association

  /** getter for enrichment - gets 
   * @generated */
  public EnrichmentType getEnrichment() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.DocumentRoot");
    return (EnrichmentType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_enrichment)));}
    
  /** getter for eventRec - gets 
   * @generated */
  public EventRecType getEventRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_eventRec == null)
      jcasType.jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.DocumentRoot");
    return (EventRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_eventRec)));}
    
  //*--------------*
  //* Feature: assocIndiv

  /** getter for evidence - gets 
   * @generated */
  public EvidenceType getEvidence() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.DocumentRoot");
    return (EvidenceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_evidence)));}
    
  /** getter for externalID - gets 
   * @generated */
  public ExternalIDType getExternalID() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.DocumentRoot");
    return (ExternalIDType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_externalID)));}
    
  //*--------------*
  //* Feature: author

  /** getter for extract - gets 
   * @generated */
  public ExtractType getExtract() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_extract == null)
      jcasType.jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.DocumentRoot");
    return (ExtractType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_extract)));}
    
  /** getter for familyNbr - gets 
   * @generated */
  public FamilyNbrType getFamilyNbr() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_familyNbr == null)
      jcasType.jcas.throwFeatMissing("familyNbr", "net.myerichsen.gedcom.DocumentRoot");
    return (FamilyNbrType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_familyNbr)));}
    
  //*--------------*
  //* Feature: basedOn

  /** getter for familyRec - gets 
   * @generated */
  public FamilyRecType getFamilyRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_familyRec == null)
      jcasType.jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.DocumentRoot");
    return (FamilyRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_familyRec)));}
    
  /** getter for fileCreation - gets 
   * @generated */
  public FileCreationType getFileCreation() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_fileCreation == null)
      jcasType.jcas.throwFeatMissing("fileCreation", "net.myerichsen.gedcom.DocumentRoot");
    return (FileCreationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_fileCreation)));}
    
  //*--------------*
  //* Feature: callNbr

  /** getter for gEDCOM - gets 
   * @generated */
  public GEDCOMType getGEDCOM() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_gEDCOM == null)
      jcasType.jcas.throwFeatMissing("gEDCOM", "net.myerichsen.gedcom.DocumentRoot");
    return (GEDCOMType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_gEDCOM)));}
    
  /** getter for gender - gets 
   * @generated */
  public String getGender() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_gender == null)
      jcasType.jcas.throwFeatMissing("gender", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_gender);}
    
  //*--------------*
  //* Feature: caption

  /** getter for groupRec - gets 
   * @generated */
  public GroupRecType getGroupRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_groupRec == null)
      jcasType.jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.DocumentRoot");
    return (GroupRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_groupRec)));}
    
  /** getter for headerRec - gets 
   * @generated */
  public HeaderRecType getHeaderRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_headerRec == null)
      jcasType.jcas.throwFeatMissing("headerRec", "net.myerichsen.gedcom.DocumentRoot");
    return (HeaderRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_headerRec)));}
    
  //*--------------*
  //* Feature: changed

  /** getter for husbFath - gets 
   * @generated */
  public HusbFathType getHusbFath() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_husbFath == null)
      jcasType.jcas.throwFeatMissing("husbFath", "net.myerichsen.gedcom.DocumentRoot");
    return (HusbFathType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_husbFath)));}
    
  /** getter for individualRec - gets 
   * @generated */
  public IndividualRecType getIndividualRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_individualRec == null)
      jcasType.jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.DocumentRoot");
    return (IndividualRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_individualRec)));}
    
  //*--------------*
  //* Feature: child

  /** getter for indivName - gets 
   * @generated */
  public IndivNameType getIndivName() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_indivName == null)
      jcasType.jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.DocumentRoot");
    return (IndivNameType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_indivName)));}
    
  /** getter for indivNameVariation - gets 
   * @generated */
  public IndivNameVariationType getIndivNameVariation() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_indivNameVariation == null)
      jcasType.jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.DocumentRoot");
    return (IndivNameVariationType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_indivNameVariation)));}
    
  //*--------------*
  //* Feature: childNbr

  /** getter for information - gets 
   * @generated */
  public String getInformation() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_information == null)
      jcasType.jcas.throwFeatMissing("information", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_information);}
    
  /** getter for lDSOrdRec - gets 
   * @generated */
  public LDSOrdRecType getLDSOrdRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_lDSOrdRec == null)
      jcasType.jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.DocumentRoot");
    return (LDSOrdRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_lDSOrdRec)));}
    
  //*--------------*
  //* Feature: citation

  /** getter for link - gets 
   * @generated */
  public LinkType getLink() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.DocumentRoot");
    return (LinkType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_link)));}
    
  /** getter for living - gets 
   * @generated */
  public String getLiving() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_living == null)
      jcasType.jcas.throwFeatMissing("living", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_living);}
    
  //*--------------*
  //* Feature: contact

  /** getter for mailAddress - gets 
   * @generated */
  public MailAddressType getMailAddress() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.DocumentRoot");
    return (MailAddressType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_mailAddress)));}
    
  /** getter for member - gets 
   * @generated */
  public MemberType getMember() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_member == null)
      jcasType.jcas.throwFeatMissing("member", "net.myerichsen.gedcom.DocumentRoot");
    return (MemberType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_member)));}
    
  //*--------------*
  //* Feature: contactRec

  /** getter for mixed - gets 
   * @generated */
  public StringArray getMixed() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_mixed == null)
      jcasType.jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.DocumentRoot");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_mixed)));}
    
  /** indexed getter for mixed - gets an indexed value - 
   * @generated */
  public String getMixed(int i) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_mixed == null)
      jcasType.jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_mixed), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_mixed), i);}

  //*--------------*
  //* Feature: coordinates

  /** getter for name - gets 
   * @generated */
  public NameType getName() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "net.myerichsen.gedcom.DocumentRoot");
    return (NameType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_name)));}
    
  /** getter for namePart - gets 
   * @generated */
  public NamePartType getNamePart() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.DocumentRoot");
    return (NamePartType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_namePart)));}
    
  //*--------------*
  //* Feature: copyright

  /** getter for note - gets 
   * @generated */
  public NoteType getNote() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.DocumentRoot");
    return (NoteType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_note)));}
    
  /** getter for ordStat - gets 
   * @generated */
  public OrdStatType getOrdStat() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_ordStat == null)
      jcasType.jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.DocumentRoot");
    return (OrdStatType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_ordStat)));}
    
  //*--------------*
  //* Feature: date

  /** getter for parentGroup - gets 
   * @generated */
  public ParentGroupType getParentGroup() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_parentGroup == null)
      jcasType.jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.DocumentRoot");
    return (ParentGroupType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_parentGroup)));}
    
  /** getter for participant - gets 
   * @generated */
  public ParticipantType getParticipant() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.DocumentRoot");
    return (ParticipantType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_participant)));}
    
  //*--------------*
  //* Feature: deathStatus

  /** getter for persInfo - gets 
   * @generated */
  public PersInfoType getPersInfo() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_persInfo == null)
      jcasType.jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.DocumentRoot");
    return (PersInfoType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_persInfo)));}
    
  /** getter for phone - gets 
   * @generated */
  public PhoneType getPhone() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.DocumentRoot");
    return (PhoneType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_phone)));}
    
  //*--------------*
  //* Feature: dupIndiv

  /** getter for place - gets 
   * @generated */
  public PlaceType getPlace() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "net.myerichsen.gedcom.DocumentRoot");
    return (PlaceType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_place)));}
    
  /** getter for placeName - gets 
   * @generated */
  public PlaceNameType getPlaceName() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_placeName == null)
      jcasType.jcas.throwFeatMissing("placeName", "net.myerichsen.gedcom.DocumentRoot");
    return (PlaceNameType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_placeName)));}
    
  //*--------------*
  //* Feature: email

  /** getter for placeNameVar - gets 
   * @generated */
  public PlaceNameVarType getPlaceNameVar() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_placeNameVar == null)
      jcasType.jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.DocumentRoot");
    return (PlaceNameVarType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_placeNameVar)));}
    
  /** getter for placePart - gets 
   * @generated */
  public PlacePartType getPlacePart() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.DocumentRoot");
    return (PlacePartType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_placePart)));}
    
  //*--------------*
  //* Feature: enrichment

  /** getter for product - gets 
   * @generated */
  public ProductType getProduct() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_product == null)
      jcasType.jcas.throwFeatMissing("product", "net.myerichsen.gedcom.DocumentRoot");
    return (ProductType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_product)));}
    
  /** getter for productID - gets 
   * @generated */
  public String getProductID() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_productID == null)
      jcasType.jcas.throwFeatMissing("productID", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_productID);}
    
  //*--------------*
  //* Feature: eventRec

  /** getter for public - gets 
   * @generated */
  public String getPublic() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_public == null)
      jcasType.jcas.throwFeatMissing("public", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_public);}
    
  /** getter for publishing - gets 
   * @generated */
  public PublishingType getPublishing() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_publishing == null)
      jcasType.jcas.throwFeatMissing("publishing", "net.myerichsen.gedcom.DocumentRoot");
    return (PublishingType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_publishing)));}
    
  //*--------------*
  //* Feature: evidence

  /** getter for religion - gets 
   * @generated */
  public ReligionType getReligion() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_religion == null)
      jcasType.jcas.throwFeatMissing("religion", "net.myerichsen.gedcom.DocumentRoot");
    return (ReligionType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_religion)));}
    
  /** getter for relToFath - gets 
   * @generated */
  public String getRelToFath() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_relToFath == null)
      jcasType.jcas.throwFeatMissing("relToFath", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_relToFath);}
    
  //*--------------*
  //* Feature: externalID

  /** getter for relToMoth - gets 
   * @generated */
  public String getRelToMoth() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_relToMoth == null)
      jcasType.jcas.throwFeatMissing("relToMoth", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_relToMoth);}
    
  /** getter for repository - gets 
   * @generated */
  public RepositoryType getRepository() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_repository == null)
      jcasType.jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.DocumentRoot");
    return (RepositoryType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_repository)));}
    
  //*--------------*
  //* Feature: extract

  /** getter for repositoryRec - gets 
   * @generated */
  public RepositoryRecType getRepositoryRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_repositoryRec == null)
      jcasType.jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.DocumentRoot");
    return (RepositoryRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_repositoryRec)));}
    
  /** getter for role - gets 
   * @generated */
  public String getRole() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_role);}
    
  //*--------------*
  //* Feature: familyNbr

  /** getter for sameIndiv - gets 
   * @generated */
  public SameIndivType getSameIndiv() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_sameIndiv == null)
      jcasType.jcas.throwFeatMissing("sameIndiv", "net.myerichsen.gedcom.DocumentRoot");
    return (SameIndivType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_sameIndiv)));}
    
  /** getter for sourceRec - gets 
   * @generated */
  public SourceRecType getSourceRec() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_sourceRec == null)
      jcasType.jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.DocumentRoot");
    return (SourceRecType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_sourceRec)));}
    
  //*--------------*
  //* Feature: familyRec

  /** getter for submitter - gets 
   * @generated */
  public SubmitterType getSubmitter() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.DocumentRoot");
    return (SubmitterType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_submitter)));}
    
  /** getter for supplier - gets 
   * @generated */
  public SupplierType getSupplier() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_supplier == null)
      jcasType.jcas.throwFeatMissing("supplier", "net.myerichsen.gedcom.DocumentRoot");
    return (SupplierType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_supplier)));}
    
  //*--------------*
  //* Feature: fileCreation

  /** getter for templeCode - gets 
   * @generated */
  public String getTempleCode() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_templeCode == null)
      jcasType.jcas.throwFeatMissing("templeCode", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_templeCode);}
    
  /** getter for title - gets 
   * @generated */
  public String getTitle() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_title);}
    
  //*--------------*
  //* Feature: gEDCOM

  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** getter for uRI - gets 
   * @generated */
  public String getURI() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_uRI);}
    
  //*--------------*
  //* Feature: gender

  /** getter for version - gets 
   * @generated */
  public String getVersion() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_version);}
    
  /** getter for whenRecorded - gets 
   * @generated */
  public String getWhenRecorded() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_whenRecorded == null)
      jcasType.jcas.throwFeatMissing("whenRecorded", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_whenRecorded);}
    
  //*--------------*
  //* Feature: groupRec

  /** getter for whereInSource - gets 
   * @generated */
  public String getWhereInSource() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_whereInSource == null)
      jcasType.jcas.throwFeatMissing("whereInSource", "net.myerichsen.gedcom.DocumentRoot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_whereInSource);}
    
  /** getter for wifeMoth - gets 
   * @generated */
  public WifeMothType getWifeMoth() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_wifeMoth == null)
      jcasType.jcas.throwFeatMissing("wifeMoth", "net.myerichsen.gedcom.DocumentRoot");
    return (WifeMothType)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_wifeMoth)));}
    
  //*--------------*
  //* Feature: headerRec

  /** getter for xMLNSPrefixMap - gets 
   * @generated */
  public FSArray getXMLNSPrefixMap() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_xMLNSPrefixMap == null)
      jcasType.jcas.throwFeatMissing("xMLNSPrefixMap", "net.myerichsen.gedcom.DocumentRoot");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xMLNSPrefixMap)));}
    
  /** indexed getter for xMLNSPrefixMap - gets an indexed value - 
   * @generated */
  public TOP getXMLNSPrefixMap(int i) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_xMLNSPrefixMap == null)
      jcasType.jcas.throwFeatMissing("xMLNSPrefixMap", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xMLNSPrefixMap), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xMLNSPrefixMap), i)));}

  //*--------------*
  //* Feature: husbFath

  /** getter for xSISchemaLocation - gets 
   * @generated */
  public FSArray getXSISchemaLocation() {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_xSISchemaLocation == null)
      jcasType.jcas.throwFeatMissing("xSISchemaLocation", "net.myerichsen.gedcom.DocumentRoot");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xSISchemaLocation)));}
    
  /** indexed getter for xSISchemaLocation - gets an indexed value - 
   * @generated */
  public TOP getXSISchemaLocation(int i) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_xSISchemaLocation == null)
      jcasType.jcas.throwFeatMissing("xSISchemaLocation", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xSISchemaLocation), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xSISchemaLocation), i)));}

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for addressee - sets  
   * @generated */
  public void setAddressee(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_addressee == null)
      jcasType.jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_addressee, v);}    
   
    
  //*--------------*
  //* Feature: indivName

  /** setter for addrLine - sets  
   * @generated */
  public void setAddrLine(AddrLineType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_addrLine == null)
      jcasType.jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_addrLine, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for age - sets  
   * @generated */
  public void setAge(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_age == null)
      jcasType.jcas.throwFeatMissing("age", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_age, v);}    
   
    
  //*--------------*
  //* Feature: indivNameVariation

  /** setter for article - sets  
   * @generated */
  public void setArticle(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_article == null)
      jcasType.jcas.throwFeatMissing("article", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_article, v);}    
   
    
  /** setter for association - sets  
   * @generated */
  public void setAssociation(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_association == null)
      jcasType.jcas.throwFeatMissing("association", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_association, v);}    
   
    
  //*--------------*
  //* Feature: information

  /** setter for assocIndiv - sets  
   * @generated */
  public void setAssocIndiv(AssocIndivType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_assocIndiv == null)
      jcasType.jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_assocIndiv, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for author - sets  
   * @generated */
  public void setAuthor(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_author == null)
      jcasType.jcas.throwFeatMissing("author", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_author, v);}    
   
    
  //*--------------*
  //* Feature: lDSOrdRec

  /** setter for basedOn - sets  
   * @generated */
  public void setBasedOn(BasedOnType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_basedOn == null)
      jcasType.jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_basedOn, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for callNbr - sets  
   * @generated */
  public void setCallNbr(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_callNbr == null)
      jcasType.jcas.throwFeatMissing("callNbr", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_callNbr, v);}    
   
    
  //*--------------*
  //* Feature: link

  /** setter for caption - sets  
   * @generated */
  public void setCaption(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_caption == null)
      jcasType.jcas.throwFeatMissing("caption", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_caption, v);}    
   
    
  /** setter for changed - sets  
   * @generated */
  public void setChanged(ChangedType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_changed == null)
      jcasType.jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_changed, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: living

  /** setter for child - sets  
   * @generated */
  public void setChild(ChildType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_child == null)
      jcasType.jcas.throwFeatMissing("child", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_child, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for childNbr - sets  
   * @generated */
  public void setChildNbr(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_childNbr == null)
      jcasType.jcas.throwFeatMissing("childNbr", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_childNbr, v);}    
   
    
  //*--------------*
  //* Feature: mailAddress

  /** setter for citation - sets  
   * @generated */
  public void setCitation(CitationType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_citation == null)
      jcasType.jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_citation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for contact - sets  
   * @generated */
  public void setContact(ContactType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_contact == null)
      jcasType.jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_contact, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: member

  /** setter for contactRec - sets  
   * @generated */
  public void setContactRec(ContactRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_contactRec == null)
      jcasType.jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_contactRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for coordinates - sets  
   * @generated */
  public void setCoordinates(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_coordinates == null)
      jcasType.jcas.throwFeatMissing("coordinates", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_coordinates, v);}    
   
    
  //*--------------*
  //* Feature: name

  /** setter for copyright - sets  
   * @generated */
  public void setCopyright(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_copyright == null)
      jcasType.jcas.throwFeatMissing("copyright", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_copyright, v);}    
   
    
  /** setter for date - sets  
   * @generated */
  public void setDate(DateType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_date, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: namePart

  /** setter for deathStatus - sets  
   * @generated */
  public void setDeathStatus(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_deathStatus == null)
      jcasType.jcas.throwFeatMissing("deathStatus", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_deathStatus, v);}    
   
    
  /** setter for dupIndiv - sets  
   * @generated */
  public void setDupIndiv(DupIndivType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_dupIndiv == null)
      jcasType.jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_dupIndiv, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: note

  /** setter for email - sets  
   * @generated */
  public void setEmail(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_email == null)
      jcasType.jcas.throwFeatMissing("email", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_email, v);}    
   
    
  /** setter for enrichment - sets  
   * @generated */
  public void setEnrichment(EnrichmentType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_enrichment == null)
      jcasType.jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_enrichment, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ordStat

  /** setter for eventRec - sets  
   * @generated */
  public void setEventRec(EventRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_eventRec == null)
      jcasType.jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_eventRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for evidence - sets  
   * @generated */
  public void setEvidence(EvidenceType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_evidence == null)
      jcasType.jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_evidence, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: parentGroup

  /** setter for externalID - sets  
   * @generated */
  public void setExternalID(ExternalIDType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_externalID == null)
      jcasType.jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_externalID, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for extract - sets  
   * @generated */
  public void setExtract(ExtractType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_extract == null)
      jcasType.jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_extract, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: participant

  /** setter for familyNbr - sets  
   * @generated */
  public void setFamilyNbr(FamilyNbrType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_familyNbr == null)
      jcasType.jcas.throwFeatMissing("familyNbr", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_familyNbr, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for familyRec - sets  
   * @generated */
  public void setFamilyRec(FamilyRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_familyRec == null)
      jcasType.jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_familyRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: persInfo

  /** setter for fileCreation - sets  
   * @generated */
  public void setFileCreation(FileCreationType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_fileCreation == null)
      jcasType.jcas.throwFeatMissing("fileCreation", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_fileCreation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for gEDCOM - sets  
   * @generated */
  public void setGEDCOM(GEDCOMType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_gEDCOM == null)
      jcasType.jcas.throwFeatMissing("gEDCOM", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_gEDCOM, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: phone

  /** setter for gender - sets  
   * @generated */
  public void setGender(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_gender == null)
      jcasType.jcas.throwFeatMissing("gender", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_gender, v);}    
   
    
  /** setter for groupRec - sets  
   * @generated */
  public void setGroupRec(GroupRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_groupRec == null)
      jcasType.jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_groupRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: place

  /** setter for headerRec - sets  
   * @generated */
  public void setHeaderRec(HeaderRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_headerRec == null)
      jcasType.jcas.throwFeatMissing("headerRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_headerRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for husbFath - sets  
   * @generated */
  public void setHusbFath(HusbFathType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_husbFath == null)
      jcasType.jcas.throwFeatMissing("husbFath", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_husbFath, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: placeName

  /** setter for individualRec - sets  
   * @generated */
  public void setIndividualRec(IndividualRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_individualRec == null)
      jcasType.jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_individualRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for indivName - sets  
   * @generated */
  public void setIndivName(IndivNameType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_indivName == null)
      jcasType.jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_indivName, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: placeNameVar

  /** setter for indivNameVariation - sets  
   * @generated */
  public void setIndivNameVariation(IndivNameVariationType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_indivNameVariation == null)
      jcasType.jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_indivNameVariation, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for information - sets  
   * @generated */
  public void setInformation(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_information == null)
      jcasType.jcas.throwFeatMissing("information", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_information, v);}    
   
    
  //*--------------*
  //* Feature: placePart

  /** setter for lDSOrdRec - sets  
   * @generated */
  public void setLDSOrdRec(LDSOrdRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_lDSOrdRec == null)
      jcasType.jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_lDSOrdRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for link - sets  
   * @generated */
  public void setLink(LinkType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_link == null)
      jcasType.jcas.throwFeatMissing("link", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_link, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: product

  /** setter for living - sets  
   * @generated */
  public void setLiving(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_living == null)
      jcasType.jcas.throwFeatMissing("living", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_living, v);}    
   
    
  /** setter for mailAddress - sets  
   * @generated */
  public void setMailAddress(MailAddressType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_mailAddress == null)
      jcasType.jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_mailAddress, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: productID

  /** setter for member - sets  
   * @generated */
  public void setMember(MemberType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_member == null)
      jcasType.jcas.throwFeatMissing("member", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_member, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** indexed setter for mixed - sets an indexed value - 
   * @generated */
  public void setMixed(int i, String v) { 
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_mixed == null)
      jcasType.jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_mixed), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_mixed), i, v);}
   
    
  //*--------------*
  //* Feature: public

  /** setter for mixed - sets  
   * @generated */
  public void setMixed(StringArray v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_mixed == null)
      jcasType.jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_mixed, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** setter for name - sets  
   * @generated */
  public void setName(NameType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_name, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: publishing

  /** setter for namePart - sets  
   * @generated */
  public void setNamePart(NamePartType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_namePart == null)
      jcasType.jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_namePart, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for note - sets  
   * @generated */
  public void setNote(NoteType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_note == null)
      jcasType.jcas.throwFeatMissing("note", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_note, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: religion

  /** setter for ordStat - sets  
   * @generated */
  public void setOrdStat(OrdStatType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_ordStat == null)
      jcasType.jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_ordStat, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for parentGroup - sets  
   * @generated */
  public void setParentGroup(ParentGroupType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_parentGroup == null)
      jcasType.jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_parentGroup, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relToFath

  /** setter for participant - sets  
   * @generated */
  public void setParticipant(ParticipantType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_participant == null)
      jcasType.jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_participant, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for persInfo - sets  
   * @generated */
  public void setPersInfo(PersInfoType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_persInfo == null)
      jcasType.jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_persInfo, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: relToMoth

  /** setter for phone - sets  
   * @generated */
  public void setPhone(PhoneType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_phone == null)
      jcasType.jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_phone, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for place - sets  
   * @generated */
  public void setPlace(PlaceType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_place == null)
      jcasType.jcas.throwFeatMissing("place", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_place, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: repository

  /** setter for placeName - sets  
   * @generated */
  public void setPlaceName(PlaceNameType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_placeName == null)
      jcasType.jcas.throwFeatMissing("placeName", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_placeName, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for placeNameVar - sets  
   * @generated */
  public void setPlaceNameVar(PlaceNameVarType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_placeNameVar == null)
      jcasType.jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_placeNameVar, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: repositoryRec

  /** setter for placePart - sets  
   * @generated */
  public void setPlacePart(PlacePartType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_placePart == null)
      jcasType.jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_placePart, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for product - sets  
   * @generated */
  public void setProduct(ProductType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_product == null)
      jcasType.jcas.throwFeatMissing("product", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_product, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: role

  /** setter for productID - sets  
   * @generated */
  public void setProductID(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_productID == null)
      jcasType.jcas.throwFeatMissing("productID", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_productID, v);}    
   
    
  /** setter for public - sets  
   * @generated */
  public void setPublic(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_public == null)
      jcasType.jcas.throwFeatMissing("public", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_public, v);}    
   
    
  //*--------------*
  //* Feature: sameIndiv

  /** setter for publishing - sets  
   * @generated */
  public void setPublishing(PublishingType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_publishing == null)
      jcasType.jcas.throwFeatMissing("publishing", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_publishing, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for religion - sets  
   * @generated */
  public void setReligion(ReligionType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_religion == null)
      jcasType.jcas.throwFeatMissing("religion", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_religion, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: sourceRec

  /** setter for relToFath - sets  
   * @generated */
  public void setRelToFath(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_relToFath == null)
      jcasType.jcas.throwFeatMissing("relToFath", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_relToFath, v);}    
   
    
  /** setter for relToMoth - sets  
   * @generated */
  public void setRelToMoth(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_relToMoth == null)
      jcasType.jcas.throwFeatMissing("relToMoth", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_relToMoth, v);}    
   
    
  //*--------------*
  //* Feature: submitter

  /** setter for repository - sets  
   * @generated */
  public void setRepository(RepositoryType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_repository == null)
      jcasType.jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_repository, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for repositoryRec - sets  
   * @generated */
  public void setRepositoryRec(RepositoryRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_repositoryRec == null)
      jcasType.jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_repositoryRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: supplier

  /** setter for role - sets  
   * @generated */
  public void setRole(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_role == null)
      jcasType.jcas.throwFeatMissing("role", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_role, v);}    
   
    
  /** setter for sameIndiv - sets  
   * @generated */
  public void setSameIndiv(SameIndivType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_sameIndiv == null)
      jcasType.jcas.throwFeatMissing("sameIndiv", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_sameIndiv, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: templeCode

  /** setter for sourceRec - sets  
   * @generated */
  public void setSourceRec(SourceRecType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_sourceRec == null)
      jcasType.jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_sourceRec, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for submitter - sets  
   * @generated */
  public void setSubmitter(SubmitterType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_submitter == null)
      jcasType.jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_submitter, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: title

  /** setter for supplier - sets  
   * @generated */
  public void setSupplier(SupplierType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_supplier == null)
      jcasType.jcas.throwFeatMissing("supplier", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_supplier, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  /** setter for templeCode - sets  
   * @generated */
  public void setTempleCode(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_templeCode == null)
      jcasType.jcas.throwFeatMissing("templeCode", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_templeCode, v);}    
   
    
  //*--------------*
  //* Feature: uRI

  /** setter for title - sets  
   * @generated */
  public void setTitle(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_title == null)
      jcasType.jcas.throwFeatMissing("title", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_title, v);}    
   
    
  /** setter for uRI - sets  
   * @generated */
  public void setURI(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_uRI == null)
      jcasType.jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_uRI, v);}    
   
    
  //*--------------*
  //* Feature: version

  /** setter for version - sets  
   * @generated */
  public void setVersion(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_version == null)
      jcasType.jcas.throwFeatMissing("version", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_version, v);}    
   
    
  /** setter for whenRecorded - sets  
   * @generated */
  public void setWhenRecorded(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_whenRecorded == null)
      jcasType.jcas.throwFeatMissing("whenRecorded", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_whenRecorded, v);}    
   
    
  //*--------------*
  //* Feature: whenRecorded

  /** setter for whereInSource - sets  
   * @generated */
  public void setWhereInSource(String v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_whereInSource == null)
      jcasType.jcas.throwFeatMissing("whereInSource", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_whereInSource, v);}    
   
    
  /** setter for wifeMoth - sets  
   * @generated */
  public void setWifeMoth(WifeMothType v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_wifeMoth == null)
      jcasType.jcas.throwFeatMissing("wifeMoth", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_wifeMoth, jcasType.ll_cas.ll_getFSRef(v));}    
                                                  //*--------------*
  //* Feature: whereInSource

  /** setter for xMLNSPrefixMap - sets  
   * @generated */
  public void setXMLNSPrefixMap(FSArray v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_xMLNSPrefixMap == null)
      jcasType.jcas.throwFeatMissing("xMLNSPrefixMap", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xMLNSPrefixMap, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for xMLNSPrefixMap - sets an indexed value - 
   * @generated */
  public void setXMLNSPrefixMap(int i, TOP v) { 
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_xMLNSPrefixMap == null)
      jcasType.jcas.throwFeatMissing("xMLNSPrefixMap", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xMLNSPrefixMap), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xMLNSPrefixMap), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: wifeMoth

  /** setter for xSISchemaLocation - sets  
   * @generated */
  public void setXSISchemaLocation(FSArray v) {
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_xSISchemaLocation == null)
      jcasType.jcas.throwFeatMissing("xSISchemaLocation", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.ll_cas.ll_setRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xSISchemaLocation, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed setter for xSISchemaLocation - sets an indexed value - 
   * @generated */
  public void setXSISchemaLocation(int i, TOP v) { 
    if (DocumentRoot_Type.featOkTst && ((DocumentRoot_Type)jcasType).casFeat_xSISchemaLocation == null)
      jcasType.jcas.throwFeatMissing("xSISchemaLocation", "net.myerichsen.gedcom.DocumentRoot");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xSISchemaLocation), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DocumentRoot_Type)jcasType).casFeatCode_xSISchemaLocation), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
}

    