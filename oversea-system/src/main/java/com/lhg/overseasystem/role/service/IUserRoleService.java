package com.lhg.overseasystem.role.service;

import com.lhg.overseasystem.role.domain.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserRoleService {

    /**
     * 用户-角色条件查询
     */
    public List<UserRole> selectUserRoleList(UserRole userRole);

    /**
     * 根据roleId和userUri查询用户-角色关系
     */
    public UserRole selectByRoleIdAndUserUri(String roleId, String userUri);

    /**
     * 新增用户-角色关系
     */
    public int insertUserRole(UserRole userRole);

    /**
     * 根据userUri删除用户-角色关系
     */
    public int deleteByUserUri(String userUri);

    /**
     * 根据roleId删除用户-角色关系
     */
    public int deleteByRoleId(String roleId);

    /**
     * 根据roleId和userUri删除用户-角色关系
     */
    public int deleteByRoleIdAndUserUri(String roleId, String userUri);
}
