-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 13, 2020 at 04:19 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_buku`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `ID` varchar(5) NOT NULL,
  `judul` varchar(100) NOT NULL,
  `tipe` varchar(50) NOT NULL,
  `episode` varchar(10) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `status` varchar(100) NOT NULL,
  `rating` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`ID`, `judul`, `tipe`, `episode`, `genre`, `status`, `rating`) VALUES
('1234', 'Strong Woman', 'modern', '17', 'comedy, romance', 'Selesai', '8.7'),
('2112', 'Hot Young Bloods', 'classic', '24', 'melodrama', 'Belum Selesai', '7.6'),
('3321', 'My First Life', 'serial', '40', 'drama, comedy', 'Belum Selesai', '8.0'),
('1212', 'Forecast', 'drama', '16', 'romance', 'Selesai', '8.5'),
('4123', 'Moonlight', 'classic', '90', 'historical drama', 'Belum Selesai', '6.7'),
('1111', 'Gumiho', 'drama', '17', 'fantasy, comedy', 'Selesai', '9.0'),
('2323', 'Boys', 'serial', '59', 'school', 'Belum Selesai', '7.8'),
('2121', 'Reply', 'drama', '21', 'comedy, romance', 'Selesai', '9.5'),
('1222', 'Bossy Girl', 'modern', '16', 'action', 'Belum Selesai', '7.7');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
