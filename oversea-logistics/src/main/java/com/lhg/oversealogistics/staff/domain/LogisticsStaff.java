package com.lhg.oversealogistics.staff.domain;

public class LogisticsStaff {

    private String userId;

    private String username;

    private String companyId;

    private String telephone;

    private String region;

    private String companyName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "LogisticsStaff{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", companyId='" + companyId + '\'' +
                ", telephone='" + telephone + '\'' +
                ", region='" + region + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
