package com.lhg.overseabusiness.warehouse.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class Warehouse extends BaseEntity {

    private String wareouseId;

    private String warehouseName;

    private String address;

    private String type;

    private String shopId;

    private String ownerUser;

    private String telephone;

    public String getWareouseId() {
        return wareouseId;
    }

    public void setWareouseId(String wareouseId) {
        this.wareouseId = wareouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getOwnerUser() {
        return ownerUser;
    }

    public void setOwnerUser(String ownerUser) {
        this.ownerUser = ownerUser;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "wareouseId='" + wareouseId + '\'' +
                ", warehouseName='" + warehouseName + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                ", shopId='" + shopId + '\'' +
                ", ownerUser='" + ownerUser + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
