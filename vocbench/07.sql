DROP TABLE IF EXISTS `language_interface`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `language_interface` (
  `language_code` varchar(3) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `language_note` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  `local_language` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`language_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language_interface`
--

LOCK TABLES `language_interface` WRITE;
/*!40000 ALTER TABLE `language_interface` DISABLE KEYS */;
INSERT INTO `language_interface` VALUES ('EN','English','English'),('ES','Spanish','Español'),('TH','Thai','ไทย');
/*!40000 ALTER TABLE `language_interface` ENABLE KEYS */;
UNLOCK TABLES;

