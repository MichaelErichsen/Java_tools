

/* First created by JCasGen Mon Oct 10 13:28:08 CEST 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Apr 10 09:47:33 CEST 2013
 * XML source: C:/Workspaces/Uimaworkspace/Gedcom/desc/Annotators/Kermit/NameAnnotator.xml
 * @generated */
public class DateType extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(DateType.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** Never called.  Disable default constructor
   * @generated */
  protected DateType() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public DateType(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public DateType(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public DateType(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** getter for calendar - gets 
   * @generated */
  public String getCalendar() {
    if (DateType_Type.featOkTst && ((DateType_Type)jcasType).casFeat_calendar == null)
      jcasType.jcas.throwFeatMissing("calendar", "net.myerichsen.gedcom.DateType");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DateType_Type)jcasType).casFeatCode_calendar);}
    
  /** @generated  */
  @Override
public              int getTypeIndexID() {return typeIndexID;}
 
  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
    
  /** setter for calendar - sets  
   * @generated */
  public void setCalendar(String v) {
    if (DateType_Type.featOkTst && ((DateType_Type)jcasType).casFeat_calendar == null)
      jcasType.jcas.throwFeatMissing("calendar", "net.myerichsen.gedcom.DateType");
    jcasType.ll_cas.ll_setStringValue(addr, ((DateType_Type)jcasType).casFeatCode_calendar, v);}    
  }

    