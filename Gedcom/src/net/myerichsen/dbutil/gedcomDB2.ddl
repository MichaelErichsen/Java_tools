-- CLP-filen er oprettet vha. DB2LOOK Version "9.7" 
-- Tidsstempel: 18-11-2011 09:00:14
-- Databasenavn: GEDCOM         
-- Databasesystemversion: DB2/NT Version 9.7.5          
-- Databasetegntabel: 1252
-- Databasens sorteringsrækkefølge er: UNIQUE


CONNECT TO GEDCOM;

------------------------------------------------
-- DDL-sætninger for tabel "GEDCOM  "."EVENT"
------------------------------------------------
 

CREATE TABLE "GEDCOM  "."EVENT"  (
		  "ID" CHAR(8) NOT NULL , 
		  "FROMDATE" DATE , 
		  "TODATE" DATE , 
		  "PLACE" CHAR(30) , 
		  "EVENTTYPE" CHAR(30) , 
		  "VITALTYPE" CHAR(30) , 
		  "COVERED_DATA" VARCHAR(3600) , 
		  "SOURCE" CHAR(100) NOT NULL , 
		  "CAPTION" CHAR(50) )   
		 IN "USERSPACE1" ; 


-- DDL-sætninger for primærnøgle i tabel "GEDCOM  "."EVENT"

ALTER TABLE "GEDCOM  "."EVENT" 
	ADD PRIMARY KEY
		("ID",
		 "SOURCE");



-- DDL-sætninger for indekser i tabel "GEDCOM  "."EVENT"

CREATE INDEX "GEDCOM  "."IX1" ON "GEDCOM  "."EVENT" 
		("FROMDATE" ASC)
		
		COMPRESS NO ALLOW REVERSE SCANS;

------------------------------------------------
-- DDL-sætninger for tabel "GEDCOM  "."INDIVIDUAL"
------------------------------------------------
 

CREATE TABLE "GEDCOM  "."INDIVIDUAL"  (
		  "ID" CHAR(8) NOT NULL , 
		  "NAME" CHAR(50) , 
		  "FONKOD" CHAR(50) , 
		  "EVENT_ID" CHAR(8) , 
		  "SOURCE" CHAR(100) NOT NULL )   
		 IN "USERSPACE1" ; 


-- DDL-sætninger for primærnøgle i tabel "GEDCOM  "."INDIVIDUAL"

ALTER TABLE "GEDCOM  "."INDIVIDUAL" 
	ADD PRIMARY KEY
		("ID",
		 "SOURCE");



-- DDL-sætninger for indekser i tabel "GEDCOM  "."INDIVIDUAL"

CREATE INDEX "GEDCOM  "."IX2" ON "GEDCOM  "."INDIVIDUAL" 
		("FONKOD" ASC)
		
		COMPRESS NO ALLOW REVERSE SCANS;

-- DDL-sætninger for indekser i tabel "GEDCOM  "."INDIVIDUAL"

CREATE INDEX "GEDCOM  "."IX3" ON "GEDCOM  "."INDIVIDUAL" 
		("NAME" ASC)
		
		COMPRESS NO ALLOW REVERSE SCANS;

-- DDL-sætninger for fremmednøgler i tabel "GEDCOM  "."INDIVIDUAL"

ALTER TABLE "GEDCOM  "."INDIVIDUAL" 
	ADD CONSTRAINT "SQL111117210758750" FOREIGN KEY
		("EVENT_ID",
		 "SOURCE")
	REFERENCES "GEDCOM  "."EVENT"
		("ID",
		 "SOURCE")
	ON DELETE NO ACTION
	ON UPDATE NO ACTION
	ENFORCED
	ENABLE QUERY OPTIMIZATION;







COMMIT WORK;

CONNECT RESET;

TERMINATE;

-- Det angivne SCHEMA er: GEDCOM
-- DB2LOOK tager kun de angivne tabeller i betragtning 
-- Opretter DDL for tabel(ler)

-- Skemanavn ignoreres i det fødererede afsnit
;