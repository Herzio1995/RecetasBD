create database platosDB;

use platosDB;

create table platos(
		codigo int IDENTITY(1,1) primary key not null,
		nombre varchar(20),
		precio int,
		tiempo int
);

select * from platos;

insert into platos (nombre,precio,tiempo)values('Pollo frito',20,2)
		

insert into platos (nombre,precio,tiempo)values('Silpancho',1,1);
insert into platos (nombre,precio,tiempo)values('Milanesa',1,1);

UPDATE platos SET platos.nombre = 'Chicharon', platos.precio=2, platos.tiempo=2 WHERE platos.codigo=3;

DELETE FROM platos WHERE platos.codigo = 5;