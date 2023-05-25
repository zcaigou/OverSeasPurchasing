package com.lhg.overseasystem.producttype.service;

import com.lhg.overseasystem.producttype.domain.ProductType;
import com.lhg.overseasystem.producttype.mapper.ProductTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServiceImpl implements IProductTypeService{

    @Autowired
    private ProductTypeMapper productTypeMapper;


    /**
     * 条件查询商品类型信息
     */
    public List<ProductType> selectProductTypeList(ProductType productType){
        return productTypeMapper.selectProductTypeList(productType);
    }

    /**
     * 根据typeId查询商品类型信息
     */
    public ProductType selectProductTypeByTypeId(String typeId){
        return productTypeMapper.selectProductTypeByTypeId(typeId);
    }

    /**
     * 新增商品类型信息
     */
    public int insertProductType(ProductType productType){
        return productTypeMapper.insertProductType(productType);
    }

    /**
     * 更改商品类型信息
     */
    public int updateProductType(ProductType productType){
        return productTypeMapper.updateProductType(productType);
    }

    /**
     * 根据typeId删除商品类型信息
     */
    public int deleteProductTypeByTypeId(String typeId){
        return productTypeMapper.deleteProductTypeByTypeId(typeId);
    }

}
