DROP TABLE IF EXISTS `users_ontology`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_ontology` (
  `user_id` int(7) NOT NULL DEFAULT '0',
  `ontology_id` int(11) NOT NULL DEFAULT '0',
  `status` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`user_id`,`ontology_id`),
  KEY `users_ontology_ibfk_4` (`ontology_id`),
  CONSTRAINT `users_ontology_ibfk_3` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `users_ontology_ibfk_4` FOREIGN KEY (`ontology_id`) REFERENCES `ontology_info` (`ontology_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_ontology`
--

LOCK TABLES `users_ontology` WRITE;
/*!40000 ALTER TABLE `users_ontology` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_ontology` ENABLE KEYS */;
UNLOCK TABLES;

