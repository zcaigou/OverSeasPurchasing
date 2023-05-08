package com.lhg.overseasystem.user.service;

import com.lhg.overseasystem.user.domain.User;
import java.util.List;

public interface IUserService {

    /**
     * 条件查询用户
     */
    public List<User> selectUserList(User user);

    /**
     * 新增用户
     */
    public int insertUser(User user);

    /**
     * 更新用户
     */
    public int updateUser(User user);

    /**
     * 批量注销用户
     */
    public int deleteUsers(Long[] id);

    /**
     * 注销用户
     */
    public int deleteUser(Long userId);

    /**
     * 根据userId查询用户
     */
    public User selectUserByUserId(Long userId);

    /**
     * 根据userUri查询用户
     *
     */
    public User selectUserByUserUri(String userUri);

    /**
     * 生成userUri唯一标识
     */
    public String getUserUri();

    /**
     * 获取当前用户数
     */
    public int selectCountUser();

}
