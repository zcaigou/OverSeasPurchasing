package com.lhg.oversealogistics.logistics.service;

import com.lhg.oversealogistics.logistics.domain.Logistics;
import com.lhg.oversealogistics.logistics.mapper.LogisticsMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public class LogisticsServiceImpl implements ILogisticsService{

    @Autowired
    private LogisticsMapper logisticsMapper;

    /**
     * 条件查询物流信息
     */
    @Override
    public List<Logistics> selectLogisticsList(Logistics logistics){
        return logisticsMapper.selectLogisticsList(logistics);
    }

    /**
     * 根据logisticsId查询物流信息
     */
    @Override
    public Logistics selectLogisticsByLogisticsId(String logisticsId){
        return logisticsMapper.selectLogisticsByLogisticsId(logisticsId);
    }

    /**
     * 新增物流信息
     */
    @Override
    public int insertLogistics(Logistics logistics){
        return logisticsMapper.insertLogistics(logistics);
    }

    /**
     * 更改物流信息
     */
    @Override
    public int updateLogistics(Logistics logistics){
        return logisticsMapper.updateLogistics(logistics);
    }

    /**
     *  根据logisticsId删除物流信息
     */
    @Override
    public int deleteLogisticsByLogisticsId(String logisticsId){
        return logisticsMapper.deleteLogisticsByLogisticsId(logisticsId);
    }

}
