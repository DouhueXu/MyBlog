package com.blog.pojo;

import java.util.Date;

public class Article {
    private Long id;

    private Long userId;

    private String articleTitle;

    private String articleImages;

    private String articleLable;

    private Date articleCreateTime;

    private Date articleUpdateTime;

    private Integer articleState;

    private Long classificationId;

    private Long articleReadTimes;

    private Integer reprint;

    private String articleContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getArticleImages() {
        return articleImages;
    }

    public void setArticleImages(String articleImages) {
        this.articleImages = articleImages == null ? null : articleImages.trim();
    }

    public String getArticleLable() {
        return articleLable;
    }

    public void setArticleLable(String articleLable) {
        this.articleLable = articleLable == null ? null : articleLable.trim();
    }

    public Date getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(Date articleCreateTime) {
        this.articleCreateTime = articleCreateTime;
    }

    public Date getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(Date articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public Integer getArticleState() {
        return articleState;
    }

    public void setArticleState(Integer articleState) {
        this.articleState = articleState;
    }

    public Long getClassificationId() {
        return classificationId;
    }

    public void setClassificationId(Long classificationId) {
        this.classificationId = classificationId;
    }

    public Long getArticleReadTimes() {
        return articleReadTimes;
    }

    public void setArticleReadTimes(Long articleReadTimes) {
        this.articleReadTimes = articleReadTimes;
    }

    public Integer getReprint() {
        return reprint;
    }

    public void setReprint(Integer reprint) {
        this.reprint = reprint;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}