A- Realizar un "left join" de la tabla "socios" a "inscriptos" buscando coincidencia de "documento":
SELECT *
FROM socios
LEFT JOIN Inscriptos ON Socios.idDNI = Inscriptos.idDNI;


