select F.Fecha, F.NumerodeFactura, C.Nombre AS Nombre_Camarero, 
C.Apellido AS Apellido_Camarero, c.Nombre AS Nombre_Cliente,
    c.Apellido AS Apellido_Cliente, DF.Plato, DF.Importe
FROM factura AS F
JOIN camarero AS C ON F.idCamarero = C.idCamarero
JOIN Cliente AS CL ON F.idCliente = CL.idCliente
JOIN detalledefactura AS df ON f.idFactura = df.iddelaFactura
WHERE C.Apellido ='Pisano';