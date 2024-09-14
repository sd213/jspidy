CREATE DATABASE  IF NOT EXISTS `company` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `company`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: company
-- ------------------------------------------------------
-- Server version	8.0.38

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
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp` (
  `id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `sal` decimal(10,0) DEFAULT NULL,
  `dept` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES (1,'Alice Smith',50000,10),(2,'Bob Johnson',52000,20),(3,'Charlie Brown',51000,30),(4,'David Wilson',53000,40),(5,'Emma Jones',54000,10),(6,'Frank White',55000,20),(7,'Grace Miller',56000,30),(8,'Hank Davis',57000,40),(9,'Ivy Garcia',58000,10),(10,'Jack Martinez',59000,20),(11,'Kathy Hernandez',60000,30),(12,'Liam King',61000,40),(13,'Mia Wright',62000,10),(14,'Noah Lopez',63000,20),(15,'Olivia Gonzalez',64000,30),(16,'Paul Perez',65000,40),(17,'Quincy Hall',66000,10),(18,'Rachel Young',67000,20),(19,'Sam Allen',68000,30),(20,'Tina Scott',69000,40),(21,'Uma Green',70000,10),(22,'Vince Adams',71000,20),(23,'Wendy Baker',72000,30),(24,'Xander Nelson',73000,40),(25,'Yara Carter',74000,10),(26,'Zack Mitchell',75000,20),(27,'Aaron Roberts',76000,30),(28,'Bethany Turner',77000,40),(29,'Carlos Phillips',78000,10),(30,'Diana Campbell',79000,20),(31,'Ethan Parker',80000,30),(32,'Fiona Evans',81000,40),(33,'George Edwards',82000,10),(34,'Holly Collins',83000,20),(35,'Ivan Stewart',84000,30),(36,'Judy Sanchez',85000,40),(37,'Kevin Morris',86000,10),(38,'Laura Rogers',87000,20),(39,'Mark Reed',88000,30),(40,'Nina Cook',89000,40),(41,'Oscar Morgan',90000,10),(42,'Pamela Bell',91000,20),(43,'Quentin Murphy',92000,30),(44,'Rita Bailey',93000,40),(45,'Steve Rivera',94000,10),(46,'Tara Cooper',95000,20),(47,'Ulysses Richardson',96000,30),(48,'Victoria Cox',97000,40),(49,'Walter Howard',98000,10),(50,'Xena Ward',99000,20);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-14 18:19:29
