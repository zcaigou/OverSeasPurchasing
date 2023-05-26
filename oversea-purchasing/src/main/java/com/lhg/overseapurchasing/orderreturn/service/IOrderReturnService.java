package com.lhg.overseapurchasing.orderreturn.service;

import com.lhg.overseapurchasing.orderreturn.domain.OrderReturn;

import java.util.List;

public interface IOrderReturnService {
    /**
     * 条件查询退货信息
     */
    public List<OrderReturn> selectOrderReturnList(OrderReturn orderReturn);

    /**
     * 根据returnId查询退货信息
     */
    public OrderReturn selectOrderReturnByReturnId(String returnId);


    /**
     *新增退货信息
     */
    public int insertOrderReturn(OrderReturn orderReturn);
    /**
     *更改退货信息
     */
    public int updateOrderReturn(OrderReturn orderReturn);

    /**
     * 根据returnId删除退货信息
     */
    public int deleteOrderReturnByReturnId(String returnId);
}
