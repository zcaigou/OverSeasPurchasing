package com.lhg.oversealogistics.company.service;

import com.lhg.oversealogistics.company.domain.Company;

import java.util.List;

public interface ICompanyService {

    /**
     * 条件查询物流公司信息
     */
    public List<Company> selectCompanyList(Company company);

    /**
     *  根据companyId查询物流公司信息
     */
    public Company selectCompanyById(String companyId);

    /**
     *  根据companyId删除物流公司信息
     */
    public int deleteByCompanyId(String companyId);

    /**
     *  更改物流公司信息
     */
    public int updateCompany(Company company);

    /**
     *  新增物流公司信息
     */
    public int insertCompany(Company company);
}


