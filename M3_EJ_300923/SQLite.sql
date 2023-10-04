COFITERIA - PANADERIA

CREATE TABLE if not EXISTS `CLIENTES`(`ID`int (4), `DNI`int (8),`Nombre` varchar (20),`Apellido`varchar(20),`Direccion`varchar (30),`Fecha de Nacimiento` int (10),PRIMARY KEY (`ID`);

insert into `Clientes`(`ID`,`Dni`,`Nombre`,`Apellido`,`Direccion`,`Fecha de Nacimiento`) VALUES
('0001','24777229', 'Marina','Bartolomeo','Almafuerte 83','21/08/1975'),
('0002','12315614','Susana','Garcia','Pagola 110','02/04/1980'),
('0003','11216987','Claudia','Basquez','Uspallata 23','30/12/1990'),
('0004','24666279','Gustavo','Gonzales','Arbeletche 600','01/11/1979'),
('0005','20544899','Cristian','Bortolo','Av. Saenz 55','14/01/1976'),
('0006','18322444','Jose','Garcia','Av. La Plata 1500','16/06/1985'),
('0007','10215978','Ignacio','Bermudez','Av. Caseros','22/03/2000'),
('0008','16789247','Lorena','Pardo','Av. Caseros 700','05/12/1999'),
('0009','24987563','Marcela','Crimi','Av. Almafuerte 300','11/11/1989'),
('0010','12988863','Mariano','Acosta','Av. Chiclana 700','27/12/1994'),                                      
 
                                      
CREATE TABLE if not EXISTS `PROVEEDORES`(`ID`int (3), `CUIT`int (13),`Nombre` varchar (20),`Direccion`varchar (30),`Telefono` int (13),PRIMARY KEY (`ID`);

insert into `Proveedores`(`ID`,`Cuit`,`Nombre`,`Direccion`,`Telefono`) VALUES
('001','20-21816444-4', 'MarJuanC Alimentos','Grito de Asencio 3632 - CABA','11-3758-0195'),
('002','23-16899224-3','Mayorista Net','Av. Bernardo Ader 2754, B1605 Munro, Pcia de Buenos Aires','11-3354-1442'),
('003','20-26288112-4','Sapore','AV. Chivilcoy 4795, Villa Devoto, CABA','11-4502-1578'),
('004','21-18699354-2','Distribuidora Patricios','Pomar Gregorio Tte 3906, CABA',' 011 4911-2323'),
('005','20-22646551-4','Lacteos Paz','Bermudez 1299, Caba','11-3378-2383'),

                                         
CREATE TABLE if not EXISTS `PRODUCTOS`(`ID`int (5), `Nombre` varchar (20),`Precio` int (10),`Proveedor` varchar (20),PRIMARY KEY (`ID`);

insert into `Productos`(`ID`,`Nombre`,`Precio`,`Proveedor`) VALUES
('00001','Manteca Vacalin x 5kg.Pilon','$13.250','Mayorista Net'),
('00002','Queso Crema Casancrem Sachet x 4kg.','$5.007','Mayorista Net'),
('00003','Crema de Leche (44%) Milkaut Balde x 5L.','$58.988','Mayorista Net'),
('00004','Dulce de Leche Repostero Vacalin Cuñeta x 10kg.','$10.303','Mayorista Net'),
('00005','Mix de Frutos Rojos Fresh Strawbwrrys Bolsa x 1kg.','$3.430','Mayorista Net'),
('00006','Esencia de Vainilla Lesansi Bidon x 2L.','$2.500','Mayorista Net'),
('00007','Esencia de Naranja Emeth Bidon x 2L.','$1.450','Mayorista Net'),                                       
('00008','Esencia de Pan Dulce Emeth Bidon x 2L.','$2.850','Mayorista Net'),                                       
('00009','Almendras Carmel x 5kg.','$5.007','MarJuanC'),                                       
('00010','Castañas de Cajú x 1kg..','$5.007','MarJuanC'),                                       
('00011','Nueces Mariposa Criolla x 1kg.','$5.007','MarJuanC'),                                       
('00012','Nueces Mariposa Especial Extra Light','$5.007','MarJuanC'),                                       
('00013','Pasas de Uva','$5.007','MarJuanC'), 
('00014','Dulce de Membrillo Cayfar x 5kg.','$5.007','MarJuanC'),                                        
('00015','Dulce de Batata Cayfar x 5kg.','$5.007','MarJuanC'),                                        
('00016','Avellana Pelada x 1kg.','$8.600','Sapore'),                                        
('00017','Azucar Impalpable Proin x 1kg.','$1.200','Sapore'),                                        
('00018','Azucar Negra Proin x 1kg.','$1.550','Sapore'),                                     
('00019','Azucar Rubia Proin x 1kg.','$1.150','Sapore'),                                    
('00020','Baño de Chocolate Chocolart Moldeo Leche x 1kg.','$3.050','Sapore')                                   
('00021','Dulce de Batata Cayfar x 5kg.','$4.020','Lacteos Paz'),                                    
('00022','Dulce de Membrillo Cayfar x 5kg.','$5.855','Lacteos Paz'), 
('00023','Barra de queso Tybo x 5kg.','$2.335','Lacteos Paz'),                                        
('00024','Barra de queso Danbo x 5kg.','$2.295','Lacteos Paz'),                                        
('00025','Jamon Cocido de Pata de Cerdo x 5kg.','$2.590','Lacteos Paz'),                                        
('00026','Harina de Trigo 0000 Cañuelas Bolsa x 25kg.','$7.873,35','Harinera Patricios'),
('00027','Harina de Trigo 0000 Chacabuco Bolsa x 25kg.','$8.612,57','Harinera Patricios'),                                        
('00028','Harina de Trigo 000 Cañuelas Bolsa x 25kg.','$3.708,39','Harinera Patricios'),                                        
('00029','Harina de Trigo 000 Chacabuco Bolsa x 25kg.','$6.906,31','Harinera Patricios'),                                       
('00030','Polvo de Hornear Lesani Bolsa x 2kg.','$3.163,82','Harinera Patricios'),    
                                       
                                       
                                       
                                      