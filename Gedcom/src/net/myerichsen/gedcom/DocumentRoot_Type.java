
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
 * Updated by JCasGen Wed Apr 10 09:47:34 CEST 2013
 * @generated */
public class DocumentRoot_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DocumentRoot_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DocumentRoot_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DocumentRoot(addr, DocumentRoot_Type.this);
  			   DocumentRoot_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DocumentRoot(addr, DocumentRoot_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = DocumentRoot.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.DocumentRoot");
  /** @generated */
  final Feature casFeat_mixed;
 
  /** @generated */
  final int     casFeatCode_mixed;
  /** @generated */
  final Feature casFeat_xMLNSPrefixMap;
  /** @generated */
  final int     casFeatCode_xMLNSPrefixMap;
  /** @generated */
  final Feature casFeat_xSISchemaLocation;
    
   /** @generated */
  final int     casFeatCode_xSISchemaLocation;
   
  /** @generated */
  final Feature casFeat_addressee;
 
 
  /** @generated */
  final int     casFeatCode_addressee;
  /** @generated */
  final Feature casFeat_addrLine;
  /** @generated */
  final int     casFeatCode_addrLine;
  /** @generated */
  final Feature casFeat_age;
    
   /** @generated */
  final int     casFeatCode_age;
   
  /** @generated */
  final Feature casFeat_article;
 
 
  /** @generated */
  final int     casFeatCode_article;
  /** @generated */
  final Feature casFeat_association;
  /** @generated */
  final int     casFeatCode_association;
  /** @generated */
  final Feature casFeat_assocIndiv;
    
   /** @generated */
  final int     casFeatCode_assocIndiv;
   
  /** @generated */
  final Feature casFeat_author;
 
 
  /** @generated */
  final int     casFeatCode_author;
  /** @generated */
  final Feature casFeat_basedOn;
  /** @generated */
  final int     casFeatCode_basedOn;
  /** @generated */
  final Feature casFeat_callNbr;
    
  
 
  /** @generated */
  final int     casFeatCode_callNbr;
  /** @generated */
  final Feature casFeat_caption;
  /** @generated */
  final int     casFeatCode_caption;
  /** @generated */
  final Feature casFeat_changed;
    
  
 
  /** @generated */
  final int     casFeatCode_changed;
  /** @generated */
  final Feature casFeat_child;
  /** @generated */
  final int     casFeatCode_child;
  /** @generated */
  final Feature casFeat_childNbr;
    
  
 
  /** @generated */
  final int     casFeatCode_childNbr;
  /** @generated */
  final Feature casFeat_citation;
  /** @generated */
  final int     casFeatCode_citation;
  /** @generated */
  final Feature casFeat_contact;
    
  
 
  /** @generated */
  final int     casFeatCode_contact;
  /** @generated */
  final Feature casFeat_contactRec;
  /** @generated */
  final int     casFeatCode_contactRec;
  /** @generated */
  final Feature casFeat_coordinates;
    
  
 
  /** @generated */
  final int     casFeatCode_coordinates;
  /** @generated */
  final Feature casFeat_copyright;
  /** @generated */
  final int     casFeatCode_copyright;
  /** @generated */
  final Feature casFeat_date;
    
  
 
  /** @generated */
  final int     casFeatCode_date;
  /** @generated */
  final Feature casFeat_deathStatus;
  /** @generated */
  final int     casFeatCode_deathStatus;
  /** @generated */
  final Feature casFeat_dupIndiv;
    
  
 
  /** @generated */
  final int     casFeatCode_dupIndiv;
  /** @generated */
  final Feature casFeat_email;
  /** @generated */
  final int     casFeatCode_email;
  /** @generated */
  final Feature casFeat_enrichment;
    
  
 
  /** @generated */
  final int     casFeatCode_enrichment;
  /** @generated */
  final Feature casFeat_eventRec;
  /** @generated */
  final int     casFeatCode_eventRec;
  /** @generated */
  final Feature casFeat_evidence;
    
  
 
  /** @generated */
  final int     casFeatCode_evidence;
  /** @generated */
  final Feature casFeat_externalID;
  /** @generated */
  final int     casFeatCode_externalID;
  /** @generated */
  final Feature casFeat_extract;
    
  
 
  /** @generated */
  final int     casFeatCode_extract;
  /** @generated */
  final Feature casFeat_familyNbr;
  /** @generated */
  final int     casFeatCode_familyNbr;
  /** @generated */
  final Feature casFeat_familyRec;
    
  
 
  /** @generated */
  final int     casFeatCode_familyRec;
  /** @generated */
  final Feature casFeat_fileCreation;
  /** @generated */
  final int     casFeatCode_fileCreation;
  /** @generated */
  final Feature casFeat_gEDCOM;
    
  
 
  /** @generated */
  final int     casFeatCode_gEDCOM;
  /** @generated */
  final Feature casFeat_gender;
  /** @generated */
  final int     casFeatCode_gender;
  /** @generated */
  final Feature casFeat_groupRec;
    
  
 
  /** @generated */
  final int     casFeatCode_groupRec;
  /** @generated */
  final Feature casFeat_headerRec;
  /** @generated */
  final int     casFeatCode_headerRec;
  /** @generated */
  final Feature casFeat_husbFath;
    
  
 
  /** @generated */
  final int     casFeatCode_husbFath;
  /** @generated */
  final Feature casFeat_individualRec;
  /** @generated */
  final int     casFeatCode_individualRec;
  /** @generated */
  final Feature casFeat_indivName;
    
  
 
  /** @generated */
  final int     casFeatCode_indivName;
  /** @generated */
  final Feature casFeat_indivNameVariation;
  /** @generated */
  final int     casFeatCode_indivNameVariation;
  /** @generated */
  final Feature casFeat_information;
    
  
 
  /** @generated */
  final int     casFeatCode_information;
  /** @generated */
  final Feature casFeat_lDSOrdRec;
  /** @generated */
  final int     casFeatCode_lDSOrdRec;
  /** @generated */
  final Feature casFeat_link;
    
  
 
  /** @generated */
  final int     casFeatCode_link;
  /** @generated */
  final Feature casFeat_living;
  /** @generated */
  final int     casFeatCode_living;
  /** @generated */
  final Feature casFeat_mailAddress;
    
  
 
  /** @generated */
  final int     casFeatCode_mailAddress;
  /** @generated */
  final Feature casFeat_member;
  /** @generated */
  final int     casFeatCode_member;
  /** @generated */
  final Feature casFeat_name;
    
  
 
  /** @generated */
  final int     casFeatCode_name;
  /** @generated */
  final Feature casFeat_namePart;
  /** @generated */
  final int     casFeatCode_namePart;
  /** @generated */
  final Feature casFeat_note;
    
  
 
  /** @generated */
  final int     casFeatCode_note;
  /** @generated */
  final Feature casFeat_ordStat;
  /** @generated */
  final int     casFeatCode_ordStat;
  /** @generated */
  final Feature casFeat_parentGroup;
    
  
 
  /** @generated */
  final int     casFeatCode_parentGroup;
  /** @generated */
  final Feature casFeat_participant;
  /** @generated */
  final int     casFeatCode_participant;
  /** @generated */
  final Feature casFeat_persInfo;
    
  
 
  /** @generated */
  final int     casFeatCode_persInfo;
  /** @generated */
  final Feature casFeat_phone;
  /** @generated */
  final int     casFeatCode_phone;
  /** @generated */
  final Feature casFeat_place;
    
  
 
  /** @generated */
  final int     casFeatCode_place;
  /** @generated */
  final Feature casFeat_placeName;
  /** @generated */
  final int     casFeatCode_placeName;
  /** @generated */
  final Feature casFeat_placeNameVar;
    
  
 
  /** @generated */
  final int     casFeatCode_placeNameVar;
  /** @generated */
  final Feature casFeat_placePart;
  /** @generated */
  final int     casFeatCode_placePart;
  /** @generated */
  final Feature casFeat_product;
    
  
 
  /** @generated */
  final int     casFeatCode_product;
  /** @generated */
  final Feature casFeat_productID;
  /** @generated */
  final int     casFeatCode_productID;
  /** @generated */
  final Feature casFeat_public;
    
  
 
  /** @generated */
  final int     casFeatCode_public;
  /** @generated */
  final Feature casFeat_publishing;
  /** @generated */
  final int     casFeatCode_publishing;
  /** @generated */
  final Feature casFeat_religion;
    
  
 
  /** @generated */
  final int     casFeatCode_religion;
  /** @generated */
  final Feature casFeat_relToFath;
  /** @generated */
  final int     casFeatCode_relToFath;
  /** @generated */
  final Feature casFeat_relToMoth;
    
  
 
  /** @generated */
  final int     casFeatCode_relToMoth;
  /** @generated */
  final Feature casFeat_repository;
  /** @generated */
  final int     casFeatCode_repository;
  /** @generated */
  final Feature casFeat_repositoryRec;
    
  
 
  /** @generated */
  final int     casFeatCode_repositoryRec;
  /** @generated */
  final Feature casFeat_role;
  /** @generated */
  final int     casFeatCode_role;
  /** @generated */
  final Feature casFeat_sameIndiv;
    
  
 
  /** @generated */
  final int     casFeatCode_sameIndiv;
  /** @generated */
  final Feature casFeat_sourceRec;
  /** @generated */
  final int     casFeatCode_sourceRec;
  /** @generated */
  final Feature casFeat_submitter;
    
  
 
  /** @generated */
  final int     casFeatCode_submitter;
  /** @generated */
  final Feature casFeat_supplier;
  /** @generated */
  final int     casFeatCode_supplier;
  /** @generated */
  final Feature casFeat_templeCode;
    
  
 
  /** @generated */
  final int     casFeatCode_templeCode;
  /** @generated */
  final Feature casFeat_title;
  /** @generated */
  final int     casFeatCode_title;
  /** @generated */
  final Feature casFeat_uRI;
    
  
 
  /** @generated */
  final int     casFeatCode_uRI;
  /** @generated */
  final Feature casFeat_version;
  /** @generated */
  final int     casFeatCode_version;
  /** @generated */
  final Feature casFeat_whenRecorded;
    
  
 
  /** @generated */
  final int     casFeatCode_whenRecorded;
  /** @generated */
  final Feature casFeat_whereInSource;
  /** @generated */
  final int     casFeatCode_whereInSource;
  /** @generated */
  final Feature casFeat_wifeMoth;
    
  
 
  /** @generated */
  final int     casFeatCode_wifeMoth;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DocumentRoot_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_mixed = jcas.getRequiredFeatureDE(casType, "mixed", "uima.cas.StringArray", featOkTst);
    casFeatCode_mixed  = (null == casFeat_mixed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mixed).getCode();

 
    casFeat_xMLNSPrefixMap = jcas.getRequiredFeatureDE(casType, "xMLNSPrefixMap", "uima.cas.FSArray", featOkTst);
    casFeatCode_xMLNSPrefixMap  = (null == casFeat_xMLNSPrefixMap) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_xMLNSPrefixMap).getCode();

 
    casFeat_xSISchemaLocation = jcas.getRequiredFeatureDE(casType, "xSISchemaLocation", "uima.cas.FSArray", featOkTst);
    casFeatCode_xSISchemaLocation  = (null == casFeat_xSISchemaLocation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_xSISchemaLocation).getCode();

 
    casFeat_addressee = jcas.getRequiredFeatureDE(casType, "addressee", "uima.cas.String", featOkTst);
    casFeatCode_addressee  = (null == casFeat_addressee) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_addressee).getCode();

 
    casFeat_addrLine = jcas.getRequiredFeatureDE(casType, "addrLine", "net.myerichsen.gedcom.AddrLineType", featOkTst);
    casFeatCode_addrLine  = (null == casFeat_addrLine) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_addrLine).getCode();

 
    casFeat_age = jcas.getRequiredFeatureDE(casType, "age", "uima.cas.String", featOkTst);
    casFeatCode_age  = (null == casFeat_age) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_age).getCode();

 
    casFeat_article = jcas.getRequiredFeatureDE(casType, "article", "uima.cas.String", featOkTst);
    casFeatCode_article  = (null == casFeat_article) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_article).getCode();

 
    casFeat_association = jcas.getRequiredFeatureDE(casType, "association", "uima.cas.String", featOkTst);
    casFeatCode_association  = (null == casFeat_association) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_association).getCode();

 
    casFeat_assocIndiv = jcas.getRequiredFeatureDE(casType, "assocIndiv", "net.myerichsen.gedcom.AssocIndivType", featOkTst);
    casFeatCode_assocIndiv  = (null == casFeat_assocIndiv) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_assocIndiv).getCode();

 
    casFeat_author = jcas.getRequiredFeatureDE(casType, "author", "uima.cas.String", featOkTst);
    casFeatCode_author  = (null == casFeat_author) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_author).getCode();

 
    casFeat_basedOn = jcas.getRequiredFeatureDE(casType, "basedOn", "net.myerichsen.gedcom.BasedOnType", featOkTst);
    casFeatCode_basedOn  = (null == casFeat_basedOn) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_basedOn).getCode();

 
    casFeat_callNbr = jcas.getRequiredFeatureDE(casType, "callNbr", "uima.cas.String", featOkTst);
    casFeatCode_callNbr  = (null == casFeat_callNbr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_callNbr).getCode();

 
    casFeat_caption = jcas.getRequiredFeatureDE(casType, "caption", "uima.cas.String", featOkTst);
    casFeatCode_caption  = (null == casFeat_caption) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_caption).getCode();

 
    casFeat_changed = jcas.getRequiredFeatureDE(casType, "changed", "net.myerichsen.gedcom.ChangedType", featOkTst);
    casFeatCode_changed  = (null == casFeat_changed) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_changed).getCode();

 
    casFeat_child = jcas.getRequiredFeatureDE(casType, "child", "net.myerichsen.gedcom.ChildType", featOkTst);
    casFeatCode_child  = (null == casFeat_child) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_child).getCode();

 
    casFeat_childNbr = jcas.getRequiredFeatureDE(casType, "childNbr", "uima.cas.String", featOkTst);
    casFeatCode_childNbr  = (null == casFeat_childNbr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_childNbr).getCode();

 
    casFeat_citation = jcas.getRequiredFeatureDE(casType, "citation", "net.myerichsen.gedcom.CitationType", featOkTst);
    casFeatCode_citation  = (null == casFeat_citation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_citation).getCode();

 
    casFeat_contact = jcas.getRequiredFeatureDE(casType, "contact", "net.myerichsen.gedcom.ContactType", featOkTst);
    casFeatCode_contact  = (null == casFeat_contact) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contact).getCode();

 
    casFeat_contactRec = jcas.getRequiredFeatureDE(casType, "contactRec", "net.myerichsen.gedcom.ContactRecType", featOkTst);
    casFeatCode_contactRec  = (null == casFeat_contactRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_contactRec).getCode();

 
    casFeat_coordinates = jcas.getRequiredFeatureDE(casType, "coordinates", "uima.cas.String", featOkTst);
    casFeatCode_coordinates  = (null == casFeat_coordinates) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_coordinates).getCode();

 
    casFeat_copyright = jcas.getRequiredFeatureDE(casType, "copyright", "uima.cas.String", featOkTst);
    casFeatCode_copyright  = (null == casFeat_copyright) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_copyright).getCode();

 
    casFeat_date = jcas.getRequiredFeatureDE(casType, "date", "net.myerichsen.gedcom.DateType", featOkTst);
    casFeatCode_date  = (null == casFeat_date) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_date).getCode();

 
    casFeat_deathStatus = jcas.getRequiredFeatureDE(casType, "deathStatus", "net.myerichsen.gedcom.DeathStatusType", featOkTst);
    casFeatCode_deathStatus  = (null == casFeat_deathStatus) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_deathStatus).getCode();

 
    casFeat_dupIndiv = jcas.getRequiredFeatureDE(casType, "dupIndiv", "net.myerichsen.gedcom.DupIndivType", featOkTst);
    casFeatCode_dupIndiv  = (null == casFeat_dupIndiv) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_dupIndiv).getCode();

 
    casFeat_email = jcas.getRequiredFeatureDE(casType, "email", "uima.cas.String", featOkTst);
    casFeatCode_email  = (null == casFeat_email) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_email).getCode();

 
    casFeat_enrichment = jcas.getRequiredFeatureDE(casType, "enrichment", "net.myerichsen.gedcom.EnrichmentType", featOkTst);
    casFeatCode_enrichment  = (null == casFeat_enrichment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_enrichment).getCode();

 
    casFeat_eventRec = jcas.getRequiredFeatureDE(casType, "eventRec", "net.myerichsen.gedcom.EventRecType", featOkTst);
    casFeatCode_eventRec  = (null == casFeat_eventRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_eventRec).getCode();

 
    casFeat_evidence = jcas.getRequiredFeatureDE(casType, "evidence", "net.myerichsen.gedcom.EvidenceType", featOkTst);
    casFeatCode_evidence  = (null == casFeat_evidence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_evidence).getCode();

 
    casFeat_externalID = jcas.getRequiredFeatureDE(casType, "externalID", "net.myerichsen.gedcom.ExternalIDType", featOkTst);
    casFeatCode_externalID  = (null == casFeat_externalID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_externalID).getCode();

 
    casFeat_extract = jcas.getRequiredFeatureDE(casType, "extract", "net.myerichsen.gedcom.ExtractType", featOkTst);
    casFeatCode_extract  = (null == casFeat_extract) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_extract).getCode();

 
    casFeat_familyNbr = jcas.getRequiredFeatureDE(casType, "familyNbr", "net.myerichsen.gedcom.FamilyNbrType", featOkTst);
    casFeatCode_familyNbr  = (null == casFeat_familyNbr) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_familyNbr).getCode();

 
    casFeat_familyRec = jcas.getRequiredFeatureDE(casType, "familyRec", "net.myerichsen.gedcom.FamilyRecType", featOkTst);
    casFeatCode_familyRec  = (null == casFeat_familyRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_familyRec).getCode();

 
    casFeat_fileCreation = jcas.getRequiredFeatureDE(casType, "fileCreation", "net.myerichsen.gedcom.FileCreationType", featOkTst);
    casFeatCode_fileCreation  = (null == casFeat_fileCreation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fileCreation).getCode();

 
    casFeat_gEDCOM = jcas.getRequiredFeatureDE(casType, "gEDCOM", "net.myerichsen.gedcom.GEDCOMType", featOkTst);
    casFeatCode_gEDCOM  = (null == casFeat_gEDCOM) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gEDCOM).getCode();

 
    casFeat_gender = jcas.getRequiredFeatureDE(casType, "gender", "net.myerichsen.gedcom.GenderType", featOkTst);
    casFeatCode_gender  = (null == casFeat_gender) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gender).getCode();

 
    casFeat_groupRec = jcas.getRequiredFeatureDE(casType, "groupRec", "net.myerichsen.gedcom.GroupRecType", featOkTst);
    casFeatCode_groupRec  = (null == casFeat_groupRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_groupRec).getCode();

 
    casFeat_headerRec = jcas.getRequiredFeatureDE(casType, "headerRec", "net.myerichsen.gedcom.HeaderRecType", featOkTst);
    casFeatCode_headerRec  = (null == casFeat_headerRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_headerRec).getCode();

 
    casFeat_husbFath = jcas.getRequiredFeatureDE(casType, "husbFath", "net.myerichsen.gedcom.HusbFathType", featOkTst);
    casFeatCode_husbFath  = (null == casFeat_husbFath) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_husbFath).getCode();

 
    casFeat_individualRec = jcas.getRequiredFeatureDE(casType, "individualRec", "net.myerichsen.gedcom.IndividualRecType", featOkTst);
    casFeatCode_individualRec  = (null == casFeat_individualRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_individualRec).getCode();

 
    casFeat_indivName = jcas.getRequiredFeatureDE(casType, "indivName", "net.myerichsen.gedcom.IndivNameType", featOkTst);
    casFeatCode_indivName  = (null == casFeat_indivName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indivName).getCode();

 
    casFeat_indivNameVariation = jcas.getRequiredFeatureDE(casType, "indivNameVariation", "net.myerichsen.gedcom.IndivNameVariationType", featOkTst);
    casFeatCode_indivNameVariation  = (null == casFeat_indivNameVariation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_indivNameVariation).getCode();

 
    casFeat_information = jcas.getRequiredFeatureDE(casType, "information", "uima.cas.String", featOkTst);
    casFeatCode_information  = (null == casFeat_information) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_information).getCode();

 
    casFeat_lDSOrdRec = jcas.getRequiredFeatureDE(casType, "lDSOrdRec", "net.myerichsen.gedcom.LDSOrdRecType", featOkTst);
    casFeatCode_lDSOrdRec  = (null == casFeat_lDSOrdRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lDSOrdRec).getCode();

 
    casFeat_link = jcas.getRequiredFeatureDE(casType, "link", "net.myerichsen.gedcom.LinkType", featOkTst);
    casFeatCode_link  = (null == casFeat_link) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_link).getCode();

 
    casFeat_living = jcas.getRequiredFeatureDE(casType, "living", "net.myerichsen.gedcom.LivingType", featOkTst);
    casFeatCode_living  = (null == casFeat_living) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_living).getCode();

 
    casFeat_mailAddress = jcas.getRequiredFeatureDE(casType, "mailAddress", "net.myerichsen.gedcom.MailAddressType", featOkTst);
    casFeatCode_mailAddress  = (null == casFeat_mailAddress) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mailAddress).getCode();

 
    casFeat_member = jcas.getRequiredFeatureDE(casType, "member", "net.myerichsen.gedcom.MemberType", featOkTst);
    casFeatCode_member  = (null == casFeat_member) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_member).getCode();

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "net.myerichsen.gedcom.NameType", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_namePart = jcas.getRequiredFeatureDE(casType, "namePart", "net.myerichsen.gedcom.NamePartType", featOkTst);
    casFeatCode_namePart  = (null == casFeat_namePart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_namePart).getCode();

 
    casFeat_note = jcas.getRequiredFeatureDE(casType, "note", "net.myerichsen.gedcom.NoteType", featOkTst);
    casFeatCode_note  = (null == casFeat_note) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_note).getCode();

 
    casFeat_ordStat = jcas.getRequiredFeatureDE(casType, "ordStat", "net.myerichsen.gedcom.OrdStatType", featOkTst);
    casFeatCode_ordStat  = (null == casFeat_ordStat) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ordStat).getCode();

 
    casFeat_parentGroup = jcas.getRequiredFeatureDE(casType, "parentGroup", "net.myerichsen.gedcom.ParentGroupType", featOkTst);
    casFeatCode_parentGroup  = (null == casFeat_parentGroup) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_parentGroup).getCode();

 
    casFeat_participant = jcas.getRequiredFeatureDE(casType, "participant", "net.myerichsen.gedcom.ParticipantType", featOkTst);
    casFeatCode_participant  = (null == casFeat_participant) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_participant).getCode();

 
    casFeat_persInfo = jcas.getRequiredFeatureDE(casType, "persInfo", "net.myerichsen.gedcom.PersInfoType", featOkTst);
    casFeatCode_persInfo  = (null == casFeat_persInfo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_persInfo).getCode();

 
    casFeat_phone = jcas.getRequiredFeatureDE(casType, "phone", "net.myerichsen.gedcom.PhoneType", featOkTst);
    casFeatCode_phone  = (null == casFeat_phone) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_phone).getCode();

 
    casFeat_place = jcas.getRequiredFeatureDE(casType, "place", "net.myerichsen.gedcom.PlaceType", featOkTst);
    casFeatCode_place  = (null == casFeat_place) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_place).getCode();

 
    casFeat_placeName = jcas.getRequiredFeatureDE(casType, "placeName", "net.myerichsen.gedcom.PlaceNameType", featOkTst);
    casFeatCode_placeName  = (null == casFeat_placeName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_placeName).getCode();

 
    casFeat_placeNameVar = jcas.getRequiredFeatureDE(casType, "placeNameVar", "net.myerichsen.gedcom.PlaceNameVarType", featOkTst);
    casFeatCode_placeNameVar  = (null == casFeat_placeNameVar) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_placeNameVar).getCode();

 
    casFeat_placePart = jcas.getRequiredFeatureDE(casType, "placePart", "net.myerichsen.gedcom.PlacePartType", featOkTst);
    casFeatCode_placePart  = (null == casFeat_placePart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_placePart).getCode();

 
    casFeat_product = jcas.getRequiredFeatureDE(casType, "product", "net.myerichsen.gedcom.ProductType", featOkTst);
    casFeatCode_product  = (null == casFeat_product) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_product).getCode();

 
    casFeat_productID = jcas.getRequiredFeatureDE(casType, "productID", "uima.cas.String", featOkTst);
    casFeatCode_productID  = (null == casFeat_productID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_productID).getCode();

 
    casFeat_public = jcas.getRequiredFeatureDE(casType, "public", "net.myerichsen.gedcom.PublicType", featOkTst);
    casFeatCode_public  = (null == casFeat_public) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_public).getCode();

 
    casFeat_publishing = jcas.getRequiredFeatureDE(casType, "publishing", "net.myerichsen.gedcom.PublishingType", featOkTst);
    casFeatCode_publishing  = (null == casFeat_publishing) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_publishing).getCode();

 
    casFeat_religion = jcas.getRequiredFeatureDE(casType, "religion", "net.myerichsen.gedcom.ReligionType", featOkTst);
    casFeatCode_religion  = (null == casFeat_religion) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_religion).getCode();

 
    casFeat_relToFath = jcas.getRequiredFeatureDE(casType, "relToFath", "net.myerichsen.gedcom.RelToFathType", featOkTst);
    casFeatCode_relToFath  = (null == casFeat_relToFath) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relToFath).getCode();

 
    casFeat_relToMoth = jcas.getRequiredFeatureDE(casType, "relToMoth", "net.myerichsen.gedcom.RelToMothType", featOkTst);
    casFeatCode_relToMoth  = (null == casFeat_relToMoth) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_relToMoth).getCode();

 
    casFeat_repository = jcas.getRequiredFeatureDE(casType, "repository", "net.myerichsen.gedcom.RepositoryType", featOkTst);
    casFeatCode_repository  = (null == casFeat_repository) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_repository).getCode();

 
    casFeat_repositoryRec = jcas.getRequiredFeatureDE(casType, "repositoryRec", "net.myerichsen.gedcom.RepositoryRecType", featOkTst);
    casFeatCode_repositoryRec  = (null == casFeat_repositoryRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_repositoryRec).getCode();

 
    casFeat_role = jcas.getRequiredFeatureDE(casType, "role", "uima.cas.String", featOkTst);
    casFeatCode_role  = (null == casFeat_role) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_role).getCode();

 
    casFeat_sameIndiv = jcas.getRequiredFeatureDE(casType, "sameIndiv", "net.myerichsen.gedcom.SameIndivType", featOkTst);
    casFeatCode_sameIndiv  = (null == casFeat_sameIndiv) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sameIndiv).getCode();

 
    casFeat_sourceRec = jcas.getRequiredFeatureDE(casType, "sourceRec", "net.myerichsen.gedcom.SourceRecType", featOkTst);
    casFeatCode_sourceRec  = (null == casFeat_sourceRec) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sourceRec).getCode();

 
    casFeat_submitter = jcas.getRequiredFeatureDE(casType, "submitter", "net.myerichsen.gedcom.SubmitterType", featOkTst);
    casFeatCode_submitter  = (null == casFeat_submitter) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_submitter).getCode();

 
    casFeat_supplier = jcas.getRequiredFeatureDE(casType, "supplier", "net.myerichsen.gedcom.SupplierType", featOkTst);
    casFeatCode_supplier  = (null == casFeat_supplier) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_supplier).getCode();

 
    casFeat_templeCode = jcas.getRequiredFeatureDE(casType, "templeCode", "uima.cas.String", featOkTst);
    casFeatCode_templeCode  = (null == casFeat_templeCode) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_templeCode).getCode();

 
    casFeat_title = jcas.getRequiredFeatureDE(casType, "title", "uima.cas.String", featOkTst);
    casFeatCode_title  = (null == casFeat_title) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_title).getCode();

 
    casFeat_uRI = jcas.getRequiredFeatureDE(casType, "uRI", "uima.cas.String", featOkTst);
    casFeatCode_uRI  = (null == casFeat_uRI) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_uRI).getCode();

 
    casFeat_version = jcas.getRequiredFeatureDE(casType, "version", "uima.cas.String", featOkTst);
    casFeatCode_version  = (null == casFeat_version) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_version).getCode();

 
    casFeat_whenRecorded = jcas.getRequiredFeatureDE(casType, "whenRecorded", "uima.cas.String", featOkTst);
    casFeatCode_whenRecorded  = (null == casFeat_whenRecorded) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_whenRecorded).getCode();

 
    casFeat_whereInSource = jcas.getRequiredFeatureDE(casType, "whereInSource", "uima.cas.String", featOkTst);
    casFeatCode_whereInSource  = (null == casFeat_whereInSource) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_whereInSource).getCode();

 
    casFeat_wifeMoth = jcas.getRequiredFeatureDE(casType, "wifeMoth", "net.myerichsen.gedcom.WifeMothType", featOkTst);
    casFeatCode_wifeMoth  = (null == casFeat_wifeMoth) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_wifeMoth).getCode();

  }
  /** @generated */ 
  public String getAddressee(int addr) {
        if (featOkTst && casFeat_addressee == null)
      jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_addressee);
  }
  /** @generated */ 
  public int getAddrLine(int addr) {
        if (featOkTst && casFeat_addrLine == null)
      jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_addrLine);
  }
  /** @generated */ 
  public String getAge(int addr) {
        if (featOkTst && casFeat_age == null)
      jcas.throwFeatMissing("age", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_age);
  }
  /** @generated */ 
  public String getArticle(int addr) {
        if (featOkTst && casFeat_article == null)
      jcas.throwFeatMissing("article", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_article);
  }
  /** @generated */ 
  public String getAssociation(int addr) {
        if (featOkTst && casFeat_association == null)
      jcas.throwFeatMissing("association", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_association);
  }
  /** @generated */ 
  public int getAssocIndiv(int addr) {
        if (featOkTst && casFeat_assocIndiv == null)
      jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_assocIndiv);
  }
  /** @generated */ 
  public String getAuthor(int addr) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_author);
  }
  /** @generated */ 
  public int getBasedOn(int addr) {
        if (featOkTst && casFeat_basedOn == null)
      jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_basedOn);
  }
  /** @generated */ 
  public String getCallNbr(int addr) {
        if (featOkTst && casFeat_callNbr == null)
      jcas.throwFeatMissing("callNbr", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_callNbr);
  }
  /** @generated */ 
  public String getCaption(int addr) {
        if (featOkTst && casFeat_caption == null)
      jcas.throwFeatMissing("caption", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_caption);
  }
  /** @generated */ 
  public int getChanged(int addr) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_changed);
  }
  /** @generated */ 
  public int getChild(int addr) {
        if (featOkTst && casFeat_child == null)
      jcas.throwFeatMissing("child", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_child);
  }
  /** @generated */ 
  public String getChildNbr(int addr) {
        if (featOkTst && casFeat_childNbr == null)
      jcas.throwFeatMissing("childNbr", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_childNbr);
  }
  /** @generated */ 
  public int getCitation(int addr) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_citation);
  }
  /** @generated */ 
  public int getContact(int addr) {
        if (featOkTst && casFeat_contact == null)
      jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_contact);
  }
  /** @generated */ 
  public int getContactRec(int addr) {
        if (featOkTst && casFeat_contactRec == null)
      jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_contactRec);
  }
  /** @generated */ 
  public String getCoordinates(int addr) {
        if (featOkTst && casFeat_coordinates == null)
      jcas.throwFeatMissing("coordinates", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_coordinates);
  }
  /** @generated */ 
  public String getCopyright(int addr) {
        if (featOkTst && casFeat_copyright == null)
      jcas.throwFeatMissing("copyright", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_copyright);
  }
  /** @generated */ 
  public int getDate(int addr) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_date);
  }
  /** @generated */ 
  public String getDeathStatus(int addr) {
        if (featOkTst && casFeat_deathStatus == null)
      jcas.throwFeatMissing("deathStatus", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_deathStatus);
  }
  /** @generated */ 
  public int getDupIndiv(int addr) {
        if (featOkTst && casFeat_dupIndiv == null)
      jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_dupIndiv);
  }
  /** @generated */ 
  public String getEmail(int addr) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_email);
  }
  /** @generated */ 
  public int getEnrichment(int addr) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_enrichment);
  }
  /** @generated */ 
  public int getEventRec(int addr) {
        if (featOkTst && casFeat_eventRec == null)
      jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_eventRec);
  }
  /** @generated */ 
  public int getEvidence(int addr) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_evidence);
  }
  /** @generated */ 
  public int getExternalID(int addr) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_externalID);
  }
  /** @generated */ 
  public int getExtract(int addr) {
        if (featOkTst && casFeat_extract == null)
      jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_extract);
  }
  /** @generated */ 
  public int getFamilyNbr(int addr) {
        if (featOkTst && casFeat_familyNbr == null)
      jcas.throwFeatMissing("familyNbr", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_familyNbr);
  }
  /** @generated */ 
  public int getFamilyRec(int addr) {
        if (featOkTst && casFeat_familyRec == null)
      jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_familyRec);
  }
  /** @generated */ 
  public int getFileCreation(int addr) {
        if (featOkTst && casFeat_fileCreation == null)
      jcas.throwFeatMissing("fileCreation", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_fileCreation);
  }
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */ 
  public int getGEDCOM(int addr) {
        if (featOkTst && casFeat_gEDCOM == null)
      jcas.throwFeatMissing("gEDCOM", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_gEDCOM);
  }
  /** @generated */ 
  public String getGender(int addr) {
        if (featOkTst && casFeat_gender == null)
      jcas.throwFeatMissing("gender", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gender);
  }
  /** @generated */ 
  public int getGroupRec(int addr) {
        if (featOkTst && casFeat_groupRec == null)
      jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_groupRec);
  }
  /** @generated */ 
  public int getHeaderRec(int addr) {
        if (featOkTst && casFeat_headerRec == null)
      jcas.throwFeatMissing("headerRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_headerRec);
  }
  /** @generated */ 
  public int getHusbFath(int addr) {
        if (featOkTst && casFeat_husbFath == null)
      jcas.throwFeatMissing("husbFath", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_husbFath);
  }
  /** @generated */ 
  public int getIndividualRec(int addr) {
        if (featOkTst && casFeat_individualRec == null)
      jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_individualRec);
  }
  /** @generated */ 
  public int getIndivName(int addr) {
        if (featOkTst && casFeat_indivName == null)
      jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_indivName);
  }
  /** @generated */ 
  public int getIndivNameVariation(int addr) {
        if (featOkTst && casFeat_indivNameVariation == null)
      jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_indivNameVariation);
  }
  /** @generated */ 
  public String getInformation(int addr) {
        if (featOkTst && casFeat_information == null)
      jcas.throwFeatMissing("information", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_information);
  }
  /** @generated */ 
  public int getLDSOrdRec(int addr) {
        if (featOkTst && casFeat_lDSOrdRec == null)
      jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_lDSOrdRec);
  }
  /** @generated */ 
  public int getLink(int addr) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_link);
  }
  /** @generated */ 
  public String getLiving(int addr) {
        if (featOkTst && casFeat_living == null)
      jcas.throwFeatMissing("living", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_living);
  }
  /** @generated */ 
  public int getMailAddress(int addr) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mailAddress);
  }
  /** @generated */ 
  public int getMember(int addr) {
        if (featOkTst && casFeat_member == null)
      jcas.throwFeatMissing("member", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_member);
  }
  /** @generated */ 
  public int getMixed(int addr) {
        if (featOkTst && casFeat_mixed == null)
      jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_mixed);
  }
  /** @generated */
  public String getMixed(int addr, int i) {
        if (featOkTst && casFeat_mixed == null)
      jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.DocumentRoot");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i);
  }
   
  /** @generated */ 
  public int getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_name);
  }
  /** @generated */ 
  public int getNamePart(int addr) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_namePart);
  }
  /** @generated */ 
  public int getNote(int addr) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_note);
  }
  /** @generated */ 
  public int getOrdStat(int addr) {
        if (featOkTst && casFeat_ordStat == null)
      jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ordStat);
  }
  /** @generated */ 
  public int getParentGroup(int addr) {
        if (featOkTst && casFeat_parentGroup == null)
      jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_parentGroup);
  }
  /** @generated */ 
  public int getParticipant(int addr) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_participant);
  }
  /** @generated */ 
  public int getPersInfo(int addr) {
        if (featOkTst && casFeat_persInfo == null)
      jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_persInfo);
  }
  /** @generated */ 
  public int getPhone(int addr) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_phone);
  }
  /** @generated */ 
  public int getPlace(int addr) {
        if (featOkTst && casFeat_place == null)
      jcas.throwFeatMissing("place", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_place);
  }
  /** @generated */ 
  public int getPlaceName(int addr) {
        if (featOkTst && casFeat_placeName == null)
      jcas.throwFeatMissing("placeName", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_placeName);
  }
  /** @generated */ 
  public int getPlaceNameVar(int addr) {
        if (featOkTst && casFeat_placeNameVar == null)
      jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_placeNameVar);
  }
  /** @generated */ 
  public int getPlacePart(int addr) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_placePart);
  }
  /** @generated */ 
  public int getProduct(int addr) {
        if (featOkTst && casFeat_product == null)
      jcas.throwFeatMissing("product", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_product);
  }
  /** @generated */ 
  public String getProductID(int addr) {
        if (featOkTst && casFeat_productID == null)
      jcas.throwFeatMissing("productID", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_productID);
  }
  /** @generated */ 
  public String getPublic(int addr) {
        if (featOkTst && casFeat_public == null)
      jcas.throwFeatMissing("public", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_public);
  }
  /** @generated */ 
  public int getPublishing(int addr) {
        if (featOkTst && casFeat_publishing == null)
      jcas.throwFeatMissing("publishing", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_publishing);
  }
  /** @generated */ 
  public int getReligion(int addr) {
        if (featOkTst && casFeat_religion == null)
      jcas.throwFeatMissing("religion", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_religion);
  }
  /** @generated */ 
  public String getRelToFath(int addr) {
        if (featOkTst && casFeat_relToFath == null)
      jcas.throwFeatMissing("relToFath", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relToFath);
  }
  /** @generated */ 
  public String getRelToMoth(int addr) {
        if (featOkTst && casFeat_relToMoth == null)
      jcas.throwFeatMissing("relToMoth", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_relToMoth);
  }
  /** @generated */ 
  public int getRepository(int addr) {
        if (featOkTst && casFeat_repository == null)
      jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_repository);
  }
  /** @generated */ 
  public int getRepositoryRec(int addr) {
        if (featOkTst && casFeat_repositoryRec == null)
      jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_repositoryRec);
  }
  /** @generated */ 
  public String getRole(int addr) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_role);
  }
  /** @generated */ 
  public int getSameIndiv(int addr) {
        if (featOkTst && casFeat_sameIndiv == null)
      jcas.throwFeatMissing("sameIndiv", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sameIndiv);
  }
  /** @generated */ 
  public int getSourceRec(int addr) {
        if (featOkTst && casFeat_sourceRec == null)
      jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sourceRec);
  }
  /** @generated */ 
  public int getSubmitter(int addr) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_submitter);
  }
  /** @generated */ 
  public int getSupplier(int addr) {
        if (featOkTst && casFeat_supplier == null)
      jcas.throwFeatMissing("supplier", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_supplier);
  }
  /** @generated */ 
  public String getTempleCode(int addr) {
        if (featOkTst && casFeat_templeCode == null)
      jcas.throwFeatMissing("templeCode", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_templeCode);
  }
  /** @generated */ 
  public String getTitle(int addr) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_title);
  }
  /** @generated */ 
  public String getURI(int addr) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_uRI);
  }
  /** @generated */ 
  public String getVersion(int addr) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_version);
  }
  /** @generated */ 
  public String getWhenRecorded(int addr) {
        if (featOkTst && casFeat_whenRecorded == null)
      jcas.throwFeatMissing("whenRecorded", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_whenRecorded);
  }
  /** @generated */ 
  public String getWhereInSource(int addr) {
        if (featOkTst && casFeat_whereInSource == null)
      jcas.throwFeatMissing("whereInSource", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_whereInSource);
  }
  /** @generated */ 
  public int getWifeMoth(int addr) {
        if (featOkTst && casFeat_wifeMoth == null)
      jcas.throwFeatMissing("wifeMoth", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_wifeMoth);
  }
  /** @generated */ 
  public int getXMLNSPrefixMap(int addr) {
        if (featOkTst && casFeat_xMLNSPrefixMap == null)
      jcas.throwFeatMissing("xMLNSPrefixMap", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_xMLNSPrefixMap);
  }
  /** @generated */
  public int getXMLNSPrefixMap(int addr, int i) {
        if (featOkTst && casFeat_xMLNSPrefixMap == null)
      jcas.throwFeatMissing("xMLNSPrefixMap", "net.myerichsen.gedcom.DocumentRoot");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xMLNSPrefixMap), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_xMLNSPrefixMap), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xMLNSPrefixMap), i);
  }
   
  /** @generated */ 
  public int getXSISchemaLocation(int addr) {
        if (featOkTst && casFeat_xSISchemaLocation == null)
      jcas.throwFeatMissing("xSISchemaLocation", "net.myerichsen.gedcom.DocumentRoot");
    return ll_cas.ll_getRefValue(addr, casFeatCode_xSISchemaLocation);
  }
  /** @generated */
  public int getXSISchemaLocation(int addr, int i) {
        if (featOkTst && casFeat_xSISchemaLocation == null)
      jcas.throwFeatMissing("xSISchemaLocation", "net.myerichsen.gedcom.DocumentRoot");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xSISchemaLocation), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_xSISchemaLocation), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xSISchemaLocation), i);
  }
   
  /** @generated */    
  public void setAddressee(int addr, String v) {
        if (featOkTst && casFeat_addressee == null)
      jcas.throwFeatMissing("addressee", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_addressee, v);}
    
  
 
  /** @generated */    
  public void setAddrLine(int addr, int v) {
        if (featOkTst && casFeat_addrLine == null)
      jcas.throwFeatMissing("addrLine", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_addrLine, v);}
    
  
 
  /** @generated */    
  public void setAge(int addr, String v) {
        if (featOkTst && casFeat_age == null)
      jcas.throwFeatMissing("age", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_age, v);}
    
  
 
  /** @generated */    
  public void setArticle(int addr, String v) {
        if (featOkTst && casFeat_article == null)
      jcas.throwFeatMissing("article", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_article, v);}
    
  
 
  /** @generated */    
  public void setAssociation(int addr, String v) {
        if (featOkTst && casFeat_association == null)
      jcas.throwFeatMissing("association", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_association, v);}
    
  
 
  /** @generated */    
  public void setAssocIndiv(int addr, int v) {
        if (featOkTst && casFeat_assocIndiv == null)
      jcas.throwFeatMissing("assocIndiv", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_assocIndiv, v);}
    
  
 
  /** @generated */    
  public void setAuthor(int addr, String v) {
        if (featOkTst && casFeat_author == null)
      jcas.throwFeatMissing("author", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_author, v);}
    
  
 
  /** @generated */    
  public void setBasedOn(int addr, int v) {
        if (featOkTst && casFeat_basedOn == null)
      jcas.throwFeatMissing("basedOn", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_basedOn, v);}
    
  
 
  /** @generated */    
  public void setCallNbr(int addr, String v) {
        if (featOkTst && casFeat_callNbr == null)
      jcas.throwFeatMissing("callNbr", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_callNbr, v);}
    
  
 
  /** @generated */    
  public void setCaption(int addr, String v) {
        if (featOkTst && casFeat_caption == null)
      jcas.throwFeatMissing("caption", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_caption, v);}
    
  
 
  /** @generated */    
  public void setChanged(int addr, int v) {
        if (featOkTst && casFeat_changed == null)
      jcas.throwFeatMissing("changed", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_changed, v);}
    
  
 
  /** @generated */    
  public void setChild(int addr, int v) {
        if (featOkTst && casFeat_child == null)
      jcas.throwFeatMissing("child", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_child, v);}
    
  
 
  /** @generated */    
  public void setChildNbr(int addr, String v) {
        if (featOkTst && casFeat_childNbr == null)
      jcas.throwFeatMissing("childNbr", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_childNbr, v);}
    
  
 
  /** @generated */    
  public void setCitation(int addr, int v) {
        if (featOkTst && casFeat_citation == null)
      jcas.throwFeatMissing("citation", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_citation, v);}
    
  
 
  /** @generated */    
  public void setContact(int addr, int v) {
        if (featOkTst && casFeat_contact == null)
      jcas.throwFeatMissing("contact", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_contact, v);}
    
  
 
  /** @generated */    
  public void setContactRec(int addr, int v) {
        if (featOkTst && casFeat_contactRec == null)
      jcas.throwFeatMissing("contactRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_contactRec, v);}
    
  
 
  /** @generated */    
  public void setCoordinates(int addr, String v) {
        if (featOkTst && casFeat_coordinates == null)
      jcas.throwFeatMissing("coordinates", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_coordinates, v);}
    
  
 
  /** @generated */    
  public void setCopyright(int addr, String v) {
        if (featOkTst && casFeat_copyright == null)
      jcas.throwFeatMissing("copyright", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_copyright, v);}
    
  
 
  /** @generated */    
  public void setDate(int addr, int v) {
        if (featOkTst && casFeat_date == null)
      jcas.throwFeatMissing("date", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_date, v);}
    
  
 
  /** @generated */    
  public void setDeathStatus(int addr, String v) {
        if (featOkTst && casFeat_deathStatus == null)
      jcas.throwFeatMissing("deathStatus", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_deathStatus, v);}
    
  
 
  /** @generated */    
  public void setDupIndiv(int addr, int v) {
        if (featOkTst && casFeat_dupIndiv == null)
      jcas.throwFeatMissing("dupIndiv", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_dupIndiv, v);}
    
  
 
  /** @generated */    
  public void setEmail(int addr, String v) {
        if (featOkTst && casFeat_email == null)
      jcas.throwFeatMissing("email", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_email, v);}
    
  
 
  /** @generated */    
  public void setEnrichment(int addr, int v) {
        if (featOkTst && casFeat_enrichment == null)
      jcas.throwFeatMissing("enrichment", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_enrichment, v);}
    
  
 
  /** @generated */    
  public void setEventRec(int addr, int v) {
        if (featOkTst && casFeat_eventRec == null)
      jcas.throwFeatMissing("eventRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_eventRec, v);}
    
  
 
  /** @generated */    
  public void setEvidence(int addr, int v) {
        if (featOkTst && casFeat_evidence == null)
      jcas.throwFeatMissing("evidence", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_evidence, v);}
    
  
 
  /** @generated */    
  public void setExternalID(int addr, int v) {
        if (featOkTst && casFeat_externalID == null)
      jcas.throwFeatMissing("externalID", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_externalID, v);}
    
  
 
  /** @generated */    
  public void setExtract(int addr, int v) {
        if (featOkTst && casFeat_extract == null)
      jcas.throwFeatMissing("extract", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_extract, v);}
    
  
 
  /** @generated */    
  public void setFamilyNbr(int addr, int v) {
        if (featOkTst && casFeat_familyNbr == null)
      jcas.throwFeatMissing("familyNbr", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_familyNbr, v);}
    
  
 
  /** @generated */    
  public void setFamilyRec(int addr, int v) {
        if (featOkTst && casFeat_familyRec == null)
      jcas.throwFeatMissing("familyRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_familyRec, v);}
    
  
 
  /** @generated */    
  public void setFileCreation(int addr, int v) {
        if (featOkTst && casFeat_fileCreation == null)
      jcas.throwFeatMissing("fileCreation", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_fileCreation, v);}
    
  
 
  /** @generated */    
  public void setGEDCOM(int addr, int v) {
        if (featOkTst && casFeat_gEDCOM == null)
      jcas.throwFeatMissing("gEDCOM", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_gEDCOM, v);}
    
  
 
  /** @generated */    
  public void setGender(int addr, String v) {
        if (featOkTst && casFeat_gender == null)
      jcas.throwFeatMissing("gender", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_gender, v);}
    
  
 
  /** @generated */    
  public void setGroupRec(int addr, int v) {
        if (featOkTst && casFeat_groupRec == null)
      jcas.throwFeatMissing("groupRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_groupRec, v);}
    
  
 
  /** @generated */    
  public void setHeaderRec(int addr, int v) {
        if (featOkTst && casFeat_headerRec == null)
      jcas.throwFeatMissing("headerRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_headerRec, v);}
    
  
 
  /** @generated */    
  public void setHusbFath(int addr, int v) {
        if (featOkTst && casFeat_husbFath == null)
      jcas.throwFeatMissing("husbFath", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_husbFath, v);}
    
  
 
  /** @generated */    
  public void setIndividualRec(int addr, int v) {
        if (featOkTst && casFeat_individualRec == null)
      jcas.throwFeatMissing("individualRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_individualRec, v);}
    
  
 
  /** @generated */    
  public void setIndivName(int addr, int v) {
        if (featOkTst && casFeat_indivName == null)
      jcas.throwFeatMissing("indivName", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_indivName, v);}
    
  
 
  /** @generated */    
  public void setIndivNameVariation(int addr, int v) {
        if (featOkTst && casFeat_indivNameVariation == null)
      jcas.throwFeatMissing("indivNameVariation", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_indivNameVariation, v);}
    
  
 
  /** @generated */    
  public void setInformation(int addr, String v) {
        if (featOkTst && casFeat_information == null)
      jcas.throwFeatMissing("information", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_information, v);}
    
  
 
  /** @generated */    
  public void setLDSOrdRec(int addr, int v) {
        if (featOkTst && casFeat_lDSOrdRec == null)
      jcas.throwFeatMissing("lDSOrdRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_lDSOrdRec, v);}
    
  
 
  /** @generated */    
  public void setLink(int addr, int v) {
        if (featOkTst && casFeat_link == null)
      jcas.throwFeatMissing("link", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_link, v);}
    
  
 
  /** @generated */    
  public void setLiving(int addr, String v) {
        if (featOkTst && casFeat_living == null)
      jcas.throwFeatMissing("living", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_living, v);}
    
  
 
  /** @generated */    
  public void setMailAddress(int addr, int v) {
        if (featOkTst && casFeat_mailAddress == null)
      jcas.throwFeatMissing("mailAddress", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_mailAddress, v);}
    
  
 
  /** @generated */    
  public void setMember(int addr, int v) {
        if (featOkTst && casFeat_member == null)
      jcas.throwFeatMissing("member", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_member, v);}
    
  
 
  /** @generated */    
  public void setMixed(int addr, int v) {
        if (featOkTst && casFeat_mixed == null)
      jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_mixed, v);}
    
  /** @generated */ 
  public void setMixed(int addr, int i, String v) {
        if (featOkTst && casFeat_mixed == null)
      jcas.throwFeatMissing("mixed", "net.myerichsen.gedcom.DocumentRoot");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_mixed), i, v);
  }
 
 
  /** @generated */    
  public void setName(int addr, int v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */    
  public void setNamePart(int addr, int v) {
        if (featOkTst && casFeat_namePart == null)
      jcas.throwFeatMissing("namePart", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_namePart, v);}
    
  
 
  /** @generated */    
  public void setNote(int addr, int v) {
        if (featOkTst && casFeat_note == null)
      jcas.throwFeatMissing("note", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_note, v);}
    
  
 
  /** @generated */    
  public void setOrdStat(int addr, int v) {
        if (featOkTst && casFeat_ordStat == null)
      jcas.throwFeatMissing("ordStat", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_ordStat, v);}
    
  
 
  /** @generated */    
  public void setParentGroup(int addr, int v) {
        if (featOkTst && casFeat_parentGroup == null)
      jcas.throwFeatMissing("parentGroup", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_parentGroup, v);}
    
  
 
  /** @generated */    
  public void setParticipant(int addr, int v) {
        if (featOkTst && casFeat_participant == null)
      jcas.throwFeatMissing("participant", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_participant, v);}
    
  
 
  /** @generated */    
  public void setPersInfo(int addr, int v) {
        if (featOkTst && casFeat_persInfo == null)
      jcas.throwFeatMissing("persInfo", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_persInfo, v);}
    
  
 
  /** @generated */    
  public void setPhone(int addr, int v) {
        if (featOkTst && casFeat_phone == null)
      jcas.throwFeatMissing("phone", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_phone, v);}
    
  
 
  /** @generated */    
  public void setPlace(int addr, int v) {
        if (featOkTst && casFeat_place == null)
      jcas.throwFeatMissing("place", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_place, v);}
    
  
 
  /** @generated */    
  public void setPlaceName(int addr, int v) {
        if (featOkTst && casFeat_placeName == null)
      jcas.throwFeatMissing("placeName", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_placeName, v);}
    
  
 
  /** @generated */    
  public void setPlaceNameVar(int addr, int v) {
        if (featOkTst && casFeat_placeNameVar == null)
      jcas.throwFeatMissing("placeNameVar", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_placeNameVar, v);}
    
  
 
  /** @generated */    
  public void setPlacePart(int addr, int v) {
        if (featOkTst && casFeat_placePart == null)
      jcas.throwFeatMissing("placePart", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_placePart, v);}
    
  
 
  /** @generated */    
  public void setProduct(int addr, int v) {
        if (featOkTst && casFeat_product == null)
      jcas.throwFeatMissing("product", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_product, v);}
    
  
 
  /** @generated */    
  public void setProductID(int addr, String v) {
        if (featOkTst && casFeat_productID == null)
      jcas.throwFeatMissing("productID", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_productID, v);}
    
  
 
  /** @generated */    
  public void setPublic(int addr, String v) {
        if (featOkTst && casFeat_public == null)
      jcas.throwFeatMissing("public", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_public, v);}
    
  
 
  /** @generated */    
  public void setPublishing(int addr, int v) {
        if (featOkTst && casFeat_publishing == null)
      jcas.throwFeatMissing("publishing", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_publishing, v);}
    
  
 
  /** @generated */    
  public void setReligion(int addr, int v) {
        if (featOkTst && casFeat_religion == null)
      jcas.throwFeatMissing("religion", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_religion, v);}
    
  
 
  /** @generated */    
  public void setRelToFath(int addr, String v) {
        if (featOkTst && casFeat_relToFath == null)
      jcas.throwFeatMissing("relToFath", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_relToFath, v);}
    
  
 
  /** @generated */    
  public void setRelToMoth(int addr, String v) {
        if (featOkTst && casFeat_relToMoth == null)
      jcas.throwFeatMissing("relToMoth", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_relToMoth, v);}
    
  
 
  /** @generated */    
  public void setRepository(int addr, int v) {
        if (featOkTst && casFeat_repository == null)
      jcas.throwFeatMissing("repository", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_repository, v);}
    
  
 
  /** @generated */    
  public void setRepositoryRec(int addr, int v) {
        if (featOkTst && casFeat_repositoryRec == null)
      jcas.throwFeatMissing("repositoryRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_repositoryRec, v);}
    
  
 
  /** @generated */    
  public void setRole(int addr, String v) {
        if (featOkTst && casFeat_role == null)
      jcas.throwFeatMissing("role", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_role, v);}
    
  
 
  /** @generated */    
  public void setSameIndiv(int addr, int v) {
        if (featOkTst && casFeat_sameIndiv == null)
      jcas.throwFeatMissing("sameIndiv", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_sameIndiv, v);}
    
  
 
  /** @generated */    
  public void setSourceRec(int addr, int v) {
        if (featOkTst && casFeat_sourceRec == null)
      jcas.throwFeatMissing("sourceRec", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_sourceRec, v);}
    
  
 
  /** @generated */    
  public void setSubmitter(int addr, int v) {
        if (featOkTst && casFeat_submitter == null)
      jcas.throwFeatMissing("submitter", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_submitter, v);}
    
  
 
  /** @generated */    
  public void setSupplier(int addr, int v) {
        if (featOkTst && casFeat_supplier == null)
      jcas.throwFeatMissing("supplier", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_supplier, v);}
    
  
 
  /** @generated */    
  public void setTempleCode(int addr, String v) {
        if (featOkTst && casFeat_templeCode == null)
      jcas.throwFeatMissing("templeCode", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_templeCode, v);}
    
  
 
  /** @generated */    
  public void setTitle(int addr, String v) {
        if (featOkTst && casFeat_title == null)
      jcas.throwFeatMissing("title", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_title, v);}
    
  
 
  /** @generated */    
  public void setURI(int addr, String v) {
        if (featOkTst && casFeat_uRI == null)
      jcas.throwFeatMissing("uRI", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_uRI, v);}
    
  
 
  /** @generated */    
  public void setVersion(int addr, String v) {
        if (featOkTst && casFeat_version == null)
      jcas.throwFeatMissing("version", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_version, v);}
    
  
 
  /** @generated */    
  public void setWhenRecorded(int addr, String v) {
        if (featOkTst && casFeat_whenRecorded == null)
      jcas.throwFeatMissing("whenRecorded", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_whenRecorded, v);}
    
  
 
  /** @generated */    
  public void setWhereInSource(int addr, String v) {
        if (featOkTst && casFeat_whereInSource == null)
      jcas.throwFeatMissing("whereInSource", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setStringValue(addr, casFeatCode_whereInSource, v);}
    
  
 
  /** @generated */    
  public void setWifeMoth(int addr, int v) {
        if (featOkTst && casFeat_wifeMoth == null)
      jcas.throwFeatMissing("wifeMoth", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_wifeMoth, v);}
    
  



  /** @generated */    
  public void setXMLNSPrefixMap(int addr, int v) {
        if (featOkTst && casFeat_xMLNSPrefixMap == null)
      jcas.throwFeatMissing("xMLNSPrefixMap", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_xMLNSPrefixMap, v);}
    
  /** @generated */ 
  public void setXMLNSPrefixMap(int addr, int i, int v) {
        if (featOkTst && casFeat_xMLNSPrefixMap == null)
      jcas.throwFeatMissing("xMLNSPrefixMap", "net.myerichsen.gedcom.DocumentRoot");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xMLNSPrefixMap), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_xMLNSPrefixMap), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xMLNSPrefixMap), i, v);
  }
 
 
  /** @generated */    
  public void setXSISchemaLocation(int addr, int v) {
        if (featOkTst && casFeat_xSISchemaLocation == null)
      jcas.throwFeatMissing("xSISchemaLocation", "net.myerichsen.gedcom.DocumentRoot");
    ll_cas.ll_setRefValue(addr, casFeatCode_xSISchemaLocation, v);}
    
  /** @generated */ 
  public void setXSISchemaLocation(int addr, int i, int v) {
        if (featOkTst && casFeat_xSISchemaLocation == null)
      jcas.throwFeatMissing("xSISchemaLocation", "net.myerichsen.gedcom.DocumentRoot");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xSISchemaLocation), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_xSISchemaLocation), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_xSISchemaLocation), i, v);
  }
 
 
}



    