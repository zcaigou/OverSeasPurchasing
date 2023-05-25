package com.lhg.overseapurchasing.order.service;

import com.lhg.overseapurchasing.order.domain.Order;

import java.util.List;

public interface IOrderService {

    /**
     * 条件查询订单信息
     */
    public List<Order> selectOrderList(Order order);

    /**
     * 根据orderId查询订单信息
     */
    public Order selectOrderByOrderId(String orderId);

    /**
     * 新增订单信息
     */
    public int insertOrder(Order order);

    /**
     * 更改订单信息
     */
    public int updateOrder(Order order);

    /**
     * 根据orderId删除订单信息
     */
    public int deleteOrderByOrderId(String orderId);
}
