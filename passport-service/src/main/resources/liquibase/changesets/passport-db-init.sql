CREATE TABLE if not exists passport_service
(
    passportId SERIAL PRIMARY KEY,
    fullName   VARCHAR(255) NOT NULL,
    secondName VARCHAR(255) NOT NULL
);