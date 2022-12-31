DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`(
                       `id` bigint(20) NOT NULL AUTO_INCREMENT,
                       `name` varchar(255) DEFAULT NULL,
                       `author` varchar(255) DEFAULT NULL,
                       `publisher` varchar(255) DEFAULT NULL,
                       `date` varchar(255) DEFAULT NULL,
                       `quantity` bigint(50) NOT NULL AUTO_INCREMENT,
                       PRIMARY KEY (`id`)
);