SELECT M.NumerodeMesa, C.Nombre AS NombreCamarero, C.Apellido AS ApellidoCamarero
FROM factura AS F
JOIN camarero AS C ON F.IdCamarero = C.idCamarero
JOIN mesa AS M ON F.IdMesa = M.idMesa;