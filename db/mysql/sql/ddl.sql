CREATE SCHEMA IF NOT EXISTS `mfm_api` DEFAULT CHARACTER SET utf8;
USE `mfm_api`;

CREATE TABLE IF NOT EXISTS `mfm_api`.`users` (
  `id` VARCHAR(128) NOT NULL,
  `name` VARCHAR(64) NOT NULL UNIQUE,
  `email` VARCHAR(64) NOT NULL,
  `password` VARCHAR(64) NOT NULL,
  `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mfm_api`.`movies` (
    `id` VARCHAR(128) NOT NULL,
    `title` VARCHAR(128),
    `image_url` VARCHAR(128),
    `home_url` VARCHAR(128),
    `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mfm_api`.`reviews` (
    `id` VARCHAR(128) NOT NULL,
    `user_id` VARCHAR(128) NOT NULL,
    `movie_id` VARCHAR(128) NOT NULL,
    `rating` FLOAT NOT NULL,
    `body` VARCHAR(128),
    `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_at` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`user_id`, `movie_id`),
    INDEX `fk_reviews_user_idx` (`user_id` ASC),
    INDEX `fk_reviews_movie_idx` (`movie_id` ASC),
    CONSTRAINT `fk_reviews_user`
        FOREIGN KEY (`user_id`)
        REFERENCES `mfm_api`.`users` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
    CONSTRAINT `fk_reviews_movie`
        FOREIGN KEY (`movie_id`)
        REFERENCES `mfm_api`.`movies` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mfm_api`.`follows` (
    `id` VARCHAR(128) NOT NULL,
    `user_id` VARCHAR(128) NOT NULL,
    `follow_id` VARCHAR(128) NOT NULL,
    `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    INDEX `fk_follows_user_idx` (`user_id` ASC),
    INDEX `fk_follows_follow_idx` (`follow_id` ASC),
    CONSTRAINT `fk_follows_user`
        FOREIGN KEY (`user_id`)
        REFERENCES `mfm_api`.`users` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
    CONSTRAINT `fk_follows_follow`
        FOREIGN KEY (`follow_id`)
        REFERENCES `mfm_api`.`users` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `mfm_api`.`profiles` (
    `id` VARCHAR(128) NOT NULL,
    `user_id` VARCHAR(128) NOT NULL,
    `display_name` VARCHAR(128),
    `context` VARCHAR(256),
    `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    INDEX `fk_profiles_user_idx` (`user_id` ASC),
    CONSTRAINT `fk_profiles_user`
       FOREIGN KEY (`user_id`)
           REFERENCES `mfm_api`.`users` (`id`)
           ON DELETE NO ACTION
           ON UPDATE NO ACTION)
ENGINE = InnoDB;