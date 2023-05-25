package com.lhg.overseaproduct.brand.mapper;

import com.lhg.overseaproduct.brand.domain.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BrandMapper {

    /**
     * 条件查询品牌信息
     */
    public List<Brand> selectBrandList(Brand brand);

    /**
     * 根据brandId查询品牌信息
     */
    public Brand selectBrandByBrandId(String brandId);

    /**
     * 新增品牌信息
     */
    public int insertBrand(Brand brand);

    /**
     * 更改品牌信息
     */
    public int updateBrand(Brand brand);

    /**
     * 根据brandId删除品牌信息
     */
    public int deleteBrandByBrandId(String brandId);
}
