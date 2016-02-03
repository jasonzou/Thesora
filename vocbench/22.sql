--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_id` int(7) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) NOT NULL DEFAULT '',
  `password` varchar(80) NOT NULL DEFAULT '',
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) NOT NULL DEFAULT '',
  `email` varchar(100) NOT NULL DEFAULT '',
  `affiliation` varchar(50) NOT NULL DEFAULT '',
  `contact_address` varchar(255) DEFAULT NULL,
  `user_url` varchar(200) DEFAULT NULL,
  `registration_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `portrait` varchar(255) DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `country_code` varchar(2) DEFAULT NULL,
  `postal_code` varchar(80) DEFAULT NULL,
  `work_phone` varchar(100) DEFAULT NULL,
  `mobile_phone` varchar(100) DEFAULT NULL,
  `chat_address` varchar(50) DEFAULT NULL,
  `comment` varchar(250) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Administrator','96e79218965eb72c92a549dd5a330112','Administrator','At FAO','agrovoc@gmail.com','GILW','GILW at FAO','http://www.fao.org','2011-03-18 06:22:37','default_photo.jpg','1967-09-11','M','IT','10600','','','','Testing only','1'),(2,'Publisher','96e79218965eb72c92a549dd5a330112','Publisher','At FAO','agrovoc@gmail.com','GILW','GILW at FAO','http://www.fao.org','2011-03-18 06:21:12','default_photo.jpg','9999-01-01','-','IT','10600','','','','Testing only','1'),(3,'Validator','96e79218965eb72c92a549dd5a330112','Validator','At FAO','agrovoc@gmail.com','GILW','GILW at FAO','http://www.fao.org','2011-03-18 06:21:12','default_photo.jpg','9999-01-01','-','IT','10600','','','','Testing only','1'),(4,'Ontoeditor','96e79218965eb72c92a549dd5a330112','Ontology editor','At FAO','agrovoc@gmail.com','GILW','GILW at FAO','http://www.fao.org','2011-03-18 06:21:12','default_photo.jpg','9999-01-01','-','IT','10600','','','','Testing only','1'),(5,'Termeditor','96e79218965eb72c92a549dd5a330112','Term editor','At FAO','agrovoc@gmail.com','GILW','GILW at FAO','http://www.fao.org','2011-03-18 06:21:12','default_photo.jpg','9999-01-01','-','IT','10600','','','','Testing only','1'),(6,'Guest','5416d7cd6ef195a0f7622a9c56b55e84','Anonymous','At FAO','agrovoc@gmail.com','GILW','GILW at FAO','http://www.fao.org','2011-03-18 06:21:12','default_photo.jpg','9999-01-01','-','IT','10600','','','','Testing only','1');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

