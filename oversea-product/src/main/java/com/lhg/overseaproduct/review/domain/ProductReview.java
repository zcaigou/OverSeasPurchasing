package com.lhg.overseaproduct.review.domain;

import com.lhg.overseacommon.domain.BaseEntity;

public class ProductReview extends BaseEntity {

    private Integer reviewId;

    private String orderId;

    private String productId;

    private String specificationId;

    private String review;

    private String type;

    private String replyContent;

    private String isImage;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(String specificationId) {
        this.specificationId = specificationId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getIsImage() {
        return isImage;
    }

    public void setIsImage(String isImage) {
        this.isImage = isImage;
    }

    @Override
    public String toString() {
        return "ProductReview{" +
                "reviewId=" + reviewId +
                ", orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                ", specificationId='" + specificationId + '\'' +
                ", review='" + review + '\'' +
                ", type='" + type + '\'' +
                ", replyContent='" + replyContent + '\'' +
                ", isImage='" + isImage + '\'' +
                '}';
    }
}
