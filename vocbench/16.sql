--
-- Table structure for table `permissiontype`
--

DROP TABLE IF EXISTS `permissiontype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permissiontype` (
  `permission_id` int(2) NOT NULL AUTO_INCREMENT,
  `permission` varchar(250) NOT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permissiontype`
--

LOCK TABLES `permissiontype` WRITE;
/*!40000 ALTER TABLE `permissiontype` DISABLE KEYS */;
INSERT INTO `permissiontype` VALUES (1,'Search'),(2,'Import'),(3,'Export'),(4,'Validation'),(5,'Consistency'),(6,'Text_analysis'),(7,'Terms'),(8,'Concepts'),(9,'Classifications'),(10,'Statistics'),(11,'Users'),(12,'Groups'),(13,'Preferences'),(14,'Others_systems'),(15,'Relationships'),(16,'Comments'),(17,'Logs'),(18,'Home'),(19,'Configuration'),(20,'Ontology'),(21,'Schemes');
/*!40000 ALTER TABLE `permissiontype` ENABLE KEYS */;
UNLOCK TABLES;

