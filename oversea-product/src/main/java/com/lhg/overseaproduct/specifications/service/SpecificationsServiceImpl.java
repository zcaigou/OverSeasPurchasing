package com.lhg.overseaproduct.specifications.service;

import com.lhg.overseaproduct.specifications.domain.Specifications;
import com.lhg.overseaproduct.specifications.mapper.SpecificationsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SpecificationsServiceImpl implements ISpecificationService{

    @Autowired
    private SpecificationsMapper specificationsMapper;


    /**
     * 条件查询商品描述信息
     */
    @Override
    public List<Specifications> selectSpecificationsList(Specifications specifications){
        return specificationsMapper.selectSpecificationsList(specifications);
    }

    /**
     * 根据specificationId查询商品描述信息
     */
    @Override
    public Specifications selectSpecificationsBySpecificationId(String specificationId){
        return specificationsMapper.selectSpecificationsBySpecificationId(specificationId);
    }

    /**
     * 新增商品描述信息
     */
    @Override
    public int insertSpecifications(Specifications specifications){
        specifications.setSpecificationId(UUID.randomUUID().toString());
        return specificationsMapper.insertSpecifications(specifications);
    }

    /**
     * 更改商品描述信息
     */
    @Override
    public int updateSpecifications(Specifications specifications){
        return specificationsMapper.updateSpecifications(specifications);
    }

    /**
     * 根据specificationId删除商品描述信息
     */
    @Override
    public int deleteSpecificationsBySpecificationId(String specificationId){
        return specificationsMapper.deleteSpecificationsBySpecificationId(specificationId);
    }

    /**
     * 根据productId删除商品描述信息
     */
    @Override
    public int deleteSpecificationsByProductId(String productId){
        return specificationsMapper.deleteSpecificationsByProductId(productId);
    }
}
