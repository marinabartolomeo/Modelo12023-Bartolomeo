-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-12-2023 a las 14:53:24
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `banco_marina`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `admin`
--

CREATE TABLE `admin` (
  `IdDato` int(11) NOT NULL,
  `Cuit` int(9) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `CodAdmin` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `admin`
--

INSERT INTO `admin` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `CodAdmin`) VALUES
(1, 2147483647, 'Javier', 'Palomo', 9999),
(2, 2147483647, 'Rebeca', 'Chaves', 9998),
(3, 2147483647, 'Claudio', 'Oviedo', 9997);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `IdDato` int(11) NOT NULL,
  `Cuit` int(9) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Fecha Nac.` int(8) NOT NULL,
  `Genero` varchar(30) DEFAULT NULL,
  `Estado Civil` varchar(30) DEFAULT NULL,
  `Hijos` int(2) NOT NULL,
  `Domicilio` varchar(50) DEFAULT NULL,
  `Localidad` varchar(50) DEFAULT NULL,
  `Provincia` varchar(50) DEFAULT NULL,
  `Telefono` int(12) NOT NULL,
  `e-mail` varchar(30) DEFAULT NULL,
  `Cod. Vendedor` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `Fecha Nac.`, `Genero`, `Estado Civil`, `Hijos`, `Domicilio`, `Localidad`, `Provincia`, `Telefono`, `e-mail`, `Cod. Vendedor`) VALUES
(1, 2147483647, 'Juan', 'Gonzalez', 28121976, 'Masculino', 'Soltero', 0, 'Av. Cruz 1300', 'Parque Patricios', 'Ciudad Autonoma de Bs. As.', 1144552795, 'juangonzalez@gmail.com', 123),
(1, 2147483647, 'Juan', 'Gonzalez', 28121976, 'Masculino', 'Soltero', 0, 'Av. Cruz 1300', 'Parque Patricios', 'Ciudad Autonoma de Bs. As.', 1144552795, 'juangonzalez@gmail.com', 123),
(2, 2147483647, 'Clara', 'Kippes', 12051990, 'Femenino', 'Casada', 2, 'Av. Caseros 3668', 'Parque Patricios', 'Ciudad Autonoma de Bs. As.', 1164345521, 'clarakippes@yahoo.com.ar', 146),
(3, 2147483647, 'Sergio', 'Ramirez ', 23101970, 'Masculino', 'Casado', 4, 'Av. Almafuerte 1500', 'Parque Patricios', 'Ciudad Autonoma de Bs. As.', 1122221515, 'sergio2022@yahoo.com.ar', 202),
(4, 2147483647, 'Victor', 'Pinto', 16121969, 'Masculino', 'Casado', 3, 'Av. Caseros 1800', 'Parque Patricios', 'Ciudad Autonoma de Bs. As.', 1144558765, 'victorp@gmail.com', 103),
(5, 2147483647, 'Maria', 'Rodriguez', 3031989, 'Femenino', 'Soltera', 0, 'Colombres 1300', 'Boedo', 'Ciudad Autonoma de Bs. As.', 1122156699, 'Mariar@hotmail.com.ar', 242),
(6, 2147483647, 'Nuria', 'Nardelli', 22021965, 'Femenino', 'Casada', 3, 'Av. Saenz 1200', 'Nueva Pompeya', 'Ciudad Autonoma de Bs. As.', 113636988, 'nuria1965@gmail.com', 301),
(7, 2147483647, 'Enrique Jose', 'Mamani', 30061972, 'Masculino', 'Divorciado', 2, 'Uspallata 1600', 'Parque Patricios', 'Ciudad Autonoma de Bs. As.', 1125260001, 'enrique72@yahoo.com.ar', 123),
(8, 2147483647, 'Melisa', 'Manzano', 21071995, 'Femenino', 'Soltera', 0, 'Av. La Plata 300', 'Caballito', 'Ciudad Autonoma de Bs. As.', 1132335557, 'meli1995@gmail.com.ar', 123),
(9, 2147483647, 'Alan', 'Cabrera', 27121976, 'Masculino', 'Divorciado', 1, 'Av. Cruz 1233', 'Nueva Pompeya', 'Ciudad Autonoma de Bs. As.', 1166217748, 'alancabrera@yahoo.com.ar', 146),
(10, 2147483647, 'Wilfredo', 'Erico', 9081987, 'Masculino', 'Casado', 2, 'Pepiri 33', 'Parque Patricios', 'Ciudad Autonoma de Bs. As.', 1122998561, 'wilfredo87@hotmail.com.ar', 123);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE `prestamos` (
  `IdDato` int(11) NOT NULL,
  `Cuit` int(9) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Capital` int(20) NOT NULL,
  `TiempoMeses` int(4) NOT NULL,
  `Interes` int(4) NOT NULL,
  `Monto` int(20) NOT NULL,
  `CuotaMonto` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `prestamos`
--

INSERT INTO `prestamos` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `Capital`, `TiempoMeses`, `Interes`, `Monto`, `CuotaMonto`) VALUES
(1, 2147483647, 'Juan', 'Gonzalez', 500000, 24, 80, 900000, 37500),
(2, 2147483647, 'Clara', 'Kippes', 5000000, 72, 150, 12500000, 173612),
(3, 2147483647, 'Sergio', 'Ramirez ', 1500000, 120, 150, 3750000, 31250),
(4, 2147483647, 'Victor', 'Pinto', 900000, 24, 80, 1620000, 67500),
(5, 2147483647, 'Maria', 'Rodriguez', 100000000, 120, 150, 250000000, 2083333),
(6, 2147483647, 'Nuria', 'Nardelli', 200000, 24, 80, 360000, 15000),
(7, 2147483647, 'Enrique', 'Mamani', 1500000, 120, 150, 3750000, 31250);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguroauto`
--

CREATE TABLE `seguroauto` (
  `IdDato` int(11) NOT NULL,
  `Cuit` int(9) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Dominio` varchar(10) DEFAULT NULL,
  `Marca` varchar(30) DEFAULT NULL,
  `Modelo` varchar(30) DEFAULT NULL,
  `Franquicia` varchar(2) DEFAULT NULL,
  `TercerosCompleto` varchar(2) DEFAULT NULL,
  `RespCivil` varchar(2) DEFAULT NULL,
  `TodoRiesgoCF` int(6) NOT NULL,
  `TodoRiesgoSF` varchar(2) DEFAULT NULL,
  `Granizo` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `seguroauto`
--

INSERT INTO `seguroauto` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `Dominio`, `Marca`, `Modelo`, `Franquicia`, `TercerosCompleto`, `RespCivil`, `TodoRiesgoCF`, `TodoRiesgoSF`, `Granizo`) VALUES
(1, 2147483647, 'Clara', 'Kippes', 'KKY874', 'Chevrolet', 'Aveo', 'SI', 'NO', 'NO', 20000, 'NO', 'NO'),
(2, 2147483647, 'Sergio', 'Ramirez ', 'AE100AA', 'Audi', 'A3', 'SI', 'NO', 'NO', 80000, 'NO', 'SI'),
(3, 2147483647, 'Maria', 'Rodriguez', 'JAZ369', 'Renault', 'Megane', 'NO', 'NO', 'SI', 80000, 'NO', 'NO'),
(4, 2147483647, 'Enrique', 'Mamani', 'CD250DD', 'Citroen', 'C4', 'SI', 'NO', 'NO', 60000, 'NO', 'SI'),
(5, 2147483647, 'Alan', 'Cabrera', 'CC009AA', 'Volkswagen', 'Golf', 'NO', 'SI', 'NO', 0, 'NO', 'SI'),
(6, 2147483647, 'Wilfredo', 'Erico', 'YYA645', 'Chevrolet', 'Corsa', 'NO', 'NO', 'NO', 0, 'SI', 'SI'),
(7, 2147483647, 'Victor', 'Pinto', 'ZYX997', 'Ford', 'Focus', 'NO', 'SI', 'SI', 0, 'NO', 'SI');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `segurohogar`
--

CREATE TABLE `segurohogar` (
  `IdDato` int(11) NOT NULL,
  `Cuit` int(9) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Incendio` varchar(10) DEFAULT NULL,
  `Robo` varchar(10) DEFAULT NULL,
  `Inundacion` varchar(10) DEFAULT NULL,
  `Heladera` varchar(2) DEFAULT NULL,
  `Lavarropas` varchar(2) DEFAULT NULL,
  `Cocina` varchar(2) DEFAULT NULL,
  `Notebook` varchar(2) DEFAULT NULL,
  `CantidadNotebook` int(2) NOT NULL,
  `CosolaGames` varchar(2) DEFAULT NULL,
  `Televisor` varchar(2) DEFAULT NULL,
  `CantidadTelevisor` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `segurohogar`
--

INSERT INTO `segurohogar` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `Incendio`, `Robo`, `Inundacion`, `Heladera`, `Lavarropas`, `Cocina`, `Notebook`, `CantidadNotebook`, `CosolaGames`, `Televisor`, `CantidadTelevisor`) VALUES
(1, 2147483647, 'Clara', 'Kippes', 'SI', 'SI', 'SI', 'NO', 'NO', 'NO', 'NO', 0, 'NO', 'NO', 0),
(2, 2147483647, 'Sergio', 'Ramirez ', 'NO', 'SI', 'NO', 'NO', 'NO', 'NO', 'NO', 0, 'NO', 'NO', 0),
(3, 2147483647, 'Maria', 'Rodriguez', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 2, 'NO', 'SI', 2),
(4, 2147483647, 'Enrique', 'Mamani', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'NO', 0, 'SI', 'SI', 2),
(5, 2147483647, 'Alan', 'Cabrera', 'NO', 'SI', 'NO', 'No', 'No', 'No', 'SI', 2, 'SI', 'SI', 3),
(6, 2147483647, 'Wilfredo', 'Erico', 'SI', 'SI', 'SI', 'SI', 'SI', 'SI', 'No', 0, 'NO', 'SI', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `segurovida`
--

CREATE TABLE `segurovida` (
  `IdDato` int(11) NOT NULL,
  `Cuit` int(9) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Muerte` varchar(2) DEFAULT NULL,
  `MuerteAccidental` varchar(2) DEFAULT NULL,
  `DiasDeInternacion` int(9) NOT NULL,
  `ParalisisTotalParcial` varchar(10) DEFAULT NULL,
  `Beneficiario1` varchar(50) DEFAULT NULL,
  `Porcentaje1` int(20) NOT NULL,
  `Beneficiario2` varchar(50) DEFAULT NULL,
  `Porcentaje2` int(20) NOT NULL,
  `Beneficiario3` varchar(50) DEFAULT NULL,
  `Porcentaje3` int(20) NOT NULL,
  `Beneficiario4` varchar(50) DEFAULT NULL,
  `Porcentaje4` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `segurovida`
--

INSERT INTO `segurovida` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `Muerte`, `MuerteAccidental`, `DiasDeInternacion`, `ParalisisTotalParcial`, `Beneficiario1`, `Porcentaje1`, `Beneficiario2`, `Porcentaje2`, `Beneficiario3`, `Porcentaje3`, `Beneficiario4`, `Porcentaje4`) VALUES
(1, 2147483647, 'Juan', 'Gonzalez', 'SI', 'SI', 0, 'NO', 'Susana Gomes', 100, 'NO', 0, 'NO', 0, 'NO', 0),
(2, 2147483647, 'Clara', 'Kippes', 'SI', 'SI', 0, '120', 'Clara Ramirez', 50, 'Esteban Kippes', 50, 'NO', 0, 'NO', 0),
(3, 2147483647, 'Victor', 'Pinto', 'SI', 'NO', 0, '0', 'Gonzalo Pinto', 25, 'Maria Pinto', 25, 'Gustavo Pinto', 25, 'Lorena Pinto', 25),
(4, 2147483647, 'Nuria', 'Nardelli', 'SI', 'SI', 0, '120', 'Agustina Cordoba', 100, 'NO', 0, 'NO', 0, 'NO', 0),
(5, 2147483647, 'Melisa', 'Manzano', 'SI', 'SI', 0, '60', 'Jorge Basquez', 100, 'NO', 0, 'NO', 0, 'NO', 0),
(6, 2147483647, 'Alan', 'Cabrera', 'SI', 'SI', 0, '180', 'Soledad Costa', 50, 'Micaela Cabrera', 50, 'NO', 0, 'NO', 0),
(7, 2147483647, 'Wilfredo', 'Erico', 'SI', 'SI', 0, '60', 'Agustin Castro', 10, 'No', 0, 'NO', 0, 'NO', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicios`
--

CREATE TABLE `servicios` (
  `IdDato` int(11) NOT NULL,
  `Cuit` varchar(12) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `SeguroVida` varchar(2) NOT NULL,
  `SeguroHogar` varchar(2) NOT NULL,
  `SeguroAuto` varchar(2) NOT NULL,
  `Prestamos` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `servicios`
--

INSERT INTO `servicios` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `SeguroVida`, `SeguroHogar`, `SeguroAuto`, `Prestamos`) VALUES
(1, '20283332224', 'Juan', 'Gonzalez', 'SI', 'NO', 'NO', '900000'),
(2, '23361234482', 'Clara', 'Kippes', 'SI', 'SI', 'SI', '12500000'),
(3, '23309437179', 'Sergio', 'Ramirez ', 'NO', 'SI', 'SI', '3750000'),
(4, '20415542667', 'Victor', 'Pinto', 'SI', 'NO', 'SI', '1620000'),
(5, '27258799580', 'Maria', 'Rodriguez', 'NO', 'SI', 'SI', '250000000'),
(6, '27351730930', 'Nuria', 'Nardelli', 'SI', 'NO', 'NO', '360000'),
(7, '20237499280', 'Enrique', 'Mamani', 'NO', 'SI', 'SI', '3750000'),
(8, '27312328149', 'Melisa', 'Manzano', 'SI', 'NO', 'NO', 'NO'),
(9, '20378964289', 'Alan', 'Cabrera', 'Si', 'SI', 'SI', 'NO'),
(10, '20188496300', 'Wilfredo', 'Erico', 'Si', 'SI', 'SI', 'NO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IdDato` int(11) NOT NULL,
  `Cuit` varchar(10) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `Tipo Usuario` varchar(50) DEFAULT NULL,
  `Usuario` varchar(25) DEFAULT NULL,
  `Contraseña` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `Tipo Usuario`, `Usuario`, `Contraseña`) VALUES
(1, '2028333222', 'Juan', 'Gonzalez', 'Cliente', 'juangonzalez', 'Cli123'),
(2, '2336123448', 'Clara', 'Kippes', 'Cliente', 'clarakippes', 'Cli456'),
(3, '2330943717', 'Sergio', 'Ramirez', 'Cliente', 'sergioramirez', 'Cli789'),
(4, '2041554266', 'Victor', 'Pinto', 'Cliente', 'victorpinto', 'Cli111'),
(5, '2725879958', 'Maria', 'Rodriguez', 'Cliente', 'mariarodriguez', 'Cli222'),
(6, '2735173093', 'Nuria', 'Nardelli', 'Cliente', 'nurianardelli', 'Cli333'),
(7, '2023749928', 'Enrique', 'Mamani', 'Cliente', 'enriquemamani', 'Cli444'),
(8, '2731232814', 'Melisa', 'Manzano', 'Cliente', 'melisamanzano', 'Cli555'),
(9, '2037896428', 'Alan', 'Cabrera', 'Cliente', 'alancabrera', 'Cli666'),
(10, '2018849630', 'Wilfredo', 'Erico', 'Cliente', 'wilfredoerico', 'Cli777'),
(11, '2020662055', 'Gonzalo', 'Duda', 'Ventas', 'wilfredoerico', 'ven111'),
(12, '2734180274', 'Clara', 'Ramirez', 'Ventas', 'wilfredoerico', 'ven222'),
(13, '2036515589', 'Cesar', 'Fuentes', 'Ventas', 'wilfredoerico', 'ven333'),
(14, '2330174549', 'Maria', 'Cardenas', 'Ventas', 'wilfredoerico', 'ven444'),
(15, '2035924012', 'Agustin', 'Torres', 'Ventas', 'wilfredoerico', 'ven555'),
(16, '2038654213', 'Mariano', 'Pardo', 'Ventas', 'wilfredoerico', 'ven666'),
(17, '2224898544', 'Javier', 'Palomo', 'Admin', 'javierpalomo', 'adm9999'),
(18, '2738062060', 'Rebeca', 'Chaves', 'Admin', 'javierpalomo', 'adm9998'),
(19, '2024857121', 'Claudio', 'Oviedo', 'Admin', 'javierpalomo', 'adm9997');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `IdDato` int(11) NOT NULL,
  `Cuit` varchar(12) NOT NULL,
  `Nombre` varchar(50) DEFAULT NULL,
  `Apellido` varchar(50) DEFAULT NULL,
  `CodVendedor` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`IdDato`, `Cuit`, `Nombre`, `Apellido`, `CodVendedor`) VALUES
(1, '20206620553', 'Gonzalo', 'Duda', 123),
(2, '27341802747', 'Clara', 'Ramirez', 146),
(3, '20365155896', 'Cesar', 'Fuentes', 202),
(4, '23301745494', 'Maria', 'Cardenas', 103),
(5, '20359240121', 'Agustin', 'Torres', 242),
(6, '20386542132', 'Mariano', 'Pardo', 301);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
