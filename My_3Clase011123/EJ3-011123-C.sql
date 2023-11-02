 C- Que mozos sirvieron los nuevos platos
SELECT DISTINCT camarero.Nombre, camarero.Apellido, detalledefactura.Plato
FROM detalledefactura
JOIN factura ON detalledefactura.iddelaFactura = factura.idFactura
JOIN camarero ON factura.idCamarero = camarero.idCamarero
WHERE Plato IN ('Sorrentinos a la Crema de Hongos', 'Ravioles a la Scarparo', 'Ñoquis a los Cuatro Quesos');