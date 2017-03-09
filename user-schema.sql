DROP DATABASE IF EXISTS fantasy;
CREATE DATABASE fantasy;
USE fantasy;
CREATE TABLE user_0(
  id INT PRIMARY KEY ,
  name VARCHAR(10),
  age INT
);

CREATE TABLE user_1(
  id INT PRIMARY KEY ,
  name VARCHAR(10),
  age INT
);

INSERT INTO user_0 VALUES (10, "John", 24);
INSERT INTO user_1 VALUES (11, "Tom", 22);