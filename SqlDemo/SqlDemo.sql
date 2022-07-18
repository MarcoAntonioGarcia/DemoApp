DROP database IF EXISTS SqlDemo;
CREATE database SqlDemo;

USE SqlDemo;
-- ------------------------------------
DROP table IF EXISTS clientes;
CREATE table clientes (
clienteId int not null auto_increment,
name varchar(255) not null,
lastName varchar(255) not null,
gender varchar(255) not null,
age int,
state varchar(255) not null,
city varchar(255) not null,
primary key(clienteId)
);


INSERT INTO clientes(clienteId, name, lastName, gender, age, state, city) VALUES(1, 'Oscar', "Huerta Sanchez", "M", 20, "Guanajuato", "Leon");
INSERT INTO clientes(clienteId, name, lastName, gender, age, state, city) VALUES(2, 'Octavio', "Sanchez Ortega", "M", 30, "Guanajuato", "Irapuato");
INSERT INTO clientes(clienteId, name, lastName, gender, age, state, city) VALUES(3, 'Julio', "Morales Camarena", "M", 23, "Jalisco", "Guadalajara");
INSERT INTO clientes(clienteId, name, lastName, gender, age, state, city) VALUES(4, 'Maria', "Dias Arellano", "F", 25, "Michoacan", "La piedad");
INSERT INTO clientes(clienteId, name, lastName, gender, age, state, city) VALUES(5, 'Lorena', "Lopez Ortiz", "F", 30, "Nuevo Leon", "Monterrey");
INSERT INTO clientes(clienteId, name, lastName, gender, age, state, city) VALUES(6, 'Fernando', "Huerta Mireles", "M", 28, "Jalisco", "Lagos de Moreno");
INSERT INTO clientes(clienteId, name, lastName, gender, age, state, city) VALUES(7, 'Casandra', "Contreraz Perez", "F", 22, "Guanajuato", "Leon");
 
 ##1º
 Select * from clientes where age > 25 and gender ="M";
 
 ##2º
UPDATE clientes SET lastName = 'Huerta Huerta', city = 'San Juan de los Lagos' WHERE (clienteId = '6');

##3º
 Select * from clientes where (age  between 20 and 29) and gender ="F";
 
##4º
select *from clientes where lastName like "%Huerta%"

##5º
SELECT state, count(*) FROM clientes GROUP BY state HAVING COUNT(*)>1 and state="Guanajuato";

##6º
INSERT INTO clientes(clienteId, name, lastName, gender, age, state, city) VALUES(8, 'Marco', "Garcia Sanchez", "M", 26, "Guanajuato", "Salamanca");

##7º
SELECT state, count(*) FROM clientes GROUP BY state HAVING COUNT(*)>0

##8º
Select * from clientes where gender ="M" ORDER BY lastName ASC


 
 