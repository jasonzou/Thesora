--
-- Table structure for table `owl_def_source`
--

DROP TABLE IF EXISTS `owl_def_source`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `owl_def_source` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `source` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owl_def_source`
--

LOCK TABLES `owl_def_source` WRITE;
/*!40000 ALTER TABLE `owl_def_source` DISABLE KEYS */;
INSERT INTO `owl_def_source` VALUES (1,'FAOTERM'),(2,'NAL'),(3,'WIKIPEDIA'),(4,'MeSH'),(5,'Other'),(6,'Book'),(7,'Journal Article'),(8,'AGROVOC'),(9,'Wordnet');
/*!40000 ALTER TABLE `owl_def_source` ENABLE KEYS */;
UNLOCK TABLES;

