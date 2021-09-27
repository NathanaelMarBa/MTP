-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: sirsh
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `altas`
--

DROP TABLE IF EXISTS `altas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `altas` (
  `idaltas` int NOT NULL AUTO_INCREMENT,
  `clave` varchar(45) NOT NULL,
  `titular` varchar(50) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `equipo` varchar(45) NOT NULL,
  `fechaalta` date NOT NULL,
  `mantenimiento` varchar(20) NOT NULL,
  PRIMARY KEY (`idaltas`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `altas`
--

LOCK TABLES `altas` WRITE;
/*!40000 ALTER TABLE `altas` DISABLE KEYS */;
INSERT INTO `altas` VALUES (1,'003','Tomas Mrtinez Cano','5598367826','tomas@gmail.com','HP','2021-03-01','Preventivo'),(2,'002','Patricia Barrera Elisea','5562894581','paty@gmail.com','Acer','2021-03-01','Preventivo'),(3,'005','Yasmin Alejandra Martinz Barrera','5562897536','yasmin@gmail.com','HP','2021-03-01','Preventivo'),(4,'009','Nathanael','5530656890','kevin@gmail.com','Evoteck','2021-03-01','Preventivo'),(5,'0010','Kevin','5530652987','nathanael@gmail.com','Acer','2021-03-02','Preventivo'),(6,'001','Kevin Nathanael Martinez Barrera','5530656220','kevin.@gmail.com','Evoteck','2021-03-02','Preventivo');
/*!40000 ALTER TABLE `altas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-02 12:52:53
