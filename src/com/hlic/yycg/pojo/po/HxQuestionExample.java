package com.hlic.yycg.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class HxQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HxQuestionExample() {
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

        public Criteria andFPkeyIsNull() {
            addCriterion("F_PKEY is null");
            return (Criteria) this;
        }

        public Criteria andFPkeyIsNotNull() {
            addCriterion("F_PKEY is not null");
            return (Criteria) this;
        }

        public Criteria andFPkeyEqualTo(String value) {
            addCriterion("F_PKEY =", value, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyNotEqualTo(String value) {
            addCriterion("F_PKEY <>", value, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyGreaterThan(String value) {
            addCriterion("F_PKEY >", value, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyGreaterThanOrEqualTo(String value) {
            addCriterion("F_PKEY >=", value, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyLessThan(String value) {
            addCriterion("F_PKEY <", value, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyLessThanOrEqualTo(String value) {
            addCriterion("F_PKEY <=", value, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyLike(String value) {
            addCriterion("F_PKEY like", value, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyNotLike(String value) {
            addCriterion("F_PKEY not like", value, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyIn(List<String> values) {
            addCriterion("F_PKEY in", values, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyNotIn(List<String> values) {
            addCriterion("F_PKEY not in", values, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyBetween(String value1, String value2) {
            addCriterion("F_PKEY between", value1, value2, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFPkeyNotBetween(String value1, String value2) {
            addCriterion("F_PKEY not between", value1, value2, "fPkey");
            return (Criteria) this;
        }

        public Criteria andFZdrIsNull() {
            addCriterion("F_ZDR is null");
            return (Criteria) this;
        }

        public Criteria andFZdrIsNotNull() {
            addCriterion("F_ZDR is not null");
            return (Criteria) this;
        }

        public Criteria andFZdrEqualTo(String value) {
            addCriterion("F_ZDR =", value, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrNotEqualTo(String value) {
            addCriterion("F_ZDR <>", value, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrGreaterThan(String value) {
            addCriterion("F_ZDR >", value, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrGreaterThanOrEqualTo(String value) {
            addCriterion("F_ZDR >=", value, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrLessThan(String value) {
            addCriterion("F_ZDR <", value, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrLessThanOrEqualTo(String value) {
            addCriterion("F_ZDR <=", value, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrLike(String value) {
            addCriterion("F_ZDR like", value, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrNotLike(String value) {
            addCriterion("F_ZDR not like", value, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrIn(List<String> values) {
            addCriterion("F_ZDR in", values, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrNotIn(List<String> values) {
            addCriterion("F_ZDR not in", values, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrBetween(String value1, String value2) {
            addCriterion("F_ZDR between", value1, value2, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdrNotBetween(String value1, String value2) {
            addCriterion("F_ZDR not between", value1, value2, "fZdr");
            return (Criteria) this;
        }

        public Criteria andFZdsjIsNull() {
            addCriterion("F_ZDSJ is null");
            return (Criteria) this;
        }

        public Criteria andFZdsjIsNotNull() {
            addCriterion("F_ZDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFZdsjEqualTo(String value) {
            addCriterion("F_ZDSJ =", value, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjNotEqualTo(String value) {
            addCriterion("F_ZDSJ <>", value, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjGreaterThan(String value) {
            addCriterion("F_ZDSJ >", value, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjGreaterThanOrEqualTo(String value) {
            addCriterion("F_ZDSJ >=", value, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjLessThan(String value) {
            addCriterion("F_ZDSJ <", value, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjLessThanOrEqualTo(String value) {
            addCriterion("F_ZDSJ <=", value, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjLike(String value) {
            addCriterion("F_ZDSJ like", value, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjNotLike(String value) {
            addCriterion("F_ZDSJ not like", value, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjIn(List<String> values) {
            addCriterion("F_ZDSJ in", values, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjNotIn(List<String> values) {
            addCriterion("F_ZDSJ not in", values, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjBetween(String value1, String value2) {
            addCriterion("F_ZDSJ between", value1, value2, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFZdsjNotBetween(String value1, String value2) {
            addCriterion("F_ZDSJ not between", value1, value2, "fZdsj");
            return (Criteria) this;
        }

        public Criteria andFWttitleIsNull() {
            addCriterion("F_WTTITLE is null");
            return (Criteria) this;
        }

        public Criteria andFWttitleIsNotNull() {
            addCriterion("F_WTTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFWttitleEqualTo(String value) {
            addCriterion("F_WTTITLE =", value, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleNotEqualTo(String value) {
            addCriterion("F_WTTITLE <>", value, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleGreaterThan(String value) {
            addCriterion("F_WTTITLE >", value, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleGreaterThanOrEqualTo(String value) {
            addCriterion("F_WTTITLE >=", value, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleLessThan(String value) {
            addCriterion("F_WTTITLE <", value, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleLessThanOrEqualTo(String value) {
            addCriterion("F_WTTITLE <=", value, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleLike(String value) {
            addCriterion("F_WTTITLE like", value, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleNotLike(String value) {
            addCriterion("F_WTTITLE not like", value, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleIn(List<String> values) {
            addCriterion("F_WTTITLE in", values, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleNotIn(List<String> values) {
            addCriterion("F_WTTITLE not in", values, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleBetween(String value1, String value2) {
            addCriterion("F_WTTITLE between", value1, value2, "fWttitle");
            return (Criteria) this;
        }

        public Criteria andFWttitleNotBetween(String value1, String value2) {
            addCriterion("F_WTTITLE not between", value1, value2, "fWttitle");
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

        public Criteria andFProjectIsNull() {
            addCriterion("F_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andFProjectIsNotNull() {
            addCriterion("F_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andFProjectEqualTo(String value) {
            addCriterion("F_PROJECT =", value, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectNotEqualTo(String value) {
            addCriterion("F_PROJECT <>", value, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectGreaterThan(String value) {
            addCriterion("F_PROJECT >", value, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectGreaterThanOrEqualTo(String value) {
            addCriterion("F_PROJECT >=", value, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectLessThan(String value) {
            addCriterion("F_PROJECT <", value, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectLessThanOrEqualTo(String value) {
            addCriterion("F_PROJECT <=", value, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectLike(String value) {
            addCriterion("F_PROJECT like", value, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectNotLike(String value) {
            addCriterion("F_PROJECT not like", value, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectIn(List<String> values) {
            addCriterion("F_PROJECT in", values, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectNotIn(List<String> values) {
            addCriterion("F_PROJECT not in", values, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectBetween(String value1, String value2) {
            addCriterion("F_PROJECT between", value1, value2, "fProject");
            return (Criteria) this;
        }

        public Criteria andFProjectNotBetween(String value1, String value2) {
            addCriterion("F_PROJECT not between", value1, value2, "fProject");
            return (Criteria) this;
        }

        public Criteria andFClickIsNull() {
            addCriterion("F_CLICK is null");
            return (Criteria) this;
        }

        public Criteria andFClickIsNotNull() {
            addCriterion("F_CLICK is not null");
            return (Criteria) this;
        }

        public Criteria andFClickEqualTo(Integer value) {
            addCriterion("F_CLICK =", value, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickNotEqualTo(Integer value) {
            addCriterion("F_CLICK <>", value, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickGreaterThan(Integer value) {
            addCriterion("F_CLICK >", value, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_CLICK >=", value, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickLessThan(Integer value) {
            addCriterion("F_CLICK <", value, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickLessThanOrEqualTo(Integer value) {
            addCriterion("F_CLICK <=", value, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickIn(List<Integer> values) {
            addCriterion("F_CLICK in", values, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickNotIn(List<Integer> values) {
            addCriterion("F_CLICK not in", values, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickBetween(Integer value1, Integer value2) {
            addCriterion("F_CLICK between", value1, value2, "fClick");
            return (Criteria) this;
        }

        public Criteria andFClickNotBetween(Integer value1, Integer value2) {
            addCriterion("F_CLICK not between", value1, value2, "fClick");
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