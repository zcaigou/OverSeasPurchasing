package com.lhg.overseasystem.account.mapper;

import com.lhg.overseasystem.account.domain.UserAccount;
import com.lhg.overseasystem.user.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AccountMapper {

    /**
     * 条件查询个人账户信息
     */
    public List<UserAccount> selectAccountList(UserAccount userAccount);

    /**
     * 根据userUri和accountId查询个人账户信息
     */
    public UserAccount selectByUserUriAndAccountId(@Param("userUri") String userUri , @Param("accountId") String accountId);

    /**
     * 新增个人账户信息
     */
    public int insertAccount(UserAccount userAccount);

    /**
     * 更改个人账户金额
     */
    public int updateAccount(@Param("userUri") String userUri , @Param("accountId") String accountId,@Param("accountMoney") double accountMoney);

    /**
     * 根据userUri删除个人账户信息
     */
    public int deleteAccountByUserUri(String userUri);

    /**
     * 根据userUri和accountId删除个人账户
     */
    public int deleteByUserUriAndAccountId(@Param("userUri") String userUri , @Param("accountId") String accountId);

}
