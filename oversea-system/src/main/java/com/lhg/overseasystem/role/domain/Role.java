package com.lhg.overseasystem.role.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class Role extends BaseEntity {

    private int roleId;

    private String roleName;

    private int roleSort;

    private String status;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(int roleSort) {
        this.roleSort = roleSort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleSort=" + roleSort +
                ", status='" + status + '\'' +
                '}';
    }
}
