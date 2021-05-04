-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-05-2021 a las 03:54:06
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbbandaproduccion`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `aPaterno` varchar(30) NOT NULL,
  `aMaterno` varchar(30) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `password` varchar(16) NOT NULL,
  `tipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `aPaterno`, `aMaterno`, `telefono`, `direccion`, `usuario`, `password`, `tipo`) VALUES
(1, 'Luis Pablo', 'Nieto', 'Gil', '3313507243', 'Paseo del Dromedario 99, Colonia CD Bugambilias, CP 45238, Zapopan, Jalisco, Mexico', 'lpngAdmin', '123', 1),
(2, 'Jorge', 'Urbina', 'Tapia', '3313507243', 'Guadalajara', 'jorge', '123', 0),
(3, 'Sebastian', 'Alegria', 'Uribe', '3931173449', 'La Barca', 'sebA', '123', 1),
(4, 'Carlos Daniel', 'Camcho', 'Chavez', '3330672020', 'Zapopan', 'danCa', '123', 1),
(6, 'root', 'na', 'na', 'na', 'na', 'root', 'root', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
