package com.lhg.overseapurchasing.order.service;

import com.lhg.overseapurchasing.order.domain.Order;
import com.lhg.overseapurchasing.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements IOrderService{

    @Autowired
    private OrderMapper orderMapper;


    /**
     * 条件查询订单信息
     */
    @Override
    public List<Order> selectOrderList(Order order){
        return orderMapper.selectOrderList(order);
    }

    /**
     * 根据orderId查询订单信息
     */
    @Override
    public Order selectOrderByOrderId(String orderId){
        return orderMapper.selectOrderByOrderId(orderId);
    }

    /**
     * 新增订单信息
     */
    @Override
    public int insertOrder(Order order){
        return orderMapper.insertOrder(order);
    }

    /**
     * 更改订单信息
     */
    @Override
    public int updateOrder(Order order){
        return orderMapper.updateOrder(order);
    }

    /**
     * 根据orderId删除订单信息
     */
    @Override
    public int deleteOrderByOrderId(String orderId){
        return orderMapper.deleteOrderByOrderId(orderId);
    }
}
