@echo off
rem
rem * copyright-start
:: Right now we're in the eclipse working directory
@echo %cd%
@cd /D %~dp0
:: We changed the directory to the script location
@echo %cd%
:: We now can use workspace relative paths!
rem ***************************************************************************
rem *
rem *  LICENSED MATERIALS - PROPERTY OF IBM
rem *  5724-V27, 5655-R10, 5655-M22, 5655-L21, 5655-I49, 5655-D92
rem *  Copyright IBM Corp. 1993, 2008
rem *
rem *  THE SOURCE CODE FOR THIS PROGRAM IS NOT PUBLISHED OR OTHERWISE
rem *  DIVESTED OF ITS TRADE SECRETS, IRRESPECTIVE OF WHAT HAS BEEN
rem *  DEPOSITED WITH THE U.S. COPYRIGHT OFFICE.
rem *
rem ***************************************************************************
rem * copyright-end
rem *-----------------------------------------------------------------
rem *  Batch file for Rational Asset Analyzer DMH4000
rem *-----------------------------------------------------------------
echo.
echo Deleting prior output files...
del .\~attrbout.txt
del .\~rdprint.txt
rem *-----------------------------------------------------------------
rem *  DD:ATTRBOUT - ouput file for generated import records
rem *  DD:DMHPCTL  - input control cards to capture program DD records
rem *  DD:FILELIST - input for multiple file scans
rem *  DD:JCLLIB   - input specifying JCLLIB containers
rem *  DD:RDPRINT  - ouput file for analyzer report
rem *  DD:XLATLIBS - input for tranlating container names
rem *-----------------------------------------------------------------
echo Establishing environment variables...
set DD:ATTRBOUT=.\~attrbout.txt
set DD:DMHPCTL=
set DD:FILELIST=
set DD:JCLLIB=
set DD:RDPRINT=.\~rdprint.txt
set DD:XLATLIBS=
rem *-----------------------------------------------------------------
rem *  Usage: dmh4000 [-options] containerName fileName
rem *
rem *  where options include:
rem *      -c          print copyright message
rem *      -d          run in debug mode
rem *      -f          run in fileManager mode
rem *      -h[elp]     print this help message and exit
rem *      -i          ignore JCLLIB ORDER= statements
rem *      -jes[2|3]   use JES2 or JES3 processing rules
rem *      -t          run in debugTool mode
rem *      -v[ersion]  print product version and exit
rem *      -x[ml]      generate import file in XML format
rem *      -?          print this help message and exit
rem *-----------------------------------------------------------------
echo Executing JCL analyzer...
dmh4000.exe . file.jcl -t
endlocal
