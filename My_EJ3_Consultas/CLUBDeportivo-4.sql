D- Realizar un "right join" desde la tabla "socios" a "inscriptos" buscando coincidencia de documento:
Note que la persona con documento "26333444" no se encuentra en "socios", la columna "nombre"
(correspondiente a la tabla "socios") contiene "null".

SELECT *
FROM Socios
RIGHT JOIN Inscriptos ON Socios.idDNI = Inscriptos.idDNI
WHERE Inscriptos.idDNI = '26333444';

