package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class DofSnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DofSnExample() {
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

        public Criteria andSnIdIsNull() {
            addCriterion("SN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSnIdIsNotNull() {
            addCriterion("SN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSnIdEqualTo(String value) {
            addCriterion("SN_ID =", value, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdNotEqualTo(String value) {
            addCriterion("SN_ID <>", value, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdGreaterThan(String value) {
            addCriterion("SN_ID >", value, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdGreaterThanOrEqualTo(String value) {
            addCriterion("SN_ID >=", value, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdLessThan(String value) {
            addCriterion("SN_ID <", value, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdLessThanOrEqualTo(String value) {
            addCriterion("SN_ID <=", value, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdLike(String value) {
            addCriterion("SN_ID like", value, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdNotLike(String value) {
            addCriterion("SN_ID not like", value, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdIn(List<String> values) {
            addCriterion("SN_ID in", values, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdNotIn(List<String> values) {
            addCriterion("SN_ID not in", values, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdBetween(String value1, String value2) {
            addCriterion("SN_ID between", value1, value2, "snId");
            return (Criteria) this;
        }

        public Criteria andSnIdNotBetween(String value1, String value2) {
            addCriterion("SN_ID not between", value1, value2, "snId");
            return (Criteria) this;
        }

        public Criteria andSnNameIsNull() {
            addCriterion("SN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSnNameIsNotNull() {
            addCriterion("SN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSnNameEqualTo(String value) {
            addCriterion("SN_NAME =", value, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameNotEqualTo(String value) {
            addCriterion("SN_NAME <>", value, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameGreaterThan(String value) {
            addCriterion("SN_NAME >", value, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameGreaterThanOrEqualTo(String value) {
            addCriterion("SN_NAME >=", value, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameLessThan(String value) {
            addCriterion("SN_NAME <", value, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameLessThanOrEqualTo(String value) {
            addCriterion("SN_NAME <=", value, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameLike(String value) {
            addCriterion("SN_NAME like", value, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameNotLike(String value) {
            addCriterion("SN_NAME not like", value, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameIn(List<String> values) {
            addCriterion("SN_NAME in", values, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameNotIn(List<String> values) {
            addCriterion("SN_NAME not in", values, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameBetween(String value1, String value2) {
            addCriterion("SN_NAME between", value1, value2, "snName");
            return (Criteria) this;
        }

        public Criteria andSnNameNotBetween(String value1, String value2) {
            addCriterion("SN_NAME not between", value1, value2, "snName");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedIsNull() {
            addCriterion("SN_ELEMENT_FIXED is null");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedIsNotNull() {
            addCriterion("SN_ELEMENT_FIXED is not null");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedEqualTo(String value) {
            addCriterion("SN_ELEMENT_FIXED =", value, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedNotEqualTo(String value) {
            addCriterion("SN_ELEMENT_FIXED <>", value, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedGreaterThan(String value) {
            addCriterion("SN_ELEMENT_FIXED >", value, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedGreaterThanOrEqualTo(String value) {
            addCriterion("SN_ELEMENT_FIXED >=", value, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedLessThan(String value) {
            addCriterion("SN_ELEMENT_FIXED <", value, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedLessThanOrEqualTo(String value) {
            addCriterion("SN_ELEMENT_FIXED <=", value, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedLike(String value) {
            addCriterion("SN_ELEMENT_FIXED like", value, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedNotLike(String value) {
            addCriterion("SN_ELEMENT_FIXED not like", value, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedIn(List<String> values) {
            addCriterion("SN_ELEMENT_FIXED in", values, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedNotIn(List<String> values) {
            addCriterion("SN_ELEMENT_FIXED not in", values, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedBetween(String value1, String value2) {
            addCriterion("SN_ELEMENT_FIXED between", value1, value2, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementFixedNotBetween(String value1, String value2) {
            addCriterion("SN_ELEMENT_FIXED not between", value1, value2, "snElementFixed");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeIsNull() {
            addCriterion("SN_ELEMENT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeIsNotNull() {
            addCriterion("SN_ELEMENT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeEqualTo(String value) {
            addCriterion("SN_ELEMENT_TIME =", value, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeNotEqualTo(String value) {
            addCriterion("SN_ELEMENT_TIME <>", value, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeGreaterThan(String value) {
            addCriterion("SN_ELEMENT_TIME >", value, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SN_ELEMENT_TIME >=", value, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeLessThan(String value) {
            addCriterion("SN_ELEMENT_TIME <", value, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeLessThanOrEqualTo(String value) {
            addCriterion("SN_ELEMENT_TIME <=", value, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeLike(String value) {
            addCriterion("SN_ELEMENT_TIME like", value, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeNotLike(String value) {
            addCriterion("SN_ELEMENT_TIME not like", value, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeIn(List<String> values) {
            addCriterion("SN_ELEMENT_TIME in", values, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeNotIn(List<String> values) {
            addCriterion("SN_ELEMENT_TIME not in", values, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeBetween(String value1, String value2) {
            addCriterion("SN_ELEMENT_TIME between", value1, value2, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementTimeNotBetween(String value1, String value2) {
            addCriterion("SN_ELEMENT_TIME not between", value1, value2, "snElementTime");
            return (Criteria) this;
        }

        public Criteria andSnElementNumIsNull() {
            addCriterion("SN_ELEMENT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSnElementNumIsNotNull() {
            addCriterion("SN_ELEMENT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSnElementNumEqualTo(String value) {
            addCriterion("SN_ELEMENT_NUM =", value, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumNotEqualTo(String value) {
            addCriterion("SN_ELEMENT_NUM <>", value, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumGreaterThan(String value) {
            addCriterion("SN_ELEMENT_NUM >", value, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumGreaterThanOrEqualTo(String value) {
            addCriterion("SN_ELEMENT_NUM >=", value, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumLessThan(String value) {
            addCriterion("SN_ELEMENT_NUM <", value, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumLessThanOrEqualTo(String value) {
            addCriterion("SN_ELEMENT_NUM <=", value, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumLike(String value) {
            addCriterion("SN_ELEMENT_NUM like", value, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumNotLike(String value) {
            addCriterion("SN_ELEMENT_NUM not like", value, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumIn(List<String> values) {
            addCriterion("SN_ELEMENT_NUM in", values, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumNotIn(List<String> values) {
            addCriterion("SN_ELEMENT_NUM not in", values, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumBetween(String value1, String value2) {
            addCriterion("SN_ELEMENT_NUM between", value1, value2, "snElementNum");
            return (Criteria) this;
        }

        public Criteria andSnElementNumNotBetween(String value1, String value2) {
            addCriterion("SN_ELEMENT_NUM not between", value1, value2, "snElementNum");
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