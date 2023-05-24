package com.lhg.overseasystem.certification.domain;

import com.lhg.overseacommon.domain.BaseEntity;

import java.util.Arrays;

public class UserCertification  extends BaseEntity {

    private String userUri;

    private String name;

    private String idType;

    private String idNumber;

    private byte[] idCardFront;

    private byte[] idCardReverse;

    public String getUserUri() {
        return userUri;
    }

    public void setUserUri(String userUri) {
        this.userUri = userUri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public byte[] getIdCardFront() {
        return idCardFront;
    }

    public void setIdCardFront(byte[] idCardFront) {
        this.idCardFront = idCardFront;
    }

    public byte[] getIdCardReverse() {
        return idCardReverse;
    }

    public void setIdCardReverse(byte[] idCardReverse) {
        this.idCardReverse = idCardReverse;
    }

    @Override
    public String toString() {
        return "UserCertification{" +
                "userUri='" + userUri + '\'' +
                ", name='" + name + '\'' +
                ", idType='" + idType + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", idCardFront=" + Arrays.toString(idCardFront) +
                ", idCardReverse=" + Arrays.toString(idCardReverse) +
                '}';
    }
}
