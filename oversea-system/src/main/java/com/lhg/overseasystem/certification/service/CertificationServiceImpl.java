package com.lhg.overseasystem.certification.service;

import com.lhg.overseasystem.certification.domain.UserCertification;
import com.lhg.overseasystem.certification.mapper.CertificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationServiceImpl implements ICertificationService{

    @Autowired
    private CertificationMapper certificationMapper;

    /**
     * 条件查询个人认证信息
     */
    @Override
    public List<UserCertification> selectCertificationList(UserCertification userCertification){
        return certificationMapper.selectCertificationList(userCertification);
    }

    /**
     * 根据userUri查询个人认证信息
     */
    @Override
    public UserCertification selectCertificationByUserUri(String userUri){
        return certificationMapper.selectCertificationByUserUri(userUri);
    }

    /**
     * 新增个人认证信息
     */
    @Override
    public int insertCertification(UserCertification userCertification){
        return certificationMapper.insertCertification(userCertification);
    }

    /**
     * 更改个人认证信息
     */
    @Override
    public int updateCertification(UserCertification userCertification){
        return certificationMapper.updateCertification(userCertification);
    }

    /**
     * 根据userUri删除个人认证信息
     */
    @Override
    public int deleteCertificationByUserUri(String userUri){
        return certificationMapper.deleteCertificationByUserUri(userUri);
    }
}
