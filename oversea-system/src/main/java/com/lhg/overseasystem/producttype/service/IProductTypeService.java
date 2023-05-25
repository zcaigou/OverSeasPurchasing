package com.lhg.overseasystem.producttype.service;

import com.lhg.overseasystem.producttype.domain.ProductType;

import java.util.List;

public interface IProductTypeService {


    /**
     * 条件查询商品类型信息
     */
    public List<ProductType> selectProductTypeList(ProductType productType);

    /**
     * 根据typeId查询商品类型信息
     */
    public ProductType selectProductTypeByTypeId(String typeId);

    /**
     * 新增商品类型信息
     */
    public int insertProductType(ProductType productType);

    /**
     * 更改商品类型信息
     */
    public int updateProductType(ProductType productType);

    /**
     * 根据typeId删除商品类型信息
     */
    public int deleteProductTypeByTypeId(String typeId);
}
