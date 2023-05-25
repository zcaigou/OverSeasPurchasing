package com.lhg.overseaproduct.review.domain;

import java.util.Arrays;

public class ReviewImage {

    private String imageId;

    private byte[] imageContent;

    private String imageType;

    private Integer reviewId;

    private String reviewType;

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public byte[] getImageContent() {
        return imageContent;
    }

    public void setImageContent(byte[] imageContent) {
        this.imageContent = imageContent;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getReviewType() {
        return reviewType;
    }

    public void setReviewType(String reviewType) {
        this.reviewType = reviewType;
    }

    @Override
    public String toString() {
        return "ReviewImage{" +
                "imageId='" + imageId + '\'' +
                ", imageContent=" + Arrays.toString(imageContent) +
                ", imageType='" + imageType + '\'' +
                ", reviewId=" + reviewId +
                ", reviewType='" + reviewType + '\'' +
                '}';
    }
}
