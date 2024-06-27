CREATE TABLE if not exists user_service
(
    userId     SERIAL PRIMARY KEY,
    username   VARCHAR(255) NOT NULL,
    passportId BIGINT       NOT NULL
);