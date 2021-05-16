USE my_favorite_items;
DROP TABLE IF EXISTS `author`;
CREATE TABLE IF NOT EXISTS `author` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `uid` VARCHAR(255) NOT NULL COMMENT 'ユーザUID' COLLATE 'utf8_unicode_ci',
  `username` VARCHAR(255) NULL DEFAULT NULL COMMENT 'ユーザー名' COLLATE 'utf8_unicode_ci',
  `password` VARCHAR(60) NULL DEFAULT NULL COMMENT 'パスワード' COLLATE 'utf8_unicode_ci',
  `role` VARCHAR(255) NULL DEFAULT NULL COMMENT '権限' COLLATE 'utf8_unicode_ci',
  `delete_flg` TINYINT(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '論理削除フラグ',
  `created` DATETIME DEFAULT NULL COMMENT '作成日時',
  `modified` DATETIME DEFAULT NULL COMMENT '更新日時',
  PRIMARY KEY (`id`, `uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE='utf8_unicode_ci' COMMENT='author';

DROP TABLE IF EXISTS `work_product`;
CREATE TABLE `work_product` (
  `id` INT(10) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` VARCHAR(255) NULL DEFAULT NULL COMMENT '作品名' COLLATE 'utf8_unicode_ci',
  `description` VARCHAR(1024) NULL DEFAULT NULL COMMENT '作品概要' COLLATE 'utf8_unicode_ci',
  `release_date` DATETIME NULL DEFAULT NULL COMMENT '公開日時',
  `delete_flg` TINYINT(4) NULL DEFAULT '0' COMMENT '論理削除フラグ',
  `created` DATETIME NULL DEFAULT NULL COMMENT '作成日時',
  `modified` DATETIME NULL DEFAULT NULL COMMENT '更新日時',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE='utf8_unicode_ci' COMMENT='work_product';

--DROP TABLE IF EXISTS `work_images`;
--CREATE TABLE IF NOT EXISTS `work_images` (
--  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
--  `data` MEDIUMBLOB COMMENT '画像データ',
--  `work_id` INT(11) NOT NULL COMMENT '作品ID',
--  `delete_flg` TINYINT(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '論理削除フラグ',
--  `created` DATETIME DEFAULT NULL COMMENT '作成日時',
--  `modified` DATETIME DEFAULT NULL COMMENT '更新日時',
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE='utf8_unicode_ci' COMMENT='work_images';
--
--DROP TABLE IF EXISTS `work_tag_relation`;
--CREATE TABLE IF NOT EXISTS `work_product_tags` (
--  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
--  `items_id` INT(10) NOT NULL COMMENT '作品ID',
--  `tags_id` INT(10) UNSIGNED NOT NULL COMMENT '作品関連タグID',
--  `delete_flg` TINYINT(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '論理削除フラグ',
--  `created` DATETIME DEFAULT NULL COMMENT '作成日時',
--  `modified` DATETIME DEFAULT NULL COMMENT '更新日時',
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE='utf8_unicode_ci' COMMENT='work_tag_relation';
--
--# タグは共通、カテゴリIDで利用するタグを絞り込む
--DROP TABLE IF EXISTS `tag`;
--CREATE TABLE IF NOT EXISTS `tag` (
--  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
--  `name` VARCHAR(64) NULL DEFAULT NULL COMMENT 'タグ名' COLLATE 'utf8_unicode_ci',
--  `category_id` INT(10) UNSIGNED NOT NULL COMMENT 'カテゴリID',
--  `delete_flg` TINYINT(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '論理削除フラグ',
--  `created` DATETIME DEFAULT NULL COMMENT '作成日時',
--  `modified` DATETIME DEFAULT NULL COMMENT '更新日時',
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE='utf8_unicode_ci' COMMENT='tag';
--
--# タグは共通、カテゴリIDで利用するタグを絞り込む
--DROP TABLE IF EXISTS `category`;
--CREATE TABLE IF NOT EXISTS `category` (
--  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
--  `name` VARCHAR(64) NULL DEFAULT NULL COMMENT 'カテゴリ名' COLLATE 'utf8_unicode_ci',
--  `delete_flg` TINYINT(3) UNSIGNED NOT NULL DEFAULT '0' COMMENT '論理削除フラグ',
--  `created` DATETIME DEFAULT NULL COMMENT '作成日時',
--  `modified` DATETIME DEFAULT NULL COMMENT '更新日時',
--  PRIMARY KEY (`id`)
--) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE='utf8_unicode_ci' COMMENT='category';
--
