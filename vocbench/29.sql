--
-- Table structure for table `users_visits`
--

DROP TABLE IF EXISTS `users_visits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_visits` (
  `visit_id` int(11) NOT NULL AUTO_INCREMENT,
  `token` varchar(255) NOT NULL,
  `ipaddress` varchar(50) DEFAULT NULL,
  `country_code` varchar(2) DEFAULT NULL,
  `logintime` datetime DEFAULT NULL,
  `lastvisittime` datetime DEFAULT NULL,
  `totallogintime` time DEFAULT '00:00:00',
  `user_id` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`visit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_visits`
--

LOCK TABLES `users_visits` WRITE;
/*!40000 ALTER TABLE `users_visits` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_visits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `validation`
--

DROP TABLE IF EXISTS `validation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `validation` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `concept` longblob NOT NULL,
  `term` longblob,
  `owner_id` int(11) NOT NULL DEFAULT '0',
  `modifier_id` int(11) DEFAULT '0',
  `action` int(2) NOT NULL DEFAULT '0',
  `old_relationship` longblob,
  `new_relationship` longblob,
  `old_value` longblob,
  `new_value` longblob,
  `old_status` int(11) DEFAULT '0',
  `status` int(11) NOT NULL DEFAULT '0',
  `date_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `date_modified` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `note` text,
  `validator_id` int(10) unsigned DEFAULT '0',
  `is_validate` tinyint(1) unsigned zerofill DEFAULT '0',
  `ontology_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `validation`
--

LOCK TABLES `validation` WRITE;
/*!40000 ALTER TABLE `validation` DISABLE KEYS */;
/*!40000 ALTER TABLE `validation` ENABLE KEYS */;
UNLOCK TABLES;

