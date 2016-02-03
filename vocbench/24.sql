DROP TABLE IF EXISTS `users_groups_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_groups_map` (
  `map_id` int(7) NOT NULL AUTO_INCREMENT,
  `users_id` int(7) NOT NULL DEFAULT '0',
  `users_group_id` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`map_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_groups_map`
--

LOCK TABLES `users_groups_map` WRITE;
/*!40000 ALTER TABLE `users_groups_map` DISABLE KEYS */;
INSERT INTO `users_groups_map` VALUES (1,1,1),(2,2,2),(3,3,3),(4,4,4),(5,5,5),(6,6,6),(7,6,12),(8,1,13),(9,9,5),(10,9,4),(11,9,3),(12,9,14),(13,9,13);
/*!40000 ALTER TABLE `users_groups_map` ENABLE KEYS */;
UNLOCK TABLES;
