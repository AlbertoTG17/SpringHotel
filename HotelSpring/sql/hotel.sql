-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-02-2018 a las 20:51:32
-- Versión del servidor: 10.1.29-MariaDB
-- Versión de PHP: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
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
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `idreserva` int(11) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `fecha_entrada` date DEFAULT NULL,
  `fecha_salida` date DEFAULT NULL,
  `personas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`idreserva`, `email`, `fecha_entrada`, `fecha_salida`, `personas`) VALUES
(1, 'albertotg@gmail.com', '2018-02-06', '2018-02-09', 2),
(2, 'albertotg@gmail.com', '2018-02-06', '2018-02-09', 2),
(4, 'alberto@hotmaill.com', NULL, NULL, 6),
(5, 'alberto@hotmaill.com', '2015-06-02', '2015-06-09', 5),
(6, 'sdsafgf', NULL, NULL, 65),
(7, 'sdsafgf', NULL, NULL, 65),
(8, 'asffag', NULL, NULL, 4554),
(9, 'asffag', NULL, NULL, 4554),
(10, 'asfdsdf', NULL, NULL, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `role` varchar(50) NOT NULL,
  `country` varchar(100) NOT NULL,
  `enabled` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`username`, `password`, `full_name`, `role`, `country`, `enabled`) VALUES
('arvind', '$2a$10$Vfs8YMQx1YHI.d0x4WO8n.C.K3prfllnP2uS/j8ChpRirS17y.N42', 'Arvind Rai', 'ROLE_USER', 'India', 1),
('mahesh', '$2a$10$N0eqNiuikWCy9ETQ1rdau.XEELcyEO7kukkfoiNISk/9F7gw6eB0W', 'Mahesh Sharma', 'ROLE_ADMIN', 'India', 1),
('trump', '$2a$10$QifQnP.XqXDW0Lc4hSqEg.GhTqZHoN2Y52/hoWr4I5ePxK7D2Pi8q', 'Donald Trump', 'ROLE_ADMIN', 'US', 1),
('alberto', '$2a$10$OYNCx1FJD4gnjytEfWHmDuCQ5nS/qlNAtbBKfsdujc4.LWroYXEQe', 'AlbertoTG17', 'ROLE_ADMIN', 'Spain', 1),
('alberto', '$2a$10$OYNCx1FJD4gnjytEfWHmDuCQ5nS/qlNAtbBKfsdujc4.LWroYXEQe', 'AlbertoTG17', 'ROLE_ADMIN', 'Spain', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`idreserva`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `idreserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
