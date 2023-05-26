package com.lhg.overseapurchasing.orderexchange.service;

import com.lhg.overseapurchasing.orderexchange.domain.OrderExchange;
import com.lhg.overseapurchasing.orderexchange.mapper.OrderExchangeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderExchangeServiceImpl implements IOrderExchangeService{
    @Autowired
    private OrderExchangeMapper orderExchangeMapper;

    /**
     * 条件查询换货信息
     */
    @Override
    public List<OrderExchange> selectOrderExchangeList(OrderExchange orderExchange){
        return orderExchangeMapper.selectOrderExchangeList(orderExchange);
    }

    /**
     * 根据exchangeId查询换货信息
     */
    @Override
    public OrderExchange selectOrderExchangeByExchangeId(String exchangeId){
        return orderExchangeMapper.selectOrderExchangeByExchangeId(exchangeId);
    }


    /**
     *新增换货信息
     */
    @Override
    public int insertOrderExchange(OrderExchange orderExchange){
        return orderExchangeMapper.insertOrderExchange(orderExchange);
    }
    /**
     *更改换货信息
     */
    @Override
    public int updateOrderExchange(OrderExchange orderExchange){
        return orderExchangeMapper.updateOrderExchange(orderExchange);
    }

    /**
     * 根据exchangeId删除换货信息
     */
    @Override
    public int deleteOrderExchangeByExchangeId(String exchangeId){

        return orderExchangeMapper.deleteOrderExchangeByExchangeId(exchangeId);
    }

}
