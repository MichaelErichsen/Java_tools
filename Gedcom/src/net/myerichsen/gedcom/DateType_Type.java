
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
 * Updated by JCasGen Wed Apr 10 09:47:33 CEST 2013
 * @generated */
public class DateType_Type extends Annotation_Type {
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (DateType_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = DateType_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new DateType(addr, DateType_Type.this);
  			   DateType_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new DateType(addr, DateType_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = DateType.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("net.myerichsen.gedcom.DateType");
  /** @generated */
  final Feature casFeat_calendar;
 
  /** @generated */
  final int     casFeatCode_calendar;
  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public DateType_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_calendar = jcas.getRequiredFeatureDE(casType, "calendar", "net.myerichsen.gedcom.CalendarType", featOkTst);
    casFeatCode_calendar  = (null == casFeat_calendar) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_calendar).getCode();

  }
  /** @generated */ 
  public String getCalendar(int addr) {
        if (featOkTst && casFeat_calendar == null)
      jcas.throwFeatMissing("calendar", "net.myerichsen.gedcom.DateType");
    return ll_cas.ll_getStringValue(addr, casFeatCode_calendar);
  }
  /** @generated */
  @Override
protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */    
  public void setCalendar(int addr, String v) {
        if (featOkTst && casFeat_calendar == null)
      jcas.throwFeatMissing("calendar", "net.myerichsen.gedcom.DateType");
    ll_cas.ll_setStringValue(addr, casFeatCode_calendar, v);}
    
  



}



    