package com.lhg.overseapurchasing.orderreturn.mapper;

import com.lhg.overseapurchasing.orderreturn.domain.OrderReturn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderReturnMapper {

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
