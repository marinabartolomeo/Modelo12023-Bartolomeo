SELECT distinct p.nombre AS provincia
FROM provincias p
INNER JOIN clientes c ON p.codigo = c.CodigoProvincia;