CREATE TABLE IF NOT EXISTS Trabajadores (
   id int  AUTO_INCREMENT,
   nombre varchar(30),
   apellidos varchar(30),
   dni varchar(9),
   PRIMARY KEY (id)
);

INSERT INTO Trabajadores (nombre, apellidos, dni) VALUES ('Nombre A', 'Apellidos A', '12345678A');
INSERT INTO Trabajadores (nombre, apellidos, dni) VALUES ('Nombre B', 'Apellidos B', '12345678B');
INSERT INTO Trabajadores (nombre, apellidos, dni) VALUES ('Nombre C', 'Apellidos C', '12345678C');
