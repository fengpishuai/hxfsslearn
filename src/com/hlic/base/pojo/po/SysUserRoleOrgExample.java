package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SysUserRoleOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserRoleOrgExample() {
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

        public Criteria andFRoleIdIsNull() {
            addCriterion("F_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFRoleIdIsNotNull() {
            addCriterion("F_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFRoleIdEqualTo(String value) {
            addCriterion("F_ROLE_ID =", value, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdNotEqualTo(String value) {
            addCriterion("F_ROLE_ID <>", value, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdGreaterThan(String value) {
            addCriterion("F_ROLE_ID >", value, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_ROLE_ID >=", value, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdLessThan(String value) {
            addCriterion("F_ROLE_ID <", value, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdLessThanOrEqualTo(String value) {
            addCriterion("F_ROLE_ID <=", value, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdLike(String value) {
            addCriterion("F_ROLE_ID like", value, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdNotLike(String value) {
            addCriterion("F_ROLE_ID not like", value, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdIn(List<String> values) {
            addCriterion("F_ROLE_ID in", values, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdNotIn(List<String> values) {
            addCriterion("F_ROLE_ID not in", values, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdBetween(String value1, String value2) {
            addCriterion("F_ROLE_ID between", value1, value2, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFRoleIdNotBetween(String value1, String value2) {
            addCriterion("F_ROLE_ID not between", value1, value2, "fRoleId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdIsNull() {
            addCriterion("F_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andFOrgIdIsNotNull() {
            addCriterion("F_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFOrgIdEqualTo(String value) {
            addCriterion("F_ORG_ID =", value, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdNotEqualTo(String value) {
            addCriterion("F_ORG_ID <>", value, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdGreaterThan(String value) {
            addCriterion("F_ORG_ID >", value, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_ORG_ID >=", value, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdLessThan(String value) {
            addCriterion("F_ORG_ID <", value, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdLessThanOrEqualTo(String value) {
            addCriterion("F_ORG_ID <=", value, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdLike(String value) {
            addCriterion("F_ORG_ID like", value, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdNotLike(String value) {
            addCriterion("F_ORG_ID not like", value, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdIn(List<String> values) {
            addCriterion("F_ORG_ID in", values, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdNotIn(List<String> values) {
            addCriterion("F_ORG_ID not in", values, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdBetween(String value1, String value2) {
            addCriterion("F_ORG_ID between", value1, value2, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFOrgIdNotBetween(String value1, String value2) {
            addCriterion("F_ORG_ID not between", value1, value2, "fOrgId");
            return (Criteria) this;
        }

        public Criteria andFCompIdIsNull() {
            addCriterion("F_COMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andFCompIdIsNotNull() {
            addCriterion("F_COMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFCompIdEqualTo(String value) {
            addCriterion("F_COMP_ID =", value, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdNotEqualTo(String value) {
            addCriterion("F_COMP_ID <>", value, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdGreaterThan(String value) {
            addCriterion("F_COMP_ID >", value, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_COMP_ID >=", value, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdLessThan(String value) {
            addCriterion("F_COMP_ID <", value, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdLessThanOrEqualTo(String value) {
            addCriterion("F_COMP_ID <=", value, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdLike(String value) {
            addCriterion("F_COMP_ID like", value, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdNotLike(String value) {
            addCriterion("F_COMP_ID not like", value, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdIn(List<String> values) {
            addCriterion("F_COMP_ID in", values, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdNotIn(List<String> values) {
            addCriterion("F_COMP_ID not in", values, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdBetween(String value1, String value2) {
            addCriterion("F_COMP_ID between", value1, value2, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFCompIdNotBetween(String value1, String value2) {
            addCriterion("F_COMP_ID not between", value1, value2, "fCompId");
            return (Criteria) this;
        }

        public Criteria andFScIsNull() {
            addCriterion("F_SC is null");
            return (Criteria) this;
        }

        public Criteria andFScIsNotNull() {
            addCriterion("F_SC is not null");
            return (Criteria) this;
        }

        public Criteria andFScEqualTo(String value) {
            addCriterion("F_SC =", value, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScNotEqualTo(String value) {
            addCriterion("F_SC <>", value, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScGreaterThan(String value) {
            addCriterion("F_SC >", value, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScGreaterThanOrEqualTo(String value) {
            addCriterion("F_SC >=", value, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScLessThan(String value) {
            addCriterion("F_SC <", value, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScLessThanOrEqualTo(String value) {
            addCriterion("F_SC <=", value, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScLike(String value) {
            addCriterion("F_SC like", value, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScNotLike(String value) {
            addCriterion("F_SC not like", value, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScIn(List<String> values) {
            addCriterion("F_SC in", values, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScNotIn(List<String> values) {
            addCriterion("F_SC not in", values, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScBetween(String value1, String value2) {
            addCriterion("F_SC between", value1, value2, "fSc");
            return (Criteria) this;
        }

        public Criteria andFScNotBetween(String value1, String value2) {
            addCriterion("F_SC not between", value1, value2, "fSc");
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