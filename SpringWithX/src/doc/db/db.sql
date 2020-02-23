DROP DATABASE IF EXISTS springWithX;
CREATE DATABASE springWithX;
USE springWithX;
DROP TABLE IF EXISTS tb_user;
CREATE TABLE tb_user (
  id INT(10) AUTO_INCREMENT,
  user_code varchar(32) DEFAULT NULL,
  user_name varchar(32) DEFAULT NULL,
  password varchar(32) DEFAULT NULL,
  sex int(2) DEFAULT NULL,
  birthday date DEFAULT NULL,
  created datetime DEFAULT NULL,
  updated datetime DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tb_user ( user_code, user_name, password, sex, birthday, created, updated) VALUES ( 'zpc',  '鹏程','123456', '1', '1990-09-02', sysdate(), sysdate());
INSERT INTO tb_user ( user_code, user_name, password, sex, birthday, created, updated) VALUES ( 'hj', '静静','123456', '1', '1993-09-05', sysdate(), sysdate());