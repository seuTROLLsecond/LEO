CREATE DATABASE locadora;

USE  locadora;

CREATE TABLE estados(
    codigo INT (5) AUTO_INCREMENT,
    estado VARCHAR (45),
    PRIMARY KEY (codigo)
);

CREATE TABLE cliente(
    codigo  INT(5) AUTO_INCREMENT,
    nome VARCHAR(45),
    endereco VARCHAR(45),
    cidade VARCHAR (45),
    estado VARCHAR (2),
    PRIMARY KEY (codigo),
    FOREIGN KEY (estados) REFERENCES estados (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);
