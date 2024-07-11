DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
                            `EMPLOYEE_ID` int(11) NOT NULL AUTO_INCREMENT,
                            `FIRST_NAME` varchar(50) DEFAULT NULL,
                            `LAST_NAME` varchar(50) DEFAULT NULL,
                            `JOB_ROLE` varchar(50) NOT NULL,
                            `SALARY` int(15)  NOT NULL ;
                            PRIMARY KEY (`EMPLOYEE_ID`),

)