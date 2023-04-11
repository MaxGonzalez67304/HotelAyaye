-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2021 a las 23:44:20
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huespedes`
--

CREATE TABLE `huespedes` (
  `nombre` varchar(45) NOT NULL,
  `ciudad` varchar(30) NOT NULL,
  `fechaE` date NOT NULL,
  `fechaS` date NOT NULL,
  `tipoH` varchar(10) NOT NULL,
  `numPersonas` int(10) NOT NULL,
  `cuentaNumPersonas` int(50) NOT NULL,
  `numPiso` int(4) NOT NULL,
  `numHab` int(40) NOT NULL,
  `cuentaServicios` int(50) NOT NULL,
  `diasHospedaje` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `huespedes`
--

INSERT INTO `huespedes` (`nombre`, `ciudad`, `fechaE`, `fechaS`, `tipoH`, `numPersonas`, `cuentaNumPersonas`, `numPiso`, `numHab`, `cuentaServicios`, `diasHospedaje`) VALUES
('Angela Aguilar', 'Los Angeles', '2021-06-16', '2021-06-22', 'Kauil', 5, 5400, 2, 26, 0, 6),
('Ernesto Castañeda', 'CDMX', '2021-06-03', '2021-06-10', 'Hunn', 1, 2800, 2, 27, 0, 7),
('Fernanda Hernandez', 'Aguascalientes', '2021-06-01', '2021-06-07', 'Itza', 3, 3700, 1, 2, 0, 6),
('Georgina Salazar', 'Aguascalientes', '2021-08-10', '2021-08-17', 'Hunn', 1, 2800, 2, 28, 0, 7),
('Jaime Trujillo', 'CDMX', '2019-06-13', '2019-06-16', 'Kauil', 3, 4600, 2, 19, 0, 3),
('Jesus Martinez', 'Zacatecas', '2021-06-01', '2021-06-06', 'Itza', 4, 4100, 2, 19, 0, 5),
('Luis Miguel', 'Los Angeles', '2020-10-09', '2020-10-13', 'Kauil', 3, 4600, 2, 16, 0, 4),
('Maggie Ramirez', 'Aguascalientes', '2021-06-16', '2021-06-22', 'Itza', 2, 3300, 2, 29, 0, 6),
('Michael Jackson', 'Los Angeles', '2021-06-01', '2021-06-08', 'Kauil', 5, 5400, 1, 7, 0, 7),
('Paulina Hernandez', 'Durango', '2021-06-03', '2021-06-09', 'Hunn', 1, 2800, 1, 12, 0, 6),
('Ricardo Salvador', 'CDMX', '2021-10-21', '2021-10-26', 'Hunn', 1, 2800, 2, 22, 0, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingresos`
--

CREATE TABLE `ingresos` (
  `ingresosHotel` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ingresos`
--

INSERT INTO `ingresos` (`ingresosHotel`) VALUES
(105400);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(20) NOT NULL,
  `pswd` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `pswd`) VALUES
('Angel', 'ab1dbd386662b62477b62087a389256a'),
('Ernesto', '08a694958b5d401665b926d7f781d60c'),
('Max_Gonzalez', '9450476b384b32d8ad8b758e76c98a69');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `huespedes`
--
ALTER TABLE `huespedes`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `ingresos`
--
ALTER TABLE `ingresos`
  ADD PRIMARY KEY (`ingresosHotel`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
