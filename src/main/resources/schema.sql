DROP TABLE IF EXISTS covidStatus;  
CREATE TABLE covidStatus (  
covidId INT AUTO_INCREMENT  PRIMARY KEY,  
Date VARCHAR(50) NOT NULL,
states VARCHAR(50) NOT NULL,
postive INT,
negative INT,
pending INT
); 