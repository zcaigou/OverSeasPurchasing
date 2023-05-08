package com.lhg.overseasystem.user.service;

import com.lhg.overseasystem.user.domain.User;
import com.lhg.overseasystem.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 条件查询用户
     */
    @Override
    public List<User> selectUserList(User user){
        return userMapper.selectUserList(user);
    }

    /**
     * 新增用户
     */
    @Override
    public int insertUser(User user){
        /**
         * 生成用户唯一标识
         */
        user.setUserUri(getUserUri());
        return userMapper.insertUser(user);
    }

    /**
     * 更新用户
     */
    @Override
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    /**
     * 批量注销用户
     */
    @Override
    public int deleteUsers(Long[] userIds){
        return  userMapper.deleteUsers(userIds);
    }

    /**
     * 注销用户
     */
    @Override
    public int deleteUser(Long userId){
        return userMapper.deleteUser(userId);
    }

    /**
     * 根据userId查询用户
     */
    @Override
    public User selectUserByUserId(Long userId){
        return userMapper.selectUserByUserId(userId);
    }

    /**
     * 根据userUri查询用户
     *
     */
    @Override
    public User selectUserByUserUri(String userUri){
        return userMapper.selectUserByUserUri(userUri);
    }

    /**
     * 生成userUri唯一标识
     */
    @Override
    public String getUserUri(){
        Random r = new Random();
        return "op_" + System.currentTimeMillis() + r.nextInt(10) + selectCountUser();
    }

    /**
     * 获取当前用户数
     */
    @Override
    public int selectCountUser(){
        return userMapper.selectCountUser();
    }

}
