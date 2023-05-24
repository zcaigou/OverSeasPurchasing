-- ----------------------------
-- 系统用户表 sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
                             `user_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
                             `user_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户唯一标识',
                             `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
                             `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录密码',
                             `sex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '性别：0-未知 1-男 2-女',
                             `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户手机号',
                             `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
                             `is_certification` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '是否实名认证0-已认证 1-未认证',
                             `del_flag` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0' COMMENT '账号状态：0-正常，1-异常,2-注销',
                             `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
                             `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                             PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 角色表：sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
                             `role_id` int(0) NOT NULL AUTO_INCREMENT COMMENT '角色标识\r\n',
                             `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
                             `role_sort` int(0) NOT NULL COMMENT '排序顺序',
                             `status` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色状态\r\n0：正常；\r\n1：禁用；',
                             `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                             `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
                             `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                             `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者',
                             `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                             PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 用户-角色关系表：user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
                              `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                              `role_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
                              PRIMARY KEY (`role_id`, `user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 实名认证表：user_certification
-- ----------------------------
DROP TABLE IF EXISTS `user_certification`;
CREATE TABLE `user_certification`  (
                                       `user_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户标识',
                                       `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '真实姓名',
                                       `id_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '证件类型',
                                       `id_number` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证号',
                                       `id_card_front` blob NULL COMMENT '身份证正面',
                                       `id_card_reverse` blob NULL COMMENT '身份证反面',
                                       `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                       PRIMARY KEY (`user_uri`) USING BTREE,
                                       CONSTRAINT `cer_useruri_pk` FOREIGN KEY (`user_uri`) REFERENCES `sys_user` (`user_uri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 代购店铺表：purchasing_shop
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_shop`;
CREATE TABLE `purchasing_shop`  (
                                    `shop_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺id',
                                    `shop_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺名称',
                                    `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店主id',
                                    `shop_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺类型',
                                    `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                    `shop_brand` blob NULL COMMENT '店铺商标',
                                    `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系地址',
                                    `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
                                    `shop_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺状态；0：正常，1：停业，2：冻结',
                                    `shop_submittal_one` blob NULL COMMENT '相关提交材料1\r\n相关提交材料1',
                                    `shop_submittal_two` blob NULL COMMENT '相关提交材料2',
                                    `shop_submittal_three` blob NULL COMMENT '相关提交材料3',
                                    PRIMARY KEY (`shop_id`) USING BTREE,
                                    INDEX `shop_fk`(`user_id`) USING BTREE,
                                    CONSTRAINT `shop_fk` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_uri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
-- ----------------------------
-- 商品表：purchasing_product
-- ----------------------------

-- ----------------------------
-- 店铺-商品关系表：shop_product
-- ----------------------------

-- ----------------------------
-- 商品品牌表：purchasing_brand
-- ----------------------------

-- ----------------------------
-- 品牌注册表：brand_register
-- ----------------------------

-- ----------------------------
-- 品牌注册证明材料表：brand_register_materials
-- ----------------------------

-- ----------------------------
-- 品牌-材料关系表：brand_materials
-- ----------------------------

-- ----------------------------
-- 商品类型：product_type
-- ----------------------------

-- ----------------------------
-- 商品规格信息：product_specifications
-- ----------------------------

-- ----------------------------
-- 售后服务表：after_sale_service
-- ----------------------------

-- ----------------------------
-- 仓库信息表:purchasing_warehouse
-- ----------------------------

-- ----------------------------
-- 购物订单表：purchasing_order
-- ----------------------------

-- ----------------------------
-- 商品物流表：purchasing_logistics
-- ----------------------------

-- ----------------------------
-- 物流公司信息：logistics_company
-- ----------------------------

-- ----------------------------
-- 退款信息表：product_return
-- ----------------------------

-- ----------------------------
-- 换货信息表：product_exchange
-- ----------------------------

-- ----------------------------
-- 商品评论表：product_review
-- ----------------------------

-- ----------------------------
-- 代购收入记录表：purchasing_income
-- ----------------------------

-- ----------------------------
-- 收货地址信息表：purchasing_address
-- ----------------------------

-- ----------------------------
-- 购物车信息表：purchasing_trolley
-- ----------------------------