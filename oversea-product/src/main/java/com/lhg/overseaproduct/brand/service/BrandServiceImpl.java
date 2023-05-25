package com.lhg.overseaproduct.brand.service;

import com.lhg.overseaproduct.brand.domain.Brand;
import com.lhg.overseaproduct.brand.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BrandServiceImpl implements IBrandService{

    @Autowired
    private BrandMapper brandMapper;

    /**
     * 条件查询品牌信息
     */
    @Override
    public List<Brand> selectBrandList(Brand brand){
        return brandMapper.selectBrandList(brand);
    }

    /**
     * 根据brandId查询品牌信息
     */
    @Override
    public Brand selectBrandByBrandId(String brandId){
        return brandMapper.selectBrandByBrandId(brandId);
    }

    /**
     * 新增品牌信息
     */
    @Override
    public int insertBrand(Brand brand){
        brand.setBrandId(UUID.randomUUID().toString());
        return brandMapper.insertBrand(brand);
    }

    /**
     * 更改品牌信息
     */
    @Override
    public int updateBrand(Brand brand){
        return brandMapper.updateBrand(brand);
    }

    /**
     * 根据brandId删除品牌信息
     */
    @Override
    public int deleteBrandByBrandId(String brandId){
        return brandMapper.deleteBrandByBrandId(brandId);
    }
}
