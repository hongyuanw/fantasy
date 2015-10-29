CREATE SCHEMA `fantasy` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE `fantasy`.`article` (
  `id` INT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL COMMENT '标题',
  `content` VARCHAR(1024) NULL COMMENT '内容',
  PRIMARY KEY (`id`))
COMMENT = '文章';

INSERT INTO `fantasy`.`article` (`title`, `content`) VALUES ('hello', 'hello world');
INSERT INTO `fantasy`.`article` (`title`, `content`) VALUES ('demo', 'demo test');
