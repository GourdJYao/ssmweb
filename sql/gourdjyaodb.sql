/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50641
 Source Host           : localhost:3306
 Source Schema         : gourdjyaodb

 Target Server Type    : MySQL
 Target Server Version : 50641
 File Encoding         : 65001

 Date: 26/10/2018 17:56:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_busline_info
-- ----------------------------
DROP TABLE IF EXISTS `t_busline_info`;
CREATE TABLE `t_busline_info`  (
  `buslineid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL COMMENT '跟用户ID关联',
  `destinationname` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `destinationlat` float(255, 0) DEFAULT NULL,
  `destinationlon` float(255, 0) DEFAULT NULL,
  `originname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `originlat` float(255, 0) DEFAULT NULL,
  `originlon` float(255, 0) DEFAULT NULL,
  `busname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `createtime` bigint(255) DEFAULT NULL,
  PRIMARY KEY (`buslineid`) USING BTREE,
  INDEX `t_userinfo_busline_pk`(`userid`) USING BTREE,
  CONSTRAINT `t_userinfo_busline_pk` FOREIGN KEY (`userid`) REFERENCES `t_user_info` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_user_info
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nickname` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `address` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `telphone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `token` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `createdatetime` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user_info
-- ----------------------------
INSERT INTO `t_user_info` VALUES (10, 'yaojian', 'yaojian', 'yaojian', NULL, '18725756569', 'yaojian27272727@sina.com', 0, '996888a4-b03b-4cf7-bbf3-04a81202360f', 1540287325101);

SET FOREIGN_KEY_CHECKS = 1;
