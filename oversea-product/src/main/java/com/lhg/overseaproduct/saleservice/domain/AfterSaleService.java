package com.lhg.overseaproduct.saleservice.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class AfterSaleService extends BaseEntity {

    private String serviceId;

    private String serviceName;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "AfterSaleService{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
