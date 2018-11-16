package com.hlic.base.pojo.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ScAttachExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScAttachExample() {
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

        public Criteria andFPoolIdIsNull() {
            addCriterion("F_POOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFPoolIdIsNotNull() {
            addCriterion("F_POOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFPoolIdEqualTo(String value) {
            addCriterion("F_POOL_ID =", value, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdNotEqualTo(String value) {
            addCriterion("F_POOL_ID <>", value, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdGreaterThan(String value) {
            addCriterion("F_POOL_ID >", value, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_POOL_ID >=", value, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdLessThan(String value) {
            addCriterion("F_POOL_ID <", value, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdLessThanOrEqualTo(String value) {
            addCriterion("F_POOL_ID <=", value, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdLike(String value) {
            addCriterion("F_POOL_ID like", value, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdNotLike(String value) {
            addCriterion("F_POOL_ID not like", value, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdIn(List<String> values) {
            addCriterion("F_POOL_ID in", values, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdNotIn(List<String> values) {
            addCriterion("F_POOL_ID not in", values, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdBetween(String value1, String value2) {
            addCriterion("F_POOL_ID between", value1, value2, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFPoolIdNotBetween(String value1, String value2) {
            addCriterion("F_POOL_ID not between", value1, value2, "fPoolId");
            return (Criteria) this;
        }

        public Criteria andFBillYearIsNull() {
            addCriterion("F_BILL_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andFBillYearIsNotNull() {
            addCriterion("F_BILL_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andFBillYearEqualTo(String value) {
            addCriterion("F_BILL_YEAR =", value, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearNotEqualTo(String value) {
            addCriterion("F_BILL_YEAR <>", value, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearGreaterThan(String value) {
            addCriterion("F_BILL_YEAR >", value, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearGreaterThanOrEqualTo(String value) {
            addCriterion("F_BILL_YEAR >=", value, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearLessThan(String value) {
            addCriterion("F_BILL_YEAR <", value, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearLessThanOrEqualTo(String value) {
            addCriterion("F_BILL_YEAR <=", value, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearLike(String value) {
            addCriterion("F_BILL_YEAR like", value, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearNotLike(String value) {
            addCriterion("F_BILL_YEAR not like", value, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearIn(List<String> values) {
            addCriterion("F_BILL_YEAR in", values, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearNotIn(List<String> values) {
            addCriterion("F_BILL_YEAR not in", values, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearBetween(String value1, String value2) {
            addCriterion("F_BILL_YEAR between", value1, value2, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillYearNotBetween(String value1, String value2) {
            addCriterion("F_BILL_YEAR not between", value1, value2, "fBillYear");
            return (Criteria) this;
        }

        public Criteria andFBillMonthIsNull() {
            addCriterion("F_BILL_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andFBillMonthIsNotNull() {
            addCriterion("F_BILL_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andFBillMonthEqualTo(String value) {
            addCriterion("F_BILL_MONTH =", value, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthNotEqualTo(String value) {
            addCriterion("F_BILL_MONTH <>", value, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthGreaterThan(String value) {
            addCriterion("F_BILL_MONTH >", value, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthGreaterThanOrEqualTo(String value) {
            addCriterion("F_BILL_MONTH >=", value, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthLessThan(String value) {
            addCriterion("F_BILL_MONTH <", value, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthLessThanOrEqualTo(String value) {
            addCriterion("F_BILL_MONTH <=", value, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthLike(String value) {
            addCriterion("F_BILL_MONTH like", value, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthNotLike(String value) {
            addCriterion("F_BILL_MONTH not like", value, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthIn(List<String> values) {
            addCriterion("F_BILL_MONTH in", values, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthNotIn(List<String> values) {
            addCriterion("F_BILL_MONTH not in", values, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthBetween(String value1, String value2) {
            addCriterion("F_BILL_MONTH between", value1, value2, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillMonthNotBetween(String value1, String value2) {
            addCriterion("F_BILL_MONTH not between", value1, value2, "fBillMonth");
            return (Criteria) this;
        }

        public Criteria andFBillIdIsNull() {
            addCriterion("F_BILL_ID is null");
            return (Criteria) this;
        }

        public Criteria andFBillIdIsNotNull() {
            addCriterion("F_BILL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFBillIdEqualTo(String value) {
            addCriterion("F_BILL_ID =", value, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdNotEqualTo(String value) {
            addCriterion("F_BILL_ID <>", value, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdGreaterThan(String value) {
            addCriterion("F_BILL_ID >", value, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_BILL_ID >=", value, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdLessThan(String value) {
            addCriterion("F_BILL_ID <", value, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdLessThanOrEqualTo(String value) {
            addCriterion("F_BILL_ID <=", value, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdLike(String value) {
            addCriterion("F_BILL_ID like", value, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdNotLike(String value) {
            addCriterion("F_BILL_ID not like", value, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdIn(List<String> values) {
            addCriterion("F_BILL_ID in", values, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdNotIn(List<String> values) {
            addCriterion("F_BILL_ID not in", values, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdBetween(String value1, String value2) {
            addCriterion("F_BILL_ID between", value1, value2, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFBillIdNotBetween(String value1, String value2) {
            addCriterion("F_BILL_ID not between", value1, value2, "fBillId");
            return (Criteria) this;
        }

        public Criteria andFAttTypeIsNull() {
            addCriterion("F_ATT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFAttTypeIsNotNull() {
            addCriterion("F_ATT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFAttTypeEqualTo(String value) {
            addCriterion("F_ATT_TYPE =", value, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeNotEqualTo(String value) {
            addCriterion("F_ATT_TYPE <>", value, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeGreaterThan(String value) {
            addCriterion("F_ATT_TYPE >", value, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_ATT_TYPE >=", value, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeLessThan(String value) {
            addCriterion("F_ATT_TYPE <", value, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeLessThanOrEqualTo(String value) {
            addCriterion("F_ATT_TYPE <=", value, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeLike(String value) {
            addCriterion("F_ATT_TYPE like", value, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeNotLike(String value) {
            addCriterion("F_ATT_TYPE not like", value, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeIn(List<String> values) {
            addCriterion("F_ATT_TYPE in", values, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeNotIn(List<String> values) {
            addCriterion("F_ATT_TYPE not in", values, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeBetween(String value1, String value2) {
            addCriterion("F_ATT_TYPE between", value1, value2, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttTypeNotBetween(String value1, String value2) {
            addCriterion("F_ATT_TYPE not between", value1, value2, "fAttType");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyIsNull() {
            addCriterion("F_ATT_STO_KEY is null");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyIsNotNull() {
            addCriterion("F_ATT_STO_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyEqualTo(String value) {
            addCriterion("F_ATT_STO_KEY =", value, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyNotEqualTo(String value) {
            addCriterion("F_ATT_STO_KEY <>", value, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyGreaterThan(String value) {
            addCriterion("F_ATT_STO_KEY >", value, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyGreaterThanOrEqualTo(String value) {
            addCriterion("F_ATT_STO_KEY >=", value, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyLessThan(String value) {
            addCriterion("F_ATT_STO_KEY <", value, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyLessThanOrEqualTo(String value) {
            addCriterion("F_ATT_STO_KEY <=", value, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyLike(String value) {
            addCriterion("F_ATT_STO_KEY like", value, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyNotLike(String value) {
            addCriterion("F_ATT_STO_KEY not like", value, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyIn(List<String> values) {
            addCriterion("F_ATT_STO_KEY in", values, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyNotIn(List<String> values) {
            addCriterion("F_ATT_STO_KEY not in", values, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyBetween(String value1, String value2) {
            addCriterion("F_ATT_STO_KEY between", value1, value2, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttStoKeyNotBetween(String value1, String value2) {
            addCriterion("F_ATT_STO_KEY not between", value1, value2, "fAttStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttTitleIsNull() {
            addCriterion("F_ATT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andFAttTitleIsNotNull() {
            addCriterion("F_ATT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andFAttTitleEqualTo(String value) {
            addCriterion("F_ATT_TITLE =", value, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleNotEqualTo(String value) {
            addCriterion("F_ATT_TITLE <>", value, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleGreaterThan(String value) {
            addCriterion("F_ATT_TITLE >", value, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleGreaterThanOrEqualTo(String value) {
            addCriterion("F_ATT_TITLE >=", value, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleLessThan(String value) {
            addCriterion("F_ATT_TITLE <", value, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleLessThanOrEqualTo(String value) {
            addCriterion("F_ATT_TITLE <=", value, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleLike(String value) {
            addCriterion("F_ATT_TITLE like", value, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleNotLike(String value) {
            addCriterion("F_ATT_TITLE not like", value, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleIn(List<String> values) {
            addCriterion("F_ATT_TITLE in", values, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleNotIn(List<String> values) {
            addCriterion("F_ATT_TITLE not in", values, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleBetween(String value1, String value2) {
            addCriterion("F_ATT_TITLE between", value1, value2, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttTitleNotBetween(String value1, String value2) {
            addCriterion("F_ATT_TITLE not between", value1, value2, "fAttTitle");
            return (Criteria) this;
        }

        public Criteria andFAttSizeIsNull() {
            addCriterion("F_ATT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFAttSizeIsNotNull() {
            addCriterion("F_ATT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFAttSizeEqualTo(Integer value) {
            addCriterion("F_ATT_SIZE =", value, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeNotEqualTo(Integer value) {
            addCriterion("F_ATT_SIZE <>", value, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeGreaterThan(Integer value) {
            addCriterion("F_ATT_SIZE >", value, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ATT_SIZE >=", value, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeLessThan(Integer value) {
            addCriterion("F_ATT_SIZE <", value, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeLessThanOrEqualTo(Integer value) {
            addCriterion("F_ATT_SIZE <=", value, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeIn(List<Integer> values) {
            addCriterion("F_ATT_SIZE in", values, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeNotIn(List<Integer> values) {
            addCriterion("F_ATT_SIZE not in", values, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeBetween(Integer value1, Integer value2) {
            addCriterion("F_ATT_SIZE between", value1, value2, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFAttSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ATT_SIZE not between", value1, value2, "fAttSize");
            return (Criteria) this;
        }

        public Criteria andFUpTimeIsNull() {
            addCriterion("F_UP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFUpTimeIsNotNull() {
            addCriterion("F_UP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFUpTimeEqualTo(String value) {
            addCriterion("F_UP_TIME =", value, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeNotEqualTo(String value) {
            addCriterion("F_UP_TIME <>", value, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeGreaterThan(String value) {
            addCriterion("F_UP_TIME >", value, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_UP_TIME >=", value, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeLessThan(String value) {
            addCriterion("F_UP_TIME <", value, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeLessThanOrEqualTo(String value) {
            addCriterion("F_UP_TIME <=", value, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeLike(String value) {
            addCriterion("F_UP_TIME like", value, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeNotLike(String value) {
            addCriterion("F_UP_TIME not like", value, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeIn(List<String> values) {
            addCriterion("F_UP_TIME in", values, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeNotIn(List<String> values) {
            addCriterion("F_UP_TIME not in", values, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeBetween(String value1, String value2) {
            addCriterion("F_UP_TIME between", value1, value2, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFUpTimeNotBetween(String value1, String value2) {
            addCriterion("F_UP_TIME not between", value1, value2, "fUpTime");
            return (Criteria) this;
        }

        public Criteria andFBizInfoIsNull() {
            addCriterion("F_BIZ_INFO is null");
            return (Criteria) this;
        }

        public Criteria andFBizInfoIsNotNull() {
            addCriterion("F_BIZ_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andFBizInfoEqualTo(String value) {
            addCriterion("F_BIZ_INFO =", value, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoNotEqualTo(String value) {
            addCriterion("F_BIZ_INFO <>", value, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoGreaterThan(String value) {
            addCriterion("F_BIZ_INFO >", value, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoGreaterThanOrEqualTo(String value) {
            addCriterion("F_BIZ_INFO >=", value, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoLessThan(String value) {
            addCriterion("F_BIZ_INFO <", value, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoLessThanOrEqualTo(String value) {
            addCriterion("F_BIZ_INFO <=", value, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoLike(String value) {
            addCriterion("F_BIZ_INFO like", value, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoNotLike(String value) {
            addCriterion("F_BIZ_INFO not like", value, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoIn(List<String> values) {
            addCriterion("F_BIZ_INFO in", values, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoNotIn(List<String> values) {
            addCriterion("F_BIZ_INFO not in", values, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoBetween(String value1, String value2) {
            addCriterion("F_BIZ_INFO between", value1, value2, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFBizInfoNotBetween(String value1, String value2) {
            addCriterion("F_BIZ_INFO not between", value1, value2, "fBizInfo");
            return (Criteria) this;
        }

        public Criteria andFAmtIsNull() {
            addCriterion("F_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFAmtIsNotNull() {
            addCriterion("F_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFAmtEqualTo(BigDecimal value) {
            addCriterion("F_AMT =", value, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtNotEqualTo(BigDecimal value) {
            addCriterion("F_AMT <>", value, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtGreaterThan(BigDecimal value) {
            addCriterion("F_AMT >", value, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("F_AMT >=", value, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtLessThan(BigDecimal value) {
            addCriterion("F_AMT <", value, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("F_AMT <=", value, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtIn(List<BigDecimal> values) {
            addCriterion("F_AMT in", values, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtNotIn(List<BigDecimal> values) {
            addCriterion("F_AMT not in", values, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_AMT between", value1, value2, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_AMT not between", value1, value2, "fAmt");
            return (Criteria) this;
        }

        public Criteria andFStaUpIsNull() {
            addCriterion("F_STA_UP is null");
            return (Criteria) this;
        }

        public Criteria andFStaUpIsNotNull() {
            addCriterion("F_STA_UP is not null");
            return (Criteria) this;
        }

        public Criteria andFStaUpEqualTo(String value) {
            addCriterion("F_STA_UP =", value, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpNotEqualTo(String value) {
            addCriterion("F_STA_UP <>", value, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpGreaterThan(String value) {
            addCriterion("F_STA_UP >", value, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_UP >=", value, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpLessThan(String value) {
            addCriterion("F_STA_UP <", value, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpLessThanOrEqualTo(String value) {
            addCriterion("F_STA_UP <=", value, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpLike(String value) {
            addCriterion("F_STA_UP like", value, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpNotLike(String value) {
            addCriterion("F_STA_UP not like", value, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpIn(List<String> values) {
            addCriterion("F_STA_UP in", values, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpNotIn(List<String> values) {
            addCriterion("F_STA_UP not in", values, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpBetween(String value1, String value2) {
            addCriterion("F_STA_UP between", value1, value2, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaUpNotBetween(String value1, String value2) {
            addCriterion("F_STA_UP not between", value1, value2, "fStaUp");
            return (Criteria) this;
        }

        public Criteria andFStaMdyIsNull() {
            addCriterion("F_STA_MDY is null");
            return (Criteria) this;
        }

        public Criteria andFStaMdyIsNotNull() {
            addCriterion("F_STA_MDY is not null");
            return (Criteria) this;
        }

        public Criteria andFStaMdyEqualTo(String value) {
            addCriterion("F_STA_MDY =", value, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyNotEqualTo(String value) {
            addCriterion("F_STA_MDY <>", value, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyGreaterThan(String value) {
            addCriterion("F_STA_MDY >", value, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_MDY >=", value, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyLessThan(String value) {
            addCriterion("F_STA_MDY <", value, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyLessThanOrEqualTo(String value) {
            addCriterion("F_STA_MDY <=", value, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyLike(String value) {
            addCriterion("F_STA_MDY like", value, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyNotLike(String value) {
            addCriterion("F_STA_MDY not like", value, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyIn(List<String> values) {
            addCriterion("F_STA_MDY in", values, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyNotIn(List<String> values) {
            addCriterion("F_STA_MDY not in", values, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyBetween(String value1, String value2) {
            addCriterion("F_STA_MDY between", value1, value2, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaMdyNotBetween(String value1, String value2) {
            addCriterion("F_STA_MDY not between", value1, value2, "fStaMdy");
            return (Criteria) this;
        }

        public Criteria andFStaScanIsNull() {
            addCriterion("F_STA_SCAN is null");
            return (Criteria) this;
        }

        public Criteria andFStaScanIsNotNull() {
            addCriterion("F_STA_SCAN is not null");
            return (Criteria) this;
        }

        public Criteria andFStaScanEqualTo(String value) {
            addCriterion("F_STA_SCAN =", value, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanNotEqualTo(String value) {
            addCriterion("F_STA_SCAN <>", value, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanGreaterThan(String value) {
            addCriterion("F_STA_SCAN >", value, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_SCAN >=", value, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanLessThan(String value) {
            addCriterion("F_STA_SCAN <", value, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanLessThanOrEqualTo(String value) {
            addCriterion("F_STA_SCAN <=", value, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanLike(String value) {
            addCriterion("F_STA_SCAN like", value, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanNotLike(String value) {
            addCriterion("F_STA_SCAN not like", value, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanIn(List<String> values) {
            addCriterion("F_STA_SCAN in", values, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanNotIn(List<String> values) {
            addCriterion("F_STA_SCAN not in", values, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanBetween(String value1, String value2) {
            addCriterion("F_STA_SCAN between", value1, value2, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaScanNotBetween(String value1, String value2) {
            addCriterion("F_STA_SCAN not between", value1, value2, "fStaScan");
            return (Criteria) this;
        }

        public Criteria andFStaVeryIsNull() {
            addCriterion("F_STA_VERY is null");
            return (Criteria) this;
        }

        public Criteria andFStaVeryIsNotNull() {
            addCriterion("F_STA_VERY is not null");
            return (Criteria) this;
        }

        public Criteria andFStaVeryEqualTo(String value) {
            addCriterion("F_STA_VERY =", value, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryNotEqualTo(String value) {
            addCriterion("F_STA_VERY <>", value, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryGreaterThan(String value) {
            addCriterion("F_STA_VERY >", value, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_VERY >=", value, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryLessThan(String value) {
            addCriterion("F_STA_VERY <", value, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryLessThanOrEqualTo(String value) {
            addCriterion("F_STA_VERY <=", value, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryLike(String value) {
            addCriterion("F_STA_VERY like", value, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryNotLike(String value) {
            addCriterion("F_STA_VERY not like", value, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryIn(List<String> values) {
            addCriterion("F_STA_VERY in", values, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryNotIn(List<String> values) {
            addCriterion("F_STA_VERY not in", values, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryBetween(String value1, String value2) {
            addCriterion("F_STA_VERY between", value1, value2, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaVeryNotBetween(String value1, String value2) {
            addCriterion("F_STA_VERY not between", value1, value2, "fStaVery");
            return (Criteria) this;
        }

        public Criteria andFStaSealIsNull() {
            addCriterion("F_STA_SEAL is null");
            return (Criteria) this;
        }

        public Criteria andFStaSealIsNotNull() {
            addCriterion("F_STA_SEAL is not null");
            return (Criteria) this;
        }

        public Criteria andFStaSealEqualTo(String value) {
            addCriterion("F_STA_SEAL =", value, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealNotEqualTo(String value) {
            addCriterion("F_STA_SEAL <>", value, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealGreaterThan(String value) {
            addCriterion("F_STA_SEAL >", value, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_SEAL >=", value, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealLessThan(String value) {
            addCriterion("F_STA_SEAL <", value, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealLessThanOrEqualTo(String value) {
            addCriterion("F_STA_SEAL <=", value, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealLike(String value) {
            addCriterion("F_STA_SEAL like", value, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealNotLike(String value) {
            addCriterion("F_STA_SEAL not like", value, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealIn(List<String> values) {
            addCriterion("F_STA_SEAL in", values, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealNotIn(List<String> values) {
            addCriterion("F_STA_SEAL not in", values, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealBetween(String value1, String value2) {
            addCriterion("F_STA_SEAL between", value1, value2, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFStaSealNotBetween(String value1, String value2) {
            addCriterion("F_STA_SEAL not between", value1, value2, "fStaSeal");
            return (Criteria) this;
        }

        public Criteria andFSta0IsNull() {
            addCriterion("F_STA0 is null");
            return (Criteria) this;
        }

        public Criteria andFSta0IsNotNull() {
            addCriterion("F_STA0 is not null");
            return (Criteria) this;
        }

        public Criteria andFSta0EqualTo(String value) {
            addCriterion("F_STA0 =", value, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0NotEqualTo(String value) {
            addCriterion("F_STA0 <>", value, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0GreaterThan(String value) {
            addCriterion("F_STA0 >", value, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0GreaterThanOrEqualTo(String value) {
            addCriterion("F_STA0 >=", value, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0LessThan(String value) {
            addCriterion("F_STA0 <", value, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0LessThanOrEqualTo(String value) {
            addCriterion("F_STA0 <=", value, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0Like(String value) {
            addCriterion("F_STA0 like", value, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0NotLike(String value) {
            addCriterion("F_STA0 not like", value, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0In(List<String> values) {
            addCriterion("F_STA0 in", values, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0NotIn(List<String> values) {
            addCriterion("F_STA0 not in", values, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0Between(String value1, String value2) {
            addCriterion("F_STA0 between", value1, value2, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta0NotBetween(String value1, String value2) {
            addCriterion("F_STA0 not between", value1, value2, "fSta0");
            return (Criteria) this;
        }

        public Criteria andFSta1IsNull() {
            addCriterion("F_STA1 is null");
            return (Criteria) this;
        }

        public Criteria andFSta1IsNotNull() {
            addCriterion("F_STA1 is not null");
            return (Criteria) this;
        }

        public Criteria andFSta1EqualTo(String value) {
            addCriterion("F_STA1 =", value, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1NotEqualTo(String value) {
            addCriterion("F_STA1 <>", value, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1GreaterThan(String value) {
            addCriterion("F_STA1 >", value, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1GreaterThanOrEqualTo(String value) {
            addCriterion("F_STA1 >=", value, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1LessThan(String value) {
            addCriterion("F_STA1 <", value, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1LessThanOrEqualTo(String value) {
            addCriterion("F_STA1 <=", value, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1Like(String value) {
            addCriterion("F_STA1 like", value, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1NotLike(String value) {
            addCriterion("F_STA1 not like", value, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1In(List<String> values) {
            addCriterion("F_STA1 in", values, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1NotIn(List<String> values) {
            addCriterion("F_STA1 not in", values, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1Between(String value1, String value2) {
            addCriterion("F_STA1 between", value1, value2, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta1NotBetween(String value1, String value2) {
            addCriterion("F_STA1 not between", value1, value2, "fSta1");
            return (Criteria) this;
        }

        public Criteria andFSta2IsNull() {
            addCriterion("F_STA2 is null");
            return (Criteria) this;
        }

        public Criteria andFSta2IsNotNull() {
            addCriterion("F_STA2 is not null");
            return (Criteria) this;
        }

        public Criteria andFSta2EqualTo(String value) {
            addCriterion("F_STA2 =", value, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2NotEqualTo(String value) {
            addCriterion("F_STA2 <>", value, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2GreaterThan(String value) {
            addCriterion("F_STA2 >", value, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2GreaterThanOrEqualTo(String value) {
            addCriterion("F_STA2 >=", value, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2LessThan(String value) {
            addCriterion("F_STA2 <", value, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2LessThanOrEqualTo(String value) {
            addCriterion("F_STA2 <=", value, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2Like(String value) {
            addCriterion("F_STA2 like", value, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2NotLike(String value) {
            addCriterion("F_STA2 not like", value, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2In(List<String> values) {
            addCriterion("F_STA2 in", values, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2NotIn(List<String> values) {
            addCriterion("F_STA2 not in", values, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2Between(String value1, String value2) {
            addCriterion("F_STA2 between", value1, value2, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta2NotBetween(String value1, String value2) {
            addCriterion("F_STA2 not between", value1, value2, "fSta2");
            return (Criteria) this;
        }

        public Criteria andFSta3IsNull() {
            addCriterion("F_STA3 is null");
            return (Criteria) this;
        }

        public Criteria andFSta3IsNotNull() {
            addCriterion("F_STA3 is not null");
            return (Criteria) this;
        }

        public Criteria andFSta3EqualTo(BigDecimal value) {
            addCriterion("F_STA3 =", value, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3NotEqualTo(BigDecimal value) {
            addCriterion("F_STA3 <>", value, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3GreaterThan(BigDecimal value) {
            addCriterion("F_STA3 >", value, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("F_STA3 >=", value, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3LessThan(BigDecimal value) {
            addCriterion("F_STA3 <", value, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("F_STA3 <=", value, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3In(List<BigDecimal> values) {
            addCriterion("F_STA3 in", values, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3NotIn(List<BigDecimal> values) {
            addCriterion("F_STA3 not in", values, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_STA3 between", value1, value2, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("F_STA3 not between", value1, value2, "fSta3");
            return (Criteria) this;
        }

        public Criteria andFSta4IsNull() {
            addCriterion("F_STA4 is null");
            return (Criteria) this;
        }

        public Criteria andFSta4IsNotNull() {
            addCriterion("F_STA4 is not null");
            return (Criteria) this;
        }

        public Criteria andFSta4EqualTo(String value) {
            addCriterion("F_STA4 =", value, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4NotEqualTo(String value) {
            addCriterion("F_STA4 <>", value, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4GreaterThan(String value) {
            addCriterion("F_STA4 >", value, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4GreaterThanOrEqualTo(String value) {
            addCriterion("F_STA4 >=", value, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4LessThan(String value) {
            addCriterion("F_STA4 <", value, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4LessThanOrEqualTo(String value) {
            addCriterion("F_STA4 <=", value, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4Like(String value) {
            addCriterion("F_STA4 like", value, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4NotLike(String value) {
            addCriterion("F_STA4 not like", value, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4In(List<String> values) {
            addCriterion("F_STA4 in", values, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4NotIn(List<String> values) {
            addCriterion("F_STA4 not in", values, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4Between(String value1, String value2) {
            addCriterion("F_STA4 between", value1, value2, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta4NotBetween(String value1, String value2) {
            addCriterion("F_STA4 not between", value1, value2, "fSta4");
            return (Criteria) this;
        }

        public Criteria andFSta5IsNull() {
            addCriterion("F_STA5 is null");
            return (Criteria) this;
        }

        public Criteria andFSta5IsNotNull() {
            addCriterion("F_STA5 is not null");
            return (Criteria) this;
        }

        public Criteria andFSta5EqualTo(String value) {
            addCriterion("F_STA5 =", value, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5NotEqualTo(String value) {
            addCriterion("F_STA5 <>", value, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5GreaterThan(String value) {
            addCriterion("F_STA5 >", value, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5GreaterThanOrEqualTo(String value) {
            addCriterion("F_STA5 >=", value, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5LessThan(String value) {
            addCriterion("F_STA5 <", value, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5LessThanOrEqualTo(String value) {
            addCriterion("F_STA5 <=", value, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5Like(String value) {
            addCriterion("F_STA5 like", value, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5NotLike(String value) {
            addCriterion("F_STA5 not like", value, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5In(List<String> values) {
            addCriterion("F_STA5 in", values, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5NotIn(List<String> values) {
            addCriterion("F_STA5 not in", values, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5Between(String value1, String value2) {
            addCriterion("F_STA5 between", value1, value2, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFSta5NotBetween(String value1, String value2) {
            addCriterion("F_STA5 not between", value1, value2, "fSta5");
            return (Criteria) this;
        }

        public Criteria andFBizTypeIsNull() {
            addCriterion("F_BIZ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFBizTypeIsNotNull() {
            addCriterion("F_BIZ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFBizTypeEqualTo(String value) {
            addCriterion("F_BIZ_TYPE =", value, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeNotEqualTo(String value) {
            addCriterion("F_BIZ_TYPE <>", value, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeGreaterThan(String value) {
            addCriterion("F_BIZ_TYPE >", value, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_BIZ_TYPE >=", value, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeLessThan(String value) {
            addCriterion("F_BIZ_TYPE <", value, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeLessThanOrEqualTo(String value) {
            addCriterion("F_BIZ_TYPE <=", value, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeLike(String value) {
            addCriterion("F_BIZ_TYPE like", value, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeNotLike(String value) {
            addCriterion("F_BIZ_TYPE not like", value, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeIn(List<String> values) {
            addCriterion("F_BIZ_TYPE in", values, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeNotIn(List<String> values) {
            addCriterion("F_BIZ_TYPE not in", values, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeBetween(String value1, String value2) {
            addCriterion("F_BIZ_TYPE between", value1, value2, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBizTypeNotBetween(String value1, String value2) {
            addCriterion("F_BIZ_TYPE not between", value1, value2, "fBizType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeIsNull() {
            addCriterion("F_BILL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFBillTypeIsNotNull() {
            addCriterion("F_BILL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFBillTypeEqualTo(String value) {
            addCriterion("F_BILL_TYPE =", value, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeNotEqualTo(String value) {
            addCriterion("F_BILL_TYPE <>", value, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeGreaterThan(String value) {
            addCriterion("F_BILL_TYPE >", value, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_BILL_TYPE >=", value, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeLessThan(String value) {
            addCriterion("F_BILL_TYPE <", value, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeLessThanOrEqualTo(String value) {
            addCriterion("F_BILL_TYPE <=", value, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeLike(String value) {
            addCriterion("F_BILL_TYPE like", value, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeNotLike(String value) {
            addCriterion("F_BILL_TYPE not like", value, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeIn(List<String> values) {
            addCriterion("F_BILL_TYPE in", values, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeNotIn(List<String> values) {
            addCriterion("F_BILL_TYPE not in", values, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeBetween(String value1, String value2) {
            addCriterion("F_BILL_TYPE between", value1, value2, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFBillTypeNotBetween(String value1, String value2) {
            addCriterion("F_BILL_TYPE not between", value1, value2, "fBillType");
            return (Criteria) this;
        }

        public Criteria andFStaEncryIsNull() {
            addCriterion("F_STA_ENCRY is null");
            return (Criteria) this;
        }

        public Criteria andFStaEncryIsNotNull() {
            addCriterion("F_STA_ENCRY is not null");
            return (Criteria) this;
        }

        public Criteria andFStaEncryEqualTo(String value) {
            addCriterion("F_STA_ENCRY =", value, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryNotEqualTo(String value) {
            addCriterion("F_STA_ENCRY <>", value, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryGreaterThan(String value) {
            addCriterion("F_STA_ENCRY >", value, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_ENCRY >=", value, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryLessThan(String value) {
            addCriterion("F_STA_ENCRY <", value, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryLessThanOrEqualTo(String value) {
            addCriterion("F_STA_ENCRY <=", value, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryLike(String value) {
            addCriterion("F_STA_ENCRY like", value, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryNotLike(String value) {
            addCriterion("F_STA_ENCRY not like", value, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryIn(List<String> values) {
            addCriterion("F_STA_ENCRY in", values, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryNotIn(List<String> values) {
            addCriterion("F_STA_ENCRY not in", values, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryBetween(String value1, String value2) {
            addCriterion("F_STA_ENCRY between", value1, value2, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaEncryNotBetween(String value1, String value2) {
            addCriterion("F_STA_ENCRY not between", value1, value2, "fStaEncry");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsIsNull() {
            addCriterion("F_STA_CMPRS is null");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsIsNotNull() {
            addCriterion("F_STA_CMPRS is not null");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsEqualTo(String value) {
            addCriterion("F_STA_CMPRS =", value, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsNotEqualTo(String value) {
            addCriterion("F_STA_CMPRS <>", value, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsGreaterThan(String value) {
            addCriterion("F_STA_CMPRS >", value, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_CMPRS >=", value, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsLessThan(String value) {
            addCriterion("F_STA_CMPRS <", value, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsLessThanOrEqualTo(String value) {
            addCriterion("F_STA_CMPRS <=", value, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsLike(String value) {
            addCriterion("F_STA_CMPRS like", value, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsNotLike(String value) {
            addCriterion("F_STA_CMPRS not like", value, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsIn(List<String> values) {
            addCriterion("F_STA_CMPRS in", values, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsNotIn(List<String> values) {
            addCriterion("F_STA_CMPRS not in", values, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsBetween(String value1, String value2) {
            addCriterion("F_STA_CMPRS between", value1, value2, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaCmprsNotBetween(String value1, String value2) {
            addCriterion("F_STA_CMPRS not between", value1, value2, "fStaCmprs");
            return (Criteria) this;
        }

        public Criteria andFStaVirusIsNull() {
            addCriterion("F_STA_VIRUS is null");
            return (Criteria) this;
        }

        public Criteria andFStaVirusIsNotNull() {
            addCriterion("F_STA_VIRUS is not null");
            return (Criteria) this;
        }

        public Criteria andFStaVirusEqualTo(String value) {
            addCriterion("F_STA_VIRUS =", value, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusNotEqualTo(String value) {
            addCriterion("F_STA_VIRUS <>", value, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusGreaterThan(String value) {
            addCriterion("F_STA_VIRUS >", value, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_VIRUS >=", value, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusLessThan(String value) {
            addCriterion("F_STA_VIRUS <", value, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusLessThanOrEqualTo(String value) {
            addCriterion("F_STA_VIRUS <=", value, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusLike(String value) {
            addCriterion("F_STA_VIRUS like", value, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusNotLike(String value) {
            addCriterion("F_STA_VIRUS not like", value, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusIn(List<String> values) {
            addCriterion("F_STA_VIRUS in", values, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusNotIn(List<String> values) {
            addCriterion("F_STA_VIRUS not in", values, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusBetween(String value1, String value2) {
            addCriterion("F_STA_VIRUS between", value1, value2, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFStaVirusNotBetween(String value1, String value2) {
            addCriterion("F_STA_VIRUS not between", value1, value2, "fStaVirus");
            return (Criteria) this;
        }

        public Criteria andFFileTpIsNull() {
            addCriterion("F_FILE_TP is null");
            return (Criteria) this;
        }

        public Criteria andFFileTpIsNotNull() {
            addCriterion("F_FILE_TP is not null");
            return (Criteria) this;
        }

        public Criteria andFFileTpEqualTo(String value) {
            addCriterion("F_FILE_TP =", value, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpNotEqualTo(String value) {
            addCriterion("F_FILE_TP <>", value, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpGreaterThan(String value) {
            addCriterion("F_FILE_TP >", value, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpGreaterThanOrEqualTo(String value) {
            addCriterion("F_FILE_TP >=", value, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpLessThan(String value) {
            addCriterion("F_FILE_TP <", value, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpLessThanOrEqualTo(String value) {
            addCriterion("F_FILE_TP <=", value, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpLike(String value) {
            addCriterion("F_FILE_TP like", value, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpNotLike(String value) {
            addCriterion("F_FILE_TP not like", value, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpIn(List<String> values) {
            addCriterion("F_FILE_TP in", values, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpNotIn(List<String> values) {
            addCriterion("F_FILE_TP not in", values, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpBetween(String value1, String value2) {
            addCriterion("F_FILE_TP between", value1, value2, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFFileTpNotBetween(String value1, String value2) {
            addCriterion("F_FILE_TP not between", value1, value2, "fFileTp");
            return (Criteria) this;
        }

        public Criteria andFDspIdxIsNull() {
            addCriterion("F_DSP_IDX is null");
            return (Criteria) this;
        }

        public Criteria andFDspIdxIsNotNull() {
            addCriterion("F_DSP_IDX is not null");
            return (Criteria) this;
        }

        public Criteria andFDspIdxEqualTo(Integer value) {
            addCriterion("F_DSP_IDX =", value, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxNotEqualTo(Integer value) {
            addCriterion("F_DSP_IDX <>", value, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxGreaterThan(Integer value) {
            addCriterion("F_DSP_IDX >", value, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_DSP_IDX >=", value, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxLessThan(Integer value) {
            addCriterion("F_DSP_IDX <", value, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxLessThanOrEqualTo(Integer value) {
            addCriterion("F_DSP_IDX <=", value, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxIn(List<Integer> values) {
            addCriterion("F_DSP_IDX in", values, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxNotIn(List<Integer> values) {
            addCriterion("F_DSP_IDX not in", values, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxBetween(Integer value1, Integer value2) {
            addCriterion("F_DSP_IDX between", value1, value2, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFDspIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("F_DSP_IDX not between", value1, value2, "fDspIdx");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoIsNull() {
            addCriterion("F_VERY_INFO is null");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoIsNotNull() {
            addCriterion("F_VERY_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoEqualTo(String value) {
            addCriterion("F_VERY_INFO =", value, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoNotEqualTo(String value) {
            addCriterion("F_VERY_INFO <>", value, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoGreaterThan(String value) {
            addCriterion("F_VERY_INFO >", value, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoGreaterThanOrEqualTo(String value) {
            addCriterion("F_VERY_INFO >=", value, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoLessThan(String value) {
            addCriterion("F_VERY_INFO <", value, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoLessThanOrEqualTo(String value) {
            addCriterion("F_VERY_INFO <=", value, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoLike(String value) {
            addCriterion("F_VERY_INFO like", value, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoNotLike(String value) {
            addCriterion("F_VERY_INFO not like", value, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoIn(List<String> values) {
            addCriterion("F_VERY_INFO in", values, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoNotIn(List<String> values) {
            addCriterion("F_VERY_INFO not in", values, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoBetween(String value1, String value2) {
            addCriterion("F_VERY_INFO between", value1, value2, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFVeryInfoNotBetween(String value1, String value2) {
            addCriterion("F_VERY_INFO not between", value1, value2, "fVeryInfo");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyIsNull() {
            addCriterion("F_ATT_SRC_STO_KEY is null");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyIsNotNull() {
            addCriterion("F_ATT_SRC_STO_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyEqualTo(String value) {
            addCriterion("F_ATT_SRC_STO_KEY =", value, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyNotEqualTo(String value) {
            addCriterion("F_ATT_SRC_STO_KEY <>", value, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyGreaterThan(String value) {
            addCriterion("F_ATT_SRC_STO_KEY >", value, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyGreaterThanOrEqualTo(String value) {
            addCriterion("F_ATT_SRC_STO_KEY >=", value, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyLessThan(String value) {
            addCriterion("F_ATT_SRC_STO_KEY <", value, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyLessThanOrEqualTo(String value) {
            addCriterion("F_ATT_SRC_STO_KEY <=", value, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyLike(String value) {
            addCriterion("F_ATT_SRC_STO_KEY like", value, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyNotLike(String value) {
            addCriterion("F_ATT_SRC_STO_KEY not like", value, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyIn(List<String> values) {
            addCriterion("F_ATT_SRC_STO_KEY in", values, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyNotIn(List<String> values) {
            addCriterion("F_ATT_SRC_STO_KEY not in", values, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyBetween(String value1, String value2) {
            addCriterion("F_ATT_SRC_STO_KEY between", value1, value2, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAttSrcStoKeyNotBetween(String value1, String value2) {
            addCriterion("F_ATT_SRC_STO_KEY not between", value1, value2, "fAttSrcStoKey");
            return (Criteria) this;
        }

        public Criteria andFAppIdIsNull() {
            addCriterion("F_APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFAppIdIsNotNull() {
            addCriterion("F_APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFAppIdEqualTo(String value) {
            addCriterion("F_APP_ID =", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdNotEqualTo(String value) {
            addCriterion("F_APP_ID <>", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdGreaterThan(String value) {
            addCriterion("F_APP_ID >", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_APP_ID >=", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdLessThan(String value) {
            addCriterion("F_APP_ID <", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdLessThanOrEqualTo(String value) {
            addCriterion("F_APP_ID <=", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdLike(String value) {
            addCriterion("F_APP_ID like", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdNotLike(String value) {
            addCriterion("F_APP_ID not like", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdIn(List<String> values) {
            addCriterion("F_APP_ID in", values, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdNotIn(List<String> values) {
            addCriterion("F_APP_ID not in", values, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdBetween(String value1, String value2) {
            addCriterion("F_APP_ID between", value1, value2, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdNotBetween(String value1, String value2) {
            addCriterion("F_APP_ID not between", value1, value2, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFUserIdIsNull() {
            addCriterion("F_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFUserIdIsNotNull() {
            addCriterion("F_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFUserIdEqualTo(String value) {
            addCriterion("F_USER_ID =", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotEqualTo(String value) {
            addCriterion("F_USER_ID <>", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdGreaterThan(String value) {
            addCriterion("F_USER_ID >", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_USER_ID >=", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdLessThan(String value) {
            addCriterion("F_USER_ID <", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdLessThanOrEqualTo(String value) {
            addCriterion("F_USER_ID <=", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdLike(String value) {
            addCriterion("F_USER_ID like", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotLike(String value) {
            addCriterion("F_USER_ID not like", value, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdIn(List<String> values) {
            addCriterion("F_USER_ID in", values, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotIn(List<String> values) {
            addCriterion("F_USER_ID not in", values, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdBetween(String value1, String value2) {
            addCriterion("F_USER_ID between", value1, value2, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserIdNotBetween(String value1, String value2) {
            addCriterion("F_USER_ID not between", value1, value2, "fUserId");
            return (Criteria) this;
        }

        public Criteria andFUserNameIsNull() {
            addCriterion("F_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFUserNameIsNotNull() {
            addCriterion("F_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFUserNameEqualTo(String value) {
            addCriterion("F_USER_NAME =", value, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameNotEqualTo(String value) {
            addCriterion("F_USER_NAME <>", value, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameGreaterThan(String value) {
            addCriterion("F_USER_NAME >", value, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_USER_NAME >=", value, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameLessThan(String value) {
            addCriterion("F_USER_NAME <", value, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameLessThanOrEqualTo(String value) {
            addCriterion("F_USER_NAME <=", value, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameLike(String value) {
            addCriterion("F_USER_NAME like", value, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameNotLike(String value) {
            addCriterion("F_USER_NAME not like", value, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameIn(List<String> values) {
            addCriterion("F_USER_NAME in", values, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameNotIn(List<String> values) {
            addCriterion("F_USER_NAME not in", values, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameBetween(String value1, String value2) {
            addCriterion("F_USER_NAME between", value1, value2, "fUserName");
            return (Criteria) this;
        }

        public Criteria andFUserNameNotBetween(String value1, String value2) {
            addCriterion("F_USER_NAME not between", value1, value2, "fUserName");
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