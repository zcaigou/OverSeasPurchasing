package com.lhg.overseaproduct.product.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class Product extends BaseEntity {

    private String productId;

    private String productName;

    private String productDetail;

    private String productType;

    private String brandId;

    private String articleNo;

    private String producer;

    private String shopType;

    private Long listingTime;

    private String productStatus;

    private String isExpressFee;

    private double expressFee;

    private String shopId;

    private String serviceId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public Long getListingTime() {
        return listingTime;
    }

    public void setListingTime(Long listingTime) {
        this.listingTime = listingTime;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getIsExpressFee() {
        return isExpressFee;
    }

    public void setIsExpressFee(String isExpressFee) {
        this.isExpressFee = isExpressFee;
    }

    public double getExpressFee() {
        return expressFee;
    }

    public void setExpressFee(double expressFee) {
        this.expressFee = expressFee;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDetail='" + productDetail + '\'' +
                ", productType='" + productType + '\'' +
                ", brandId='" + brandId + '\'' +
                ", articleNo='" + articleNo + '\'' +
                ", producer='" + producer + '\'' +
                ", shopType='" + shopType + '\'' +
                ", listingTime=" + listingTime +
                ", productStatus='" + productStatus + '\'' +
                ", isExpressFee='" + isExpressFee + '\'' +
                ", expressFee=" + expressFee +
                ", shopId='" + shopId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                '}';
    }
}
