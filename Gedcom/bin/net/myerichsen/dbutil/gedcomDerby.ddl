-- ============================

-- This file was created using Derby's dblook utility.
-- Timestamp: 2011-11-19 11:02:54.913
-- Source database is: C:\DerbyDB\gedcom
-- Connection URL is: jdbc:derby:C:\DerbyDB\gedcom
-- appendLogs: false

-- set DERBY_HOME="C:\Program Files\Apache\db-derby-10.8.2.2-bin"
-- java -jar %DERBY_HOME%\lib\derbyrun.jar dblook -d "jdbc:derby:C:\DerbyDB\gedcom"


-- ----------------------------------------------
-- DDL Statements for schemas
-- ----------------------------------------------

CREATE SCHEMA "GEDCOM";

-- ----------------------------------------------
-- DDL Statements for tables
-- ----------------------------------------------

CREATE TABLE "GEDCOM"."EVENT" ("ID" CHAR(8) NOT NULL, "FROMDATE" DATE, "TODATE" DATE, "PLACE" CHAR(30), "EVENTTYPE" CHAR(30), "VITALTYPE" CHAR(30), "COVERED_DATA" VARCHAR(3600), "SOURCE" CHAR(100) NOT NULL, "CAPTION" CHAR(50));

CREATE TABLE "GEDCOM"."INDIVIDUAL" ("ID" CHAR(8) NOT NULL, "NAME" CHAR(50), "FONKOD" CHAR(50), "EVENT_ID" CHAR(8), "SOURCE" CHAR(100) NOT NULL);

-- ----------------------------------------------
-- DDL Statements for indexes
-- ----------------------------------------------

CREATE INDEX "GEDCOM"."IX3" ON "GEDCOM"."INDIVIDUAL" ("NAME");

CREATE INDEX "GEDCOM"."IX2" ON "GEDCOM"."INDIVIDUAL" ("FONKOD");

CREATE INDEX "GEDCOM"."IX4" ON "GEDCOM"."EVENT" ("PLACE");

CREATE INDEX "GEDCOM"."IX1" ON "GEDCOM"."EVENT" ("FROMDATE");

-- ----------------------------------------------
-- DDL Statements for keys
-- ----------------------------------------------

-- primary/unique
ALTER TABLE "GEDCOM"."INDIVIDUAL" ADD CONSTRAINT "SQL111119110025660" PRIMARY KEY ("ID", "SOURCE");

ALTER TABLE "GEDCOM"."EVENT" ADD CONSTRAINT "SQL111119110025360" PRIMARY KEY ("ID", "SOURCE");

-- foreign
ALTER TABLE "GEDCOM"."INDIVIDUAL" ADD CONSTRAINT "SQL111119110025661" FOREIGN KEY ("EVENT_ID", "SOURCE") REFERENCES "GEDCOM"."EVENT" ("ID", "SOURCE") ON DELETE NO ACTION ON UPDATE NO ACTION;

