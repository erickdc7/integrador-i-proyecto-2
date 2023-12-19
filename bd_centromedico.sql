-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-11-2023 a las 19:17:52
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
-- Base de datos: `bd_centromedico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `atencion_medica`
--

CREATE TABLE `atencion_medica` (
  `id_medico_historia_clinica` int(11) NOT NULL,
  `id_paciente` int(11) DEFAULT NULL,
  `id_especialidad` int(11) DEFAULT NULL,
  `hora_atencion` time DEFAULT NULL,
  `fecha_atencion` date DEFAULT NULL,
  `t_estado_atencion` varchar(50) DEFAULT NULL,
  `t_observacion_medica` varchar(250) DEFAULT NULL,
  `t_indicacion_medica` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `atencion_medica`
--

INSERT INTO `atencion_medica` (`id_medico_historia_clinica`, `id_paciente`, `id_especialidad`, `hora_atencion`, `fecha_atencion`, `t_estado_atencion`, `t_observacion_medica`, `t_indicacion_medica`) VALUES
(1, 1, 1, '10:30:00', '2023-11-25', 'En proceso', 'Presión arterial alta', 'Seguir medicación indicada'),
(2, 2, 4, '11:00:00', '2023-11-28', 'En proceso', 'Ritmo cardíaco irregular', 'Seguir tratamiento cardíaco'),
(3, 3, 5, '13:30:00', '2023-11-29', 'En proceso', 'Artritis crónica', 'Ajuste en medicación antiinflamatoria'),
(4, 4, 2, '14:15:00', '2023-11-26', 'En proceso', 'Control de asma', 'Revisión anual de rutina'),
(5, 5, 3, '09:45:00', '2023-11-27', 'En proceso', 'Consulta de rutina', 'Sin indicaciones especiales');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita_medica`
--

CREATE TABLE `cita_medica` (
  `id_paciente_medico` int(11) NOT NULL,
  `id_especialidad` int(11) DEFAULT NULL,
  `fecha_cita` date DEFAULT NULL,
  `hora_cita` time DEFAULT NULL,
  `t_motivo_cita` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cita_medica`
--

INSERT INTO `cita_medica` (`id_paciente_medico`, `id_especialidad`, `fecha_cita`, `hora_cita`, `t_motivo_cita`) VALUES
(1, 1, '2023-11-25', '10:30:00', 'Consulta ginecológica'),
(2, 3, '2023-11-29', '13:30:00', 'Control pediátrico'),
(3, 3, '2023-11-26', '14:15:00', 'Consulta dermatológica'),
(4, 5, '2023-11-27', '09:45:00', 'Consulta de cardiología');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE `especialidad` (
  `id_especialidad` int(11) NOT NULL,
  `t_nombre_especialidad` varchar(50) DEFAULT NULL,
  `t_descripcion_especialidad` varchar(50) DEFAULT NULL,
  `t_restriccion_especialidad` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `especialidad`
--

INSERT INTO `especialidad` (`id_especialidad`, `t_nombre_especialidad`, `t_descripcion_especialidad`, `t_restriccion_especialidad`) VALUES
(1, 'Ginecología', 'Especialidad enfocada en la salud de la mujer', 'Solo mujeres'),
(2, 'Pediatría', 'Especialidad para el cuidado de niños y jóvenes', 'Hasta los 15 años'),
(3, 'Geriatría', 'Especialidad para el cuidado de personas mayores', 'Desde los 65 años'),
(4, 'Cardiología', 'Especialidad centrada en problemas del corazón', 'Sin restricciones'),
(5, 'Dermatología', 'Especialidad para problemas de la piel', 'Sin restricciones');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historia_clinica`
--

CREATE TABLE `historia_clinica` (
  `id_historia_clinica` int(11) NOT NULL,
  `id_paciente` int(11) DEFAULT NULL,
  `t_enfermedad_patologica` varchar(250) DEFAULT NULL,
  `t_tratamiento` varchar(100) DEFAULT NULL,
  `t_alergias` varchar(100) DEFAULT NULL,
  `t_enfermedad_no_patologica` varchar(250) DEFAULT NULL,
  `t_historial_padre` varchar(250) DEFAULT NULL,
  `t_historial_madre` varchar(250) DEFAULT NULL,
  `t_historial_abuelos_pat` varchar(250) DEFAULT NULL,
  `t_historial_abuelos_mat` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historia_clinica`
--

INSERT INTO `historia_clinica` (`id_historia_clinica`, `id_paciente`, `t_enfermedad_patologica`, `t_tratamiento`, `t_alergias`, `t_enfermedad_no_patologica`, `t_historial_padre`, `t_historial_madre`, `t_historial_abuelos_pat`, `t_historial_abuelos_mat`) VALUES
(4, 1, 'Hipertensión', 'Medicación diaria', 'Ninguna', 'Ninguna', 'Diabetes', 'Ninguno', 'Ninguno', 'Ninguno'),
(5, 1, 'Asma', 'Inhalador', 'Polvo y polen', 'Ninguna', 'Ninguna', 'Hipertensión', 'Ninguno', 'Ninguno'),
(6, 4, 'Arritmia', 'Medicación para el corazón', 'Ninguna', 'Ninguna', 'Ninguna', 'Ninguna', 'Hipertensión', 'Ninguna'),
(7, 1, 'Artritis', 'Antiinflamatorios', 'Ninguna', 'Ninguna', 'Ninguna', 'Ninguna', 'Ninguna', 'Ninguna');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `id_medico` int(11) NOT NULL,
  `id_especialidad` int(11) DEFAULT NULL,
  `t_nombres_medico` varchar(50) DEFAULT NULL,
  `t_apellidos_medico` varchar(50) DEFAULT NULL,
  `t_dni_medico` varchar(50) DEFAULT NULL,
  `t_edad_medico` int(11) DEFAULT NULL,
  `t_genero_medico` varchar(50) DEFAULT NULL,
  `t_celular_medico` varchar(10) DEFAULT NULL,
  `t_correo_medico` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`id_medico`, `id_especialidad`, `t_nombres_medico`, `t_apellidos_medico`, `t_dni_medico`, `t_edad_medico`, `t_genero_medico`, `t_celular_medico`, `t_correo_medico`) VALUES
(1, 1, 'Luis', 'González', '12345678', 35, 'Masculino', '987654321', 'luis.gonzalez@email.com'),
(2, 5, 'Elena', 'Sánchez', '87654321', 40, 'Femenino', '654321987', 'elena.sanchez@email.com'),
(3, 3, 'Martín', 'Fernández', '56789012', 45, 'Masculino', '789012345', 'martin.fernandez@email.com'),
(4, 2, 'Laura', 'Molina', '34567890', 38, 'Femenino', '123456789', 'laura.molina@email.com'),
(5, 4, 'Roberto', 'Vega', '90123456', 50, 'Masculino', '234567890', 'roberto.vega@email.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `id_paciente` int(11) NOT NULL,
  `t_nombres_paciente` varchar(50) DEFAULT NULL,
  `t_apellidos_paciente` varchar(50) DEFAULT NULL,
  `t_dni_paciente` varchar(50) DEFAULT NULL,
  `t_edad_paciente` int(11) DEFAULT NULL,
  `t_genero_paciente` varchar(50) DEFAULT NULL,
  `t_correo_paciente` varchar(100) DEFAULT NULL,
  `t_celular_paciente` varchar(10) DEFAULT NULL,
  `t_direccion_paciente` varchar(250) DEFAULT NULL,
  `t_distrito_paciente` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`id_paciente`, `t_nombres_paciente`, `t_apellidos_paciente`, `t_dni_paciente`, `t_edad_paciente`, `t_genero_paciente`, `t_correo_paciente`, `t_celular_paciente`, `t_direccion_paciente`, `t_distrito_paciente`) VALUES
(1, 'Juan', 'Pérez', '12345678', 30, 'Masculino', 'juan.perez@email.com', '987654321', 'Calle A #123', 'Miraflores'),
(2, 'María', 'Gómez', '87654321', 25, 'Femenino', 'maria.gomez@email.com', '654321987', 'Avenida B #456', 'San Isidro'),
(3, 'Carlos', 'Rodríguez', '56789012', 40, 'Masculino', 'carlos.rodriguez@email.com', '789012345', 'Carrera C #789', 'Surco'),
(4, 'Ana', 'López', '34567890', 28, 'Femenino', 'ana.lopez@email.com', '123456789', 'Calle D #234', 'Lince'),
(5, 'Pedro', 'Martínez', '90123456', 35, 'Masculino', 'pedro.martinez@email.com', '234567890', 'Avenida E #567', 'Breña');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `atencion_medica`
--
ALTER TABLE `atencion_medica`
  ADD PRIMARY KEY (`id_medico_historia_clinica`),
  ADD KEY `id_paciente` (`id_paciente`),
  ADD KEY `id_especialidad` (`id_especialidad`);

--
-- Indices de la tabla `cita_medica`
--
ALTER TABLE `cita_medica`
  ADD PRIMARY KEY (`id_paciente_medico`),
  ADD KEY `id_especialidad` (`id_especialidad`);

--
-- Indices de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`id_especialidad`);

--
-- Indices de la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  ADD PRIMARY KEY (`id_historia_clinica`),
  ADD KEY `id_paciente` (`id_paciente`);

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`id_medico`),
  ADD KEY `id_especialidad` (`id_especialidad`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id_paciente`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `atencion_medica`
--
ALTER TABLE `atencion_medica`
  MODIFY `id_medico_historia_clinica` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `cita_medica`
--
ALTER TABLE `cita_medica`
  MODIFY `id_paciente_medico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `id_especialidad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  MODIFY `id_historia_clinica` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `medico`
--
ALTER TABLE `medico`
  MODIFY `id_medico` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id_paciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `atencion_medica`
--
ALTER TABLE `atencion_medica`
  ADD CONSTRAINT `atencion_medica_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`),
  ADD CONSTRAINT `atencion_medica_ibfk_2` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id_especialidad`);

--
-- Filtros para la tabla `cita_medica`
--
ALTER TABLE `cita_medica`
  ADD CONSTRAINT `cita_medica_ibfk_1` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id_especialidad`);

--
-- Filtros para la tabla `historia_clinica`
--
ALTER TABLE `historia_clinica`
  ADD CONSTRAINT `historia_clinica_ibfk_1` FOREIGN KEY (`id_paciente`) REFERENCES `paciente` (`id_paciente`);

--
-- Filtros para la tabla `medico`
--
ALTER TABLE `medico`
  ADD CONSTRAINT `medico_ibfk_1` FOREIGN KEY (`id_especialidad`) REFERENCES `especialidad` (`id_especialidad`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
