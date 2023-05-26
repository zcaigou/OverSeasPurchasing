package com.lhg.oversealogistics.company.service;

import com.lhg.oversealogistics.company.domain.Company;
import com.lhg.oversealogistics.company.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements ICompanyService{

    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 条件查询物流公司信息
     */
    @Override
    public List<Company> selectCompanyList(Company company){
        return companyMapper.selectCompanyList(company);
    }

    /**
     *  根据companyId查询物流公司信息
     */
    @Override
    public Company selectCompanyById(String companyId){
        return companyMapper.selectCompanyById(companyId);
    }

    /**
     *  根据companyId删除物流公司信息
     */
    @Override
    public int deleteByCompanyId(String companyId){
        return companyMapper.deleteByCompanyId(companyId);
    }

    /**
     *  更改物流公司信息
     */
    @Override
    public int updateCompany(Company company){
        return companyMapper.updateCompany(company);
    }

    /**
     *  新增物流公司信息
     */
    @Override
    public int insertCompany(Company company){
        return companyMapper.insertCompany(company);
    }
}
