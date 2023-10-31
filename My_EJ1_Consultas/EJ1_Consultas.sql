SELECT p.nombre AS Provincia
FROM provincias p
LEFT JOIN clientes c ON p.codigo = c.CodigoProvincia
WHERE c.CodigoProvincia IS NULL;