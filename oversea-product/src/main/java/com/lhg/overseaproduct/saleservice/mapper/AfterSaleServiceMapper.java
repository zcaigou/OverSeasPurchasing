package com.lhg.overseaproduct.saleservice.mapper;

import com.lhg.overseaproduct.saleservice.domain.AfterSaleService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AfterSaleServiceMapper {

    /**
     * 条件查询售后服务信息
     */
    public List<AfterSaleService> selectAfterSaleServiceList(AfterSaleService afterSaleService);

    /**
     * 根据serviceId查询售后服务信息
     */
    public AfterSaleService selectAfterSaleServiceByServiceId(String serviceId);

    /**
     * 新增售后服务信息
     */
    public int insertAfterSaleService(AfterSaleService afterSaleService);

    /**
     * 更改售后服务信息
     */
    public int updateAfterSaleService(AfterSaleService afterSaleService);

    /**
     * 根据serviceId删除售后服务信息
     */
    public int deleteAfterSaleServiceByServiceId(String serviceId);


}
