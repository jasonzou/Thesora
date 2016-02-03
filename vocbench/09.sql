--
-- Table structure for table `owl_action`
--

DROP TABLE IF EXISTS `owl_action`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `owl_action` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `action` varchar(45) NOT NULL,
  `action_child` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `owl_action`
--

LOCK TABLES `owl_action` WRITE;
/*!40000 ALTER TABLE `owl_action` DISABLE KEYS */;
INSERT INTO `owl_action` VALUES (1,'concept-create',''),(2,'concept-delete',''),(3,'concept-edit','relationship-create'),(4,'concept-edit','relationship-edit'),(5,'concept-edit','relationship-delete'),(6,'term-create',''),(7,'term-edit',''),(8,'term-delete',''),(9,'term-relationship-add',''),(10,'term-relationship-edit',''),(11,'term-relationship-delete',''),(12,'term-note-create',''),(13,'term-note-edit',''),(14,'term-note-delete',''),(15,'term-attribute-create',''),(16,'term-attribute-edit',''),(17,'term-attribute-delete',''),(18,'concept-edit','note-create'),(19,'concept-edit','note-edit'),(20,'concept-edit','note-delete'),(21,'concept-edit','definition-create'),(22,'concept-edit','definition-translation-edit'),(23,'concept-edit','definition-delete'),(24,'concept-edit','image-create'),(25,'concept-edit','image-translation-edit'),(26,'concept-edit','image-delete'),(27,'concept-edit','image-translation-create'),(28,'concept-edit','image-translation-delete'),(29,'concept-edit','definition-translation-create'),(30,'concept-edit','definition-translation-delete'),(31,'concept-edit','ext-source-create'),(32,'concept-edit','ext-source-edit'),(33,'concept-edit','ext-source-delete'),(34,'concept-edit','image-source-create'),(35,'concept-edit','image-source-edit'),(36,'concept-edit','image-source-delete'),(37,'concept-edit','attribute-create'),(38,'concept-edit','attribute-edit'),(39,'concept-edit','attribute-delete'),(40,'scheme-create',''),(41,'mapping-create',''),(42,'mapping-delete',''),(43,'user-create',''),(44,'user-edit',''),(45,'user-delete',''),(46,'relationship-create',''),(47,'relationship-delete',''),(48,'relationship-edit','label-create'),(49,'relationship-edit','label-edit'),(50,'relationship-edit','label-delete'),(51,'relationship-edit','definition-create'),(52,'relationship-edit','definition-edit'),(53,'relationship-edit','definition-delete'),(54,'relationship-edit','property-create'),(55,'relationship-edit','property-delete'),(56,'relationship-edit','inverse-property-create'),(57,'relationship-edit','inverse-property-edit'),(58,'relationship-edit','inverse-property-delete'),(59,'relationship-edit','domain-create'),(60,'relationship-edit','domain-delete'),(61,'relationship-edit','range-create'),(62,'relationship-edit','range-edit'),(63,'relationship-edit','range-delete'),(64,'relationship-edit','range-value-add'),(65,'group-create',''),(66,'group-edit',''),(67,'group-delete',''),(68,'group-permission-add',''),(69,'group-permission-delete',''),(70,'group-member-add',''),(71,'group-member-delete',''),(72,'validation-accepted',''),(73,'validation-rejected',''),(74,'export',''),(75,'scheme-delete',''),(76,'concept-edit','move-concept'),(77,'concept-edit','link-concept'),(78,'concept-edit','unlink-concept'),(79,'language-create',''),(80,'language-edit',''),(81,'language-delete','');
/*!40000 ALTER TABLE `owl_action` ENABLE KEYS */;
UNLOCK TABLES;

