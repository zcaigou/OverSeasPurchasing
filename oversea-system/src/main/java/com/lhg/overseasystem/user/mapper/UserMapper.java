package com.lhg.overseasystem.user.mapper;

import com.lhg.overseasystem.user.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

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
    public int deleteUsers(Long[] userIds);

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
     * 获取当前用户数
     */
    public int selectCountUser();

}
