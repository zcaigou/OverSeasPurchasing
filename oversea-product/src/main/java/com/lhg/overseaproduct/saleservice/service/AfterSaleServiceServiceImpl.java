package com.lhg.overseaproduct.saleservice.service;

import com.lhg.overseaproduct.saleservice.domain.AfterSaleService;
import com.lhg.overseaproduct.saleservice.mapper.AfterSaleServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AfterSaleServiceServiceImpl implements IAfterSaleServiceService{

    @Autowired
    private AfterSaleServiceMapper afterSaleServiceMapper;


    /**
     * 条件查询售后服务信息
     */
    @Override
    public List<AfterSaleService> selectAfterSaleServiceList(AfterSaleService afterSaleService){
        return afterSaleServiceMapper.selectAfterSaleServiceList(afterSaleService);
    }

    /**
     * 根据serviceId查询售后服务信息
     */
    @Override
    public AfterSaleService selectAfterSaleServiceByServiceId(String serviceId){
        return afterSaleServiceMapper.selectAfterSaleServiceByServiceId(serviceId);
    }

    /**
     * 新增售后服务信息
     */
    @Override
    public int insertAfterSaleService(AfterSaleService afterSaleService){
        afterSaleService.setServiceId(UUID.randomUUID().toString());
        return afterSaleServiceMapper.insertAfterSaleService(afterSaleService);
    }

    /**
     * 更改售后服务信息
     */
    @Override
    public int updateAfterSaleService(AfterSaleService afterSaleService){
        return afterSaleServiceMapper.updateAfterSaleService(afterSaleService);
    }

    /**
     * 根据serviceId删除售后服务信息
     */
    @Override
    public int deleteAfterSaleServiceByServiceId(String serviceId){
        return afterSaleServiceMapper.deleteAfterSaleServiceByServiceId(serviceId);
    }
}
