DROP TABLE IF EXISTS CovidStatus;  
CREATE TABLE CovidStatus (  
covidId INT AUTO_INCREMENT  PRIMARY KEY,  
Date VARCHAR(50) NOT NULL,
states VARCHAR(50) NOT NULL,
positive INT,
negative INT,
pending INT
);

DROP TABLE IF EXISTS CaseDaily;
CREATE TABLE CaseDaily (  
dailyConfirmed BIGINT,  
dailyDeceased BIGINT,
dailyRecovered BIGINT,
totalConfirmed BIGINT,
totalDeceased BIGINT,
totalRecovered BIGINT,
Date VARCHAR(50)
);

DROP TABLE IF EXISTS CasesStateWise;
CREATE TABLE CasesStateWise (  
active INT,  
confirmed INT,
deaths INT,
deltaconfirmed INT,
deltadeaths INT,
deltarecovered INT,
lastupdatedtime VARCHAR(50),
migratedother INT,
recovered INT,
state VARCHAR(50),
statecode VARCHAR(50),
statenotes VARCHAR(500)
);

DROP TABLE IF EXISTS TestingStats;
CREATE TABLE TestingStats(  
dailyrtpcrtests INT,  
individualstestedperconfirmedcase INT,
positivecasesfromsamplesreported INT,
samplereportedtoday INT,
source VARCHAR(50),
source1 VARCHAR(50),
source3 VARCHAR(500),
testedasof VARCHAR(50),
testpositivityrate VARCHAR(50),
testsconductedbyprivatelabs INT,
testsperconfirmedcase INT,
testspermillion VARCHAR(50),
totalindividualstested INT,
totalpositivecases INT,
totalrtpcrtests INT,
totalsamplestested INT,
updatetimestamp VARCHAR(50)
);
