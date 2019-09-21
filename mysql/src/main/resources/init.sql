-- 建表出现this is incompatible with sql_mode=only_full_group_by错误时执行
-- 查看生效的
-- show variables like "sql_mode";
--
-- set sql_mode='';
-- set sql_mode='NO_ENGINE_SUBSTITUTION,STRICT_TRANS_TABLES';

DROP TABLE IF EXISTS items;

CREATE TABLE `items` (
  `id` int(8) NOT NULL COMMENT '物品标识',
  `name` varchar(64) DEFAULT '' COMMENT '物品名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;