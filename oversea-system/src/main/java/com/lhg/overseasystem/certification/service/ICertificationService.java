package com.lhg.overseasystem.certification.service;

import com.lhg.overseasystem.certification.domain.UserCertification;

import java.util.List;

public interface ICertificationService {

    /**
     * 条件查询个人认证信息
     */
    public List<UserCertification> selectCertificationList(UserCertification userCertification);

    /**
     * 根据userUri查询个人认证信息
     */
    public UserCertification selectCertificationByUserUri(String userUri);

    /**
     * 新增个人认证信息
     */
    public int insertCertification(UserCertification userCertification);

    /**
     * 更改个人认证信息
     */
    public int updateCertification(UserCertification userCertification);

    /**
     * 根据userUri删除个人认证信息
     */
    public int deleteCertificationByUserUri(String userUri);
}
