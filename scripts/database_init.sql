-- MySQL Script generated by MySQL Workbench
-- Mon Oct 28 12:42:44 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema nuky
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema nuky
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `nuky` DEFAULT CHARACTER SET utf8 ;
USE `nuky` ;

-- -----------------------------------------------------
-- Table `nuky`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuky`.`user` (
  `id` BIGINT(20) ZEROFILL UNSIGNED NOT NULL,
  `username` VARCHAR(100) NOT NULL,
  `create_date` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
  `email` VARCHAR(255) NULL,
  `mobile` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `user_name_UNIQUE` (`username` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuky`.`article`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuky`.`article` (
  `id` BIGINT(20) UNSIGNED ZEROFILL NOT NULL,
  `title` NVARCHAR(200) NOT NULL,
  `content` TEXT NULL,
  `create_date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `post_date` DATETIME NULL,
  `user_id` BIGINT(20) UNSIGNED ZEROFILL NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_article_user_id_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_article_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `nuky`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nuky`.`comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `nuky`.`comment` (
  `id` BIGINT(20) ZEROFILL UNSIGNED NOT NULL,
  `content` VARCHAR(1000) NOT NULL,
  `article_id` BIGINT(20) UNSIGNED NULL,
  `user_id` BIGINT(20) UNSIGNED NULL,
  `reply_comment_id` BIGINT(20) UNSIGNED NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_comment_user_id_idx` (`user_id` ASC) VISIBLE,
  INDEX `fk_comment_article_id_idx` (`article_id` ASC) VISIBLE,
  CONSTRAINT `fk_comment_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `nuky`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_comment_article_id`
    FOREIGN KEY (`article_id`)
    REFERENCES `nuky`.`article` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_comment_reply_id`
    FOREIGN KEY (`article_id`)
    REFERENCES `nuky`.`comment` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
