package com.hlic.yycg.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class HxQuertionMxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HxQuertionMxExample() {
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

        public Criteria andFSsdjbhIsNull() {
            addCriterion("F_SSDJBH is null");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhIsNotNull() {
            addCriterion("F_SSDJBH is not null");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhEqualTo(String value) {
            addCriterion("F_SSDJBH =", value, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhNotEqualTo(String value) {
            addCriterion("F_SSDJBH <>", value, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhGreaterThan(String value) {
            addCriterion("F_SSDJBH >", value, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhGreaterThanOrEqualTo(String value) {
            addCriterion("F_SSDJBH >=", value, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhLessThan(String value) {
            addCriterion("F_SSDJBH <", value, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhLessThanOrEqualTo(String value) {
            addCriterion("F_SSDJBH <=", value, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhLike(String value) {
            addCriterion("F_SSDJBH like", value, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhNotLike(String value) {
            addCriterion("F_SSDJBH not like", value, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhIn(List<String> values) {
            addCriterion("F_SSDJBH in", values, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhNotIn(List<String> values) {
            addCriterion("F_SSDJBH not in", values, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhBetween(String value1, String value2) {
            addCriterion("F_SSDJBH between", value1, value2, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFSsdjbhNotBetween(String value1, String value2) {
            addCriterion("F_SSDJBH not between", value1, value2, "fSsdjbh");
            return (Criteria) this;
        }

        public Criteria andFHdrIsNull() {
            addCriterion("F_HDR is null");
            return (Criteria) this;
        }

        public Criteria andFHdrIsNotNull() {
            addCriterion("F_HDR is not null");
            return (Criteria) this;
        }

        public Criteria andFHdrEqualTo(String value) {
            addCriterion("F_HDR =", value, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrNotEqualTo(String value) {
            addCriterion("F_HDR <>", value, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrGreaterThan(String value) {
            addCriterion("F_HDR >", value, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrGreaterThanOrEqualTo(String value) {
            addCriterion("F_HDR >=", value, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrLessThan(String value) {
            addCriterion("F_HDR <", value, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrLessThanOrEqualTo(String value) {
            addCriterion("F_HDR <=", value, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrLike(String value) {
            addCriterion("F_HDR like", value, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrNotLike(String value) {
            addCriterion("F_HDR not like", value, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrIn(List<String> values) {
            addCriterion("F_HDR in", values, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrNotIn(List<String> values) {
            addCriterion("F_HDR not in", values, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrBetween(String value1, String value2) {
            addCriterion("F_HDR between", value1, value2, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdrNotBetween(String value1, String value2) {
            addCriterion("F_HDR not between", value1, value2, "fHdr");
            return (Criteria) this;
        }

        public Criteria andFHdsjIsNull() {
            addCriterion("F_HDSJ is null");
            return (Criteria) this;
        }

        public Criteria andFHdsjIsNotNull() {
            addCriterion("F_HDSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFHdsjEqualTo(String value) {
            addCriterion("F_HDSJ =", value, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjNotEqualTo(String value) {
            addCriterion("F_HDSJ <>", value, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjGreaterThan(String value) {
            addCriterion("F_HDSJ >", value, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjGreaterThanOrEqualTo(String value) {
            addCriterion("F_HDSJ >=", value, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjLessThan(String value) {
            addCriterion("F_HDSJ <", value, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjLessThanOrEqualTo(String value) {
            addCriterion("F_HDSJ <=", value, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjLike(String value) {
            addCriterion("F_HDSJ like", value, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjNotLike(String value) {
            addCriterion("F_HDSJ not like", value, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjIn(List<String> values) {
            addCriterion("F_HDSJ in", values, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjNotIn(List<String> values) {
            addCriterion("F_HDSJ not in", values, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjBetween(String value1, String value2) {
            addCriterion("F_HDSJ between", value1, value2, "fHdsj");
            return (Criteria) this;
        }

        public Criteria andFHdsjNotBetween(String value1, String value2) {
            addCriterion("F_HDSJ not between", value1, value2, "fHdsj");
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