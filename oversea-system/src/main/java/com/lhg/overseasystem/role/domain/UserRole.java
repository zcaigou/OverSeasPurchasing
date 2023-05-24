package com.lhg.overseasystem.role.domain;

public class UserRole {

    private String userUri;

    private int roleId;

    public String getUserUri() {
        return userUri;
    }

    public void setUserUri(String userUri) {
        this.userUri = userUri;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "userUri='" + userUri + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }

}
