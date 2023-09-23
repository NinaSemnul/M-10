CREATE TABLE CLIENT (
    ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(200) NOT NULL CHECK (LENGTH(NAME) >= 3 AND LENGTH(NAME) <= 200)
);

CREATE TABLE PLANET  (
    ID VARCHAR(100) PRIMARY KEY,
    NAME VARCHAR(500) NOT NULL CHECK (LENGTH(NAME) >= 1 AND LENGTH(NAME) <= 500),
    CHECK (ID REGEXP '^[A-Z0-9]+$')
);

CREATE TABLE Ticket  (
    ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    CREATED_AT VARCHAR(100) NOT NULL,
    CLIENT_ID BIGINT,
    FROM_PLANET_ID VARCHAR(200),
    TO_PLANET_ID VARCHAR(200),
    FOREIGN KEY (CLIENT_ID) REFERENCES CLIENT(ID),
    FOREIGN KEY (FROM_PLANET_ID) REFERENCES PLANET(ID),
    FOREIGN KEY (TO_PLANET_ID) REFERENCES PLANET(ID)
);