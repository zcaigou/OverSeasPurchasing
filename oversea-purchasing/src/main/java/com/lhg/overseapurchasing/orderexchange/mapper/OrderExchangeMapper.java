package com.lhg.overseapurchasing.orderexchange.mapper;

import com.lhg.overseapurchasing.orderexchange.domain.OrderExchange;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderExchangeMapper {

    /**
     * 条件查询换货信息
     */
    public List<OrderExchange> selectOrderExchangeList(OrderExchange orderExchange);

    /**
     * 根据exchangeId查询换货信息
     */
    public OrderExchange selectOrderExchangeByExchangeId(String exchangeId);


    /**
     *新增换货信息
     */
    public int insertOrderExchange(OrderExchange orderExchange);
    /**
     *更改换货信息
     */
    public int updateOrderExchange(OrderExchange orderExchange);

    /**
     * 根据exchangeId删除换货信息
     */
    public int deleteOrderExchangeByExchangeId(String exchangeId);


}
