###创建用户表
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `is_del` tinyint(2) NOT NULL DEFAULT '0' COMMENT '是否删除0 为删除 1删除',
  `mobile` varchar(20) NOT NULL,
  `name` varchar(50),
  `sex` varchar(2) NOT NULL DEFAULT '02' COMMENT '00：保密; 01：男; 02：女',
  `birthday` varchar(10),
  `nickname` varchar(50),
  `bank_no` varchar(30) COMMENT '银行卡号',
  `idno` varchar(20) COMMENT '证件号',
  `type` varchar(2) NOT NULL DEFAULT '00' COMMENT '00：普通用户',
  `state` varchar(2) NOT NULL DEFAULT '00' COMMENT '实名认证 00：认证，01：未认证，02：认证中,03：认证失败，90：冻结，99：失效（删除）',
  `referral_id` int(10) NOT NULL DEFAULT '0' COMMENT '邀请人ID',
  `email` varchar(30),
  `register_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `created_by` varchar(64) DEFAULT NULL COMMENT '创建者',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_modified_by` varchar(64) DEFAULT NULL COMMENT '修改者',
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `flag` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否可用（1：可用，0：不可用）',
  PRIMARY KEY (`id`),
  KEY `idx_user_info_mobile` (`mobile`),
  KEY `idx_user_info_type` (`type`),
  KEY `idx_user_info_add_time` (`created_date`),
  KEY `idx_user_info_name` (`name`),
  KEY `idx_user_info_idno` (`idno`),
  KEY `idx_user_info_referral_id` (`referral_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


###商家信息表
DROP TABLE IF EXISTS `store_info`;
CREATE TABLE `store_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
	`type` varchar(20) COMMENT '商家分类，对应dict中category_code=store_type字段',
  `mobile` varchar(20) COMMENT '商家电话',
  `name` varchar(100) NOT NULL COMMENT '商家名称',
  `address` VARCHAR(100) COMMENT '商家地址',
	`location_x` VARCHAR(20) COMMENT '商家地址X坐标',
	`location_y` VARCHAR(20) COMMENT '商家地址y坐标',
	`logo_url` VARCHAR(100) COMMENT '商家logo地址小图',
	`logo_detail_url` VARCHAR(100) COMMENT '商家详情图',
	`description` VARCHAR(200) COMMENT '商家描述',
	`tags` VARCHAR(100) COMMENT '商家标签',
	`order_id` VARCHAR(100) COMMENT '排序',
	`is_online` VARCHAR(100) COMMENT '是否上线',
  `created_by` varchar(64) DEFAULT NULL COMMENT '创建者',
  `created_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_modified_by` varchar(64) DEFAULT NULL COMMENT '修改者',
  `last_modified_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `flag` tinyint(1) NOT NULL DEFAULT '1' COMMENT '是否可用（1：可用，0：不可用）',
  PRIMARY KEY (`id`),
  KEY `idx_store_info_type` (`type`),
  KEY `idx_store_info_name` (`name`),
  KEY `idx_store_info_tags` (`tags`),
  KEY `idx_store_info_add_time` (`created_date`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;





###数据字典表
DROP TABLE IF EXISTS `dict`;
CREATE TABLE `dict` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主健',
	`category_code` varchar(50)  NOT NULL COMMENT '数据类型',
  `code` int(11) NOT NULL COMMENT '健',
  `name` varchar(255) NOT NULL COMMENT '值',
	`short_name` varchar(50) COMMENT '值',
	`parent_id` bigint(20) COMMENT '父级ID',
	`level_type` varchar(10) DEFAULT '0' COMMENT '数据级别',
  `sort` int(11) DEFAULT '0' COMMENT '显示顺序',
	`remark` varchar(100) COMMENT '备注，描述',
  `created_by` varchar(50) DEFAULT '' COMMENT '创建人',
  `created_date` datetime DEFAULT NULL COMMENT '创建时间',
  `last_modified_by` varchar(50) DEFAULT '' COMMENT '最后一次修改人，首次默认为创建人',
  `last_modified_date` datetime DEFAULT NULL COMMENT '最后一次修改时间，首次默认为创建时间',
  `flag` char(1) NOT NULL DEFAULT '1' COMMENT '数据可用标志，1(true)：可用；0(false)：不可用',
  PRIMARY KEY (`id`),
  UNIQUE KEY `cate` (`category_code`,`code`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='字典';

