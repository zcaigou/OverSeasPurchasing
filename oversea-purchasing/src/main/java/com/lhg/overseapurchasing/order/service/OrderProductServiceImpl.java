package com.lhg.overseapurchasing.order.service;

import com.lhg.overseapurchasing.order.domain.OrderProduct;
import com.lhg.overseapurchasing.order.mapper.OrderProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductServiceImpl implements IOrderProductService{
    
    @Autowired
    private OrderProductMapper orderProductMapper;

    /**
     * 条件查询订单商品关系
     */
    @Override
    public List<OrderProduct> selectOrderProductlist(OrderProduct orderProduct){
        return orderProductMapper.selectOrderProductlist(orderProduct);
    }

    /**
     * 根据id查询订单商品关系
     */
    @Override
    public OrderProduct selectOrderProductById(int id){
        return orderProductMapper.selectOrderProductById(id);
    }

    /**
     * 新增订单商品关系
     */
    @Override
    public int insertOrderProduct(OrderProduct orderProduct){
        return orderProductMapper.insertOrderProduct(orderProduct);
    }

    /**
     * 更改订单商品关系
     */
    @Override
    public int udateOrderProduct(OrderProduct orderProduct){
        return orderProductMapper.udateOrderProduct(orderProduct);
    }

    /**
     * 根据id删除订单商品关系
     */
    @Override
    public int deleteOrderProductById(int id){
        return orderProductMapper.deleteOrderProductById(id);
    }
}
