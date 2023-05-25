package com.lhg.overseabusiness.budget.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class Budget extends BaseEntity {

    private String payId;

    private String payType;

    private String orderId;

    private String money;

    private String payStatus;

    private String fromAccount;

    private String fromBy;

    private String toAccount;

    private String toBy;

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(String fromAccount) {
        this.fromAccount = fromAccount;
    }

    public String getFromBy() {
        return fromBy;
    }

    public void setFromBy(String fromBy) {
        this.fromBy = fromBy;
    }

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public String getToBy() {
        return toBy;
    }

    public void setToBy(String toBy) {
        this.toBy = toBy;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "payId='" + payId + '\'' +
                ", payType='" + payType + '\'' +
                ", orderId='" + orderId + '\'' +
                ", money='" + money + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", fromAccount='" + fromAccount + '\'' +
                ", fromBy='" + fromBy + '\'' +
                ", toAccount='" + toAccount + '\'' +
                ", toBy='" + toBy + '\'' +
                '}';
    }
}
