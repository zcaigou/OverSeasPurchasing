package com.lhg.overseaproduct.brand.service;

import com.lhg.overseaproduct.brand.domain.BrandRegisterMaterials;
import com.lhg.overseaproduct.brand.mapper.BrandRegisterMaterialsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BrandRegisterMaterialsServiceImpl implements IBrandRegisterMaterialsService{

    @Autowired
    private BrandRegisterMaterialsMapper brandRegisterMaterialsMapper;

    /**
     * 条件查询注册材料图
     */
    @Override
    public List<BrandRegisterMaterials> selectMaterialsList(BrandRegisterMaterials brandRegisterMaterials){
        return brandRegisterMaterialsMapper.selectMaterialsList(brandRegisterMaterials);
    }

    /**
     * 根据materialId和brandId查询注册材料图
     */
    @Override
    public BrandRegisterMaterials selectByMaterialIdAndBrandId(String materialId, String brandId){
        return brandRegisterMaterialsMapper.selectByMaterialIdAndBrandId(materialId, brandId);
    }

    /**
     * 新增注册材料图
     */
    @Override
    public int insertMaterials(BrandRegisterMaterials brandRegisterMaterials){
        brandRegisterMaterials.setMaterialId(UUID.randomUUID().toString());
        return brandRegisterMaterialsMapper.insertMaterials(brandRegisterMaterials);
    }

    /**
     * 根据materialId和brandId删除注册材料图
     */
    @Override
    public int deleteByMaterialIdAndBrandId( String materialId, String brandId){
        return brandRegisterMaterialsMapper.deleteByMaterialIdAndBrandId(materialId, brandId);
    }

    /**
     * 根据materialId删除注册材料图
     */
    @Override
    public int deleteByMaterialId(String materialId){
        return brandRegisterMaterialsMapper.deleteByMaterialId(materialId);
    }

    /**
     * 根据brandId删除注册材料图
     */
    @Override
    public int deleteByBrandId(String brandId){
        return brandRegisterMaterialsMapper.deleteByBrandId(brandId);
    }
}
