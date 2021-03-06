/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package net.myerichsen.krabsen;

import java.io.File;
import java.io.IOException;
import org.apache.uima.UIMAFramework;
import org.apache.uima.analysis_engine.AnalysisEngine;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.CAS;
import org.apache.uima.resource.ResourceSpecifier;
import org.apache.uima.util.FileUtils;
import org.apache.uima.util.XMLInputSource;

/**
 * @author Michael Erichsen
 * @version 14. 01. 2012
 * <p>
 * An application that reads probate extracts from files, sends them though an Analysis Engine, and
 * stores the result in a Derby database.
 * <p>
 * The application takes two arguments:
 * <ol type="1">
 * <li>The path to an XML descriptor for the Analysis Engine to be executed</li>
 * <li>An input directory containing files to be processed</li>
 * </ol>
 */
public class KrabsenApplication {
  /**
   * Main program.
   * 
   * @param args
   *          Command-line arguments - see class description
   */
  public static void main(String[] args) {
    try {
      File taeDescriptor = null;
      File inputDir = null;

      // Read and validate command line arguments
      boolean validArgs = false;
      if (args.length == 2) {
        taeDescriptor = new File(args[0]);
        inputDir = new File(args[1]);

        validArgs = taeDescriptor.exists() && !taeDescriptor.isDirectory()
                && inputDir.isDirectory();
      }
      else {
		taeDescriptor = new File("C:\\Users\\Michael\\uima\\workspace\\Gedcom\\desc\\Annotators\\Krabsen\\AggregateProbateAnnotator.xml");
//		taeDescriptor = new File("C:\\Documents and Settings\\michael.XACT_DOMAIN\\IBM\\rationalsdp\\workspace\\Gedcom\\desc\\Annotators\\AureliaAggregateProbateAnnotator.xml");
		inputDir = new File("C:\\Users\\Michael\\Documents\\UIMA\\www.krabsen.dk\\godsskifte");
//		inputDir = new File("C:\\Documents and Settings\\michael.XACT_DOMAIN\\Dokumenter\\UIMA\\Aurelia");
		validArgs = true;
      }
      
      if (!validArgs) {
        printUsageMessage();
      } else {
        // get Resource Specifier from XML file
        XMLInputSource in = new XMLInputSource(taeDescriptor);
        ResourceSpecifier specifier = UIMAFramework.getXMLParser().parseResourceSpecifier(in);

        // create Analysis Engine
        AnalysisEngine ae = UIMAFramework.produceAnalysisEngine(specifier);
        // create a CAS
        CAS cas = ae.newCAS();

        // get all files in the input directory
        File[] files = inputDir.listFiles();
        if (files == null) {
          System.out.println("No files to process");
        } else {
          // process documents
          for (int i = 0; i < files.length; i++) {
            if (!files[i].isDirectory()) {
              processFile(files[i], ae, cas);
            }
          }
        }
        ae.destroy();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Prints usage message.
   */
  private static void printUsageMessage() {
    System.err.println("Usage: java org.apache.uima.example.ExampleApplication "
            + "<Analysis Engine descriptor or PEAR file name> <input dir>");
  }

  /**
   * Processes a single XML file and prints annotations to System.out
   * 
   * @param aFile
   *          file to process
   * @param aAE
   *          Analysis Engine that will process the file
   * @param aCAS
   *          CAS that will be used to hold analysis results
   */
  private static void processFile(File aFile, AnalysisEngine aAE, CAS aCAS) throws IOException,
          AnalysisEngineProcessException {
    System.out.println("Processing file " + aFile.getName());

    String document = FileUtils.file2String(aFile);
    document = document.trim();

    // put document text in CAS
    aCAS.setDocumentText(document);

    // process
    aAE.process(aCAS);

    // reset the CAS to prepare it for processing the next document
    aCAS.reset();
  }
}