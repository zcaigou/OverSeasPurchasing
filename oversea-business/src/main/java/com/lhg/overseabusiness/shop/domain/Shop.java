package com.lhg.overseabusiness.shop.domain;

import com.lhg.overseacommon.domain.BaseEntity;

import java.util.Arrays;

public class Shop extends BaseEntity {

    private String shopId;

    private String shopName;

    private String userUri;

    private String shopType;

    private byte[] shopBrand;

    private String address;

    private String telephone;

    private String shopStatus;

    private byte[] shopSubmittalOne;

    private byte[] shopSubmittalTwo;

    private byte[] shopSubmittalThree;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getUserUri() {
        return userUri;
    }

    public void setUserUri(String userUri) {
        this.userUri = userUri;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public byte[] getShopBrand() {
        return shopBrand;
    }

    public void setShopBrand(byte[] shopBrand) {
        this.shopBrand = shopBrand;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public byte[] getShopSubmittalOne() {
        return shopSubmittalOne;
    }

    public void setShopSubmittalOne(byte[] shopSubmittalOne) {
        this.shopSubmittalOne = shopSubmittalOne;
    }

    public byte[] getShopSubmittalTwo() {
        return shopSubmittalTwo;
    }

    public void setShopSubmittalTwo(byte[] shopSubmittalTwo) {
        this.shopSubmittalTwo = shopSubmittalTwo;
    }

    public byte[] getShopSubmittalThree() {
        return shopSubmittalThree;
    }

    public void setShopSubmittalThree(byte[] shopSubmittalThree) {
        this.shopSubmittalThree = shopSubmittalThree;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId='" + shopId + '\'' +
                ", shopName='" + shopName + '\'' +
                ", userUri='" + userUri + '\'' +
                ", shopType='" + shopType + '\'' +
                ", shopBrand=" + Arrays.toString(shopBrand) +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", shopStatus='" + shopStatus + '\'' +
                ", shopSubmittalOne=" + Arrays.toString(shopSubmittalOne) +
                ", shopSubmittalTwo=" + Arrays.toString(shopSubmittalTwo) +
                ", shopSubmittalThree=" + Arrays.toString(shopSubmittalThree) +
                '}';
    }
}
