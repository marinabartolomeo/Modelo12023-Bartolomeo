SELECT
    f.Fecha AS Fecha_Factura,
    f.NumerodeFactura AS Numero_Factura,
    c.Nombre AS Nombre_Cliente,
    c.Apellido AS Apellido_Cliente,
    cm.Nombre AS Nombre_Camarero,
    df.Plato AS Plato
FROM factura AS f
INNER JOIN cliente AS c ON f.IdCliente = c.idCliente
INNER JOIN camarero AS cm ON f.IdCamarero = cm.idCamarero
INNER JOIN detalledefactura AS df ON f.idFactura = df.iddelaFactura
WHERE f.NumerodeFactura = '1051';