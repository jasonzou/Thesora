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

