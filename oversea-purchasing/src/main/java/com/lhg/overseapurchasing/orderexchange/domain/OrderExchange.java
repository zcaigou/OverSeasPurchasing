package com.lhg.overseapurchasing.orderexchange.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class OrderExchange extends BaseEntity {

    private String exchangeId;

    private String specificationId;

    private Double orderPrice;

    private Double diffPrice;

    private String exchangeReson;

    private String fromLogistics;

    private String toLogistics;

    private String status;

    public String getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(String exchangeId) {
        this.exchangeId = exchangeId;
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

    public Double getDiffPrice() {
        return diffPrice;
    }

    public void setDiffPrice(Double diffPrice) {
        this.diffPrice = diffPrice;
    }

    public String getExchangeReson() {
        return exchangeReson;
    }

    public void setExchangeReson(String exchangeReson) {
        this.exchangeReson = exchangeReson;
    }

    public String getFromLogistics() {
        return fromLogistics;
    }

    public void setFromLogistics(String fromLogistics) {
        this.fromLogistics = fromLogistics;
    }

    public String getToLogistics() {
        return toLogistics;
    }

    public void setToLogistics(String toLogistics) {
        this.toLogistics = toLogistics;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderExchange{" +
                "exchangeId='" + exchangeId + '\'' +
                ", specificationId='" + specificationId + '\'' +
                ", orderPrice=" + orderPrice +
                ", diff_price=" + diffPrice +
                ", exchangeReson='" + exchangeReson + '\'' +
                ", fromLogistics='" + fromLogistics + '\'' +
                ", toLogistics='" + toLogistics + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
