CREATE TABLE if not exists Car
(
    carId  SERIAL PRIMARY KEY,
    mark   VARCHAR(255),
    name   VARCHAR(255),
    userId BIGINT
);