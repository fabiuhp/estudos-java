CREATE TABLE usuario
(
    id    BIGINT       NOT NULL AUTO_INCREMENT,
    login VARCHAR(100) NOT NULL,
    senha VARCHAR(255) NOT NULL UNIQUE,
    PRIMARY KEY (id)
);