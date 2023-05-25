package com.lhg.overseabusiness.shop.service;

import com.lhg.overseabusiness.shop.domain.Shop;
import com.lhg.overseabusiness.shop.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements  IShopService{

    @Autowired
    private ShopMapper shopMapper;

    /**
     * 条件查询店铺信息
     */
    @Override
    public List<Shop> selectShopList(Shop shop){
        return shopMapper.selectShopList(shop);
    }

    /**
     * 根据shopId查询店铺信息
     */
    @Override
    public Shop selectShopByShopId (String shopId){
        return shopMapper.selectShopByShopId(shopId);
    }

    /**
     * 新增店铺信息
     */
    @Override
    public int insertShop (Shop shop){
        return shopMapper.insertShop(shop);
    }

    /**
     * 更改店铺信息
     */
    @Override
    public int updateShop(Shop shop){
        return shopMapper.updateShop(shop);
    }

    /**
     * 根据shopId删除店铺信息
     */
    @Override
    public int deleteShopByShopId(String shopId){
        return shopMapper.deleteShopByShopId(shopId);
    }
}
