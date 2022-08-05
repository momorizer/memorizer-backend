CREATE DATABASE  IF NOT EXISTS `memorizer` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `memorizer`;
-- MySQL dump 10.13  Distrib 8.0.29, for macos12 (x86_64)
--
-- Host: 127.0.0.1    Database: memorizer
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `AUser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `AUser` (
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `user_id` int unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `contact_no` char(10) NOT NULL,
  `dob` date DEFAULT NULL,
  `password` varchar(1024) NOT NULL,
  `profile_pic` blob,
  `default_memory_privacy` tinyint DEFAULT '0',
  `email_verified` tinyint DEFAULT '0',
  `bio` blob,
  `user_based_notification_enabled` tinyint DEFAULT '1',
  `memory_based_notification_enabled` varchar(45) DEFAULT '1',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `UserId_UNIQUE` (`user_id`),
  UNIQUE KEY `Email_UNIQUE` (`email`),
  UNIQUE KEY `ContactNo_UNIQUE` (`contact_no`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `AUser` WRITE;
/*!40000 ALTER TABLE `AUser` DISABLE KEYS */;
INSERT INTO `AUser` VALUES ('2022-07-05 12:16:16','2022-07-05 12:16:16',1,'Shivang','Mangal','shivangmangal@gmail.com','9876543210','1999-06-16','welcome1',NULL,0,0,NULL,1,'1'),('2022-07-05 12:17:31','2022-07-05 12:17:31',2,'Ashutosh','Singh','ashu@gmail.com','8876543210','1998-03-21','welcome2',NULL,0,0,NULL,1,'1'),('2022-07-05 12:18:01','2022-07-05 12:18:01',3,'Adarsh','Patel','adarshpatel@gmail.com','8876543219','1999-10-25','welcome3',NULL,0,0,NULL,1,'1'),('2022-07-05 12:18:39','2022-07-05 12:18:39',4,'Saksham','Agrawal','sakshamagr@gmail.com','8876773219','1998-08-09','welcome4',NULL,0,0,NULL,1,'1'),('2022-07-05 06:46:16','2022-07-05 06:46:16',5,'Mandeep','Singh','mandeep@gmail.com','9898989898','1999-11-11','welcome5',_binary 'ihwbdv',0,0,NULL,1,'1'),(NULL,NULL,6,'ayush','Sharma','ayush1234@hotmail.com','9870123164',NULL,'welcome6',NULL,0,1,NULL,1,'1'),(NULL,NULL,7,'Sachin','Saharan','sachin@hotmail.com','8870123164',NULL,'{\n    \"firstname\":\"Ayush\",\n    \"lastname\":\"Sharma\",\n    \"email\":\"ayush1234@hotmail.com\",\n    \"contactno\":\"9870123164\",\n    \"password\":\"welcome7\"\n}',NULL,0,0,NULL,1,'1'),(NULL,NULL,9,'mayank','garg','mayank@hotmail.com','8070123164',NULL,'welcom4',NULL,1,1,NULL,1,'1'),(NULL,NULL,11,'Karan','Purswani','karan@hotmail.com','9871123164',NULL,'welcome8',NULL,1,0,NULL,1,'1'),(NULL,NULL,12,'Aditya','Kumar','aditya@hotmail.com','4871123164',NULL,'welcome9',NULL,0,1,NULL,1,'1'),(NULL,NULL,18,'Soham','Roy','roysoham@hotmail.com','4800123164',NULL,'welcome10',NULL,1,1,NULL,1,'1'),(NULL,NULL,20,'Sohami','Royi','roysohami@hotmail.com','4800023164',NULL,'welcome10',NULL,0,1,NULL,1,'1'),(NULL,NULL,22,'Abhi','Royi','abhi@hotmail.com','9800023164',NULL,'welcome10',NULL,1,1,NULL,1,'1'),('2022-07-10 18:30:00','2022-07-11 16:31:18',27,'Abii','Royil','abhi@hotmaili.com','9800023168',NULL,'welcome10',NULL,0,0,NULL,1,'1'),('2022-07-11 18:30:00','2022-07-12 05:23:50',28,'Aman','Singh','singhaman@yahoo.com','9021857933',NULL,'welcome11',NULL,0,0,NULL,1,'1'),('2022-07-11 18:30:00','2022-07-12 05:30:58',29,'Amit','Singh','amitsingh@yahoo.com','8021857933','1999-06-16','welcome11',NULL,0,0,NULL,1,'1'),('2022-07-12 07:24:22','2022-07-12 07:24:22',32,'Akshat','Singh','akshat@yahoo.com','2321857933','1999-06-16','$2a$10$i8edCBklLtpkAV4fD0oAK.WVW2bl502zcIdV8IrVphIijL3KMz10u',NULL,0,0,NULL,1,'1'),('2022-07-25 10:15:09','2022-07-25 10:15:09',34,'Akshat','Singh','akshat1@yahoo.com','2321857943','1999-06-16','$2a$10$cfXMQDWJavlZVpPCIXTumufv0q46xuu4ElfsABng68.mTs2g.YJnq',NULL,0,0,NULL,1,'1');
/*!40000 ALTER TABLE `AUser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Memory`
--

DROP TABLE IF EXISTS `CMemory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CMemory` (
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `memory_id` int unsigned NOT NULL AUTO_INCREMENT,
  `created_by` int unsigned NOT NULL,
  `created_for` int unsigned NOT NULL,
  `title` varchar(255) NOT NULL,
  `content` blob,
  `photo` blob,
  `privacy` tinyint DEFAULT '1',
  PRIMARY KEY (`memory_id`),
  UNIQUE KEY `MemoryId_UNIQUE` (`memory_id`),
  KEY `createdBy_idx` (`created_by`),
  KEY `createdFor_idx` (`created_for`),
  CONSTRAINT `createdBy` FOREIGN KEY (`created_by`) REFERENCES `AUser` (`user_id`),
  CONSTRAINT `createdFor` FOREIGN KEY (`created_for`) REFERENCES `AUser` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Memory`
--

LOCK TABLES `CMemory` WRITE;
/*!40000 ALTER TABLE `CMemory` DISABLE KEYS */;
INSERT INTO `CMemory` VALUES ('2022-07-05 12:38:54','2022-07-05 12:38:54',1,1,2,'Hello',_binary 'abcded',NULL,1),('2022-07-05 12:39:04','2022-07-05 12:39:04',2,1,2,'Bye',_binary 'abcsdvjbadvded',NULL,1),('2022-07-05 12:39:20','2022-07-05 12:39:20',3,1,4,'no',_binary 'wkjbvw vw mf we wf',NULL,0),('2022-07-05 12:39:31','2022-07-05 12:39:31',4,2,4,'JBjksbfvds',_binary 'wkjbvw vw advljbnqvjbnmf we wf',NULL,0),('2022-07-05 12:39:45','2022-07-05 12:39:45',5,2,3,'Name',_binary 'WE  weff f we wf',NULL,0),('2022-07-05 12:39:55','2022-07-05 12:39:55',6,2,1,'Name ef lnkjbd ',_binary 'WE   wfwe fweff f we wf',NULL,1),('2022-07-05 12:40:07','2022-07-05 12:40:07',7,3,1,'YYWLJFcm',_binary 'kqjdwe e fweff f we wf',NULL,1),('2022-07-05 12:40:20','2022-07-05 12:40:20',8,3,4,'psdkfp wf','',NULL,1),(NULL,NULL,30,7,1,'New memory',_binary 'Hi this is a new memory',_binary 'djvlnwdvn',0),('2022-07-12 05:48:40','2022-07-12 05:48:40',31,7,1,'New memory-2',_binary 'Hi this is a new memory',_binary 'djvlnwdvn',0);
/*!40000 ALTER TABLE `CMemory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Notification`
--

DROP TABLE IF EXISTS `DNotification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `DNotification` (
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `notification_id` int unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int unsigned NOT NULL,
  `content` blob,
  `is_seen` tinyint DEFAULT '0',
  `notification_type` int DEFAULT NULL,
  PRIMARY KEY (`notification_id`),
  UNIQUE KEY `notification_id_UNIQUE` (`notification_id`),
  KEY `user_id_idx` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `AUser` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Notification`
--

LOCK TABLES `DNotification` WRITE;
/*!40000 ALTER TABLE `DNotification` DISABLE KEYS */;
/*!40000 ALTER TABLE `DNotification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (35);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'memorizer'
--

--
-- Dumping routines for database 'memorizer'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-01 21:07:26
