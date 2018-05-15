/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : smileagain

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-15 20:10:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `perid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pername` varchar(128) NOT NULL COMMENT '资源名称',
  `type` varchar(32) NOT NULL COMMENT '资源类型: menu,button',
  `url` varchar(128) DEFAULT NULL COMMENT '访问url地址',
  `percode` varchar(128) DEFAULT NULL COMMENT '权限代码字符串',
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`perid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '用户管理', 'menu', 'user/queryUser', null, '1');
INSERT INTO `sys_permission` VALUES ('2', '用户添加', 'permission', 'user/addUser', 'user:add', '1');
INSERT INTO `sys_permission` VALUES ('3', '用户删除', 'permission', 'user/deleteUser', 'user:delete', '1');
INSERT INTO `sys_permission` VALUES ('4', '用户修改', 'permission', 'user/updateUser', 'user:update', '1');
INSERT INTO `sys_permission` VALUES ('5', '用户查询', 'permission', 'user/queryUser', 'user:query', '1');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `roleid` bigint(20) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(128) NOT NULL,
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '用户系统管理员', '1');
INSERT INTO `sys_role` VALUES ('2', '用户查询管理员', '1');
INSERT INTO `sys_role` VALUES ('3', '用户增改查管理员', '1');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `roleid` bigint(20) NOT NULL,
  `perid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `perid` (`perid`),
  KEY `roleid` (`roleid`),
  CONSTRAINT `sys_role_permission_ibfk_1` FOREIGN KEY (`perid`) REFERENCES `sys_permission` (`perid`),
  CONSTRAINT `sys_role_permission_ibfk_2` FOREIGN KEY (`roleid`) REFERENCES `sys_role` (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1', '2');
INSERT INTO `sys_role_permission` VALUES ('2', '1', '3');
INSERT INTO `sys_role_permission` VALUES ('3', '1', '4');
INSERT INTO `sys_role_permission` VALUES ('4', '1', '5');
INSERT INTO `sys_role_permission` VALUES ('5', '2', '5');
INSERT INTO `sys_role_permission` VALUES ('6', '3', '2');
INSERT INTO `sys_role_permission` VALUES ('7', '3', '4');
INSERT INTO `sys_role_permission` VALUES ('8', '3', '5');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `userid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `usercode` varchar(32) NOT NULL COMMENT '账号',
  `username` varchar(64) NOT NULL COMMENT '姓名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `avatar` varchar(64) NOT NULL COMMENT '头像图片地址',
  `salt` varchar(64) NOT NULL COMMENT '盐',
  `locked` char(1) NOT NULL DEFAULT '' COMMENT '账号是否锁定，1：锁定，0未锁定',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', 'Zhang Oba', '81dc9bdb52d04dc20036dbd8313ed055', 'image/ee.png', '', '1');
INSERT INTO `sys_user` VALUES ('2', 'tiger', 'tiger', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('3', 'cat', 'cat', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('4', 'mouse', 'mouse', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('5', 'dog', 'dog', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('6', 'horse', 'horse', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('7', 'pig', 'pig', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('8', 'sheep', 'sheep', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('9', 'deer', 'deer', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('10', 'camel', 'camel', '1', '1', '1', '1');
INSERT INTO `sys_user` VALUES ('11', 'elephant', 'elephant', '1', '1', '1', '1');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userid` bigint(20) NOT NULL,
  `roleid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `userid` (`userid`),
  KEY `roleid` (`roleid`),
  CONSTRAINT `sys_user_role_ibfk_1` FOREIGN KEY (`userid`) REFERENCES `sys_user` (`userid`),
  CONSTRAINT `sys_user_role_ibfk_2` FOREIGN KEY (`roleid`) REFERENCES `sys_role` (`roleid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1');
