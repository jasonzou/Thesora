--
-- Table structure for table `ontology_info`
--

DROP TABLE IF EXISTS `ontology_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ontology_info` (
  `ontology_id` int(11) NOT NULL AUTO_INCREMENT,
  `ontology_name` varchar(255) DEFAULT NULL,
  `ontology_description` text,
  `db_url` varchar(255) DEFAULT NULL,
  `db_driver` varchar(255) DEFAULT NULL,
  `db_name` varchar(50) DEFAULT NULL,
  `db_username` varchar(255) DEFAULT NULL,
  `db_password` varchar(255) DEFAULT NULL,
  `ontology_show` int(1) unsigned zerofill NOT NULL DEFAULT '0',
  `version` varchar(50) NOT NULL,
  PRIMARY KEY (`ontology_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ontology_info`
--

LOCK TABLES `ontology_info` WRITE;
/*!40000 ALTER TABLE `ontology_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `ontology_info` ENABLE KEYS */;
UNLOCK TABLES;

