package com.lhg.overseaproduct.brand.service;

import com.lhg.overseaproduct.brand.domain.BrandRegisterMaterials;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IBrandRegisterMaterialsService {

    /**
     * 条件查询注册材料图
     */
    public List<BrandRegisterMaterials> selectMaterialsList(BrandRegisterMaterials brandRegisterMaterials);

    /**
     * 根据materialId和brandId查询注册材料图
     */
    public BrandRegisterMaterials selectByMaterialIdAndBrandId(String materialId, String brandId);

    /**
     * 新增注册材料图
     */
    public int insertMaterials(BrandRegisterMaterials brandRegisterMaterials);

    /**
     * 根据materialId和brandId删除注册材料图
     */
    public int deleteByMaterialIdAndBrandId( String materialId, String brandId);

    /**
     * 根据materialId删除注册材料图
     */
    public int deleteByMaterialId(String materialId);

    /**
     * 根据brandId删除注册材料图
     */
    public int deleteByBrandId(String brandId);
}
