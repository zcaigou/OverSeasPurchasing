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
                             PRIMARY KEY (`user_id`) USING BTREE,
                             INDEX `user_uri`(`user_uri`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统用户表' ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '系统角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 用户-角色关系表：user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
                              `user_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
                              `role_id` int(0) NOT NULL COMMENT '角色id',
                              PRIMARY KEY (`role_id`, `user_uri`) USING BTREE,
                              INDEX `role_userid_fk`(`user_uri`) USING BTREE,
                              CONSTRAINT `role_user_roleid_fk` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`role_id`) ON DELETE CASCADE ON UPDATE CASCADE,
                              CONSTRAINT `role_userid_fk` FOREIGN KEY (`user_uri`) REFERENCES `sys_user` (`user_uri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户—角色关联表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 实名认证表：user_certification
-- ----------------------------
DROP TABLE IF EXISTS `user_certification`;
CREATE TABLE `user_certification`  (
                                       `user_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户标识',
                                       `cname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '真实姓名',
                                       `id_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '证件类型',
                                       `id_number` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证号',
                                       `id_card_front` blob NULL COMMENT '身份证正面',
                                       `id_card_reverse` blob NULL COMMENT '身份证反面',
                                       `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                       PRIMARY KEY (`user_uri`) USING BTREE,
                                       CONSTRAINT `cer_useruri_pk` FOREIGN KEY (`user_uri`) REFERENCES `sys_user` (`user_uri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '实名认证表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 代购店铺表：purchasing_shop
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_shop`;
CREATE TABLE `purchasing_shop`  (
                                    `shop_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺id',
                                    `shop_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺名称',
                                    `user_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店主id',
                                    `shop_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺类型',
                                    `shop_brand` blob NULL COMMENT '店铺商标',
                                    `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系地址',
                                    `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '联系电话',
                                    `shop_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺状态；0：正常，1：停业，2：冻结',
                                    `shop_submittal_one` blob NULL COMMENT '相关提交材料1',
                                    `shop_submittal_two` blob NULL COMMENT '相关提交材料2',
                                    `shop_submittal_three` blob NULL COMMENT '相关提交材料3',
                                    `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者',
                                    `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                    `update_by` datetime(0) NULL DEFAULT NULL COMMENT '更新者',
                                    `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                    `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                    PRIMARY KEY (`shop_id`) USING BTREE,
                                    INDEX `shop_fk`(`user_uri`) USING BTREE,
                                    CONSTRAINT `shop_fk` FOREIGN KEY (`user_uri`) REFERENCES `sys_user` (`user_uri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '代购店铺表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 商品表：purchasing_product
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_product`;
CREATE TABLE `purchasing_product`  (
                                       `product_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品Id',
                                       `product_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品名称',
                                       `product_detail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品详细描述',
                                       `product_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品类型',
                                       `brand_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '品牌id',
                                       `article_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '货号',
                                       `producer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '生产地',
                                       `shop_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺商品类型',
                                       `listing_time` bigint(0) NOT NULL COMMENT '上架时间：0：立即上架；string定时上架；2放入仓库',
                                       `product_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品状态；0：出售中:1：下架',
                                       `is_express_fee` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '是否包邮；1：不包邮；0：包邮',
                                       `express_fee` double(255, 0) NULL DEFAULT NULL COMMENT '邮费',
                                       `shop_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属店铺id',
                                       `service_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '售后服务',
                                       `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                       `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                       `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                       PRIMARY KEY (`product_id`) USING BTREE,
                                       INDEX `product_brandid_fk`(`brand_id`) USING BTREE,
                                       INDEX `product_shopid_fk`(`shop_id`) USING BTREE,
                                       INDEX `product_serviceid_fk`(`service_id`) USING BTREE,
                                       INDEX `product_typeid_fk`(`product_type`) USING BTREE,
                                       CONSTRAINT `product_brandid_fk` FOREIGN KEY (`brand_id`) REFERENCES `purchasing_brand` (`brand_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                       CONSTRAINT `product_serviceid_fk` FOREIGN KEY (`service_id`) REFERENCES `after_sale_service` (`service_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                       CONSTRAINT `product_shopid_fk` FOREIGN KEY (`shop_id`) REFERENCES `purchasing_shop` (`shop_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                       CONSTRAINT `product_typeid_fk` FOREIGN KEY (`product_type`) REFERENCES `product_type` (`type_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 商品展示图表：product_diagram
-- ----------------------------
DROP TABLE IF EXISTS `product_diagram`;
CREATE TABLE `product_diagram`  (
                                    `product_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
                                    `diagram_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品图标识',
                                    `diagram_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '0：图；1；视频',
                                    `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '主图；其他图；详情；尺码；其他',
                                    `diagram_info` blob NOT NULL COMMENT '商品图详细信息',
                                    PRIMARY KEY (`diagram_id`) USING BTREE,
                                    INDEX `diagram_productid_fk`(`product_id`) USING BTREE,
                                    CONSTRAINT `diagram_productid_fk` FOREIGN KEY (`product_id`) REFERENCES `purchasing_product` (`product_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品展示图' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 商品品牌表：purchasing_brand
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_brand`;
CREATE TABLE `purchasing_brand`  (
                                     `brand_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌标识',
                                     `brand_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌名称',
                                     `brand_owner` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌所属者',
                                     `register_no` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商标注册号',
                                     `brand_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属类目',
                                     `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                     `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
                                     `update_by` datetime(0) NULL DEFAULT NULL COMMENT '更新者',
                                     `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                     `register_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '注册状态；0：注册成功，1：注册失败；2：待处理',
                                     `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                     PRIMARY KEY (`brand_id`) USING BTREE,
                                     INDEX `brand_typeid`(`brand_type`) USING BTREE,
                                     CONSTRAINT `brand_typeid` FOREIGN KEY (`brand_type`) REFERENCES `product_type` (`type_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品品牌表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 品牌注册证明材料表：brand_register_materials
-- ----------------------------
DROP TABLE IF EXISTS `brand_register_materials`;
CREATE TABLE `brand_register_materials`  (
                                             `material_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '材料id',
                                             `brand_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '品牌id',
                                             `submit_material` blob NOT NULL COMMENT '注册材料',
                                             PRIMARY KEY (`material_id`, `brand_id`) USING BTREE,
                                             INDEX `material_brandid`(`brand_id`) USING BTREE,
                                             CONSTRAINT `material_brandid` FOREIGN KEY (`brand_id`) REFERENCES `purchasing_brand` (`brand_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '品牌注册材料表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 商品类型表：product_type
-- ----------------------------
DROP TABLE IF EXISTS `product_type`;
CREATE TABLE `product_type`  (
                                 `type_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品分类标识',
                                 `type_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品分类名称',
                                 `type_pid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品分类父标识',
                                 `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                 `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
                                 `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                 `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者',
                                 `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                 PRIMARY KEY (`type_id`) USING BTREE,
                                 INDEX `pid_fk`(`type_pid`) USING BTREE,
                                 CONSTRAINT `pid_fk` FOREIGN KEY (`type_pid`) REFERENCES `product_type` (`type_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品类型表' ROW_FORMAT = Dynamic;


-- ----------------------------
-- 商品规格信息表：product_specifications
-- ----------------------------
DROP TABLE IF EXISTS `product_specifications`;
CREATE TABLE `product_specifications`  (
                                           `specification_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '规格标识',
                                           `product_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
                                           `product_specification` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品规格描述',
                                           `product_num` int(0) NOT NULL COMMENT '商品数量',
                                           `product_image` blob NULL COMMENT '商品图片',
                                           `product_price` double(10, 2) NOT NULL COMMENT '商品价格',
                                           `product_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品状态；0：仓库缺货；1：正常；2：售罄 3：库存告警',
                                           `product_remain_warn` int(0) NULL DEFAULT NULL COMMENT '库存告警值',
                                           `product_inventory` int(0) NULL DEFAULT NULL COMMENT '商品库存数量',
                                           `on_sale` int(0) NULL DEFAULT NULL COMMENT '正在出售数量',
                                           `purchase_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '采购地',
                                           `warehouse_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所在仓库',
                                           `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
                                           `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建者',
                                           `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                           `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '更新者',
                                           PRIMARY KEY (`specification_id`) USING BTREE,
                                           INDEX `spec_productid_fk`(`product_id`) USING BTREE,
                                           INDEX `spec_warehouseid_fk`(`warehouse_id`) USING BTREE,
                                           INDEX `product_specification`(`product_specification`) USING BTREE,
                                           CONSTRAINT `spec_productid_fk` FOREIGN KEY (`product_id`) REFERENCES `purchasing_product` (`product_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                           CONSTRAINT `spec_warehouseid_fk` FOREIGN KEY (`warehouse_id`) REFERENCES `purchasing_warehouse` (`warehouse_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品规格信息表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 售后服务表：after_sale_service
-- ----------------------------
DROP TABLE IF EXISTS `after_sale_service`;
CREATE TABLE `after_sale_service`  (
                                       `service_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '售后服务标识',
                                       `service_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '售后服务名称',
                                       `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                       PRIMARY KEY (`service_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '售后服务表' ROW_FORMAT = Dynamic;


-- ----------------------------
-- 仓库信息表:purchasing_warehouse
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_warehouse`;
CREATE TABLE `purchasing_warehouse`  (
                                         `warehouse_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仓库标识',
                                         `warehouse_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仓库名称',
                                         `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '仓库地址',
                                         `type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '仓库类型',
                                         `shop_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属店铺',
                                         `owner_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '负责人',
                                         `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系电话',
                                         `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                         `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                         `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                         PRIMARY KEY (`warehouse_id`) USING BTREE,
                                         INDEX `warehouse_shopid_fk`(`shop_id`) USING BTREE,
                                         CONSTRAINT `warehouse_shopid_fk` FOREIGN KEY (`shop_id`) REFERENCES `purchasing_shop` (`shop_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '店铺仓库表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
-- ----------------------------
-- 购物订单表：purchasing_order
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_order`;
CREATE TABLE `purchasing_order`  (
                                     `order_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单id',
                                     `user_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '下单用户id',
                                     `shop_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所属店铺',
                                     `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货名称',
                                     `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货地址',
                                     `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收货电话',
                                     `express_fee` double(255, 2) NULL DEFAULT NULL COMMENT '快递费',
                                     `coupon` double(255, 2) NULL DEFAULT NULL COMMENT '优惠',
                                     `total_price` double(255, 2) NOT NULL COMMENT '总价',
                                     `order_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
                                     `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                     `pay_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付流水号',
                                     `pay_time` datetime(0) NULL DEFAULT NULL COMMENT '支付时间',
                                     `shipments_time` datetime(0) NULL DEFAULT NULL COMMENT '发货时间',
                                     `deal_time` datetime(0) NULL DEFAULT NULL COMMENT '成交时间',
                                     `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                     PRIMARY KEY (`order_id`) USING BTREE,
                                     INDEX `order_userid_fk`(`user_uri`) USING BTREE,
                                     INDEX `order_shopi_fk`(`shop_id`) USING BTREE,
                                     INDEX `order_payid`(`pay_id`) USING BTREE,
                                     CONSTRAINT `order_payid` FOREIGN KEY (`pay_id`) REFERENCES `purchasing_income` (`pay_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                     CONSTRAINT `order_shopi_fk` FOREIGN KEY (`shop_id`) REFERENCES `purchasing_shop` (`shop_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                     CONSTRAINT `order_userid_fk` FOREIGN KEY (`user_uri`) REFERENCES `sys_user` (`user_uri`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物订单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 订单商品关联表：order_product
-- ----------------------------
DROP TABLE IF EXISTS `order_product`;
CREATE TABLE `order_product`  (
                                  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '关系标识',
                                  `order_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
                                  `product_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
                                  `specifications_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品规格标识',
                                  `sum` int(0) NULL DEFAULT NULL COMMENT '数量',
                                  `price` double(10, 2) NULL DEFAULT NULL COMMENT '单价',
                                  `state` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '该订单商品状态；退货；换货；已收到退货；已发出；仅退款',
                                  `logistics_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '物流单号',
                                  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
                                  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                  PRIMARY KEY (`id`) USING BTREE,
                                  INDEX `orderproduct_orderid_fk`(`order_id`) USING BTREE,
                                  INDEX `orderproduct_productid_fk`(`product_id`) USING BTREE,
                                  INDEX `orderproduct_spec_fk`(`specifications_id`) USING BTREE,
                                  INDEX `orderproduct_logisticsid`(`logistics_id`) USING BTREE,
                                  CONSTRAINT `orderproduct_logisticsid` FOREIGN KEY (`logistics_id`) REFERENCES `purchasing_logistics` (`logistics_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                  CONSTRAINT `orderproduct_orderid_fk` FOREIGN KEY (`order_id`) REFERENCES `purchasing_order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                  CONSTRAINT `orderproduct_productid_fk` FOREIGN KEY (`product_id`) REFERENCES `purchasing_product` (`product_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                  CONSTRAINT `orderproduct_spec_fk` FOREIGN KEY (`specifications_id`) REFERENCES `product_specifications` (`specification_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单—商品关系表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 商品物流表：purchasing_logistics
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_logistics`;
CREATE TABLE `purchasing_logistics`  (
                                         `logistics_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物流编号',
                                         `logistics_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物流状态；0：正在揽收，1：已被揽收;2：正在运输3：等待配送4：延迟配送5：配送完成',
                                         `from_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发件人',
                                         `from_telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发货人手机号',
                                         `from_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '发货地址',
                                         `to_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收件地址',
                                         `to_telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收件人手机号',
                                         `to_username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收件人',
                                         `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                         `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                         `collectors_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '揽件人',
                                         `deliverer_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配送者',
                                         `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '途径快递点',
                                         `company_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物流公司标识',
                                         `logistic_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '0:订单发货；1：退货，买家；2：换货买家；3：换货卖家',
                                         PRIMARY KEY (`logistics_id`) USING BTREE,
                                         INDEX `logis_couserid`(`collectors_id`) USING BTREE,
                                         INDEX `logis_deluserid`(`deliverer_id`) USING BTREE,
                                         INDEX `logis_companyid`(`company_id`) USING BTREE,
                                         CONSTRAINT `logis_companyid` FOREIGN KEY (`company_id`) REFERENCES `logistics_company` (`company_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                         CONSTRAINT `logis_couserid` FOREIGN KEY (`collectors_id`) REFERENCES `logistics_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                         CONSTRAINT `logis_deluserid` FOREIGN KEY (`deliverer_id`) REFERENCES `logistics_user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '物流信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 物流公司信息：logistics_company
-- ----------------------------
DROP TABLE IF EXISTS `logistics_company`;
CREATE TABLE `logistics_company`  (
                                      `company_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物流公司标识',
                                      `company_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '物流公司名称',
                                      PRIMARY KEY (`company_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '物流公司信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 物流人员信息表：logistics_user
-- ----------------------------
DROP TABLE IF EXISTS `logistics_user`;
CREATE TABLE `logistics_user`  (
                                   `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工号',
                                   `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '员工名称',
                                   `company_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所在公司',
                                   `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系电话',
                                   `region` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '负责地区',
                                   PRIMARY KEY (`user_id`) USING BTREE,
                                   INDEX `logistics_companyid`(`company_id`) USING BTREE,
                                   CONSTRAINT `logistics_companyid` FOREIGN KEY (`company_id`) REFERENCES `logistics_company` (`company_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '物流人员信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 收货地址信息表：purchasing_address
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_address`;
CREATE TABLE `purchasing_address`  (
                                       `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '标识',
                                       `user_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户uri',
                                       `country` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '国家',
                                       `province` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '省',
                                       `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '市',
                                       `area` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '区县',
                                       `street` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '街道',
                                       `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '详细地址',
                                       `zip_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮编',
                                       `telephone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '手机号',
                                       `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
                                       `is_default` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1' COMMENT '是否默认地址；0：是，1：不是',
                                       `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '1' COMMENT '0：买家地址:1：店铺地址',
                                       `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
                                       `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更改时间',
                                       PRIMARY KEY (`id`) USING BTREE,
                                       INDEX `address_userid`(`user_uri`) USING BTREE,
                                       CONSTRAINT `address_userid` FOREIGN KEY (`user_uri`) REFERENCES `sys_user` (`user_uri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收货地址信息表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

-- ----------------------------
-- 退款信息表：product_return
-- ----------------------------
DROP TABLE IF EXISTS `product_return`;
CREATE TABLE `product_return`  (
                                   `return_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '退货申请标识',
                                   `specification_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单_商品_规格id',
                                   `order_price` decimal(10, 2) NOT NULL COMMENT '订单价格',
                                   `return_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '退款价格',
                                   `refund_reson` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '退货原因',
                                   `from_logistics` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '退货物流',
                                   `return_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '退货类型；0：退货退款，1：仅退款',
                                   `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态',
                                   `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                   `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
                                   `update_time` datetime(0) NULL DEFAULT NULL COMMENT '通过时间',
                                   `update_by` datetime(0) NULL DEFAULT NULL COMMENT '通过者',
                                   `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                   PRIMARY KEY (`return_id`) USING BTREE,
                                   INDEX `return_id_fk`(`specification_id`) USING BTREE,
                                   INDEX `return_logisticsid_fk`(`from_logistics`) USING BTREE,
                                   CONSTRAINT `return_id_fk` FOREIGN KEY (`specification_id`) REFERENCES `product_specifications` (`specification_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                   CONSTRAINT `return_logisticsid_fk` FOREIGN KEY (`from_logistics`) REFERENCES `purchasing_logistics` (`logistics_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品退款信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 换货信息表：product_exchange
-- ----------------------------
DROP TABLE IF EXISTS `product_exchange`;
CREATE TABLE `product_exchange`  (
                                     `exchange_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '换货标识',
                                     `specification_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单_商品_规格_id',
                                     `order_price` decimal(10, 2) NOT NULL COMMENT '订单价格',
                                     `diff_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '差价',
                                     `exchange_reson` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '换货原因+备注',
                                     `from_logistics` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '寄回物流',
                                     `to_logistics` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '换货寄出物流',
                                     `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '状态',
                                     `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                     `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '创建者',
                                     `update_time` datetime(0) NULL DEFAULT NULL COMMENT '处理时间',
                                     `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '处理者',
                                     `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                     PRIMARY KEY (`exchange_id`) USING BTREE,
                                     INDEX `exchange_specid`(`specification_id`) USING BTREE,
                                     INDEX `exchange_logisticid`(`from_logistics`) USING BTREE,
                                     INDEX `exchange_tologisticid`(`to_logistics`) USING BTREE,
                                     CONSTRAINT `exchange_logisticid` FOREIGN KEY (`from_logistics`) REFERENCES `purchasing_logistics` (`logistics_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                     CONSTRAINT `exchange_specid` FOREIGN KEY (`specification_id`) REFERENCES `product_specifications` (`specification_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                     CONSTRAINT `exchange_tologisticid` FOREIGN KEY (`to_logistics`) REFERENCES `purchasing_logistics` (`logistics_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品换货信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 商品评论表：product_review
-- ----------------------------
DROP TABLE IF EXISTS `product_review`;
CREATE TABLE `product_review`  (
                                   `review_id` int(0) NOT NULL COMMENT '评价唯一标识',
                                   `order_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单id',
                                   `product_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
                                   `specification_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '规格id',
                                   `review` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评价内容',
                                   `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '0：好评；1：差评；',
                                   `create_time` datetime(0) NOT NULL COMMENT '评论时间',
                                   `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论者',
                                   `reply_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '回复评论',
                                   `update_time` datetime(0) NULL DEFAULT NULL COMMENT '回复时间',
                                   `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '回复者',
                                   `is_image` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '0：不带图评论；1：带图评论',
                                   PRIMARY KEY (`review_id`) USING BTREE,
                                   INDEX `review_orderid`(`order_id`) USING BTREE,
                                   INDEX `review_productid`(`product_id`) USING BTREE,
                                   INDEX `review_specid`(`specification_id`) USING BTREE,
                                   CONSTRAINT `review_orderid` FOREIGN KEY (`order_id`) REFERENCES `purchasing_order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                   CONSTRAINT `review_productid` FOREIGN KEY (`product_id`) REFERENCES `purchasing_product` (`product_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                   CONSTRAINT `review_specid` FOREIGN KEY (`specification_id`) REFERENCES `product_specifications` (`product_specification`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品评价表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 商品评论图：review_image
-- ----------------------------
DROP TABLE IF EXISTS `review_image`;
CREATE TABLE `review_image`  (
                                 `image_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '图片标识',
                                 `image_content` blob NOT NULL COMMENT '图片内容',
                                 `image_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '0:图片；1：视频',
                                 `review_id` int(0) NOT NULL COMMENT '评论id',
                                 `review_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '0：评论；1：回复',
                                 PRIMARY KEY (`image_id`) USING BTREE,
                                 INDEX `image_reviewid`(`review_id`) USING BTREE,
                                 CONSTRAINT `image_reviewid` FOREIGN KEY (`review_id`) REFERENCES `product_review` (`review_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品评论图表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 代购收入记录表：purchasing_income
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_income`;
CREATE TABLE `purchasing_income`  (
                                      `pay_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '支付流水号',
                                      `pay_type` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '支付类型：0：收入；1：支出',
                                      `order_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单id',
                                      `money` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '金额',
                                      `pay_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付状态；',
                                      `from_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '来源账户',
                                      `from_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '来源人',
                                      `to_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '目的账户',
                                      `to_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '目标人\r\n',
                                      `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                      `update_time` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
                                      `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
                                      PRIMARY KEY (`pay_id`) USING BTREE,
                                      INDEX `income_orderid_fk`(`order_id`) USING BTREE,
                                      INDEX `income_fromaccount_fk`(`from_account`) USING BTREE,
                                      INDEX `income_toaccount_fk`(`to_account`) USING BTREE,
                                      INDEX `pay_id`(`pay_id`) USING BTREE,
                                      INDEX `income_fromuserid_fk`(`from_by`) USING BTREE,
                                      INDEX `income_touserid_fk`(`to_by`) USING BTREE,
                                      CONSTRAINT `income_fromaccount_fk` FOREIGN KEY (`from_account`) REFERENCES `user_account` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                      CONSTRAINT `income_fromuserid_fk` FOREIGN KEY (`from_by`) REFERENCES `sys_user` (`user_uri`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                      CONSTRAINT `income_orderid_fk` FOREIGN KEY (`order_id`) REFERENCES `purchasing_order` (`order_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                      CONSTRAINT `income_toaccount_fk` FOREIGN KEY (`to_account`) REFERENCES `user_account` (`account_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                      CONSTRAINT `income_touserid_fk` FOREIGN KEY (`to_by`) REFERENCES `sys_user` (`user_uri`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '代购流水记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 个人账户：user_account
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account`  (
                                 `account_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '账户id',
                                 `user_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户uri',
                                 `account_money` double(10, 2) NOT NULL DEFAULT 0.00 COMMENT '余额',
                                 `real_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账户持有者名称',
                                 PRIMARY KEY (`account_id`, `user_uri`) USING BTREE,
                                 INDEX `account_userid_fk`(`user_uri`) USING BTREE,
                                 INDEX `account_id`(`account_id`) USING BTREE,
                                 CONSTRAINT `account_userid_fk` FOREIGN KEY (`user_uri`) REFERENCES `sys_user` (`user_uri`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '个人账户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- 购物车信息表：purchasing_trolley
-- ----------------------------
DROP TABLE IF EXISTS `purchasing_trolley`;
CREATE TABLE `purchasing_trolley`  (
                                       `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户标识',
                                       `shop_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '店铺id',
                                       `product_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品id',
                                       `specifications_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '商品规格标识',
                                       `sum` int(0) NULL DEFAULT NULL COMMENT '数量',
                                       `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
                                       `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
                                       PRIMARY KEY (`product_id`, `user_id`, `shop_id`, `specifications_id`) USING BTREE,
                                       INDEX `trolley_useruri_fk`(`user_id`) USING BTREE,
                                       INDEX `trolley_shopid_fk`(`shop_id`) USING BTREE,
                                       INDEX `trolley_specid_fk`(`specifications_id`) USING BTREE,
                                       CONSTRAINT `trolley_productid_fk` FOREIGN KEY (`product_id`) REFERENCES `purchasing_product` (`product_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                       CONSTRAINT `trolley_shopid_fk` FOREIGN KEY (`shop_id`) REFERENCES `purchasing_shop` (`shop_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                       CONSTRAINT `trolley_specid_fk` FOREIGN KEY (`specifications_id`) REFERENCES `product_specifications` (`specification_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
                                       CONSTRAINT `trolley_useruri_fk` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`user_uri`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车信息表' ROW_FORMAT = Dynamic;