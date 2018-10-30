package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class WdRptqueryConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WdRptqueryConfExample() {
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

        public Criteria andFBizCodeIsNull() {
            addCriterion("F_BIZ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFBizCodeIsNotNull() {
            addCriterion("F_BIZ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFBizCodeEqualTo(String value) {
            addCriterion("F_BIZ_CODE =", value, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeNotEqualTo(String value) {
            addCriterion("F_BIZ_CODE <>", value, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeGreaterThan(String value) {
            addCriterion("F_BIZ_CODE >", value, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_BIZ_CODE >=", value, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeLessThan(String value) {
            addCriterion("F_BIZ_CODE <", value, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeLessThanOrEqualTo(String value) {
            addCriterion("F_BIZ_CODE <=", value, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeLike(String value) {
            addCriterion("F_BIZ_CODE like", value, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeNotLike(String value) {
            addCriterion("F_BIZ_CODE not like", value, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeIn(List<String> values) {
            addCriterion("F_BIZ_CODE in", values, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeNotIn(List<String> values) {
            addCriterion("F_BIZ_CODE not in", values, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeBetween(String value1, String value2) {
            addCriterion("F_BIZ_CODE between", value1, value2, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizCodeNotBetween(String value1, String value2) {
            addCriterion("F_BIZ_CODE not between", value1, value2, "fBizCode");
            return (Criteria) this;
        }

        public Criteria andFBizDescIsNull() {
            addCriterion("F_BIZ_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFBizDescIsNotNull() {
            addCriterion("F_BIZ_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFBizDescEqualTo(String value) {
            addCriterion("F_BIZ_DESC =", value, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescNotEqualTo(String value) {
            addCriterion("F_BIZ_DESC <>", value, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescGreaterThan(String value) {
            addCriterion("F_BIZ_DESC >", value, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescGreaterThanOrEqualTo(String value) {
            addCriterion("F_BIZ_DESC >=", value, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescLessThan(String value) {
            addCriterion("F_BIZ_DESC <", value, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescLessThanOrEqualTo(String value) {
            addCriterion("F_BIZ_DESC <=", value, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescLike(String value) {
            addCriterion("F_BIZ_DESC like", value, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescNotLike(String value) {
            addCriterion("F_BIZ_DESC not like", value, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescIn(List<String> values) {
            addCriterion("F_BIZ_DESC in", values, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescNotIn(List<String> values) {
            addCriterion("F_BIZ_DESC not in", values, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescBetween(String value1, String value2) {
            addCriterion("F_BIZ_DESC between", value1, value2, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFBizDescNotBetween(String value1, String value2) {
            addCriterion("F_BIZ_DESC not between", value1, value2, "fBizDesc");
            return (Criteria) this;
        }

        public Criteria andFParamIsNull() {
            addCriterion("F_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andFParamIsNotNull() {
            addCriterion("F_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andFParamEqualTo(String value) {
            addCriterion("F_PARAM =", value, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamNotEqualTo(String value) {
            addCriterion("F_PARAM <>", value, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamGreaterThan(String value) {
            addCriterion("F_PARAM >", value, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamGreaterThanOrEqualTo(String value) {
            addCriterion("F_PARAM >=", value, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamLessThan(String value) {
            addCriterion("F_PARAM <", value, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamLessThanOrEqualTo(String value) {
            addCriterion("F_PARAM <=", value, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamLike(String value) {
            addCriterion("F_PARAM like", value, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamNotLike(String value) {
            addCriterion("F_PARAM not like", value, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamIn(List<String> values) {
            addCriterion("F_PARAM in", values, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamNotIn(List<String> values) {
            addCriterion("F_PARAM not in", values, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamBetween(String value1, String value2) {
            addCriterion("F_PARAM between", value1, value2, "fParam");
            return (Criteria) this;
        }

        public Criteria andFParamNotBetween(String value1, String value2) {
            addCriterion("F_PARAM not between", value1, value2, "fParam");
            return (Criteria) this;
        }

        public Criteria andFSqltextIsNull() {
            addCriterion("F_SQLTEXT is null");
            return (Criteria) this;
        }

        public Criteria andFSqltextIsNotNull() {
            addCriterion("F_SQLTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andFSqltextEqualTo(String value) {
            addCriterion("F_SQLTEXT =", value, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextNotEqualTo(String value) {
            addCriterion("F_SQLTEXT <>", value, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextGreaterThan(String value) {
            addCriterion("F_SQLTEXT >", value, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextGreaterThanOrEqualTo(String value) {
            addCriterion("F_SQLTEXT >=", value, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextLessThan(String value) {
            addCriterion("F_SQLTEXT <", value, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextLessThanOrEqualTo(String value) {
            addCriterion("F_SQLTEXT <=", value, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextLike(String value) {
            addCriterion("F_SQLTEXT like", value, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextNotLike(String value) {
            addCriterion("F_SQLTEXT not like", value, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextIn(List<String> values) {
            addCriterion("F_SQLTEXT in", values, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextNotIn(List<String> values) {
            addCriterion("F_SQLTEXT not in", values, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextBetween(String value1, String value2) {
            addCriterion("F_SQLTEXT between", value1, value2, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFSqltextNotBetween(String value1, String value2) {
            addCriterion("F_SQLTEXT not between", value1, value2, "fSqltext");
            return (Criteria) this;
        }

        public Criteria andFQueryColsIsNull() {
            addCriterion("F_QUERY_COLS is null");
            return (Criteria) this;
        }

        public Criteria andFQueryColsIsNotNull() {
            addCriterion("F_QUERY_COLS is not null");
            return (Criteria) this;
        }

        public Criteria andFQueryColsEqualTo(String value) {
            addCriterion("F_QUERY_COLS =", value, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsNotEqualTo(String value) {
            addCriterion("F_QUERY_COLS <>", value, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsGreaterThan(String value) {
            addCriterion("F_QUERY_COLS >", value, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsGreaterThanOrEqualTo(String value) {
            addCriterion("F_QUERY_COLS >=", value, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsLessThan(String value) {
            addCriterion("F_QUERY_COLS <", value, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsLessThanOrEqualTo(String value) {
            addCriterion("F_QUERY_COLS <=", value, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsLike(String value) {
            addCriterion("F_QUERY_COLS like", value, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsNotLike(String value) {
            addCriterion("F_QUERY_COLS not like", value, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsIn(List<String> values) {
            addCriterion("F_QUERY_COLS in", values, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsNotIn(List<String> values) {
            addCriterion("F_QUERY_COLS not in", values, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsBetween(String value1, String value2) {
            addCriterion("F_QUERY_COLS between", value1, value2, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFQueryColsNotBetween(String value1, String value2) {
            addCriterion("F_QUERY_COLS not between", value1, value2, "fQueryCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsIsNull() {
            addCriterion("F_RESULT_COLS is null");
            return (Criteria) this;
        }

        public Criteria andFResultColsIsNotNull() {
            addCriterion("F_RESULT_COLS is not null");
            return (Criteria) this;
        }

        public Criteria andFResultColsEqualTo(String value) {
            addCriterion("F_RESULT_COLS =", value, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsNotEqualTo(String value) {
            addCriterion("F_RESULT_COLS <>", value, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsGreaterThan(String value) {
            addCriterion("F_RESULT_COLS >", value, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsGreaterThanOrEqualTo(String value) {
            addCriterion("F_RESULT_COLS >=", value, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsLessThan(String value) {
            addCriterion("F_RESULT_COLS <", value, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsLessThanOrEqualTo(String value) {
            addCriterion("F_RESULT_COLS <=", value, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsLike(String value) {
            addCriterion("F_RESULT_COLS like", value, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsNotLike(String value) {
            addCriterion("F_RESULT_COLS not like", value, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsIn(List<String> values) {
            addCriterion("F_RESULT_COLS in", values, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsNotIn(List<String> values) {
            addCriterion("F_RESULT_COLS not in", values, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsBetween(String value1, String value2) {
            addCriterion("F_RESULT_COLS between", value1, value2, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFResultColsNotBetween(String value1, String value2) {
            addCriterion("F_RESULT_COLS not between", value1, value2, "fResultCols");
            return (Criteria) this;
        }

        public Criteria andFExtSqlIsNull() {
            addCriterion("F_EXT_SQL is null");
            return (Criteria) this;
        }

        public Criteria andFExtSqlIsNotNull() {
            addCriterion("F_EXT_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andFExtSqlEqualTo(String value) {
            addCriterion("F_EXT_SQL =", value, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlNotEqualTo(String value) {
            addCriterion("F_EXT_SQL <>", value, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlGreaterThan(String value) {
            addCriterion("F_EXT_SQL >", value, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlGreaterThanOrEqualTo(String value) {
            addCriterion("F_EXT_SQL >=", value, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlLessThan(String value) {
            addCriterion("F_EXT_SQL <", value, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlLessThanOrEqualTo(String value) {
            addCriterion("F_EXT_SQL <=", value, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlLike(String value) {
            addCriterion("F_EXT_SQL like", value, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlNotLike(String value) {
            addCriterion("F_EXT_SQL not like", value, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlIn(List<String> values) {
            addCriterion("F_EXT_SQL in", values, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlNotIn(List<String> values) {
            addCriterion("F_EXT_SQL not in", values, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlBetween(String value1, String value2) {
            addCriterion("F_EXT_SQL between", value1, value2, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFExtSqlNotBetween(String value1, String value2) {
            addCriterion("F_EXT_SQL not between", value1, value2, "fExtSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlIsNull() {
            addCriterion("F_COUNT_SQL is null");
            return (Criteria) this;
        }

        public Criteria andFCountSqlIsNotNull() {
            addCriterion("F_COUNT_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andFCountSqlEqualTo(String value) {
            addCriterion("F_COUNT_SQL =", value, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlNotEqualTo(String value) {
            addCriterion("F_COUNT_SQL <>", value, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlGreaterThan(String value) {
            addCriterion("F_COUNT_SQL >", value, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlGreaterThanOrEqualTo(String value) {
            addCriterion("F_COUNT_SQL >=", value, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlLessThan(String value) {
            addCriterion("F_COUNT_SQL <", value, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlLessThanOrEqualTo(String value) {
            addCriterion("F_COUNT_SQL <=", value, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlLike(String value) {
            addCriterion("F_COUNT_SQL like", value, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlNotLike(String value) {
            addCriterion("F_COUNT_SQL not like", value, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlIn(List<String> values) {
            addCriterion("F_COUNT_SQL in", values, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlNotIn(List<String> values) {
            addCriterion("F_COUNT_SQL not in", values, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlBetween(String value1, String value2) {
            addCriterion("F_COUNT_SQL between", value1, value2, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCountSqlNotBetween(String value1, String value2) {
            addCriterion("F_COUNT_SQL not between", value1, value2, "fCountSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlIsNull() {
            addCriterion("F_CNTEXT_SQL is null");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlIsNotNull() {
            addCriterion("F_CNTEXT_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlEqualTo(String value) {
            addCriterion("F_CNTEXT_SQL =", value, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlNotEqualTo(String value) {
            addCriterion("F_CNTEXT_SQL <>", value, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlGreaterThan(String value) {
            addCriterion("F_CNTEXT_SQL >", value, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlGreaterThanOrEqualTo(String value) {
            addCriterion("F_CNTEXT_SQL >=", value, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlLessThan(String value) {
            addCriterion("F_CNTEXT_SQL <", value, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlLessThanOrEqualTo(String value) {
            addCriterion("F_CNTEXT_SQL <=", value, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlLike(String value) {
            addCriterion("F_CNTEXT_SQL like", value, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlNotLike(String value) {
            addCriterion("F_CNTEXT_SQL not like", value, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlIn(List<String> values) {
            addCriterion("F_CNTEXT_SQL in", values, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlNotIn(List<String> values) {
            addCriterion("F_CNTEXT_SQL not in", values, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlBetween(String value1, String value2) {
            addCriterion("F_CNTEXT_SQL between", value1, value2, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFCntextSqlNotBetween(String value1, String value2) {
            addCriterion("F_CNTEXT_SQL not between", value1, value2, "fCntextSql");
            return (Criteria) this;
        }

        public Criteria andFColTypeIsNull() {
            addCriterion("F_COL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFColTypeIsNotNull() {
            addCriterion("F_COL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFColTypeEqualTo(String value) {
            addCriterion("F_COL_TYPE =", value, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeNotEqualTo(String value) {
            addCriterion("F_COL_TYPE <>", value, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeGreaterThan(String value) {
            addCriterion("F_COL_TYPE >", value, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_COL_TYPE >=", value, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeLessThan(String value) {
            addCriterion("F_COL_TYPE <", value, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeLessThanOrEqualTo(String value) {
            addCriterion("F_COL_TYPE <=", value, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeLike(String value) {
            addCriterion("F_COL_TYPE like", value, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeNotLike(String value) {
            addCriterion("F_COL_TYPE not like", value, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeIn(List<String> values) {
            addCriterion("F_COL_TYPE in", values, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeNotIn(List<String> values) {
            addCriterion("F_COL_TYPE not in", values, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeBetween(String value1, String value2) {
            addCriterion("F_COL_TYPE between", value1, value2, "fColType");
            return (Criteria) this;
        }

        public Criteria andFColTypeNotBetween(String value1, String value2) {
            addCriterion("F_COL_TYPE not between", value1, value2, "fColType");
            return (Criteria) this;
        }

        public Criteria andFExpParamIsNull() {
            addCriterion("F_EXP_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andFExpParamIsNotNull() {
            addCriterion("F_EXP_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andFExpParamEqualTo(String value) {
            addCriterion("F_EXP_PARAM =", value, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamNotEqualTo(String value) {
            addCriterion("F_EXP_PARAM <>", value, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamGreaterThan(String value) {
            addCriterion("F_EXP_PARAM >", value, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamGreaterThanOrEqualTo(String value) {
            addCriterion("F_EXP_PARAM >=", value, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamLessThan(String value) {
            addCriterion("F_EXP_PARAM <", value, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamLessThanOrEqualTo(String value) {
            addCriterion("F_EXP_PARAM <=", value, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamLike(String value) {
            addCriterion("F_EXP_PARAM like", value, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamNotLike(String value) {
            addCriterion("F_EXP_PARAM not like", value, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamIn(List<String> values) {
            addCriterion("F_EXP_PARAM in", values, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamNotIn(List<String> values) {
            addCriterion("F_EXP_PARAM not in", values, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamBetween(String value1, String value2) {
            addCriterion("F_EXP_PARAM between", value1, value2, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFExpParamNotBetween(String value1, String value2) {
            addCriterion("F_EXP_PARAM not between", value1, value2, "fExpParam");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereIsNull() {
            addCriterion("F_SQL_WHERE is null");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereIsNotNull() {
            addCriterion("F_SQL_WHERE is not null");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereEqualTo(String value) {
            addCriterion("F_SQL_WHERE =", value, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereNotEqualTo(String value) {
            addCriterion("F_SQL_WHERE <>", value, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereGreaterThan(String value) {
            addCriterion("F_SQL_WHERE >", value, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereGreaterThanOrEqualTo(String value) {
            addCriterion("F_SQL_WHERE >=", value, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereLessThan(String value) {
            addCriterion("F_SQL_WHERE <", value, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereLessThanOrEqualTo(String value) {
            addCriterion("F_SQL_WHERE <=", value, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereLike(String value) {
            addCriterion("F_SQL_WHERE like", value, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereNotLike(String value) {
            addCriterion("F_SQL_WHERE not like", value, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereIn(List<String> values) {
            addCriterion("F_SQL_WHERE in", values, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereNotIn(List<String> values) {
            addCriterion("F_SQL_WHERE not in", values, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereBetween(String value1, String value2) {
            addCriterion("F_SQL_WHERE between", value1, value2, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlWhereNotBetween(String value1, String value2) {
            addCriterion("F_SQL_WHERE not between", value1, value2, "fSqlWhere");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderIsNull() {
            addCriterion("F_SQL_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderIsNotNull() {
            addCriterion("F_SQL_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderEqualTo(String value) {
            addCriterion("F_SQL_ORDER =", value, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderNotEqualTo(String value) {
            addCriterion("F_SQL_ORDER <>", value, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderGreaterThan(String value) {
            addCriterion("F_SQL_ORDER >", value, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderGreaterThanOrEqualTo(String value) {
            addCriterion("F_SQL_ORDER >=", value, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderLessThan(String value) {
            addCriterion("F_SQL_ORDER <", value, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderLessThanOrEqualTo(String value) {
            addCriterion("F_SQL_ORDER <=", value, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderLike(String value) {
            addCriterion("F_SQL_ORDER like", value, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderNotLike(String value) {
            addCriterion("F_SQL_ORDER not like", value, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderIn(List<String> values) {
            addCriterion("F_SQL_ORDER in", values, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderNotIn(List<String> values) {
            addCriterion("F_SQL_ORDER not in", values, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderBetween(String value1, String value2) {
            addCriterion("F_SQL_ORDER between", value1, value2, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFSqlOrderNotBetween(String value1, String value2) {
            addCriterion("F_SQL_ORDER not between", value1, value2, "fSqlOrder");
            return (Criteria) this;
        }

        public Criteria andFIsAuthIsNull() {
            addCriterion("F_IS_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andFIsAuthIsNotNull() {
            addCriterion("F_IS_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andFIsAuthEqualTo(String value) {
            addCriterion("F_IS_AUTH =", value, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthNotEqualTo(String value) {
            addCriterion("F_IS_AUTH <>", value, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthGreaterThan(String value) {
            addCriterion("F_IS_AUTH >", value, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthGreaterThanOrEqualTo(String value) {
            addCriterion("F_IS_AUTH >=", value, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthLessThan(String value) {
            addCriterion("F_IS_AUTH <", value, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthLessThanOrEqualTo(String value) {
            addCriterion("F_IS_AUTH <=", value, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthLike(String value) {
            addCriterion("F_IS_AUTH like", value, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthNotLike(String value) {
            addCriterion("F_IS_AUTH not like", value, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthIn(List<String> values) {
            addCriterion("F_IS_AUTH in", values, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthNotIn(List<String> values) {
            addCriterion("F_IS_AUTH not in", values, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthBetween(String value1, String value2) {
            addCriterion("F_IS_AUTH between", value1, value2, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFIsAuthNotBetween(String value1, String value2) {
            addCriterion("F_IS_AUTH not between", value1, value2, "fIsAuth");
            return (Criteria) this;
        }

        public Criteria andFAliasIsNull() {
            addCriterion("F_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andFAliasIsNotNull() {
            addCriterion("F_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andFAliasEqualTo(String value) {
            addCriterion("F_ALIAS =", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasNotEqualTo(String value) {
            addCriterion("F_ALIAS <>", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasGreaterThan(String value) {
            addCriterion("F_ALIAS >", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasGreaterThanOrEqualTo(String value) {
            addCriterion("F_ALIAS >=", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasLessThan(String value) {
            addCriterion("F_ALIAS <", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasLessThanOrEqualTo(String value) {
            addCriterion("F_ALIAS <=", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasLike(String value) {
            addCriterion("F_ALIAS like", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasNotLike(String value) {
            addCriterion("F_ALIAS not like", value, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasIn(List<String> values) {
            addCriterion("F_ALIAS in", values, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasNotIn(List<String> values) {
            addCriterion("F_ALIAS not in", values, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasBetween(String value1, String value2) {
            addCriterion("F_ALIAS between", value1, value2, "fAlias");
            return (Criteria) this;
        }

        public Criteria andFAliasNotBetween(String value1, String value2) {
            addCriterion("F_ALIAS not between", value1, value2, "fAlias");
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