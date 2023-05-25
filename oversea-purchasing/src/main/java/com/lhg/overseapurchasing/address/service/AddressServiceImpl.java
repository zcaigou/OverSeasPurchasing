package com.lhg.overseapurchasing.address.service;

import com.lhg.overseapurchasing.address.domain.Address;
import com.lhg.overseapurchasing.address.mapper.AddressMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public class AddressServiceImpl implements  IAddressService{

    @Autowired
    private AddressMapper addressMapper;

    /**
     * 条件查询收货地址信息
     */
    @Override
    public List<Address> selectAddressList(Address address){
        return addressMapper.selectAddressList(address);
    }

    /**
     *根据id查询收货地址信息
     */
    @Override
    public Address selectAddressById(int id){
        return addressMapper.selectAddressById(id);
    }

    /**
     *新增收货地址信息
     */
    @Override
    public int insertAddress(Address address){
        return addressMapper.insertAddress(address);
    }

    /**
     *更改收货地址信息
     */
    @Override
    public int updateAddress(Address address){
        return addressMapper.updateAddress(address);
    }

    /**
     * 根据id删除收货地址信息
     */
    @Override
    public int deleteAddressById(int id){
        return addressMapper.deleteAddressById(id);
    }

}
