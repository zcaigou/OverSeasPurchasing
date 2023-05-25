package com.lhg.overseaproduct.specifications.mapper;

import com.lhg.overseaproduct.specifications.domain.Specifications;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SpecificationsMapper {

    /**
     * 条件查询商品描述信息
     */
    public List<Specifications> selectSpecificationsList(Specifications specifications);

    /**
     * 根据specificationId查询商品描述信息
     */
    public Specifications selectSpecificationsBySpecificationId(String specificationId);

    /**
     * 新增商品描述信息
     */
    public int insertSpecifications(Specifications specifications);

    /**
     * 更改商品描述信息
     */
    public int updateSpecifications(Specifications specifications);

    /**
     * 根据specificationId删除商品描述信息
     */
    public int deleteSpecificationsBySpecificationId(String specificationId);

    /**
     * 根据productId删除商品描述信息
     */
    public int deleteSpecificationsByProductId(String productId);
}
