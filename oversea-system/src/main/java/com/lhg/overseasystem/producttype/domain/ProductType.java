package com.lhg.overseasystem.producttype.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class ProductType extends BaseEntity {

    private String typeId;

    private String typeName;

    private String typePid;

    private String typePname;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypePid() {
        return typePid;
    }

    public void setTypePid(String typePid) {
        this.typePid = typePid;
    }

    public String getTypePname() {
        return typePname;
    }

    public void setTypePname(String typePname) {
        this.typePname = typePname;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "typeId='" + typeId + '\'' +
                ", typeName='" + typeName + '\'' +
                ", typePid='" + typePid + '\'' +
                ", typePname='" + typePname + '\'' +
                '}';
    }
}
