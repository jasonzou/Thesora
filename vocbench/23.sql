--
-- Table structure for table `users_groups`
--

DROP TABLE IF EXISTS `users_groups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_groups` (
  `users_groups_id` int(2) NOT NULL AUTO_INCREMENT,
  `users_groups_name` varchar(200) NOT NULL DEFAULT '',
  `users_groups_desc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`users_groups_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_groups`
--

LOCK TABLES `users_groups` WRITE;
/*!40000 ALTER TABLE `users_groups` DISABLE KEYS */;
INSERT INTO `users_groups` VALUES (1,'Administrator','Administrators have full access to the system.'),(2,'Publisher','Publishers are responsible for publishing the validated entities.'),(3,'Validator','Validators can check (approve or reject) the changes done by the users. They can also approve new registered users.'),(4,'Ontology editors','Ontology editors can manage concepts and relationships. They include more experienced terminologists and thesaurus editors.'),(5,'Term editors','Term editors (Terminologists) can manage the entire terminology base in their own language(s).'),(6,'Non logged-in users','Guests (non-logged in users) can make suggestions for new terms and other suggestions about concepts and relationships, such as proposing to delete or change.'),(7,'Unassigned to any group','Users not assigned to any group(s).');
/*!40000 ALTER TABLE `users_groups` ENABLE KEYS */;
UNLOCK TABLES;

