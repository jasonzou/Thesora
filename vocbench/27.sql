DROP TABLE IF EXISTS `users_preference`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_preference` (
  `user_id` int(7) NOT NULL,
  `ontology_id` int(11) NOT NULL,
  `frequency` varchar(45) CHARACTER SET utf8 NOT NULL,
  `initial_page` varchar(45) CHARACTER SET utf8 NOT NULL,
  `hide_uri` tinyint(1) NOT NULL DEFAULT '1',
  `hide_nonpreferred` tinyint(1) NOT NULL DEFAULT '1',
  `hide_nonselectedlanguages` tinyint(1) NOT NULL,
  `hide_deprecated` tinyint(1) NOT NULL,
  `language_code_interface` varchar(3) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `show_inferred_and_explicit` tinyint(1) NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `users_preference_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_preference`
--

LOCK TABLES `users_preference` WRITE;
/*!40000 ALTER TABLE `users_preference` DISABLE KEYS */;
/*!40000 ALTER TABLE `users_preference` ENABLE KEYS */;
UNLOCK TABLES;

