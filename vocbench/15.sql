--
-- Table structure for table `permission_group_map`
--

DROP TABLE IF EXISTS `permission_group_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permission_group_map` (
  `users_groups_id` int(2) NOT NULL DEFAULT '0',
  `permission_id` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`users_groups_id`,`permission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission_group_map`
--

LOCK TABLES `permission_group_map` WRITE;
/*!40000 ALTER TABLE `permission_group_map` DISABLE KEYS */;
INSERT INTO `permission_group_map` VALUES (1,1),(1,2),(1,3),(1,4),(1,8),(1,10),(1,11),(1,12),(1,13),(1,15),(1,17),(1,18),(1,19),(1,20),(1,21),(2,1),(2,3),(2,4),(2,8),(2,10),(2,13),(2,15),(2,18),(3,1),(3,3),(3,4),(3,8),(3,10),(3,13),(3,18),(4,1),(4,3),(4,8),(4,10),(4,13),(4,15),(4,18),(5,1),(5,3),(5,8),(5,13),(5,18),(6,1),(6,8),(6,18),(7,1),(7,2),(7,3),(7,4),(7,5),(7,6),(7,7),(7,8),(7,9),(7,10),(7,11),(7,12),(7,13),(7,14),(7,15),(7,16),(7,17),(7,18),(8,2),(9,4),(9,5),(10,1),(10,8),(10,9),(10,10),(12,1),(12,8),(12,18),(13,1),(13,7),(13,8),(13,13),(13,18),(14,1),(14,8),(14,13),(14,15),(14,18);
/*!40000 ALTER TABLE `permission_group_map` ENABLE KEYS */;
UNLOCK TABLES;

