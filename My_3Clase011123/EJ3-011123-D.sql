 D- Que día se vendió mas el nuevo plato, 
SELECT detalledefactura.Plato, factura.Fecha, COUNT(detalledefactura.idDetalledeFactura) AS Cantidad_Vendida
FROM detalledefactura
JOIN factura ON detalledefactura.iddelaFactura = factura.idFactura
WHERE Plato IN ('Sorrentinos a la Crema de Hongos', 'Ravioles a la Scarparo', 'Ñoquis a los Cuatro Quesos')
GROUP BY Plato, factura.Fecha
ORDER BY Cantidad_Vendida DESC;