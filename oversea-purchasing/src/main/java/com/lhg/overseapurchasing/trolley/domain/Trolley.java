package com.lhg.overseapurchasing.trolley.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class Trolley extends BaseEntity {

    private String userId;

    private String shopId;

    private String productId;

    private String specificationId;

    private Integer sum;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(String specificationId) {
        this.specificationId = specificationId;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Trolley{" +
                "userId='" + userId + '\'' +
                ", shopId='" + shopId + '\'' +
                ", productId='" + productId + '\'' +
                ", specificationId='" + specificationId + '\'' +
                ", sum=" + sum +
                '}';
    }
}
