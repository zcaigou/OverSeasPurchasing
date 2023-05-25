package com.lhg.overseaproduct.review.service;

import com.lhg.overseaproduct.review.domain.ProductReview;
import com.lhg.overseaproduct.review.mapper.ProductReviewMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Action;
import java.util.List;
import java.util.UUID;

@Service
public class ProductReviewServiceImpl implements IProductReviewService{
    @Autowired
    private ProductReviewMapper productReviewMapper;

    /**
     * 条件查询商品评论
     */
    @Override
    public List<ProductReview> selectProductReviewList(ProductReview productReview){
        return productReviewMapper.selectProductReviewList(productReview);
    }

    /**
     * 根据reviewId查询商品评论
     */
    @Override
    public ProductReview selectProductReviewByReviewId(String reviewId){
        return productReviewMapper.selectProductReviewByReviewId(reviewId);
    }

    /**
     * 新增商品评论
     */
    @Override
    public int insertProductReview(ProductReview productReview){
        return productReviewMapper.insertProductReview(productReview);
    }

    /**
     * 更改商品评论
     */
    @Override
    public int updateProductReview(ProductReview productReview){
        return productReviewMapper.updateProductReview(productReview);
    }

    /**
     * 根据reviewId删除商品评论
     */
    @Override
    public int deleteProductReviewByReviewId(String reviewId){
        return productReviewMapper.deleteProductReviewByReviewId(reviewId);
    }
}
