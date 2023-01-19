-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: LocalHost    Database: hotel_management
-- ------------------------------------------------------
-- Server version	5.7.39-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `Email` varchar(30) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `UserType` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin@gmail.com','admin','admin');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booking` (
  `Booking_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FullName` varchar(30) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `Check_in_date` varchar(20) DEFAULT NULL,
  `Check_out_date` varchar(20) DEFAULT NULL,
  `Room_Type` varchar(30) DEFAULT NULL,
  `postal_Code` varchar(11) DEFAULT NULL,
  `Booking_status` varchar(20) DEFAULT NULL,
  `Corporate_ID` int(11) DEFAULT NULL,
  `RoomNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`Booking_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,'AnojAryal ','Kalanki','2022-4-22','2022-4-28','Double Room','56787','Booked',NULL,4),(2,'AnojAryal ','kalanki ','2022-4-22','2022-4-28','Double Room','12345','pending',NULL,NULL),(3,'anojaryal ','kalimti ','2022-4-23','2022-4-27','Single Room','67890','Booked',NULL,4),(4,'anoj aryal','kalanki','2022-4-22','2022-4-28','Double Room','5678','Booked',NULL,4);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corporate`
--

DROP TABLE IF EXISTS `corporate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corporate` (
  `Customer_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Company_Name` varchar(40) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Contact` varchar(11) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Confirm_Password` varchar(20) DEFAULT NULL,
  `Login_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corporate`
--

LOCK TABLES `corporate` WRITE;
/*!40000 ALTER TABLE `corporate` DISABLE KEYS */;
INSERT INTO `corporate` VALUES (1,'','','','','',NULL),(2,'','','','','',NULL),(3,'qwertyu','abc','123456','aaa','aaa',NULL),(4,'abc','abcd','qwerty','aa','aa',NULL),(5,'abc company','aabb','98234','bbcc','bbcc',NULL),(6,'qwertyui','ss','541','aa','aa',NULL),(7,'qwert','abcd','12345','abcde','abcde',NULL),(8,'KRSL','KRSL','12345678999','KRSL','KRSL',NULL),(9,'abc ','abcd','123','abcde','abcde',NULL);
/*!40000 ALTER TABLE `corporate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `individual`
--

DROP TABLE IF EXISTS `individual`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `individual` (
  `CustomerID` int(11) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(25) NOT NULL,
  `Creditcardnumber` varchar(40) NOT NULL,
  `Expirydate` date NOT NULL,
  `ContactNo` varchar(11) NOT NULL,
  PRIMARY KEY (`CustomerID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `individual`
--

LOCK TABLES `individual` WRITE;
/*!40000 ALTER TABLE `individual` DISABLE KEYS */;
INSERT INTO `individual` VALUES (1,'Raju lama','Dhangadi','lamaraju18@gmail.com','42lama','9715679945292','2028-01-01','02257432'),(2,'Hari shakya','Illam','harisha67@gmail.com','2243hari','786536789423','2022-10-30','5292630383'),(3,'Subash tamang','pokhara','tamang23@gmail.com','tamangselo','768954339023','2023-04-02','3345672317'),(4,'Shyam Gurung','kalimati','gurungshyam@gmail.com','shyam22','479800934367','2023-01-01','7278271167'),(5,'Ram Aryal','gorkha','ram44@gmail.com','ram768aryal','72738338833','2024-09-23','83338373833'),(6,'Bimala pradhan','Thamel','bimala23@gmail.com','bimalabot','985272272726','2030-12-17','73638373833'),(7,'manas shrestha','Kalimati','manas97@gmail.com','manasoliver','928836373838','2022-01-01','8738373833'),(8,'lakpa adhikari','Biratnagar','lakpa@gmail.com','lakpa76','5625282728272','2027-11-28','42537393837'),(9,'jeeya sharma','janakpur','jeeya12@gmail.com','jeeyaali','7627262826282','2028-10-26','9282827282'),(10,'merina tamang','Chitwan','meri234@gmail.com','merry567','29283633837383','2025-07-25','8878738783');
/*!40000 ALTER TABLE `individual` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `invoice` (
  `Invoice_ID` varchar(10) DEFAULT NULL,
  `FullName` varchar(30) DEFAULT NULL,
  `Contact` varchar(30) DEFAULT NULL,
  `Address` varchar(30) DEFAULT NULL,
  `Check_in_date` int(11) DEFAULT NULL,
  `Check_out_date` int(11) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES ('1','AnojAryal','984856321','kalanki',1996,1990,5000);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `User_ID` int(11) NOT NULL,
  `Username` varchar(25) DEFAULT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'anojaryal','anoj123@gmail.com','anoj12');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `non_corporate`
--

DROP TABLE IF EXISTS `non_corporate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `non_corporate` (
  `Customer_ID` int(11) NOT NULL AUTO_INCREMENT,
  `First_name` varchar(30) DEFAULT NULL,
  `Last_name` varchar(30) DEFAULT NULL,
  `Credit_card_No` varchar(20) DEFAULT NULL,
  `Address` varchar(40) DEFAULT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `Confirm_Password` varchar(20) DEFAULT NULL,
  `Login_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`Customer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `non_corporate`
--

LOCK TABLES `non_corporate` WRITE;
/*!40000 ALTER TABLE `non_corporate` DISABLE KEYS */;
INSERT INTO `non_corporate` VALUES (1,'hsjduhs','jsbjbc','hshch','hbhsc','bbbb','bbbb','bbbb',NULL),(2,'krishal','buda','21234','dharan','krsl','krishal','krishal',NULL),(3,'krishal','aryal','12345678','qwerty','krsl','krishal','krishal',NULL),(4,'sadikshya ','acharya','12345678','godawari ','hya@gmail.com','hawajpt ','hawajpt',NULL),(5,'anoj ','aryal ','55372627','maitrinagar ','anoj1810@gmail.com','anoj1810','anoj1810',NULL),(6,'saroj ','nepal ','456789','syuchatar','saroj@gmail.com','saroj','saroj',NULL),(7,'Shyam','Aryal','45678654','Kalanki ','ashma@gmail.com','haha','haha',NULL),(8,'ram','adhikari','343637362','chobar','ram@gmail.com','ram1','ram1',NULL),(9,'Jmaes','Morgan','567883383','Kalimati','james@gmail.com','james1','james1',NULL),(10,'Anoj','Aryal','345678','Kalanki ','anoj@gmail.com ','anoj1','anoj1',NULL),(11,'anoj ','aryal ','3456789','kalanki ','anoj1810@gmail.com ','aabb','abb',NULL),(12,'anoj ','aryal ','234567','kalimati ','anoj@gmail.com ','123anoj','123anoj',NULL),(13,'anoj ','aryal','67890','kalanki ','anoj@gmail.com','haha','haha',NULL);
/*!40000 ALTER TABLE `non_corporate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room` (
  `Room_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Room_number` int(11) DEFAULT NULL,
  `Room_type` varchar(20) DEFAULT NULL,
  `Room_rate` int(20) DEFAULT NULL,
  `Room_Status` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Room_ID`),
  UNIQUE KEY `Room_number` (`Room_number`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,100,'Single Room',1500,'Pending'),(2,150,'Double Room',2000,'Booked'),(3,102,'Twin Room',3000,'Pending'),(4,104,'Single Room',1800,'Booked'),(5,152,'Twin Room',3000,'Booked');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'hotel_management'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-09 11:12:56
