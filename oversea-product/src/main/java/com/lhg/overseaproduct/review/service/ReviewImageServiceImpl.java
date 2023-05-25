package com.lhg.overseaproduct.review.service;

import com.lhg.overseaproduct.review.domain.ReviewImage;
import com.lhg.overseaproduct.review.mapper.ReviewImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReviewImageServiceImpl implements IReviewImageService{

    @Autowired
    private ReviewImageMapper reviewImageMapper;

    /**
     * 条件查询评论图片
     */
    @Override
    public List<ReviewImage> selectReviewImageList(ReviewImage reviewImage){
        return reviewImageMapper.selectReviewImageList(reviewImage);
    }

    /**
     * 根据imageId查询评论图片
     */
    @Override
    public ReviewImage selectReviewImageByImageId(String imageId){
        return reviewImageMapper.selectReviewImageByImageId(imageId);
    }

    /**
     * 新增评论图片
     */
    @Override
    public int insertReviewImage(ReviewImage reviewImage){
        reviewImage.setImageId(UUID.randomUUID().toString());
        return reviewImageMapper.insertReviewImage(reviewImage);
    }

    /**
     * 根据imageId删除评论图片
     */
    @Override
    public int deleteReviewImageByImageId(String imageId){
        return reviewImageMapper.deleteReviewImageByImageId(imageId);
    }

    /**
     * 根据reviewId删除评论图片
     */
    @Override
    public int deleteReviewImageByReviewId(String reviewId){
        return reviewImageMapper.deleteReviewImageByReviewId(reviewId);
    }
}
