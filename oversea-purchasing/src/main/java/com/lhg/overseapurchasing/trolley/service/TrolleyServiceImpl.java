package com.lhg.overseapurchasing.trolley.service;

import com.lhg.overseapurchasing.trolley.domain.Trolley;
import com.lhg.overseapurchasing.trolley.mapper.TrolleyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrolleyServiceImpl implements ITrolleyService{
    
    @Autowired
    private TrolleyMapper trolleyMapper;

    /**
     * 条件查询购物车中商品信息
     */
    public List<Trolley> selectTrolleyList(Trolley trolley){
        return  trolleyMapper.selectTrolleyList(trolley);
    }

    /**
     * 查询购物车中商品信息
     */
    @Override
    public Trolley selectTrolleyOne(Trolley trolley){
        return trolleyMapper.selectTrolleyOne(trolley);
    }

    /**
     *  新增购物车中商品信息
     */
    @Override
    public int insertTrolley(Trolley trolley){
        return trolleyMapper.insertTrolley(trolley);
    }

    /**
     *  更改购物车中商品信息
     */
    @Override
    public int updateTrolley(Trolley trolley){
        return trolleyMapper.updateTrolley(trolley);
    }

    /**
     *  删除购物车中商品信息
     */
    @Override
    public int deleteTrolley(Trolley trolley){
        return trolleyMapper.deleteTrolley(trolley);
    }
}
