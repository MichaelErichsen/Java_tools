

/* First created by JCasGen Tue Nov 22 21:29:57 CET 2011 */
package net.myerichsen.gedcom;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Dec 05 08:07:12 CET 2011
 * XML source: C:/Users/Michael/uima/workspace/Gedcom/desc/Annotators/Brejl/AggregateProbateAnnotator.xml
 * @generated */
public class ProbateSignature extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(ProbateSignature.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected ProbateSignature() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public ProbateSignature(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public ProbateSignature(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public ProbateSignature(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
}

    