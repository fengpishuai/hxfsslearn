package com.hlic.gools.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class GoolsPoolsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoolsPoolsExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("F_ID is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("F_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(String value) {
            addCriterion("F_ID =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(String value) {
            addCriterion("F_ID <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(String value) {
            addCriterion("F_ID >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_ID >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(String value) {
            addCriterion("F_ID <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(String value) {
            addCriterion("F_ID <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLike(String value) {
            addCriterion("F_ID like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotLike(String value) {
            addCriterion("F_ID not like", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<String> values) {
            addCriterion("F_ID in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<String> values) {
            addCriterion("F_ID not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(String value1, String value2) {
            addCriterion("F_ID between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(String value1, String value2) {
            addCriterion("F_ID not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFSpmcIsNull() {
            addCriterion("F_SPMC is null");
            return (Criteria) this;
        }

        public Criteria andFSpmcIsNotNull() {
            addCriterion("F_SPMC is not null");
            return (Criteria) this;
        }

        public Criteria andFSpmcEqualTo(String value) {
            addCriterion("F_SPMC =", value, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcNotEqualTo(String value) {
            addCriterion("F_SPMC <>", value, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcGreaterThan(String value) {
            addCriterion("F_SPMC >", value, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcGreaterThanOrEqualTo(String value) {
            addCriterion("F_SPMC >=", value, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcLessThan(String value) {
            addCriterion("F_SPMC <", value, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcLessThanOrEqualTo(String value) {
            addCriterion("F_SPMC <=", value, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcLike(String value) {
            addCriterion("F_SPMC like", value, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcNotLike(String value) {
            addCriterion("F_SPMC not like", value, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcIn(List<String> values) {
            addCriterion("F_SPMC in", values, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcNotIn(List<String> values) {
            addCriterion("F_SPMC not in", values, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcBetween(String value1, String value2) {
            addCriterion("F_SPMC between", value1, value2, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpmcNotBetween(String value1, String value2) {
            addCriterion("F_SPMC not between", value1, value2, "fSpmc");
            return (Criteria) this;
        }

        public Criteria andFSpbhIsNull() {
            addCriterion("F_SPBH is null");
            return (Criteria) this;
        }

        public Criteria andFSpbhIsNotNull() {
            addCriterion("F_SPBH is not null");
            return (Criteria) this;
        }

        public Criteria andFSpbhEqualTo(String value) {
            addCriterion("F_SPBH =", value, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhNotEqualTo(String value) {
            addCriterion("F_SPBH <>", value, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhGreaterThan(String value) {
            addCriterion("F_SPBH >", value, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhGreaterThanOrEqualTo(String value) {
            addCriterion("F_SPBH >=", value, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhLessThan(String value) {
            addCriterion("F_SPBH <", value, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhLessThanOrEqualTo(String value) {
            addCriterion("F_SPBH <=", value, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhLike(String value) {
            addCriterion("F_SPBH like", value, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhNotLike(String value) {
            addCriterion("F_SPBH not like", value, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhIn(List<String> values) {
            addCriterion("F_SPBH in", values, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhNotIn(List<String> values) {
            addCriterion("F_SPBH not in", values, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhBetween(String value1, String value2) {
            addCriterion("F_SPBH between", value1, value2, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFSpbhNotBetween(String value1, String value2) {
            addCriterion("F_SPBH not between", value1, value2, "fSpbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhIsNull() {
            addCriterion("F_GHSBH is null");
            return (Criteria) this;
        }

        public Criteria andFGhsbhIsNotNull() {
            addCriterion("F_GHSBH is not null");
            return (Criteria) this;
        }

        public Criteria andFGhsbhEqualTo(String value) {
            addCriterion("F_GHSBH =", value, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhNotEqualTo(String value) {
            addCriterion("F_GHSBH <>", value, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhGreaterThan(String value) {
            addCriterion("F_GHSBH >", value, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhGreaterThanOrEqualTo(String value) {
            addCriterion("F_GHSBH >=", value, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhLessThan(String value) {
            addCriterion("F_GHSBH <", value, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhLessThanOrEqualTo(String value) {
            addCriterion("F_GHSBH <=", value, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhLike(String value) {
            addCriterion("F_GHSBH like", value, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhNotLike(String value) {
            addCriterion("F_GHSBH not like", value, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhIn(List<String> values) {
            addCriterion("F_GHSBH in", values, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhNotIn(List<String> values) {
            addCriterion("F_GHSBH not in", values, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhBetween(String value1, String value2) {
            addCriterion("F_GHSBH between", value1, value2, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFGhsbhNotBetween(String value1, String value2) {
            addCriterion("F_GHSBH not between", value1, value2, "fGhsbh");
            return (Criteria) this;
        }

        public Criteria andFJeIsNull() {
            addCriterion("F_JE is null");
            return (Criteria) this;
        }

        public Criteria andFJeIsNotNull() {
            addCriterion("F_JE is not null");
            return (Criteria) this;
        }

        public Criteria andFJeEqualTo(String value) {
            addCriterion("F_JE =", value, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeNotEqualTo(String value) {
            addCriterion("F_JE <>", value, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeGreaterThan(String value) {
            addCriterion("F_JE >", value, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeGreaterThanOrEqualTo(String value) {
            addCriterion("F_JE >=", value, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeLessThan(String value) {
            addCriterion("F_JE <", value, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeLessThanOrEqualTo(String value) {
            addCriterion("F_JE <=", value, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeLike(String value) {
            addCriterion("F_JE like", value, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeNotLike(String value) {
            addCriterion("F_JE not like", value, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeIn(List<String> values) {
            addCriterion("F_JE in", values, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeNotIn(List<String> values) {
            addCriterion("F_JE not in", values, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeBetween(String value1, String value2) {
            addCriterion("F_JE between", value1, value2, "fJe");
            return (Criteria) this;
        }

        public Criteria andFJeNotBetween(String value1, String value2) {
            addCriterion("F_JE not between", value1, value2, "fJe");
            return (Criteria) this;
        }

        public Criteria andFDisableIsNull() {
            addCriterion("F_DISABLE is null");
            return (Criteria) this;
        }

        public Criteria andFDisableIsNotNull() {
            addCriterion("F_DISABLE is not null");
            return (Criteria) this;
        }

        public Criteria andFDisableEqualTo(String value) {
            addCriterion("F_DISABLE =", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableNotEqualTo(String value) {
            addCriterion("F_DISABLE <>", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableGreaterThan(String value) {
            addCriterion("F_DISABLE >", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableGreaterThanOrEqualTo(String value) {
            addCriterion("F_DISABLE >=", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableLessThan(String value) {
            addCriterion("F_DISABLE <", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableLessThanOrEqualTo(String value) {
            addCriterion("F_DISABLE <=", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableLike(String value) {
            addCriterion("F_DISABLE like", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableNotLike(String value) {
            addCriterion("F_DISABLE not like", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableIn(List<String> values) {
            addCriterion("F_DISABLE in", values, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableNotIn(List<String> values) {
            addCriterion("F_DISABLE not in", values, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableBetween(String value1, String value2) {
            addCriterion("F_DISABLE between", value1, value2, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableNotBetween(String value1, String value2) {
            addCriterion("F_DISABLE not between", value1, value2, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFT1IsNull() {
            addCriterion("F_T1 is null");
            return (Criteria) this;
        }

        public Criteria andFT1IsNotNull() {
            addCriterion("F_T1 is not null");
            return (Criteria) this;
        }

        public Criteria andFT1EqualTo(String value) {
            addCriterion("F_T1 =", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1NotEqualTo(String value) {
            addCriterion("F_T1 <>", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1GreaterThan(String value) {
            addCriterion("F_T1 >", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1GreaterThanOrEqualTo(String value) {
            addCriterion("F_T1 >=", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1LessThan(String value) {
            addCriterion("F_T1 <", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1LessThanOrEqualTo(String value) {
            addCriterion("F_T1 <=", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1Like(String value) {
            addCriterion("F_T1 like", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1NotLike(String value) {
            addCriterion("F_T1 not like", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1In(List<String> values) {
            addCriterion("F_T1 in", values, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1NotIn(List<String> values) {
            addCriterion("F_T1 not in", values, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1Between(String value1, String value2) {
            addCriterion("F_T1 between", value1, value2, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1NotBetween(String value1, String value2) {
            addCriterion("F_T1 not between", value1, value2, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT2IsNull() {
            addCriterion("F_T2 is null");
            return (Criteria) this;
        }

        public Criteria andFT2IsNotNull() {
            addCriterion("F_T2 is not null");
            return (Criteria) this;
        }

        public Criteria andFT2EqualTo(String value) {
            addCriterion("F_T2 =", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2NotEqualTo(String value) {
            addCriterion("F_T2 <>", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2GreaterThan(String value) {
            addCriterion("F_T2 >", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2GreaterThanOrEqualTo(String value) {
            addCriterion("F_T2 >=", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2LessThan(String value) {
            addCriterion("F_T2 <", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2LessThanOrEqualTo(String value) {
            addCriterion("F_T2 <=", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2Like(String value) {
            addCriterion("F_T2 like", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2NotLike(String value) {
            addCriterion("F_T2 not like", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2In(List<String> values) {
            addCriterion("F_T2 in", values, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2NotIn(List<String> values) {
            addCriterion("F_T2 not in", values, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2Between(String value1, String value2) {
            addCriterion("F_T2 between", value1, value2, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2NotBetween(String value1, String value2) {
            addCriterion("F_T2 not between", value1, value2, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT3IsNull() {
            addCriterion("F_T3 is null");
            return (Criteria) this;
        }

        public Criteria andFT3IsNotNull() {
            addCriterion("F_T3 is not null");
            return (Criteria) this;
        }

        public Criteria andFT3EqualTo(String value) {
            addCriterion("F_T3 =", value, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3NotEqualTo(String value) {
            addCriterion("F_T3 <>", value, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3GreaterThan(String value) {
            addCriterion("F_T3 >", value, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3GreaterThanOrEqualTo(String value) {
            addCriterion("F_T3 >=", value, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3LessThan(String value) {
            addCriterion("F_T3 <", value, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3LessThanOrEqualTo(String value) {
            addCriterion("F_T3 <=", value, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3Like(String value) {
            addCriterion("F_T3 like", value, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3NotLike(String value) {
            addCriterion("F_T3 not like", value, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3In(List<String> values) {
            addCriterion("F_T3 in", values, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3NotIn(List<String> values) {
            addCriterion("F_T3 not in", values, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3Between(String value1, String value2) {
            addCriterion("F_T3 between", value1, value2, "fT3");
            return (Criteria) this;
        }

        public Criteria andFT3NotBetween(String value1, String value2) {
            addCriterion("F_T3 not between", value1, value2, "fT3");
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