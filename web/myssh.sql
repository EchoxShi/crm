-- MySQL dump 10.13  Distrib 5.7.20, for Win64 (x86_64)
--
-- Host: localhost    Database: myssh
-- ------------------------------------------------------
-- Server version	5.7.20-log

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
-- Table structure for table `crm_classes`
--

DROP TABLE IF EXISTS `crm_classes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crm_classes` (
  `classId` varchar(255) NOT NULL,
  `beginTime` datetime(6) DEFAULT NULL,
  `endTime` datetime(6) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `totalCount` int(11) DEFAULT NULL,
  `upgradeCount` int(11) DEFAULT NULL,
  `changeCount` int(11) DEFAULT NULL,
  `runoffCount` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `uploadTime` datetime DEFAULT NULL,
  `uploadPath` varchar(255) DEFAULT NULL,
  `uploadFileName` varchar(255) DEFAULT NULL,
  `courseTypeId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`classId`),
  KEY `FKat667kro8saq6oq1pjy91j90g` (`courseTypeId`),
  CONSTRAINT `FKat667kro8saq6oq1pjy91j90g` FOREIGN KEY (`courseTypeId`) REFERENCES `crm_course_type` (`courseTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crm_classes`
--

LOCK TABLES `crm_classes` WRITE;
/*!40000 ALTER TABLE `crm_classes` DISABLE KEYS */;
/*!40000 ALTER TABLE `crm_classes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crm_course_type`
--

DROP TABLE IF EXISTS `crm_course_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crm_course_type` (
  `courseTypeId` varchar(255) NOT NULL,
  `courseCost` double DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `courseName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`courseTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crm_course_type`
--

LOCK TABLES `crm_coursetype` WRITE;
/*!40000 ALTER TABLE `crm_coursetype` DISABLE KEYS */;
INSERT INTO `crm_coursetype` VALUES ('40282a7969f0ca230169f1840adc0000',1234,12,'qwe','asd'),('40282a7969f0ca230169f1863fbf0001',12345,2345,'gggggggg','qwerr'),('40282a7969f0ca230169f18794a90002',7894,456,'jjjjjjjjjjjj','f'),('40282a7969f0ca230169f189cd610003',3466,123,'fgjhhh','xxxx'),('40282a7969f18b7b0169f18c7a8f0000',22555,124,'44444','33333333'),('40282a7969f18b7b0169f190f9200001',5555,345,'ddddd','f'),('40282a7969f18b7b0169f191778e0002',456,432,'kkk','dff'),('40282a7969f18b7b0169f1922a280003',233,12,'fgb','javaa'),('40282a7969f18b7b0169f195e3490004',123,12,'bbbbbbbbb','mmmmmmmmmm'),('40282a7969f18b7b0169f19634590005',123,12,'bbbbbbbbb','nnnnnnnnnnn'),('type1',5000,10,'价值五千','java'),('type2',6000,10,'价值六千','ssh'),('type3',7000,10,'价值七千','ssm');
/*!40000 ALTER TABLE `crm_course_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crm_department`
--

DROP TABLE IF EXISTS `crm_department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crm_department` (
  `depId` varchar(255) NOT NULL,
  `depName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`depId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crm_department`
--

LOCK TABLES `crm_department` WRITE;
/*!40000 ALTER TABLE `crm_department` DISABLE KEYS */;
INSERT INTO `crm_department` VALUES ('d1','dname1'),('d2','dname2'),('d3','dname3'),('depId','depName');
/*!40000 ALTER TABLE `crm_department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crm_post`
--

DROP TABLE IF EXISTS `crm_post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crm_post` (
  `postId` varchar(255) NOT NULL,
  `postName` varchar(255) DEFAULT NULL,
  `depId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`postId`),
  KEY `FKgk6yh1w0w92hb9kmmh5fof8h6` (`depId`),
  CONSTRAINT `FKgk6yh1w0w92hb9kmmh5fof8h6` FOREIGN KEY (`depId`) REFERENCES `crm_department` (`depId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crm_post`
--

LOCK TABLES `crm_post` WRITE;
/*!40000 ALTER TABLE `crm_post` DISABLE KEYS */;
INSERT INTO `crm_post` VALUES ('p1','pname1','d1'),('p2','pname2','d1'),('p3','pname3','d2'),('postId','postName','depId');
/*!40000 ALTER TABLE `crm_post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crm_staff`
--

DROP TABLE IF EXISTS `crm_staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crm_staff` (
  `staffId` varchar(255) NOT NULL,
  `staffName` varchar(255) DEFAULT NULL,
  `loginName` varchar(255) DEFAULT NULL,
  `loginPwd` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `onDutyDate` datetime(6) DEFAULT NULL,
  `postId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`staffId`),
  KEY `FKtrgxem3u7h6d33d9hpymksl01` (`postId`),
  CONSTRAINT `FKtrgxem3u7h6d33d9hpymksl01` FOREIGN KEY (`postId`) REFERENCES `crm_post` (`postId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crm_staff`
--

LOCK TABLES `crm_staff` WRITE;
/*!40000 ALTER TABLE `crm_staff` DISABLE KEYS */;
INSERT INTO `crm_staff` VALUES ('1','zs1','admin','250cf8b51c773f3f8dc8b4be867a9a02','女','2019-06-06 00:00:00.000000','p1'),('s1','sname','slname','202cb962ac59075b964b07152d234b70','女','2019-06-01 00:00:00.000000','p3'),('s2','sname2','slname2','202cb962ac59075b964b07152d234b70','男','2019-06-01 00:00:00.000000','p2');
/*!40000 ALTER TABLE `crm_staff` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-08 16:09:02
