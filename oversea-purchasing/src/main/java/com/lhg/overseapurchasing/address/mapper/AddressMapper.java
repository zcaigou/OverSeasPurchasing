package com.lhg.overseapurchasing.address.mapper;

import com.lhg.overseapurchasing.address.domain.Address;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {
    /**
     * 条件查询收货地址信息
     */
    public List<Address> selectAddressList(Address address);

    /**
     *根据id查询收货地址信息
     */
    public Address selectAddressById(int id);

    /**
     *新增收货地址信息
     */
    public int insertAddress(Address address);

    /**
     *更改收货地址信息
     */
    public int updateAddress(Address address);

    /**
     * 根据id删除收货地址信息
     */
    public int deleteAddressById(int id);


}
