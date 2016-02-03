DROP TABLE IF EXISTS `users_language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_language` (
  `user_id` int(7) NOT NULL DEFAULT '0',
  `language_code` varchar(2) NOT NULL,
  `status` int(1) DEFAULT '0',
  UNIQUE KEY `user_id` (`user_id`,`language_code`),
  KEY `language_code` (`language_code`),
  CONSTRAINT `users_language_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `users_language_ibfk_2` FOREIGN KEY (`language_code`) REFERENCES `language_code` (`language_code`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_language`
--

LOCK TABLES `users_language` WRITE;
/*!40000 ALTER TABLE `users_language` DISABLE KEYS */;
INSERT INTO `users_language` VALUES (1,'en',1),(2,'en',1),(2,'la',1),(3,'en',1),(3,'la',1),(4,'en',1),(4,'la',1),(5,'en',1),(5,'la',1),(6,'en',1),(6,'la',1);
/*!40000 ALTER TABLE `users_language` ENABLE KEYS */;
UNLOCK TABLES;

