package com.lhg.overseasystem.role.mapper;

import com.lhg.overseasystem.role.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {

    /**
     * 角色条件查询
     */
    public List<Role> selectRole(Role role);

    /**
     * 新增角色
     */
    public int insertRole(Role role);

    /**
     * 更改角色
     */
    public int updateRole(Role role);

    /**
     * 批量删除角色
     */
    public int deleteRoleByRoleIds(String[] roleIds);

    /**
     * 删除单个角色
     */
    public int deleteRoleByRoleId(String roleId);

    /**
     * 根据roleId查询用户信息
     */
    public Role selectRoleByRoleId(String roleId) ;
}
