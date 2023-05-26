package com.lhg.overseapurchasing.orderreturn.service;

import com.lhg.overseapurchasing.orderreturn.domain.OrderReturn;
import com.lhg.overseapurchasing.orderreturn.mapper.OrderReturnMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderReturnServiceImpl implements IOrderReturnService{
    
    @Autowired
    private OrderReturnMapper orderReturnMapper;

    /**
     * 条件查询退货信息
     */
    @Override
    public List<OrderReturn> selectOrderReturnList(OrderReturn orderReturn){
        return orderReturnMapper.selectOrderReturnList(orderReturn);
    }

    /**
     * 根据returnId查询退货信息
     */
    @Override
    public OrderReturn selectOrderReturnByReturnId(String returnId){
        return orderReturnMapper.selectOrderReturnByReturnId(returnId);
    }


    /**
     *新增退货信息
     */
    @Override
    public int insertOrderReturn(OrderReturn orderReturn){
        return orderReturnMapper.insertOrderReturn(orderReturn);
    }

    /**
     *更改退货信息
     */
    @Override
    public int updateOrderReturn(OrderReturn orderReturn){
        return orderReturnMapper.updateOrderReturn(orderReturn);
    }

    /**
     * 根据returnId删除退货信息
     */
    @Override
    public int deleteOrderReturnByReturnId(String returnId){
        return orderReturnMapper.deleteOrderReturnByReturnId(returnId);
    }
}
