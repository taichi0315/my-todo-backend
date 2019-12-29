CREATE SCHEMA IF NOT EXISTS `todo_api` DEFAULT CHARACTER SET utf8;
USE `todo_api`;

CREATE TABLE IF NOT EXISTS `todo_api`.`todos` (
    `id`            INT(10) NOT NULL AUTO_INCREMENT,
    `name`          VARCHAR(128) NOT NULL,
    `state`         VARCHAR(128),
    `due_date`      DATE,
    `created_at`    DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`))
ENGINE = InnoDB;