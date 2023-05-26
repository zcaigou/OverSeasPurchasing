package com.lhg.overseapurchasing.trolley.mapper;

import com.lhg.overseapurchasing.trolley.domain.Trolley;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrolleyMapper {

    /**
     * 条件查询购物车中商品信息
     */
    public List<Trolley> selectTrolleyList(Trolley trolley);

    /**
     * 查询购物车中商品信息
     */
    public Trolley selectTrolleyOne(Trolley trolley);

    /**
     *  新增购物车中商品信息
     */
    public int insertTrolley(Trolley trolley);

    /**
     *  更改购物车中商品信息
     */
    public int updateTrolley(Trolley trolley);
    /**
     *  删除购物车中商品信息
     */
    public int deleteTrolley(Trolley trolley);

}
