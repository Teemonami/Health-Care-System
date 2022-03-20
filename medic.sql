-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2021 at 12:21 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `medic`
--

-- --------------------------------------------------------

--
-- Table structure for table `appoint`
--

CREATE TABLE `appoint` (
  `name` varchar(100) NOT NULL,
  `typetest` varchar(100) NOT NULL,
  `amount` bigint(100) NOT NULL,
  `date` date NOT NULL,
  `payment` varchar(100) NOT NULL,
  `status` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appoint`
--

INSERT INTO `appoint` (`name`, `typetest`, `amount`, `date`, `payment`, `status`, `password`) VALUES
('weqweq', 'DNA Test', 2000, '2021-06-10', 'Cash', 'paid', 'giging'),
('asdasda', 'DNA Test', 2000, '2021-06-16', 'Bank Transfer', 'paid', 'dador'),
('mmammma', 'Urine/Stool Test', 3000, '2021-06-10', 'Gcash', 'paid', 'try'),
('bobo', 'DNA Test', 2000, '2021-06-10', 'Cash', 'paid', '1'),
('rosevic', 'Covid Test', 5000, '2021-06-11', 'Gcash', 'paid', 'rose'),
('giging', 'Drug Test', 1000, '2021-06-03', 'Cash', 'paid', 'rose');

-- --------------------------------------------------------

--
-- Table structure for table `payment_table`
--

CREATE TABLE `payment_table` (
  `acc_number` int(100) NOT NULL,
  `acc_name` varchar(100) NOT NULL,
  `acc_type` varchar(100) NOT NULL,
  `amount` int(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_table`
--

INSERT INTO `payment_table` (`acc_number`, `acc_name`, `acc_type`, `amount`, `password`) VALUES
(123, 'dador123', 'Gcash', 5000, 'dasa'),
(123, 'adas', 'Gcash', 4444, 'adas'),
(1321, 'dadada', 'Gcash', 123131, 'dador'),
(12321, 'adasd', 'Bank Transfer', 12, 'dador'),
(1231, 'asdas', 'Gcash', 50000, 'dador'),
(123, 'dador', 'Bank Transfer', 70000, 'dador'),
(1231, 'wadas', 'Bank Transfer', 1231231, 'dador'),
(1321, 'dada', 'Gcash', 50000, 'dador'),
(13213, 'asdsa', 'Gcash', 132131, 'dador'),
(1231, 'dadaddd', 'Gcash', 12313, 'dador'),
(123131, 'john rey', 'Gcash', 10000, 'dador'),
(1231, 'dadsa', 'Gcash', 1231313, 'dador'),
(1231, 'dador', 'Gcash', 10000, 'try'),
(1231, 'asda', 'Bank Transfer', 123131, 'try'),
(12131, 'number1', 'Gcash', 70000, '1'),
(1231, 'rose', 'Bank Transfer', 10000, 'rose'),
(1231, 'rose', 'Bank Transfer', 132131, 'rose');

-- --------------------------------------------------------

--
-- Table structure for table `registerdatabase`
--

CREATE TABLE `registerdatabase` (
  `firstname` varchar(50) NOT NULL,
  `lastname` text NOT NULL,
  `email` varchar(100) NOT NULL,
  `number` bigint(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registerdatabase`
--

INSERT INTO `registerdatabase` (`firstname`, `lastname`, `email`, `number`, `username`, `password`) VALUES
('John Rey', 'Dador', 'test@gmail.com', 995519030, 'johnrey', 'johnrey'),
('s', 's', 's', 1, 's', 's'),
('s', 's', 's', 1, 's', 's'),
('Rosevic Anne', 'Oliva', 'arianagrande@gmail.com', 9121313, 'giging', 'giging'),
('try', 'try', 'try', 995551903, 'try', 'try'),
('1', '1', '1', 9955519030, '1', '1'),
('2', '2', '@gmail.com', 1111, '2', '2'),
('john', 'dsasa', 'sada', 121231, 'john ', 'dador'),
('rosevic', 'oliva', 'rosevic@gmail.com', 97812322, 'rose', 'rose');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
