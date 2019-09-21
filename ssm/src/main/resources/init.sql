-- 建表出现this is incompatible with sql_mode=only_full_group_by错误时执行
-- 查看生效的
-- show variables like "sql_mode";
--
-- set sql_mode='';
-- set sql_mode='NO_ENGINE_SUBSTITUTION,STRICT_TRANS_TABLES';

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `id` int(10) NOT NULL auto_increment,
  `name` varchar(20) default NULL,
  `price` float(10,0) default NULL,
  `pic` varchar(40) default NULL,
  `createtime` datetime default NULL,
  `detail` varchar(200) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;


INSERT INTO `items` VALUES ('1', '传智播客', '1000', null, '2018-03-13 09:29:30', '带我走上人生巅峰');
INSERT INTO `items` VALUES ('2', '黑马310', null, null, '2018-03-28 10:05:52', '插入测试');
INSERT INTO `items` VALUES ('3', '黑马307', '199', null, '2018-03-07 10:08:04', '插入测试');
INSERT INTO `items` VALUES ('7', '插入测试', null, null, null, null);
INSERT INTO `items` VALUES ('8', '插入测试', null, null, null, null);