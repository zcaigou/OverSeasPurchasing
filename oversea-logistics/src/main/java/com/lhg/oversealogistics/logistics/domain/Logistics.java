package com.lhg.oversealogistics.logistics.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class Logistics extends BaseEntity {

    private String logisticsId;

    private String logisticsStatus;

    private String fromUsername;

    private String fromAddress;

    private String fromTelephone;

    private String toAddress;

    private String toUsername;

    private String toTelephone;

    private String collectorsId;

    private String delivererId;

    private String path;

    private String companyId;

    private String logisticType;

    private String companyName;

    private String collectorsName;

    private String delivererName;

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getLogisticsStatus() {
        return logisticsStatus;
    }

    public void setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getFromTelephone() {
        return fromTelephone;
    }

    public void setFromTelephone(String fromTelephone) {
        this.fromTelephone = fromTelephone;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getToUsername() {
        return toUsername;
    }

    public void setToUsername(String toUsername) {
        this.toUsername = toUsername;
    }

    public String getToTelephone() {
        return toTelephone;
    }

    public void setToTelephone(String toTelephone) {
        this.toTelephone = toTelephone;
    }

    public String getCollectorsId() {
        return collectorsId;
    }

    public void setCollectorsId(String collectorsId) {
        this.collectorsId = collectorsId;
    }

    public String getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(String delivererId) {
        this.delivererId = delivererId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getLogisticType() {
        return logisticType;
    }

    public void setLogisticType(String logisticType) {
        this.logisticType = logisticType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCollectorsName() {
        return collectorsName;
    }

    public void setCollectorsName(String collectorsName) {
        this.collectorsName = collectorsName;
    }

    public String getDelivererName() {
        return delivererName;
    }

    public void setDelivererName(String delivererName) {
        this.delivererName = delivererName;
    }

    @Override
    public String toString() {
        return "Logistics{" +
                "logisticsId='" + logisticsId + '\'' +
                ", logisticsStatus='" + logisticsStatus + '\'' +
                ", fromUsername='" + fromUsername + '\'' +
                ", fromAddress='" + fromAddress + '\'' +
                ", fromTelephone='" + fromTelephone + '\'' +
                ", toAddress='" + toAddress + '\'' +
                ", toUsername='" + toUsername + '\'' +
                ", toTelephone='" + toTelephone + '\'' +
                ", collectorsId='" + collectorsId + '\'' +
                ", delivererId='" + delivererId + '\'' +
                ", path='" + path + '\'' +
                ", companyId='" + companyId + '\'' +
                ", logisticType='" + logisticType + '\'' +
                ", companyName='" + companyName + '\'' +
                ", collectorsName='" + collectorsName + '\'' +
                ", delivererName='" + delivererName + '\'' +
                '}';
    }
}
