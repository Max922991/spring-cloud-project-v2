CREATE TABLE if not exists house_service
(
    houseId     SERIAL PRIMARY KEY,
    city        VARCHAR(255) NOT NULL,
    street      VARCHAR(255) NOT NULL,
    houseNumber VARCHAR(50)  NOT NULL,
    userId      BIGINT
);