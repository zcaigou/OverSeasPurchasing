package com.lhg.overseaproduct.product.service;

import com.lhg.overseaproduct.product.domain.Product;
import com.lhg.overseaproduct.product.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private ProductMapper productMapper;

    /**
     * 条件查询商品信息
     */
    @Override
    public List<Product> selectProductList(Product product){
        return productMapper.selectProductList(product);
    }

    /**
     * 根据productId查询商品信息
     */
    @Override
    public Product selectProductByProductId(String productId){
        return productMapper.selectProductByProductId(productId);
    }

    /**
     * 新增商品信息
     */
    @Override
    public int insertProduct(Product product){
        product.setProductId(UUID.randomUUID().toString());
        return productMapper.insertProduct(product);
    }

    /**
     * 更改商品信息
     */
    @Override
    public int updateProduct(Product product){
        return productMapper.updateProduct(product);
    }

    /**
     * 根据productId删除商品信息
     */
    @Override
    public int deleteProductByProductId(String productId){
        return productMapper.deleteProductByProductId(productId);
    }
}
