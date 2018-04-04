package com.blog.pojo;

import java.util.Date;

public class Common {
    private Long id;

    private Long userId;

    private Long articleId;

    private Long parentId;

    private Integer isParent;

    private String commonContent;

    private Date commonTime;

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

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public String getCommonContent() {
        return commonContent;
    }

    public void setCommonContent(String commonContent) {
        this.commonContent = commonContent == null ? null : commonContent.trim();
    }

    public Date getCommonTime() {
        return commonTime;
    }

    public void setCommonTime(Date commonTime) {
        this.commonTime = commonTime;
    }
}