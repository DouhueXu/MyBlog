package com.blog.pojo;

public class BusinessCard {
    private Long id;

    private String technicalTitle;

    private String company;

    private String workAddress;

    private String personalLable;

    private Integer showCard;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTechnicalTitle() {
        return technicalTitle;
    }

    public void setTechnicalTitle(String technicalTitle) {
        this.technicalTitle = technicalTitle == null ? null : technicalTitle.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public String getPersonalLable() {
        return personalLable;
    }

    public void setPersonalLable(String personalLable) {
        this.personalLable = personalLable == null ? null : personalLable.trim();
    }

    public Integer getShowCard() {
        return showCard;
    }

    public void setShowCard(Integer showCard) {
        this.showCard = showCard;
    }
}