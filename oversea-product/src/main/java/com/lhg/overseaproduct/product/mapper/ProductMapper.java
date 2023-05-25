package com.lhg.overseaproduct.product.mapper;

import com.lhg.overseaproduct.product.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    /**
     * 条件查询商品信息
     */
    public List<Product> selectProductList(Product product);

    /**
     * 根据productId查询商品信息
     */
    public Product selectProductByProductId(String productId);

    /**
     * 新增商品信息
     */
    public int insertProduct(Product product);

    /**
     * 更改商品信息
     */
    public int updateProduct(Product product);

    /**
     * 根据productId删除商品信息
     */
    public int deleteProductByProductId(String productId);
}
