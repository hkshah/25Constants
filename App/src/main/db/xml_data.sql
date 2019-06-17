# MySQL-Front 3.2  (Build 8.0)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES latin1 */;

# Host: localhost    Database: 25constants
# ------------------------------------------------------
# Server version 5.0.15-nt

DROP DATABASE IF EXISTS `25constants`;
CREATE DATABASE `25constants` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `25constants`;

#
# Table structure for table xml_data
#

CREATE TABLE `xml_data` (
  `id` int(11) NOT NULL auto_increment,
  `filename` varchar(225) NOT NULL,
  `xml_data` longblob NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Dumping data for table xml_data
#


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
