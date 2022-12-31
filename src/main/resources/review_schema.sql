DROP TABLE IF EXISTS `review`;
CREATE TABLE `review`(
                       `id` bigint(20) NOT NULL AUTO_INCREMENT,
                       `book_id` bigint(20) NOT NULL AUTO_INCREMENT,
                       `content` varchar(555) DEFAULT NULL,
                       PRIMARY KEY (`id`)
);