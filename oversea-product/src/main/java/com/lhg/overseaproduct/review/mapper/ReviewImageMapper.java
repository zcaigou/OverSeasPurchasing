package com.lhg.overseaproduct.review.mapper;

import com.lhg.overseaproduct.review.domain.ReviewImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewImageMapper {

    /**
     * 条件查询评论图片
     */
    public List<ReviewImage> selectReviewImageList(ReviewImage reviewImage);

    /**
     * 根据imageId查询评论图片
     */
    public ReviewImage selectReviewImageByImageId(String imageId);

    /**
     * 新增评论图片
     */
    public int insertReviewImage(ReviewImage reviewImage);

    /**
     * 根据imageId删除评论图片
     */
    public int deleteReviewImageByImageId(String imageId);

    /**
     * 根据reviewId删除评论图片
     */
    public int deleteReviewImageByReviewId(String reviewId);
}
