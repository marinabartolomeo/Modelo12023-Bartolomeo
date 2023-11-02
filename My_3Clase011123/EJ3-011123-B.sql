B-  Quienes compraron el nuevo plato
SELECT Cliente.Nombre, Cliente.Apellido, detalledefactura.Plato
FROM detalledefactura
JOIN factura ON detalledefactura.iddelaFactura = factura.idFactura
JOIN cliente ON factura.idCliente = Cliente.idCliente
WHERE Plato IN ('Sorrentinos a la Crema de Hongos', 'Ravioles a la Scarparo', 'Ñoquis a los Cuatro Quesos');