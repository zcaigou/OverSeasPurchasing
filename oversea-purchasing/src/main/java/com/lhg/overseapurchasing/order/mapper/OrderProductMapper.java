package com.lhg.overseapurchasing.order.mapper;

import com.lhg.overseapurchasing.order.domain.OrderProduct;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderProductMapper {

    /**
     * 条件查询订单商品关系
     */
    public List<OrderProduct> selectOrderProductlist(OrderProduct orderProduct);

    /**
     * 根据id查询订单商品关系
     */
    public OrderProduct selectOrderProductById(int id);

    /**
     * 新增订单商品关系
     */
    public int insertOrderProduct(OrderProduct orderProduct);

    /**
     * 更改订单商品关系
     */
    public int udateOrderProduct(OrderProduct orderProduct);

    /**
     * 根据id删除订单商品关系
     */
    public int deleteOrderProductById(int id);
}
