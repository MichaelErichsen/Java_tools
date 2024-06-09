/**
 * This package contains a single Java application to generate parts of a 
 * 3270 logon screen based on a company logo.
 * 
 * <h1>Example</h1>
 * <h2>Image file</h2>
 * <img src="{@docRoot}/doc-files/xact.png" alt="Xact logo" style="width: 75%; height: 75%">
 * <h2>Generated assembler source</h2>
 * <pre>
         DC X'11',AL2(((6-1)*80)+(01-1)) R=6,C=01
         DC C'                                        '
         DC C'                   '
         DC X'11',AL2(((7-1)*80)+(01-1)) R=7,C=01
         DC C'        /XXXXX/                         '
         DC C'                   '
         DC X'11',AL2(((8-1)*80)+(01-1)) R=8,C=01
         DC C'       X/    /XXX        /              '
         DC C'           X/      '
         DC X'11',AL2(((9-1)*80)+(01-1)) R=9,C=01
         DC C'     //        XXX /XX/X  /  //   /  /XX'
         DC C'    /XX/  /XX/     '
         DC X'11',AL2(((10-1)*80)+(01-1)) R=10,C=01
         DC C'     X          XXXX       /  X/ XX  X/ '
         DC C'X  /X/ /X  X/      '
         DC X'11',AL2(((11-1)*80)+(01-1)) R=11,C=01
         DC C'                XXX/       /  /X X      '
         DC C'X/ X/      X/      '
         DC X'11',AL2(((12-1)*80)+(01-1)) R=12,C=01
         DC C'    /           XXX/       /   XX/   /XX'
         DC C'X/ X       X/      '
         DC X'11',AL2(((13-1)*80)+(01-1)) R=13,C=01
         DC C'    /           XXXX      //  /X/X  /X  '
         DC C'X/ X       X/      '
         DC X'11',AL2(((14-1)*80)+(01-1)) R=14,C=01
         DC C'        X      XXX/XX/   X/   X/ X/ /X  '
         DC C'X/ XX   /  X/      '
         DC X'11',AL2(((15-1)*80)+(01-1)) R=15,C=01
         DC C'     /  /X// /XXX  /XXXXX/   /X  /X  XXX'
         DC C'X   XXXX/  /XX     '
         DC X'11',AL2(((16-1)*80)+(01-1)) R=16,C=01
         DC C'          XXXXX/                        '
         DC C'                   '
         DC X'11',AL2(((17-1)*80)+(01-1)) R=17,C=01
         DC C'                                        '
         DC C'                   '
 * </pre>
 * <h2>Resulting 3270 screen</h2>
 * <img src="{@docRoot}/doc-files/Xact3270.jpg" alt="3270 representation of Xact logo">
 * <br>
 * 
 * @author Michael Erichsen, Xact Consulting 2016
 * @version 20160829
 *
 */
package dk.xact.em.Ussmsg10Generator;