A- Cuantos compraron el nuevo Plato:
SELECT COUNT(idDetalledeFactura) AS Compras_NuevoPlato
FROM detalledefactura
WHERE Plato IN ('Sorrentinos a la Crema de Hongos', 'Ravioles a la Scarparo', 'Ñoquis a los Cuatro Quesos');