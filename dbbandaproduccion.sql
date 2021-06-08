-- phpMyAdmin SQL Dump
-- version 4.7.1
-- https://www.phpmyadmin.net/
--
-- Servidor: sql3.freemysqlhosting.net
-- Tiempo de generación: 02-06-2021 a las 04:57:39
-- Versión del servidor: 5.5.54-0ubuntu0.12.04.1
-- Versión de PHP: 7.0.33-0ubuntu0.16.04.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sql3415613`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producciones`
--

CREATE TABLE `producciones` (
  `usuario_id` varchar(30) NOT NULL,
  `entrada` int(11) NOT NULL DEFAULT '0',
  `salida` int(11) NOT NULL DEFAULT '0',
  `defectuoso` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producciones`
--

INSERT INTO `producciones` (`usuario_id`, `entrada`, `salida`, `defectuoso`) VALUES
('jorge', 4, 2, 2);

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
  `tipo` int(11) NOT NULL,
  `Estatus` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `aPaterno`, `aMaterno`, `telefono`, `direccion`, `usuario`, `password`, `tipo`, `Estatus`) VALUES
(4, 'Carlos Daniel', 'Camcho', 'Chavez', '3330672020', 'Zapopan', 'danCa', '123', 1, 0),
(2, 'Jorge', 'Urbina', 'Tapia', '3313507243', 'Guadalajara', 'jorge', '123', 0, 0),
(1, 'Luis Pablo', 'Nieto', 'Gil', '3313507243', 'na', 'lpng', '123', 1, 0),
(5, 'asd', 'asd', 'asd', 'asd', 'asd', 'root', 'root', 1, 0),
(3, 'Sebastian', 'Alegria', 'Uribe', '3931173449', 'La Barca', 'sebA', '123', 1, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `producciones`
--
ALTER TABLE `producciones`
  ADD PRIMARY KEY (`usuario_id`),
  ADD KEY `usuario_id` (`usuario_id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `producciones`
--
ALTER TABLE `producciones`
  ADD CONSTRAINT `producciones_ibfk_1` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
