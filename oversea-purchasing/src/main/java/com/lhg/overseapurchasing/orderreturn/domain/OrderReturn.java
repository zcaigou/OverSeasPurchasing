package com.lhg.overseapurchasing.orderreturn.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class OrderReturn extends BaseEntity {
    private String returnId;

    private String specificationId;

    private Double orderPrice;

    private Double refundPrice;

    private String returnReason;

    private String fromLogistics;

    private String returnType;

    private String status;

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(String specificationId) {
        this.specificationId = specificationId;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Double getRefundPrice() {
        return refundPrice;
    }

    public void setRefundPrice(Double refundPrice) {
        this.refundPrice = refundPrice;
    }

    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    public String getFromLogistics() {
        return fromLogistics;
    }

    public void setFromLogistics(String fromLogistics) {
        this.fromLogistics = fromLogistics;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderReturn{" +
                "returnId='" + returnId + '\'' +
                ", specificationId='" + specificationId + '\'' +
                ", orderPrice=" + orderPrice +
                ", refundPrice=" + refundPrice +
                ", returnReason='" + returnReason + '\'' +
                ", fromLogistics='" + fromLogistics + '\'' +
                ", returnType='" + returnType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
