package com.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleImagesIsNull() {
            addCriterion("article_images is null");
            return (Criteria) this;
        }

        public Criteria andArticleImagesIsNotNull() {
            addCriterion("article_images is not null");
            return (Criteria) this;
        }

        public Criteria andArticleImagesEqualTo(String value) {
            addCriterion("article_images =", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesNotEqualTo(String value) {
            addCriterion("article_images <>", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesGreaterThan(String value) {
            addCriterion("article_images >", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesGreaterThanOrEqualTo(String value) {
            addCriterion("article_images >=", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesLessThan(String value) {
            addCriterion("article_images <", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesLessThanOrEqualTo(String value) {
            addCriterion("article_images <=", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesLike(String value) {
            addCriterion("article_images like", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesNotLike(String value) {
            addCriterion("article_images not like", value, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesIn(List<String> values) {
            addCriterion("article_images in", values, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesNotIn(List<String> values) {
            addCriterion("article_images not in", values, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesBetween(String value1, String value2) {
            addCriterion("article_images between", value1, value2, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleImagesNotBetween(String value1, String value2) {
            addCriterion("article_images not between", value1, value2, "articleImages");
            return (Criteria) this;
        }

        public Criteria andArticleLableIsNull() {
            addCriterion("article_lable is null");
            return (Criteria) this;
        }

        public Criteria andArticleLableIsNotNull() {
            addCriterion("article_lable is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLableEqualTo(String value) {
            addCriterion("article_lable =", value, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableNotEqualTo(String value) {
            addCriterion("article_lable <>", value, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableGreaterThan(String value) {
            addCriterion("article_lable >", value, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableGreaterThanOrEqualTo(String value) {
            addCriterion("article_lable >=", value, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableLessThan(String value) {
            addCriterion("article_lable <", value, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableLessThanOrEqualTo(String value) {
            addCriterion("article_lable <=", value, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableLike(String value) {
            addCriterion("article_lable like", value, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableNotLike(String value) {
            addCriterion("article_lable not like", value, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableIn(List<String> values) {
            addCriterion("article_lable in", values, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableNotIn(List<String> values) {
            addCriterion("article_lable not in", values, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableBetween(String value1, String value2) {
            addCriterion("article_lable between", value1, value2, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleLableNotBetween(String value1, String value2) {
            addCriterion("article_lable not between", value1, value2, "articleLable");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIsNull() {
            addCriterion("article_create_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIsNotNull() {
            addCriterion("article_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeEqualTo(Date value) {
            addCriterion("article_create_time =", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotEqualTo(Date value) {
            addCriterion("article_create_time <>", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeGreaterThan(Date value) {
            addCriterion("article_create_time >", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_create_time >=", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeLessThan(Date value) {
            addCriterion("article_create_time <", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("article_create_time <=", value, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeIn(List<Date> values) {
            addCriterion("article_create_time in", values, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotIn(List<Date> values) {
            addCriterion("article_create_time not in", values, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("article_create_time between", value1, value2, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("article_create_time not between", value1, value2, "articleCreateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeIsNull() {
            addCriterion("article_update_time is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeIsNotNull() {
            addCriterion("article_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeEqualTo(Date value) {
            addCriterion("article_update_time =", value, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeNotEqualTo(Date value) {
            addCriterion("article_update_time <>", value, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeGreaterThan(Date value) {
            addCriterion("article_update_time >", value, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_update_time >=", value, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeLessThan(Date value) {
            addCriterion("article_update_time <", value, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("article_update_time <=", value, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeIn(List<Date> values) {
            addCriterion("article_update_time in", values, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeNotIn(List<Date> values) {
            addCriterion("article_update_time not in", values, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("article_update_time between", value1, value2, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("article_update_time not between", value1, value2, "articleUpdateTime");
            return (Criteria) this;
        }

        public Criteria andArticleStateIsNull() {
            addCriterion("article_state is null");
            return (Criteria) this;
        }

        public Criteria andArticleStateIsNotNull() {
            addCriterion("article_state is not null");
            return (Criteria) this;
        }

        public Criteria andArticleStateEqualTo(Integer value) {
            addCriterion("article_state =", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotEqualTo(Integer value) {
            addCriterion("article_state <>", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateGreaterThan(Integer value) {
            addCriterion("article_state >", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_state >=", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateLessThan(Integer value) {
            addCriterion("article_state <", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateLessThanOrEqualTo(Integer value) {
            addCriterion("article_state <=", value, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateIn(List<Integer> values) {
            addCriterion("article_state in", values, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotIn(List<Integer> values) {
            addCriterion("article_state not in", values, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateBetween(Integer value1, Integer value2) {
            addCriterion("article_state between", value1, value2, "articleState");
            return (Criteria) this;
        }

        public Criteria andArticleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("article_state not between", value1, value2, "articleState");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNull() {
            addCriterion("classification_id is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIsNotNull() {
            addCriterion("classification_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationIdEqualTo(Long value) {
            addCriterion("classification_id =", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotEqualTo(Long value) {
            addCriterion("classification_id <>", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThan(Long value) {
            addCriterion("classification_id >", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("classification_id >=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThan(Long value) {
            addCriterion("classification_id <", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdLessThanOrEqualTo(Long value) {
            addCriterion("classification_id <=", value, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdIn(List<Long> values) {
            addCriterion("classification_id in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotIn(List<Long> values) {
            addCriterion("classification_id not in", values, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdBetween(Long value1, Long value2) {
            addCriterion("classification_id between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andClassificationIdNotBetween(Long value1, Long value2) {
            addCriterion("classification_id not between", value1, value2, "classificationId");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesIsNull() {
            addCriterion("article_read_times is null");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesIsNotNull() {
            addCriterion("article_read_times is not null");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesEqualTo(Long value) {
            addCriterion("article_read_times =", value, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesNotEqualTo(Long value) {
            addCriterion("article_read_times <>", value, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesGreaterThan(Long value) {
            addCriterion("article_read_times >", value, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesGreaterThanOrEqualTo(Long value) {
            addCriterion("article_read_times >=", value, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesLessThan(Long value) {
            addCriterion("article_read_times <", value, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesLessThanOrEqualTo(Long value) {
            addCriterion("article_read_times <=", value, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesIn(List<Long> values) {
            addCriterion("article_read_times in", values, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesNotIn(List<Long> values) {
            addCriterion("article_read_times not in", values, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesBetween(Long value1, Long value2) {
            addCriterion("article_read_times between", value1, value2, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andArticleReadTimesNotBetween(Long value1, Long value2) {
            addCriterion("article_read_times not between", value1, value2, "articleReadTimes");
            return (Criteria) this;
        }

        public Criteria andReprintIsNull() {
            addCriterion("reprint is null");
            return (Criteria) this;
        }

        public Criteria andReprintIsNotNull() {
            addCriterion("reprint is not null");
            return (Criteria) this;
        }

        public Criteria andReprintEqualTo(Integer value) {
            addCriterion("reprint =", value, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintNotEqualTo(Integer value) {
            addCriterion("reprint <>", value, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintGreaterThan(Integer value) {
            addCriterion("reprint >", value, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintGreaterThanOrEqualTo(Integer value) {
            addCriterion("reprint >=", value, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintLessThan(Integer value) {
            addCriterion("reprint <", value, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintLessThanOrEqualTo(Integer value) {
            addCriterion("reprint <=", value, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintIn(List<Integer> values) {
            addCriterion("reprint in", values, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintNotIn(List<Integer> values) {
            addCriterion("reprint not in", values, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintBetween(Integer value1, Integer value2) {
            addCriterion("reprint between", value1, value2, "reprint");
            return (Criteria) this;
        }

        public Criteria andReprintNotBetween(Integer value1, Integer value2) {
            addCriterion("reprint not between", value1, value2, "reprint");
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