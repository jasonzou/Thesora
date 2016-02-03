DROP TABLE IF EXISTS `recent_changes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recent_changes` (
  `modified_id` int(11) NOT NULL AUTO_INCREMENT,
  `modified_object` longblob NOT NULL,
  `modified_action` int(10) unsigned NOT NULL,
  `modifier_id` int(11) DEFAULT NULL,
  `modified_date` timestamp NULL DEFAULT NULL,
  `ontology_id` int(11) NOT NULL DEFAULT '0',
  `concept_uri` varchar(255) DEFAULT NULL,
  `term_uri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`modified_id`),
  KEY `FK_recent_changes_1` (`modified_action`),
  KEY `ontology_id` (`ontology_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recent_changes`
--

LOCK TABLES `recent_changes` WRITE;
/*!40000 ALTER TABLE `recent_changes` DISABLE KEYS */;
/*!40000 ALTER TABLE `recent_changes` ENABLE KEYS */;
UNLOCK TABLES;

