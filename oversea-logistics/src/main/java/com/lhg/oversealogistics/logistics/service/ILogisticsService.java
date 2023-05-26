package com.lhg.oversealogistics.logistics.service;

import com.lhg.oversealogistics.logistics.domain.Logistics;

import java.util.List;

public interface ILogisticsService {

    /**
     * 条件查询物流信息
     */
    public List<Logistics> selectLogisticsList(Logistics logistics);

    /**
     * 根据logisticsId查询物流信息
     */
    public Logistics selectLogisticsByLogisticsId(String logisticsId);

    /**
     * 新增物流信息
     */
    public int insertLogistics(Logistics logistics);

    /**
     * 更改物流信息
     */
    public int updateLogistics(Logistics logistics);

    /**
     *  根据logisticsId删除物流信息
     */
    public int deleteLogisticsByLogisticsId(String logisticsId);
}
