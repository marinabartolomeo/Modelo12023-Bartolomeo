B- Realizar un "right join" para obtener la misma salida anterior:
SELECT *
FROM socios
RIGHT JOIN Inscriptos ON Socios.idDNI = Inscriptos.idDNI;