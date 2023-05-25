package com.lhg.overseaproduct.specifications.domain;

import com.lhg.overseacommon.domain.BaseEntity;

import java.util.Arrays;

public class Specifications extends BaseEntity {

    private String specificationId;

    private String productId;

    private String productSpecification;

    private Integer productNum;

    private byte[] productImage;

    private double productPrice;

    private String productStatus;

    private Integer productRemainWarn;

    private Integer onSale;

    private String purchasePlace;

    private String warehouseId;

    public String getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(String specificationId) {
        this.specificationId = specificationId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getProductRemainWarn() {
        return productRemainWarn;
    }

    public void setProductRemainWarn(Integer productRemainWarn) {
        this.productRemainWarn = productRemainWarn;
    }

    public Integer getOnSale() {
        return onSale;
    }

    public void setOnSale(Integer onSale) {
        this.onSale = onSale;
    }

    public String getPurchasePlace() {
        return purchasePlace;
    }

    public void setPurchasePlace(String purchasePlace) {
        this.purchasePlace = purchasePlace;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    @Override
    public String toString() {
        return "Specifications{" +
                "specificationId='" + specificationId + '\'' +
                ", productId='" + productId + '\'' +
                ", productSpecification='" + productSpecification + '\'' +
                ", productNum=" + productNum +
                ", productImage=" + Arrays.toString(productImage) +
                ", productPrice=" + productPrice +
                ", productStatus='" + productStatus + '\'' +
                ", productRemainWarn=" + productRemainWarn +
                ", onSale=" + onSale +
                ", purchasePlace='" + purchasePlace + '\'' +
                ", warehouseId='" + warehouseId + '\'' +
                '}';
    }
}
