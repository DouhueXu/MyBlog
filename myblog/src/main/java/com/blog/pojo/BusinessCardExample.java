package com.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class BusinessCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessCardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleIsNull() {
            addCriterion("technical_title is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleIsNotNull() {
            addCriterion("technical_title is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleEqualTo(String value) {
            addCriterion("technical_title =", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleNotEqualTo(String value) {
            addCriterion("technical_title <>", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleGreaterThan(String value) {
            addCriterion("technical_title >", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleGreaterThanOrEqualTo(String value) {
            addCriterion("technical_title >=", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleLessThan(String value) {
            addCriterion("technical_title <", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleLessThanOrEqualTo(String value) {
            addCriterion("technical_title <=", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleLike(String value) {
            addCriterion("technical_title like", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleNotLike(String value) {
            addCriterion("technical_title not like", value, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleIn(List<String> values) {
            addCriterion("technical_title in", values, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleNotIn(List<String> values) {
            addCriterion("technical_title not in", values, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleBetween(String value1, String value2) {
            addCriterion("technical_title between", value1, value2, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andTechnicalTitleNotBetween(String value1, String value2) {
            addCriterion("technical_title not between", value1, value2, "technicalTitle");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNull() {
            addCriterion("work_address is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIsNotNull() {
            addCriterion("work_address is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddressEqualTo(String value) {
            addCriterion("work_address =", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotEqualTo(String value) {
            addCriterion("work_address <>", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThan(String value) {
            addCriterion("work_address >", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("work_address >=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThan(String value) {
            addCriterion("work_address <", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLessThanOrEqualTo(String value) {
            addCriterion("work_address <=", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressLike(String value) {
            addCriterion("work_address like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotLike(String value) {
            addCriterion("work_address not like", value, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressIn(List<String> values) {
            addCriterion("work_address in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotIn(List<String> values) {
            addCriterion("work_address not in", values, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressBetween(String value1, String value2) {
            addCriterion("work_address between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andWorkAddressNotBetween(String value1, String value2) {
            addCriterion("work_address not between", value1, value2, "workAddress");
            return (Criteria) this;
        }

        public Criteria andPersonalLableIsNull() {
            addCriterion("personal_lable is null");
            return (Criteria) this;
        }

        public Criteria andPersonalLableIsNotNull() {
            addCriterion("personal_lable is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalLableEqualTo(String value) {
            addCriterion("personal_lable =", value, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableNotEqualTo(String value) {
            addCriterion("personal_lable <>", value, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableGreaterThan(String value) {
            addCriterion("personal_lable >", value, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableGreaterThanOrEqualTo(String value) {
            addCriterion("personal_lable >=", value, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableLessThan(String value) {
            addCriterion("personal_lable <", value, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableLessThanOrEqualTo(String value) {
            addCriterion("personal_lable <=", value, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableLike(String value) {
            addCriterion("personal_lable like", value, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableNotLike(String value) {
            addCriterion("personal_lable not like", value, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableIn(List<String> values) {
            addCriterion("personal_lable in", values, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableNotIn(List<String> values) {
            addCriterion("personal_lable not in", values, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableBetween(String value1, String value2) {
            addCriterion("personal_lable between", value1, value2, "personalLable");
            return (Criteria) this;
        }

        public Criteria andPersonalLableNotBetween(String value1, String value2) {
            addCriterion("personal_lable not between", value1, value2, "personalLable");
            return (Criteria) this;
        }

        public Criteria andShowCardIsNull() {
            addCriterion("show_card is null");
            return (Criteria) this;
        }

        public Criteria andShowCardIsNotNull() {
            addCriterion("show_card is not null");
            return (Criteria) this;
        }

        public Criteria andShowCardEqualTo(Integer value) {
            addCriterion("show_card =", value, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardNotEqualTo(Integer value) {
            addCriterion("show_card <>", value, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardGreaterThan(Integer value) {
            addCriterion("show_card >", value, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_card >=", value, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardLessThan(Integer value) {
            addCriterion("show_card <", value, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardLessThanOrEqualTo(Integer value) {
            addCriterion("show_card <=", value, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardIn(List<Integer> values) {
            addCriterion("show_card in", values, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardNotIn(List<Integer> values) {
            addCriterion("show_card not in", values, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardBetween(Integer value1, Integer value2) {
            addCriterion("show_card between", value1, value2, "showCard");
            return (Criteria) this;
        }

        public Criteria andShowCardNotBetween(Integer value1, Integer value2) {
            addCriterion("show_card not between", value1, value2, "showCard");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}