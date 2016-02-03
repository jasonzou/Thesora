--
-- Table structure for table `owl_status`
--

DROP TABLE IF EXISTS `owl_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `owl_status` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `status` varchar(45) CHARACTER SET latin1 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owl_status`
--

LOCK TABLES `owl_status` WRITE;
/*!40000 ALTER TABLE `owl_status` DISABLE KEYS */;
INSERT INTO `owl_status` VALUES (1,'Proposed by guest'),(2,'Proposed'),(3,'Revised by guest'),(4,'Revised'),(5,'Proposed deprecated'),(6,'Deprecated'),(7,'Validated'),(8,'Published'),(99,'Deleted');
/*!40000 ALTER TABLE `owl_status` ENABLE KEYS */;
UNLOCK TABLES;

