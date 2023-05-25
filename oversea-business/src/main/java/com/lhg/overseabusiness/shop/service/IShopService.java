package com.lhg.overseabusiness.shop.service;

import com.lhg.overseabusiness.shop.domain.Shop;

import java.util.List;

public interface IShopService {
    /**
     * 条件查询店铺信息
     */
    public List<Shop> selectShopList(Shop shop);

    /**
     * 根据shopId查询店铺信息
     */
    public Shop selectShopByShopId (String shopId);

    /**
     * 新增店铺信息
     */
    public int insertShop (Shop shop);

    /**
     * 更改店铺信息
     */
    public int updateShop(Shop shop);

    /**
     * 根据shopId删除店铺信息
     */
    public int deleteShopByShopId(String shopId);
}
