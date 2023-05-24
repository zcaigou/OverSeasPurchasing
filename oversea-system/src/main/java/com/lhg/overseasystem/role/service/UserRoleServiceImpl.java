package com.lhg.overseasystem.role.service;

import com.lhg.overseasystem.role.domain.UserRole;
import com.lhg.overseasystem.role.mapper.UserRoleMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements IUserRoleService{

    @Autowired
    private UserRoleMapper userRoleMapper;
    /**
     * 用户-角色条件查询
     */
    @Override
    public List<UserRole> selectUserRoleList(UserRole userRole){
        return userRoleMapper.selectUserRoleList(userRole);
    }

    /**
     * 根据roleId和userUri查询用户-角色关系
     */
    @Override
    public UserRole selectByRoleIdAndUserUri(String roleId, String userUri){
        return userRoleMapper.selectByRoleIdAndUserUri(roleId, userUri);
    }

    /**
     * 新增用户-角色关系
     */
    @Override
    public int insertUserRole(UserRole userRole){
        return userRoleMapper.insertUserRole(userRole);
    }

    /**
     * 根据userUri删除用户-角色关系
     */
    @Override
    public int deleteByUserUri(String userUri){
        return userRoleMapper.deleteByUserUri(userUri);
    }

    /**
     * 根据roleId删除用户-角色关系
     */
    @Override
    public int deleteByRoleId(String roleId){
        return userRoleMapper.deleteByRoleId(roleId);
    }

    /**
     * 根据roleId和userUri删除用户-角色关系
     */
    @Override
    public int deleteByRoleIdAndUserUri(String roleId, String userUri){
        return userRoleMapper.deleteByRoleIdAndUserUri(roleId,userUri);
    }
}
