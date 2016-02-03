--
-- Table structure for table `language_code`
--

DROP TABLE IF EXISTS `language_code`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `language_code` (
  `language_code` varchar(3) NOT NULL,
  `language_note` varchar(100) DEFAULT NULL,
  `local_language` varchar(100) DEFAULT NULL,
  `language_order` int(11) NOT NULL DEFAULT '999',
  PRIMARY KEY (`language_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language_code`
--

LOCK TABLES `language_code` WRITE;
/*!40000 ALTER TABLE `language_code` DISABLE KEYS */;
INSERT INTO `language_code` VALUES ('ar','Arabic','Arabic',7),('bn','Bengali','বাংলা ',46),('bs','Bosnian','bosanski jezik',43),('ca','Catalan','Català',38),('cs','Czech','Cesky',13),('da','Danish','dansk',40),('de','German','Deutsch ',19),('el','Greek','Greek',48),('en','English','English',1),('es','Spanish','Español',4),('fa','Also known as Farsi.','Persian',15),('fi','Finnish','suomi, suomen kieli',32),('fj','Fijian','vosa Vakaviti',41),('fr','French','Français',6),('hi','Hindi','हिन्दी',18),('hr','Croatian','hrvatski',44),('hu','Hungarian','Hungarian',20),('id','Indonesian','Bahasa Indonesia',31),('it','Italian','Italiano',21),('ja','Japanese','日本語',16),('ko','Korean','한국어 ',27),('la','Latin','latin',12),('lo','Lao','Lao',14),('lv','Latvian','latviešu valoda',47),('mk','Macedonian','македонски јазик',36),('ml','Malayalam','മലയാള',45),('mo','Moldavian','Moldavian',22),('mr','Marati','मराठी ',29),('ms','Malesian','Bahasa Melayu ',30),('nl','Dutch','Nederlands',35),('no','Norwegian','Norsk',39),('pl','Polish','Polski ',23),('pt','Portuguese','Português',10),('ro','Romanian','română',37),('ru','Russian','Русский ',9),('sk','Slovak','Slovak',24),('sl','Slovene','slovenščina',42),('sr','Serbian','српски језик',34),('sv','Swedish','Swedish',26),('te','Telugu','తెలుగు',28),('th','Thai','ไทย',17),('tr','Turkish','Türkçe ',25),('vi','Vietnamese','Tiếng Việt',33),('zh','Chinese','中文',8);
/*!40000 ALTER TABLE `language_code` ENABLE KEYS */;
UNLOCK TABLES;

