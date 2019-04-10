package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SysSqlFilterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysSqlFilterExample() {
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

        public Criteria andFFuncIdIsNull() {
            addCriterion("F_FUNC_ID is null");
            return (Criteria) this;
        }

        public Criteria andFFuncIdIsNotNull() {
            addCriterion("F_FUNC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFFuncIdEqualTo(String value) {
            addCriterion("F_FUNC_ID =", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdNotEqualTo(String value) {
            addCriterion("F_FUNC_ID <>", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdGreaterThan(String value) {
            addCriterion("F_FUNC_ID >", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_FUNC_ID >=", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdLessThan(String value) {
            addCriterion("F_FUNC_ID <", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdLessThanOrEqualTo(String value) {
            addCriterion("F_FUNC_ID <=", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdLike(String value) {
            addCriterion("F_FUNC_ID like", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdNotLike(String value) {
            addCriterion("F_FUNC_ID not like", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdIn(List<String> values) {
            addCriterion("F_FUNC_ID in", values, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdNotIn(List<String> values) {
            addCriterion("F_FUNC_ID not in", values, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdBetween(String value1, String value2) {
            addCriterion("F_FUNC_ID between", value1, value2, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdNotBetween(String value1, String value2) {
            addCriterion("F_FUNC_ID not between", value1, value2, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("F_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("F_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("F_NAME =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("F_NAME <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("F_NAME >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_NAME >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("F_NAME <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("F_NAME <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("F_NAME like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("F_NAME not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("F_NAME in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("F_NAME not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("F_NAME between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("F_NAME not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFSqlIsNull() {
            addCriterion("F_SQL is null");
            return (Criteria) this;
        }

        public Criteria andFSqlIsNotNull() {
            addCriterion("F_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andFSqlEqualTo(String value) {
            addCriterion("F_SQL =", value, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlNotEqualTo(String value) {
            addCriterion("F_SQL <>", value, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlGreaterThan(String value) {
            addCriterion("F_SQL >", value, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlGreaterThanOrEqualTo(String value) {
            addCriterion("F_SQL >=", value, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlLessThan(String value) {
            addCriterion("F_SQL <", value, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlLessThanOrEqualTo(String value) {
            addCriterion("F_SQL <=", value, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlLike(String value) {
            addCriterion("F_SQL like", value, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlNotLike(String value) {
            addCriterion("F_SQL not like", value, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlIn(List<String> values) {
            addCriterion("F_SQL in", values, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlNotIn(List<String> values) {
            addCriterion("F_SQL not in", values, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlBetween(String value1, String value2) {
            addCriterion("F_SQL between", value1, value2, "fSql");
            return (Criteria) this;
        }

        public Criteria andFSqlNotBetween(String value1, String value2) {
            addCriterion("F_SQL not between", value1, value2, "fSql");
            return (Criteria) this;
        }

        public Criteria andFMsIsNull() {
            addCriterion("F_MS is null");
            return (Criteria) this;
        }

        public Criteria andFMsIsNotNull() {
            addCriterion("F_MS is not null");
            return (Criteria) this;
        }

        public Criteria andFMsEqualTo(String value) {
            addCriterion("F_MS =", value, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsNotEqualTo(String value) {
            addCriterion("F_MS <>", value, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsGreaterThan(String value) {
            addCriterion("F_MS >", value, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsGreaterThanOrEqualTo(String value) {
            addCriterion("F_MS >=", value, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsLessThan(String value) {
            addCriterion("F_MS <", value, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsLessThanOrEqualTo(String value) {
            addCriterion("F_MS <=", value, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsLike(String value) {
            addCriterion("F_MS like", value, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsNotLike(String value) {
            addCriterion("F_MS not like", value, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsIn(List<String> values) {
            addCriterion("F_MS in", values, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsNotIn(List<String> values) {
            addCriterion("F_MS not in", values, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsBetween(String value1, String value2) {
            addCriterion("F_MS between", value1, value2, "fMs");
            return (Criteria) this;
        }

        public Criteria andFMsNotBetween(String value1, String value2) {
            addCriterion("F_MS not between", value1, value2, "fMs");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNull() {
            addCriterion("F_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFTypeIsNotNull() {
            addCriterion("F_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFTypeEqualTo(String value) {
            addCriterion("F_TYPE =", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotEqualTo(String value) {
            addCriterion("F_TYPE <>", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThan(String value) {
            addCriterion("F_TYPE >", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_TYPE >=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThan(String value) {
            addCriterion("F_TYPE <", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLessThanOrEqualTo(String value) {
            addCriterion("F_TYPE <=", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeLike(String value) {
            addCriterion("F_TYPE like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotLike(String value) {
            addCriterion("F_TYPE not like", value, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeIn(List<String> values) {
            addCriterion("F_TYPE in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotIn(List<String> values) {
            addCriterion("F_TYPE not in", values, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeBetween(String value1, String value2) {
            addCriterion("F_TYPE between", value1, value2, "fType");
            return (Criteria) this;
        }

        public Criteria andFTypeNotBetween(String value1, String value2) {
            addCriterion("F_TYPE not between", value1, value2, "fType");
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