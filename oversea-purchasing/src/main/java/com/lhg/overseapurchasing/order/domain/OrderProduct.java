package com.lhg.overseapurchasing.order.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class OrderProduct extends BaseEntity {

    private int id;

    private String orderId;

    private String productId;

    private String specificationsId;

    private Integer sum;

    private Double price;

    private String state;

    private String logisticsId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSpecificationsId() {
        return specificationsId;
    }

    public void setSpecificationsId(String specificationsId) {
        this.specificationsId = specificationsId;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                ", specificationsId='" + specificationsId + '\'' +
                ", sum=" + sum +
                ", price=" + price +
                ", state='" + state + '\'' +
                ", logisticsId='" + logisticsId + '\'' +
                '}';
    }
}
