create DATABASE  IF NOT EXISTS `jukebox` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `jukebox`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: jukebox
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `playlist`
--

drop table IF EXISTS `playlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
create TABLE `playlist` (
  `playlistName` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playlist`
--

lock TABLES `playlist` WRITE;
/*!40000 ALTER TABLE `playlist` DISABLE KEYS */;
insert into `playlist` VALUES ('we');
/*!40000 ALTER TABLE `playlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playlist1`
--

drop table IF EXISTS `playlist1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
create TABLE `playlist1` (
  `playlistID` int DEFAULT NULL,
  `song_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playlist1`
--

lock TABLES `playlist1` WRITE;
/*!40000 ALTER TABLE `playlist1` DISABLE KEYS */;
insert into `playlist1` VALUES (1,4);
/*!40000 ALTER TABLE `playlist1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `song_details`
--

drop table IF EXISTS `song_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
create TABLE `song_details` (
  `song_id` int NOT NULL AUTO_INCREMENT,
  `song_name` varchar(35) NOT NULL,
  `artist_name` varchar(30) NOT NULL,
  `album_name` varchar(30) NOT NULL,
  `duration` time NOT NULL,
  `genre` varchar(20) NOT NULL,
  `song_path` varchar(60) NOT NULL,
  PRIMARY KEY (`song_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `song_details`
--

lock TABLES `song_details` WRITE;
/*!40000 ALTER TABLE `song_details` DISABLE KEYS */;
insert into `song_details` VALUES (1,'Ganstas Paradise','Coolio','unknown','00:04:16','rock','src/main/resources/songs_list/GangstasParadise.wav'),(2,'Hall of fame','The Script','unknown','00:03:54','pop','src/main/resources/songs_list/HallOfFame.wav'),(3,'Heat Waves','Glass Animals','unknown','00:03:56','pop','src/main/resources/songs_list/HeatWaves.wav'),(4,'Nights','Avicii','Stories','00:03:11','house music','src/main/resources/songs_list/Nights.wav'),(5,'Peeky Blinders','Nick Caves','Peeky Blinders','00:06:14','pop','src/main/resources/songs_list/PeekyBlinderTheme.wav'),(6,'See You Again','Charlie Puth','unknown','00:03:58','pop','src/main/resources/songs_list/SeeYouAgain.wav');
/*!40000 ALTER TABLE `song_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-25 23:37:32
