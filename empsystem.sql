-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 21, 2023 at 03:14 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `DEP_ID` int(11) NOT NULL,
  `DEP_NAME` varchar(100) DEFAULT NULL,
  `DEP_HEAD` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DEP_ID`, `DEP_NAME`, `DEP_HEAD`) VALUES
(1, 'HR', 'Munasingha'),
(2, 'Jayasingha', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EMP_ID` int(11) NOT NULL,
  `EMP_NAME` varchar(100) DEFAULT NULL,
  `EMP_ADDRESS` varchar(100) DEFAULT NULL,
  `EMP_AGE` int(11) DEFAULT NULL,
  `EMP_TEL_NO` int(11) DEFAULT NULL,
  `EMP_SALARY` double DEFAULT NULL,
  `EMP_STATUS` varchar(100) DEFAULT NULL,
  `EMP_REQ_DATE` date DEFAULT NULL,
  `DEP_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EMP_ID`, `EMP_NAME`, `EMP_ADDRESS`, `EMP_AGE`, `EMP_TEL_NO`, `EMP_SALARY`, `EMP_STATUS`, `EMP_REQ_DATE`, `DEP_ID`) VALUES
(4, 'Pramila Maduwantha', 'Poonewa', 23, 773837485, 10000, 'Superiser', '1999-12-30', 1),
(5, 'Kasun Priyanath', 'Galgamuwa', 22, 3625956, 100000, 'Incharj', '1998-03-20', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DEP_ID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EMP_ID`),
  ADD KEY `employee_FK` (`DEP_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `DEP_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `EMP_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `employee_FK` FOREIGN KEY (`DEP_ID`) REFERENCES `department` (`DEP_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
