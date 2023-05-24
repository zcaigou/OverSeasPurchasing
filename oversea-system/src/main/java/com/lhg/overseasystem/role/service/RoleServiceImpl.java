package com.lhg.overseasystem.role.service;

import com.lhg.overseasystem.role.domain.Role;
import com.lhg.overseasystem.role.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService{

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 角色条件查询
     */
    public List<Role> selectRole(Role role){
        return roleMapper.selectRole(role);
    }

    /**
     * 新增角色
     */
    @Override
    public int insertRole(Role role){
        return roleMapper.insertRole(role);
    }

    /**
     * 更改角色
     */
    @Override
    public int updateRole(Role role){
        return roleMapper.updateRole(role);
    }

    /**
     * 批量删除角色
     */
    @Override
    public int deleteRoleByRoleIds(String[] roleIds){
        return roleMapper.deleteRoleByRoleIds(roleIds);
    }

    /**
     * 删除单个角色
     */
    @Override
    public int deleteRoleByRoleId(String roleId){

        // 该角色已分配给用户，不能被删除

        // 删除角色

        return roleMapper.deleteRoleByRoleId(roleId);
    }

    /**
     * 根据roleId查询用户信息
     */
    @Override
    public Role selectRoleByRoleId(String roleId) {
        return roleMapper.selectRoleByRoleId(roleId);
    }
}
