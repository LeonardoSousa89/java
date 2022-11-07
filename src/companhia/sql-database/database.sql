CREATE DATABASE company;

USE company;

drop database company;

CREATE TABLE IF NOT EXISTS client(
	idclient INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    age INT(100) NOT NULL,
    sex VARCHAR(10) NOT NULL,
    adress VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS corporation(
	idcorporation INT PRIMARY KEY AUTO_INCREMENT,
	status VARCHAR(15) NOT NULL,
    company_adress VARCHAR(50) NOT NULL,
    type VARCHAR(15) NOT NULL,
	id_client INT,
	FOREIGN KEY(id_client) REFERENCES client(idclient)
);

INSERT INTO client VALUES(NULL,'Leonardo dos Santos',32,'male','Salvador-BA','(71)98547-6895');
INSERT INTO client VALUES(NULL,'Erica Sousa',32,'female','Lauro de freitas-BA','(73)98567-7895');
INSERT INTO client VALUES(NULL,'Amauri Araújo dos Santos',33,'male','Salvador-BA','(71)99947-6890');
INSERT INTO client VALUES(NULL,'Leonel Arantes',27,'male','Morunbi-SP','(84)94567-6895');
INSERT INTO client VALUES(NULL,'Lorena dos Santos',22,'female','Salvador-BA','(71)90047-6895');
INSERT INTO client VALUES(NULL,'Rebeca de Almeida',31,'female','Salvador-BA','(71)98117-6895');
INSERT INTO client VALUES(NULL,'Rael yijad',11,'male','','');

INSERT INTO corporation VALUES(NULL,'paid','Avenida Gal Costa, Salvador-BA','medium',2);
INSERT INTO corporation VALUES(NULL,'pendding','Avenida Joana Angélica, Salvador-BA','small',1);
INSERT INTO corporation VALUES(NULL,'paid','Avenida Paulista, São Paulo-SP','big',3);
INSERT INTO corporation VALUES(NULL,'paid','Botafogo,Rio de Janeiro, Rio de Janeiro-RJ','big',4);
INSERT INTO corporation VALUES(NULL,'pendding','Caxias do Sul, Santa Catarina-SC','small',6);
INSERT INTO corporation VALUES(NULL,'pendding','Avenida Dorival Caymi, Salvador-BA','medium',5);


SELECT * FROM  client;
SELECT * FROM corporation;

SELECT c.name, c.sex, c.adress, r.status, r.type
FROM client c
INNER JOIN corporation r
ON  idclient = id_client;




CREATE VIEW search AS 
select name, age, sex from client;

SELECT * FROM search;



DELETE FROM client WHERE name='Rael yijad';

UPDATE client SET name='Reamond Drummond' WHERE name='Rael yijad';


DELIMITER $$
CREATE PROCEDURE selected()
BEGIN
	SELECT 	c.name, 
			c.age, 
			c.sex, 
            c.adress, 
            c.phone, 
            r.status, 
            r.company_adress,
            r.type
	FROM client c
    INNER JOIN corporation r
    ON idclient = id_client;
END $$
DELIMITER ;

CALL selected();
 




