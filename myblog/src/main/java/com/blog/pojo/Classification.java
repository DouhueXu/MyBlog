package com.blog.pojo;

public class Classification {
    private Long id;

    private String classificationTitle;

    private Integer parentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassificationTitle() {
        return classificationTitle;
    }

    public void setClassificationTitle(String classificationTitle) {
        this.classificationTitle = classificationTitle == null ? null : classificationTitle.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
}