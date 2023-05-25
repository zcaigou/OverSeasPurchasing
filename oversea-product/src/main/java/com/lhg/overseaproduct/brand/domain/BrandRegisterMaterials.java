package com.lhg.overseaproduct.brand.domain;

import java.util.Arrays;

public class BrandRegisterMaterials {

    private String materialId;

    private String brandId;

    private byte[] submitMaterial;

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public byte[] getSubmitMaterial() {
        return submitMaterial;
    }

    public void setSubmitMaterial(byte[] submitMaterial) {
        this.submitMaterial = submitMaterial;
    }

    @Override
    public String toString() {
        return "BrandRegisterMaterials{" +
                "materialId='" + materialId + '\'' +
                ", brandId='" + brandId + '\'' +
                ", submitMaterial=" + Arrays.toString(submitMaterial) +
                '}';
    }
}
