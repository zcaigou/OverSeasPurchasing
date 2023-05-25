package com.lhg.overseaproduct.brand.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class Brand extends BaseEntity {

    private String brandId;

    private String brandName;

    private String brandOwner;

    private String registerNo;

    private String brandType;

    private String registerStatus;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandOwner() {
        return brandOwner;
    }

    public void setBrandOwner(String brandOwner) {
        this.brandOwner = brandOwner;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public String getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(String registerStatus) {
        this.registerStatus = registerStatus;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId='" + brandId + '\'' +
                ", brandName='" + brandName + '\'' +
                ", brandOwner='" + brandOwner + '\'' +
                ", registerNo='" + registerNo + '\'' +
                ", brandType='" + brandType + '\'' +
                ", registerStatus='" + registerStatus + '\'' +
                '}';
    }
}
