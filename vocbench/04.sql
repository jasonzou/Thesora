DROP TABLE IF EXISTS `filter_preferences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `filter_preferences` (
  `filter_id` int(11) NOT NULL,
  `user_id` int(7) NOT NULL,
  `ontology_id` int(11) NOT NULL,
  `preference_value` varchar(45) NOT NULL,
  PRIMARY KEY (`filter_id`,`user_id`,`ontology_id`,`preference_value`),
  KEY `user_id` (`user_id`),
  KEY `ontology_id` (`ontology_id`),
  CONSTRAINT `ontology_id` FOREIGN KEY (`ontology_id`) REFERENCES `ontology_info` (`ontology_id`) ON DELETE CASCADE ON UPDATE NO ACTION,
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`) ON DELETE CASCADE ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

