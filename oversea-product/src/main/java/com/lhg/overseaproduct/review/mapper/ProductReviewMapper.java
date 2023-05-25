package com.lhg.overseaproduct.review.mapper;

import com.lhg.overseaproduct.review.domain.ProductReview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductReviewMapper {

    /**
     * 条件查询商品评论
     */
    public List<ProductReview> selectProductReviewList(ProductReview productReview);

    /**
     * 根据reviewId查询商品评论
     */
    public ProductReview selectProductReviewByReviewId(String reviewId);

    /**
     * 新增商品评论
     */
    public int insertProductReview(ProductReview productReview);

    /**
     * 更改商品评论
     */
    public int updateProductReview(ProductReview productReview);

    /**
     * 根据reviewId删除商品评论
     */
    public int deleteProductReviewByReviewId(String reviewId);
}
