package com.hlic.yycg.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class ScTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScTaskExample() {
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

        public Criteria andFYearIsNull() {
            addCriterion("F_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andFYearIsNotNull() {
            addCriterion("F_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andFYearEqualTo(String value) {
            addCriterion("F_YEAR =", value, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearNotEqualTo(String value) {
            addCriterion("F_YEAR <>", value, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearGreaterThan(String value) {
            addCriterion("F_YEAR >", value, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearGreaterThanOrEqualTo(String value) {
            addCriterion("F_YEAR >=", value, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearLessThan(String value) {
            addCriterion("F_YEAR <", value, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearLessThanOrEqualTo(String value) {
            addCriterion("F_YEAR <=", value, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearLike(String value) {
            addCriterion("F_YEAR like", value, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearNotLike(String value) {
            addCriterion("F_YEAR not like", value, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearIn(List<String> values) {
            addCriterion("F_YEAR in", values, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearNotIn(List<String> values) {
            addCriterion("F_YEAR not in", values, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearBetween(String value1, String value2) {
            addCriterion("F_YEAR between", value1, value2, "fYear");
            return (Criteria) this;
        }

        public Criteria andFYearNotBetween(String value1, String value2) {
            addCriterion("F_YEAR not between", value1, value2, "fYear");
            return (Criteria) this;
        }

        public Criteria andFMonthIsNull() {
            addCriterion("F_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andFMonthIsNotNull() {
            addCriterion("F_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andFMonthEqualTo(String value) {
            addCriterion("F_MONTH =", value, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthNotEqualTo(String value) {
            addCriterion("F_MONTH <>", value, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthGreaterThan(String value) {
            addCriterion("F_MONTH >", value, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthGreaterThanOrEqualTo(String value) {
            addCriterion("F_MONTH >=", value, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthLessThan(String value) {
            addCriterion("F_MONTH <", value, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthLessThanOrEqualTo(String value) {
            addCriterion("F_MONTH <=", value, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthLike(String value) {
            addCriterion("F_MONTH like", value, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthNotLike(String value) {
            addCriterion("F_MONTH not like", value, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthIn(List<String> values) {
            addCriterion("F_MONTH in", values, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthNotIn(List<String> values) {
            addCriterion("F_MONTH not in", values, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthBetween(String value1, String value2) {
            addCriterion("F_MONTH between", value1, value2, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFMonthNotBetween(String value1, String value2) {
            addCriterion("F_MONTH not between", value1, value2, "fMonth");
            return (Criteria) this;
        }

        public Criteria andFFlowSnIsNull() {
            addCriterion("F_FLOW_SN is null");
            return (Criteria) this;
        }

        public Criteria andFFlowSnIsNotNull() {
            addCriterion("F_FLOW_SN is not null");
            return (Criteria) this;
        }

        public Criteria andFFlowSnEqualTo(String value) {
            addCriterion("F_FLOW_SN =", value, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnNotEqualTo(String value) {
            addCriterion("F_FLOW_SN <>", value, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnGreaterThan(String value) {
            addCriterion("F_FLOW_SN >", value, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnGreaterThanOrEqualTo(String value) {
            addCriterion("F_FLOW_SN >=", value, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnLessThan(String value) {
            addCriterion("F_FLOW_SN <", value, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnLessThanOrEqualTo(String value) {
            addCriterion("F_FLOW_SN <=", value, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnLike(String value) {
            addCriterion("F_FLOW_SN like", value, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnNotLike(String value) {
            addCriterion("F_FLOW_SN not like", value, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnIn(List<String> values) {
            addCriterion("F_FLOW_SN in", values, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnNotIn(List<String> values) {
            addCriterion("F_FLOW_SN not in", values, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnBetween(String value1, String value2) {
            addCriterion("F_FLOW_SN between", value1, value2, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFFlowSnNotBetween(String value1, String value2) {
            addCriterion("F_FLOW_SN not between", value1, value2, "fFlowSn");
            return (Criteria) this;
        }

        public Criteria andFNodeIdIsNull() {
            addCriterion("F_NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andFNodeIdIsNotNull() {
            addCriterion("F_NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFNodeIdEqualTo(String value) {
            addCriterion("F_NODE_ID =", value, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdNotEqualTo(String value) {
            addCriterion("F_NODE_ID <>", value, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdGreaterThan(String value) {
            addCriterion("F_NODE_ID >", value, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_NODE_ID >=", value, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdLessThan(String value) {
            addCriterion("F_NODE_ID <", value, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdLessThanOrEqualTo(String value) {
            addCriterion("F_NODE_ID <=", value, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdLike(String value) {
            addCriterion("F_NODE_ID like", value, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdNotLike(String value) {
            addCriterion("F_NODE_ID not like", value, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdIn(List<String> values) {
            addCriterion("F_NODE_ID in", values, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdNotIn(List<String> values) {
            addCriterion("F_NODE_ID not in", values, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdBetween(String value1, String value2) {
            addCriterion("F_NODE_ID between", value1, value2, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFNodeIdNotBetween(String value1, String value2) {
            addCriterion("F_NODE_ID not between", value1, value2, "fNodeId");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgIsNull() {
            addCriterion("F_SUBM_ORG is null");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgIsNotNull() {
            addCriterion("F_SUBM_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgEqualTo(String value) {
            addCriterion("F_SUBM_ORG =", value, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgNotEqualTo(String value) {
            addCriterion("F_SUBM_ORG <>", value, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgGreaterThan(String value) {
            addCriterion("F_SUBM_ORG >", value, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgGreaterThanOrEqualTo(String value) {
            addCriterion("F_SUBM_ORG >=", value, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgLessThan(String value) {
            addCriterion("F_SUBM_ORG <", value, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgLessThanOrEqualTo(String value) {
            addCriterion("F_SUBM_ORG <=", value, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgLike(String value) {
            addCriterion("F_SUBM_ORG like", value, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgNotLike(String value) {
            addCriterion("F_SUBM_ORG not like", value, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgIn(List<String> values) {
            addCriterion("F_SUBM_ORG in", values, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgNotIn(List<String> values) {
            addCriterion("F_SUBM_ORG not in", values, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgBetween(String value1, String value2) {
            addCriterion("F_SUBM_ORG between", value1, value2, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmOrgNotBetween(String value1, String value2) {
            addCriterion("F_SUBM_ORG not between", value1, value2, "fSubmOrg");
            return (Criteria) this;
        }

        public Criteria andFSubmUserIsNull() {
            addCriterion("F_SUBM_USER is null");
            return (Criteria) this;
        }

        public Criteria andFSubmUserIsNotNull() {
            addCriterion("F_SUBM_USER is not null");
            return (Criteria) this;
        }

        public Criteria andFSubmUserEqualTo(String value) {
            addCriterion("F_SUBM_USER =", value, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserNotEqualTo(String value) {
            addCriterion("F_SUBM_USER <>", value, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserGreaterThan(String value) {
            addCriterion("F_SUBM_USER >", value, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserGreaterThanOrEqualTo(String value) {
            addCriterion("F_SUBM_USER >=", value, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserLessThan(String value) {
            addCriterion("F_SUBM_USER <", value, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserLessThanOrEqualTo(String value) {
            addCriterion("F_SUBM_USER <=", value, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserLike(String value) {
            addCriterion("F_SUBM_USER like", value, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserNotLike(String value) {
            addCriterion("F_SUBM_USER not like", value, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserIn(List<String> values) {
            addCriterion("F_SUBM_USER in", values, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserNotIn(List<String> values) {
            addCriterion("F_SUBM_USER not in", values, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserBetween(String value1, String value2) {
            addCriterion("F_SUBM_USER between", value1, value2, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFSubmUserNotBetween(String value1, String value2) {
            addCriterion("F_SUBM_USER not between", value1, value2, "fSubmUser");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeIsNull() {
            addCriterion("F_BIZ_SUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeIsNotNull() {
            addCriterion("F_BIZ_SUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeEqualTo(String value) {
            addCriterion("F_BIZ_SUBTYPE =", value, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeNotEqualTo(String value) {
            addCriterion("F_BIZ_SUBTYPE <>", value, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeGreaterThan(String value) {
            addCriterion("F_BIZ_SUBTYPE >", value, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_BIZ_SUBTYPE >=", value, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeLessThan(String value) {
            addCriterion("F_BIZ_SUBTYPE <", value, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeLessThanOrEqualTo(String value) {
            addCriterion("F_BIZ_SUBTYPE <=", value, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeLike(String value) {
            addCriterion("F_BIZ_SUBTYPE like", value, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeNotLike(String value) {
            addCriterion("F_BIZ_SUBTYPE not like", value, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeIn(List<String> values) {
            addCriterion("F_BIZ_SUBTYPE in", values, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeNotIn(List<String> values) {
            addCriterion("F_BIZ_SUBTYPE not in", values, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeBetween(String value1, String value2) {
            addCriterion("F_BIZ_SUBTYPE between", value1, value2, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFBizSubtypeNotBetween(String value1, String value2) {
            addCriterion("F_BIZ_SUBTYPE not between", value1, value2, "fBizSubtype");
            return (Criteria) this;
        }

        public Criteria andFDjlxIsNull() {
            addCriterion("F_DJLX is null");
            return (Criteria) this;
        }

        public Criteria andFDjlxIsNotNull() {
            addCriterion("F_DJLX is not null");
            return (Criteria) this;
        }

        public Criteria andFDjlxEqualTo(String value) {
            addCriterion("F_DJLX =", value, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxNotEqualTo(String value) {
            addCriterion("F_DJLX <>", value, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxGreaterThan(String value) {
            addCriterion("F_DJLX >", value, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxGreaterThanOrEqualTo(String value) {
            addCriterion("F_DJLX >=", value, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxLessThan(String value) {
            addCriterion("F_DJLX <", value, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxLessThanOrEqualTo(String value) {
            addCriterion("F_DJLX <=", value, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxLike(String value) {
            addCriterion("F_DJLX like", value, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxNotLike(String value) {
            addCriterion("F_DJLX not like", value, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxIn(List<String> values) {
            addCriterion("F_DJLX in", values, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxNotIn(List<String> values) {
            addCriterion("F_DJLX not in", values, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxBetween(String value1, String value2) {
            addCriterion("F_DJLX between", value1, value2, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFDjlxNotBetween(String value1, String value2) {
            addCriterion("F_DJLX not between", value1, value2, "fDjlx");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeIsNull() {
            addCriterion("F_EXPENSE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeIsNotNull() {
            addCriterion("F_EXPENSE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeEqualTo(String value) {
            addCriterion("F_EXPENSE_TYPE =", value, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeNotEqualTo(String value) {
            addCriterion("F_EXPENSE_TYPE <>", value, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeGreaterThan(String value) {
            addCriterion("F_EXPENSE_TYPE >", value, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_EXPENSE_TYPE >=", value, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeLessThan(String value) {
            addCriterion("F_EXPENSE_TYPE <", value, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeLessThanOrEqualTo(String value) {
            addCriterion("F_EXPENSE_TYPE <=", value, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeLike(String value) {
            addCriterion("F_EXPENSE_TYPE like", value, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeNotLike(String value) {
            addCriterion("F_EXPENSE_TYPE not like", value, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeIn(List<String> values) {
            addCriterion("F_EXPENSE_TYPE in", values, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeNotIn(List<String> values) {
            addCriterion("F_EXPENSE_TYPE not in", values, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeBetween(String value1, String value2) {
            addCriterion("F_EXPENSE_TYPE between", value1, value2, "fExpenseType");
            return (Criteria) this;
        }

        public Criteria andFExpenseTypeNotBetween(String value1, String value2) {
            addCriterion("F_EXPENSE_TYPE not between", value1, value2, "fExpenseType");
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

        public Criteria andFBillSummaryIsNull() {
            addCriterion("F_BILL_SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryIsNotNull() {
            addCriterion("F_BILL_SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryEqualTo(String value) {
            addCriterion("F_BILL_SUMMARY =", value, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryNotEqualTo(String value) {
            addCriterion("F_BILL_SUMMARY <>", value, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryGreaterThan(String value) {
            addCriterion("F_BILL_SUMMARY >", value, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("F_BILL_SUMMARY >=", value, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryLessThan(String value) {
            addCriterion("F_BILL_SUMMARY <", value, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryLessThanOrEqualTo(String value) {
            addCriterion("F_BILL_SUMMARY <=", value, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryLike(String value) {
            addCriterion("F_BILL_SUMMARY like", value, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryNotLike(String value) {
            addCriterion("F_BILL_SUMMARY not like", value, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryIn(List<String> values) {
            addCriterion("F_BILL_SUMMARY in", values, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryNotIn(List<String> values) {
            addCriterion("F_BILL_SUMMARY not in", values, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryBetween(String value1, String value2) {
            addCriterion("F_BILL_SUMMARY between", value1, value2, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBillSummaryNotBetween(String value1, String value2) {
            addCriterion("F_BILL_SUMMARY not between", value1, value2, "fBillSummary");
            return (Criteria) this;
        }

        public Criteria andFBzIsNull() {
            addCriterion("F_BZ is null");
            return (Criteria) this;
        }

        public Criteria andFBzIsNotNull() {
            addCriterion("F_BZ is not null");
            return (Criteria) this;
        }

        public Criteria andFBzEqualTo(String value) {
            addCriterion("F_BZ =", value, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzNotEqualTo(String value) {
            addCriterion("F_BZ <>", value, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzGreaterThan(String value) {
            addCriterion("F_BZ >", value, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzGreaterThanOrEqualTo(String value) {
            addCriterion("F_BZ >=", value, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzLessThan(String value) {
            addCriterion("F_BZ <", value, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzLessThanOrEqualTo(String value) {
            addCriterion("F_BZ <=", value, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzLike(String value) {
            addCriterion("F_BZ like", value, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzNotLike(String value) {
            addCriterion("F_BZ not like", value, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzIn(List<String> values) {
            addCriterion("F_BZ in", values, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzNotIn(List<String> values) {
            addCriterion("F_BZ not in", values, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzBetween(String value1, String value2) {
            addCriterion("F_BZ between", value1, value2, "fBz");
            return (Criteria) this;
        }

        public Criteria andFBzNotBetween(String value1, String value2) {
            addCriterion("F_BZ not between", value1, value2, "fBz");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtIsNull() {
            addCriterion("F_TOTAL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtIsNotNull() {
            addCriterion("F_TOTAL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtEqualTo(Double value) {
            addCriterion("F_TOTAL_AMT =", value, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtNotEqualTo(Double value) {
            addCriterion("F_TOTAL_AMT <>", value, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtGreaterThan(Double value) {
            addCriterion("F_TOTAL_AMT >", value, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("F_TOTAL_AMT >=", value, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtLessThan(Double value) {
            addCriterion("F_TOTAL_AMT <", value, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtLessThanOrEqualTo(Double value) {
            addCriterion("F_TOTAL_AMT <=", value, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtIn(List<Double> values) {
            addCriterion("F_TOTAL_AMT in", values, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtNotIn(List<Double> values) {
            addCriterion("F_TOTAL_AMT not in", values, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtBetween(Double value1, Double value2) {
            addCriterion("F_TOTAL_AMT between", value1, value2, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFTotalAmtNotBetween(Double value1, Double value2) {
            addCriterion("F_TOTAL_AMT not between", value1, value2, "fTotalAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtIsNull() {
            addCriterion("F_PAY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFPayAmtIsNotNull() {
            addCriterion("F_PAY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFPayAmtEqualTo(Double value) {
            addCriterion("F_PAY_AMT =", value, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtNotEqualTo(Double value) {
            addCriterion("F_PAY_AMT <>", value, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtGreaterThan(Double value) {
            addCriterion("F_PAY_AMT >", value, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtGreaterThanOrEqualTo(Double value) {
            addCriterion("F_PAY_AMT >=", value, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtLessThan(Double value) {
            addCriterion("F_PAY_AMT <", value, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtLessThanOrEqualTo(Double value) {
            addCriterion("F_PAY_AMT <=", value, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtIn(List<Double> values) {
            addCriterion("F_PAY_AMT in", values, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtNotIn(List<Double> values) {
            addCriterion("F_PAY_AMT not in", values, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtBetween(Double value1, Double value2) {
            addCriterion("F_PAY_AMT between", value1, value2, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFPayAmtNotBetween(Double value1, Double value2) {
            addCriterion("F_PAY_AMT not between", value1, value2, "fPayAmt");
            return (Criteria) this;
        }

        public Criteria andFOptUidIsNull() {
            addCriterion("F_OPT_UID is null");
            return (Criteria) this;
        }

        public Criteria andFOptUidIsNotNull() {
            addCriterion("F_OPT_UID is not null");
            return (Criteria) this;
        }

        public Criteria andFOptUidEqualTo(String value) {
            addCriterion("F_OPT_UID =", value, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidNotEqualTo(String value) {
            addCriterion("F_OPT_UID <>", value, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidGreaterThan(String value) {
            addCriterion("F_OPT_UID >", value, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidGreaterThanOrEqualTo(String value) {
            addCriterion("F_OPT_UID >=", value, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidLessThan(String value) {
            addCriterion("F_OPT_UID <", value, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidLessThanOrEqualTo(String value) {
            addCriterion("F_OPT_UID <=", value, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidLike(String value) {
            addCriterion("F_OPT_UID like", value, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidNotLike(String value) {
            addCriterion("F_OPT_UID not like", value, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidIn(List<String> values) {
            addCriterion("F_OPT_UID in", values, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidNotIn(List<String> values) {
            addCriterion("F_OPT_UID not in", values, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidBetween(String value1, String value2) {
            addCriterion("F_OPT_UID between", value1, value2, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUidNotBetween(String value1, String value2) {
            addCriterion("F_OPT_UID not between", value1, value2, "fOptUid");
            return (Criteria) this;
        }

        public Criteria andFOptUnameIsNull() {
            addCriterion("F_OPT_UNAME is null");
            return (Criteria) this;
        }

        public Criteria andFOptUnameIsNotNull() {
            addCriterion("F_OPT_UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFOptUnameEqualTo(String value) {
            addCriterion("F_OPT_UNAME =", value, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameNotEqualTo(String value) {
            addCriterion("F_OPT_UNAME <>", value, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameGreaterThan(String value) {
            addCriterion("F_OPT_UNAME >", value, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameGreaterThanOrEqualTo(String value) {
            addCriterion("F_OPT_UNAME >=", value, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameLessThan(String value) {
            addCriterion("F_OPT_UNAME <", value, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameLessThanOrEqualTo(String value) {
            addCriterion("F_OPT_UNAME <=", value, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameLike(String value) {
            addCriterion("F_OPT_UNAME like", value, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameNotLike(String value) {
            addCriterion("F_OPT_UNAME not like", value, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameIn(List<String> values) {
            addCriterion("F_OPT_UNAME in", values, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameNotIn(List<String> values) {
            addCriterion("F_OPT_UNAME not in", values, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameBetween(String value1, String value2) {
            addCriterion("F_OPT_UNAME between", value1, value2, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptUnameNotBetween(String value1, String value2) {
            addCriterion("F_OPT_UNAME not between", value1, value2, "fOptUname");
            return (Criteria) this;
        }

        public Criteria andFOptRoleIsNull() {
            addCriterion("F_OPT_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andFOptRoleIsNotNull() {
            addCriterion("F_OPT_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andFOptRoleEqualTo(String value) {
            addCriterion("F_OPT_ROLE =", value, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleNotEqualTo(String value) {
            addCriterion("F_OPT_ROLE <>", value, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleGreaterThan(String value) {
            addCriterion("F_OPT_ROLE >", value, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleGreaterThanOrEqualTo(String value) {
            addCriterion("F_OPT_ROLE >=", value, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleLessThan(String value) {
            addCriterion("F_OPT_ROLE <", value, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleLessThanOrEqualTo(String value) {
            addCriterion("F_OPT_ROLE <=", value, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleLike(String value) {
            addCriterion("F_OPT_ROLE like", value, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleNotLike(String value) {
            addCriterion("F_OPT_ROLE not like", value, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleIn(List<String> values) {
            addCriterion("F_OPT_ROLE in", values, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleNotIn(List<String> values) {
            addCriterion("F_OPT_ROLE not in", values, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleBetween(String value1, String value2) {
            addCriterion("F_OPT_ROLE between", value1, value2, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFOptRoleNotBetween(String value1, String value2) {
            addCriterion("F_OPT_ROLE not between", value1, value2, "fOptRole");
            return (Criteria) this;
        }

        public Criteria andFStaCrtIsNull() {
            addCriterion("F_STA_CRT is null");
            return (Criteria) this;
        }

        public Criteria andFStaCrtIsNotNull() {
            addCriterion("F_STA_CRT is not null");
            return (Criteria) this;
        }

        public Criteria andFStaCrtEqualTo(String value) {
            addCriterion("F_STA_CRT =", value, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtNotEqualTo(String value) {
            addCriterion("F_STA_CRT <>", value, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtGreaterThan(String value) {
            addCriterion("F_STA_CRT >", value, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_CRT >=", value, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtLessThan(String value) {
            addCriterion("F_STA_CRT <", value, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtLessThanOrEqualTo(String value) {
            addCriterion("F_STA_CRT <=", value, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtLike(String value) {
            addCriterion("F_STA_CRT like", value, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtNotLike(String value) {
            addCriterion("F_STA_CRT not like", value, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtIn(List<String> values) {
            addCriterion("F_STA_CRT in", values, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtNotIn(List<String> values) {
            addCriterion("F_STA_CRT not in", values, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtBetween(String value1, String value2) {
            addCriterion("F_STA_CRT between", value1, value2, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaCrtNotBetween(String value1, String value2) {
            addCriterion("F_STA_CRT not between", value1, value2, "fStaCrt");
            return (Criteria) this;
        }

        public Criteria andFStaImagIsNull() {
            addCriterion("F_STA_IMAG is null");
            return (Criteria) this;
        }

        public Criteria andFStaImagIsNotNull() {
            addCriterion("F_STA_IMAG is not null");
            return (Criteria) this;
        }

        public Criteria andFStaImagEqualTo(String value) {
            addCriterion("F_STA_IMAG =", value, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagNotEqualTo(String value) {
            addCriterion("F_STA_IMAG <>", value, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagGreaterThan(String value) {
            addCriterion("F_STA_IMAG >", value, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_IMAG >=", value, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagLessThan(String value) {
            addCriterion("F_STA_IMAG <", value, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagLessThanOrEqualTo(String value) {
            addCriterion("F_STA_IMAG <=", value, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagLike(String value) {
            addCriterion("F_STA_IMAG like", value, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagNotLike(String value) {
            addCriterion("F_STA_IMAG not like", value, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagIn(List<String> values) {
            addCriterion("F_STA_IMAG in", values, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagNotIn(List<String> values) {
            addCriterion("F_STA_IMAG not in", values, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagBetween(String value1, String value2) {
            addCriterion("F_STA_IMAG between", value1, value2, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaImagNotBetween(String value1, String value2) {
            addCriterion("F_STA_IMAG not between", value1, value2, "fStaImag");
            return (Criteria) this;
        }

        public Criteria andFStaGathIsNull() {
            addCriterion("F_STA_GATH is null");
            return (Criteria) this;
        }

        public Criteria andFStaGathIsNotNull() {
            addCriterion("F_STA_GATH is not null");
            return (Criteria) this;
        }

        public Criteria andFStaGathEqualTo(String value) {
            addCriterion("F_STA_GATH =", value, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathNotEqualTo(String value) {
            addCriterion("F_STA_GATH <>", value, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathGreaterThan(String value) {
            addCriterion("F_STA_GATH >", value, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_GATH >=", value, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathLessThan(String value) {
            addCriterion("F_STA_GATH <", value, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathLessThanOrEqualTo(String value) {
            addCriterion("F_STA_GATH <=", value, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathLike(String value) {
            addCriterion("F_STA_GATH like", value, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathNotLike(String value) {
            addCriterion("F_STA_GATH not like", value, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathIn(List<String> values) {
            addCriterion("F_STA_GATH in", values, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathNotIn(List<String> values) {
            addCriterion("F_STA_GATH not in", values, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathBetween(String value1, String value2) {
            addCriterion("F_STA_GATH between", value1, value2, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaGathNotBetween(String value1, String value2) {
            addCriterion("F_STA_GATH not between", value1, value2, "fStaGath");
            return (Criteria) this;
        }

        public Criteria andFStaEntrIsNull() {
            addCriterion("F_STA_ENTR is null");
            return (Criteria) this;
        }

        public Criteria andFStaEntrIsNotNull() {
            addCriterion("F_STA_ENTR is not null");
            return (Criteria) this;
        }

        public Criteria andFStaEntrEqualTo(String value) {
            addCriterion("F_STA_ENTR =", value, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrNotEqualTo(String value) {
            addCriterion("F_STA_ENTR <>", value, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrGreaterThan(String value) {
            addCriterion("F_STA_ENTR >", value, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_ENTR >=", value, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrLessThan(String value) {
            addCriterion("F_STA_ENTR <", value, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrLessThanOrEqualTo(String value) {
            addCriterion("F_STA_ENTR <=", value, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrLike(String value) {
            addCriterion("F_STA_ENTR like", value, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrNotLike(String value) {
            addCriterion("F_STA_ENTR not like", value, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrIn(List<String> values) {
            addCriterion("F_STA_ENTR in", values, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrNotIn(List<String> values) {
            addCriterion("F_STA_ENTR not in", values, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrBetween(String value1, String value2) {
            addCriterion("F_STA_ENTR between", value1, value2, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaEntrNotBetween(String value1, String value2) {
            addCriterion("F_STA_ENTR not between", value1, value2, "fStaEntr");
            return (Criteria) this;
        }

        public Criteria andFStaFdispIsNull() {
            addCriterion("F_STA_FDISP is null");
            return (Criteria) this;
        }

        public Criteria andFStaFdispIsNotNull() {
            addCriterion("F_STA_FDISP is not null");
            return (Criteria) this;
        }

        public Criteria andFStaFdispEqualTo(String value) {
            addCriterion("F_STA_FDISP =", value, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispNotEqualTo(String value) {
            addCriterion("F_STA_FDISP <>", value, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispGreaterThan(String value) {
            addCriterion("F_STA_FDISP >", value, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_FDISP >=", value, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispLessThan(String value) {
            addCriterion("F_STA_FDISP <", value, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispLessThanOrEqualTo(String value) {
            addCriterion("F_STA_FDISP <=", value, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispLike(String value) {
            addCriterion("F_STA_FDISP like", value, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispNotLike(String value) {
            addCriterion("F_STA_FDISP not like", value, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispIn(List<String> values) {
            addCriterion("F_STA_FDISP in", values, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispNotIn(List<String> values) {
            addCriterion("F_STA_FDISP not in", values, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispBetween(String value1, String value2) {
            addCriterion("F_STA_FDISP between", value1, value2, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFdispNotBetween(String value1, String value2) {
            addCriterion("F_STA_FDISP not between", value1, value2, "fStaFdisp");
            return (Criteria) this;
        }

        public Criteria andFStaFvepIsNull() {
            addCriterion("F_STA_FVEP is null");
            return (Criteria) this;
        }

        public Criteria andFStaFvepIsNotNull() {
            addCriterion("F_STA_FVEP is not null");
            return (Criteria) this;
        }

        public Criteria andFStaFvepEqualTo(String value) {
            addCriterion("F_STA_FVEP =", value, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepNotEqualTo(String value) {
            addCriterion("F_STA_FVEP <>", value, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepGreaterThan(String value) {
            addCriterion("F_STA_FVEP >", value, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_FVEP >=", value, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepLessThan(String value) {
            addCriterion("F_STA_FVEP <", value, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepLessThanOrEqualTo(String value) {
            addCriterion("F_STA_FVEP <=", value, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepLike(String value) {
            addCriterion("F_STA_FVEP like", value, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepNotLike(String value) {
            addCriterion("F_STA_FVEP not like", value, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepIn(List<String> values) {
            addCriterion("F_STA_FVEP in", values, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepNotIn(List<String> values) {
            addCriterion("F_STA_FVEP not in", values, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepBetween(String value1, String value2) {
            addCriterion("F_STA_FVEP between", value1, value2, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaFvepNotBetween(String value1, String value2) {
            addCriterion("F_STA_FVEP not between", value1, value2, "fStaFvep");
            return (Criteria) this;
        }

        public Criteria andFStaSdispIsNull() {
            addCriterion("F_STA_SDISP is null");
            return (Criteria) this;
        }

        public Criteria andFStaSdispIsNotNull() {
            addCriterion("F_STA_SDISP is not null");
            return (Criteria) this;
        }

        public Criteria andFStaSdispEqualTo(String value) {
            addCriterion("F_STA_SDISP =", value, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispNotEqualTo(String value) {
            addCriterion("F_STA_SDISP <>", value, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispGreaterThan(String value) {
            addCriterion("F_STA_SDISP >", value, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_SDISP >=", value, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispLessThan(String value) {
            addCriterion("F_STA_SDISP <", value, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispLessThanOrEqualTo(String value) {
            addCriterion("F_STA_SDISP <=", value, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispLike(String value) {
            addCriterion("F_STA_SDISP like", value, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispNotLike(String value) {
            addCriterion("F_STA_SDISP not like", value, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispIn(List<String> values) {
            addCriterion("F_STA_SDISP in", values, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispNotIn(List<String> values) {
            addCriterion("F_STA_SDISP not in", values, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispBetween(String value1, String value2) {
            addCriterion("F_STA_SDISP between", value1, value2, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSdispNotBetween(String value1, String value2) {
            addCriterion("F_STA_SDISP not between", value1, value2, "fStaSdisp");
            return (Criteria) this;
        }

        public Criteria andFStaSvepIsNull() {
            addCriterion("F_STA_SVEP is null");
            return (Criteria) this;
        }

        public Criteria andFStaSvepIsNotNull() {
            addCriterion("F_STA_SVEP is not null");
            return (Criteria) this;
        }

        public Criteria andFStaSvepEqualTo(String value) {
            addCriterion("F_STA_SVEP =", value, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepNotEqualTo(String value) {
            addCriterion("F_STA_SVEP <>", value, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepGreaterThan(String value) {
            addCriterion("F_STA_SVEP >", value, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_SVEP >=", value, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepLessThan(String value) {
            addCriterion("F_STA_SVEP <", value, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepLessThanOrEqualTo(String value) {
            addCriterion("F_STA_SVEP <=", value, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepLike(String value) {
            addCriterion("F_STA_SVEP like", value, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepNotLike(String value) {
            addCriterion("F_STA_SVEP not like", value, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepIn(List<String> values) {
            addCriterion("F_STA_SVEP in", values, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepNotIn(List<String> values) {
            addCriterion("F_STA_SVEP not in", values, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepBetween(String value1, String value2) {
            addCriterion("F_STA_SVEP between", value1, value2, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaSvepNotBetween(String value1, String value2) {
            addCriterion("F_STA_SVEP not between", value1, value2, "fStaSvep");
            return (Criteria) this;
        }

        public Criteria andFStaPauseIsNull() {
            addCriterion("F_STA_PAUSE is null");
            return (Criteria) this;
        }

        public Criteria andFStaPauseIsNotNull() {
            addCriterion("F_STA_PAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andFStaPauseEqualTo(String value) {
            addCriterion("F_STA_PAUSE =", value, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseNotEqualTo(String value) {
            addCriterion("F_STA_PAUSE <>", value, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseGreaterThan(String value) {
            addCriterion("F_STA_PAUSE >", value, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_PAUSE >=", value, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseLessThan(String value) {
            addCriterion("F_STA_PAUSE <", value, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseLessThanOrEqualTo(String value) {
            addCriterion("F_STA_PAUSE <=", value, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseLike(String value) {
            addCriterion("F_STA_PAUSE like", value, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseNotLike(String value) {
            addCriterion("F_STA_PAUSE not like", value, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseIn(List<String> values) {
            addCriterion("F_STA_PAUSE in", values, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseNotIn(List<String> values) {
            addCriterion("F_STA_PAUSE not in", values, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseBetween(String value1, String value2) {
            addCriterion("F_STA_PAUSE between", value1, value2, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFStaPauseNotBetween(String value1, String value2) {
            addCriterion("F_STA_PAUSE not between", value1, value2, "fStaPause");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeIsNull() {
            addCriterion("F_TASK_INCOME is null");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeIsNotNull() {
            addCriterion("F_TASK_INCOME is not null");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeEqualTo(String value) {
            addCriterion("F_TASK_INCOME =", value, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeNotEqualTo(String value) {
            addCriterion("F_TASK_INCOME <>", value, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeGreaterThan(String value) {
            addCriterion("F_TASK_INCOME >", value, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("F_TASK_INCOME >=", value, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeLessThan(String value) {
            addCriterion("F_TASK_INCOME <", value, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeLessThanOrEqualTo(String value) {
            addCriterion("F_TASK_INCOME <=", value, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeLike(String value) {
            addCriterion("F_TASK_INCOME like", value, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeNotLike(String value) {
            addCriterion("F_TASK_INCOME not like", value, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeIn(List<String> values) {
            addCriterion("F_TASK_INCOME in", values, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeNotIn(List<String> values) {
            addCriterion("F_TASK_INCOME not in", values, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeBetween(String value1, String value2) {
            addCriterion("F_TASK_INCOME between", value1, value2, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFTaskIncomeNotBetween(String value1, String value2) {
            addCriterion("F_TASK_INCOME not between", value1, value2, "fTaskIncome");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeIsNull() {
            addCriterion("F_CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeIsNotNull() {
            addCriterion("F_CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeEqualTo(String value) {
            addCriterion("F_CRT_TIME =", value, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeNotEqualTo(String value) {
            addCriterion("F_CRT_TIME <>", value, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeGreaterThan(String value) {
            addCriterion("F_CRT_TIME >", value, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_CRT_TIME >=", value, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeLessThan(String value) {
            addCriterion("F_CRT_TIME <", value, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeLessThanOrEqualTo(String value) {
            addCriterion("F_CRT_TIME <=", value, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeLike(String value) {
            addCriterion("F_CRT_TIME like", value, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeNotLike(String value) {
            addCriterion("F_CRT_TIME not like", value, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeIn(List<String> values) {
            addCriterion("F_CRT_TIME in", values, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeNotIn(List<String> values) {
            addCriterion("F_CRT_TIME not in", values, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeBetween(String value1, String value2) {
            addCriterion("F_CRT_TIME between", value1, value2, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFCrtTimeNotBetween(String value1, String value2) {
            addCriterion("F_CRT_TIME not between", value1, value2, "fCrtTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeIsNull() {
            addCriterion("F_ENTSC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeIsNotNull() {
            addCriterion("F_ENTSC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeEqualTo(String value) {
            addCriterion("F_ENTSC_TIME =", value, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeNotEqualTo(String value) {
            addCriterion("F_ENTSC_TIME <>", value, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeGreaterThan(String value) {
            addCriterion("F_ENTSC_TIME >", value, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_ENTSC_TIME >=", value, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeLessThan(String value) {
            addCriterion("F_ENTSC_TIME <", value, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeLessThanOrEqualTo(String value) {
            addCriterion("F_ENTSC_TIME <=", value, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeLike(String value) {
            addCriterion("F_ENTSC_TIME like", value, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeNotLike(String value) {
            addCriterion("F_ENTSC_TIME not like", value, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeIn(List<String> values) {
            addCriterion("F_ENTSC_TIME in", values, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeNotIn(List<String> values) {
            addCriterion("F_ENTSC_TIME not in", values, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeBetween(String value1, String value2) {
            addCriterion("F_ENTSC_TIME between", value1, value2, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFEntscTimeNotBetween(String value1, String value2) {
            addCriterion("F_ENTSC_TIME not between", value1, value2, "fEntscTime");
            return (Criteria) this;
        }

        public Criteria andFFdispUidIsNull() {
            addCriterion("F_FDISP_UID is null");
            return (Criteria) this;
        }

        public Criteria andFFdispUidIsNotNull() {
            addCriterion("F_FDISP_UID is not null");
            return (Criteria) this;
        }

        public Criteria andFFdispUidEqualTo(String value) {
            addCriterion("F_FDISP_UID =", value, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidNotEqualTo(String value) {
            addCriterion("F_FDISP_UID <>", value, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidGreaterThan(String value) {
            addCriterion("F_FDISP_UID >", value, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidGreaterThanOrEqualTo(String value) {
            addCriterion("F_FDISP_UID >=", value, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidLessThan(String value) {
            addCriterion("F_FDISP_UID <", value, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidLessThanOrEqualTo(String value) {
            addCriterion("F_FDISP_UID <=", value, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidLike(String value) {
            addCriterion("F_FDISP_UID like", value, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidNotLike(String value) {
            addCriterion("F_FDISP_UID not like", value, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidIn(List<String> values) {
            addCriterion("F_FDISP_UID in", values, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidNotIn(List<String> values) {
            addCriterion("F_FDISP_UID not in", values, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidBetween(String value1, String value2) {
            addCriterion("F_FDISP_UID between", value1, value2, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispUidNotBetween(String value1, String value2) {
            addCriterion("F_FDISP_UID not between", value1, value2, "fFdispUid");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeIsNull() {
            addCriterion("F_FDISP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeIsNotNull() {
            addCriterion("F_FDISP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeEqualTo(String value) {
            addCriterion("F_FDISP_TIME =", value, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeNotEqualTo(String value) {
            addCriterion("F_FDISP_TIME <>", value, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeGreaterThan(String value) {
            addCriterion("F_FDISP_TIME >", value, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_FDISP_TIME >=", value, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeLessThan(String value) {
            addCriterion("F_FDISP_TIME <", value, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeLessThanOrEqualTo(String value) {
            addCriterion("F_FDISP_TIME <=", value, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeLike(String value) {
            addCriterion("F_FDISP_TIME like", value, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeNotLike(String value) {
            addCriterion("F_FDISP_TIME not like", value, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeIn(List<String> values) {
            addCriterion("F_FDISP_TIME in", values, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeNotIn(List<String> values) {
            addCriterion("F_FDISP_TIME not in", values, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeBetween(String value1, String value2) {
            addCriterion("F_FDISP_TIME between", value1, value2, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFdispTimeNotBetween(String value1, String value2) {
            addCriterion("F_FDISP_TIME not between", value1, value2, "fFdispTime");
            return (Criteria) this;
        }

        public Criteria andFFvepUidIsNull() {
            addCriterion("F_FVEP_UID is null");
            return (Criteria) this;
        }

        public Criteria andFFvepUidIsNotNull() {
            addCriterion("F_FVEP_UID is not null");
            return (Criteria) this;
        }

        public Criteria andFFvepUidEqualTo(String value) {
            addCriterion("F_FVEP_UID =", value, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidNotEqualTo(String value) {
            addCriterion("F_FVEP_UID <>", value, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidGreaterThan(String value) {
            addCriterion("F_FVEP_UID >", value, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidGreaterThanOrEqualTo(String value) {
            addCriterion("F_FVEP_UID >=", value, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidLessThan(String value) {
            addCriterion("F_FVEP_UID <", value, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidLessThanOrEqualTo(String value) {
            addCriterion("F_FVEP_UID <=", value, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidLike(String value) {
            addCriterion("F_FVEP_UID like", value, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidNotLike(String value) {
            addCriterion("F_FVEP_UID not like", value, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidIn(List<String> values) {
            addCriterion("F_FVEP_UID in", values, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidNotIn(List<String> values) {
            addCriterion("F_FVEP_UID not in", values, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidBetween(String value1, String value2) {
            addCriterion("F_FVEP_UID between", value1, value2, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepUidNotBetween(String value1, String value2) {
            addCriterion("F_FVEP_UID not between", value1, value2, "fFvepUid");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeIsNull() {
            addCriterion("F_FVEP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeIsNotNull() {
            addCriterion("F_FVEP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeEqualTo(String value) {
            addCriterion("F_FVEP_TIME =", value, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeNotEqualTo(String value) {
            addCriterion("F_FVEP_TIME <>", value, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeGreaterThan(String value) {
            addCriterion("F_FVEP_TIME >", value, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_FVEP_TIME >=", value, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeLessThan(String value) {
            addCriterion("F_FVEP_TIME <", value, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeLessThanOrEqualTo(String value) {
            addCriterion("F_FVEP_TIME <=", value, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeLike(String value) {
            addCriterion("F_FVEP_TIME like", value, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeNotLike(String value) {
            addCriterion("F_FVEP_TIME not like", value, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeIn(List<String> values) {
            addCriterion("F_FVEP_TIME in", values, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeNotIn(List<String> values) {
            addCriterion("F_FVEP_TIME not in", values, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeBetween(String value1, String value2) {
            addCriterion("F_FVEP_TIME between", value1, value2, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFFvepTimeNotBetween(String value1, String value2) {
            addCriterion("F_FVEP_TIME not between", value1, value2, "fFvepTime");
            return (Criteria) this;
        }

        public Criteria andFSdispUidIsNull() {
            addCriterion("F_SDISP_UID is null");
            return (Criteria) this;
        }

        public Criteria andFSdispUidIsNotNull() {
            addCriterion("F_SDISP_UID is not null");
            return (Criteria) this;
        }

        public Criteria andFSdispUidEqualTo(String value) {
            addCriterion("F_SDISP_UID =", value, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidNotEqualTo(String value) {
            addCriterion("F_SDISP_UID <>", value, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidGreaterThan(String value) {
            addCriterion("F_SDISP_UID >", value, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidGreaterThanOrEqualTo(String value) {
            addCriterion("F_SDISP_UID >=", value, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidLessThan(String value) {
            addCriterion("F_SDISP_UID <", value, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidLessThanOrEqualTo(String value) {
            addCriterion("F_SDISP_UID <=", value, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidLike(String value) {
            addCriterion("F_SDISP_UID like", value, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidNotLike(String value) {
            addCriterion("F_SDISP_UID not like", value, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidIn(List<String> values) {
            addCriterion("F_SDISP_UID in", values, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidNotIn(List<String> values) {
            addCriterion("F_SDISP_UID not in", values, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidBetween(String value1, String value2) {
            addCriterion("F_SDISP_UID between", value1, value2, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispUidNotBetween(String value1, String value2) {
            addCriterion("F_SDISP_UID not between", value1, value2, "fSdispUid");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeIsNull() {
            addCriterion("F_SDISP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeIsNotNull() {
            addCriterion("F_SDISP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeEqualTo(String value) {
            addCriterion("F_SDISP_TIME =", value, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeNotEqualTo(String value) {
            addCriterion("F_SDISP_TIME <>", value, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeGreaterThan(String value) {
            addCriterion("F_SDISP_TIME >", value, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_SDISP_TIME >=", value, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeLessThan(String value) {
            addCriterion("F_SDISP_TIME <", value, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeLessThanOrEqualTo(String value) {
            addCriterion("F_SDISP_TIME <=", value, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeLike(String value) {
            addCriterion("F_SDISP_TIME like", value, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeNotLike(String value) {
            addCriterion("F_SDISP_TIME not like", value, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeIn(List<String> values) {
            addCriterion("F_SDISP_TIME in", values, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeNotIn(List<String> values) {
            addCriterion("F_SDISP_TIME not in", values, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeBetween(String value1, String value2) {
            addCriterion("F_SDISP_TIME between", value1, value2, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSdispTimeNotBetween(String value1, String value2) {
            addCriterion("F_SDISP_TIME not between", value1, value2, "fSdispTime");
            return (Criteria) this;
        }

        public Criteria andFSvepUidIsNull() {
            addCriterion("F_SVEP_UID is null");
            return (Criteria) this;
        }

        public Criteria andFSvepUidIsNotNull() {
            addCriterion("F_SVEP_UID is not null");
            return (Criteria) this;
        }

        public Criteria andFSvepUidEqualTo(String value) {
            addCriterion("F_SVEP_UID =", value, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidNotEqualTo(String value) {
            addCriterion("F_SVEP_UID <>", value, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidGreaterThan(String value) {
            addCriterion("F_SVEP_UID >", value, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidGreaterThanOrEqualTo(String value) {
            addCriterion("F_SVEP_UID >=", value, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidLessThan(String value) {
            addCriterion("F_SVEP_UID <", value, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidLessThanOrEqualTo(String value) {
            addCriterion("F_SVEP_UID <=", value, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidLike(String value) {
            addCriterion("F_SVEP_UID like", value, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidNotLike(String value) {
            addCriterion("F_SVEP_UID not like", value, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidIn(List<String> values) {
            addCriterion("F_SVEP_UID in", values, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidNotIn(List<String> values) {
            addCriterion("F_SVEP_UID not in", values, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidBetween(String value1, String value2) {
            addCriterion("F_SVEP_UID between", value1, value2, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepUidNotBetween(String value1, String value2) {
            addCriterion("F_SVEP_UID not between", value1, value2, "fSvepUid");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeIsNull() {
            addCriterion("F_SVEP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeIsNotNull() {
            addCriterion("F_SVEP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeEqualTo(String value) {
            addCriterion("F_SVEP_TIME =", value, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeNotEqualTo(String value) {
            addCriterion("F_SVEP_TIME <>", value, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeGreaterThan(String value) {
            addCriterion("F_SVEP_TIME >", value, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_SVEP_TIME >=", value, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeLessThan(String value) {
            addCriterion("F_SVEP_TIME <", value, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeLessThanOrEqualTo(String value) {
            addCriterion("F_SVEP_TIME <=", value, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeLike(String value) {
            addCriterion("F_SVEP_TIME like", value, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeNotLike(String value) {
            addCriterion("F_SVEP_TIME not like", value, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeIn(List<String> values) {
            addCriterion("F_SVEP_TIME in", values, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeNotIn(List<String> values) {
            addCriterion("F_SVEP_TIME not in", values, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeBetween(String value1, String value2) {
            addCriterion("F_SVEP_TIME between", value1, value2, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFSvepTimeNotBetween(String value1, String value2) {
            addCriterion("F_SVEP_TIME not between", value1, value2, "fSvepTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeIsNull() {
            addCriterion("F_PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFPayTimeIsNotNull() {
            addCriterion("F_PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFPayTimeEqualTo(String value) {
            addCriterion("F_PAY_TIME =", value, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeNotEqualTo(String value) {
            addCriterion("F_PAY_TIME <>", value, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeGreaterThan(String value) {
            addCriterion("F_PAY_TIME >", value, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_PAY_TIME >=", value, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeLessThan(String value) {
            addCriterion("F_PAY_TIME <", value, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeLessThanOrEqualTo(String value) {
            addCriterion("F_PAY_TIME <=", value, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeLike(String value) {
            addCriterion("F_PAY_TIME like", value, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeNotLike(String value) {
            addCriterion("F_PAY_TIME not like", value, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeIn(List<String> values) {
            addCriterion("F_PAY_TIME in", values, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeNotIn(List<String> values) {
            addCriterion("F_PAY_TIME not in", values, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeBetween(String value1, String value2) {
            addCriterion("F_PAY_TIME between", value1, value2, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFPayTimeNotBetween(String value1, String value2) {
            addCriterion("F_PAY_TIME not between", value1, value2, "fPayTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeIsNull() {
            addCriterion("F_MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeIsNotNull() {
            addCriterion("F_MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeEqualTo(String value) {
            addCriterion("F_MODIFY_TIME =", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeNotEqualTo(String value) {
            addCriterion("F_MODIFY_TIME <>", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeGreaterThan(String value) {
            addCriterion("F_MODIFY_TIME >", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_MODIFY_TIME >=", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeLessThan(String value) {
            addCriterion("F_MODIFY_TIME <", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeLessThanOrEqualTo(String value) {
            addCriterion("F_MODIFY_TIME <=", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeLike(String value) {
            addCriterion("F_MODIFY_TIME like", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeNotLike(String value) {
            addCriterion("F_MODIFY_TIME not like", value, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeIn(List<String> values) {
            addCriterion("F_MODIFY_TIME in", values, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeNotIn(List<String> values) {
            addCriterion("F_MODIFY_TIME not in", values, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeBetween(String value1, String value2) {
            addCriterion("F_MODIFY_TIME between", value1, value2, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFModifyTimeNotBetween(String value1, String value2) {
            addCriterion("F_MODIFY_TIME not between", value1, value2, "fModifyTime");
            return (Criteria) this;
        }

        public Criteria andFAttCntIsNull() {
            addCriterion("F_ATT_CNT is null");
            return (Criteria) this;
        }

        public Criteria andFAttCntIsNotNull() {
            addCriterion("F_ATT_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andFAttCntEqualTo(Integer value) {
            addCriterion("F_ATT_CNT =", value, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntNotEqualTo(Integer value) {
            addCriterion("F_ATT_CNT <>", value, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntGreaterThan(Integer value) {
            addCriterion("F_ATT_CNT >", value, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_ATT_CNT >=", value, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntLessThan(Integer value) {
            addCriterion("F_ATT_CNT <", value, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntLessThanOrEqualTo(Integer value) {
            addCriterion("F_ATT_CNT <=", value, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntIn(List<Integer> values) {
            addCriterion("F_ATT_CNT in", values, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntNotIn(List<Integer> values) {
            addCriterion("F_ATT_CNT not in", values, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntBetween(Integer value1, Integer value2) {
            addCriterion("F_ATT_CNT between", value1, value2, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFAttCntNotBetween(Integer value1, Integer value2) {
            addCriterion("F_ATT_CNT not between", value1, value2, "fAttCnt");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeIsNull() {
            addCriterion("F_INCOME_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeIsNotNull() {
            addCriterion("F_INCOME_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeEqualTo(String value) {
            addCriterion("F_INCOME_TYPE =", value, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeNotEqualTo(String value) {
            addCriterion("F_INCOME_TYPE <>", value, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeGreaterThan(String value) {
            addCriterion("F_INCOME_TYPE >", value, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("F_INCOME_TYPE >=", value, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeLessThan(String value) {
            addCriterion("F_INCOME_TYPE <", value, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeLessThanOrEqualTo(String value) {
            addCriterion("F_INCOME_TYPE <=", value, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeLike(String value) {
            addCriterion("F_INCOME_TYPE like", value, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeNotLike(String value) {
            addCriterion("F_INCOME_TYPE not like", value, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeIn(List<String> values) {
            addCriterion("F_INCOME_TYPE in", values, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeNotIn(List<String> values) {
            addCriterion("F_INCOME_TYPE not in", values, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeBetween(String value1, String value2) {
            addCriterion("F_INCOME_TYPE between", value1, value2, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFIncomeTypeNotBetween(String value1, String value2) {
            addCriterion("F_INCOME_TYPE not between", value1, value2, "fIncomeType");
            return (Criteria) this;
        }

        public Criteria andFPrirLevIsNull() {
            addCriterion("F_PRIR_LEV is null");
            return (Criteria) this;
        }

        public Criteria andFPrirLevIsNotNull() {
            addCriterion("F_PRIR_LEV is not null");
            return (Criteria) this;
        }

        public Criteria andFPrirLevEqualTo(Integer value) {
            addCriterion("F_PRIR_LEV =", value, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevNotEqualTo(Integer value) {
            addCriterion("F_PRIR_LEV <>", value, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevGreaterThan(Integer value) {
            addCriterion("F_PRIR_LEV >", value, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_PRIR_LEV >=", value, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevLessThan(Integer value) {
            addCriterion("F_PRIR_LEV <", value, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevLessThanOrEqualTo(Integer value) {
            addCriterion("F_PRIR_LEV <=", value, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevIn(List<Integer> values) {
            addCriterion("F_PRIR_LEV in", values, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevNotIn(List<Integer> values) {
            addCriterion("F_PRIR_LEV not in", values, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevBetween(Integer value1, Integer value2) {
            addCriterion("F_PRIR_LEV between", value1, value2, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFPrirLevNotBetween(Integer value1, Integer value2) {
            addCriterion("F_PRIR_LEV not between", value1, value2, "fPrirLev");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdIsNull() {
            addCriterion("F_CRDT_GRD is null");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdIsNotNull() {
            addCriterion("F_CRDT_GRD is not null");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdEqualTo(String value) {
            addCriterion("F_CRDT_GRD =", value, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdNotEqualTo(String value) {
            addCriterion("F_CRDT_GRD <>", value, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdGreaterThan(String value) {
            addCriterion("F_CRDT_GRD >", value, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdGreaterThanOrEqualTo(String value) {
            addCriterion("F_CRDT_GRD >=", value, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdLessThan(String value) {
            addCriterion("F_CRDT_GRD <", value, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdLessThanOrEqualTo(String value) {
            addCriterion("F_CRDT_GRD <=", value, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdLike(String value) {
            addCriterion("F_CRDT_GRD like", value, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdNotLike(String value) {
            addCriterion("F_CRDT_GRD not like", value, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdIn(List<String> values) {
            addCriterion("F_CRDT_GRD in", values, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdNotIn(List<String> values) {
            addCriterion("F_CRDT_GRD not in", values, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdBetween(String value1, String value2) {
            addCriterion("F_CRDT_GRD between", value1, value2, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFCrdtGrdNotBetween(String value1, String value2) {
            addCriterion("F_CRDT_GRD not between", value1, value2, "fCrdtGrd");
            return (Criteria) this;
        }

        public Criteria andFWarnStaIsNull() {
            addCriterion("F_WARN_STA is null");
            return (Criteria) this;
        }

        public Criteria andFWarnStaIsNotNull() {
            addCriterion("F_WARN_STA is not null");
            return (Criteria) this;
        }

        public Criteria andFWarnStaEqualTo(String value) {
            addCriterion("F_WARN_STA =", value, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaNotEqualTo(String value) {
            addCriterion("F_WARN_STA <>", value, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaGreaterThan(String value) {
            addCriterion("F_WARN_STA >", value, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaGreaterThanOrEqualTo(String value) {
            addCriterion("F_WARN_STA >=", value, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaLessThan(String value) {
            addCriterion("F_WARN_STA <", value, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaLessThanOrEqualTo(String value) {
            addCriterion("F_WARN_STA <=", value, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaLike(String value) {
            addCriterion("F_WARN_STA like", value, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaNotLike(String value) {
            addCriterion("F_WARN_STA not like", value, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaIn(List<String> values) {
            addCriterion("F_WARN_STA in", values, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaNotIn(List<String> values) {
            addCriterion("F_WARN_STA not in", values, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaBetween(String value1, String value2) {
            addCriterion("F_WARN_STA between", value1, value2, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFWarnStaNotBetween(String value1, String value2) {
            addCriterion("F_WARN_STA not between", value1, value2, "fWarnSta");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpIsNull() {
            addCriterion("F_FVEP_GRP is null");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpIsNotNull() {
            addCriterion("F_FVEP_GRP is not null");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpEqualTo(String value) {
            addCriterion("F_FVEP_GRP =", value, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpNotEqualTo(String value) {
            addCriterion("F_FVEP_GRP <>", value, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpGreaterThan(String value) {
            addCriterion("F_FVEP_GRP >", value, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpGreaterThanOrEqualTo(String value) {
            addCriterion("F_FVEP_GRP >=", value, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpLessThan(String value) {
            addCriterion("F_FVEP_GRP <", value, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpLessThanOrEqualTo(String value) {
            addCriterion("F_FVEP_GRP <=", value, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpLike(String value) {
            addCriterion("F_FVEP_GRP like", value, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpNotLike(String value) {
            addCriterion("F_FVEP_GRP not like", value, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpIn(List<String> values) {
            addCriterion("F_FVEP_GRP in", values, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpNotIn(List<String> values) {
            addCriterion("F_FVEP_GRP not in", values, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpBetween(String value1, String value2) {
            addCriterion("F_FVEP_GRP between", value1, value2, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFFvepGrpNotBetween(String value1, String value2) {
            addCriterion("F_FVEP_GRP not between", value1, value2, "fFvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpIsNull() {
            addCriterion("F_SVEP_GRP is null");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpIsNotNull() {
            addCriterion("F_SVEP_GRP is not null");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpEqualTo(String value) {
            addCriterion("F_SVEP_GRP =", value, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpNotEqualTo(String value) {
            addCriterion("F_SVEP_GRP <>", value, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpGreaterThan(String value) {
            addCriterion("F_SVEP_GRP >", value, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpGreaterThanOrEqualTo(String value) {
            addCriterion("F_SVEP_GRP >=", value, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpLessThan(String value) {
            addCriterion("F_SVEP_GRP <", value, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpLessThanOrEqualTo(String value) {
            addCriterion("F_SVEP_GRP <=", value, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpLike(String value) {
            addCriterion("F_SVEP_GRP like", value, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpNotLike(String value) {
            addCriterion("F_SVEP_GRP not like", value, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpIn(List<String> values) {
            addCriterion("F_SVEP_GRP in", values, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpNotIn(List<String> values) {
            addCriterion("F_SVEP_GRP not in", values, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpBetween(String value1, String value2) {
            addCriterion("F_SVEP_GRP between", value1, value2, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFSvepGrpNotBetween(String value1, String value2) {
            addCriterion("F_SVEP_GRP not between", value1, value2, "fSvepGrp");
            return (Criteria) this;
        }

        public Criteria andFErpHsztIsNull() {
            addCriterion("F_ERP_HSZT is null");
            return (Criteria) this;
        }

        public Criteria andFErpHsztIsNotNull() {
            addCriterion("F_ERP_HSZT is not null");
            return (Criteria) this;
        }

        public Criteria andFErpHsztEqualTo(String value) {
            addCriterion("F_ERP_HSZT =", value, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztNotEqualTo(String value) {
            addCriterion("F_ERP_HSZT <>", value, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztGreaterThan(String value) {
            addCriterion("F_ERP_HSZT >", value, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztGreaterThanOrEqualTo(String value) {
            addCriterion("F_ERP_HSZT >=", value, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztLessThan(String value) {
            addCriterion("F_ERP_HSZT <", value, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztLessThanOrEqualTo(String value) {
            addCriterion("F_ERP_HSZT <=", value, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztLike(String value) {
            addCriterion("F_ERP_HSZT like", value, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztNotLike(String value) {
            addCriterion("F_ERP_HSZT not like", value, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztIn(List<String> values) {
            addCriterion("F_ERP_HSZT in", values, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztNotIn(List<String> values) {
            addCriterion("F_ERP_HSZT not in", values, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztBetween(String value1, String value2) {
            addCriterion("F_ERP_HSZT between", value1, value2, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFErpHsztNotBetween(String value1, String value2) {
            addCriterion("F_ERP_HSZT not between", value1, value2, "fErpHszt");
            return (Criteria) this;
        }

        public Criteria andFGyshcsIsNull() {
            addCriterion("F_GYSHCS is null");
            return (Criteria) this;
        }

        public Criteria andFGyshcsIsNotNull() {
            addCriterion("F_GYSHCS is not null");
            return (Criteria) this;
        }

        public Criteria andFGyshcsEqualTo(Integer value) {
            addCriterion("F_GYSHCS =", value, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsNotEqualTo(Integer value) {
            addCriterion("F_GYSHCS <>", value, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsGreaterThan(Integer value) {
            addCriterion("F_GYSHCS >", value, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_GYSHCS >=", value, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsLessThan(Integer value) {
            addCriterion("F_GYSHCS <", value, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsLessThanOrEqualTo(Integer value) {
            addCriterion("F_GYSHCS <=", value, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsIn(List<Integer> values) {
            addCriterion("F_GYSHCS in", values, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsNotIn(List<Integer> values) {
            addCriterion("F_GYSHCS not in", values, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsBetween(Integer value1, Integer value2) {
            addCriterion("F_GYSHCS between", value1, value2, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFGyshcsNotBetween(Integer value1, Integer value2) {
            addCriterion("F_GYSHCS not between", value1, value2, "fGyshcs");
            return (Criteria) this;
        }

        public Criteria andFDjhsIsNull() {
            addCriterion("F_DJHS is null");
            return (Criteria) this;
        }

        public Criteria andFDjhsIsNotNull() {
            addCriterion("F_DJHS is not null");
            return (Criteria) this;
        }

        public Criteria andFDjhsEqualTo(Integer value) {
            addCriterion("F_DJHS =", value, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsNotEqualTo(Integer value) {
            addCriterion("F_DJHS <>", value, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsGreaterThan(Integer value) {
            addCriterion("F_DJHS >", value, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_DJHS >=", value, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsLessThan(Integer value) {
            addCriterion("F_DJHS <", value, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsLessThanOrEqualTo(Integer value) {
            addCriterion("F_DJHS <=", value, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsIn(List<Integer> values) {
            addCriterion("F_DJHS in", values, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsNotIn(List<Integer> values) {
            addCriterion("F_DJHS not in", values, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsBetween(Integer value1, Integer value2) {
            addCriterion("F_DJHS between", value1, value2, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFDjhsNotBetween(Integer value1, Integer value2) {
            addCriterion("F_DJHS not between", value1, value2, "fDjhs");
            return (Criteria) this;
        }

        public Criteria andFJhrbhIsNull() {
            addCriterion("F_JHRBH is null");
            return (Criteria) this;
        }

        public Criteria andFJhrbhIsNotNull() {
            addCriterion("F_JHRBH is not null");
            return (Criteria) this;
        }

        public Criteria andFJhrbhEqualTo(String value) {
            addCriterion("F_JHRBH =", value, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhNotEqualTo(String value) {
            addCriterion("F_JHRBH <>", value, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhGreaterThan(String value) {
            addCriterion("F_JHRBH >", value, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhGreaterThanOrEqualTo(String value) {
            addCriterion("F_JHRBH >=", value, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhLessThan(String value) {
            addCriterion("F_JHRBH <", value, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhLessThanOrEqualTo(String value) {
            addCriterion("F_JHRBH <=", value, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhLike(String value) {
            addCriterion("F_JHRBH like", value, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhNotLike(String value) {
            addCriterion("F_JHRBH not like", value, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhIn(List<String> values) {
            addCriterion("F_JHRBH in", values, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhNotIn(List<String> values) {
            addCriterion("F_JHRBH not in", values, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhBetween(String value1, String value2) {
            addCriterion("F_JHRBH between", value1, value2, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrbhNotBetween(String value1, String value2) {
            addCriterion("F_JHRBH not between", value1, value2, "fJhrbh");
            return (Criteria) this;
        }

        public Criteria andFJhrmcIsNull() {
            addCriterion("F_JHRMC is null");
            return (Criteria) this;
        }

        public Criteria andFJhrmcIsNotNull() {
            addCriterion("F_JHRMC is not null");
            return (Criteria) this;
        }

        public Criteria andFJhrmcEqualTo(String value) {
            addCriterion("F_JHRMC =", value, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcNotEqualTo(String value) {
            addCriterion("F_JHRMC <>", value, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcGreaterThan(String value) {
            addCriterion("F_JHRMC >", value, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcGreaterThanOrEqualTo(String value) {
            addCriterion("F_JHRMC >=", value, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcLessThan(String value) {
            addCriterion("F_JHRMC <", value, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcLessThanOrEqualTo(String value) {
            addCriterion("F_JHRMC <=", value, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcLike(String value) {
            addCriterion("F_JHRMC like", value, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcNotLike(String value) {
            addCriterion("F_JHRMC not like", value, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcIn(List<String> values) {
            addCriterion("F_JHRMC in", values, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcNotIn(List<String> values) {
            addCriterion("F_JHRMC not in", values, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcBetween(String value1, String value2) {
            addCriterion("F_JHRMC between", value1, value2, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhrmcNotBetween(String value1, String value2) {
            addCriterion("F_JHRMC not between", value1, value2, "fJhrmc");
            return (Criteria) this;
        }

        public Criteria andFJhTimeIsNull() {
            addCriterion("F_JH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFJhTimeIsNotNull() {
            addCriterion("F_JH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFJhTimeEqualTo(String value) {
            addCriterion("F_JH_TIME =", value, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeNotEqualTo(String value) {
            addCriterion("F_JH_TIME <>", value, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeGreaterThan(String value) {
            addCriterion("F_JH_TIME >", value, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_JH_TIME >=", value, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeLessThan(String value) {
            addCriterion("F_JH_TIME <", value, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeLessThanOrEqualTo(String value) {
            addCriterion("F_JH_TIME <=", value, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeLike(String value) {
            addCriterion("F_JH_TIME like", value, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeNotLike(String value) {
            addCriterion("F_JH_TIME not like", value, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeIn(List<String> values) {
            addCriterion("F_JH_TIME in", values, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeNotIn(List<String> values) {
            addCriterion("F_JH_TIME not in", values, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeBetween(String value1, String value2) {
            addCriterion("F_JH_TIME between", value1, value2, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFJhTimeNotBetween(String value1, String value2) {
            addCriterion("F_JH_TIME not between", value1, value2, "fJhTime");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctIsNull() {
            addCriterion("F_STA_EXTRCT is null");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctIsNotNull() {
            addCriterion("F_STA_EXTRCT is not null");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctEqualTo(String value) {
            addCriterion("F_STA_EXTRCT =", value, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctNotEqualTo(String value) {
            addCriterion("F_STA_EXTRCT <>", value, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctGreaterThan(String value) {
            addCriterion("F_STA_EXTRCT >", value, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctGreaterThanOrEqualTo(String value) {
            addCriterion("F_STA_EXTRCT >=", value, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctLessThan(String value) {
            addCriterion("F_STA_EXTRCT <", value, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctLessThanOrEqualTo(String value) {
            addCriterion("F_STA_EXTRCT <=", value, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctLike(String value) {
            addCriterion("F_STA_EXTRCT like", value, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctNotLike(String value) {
            addCriterion("F_STA_EXTRCT not like", value, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctIn(List<String> values) {
            addCriterion("F_STA_EXTRCT in", values, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctNotIn(List<String> values) {
            addCriterion("F_STA_EXTRCT not in", values, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctBetween(String value1, String value2) {
            addCriterion("F_STA_EXTRCT between", value1, value2, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFStaExtrctNotBetween(String value1, String value2) {
            addCriterion("F_STA_EXTRCT not between", value1, value2, "fStaExtrct");
            return (Criteria) this;
        }

        public Criteria andFJszsIsNull() {
            addCriterion("F_JSZS is null");
            return (Criteria) this;
        }

        public Criteria andFJszsIsNotNull() {
            addCriterion("F_JSZS is not null");
            return (Criteria) this;
        }

        public Criteria andFJszsEqualTo(Integer value) {
            addCriterion("F_JSZS =", value, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsNotEqualTo(Integer value) {
            addCriterion("F_JSZS <>", value, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsGreaterThan(Integer value) {
            addCriterion("F_JSZS >", value, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_JSZS >=", value, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsLessThan(Integer value) {
            addCriterion("F_JSZS <", value, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsLessThanOrEqualTo(Integer value) {
            addCriterion("F_JSZS <=", value, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsIn(List<Integer> values) {
            addCriterion("F_JSZS in", values, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsNotIn(List<Integer> values) {
            addCriterion("F_JSZS not in", values, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsBetween(Integer value1, Integer value2) {
            addCriterion("F_JSZS between", value1, value2, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJszsNotBetween(Integer value1, Integer value2) {
            addCriterion("F_JSZS not between", value1, value2, "fJszs");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjIsNull() {
            addCriterion("F_JHFPSJ is null");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjIsNotNull() {
            addCriterion("F_JHFPSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjEqualTo(String value) {
            addCriterion("F_JHFPSJ =", value, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjNotEqualTo(String value) {
            addCriterion("F_JHFPSJ <>", value, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjGreaterThan(String value) {
            addCriterion("F_JHFPSJ >", value, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjGreaterThanOrEqualTo(String value) {
            addCriterion("F_JHFPSJ >=", value, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjLessThan(String value) {
            addCriterion("F_JHFPSJ <", value, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjLessThanOrEqualTo(String value) {
            addCriterion("F_JHFPSJ <=", value, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjLike(String value) {
            addCriterion("F_JHFPSJ like", value, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjNotLike(String value) {
            addCriterion("F_JHFPSJ not like", value, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjIn(List<String> values) {
            addCriterion("F_JHFPSJ in", values, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjNotIn(List<String> values) {
            addCriterion("F_JHFPSJ not in", values, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjBetween(String value1, String value2) {
            addCriterion("F_JHFPSJ between", value1, value2, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFJhfpsjNotBetween(String value1, String value2) {
            addCriterion("F_JHFPSJ not between", value1, value2, "fJhfpsj");
            return (Criteria) this;
        }

        public Criteria andFYwlshIsNull() {
            addCriterion("F_YWLSH is null");
            return (Criteria) this;
        }

        public Criteria andFYwlshIsNotNull() {
            addCriterion("F_YWLSH is not null");
            return (Criteria) this;
        }

        public Criteria andFYwlshEqualTo(String value) {
            addCriterion("F_YWLSH =", value, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshNotEqualTo(String value) {
            addCriterion("F_YWLSH <>", value, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshGreaterThan(String value) {
            addCriterion("F_YWLSH >", value, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshGreaterThanOrEqualTo(String value) {
            addCriterion("F_YWLSH >=", value, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshLessThan(String value) {
            addCriterion("F_YWLSH <", value, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshLessThanOrEqualTo(String value) {
            addCriterion("F_YWLSH <=", value, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshLike(String value) {
            addCriterion("F_YWLSH like", value, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshNotLike(String value) {
            addCriterion("F_YWLSH not like", value, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshIn(List<String> values) {
            addCriterion("F_YWLSH in", values, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshNotIn(List<String> values) {
            addCriterion("F_YWLSH not in", values, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshBetween(String value1, String value2) {
            addCriterion("F_YWLSH between", value1, value2, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFYwlshNotBetween(String value1, String value2) {
            addCriterion("F_YWLSH not between", value1, value2, "fYwlsh");
            return (Criteria) this;
        }

        public Criteria andFSfdbIsNull() {
            addCriterion("F_SFDB is null");
            return (Criteria) this;
        }

        public Criteria andFSfdbIsNotNull() {
            addCriterion("F_SFDB is not null");
            return (Criteria) this;
        }

        public Criteria andFSfdbEqualTo(String value) {
            addCriterion("F_SFDB =", value, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbNotEqualTo(String value) {
            addCriterion("F_SFDB <>", value, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbGreaterThan(String value) {
            addCriterion("F_SFDB >", value, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbGreaterThanOrEqualTo(String value) {
            addCriterion("F_SFDB >=", value, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbLessThan(String value) {
            addCriterion("F_SFDB <", value, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbLessThanOrEqualTo(String value) {
            addCriterion("F_SFDB <=", value, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbLike(String value) {
            addCriterion("F_SFDB like", value, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbNotLike(String value) {
            addCriterion("F_SFDB not like", value, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbIn(List<String> values) {
            addCriterion("F_SFDB in", values, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbNotIn(List<String> values) {
            addCriterion("F_SFDB not in", values, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbBetween(String value1, String value2) {
            addCriterion("F_SFDB between", value1, value2, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfdbNotBetween(String value1, String value2) {
            addCriterion("F_SFDB not between", value1, value2, "fSfdb");
            return (Criteria) this;
        }

        public Criteria andFSfgxshIsNull() {
            addCriterion("F_SFGXSH is null");
            return (Criteria) this;
        }

        public Criteria andFSfgxshIsNotNull() {
            addCriterion("F_SFGXSH is not null");
            return (Criteria) this;
        }

        public Criteria andFSfgxshEqualTo(String value) {
            addCriterion("F_SFGXSH =", value, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshNotEqualTo(String value) {
            addCriterion("F_SFGXSH <>", value, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshGreaterThan(String value) {
            addCriterion("F_SFGXSH >", value, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshGreaterThanOrEqualTo(String value) {
            addCriterion("F_SFGXSH >=", value, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshLessThan(String value) {
            addCriterion("F_SFGXSH <", value, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshLessThanOrEqualTo(String value) {
            addCriterion("F_SFGXSH <=", value, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshLike(String value) {
            addCriterion("F_SFGXSH like", value, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshNotLike(String value) {
            addCriterion("F_SFGXSH not like", value, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshIn(List<String> values) {
            addCriterion("F_SFGXSH in", values, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshNotIn(List<String> values) {
            addCriterion("F_SFGXSH not in", values, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshBetween(String value1, String value2) {
            addCriterion("F_SFGXSH between", value1, value2, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFSfgxshNotBetween(String value1, String value2) {
            addCriterion("F_SFGXSH not between", value1, value2, "fSfgxsh");
            return (Criteria) this;
        }

        public Criteria andFDjztIsNull() {
            addCriterion("F_DJZT is null");
            return (Criteria) this;
        }

        public Criteria andFDjztIsNotNull() {
            addCriterion("F_DJZT is not null");
            return (Criteria) this;
        }

        public Criteria andFDjztEqualTo(String value) {
            addCriterion("F_DJZT =", value, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztNotEqualTo(String value) {
            addCriterion("F_DJZT <>", value, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztGreaterThan(String value) {
            addCriterion("F_DJZT >", value, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztGreaterThanOrEqualTo(String value) {
            addCriterion("F_DJZT >=", value, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztLessThan(String value) {
            addCriterion("F_DJZT <", value, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztLessThanOrEqualTo(String value) {
            addCriterion("F_DJZT <=", value, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztLike(String value) {
            addCriterion("F_DJZT like", value, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztNotLike(String value) {
            addCriterion("F_DJZT not like", value, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztIn(List<String> values) {
            addCriterion("F_DJZT in", values, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztNotIn(List<String> values) {
            addCriterion("F_DJZT not in", values, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztBetween(String value1, String value2) {
            addCriterion("F_DJZT between", value1, value2, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFDjztNotBetween(String value1, String value2) {
            addCriterion("F_DJZT not between", value1, value2, "fDjzt");
            return (Criteria) this;
        }

        public Criteria andFUrlIsNull() {
            addCriterion("F_URL is null");
            return (Criteria) this;
        }

        public Criteria andFUrlIsNotNull() {
            addCriterion("F_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFUrlEqualTo(String value) {
            addCriterion("F_URL =", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotEqualTo(String value) {
            addCriterion("F_URL <>", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlGreaterThan(String value) {
            addCriterion("F_URL >", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlGreaterThanOrEqualTo(String value) {
            addCriterion("F_URL >=", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLessThan(String value) {
            addCriterion("F_URL <", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLessThanOrEqualTo(String value) {
            addCriterion("F_URL <=", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLike(String value) {
            addCriterion("F_URL like", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotLike(String value) {
            addCriterion("F_URL not like", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlIn(List<String> values) {
            addCriterion("F_URL in", values, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotIn(List<String> values) {
            addCriterion("F_URL not in", values, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlBetween(String value1, String value2) {
            addCriterion("F_URL between", value1, value2, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotBetween(String value1, String value2) {
            addCriterion("F_URL not between", value1, value2, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFSfspjsIsNull() {
            addCriterion("F_SFSPJS is null");
            return (Criteria) this;
        }

        public Criteria andFSfspjsIsNotNull() {
            addCriterion("F_SFSPJS is not null");
            return (Criteria) this;
        }

        public Criteria andFSfspjsEqualTo(String value) {
            addCriterion("F_SFSPJS =", value, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsNotEqualTo(String value) {
            addCriterion("F_SFSPJS <>", value, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsGreaterThan(String value) {
            addCriterion("F_SFSPJS >", value, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsGreaterThanOrEqualTo(String value) {
            addCriterion("F_SFSPJS >=", value, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsLessThan(String value) {
            addCriterion("F_SFSPJS <", value, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsLessThanOrEqualTo(String value) {
            addCriterion("F_SFSPJS <=", value, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsLike(String value) {
            addCriterion("F_SFSPJS like", value, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsNotLike(String value) {
            addCriterion("F_SFSPJS not like", value, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsIn(List<String> values) {
            addCriterion("F_SFSPJS in", values, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsNotIn(List<String> values) {
            addCriterion("F_SFSPJS not in", values, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsBetween(String value1, String value2) {
            addCriterion("F_SFSPJS between", value1, value2, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFSfspjsNotBetween(String value1, String value2) {
            addCriterion("F_SFSPJS not between", value1, value2, "fSfspjs");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgIsNull() {
            addCriterion("F_KJPT_SUBMORG is null");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgIsNotNull() {
            addCriterion("F_KJPT_SUBMORG is not null");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgEqualTo(String value) {
            addCriterion("F_KJPT_SUBMORG =", value, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgNotEqualTo(String value) {
            addCriterion("F_KJPT_SUBMORG <>", value, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgGreaterThan(String value) {
            addCriterion("F_KJPT_SUBMORG >", value, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgGreaterThanOrEqualTo(String value) {
            addCriterion("F_KJPT_SUBMORG >=", value, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgLessThan(String value) {
            addCriterion("F_KJPT_SUBMORG <", value, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgLessThanOrEqualTo(String value) {
            addCriterion("F_KJPT_SUBMORG <=", value, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgLike(String value) {
            addCriterion("F_KJPT_SUBMORG like", value, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgNotLike(String value) {
            addCriterion("F_KJPT_SUBMORG not like", value, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgIn(List<String> values) {
            addCriterion("F_KJPT_SUBMORG in", values, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgNotIn(List<String> values) {
            addCriterion("F_KJPT_SUBMORG not in", values, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgBetween(String value1, String value2) {
            addCriterion("F_KJPT_SUBMORG between", value1, value2, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFKjptSubmorgNotBetween(String value1, String value2) {
            addCriterion("F_KJPT_SUBMORG not between", value1, value2, "fKjptSubmorg");
            return (Criteria) this;
        }

        public Criteria andFDjztGxIsNull() {
            addCriterion("F_DJZT_GX is null");
            return (Criteria) this;
        }

        public Criteria andFDjztGxIsNotNull() {
            addCriterion("F_DJZT_GX is not null");
            return (Criteria) this;
        }

        public Criteria andFDjztGxEqualTo(String value) {
            addCriterion("F_DJZT_GX =", value, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxNotEqualTo(String value) {
            addCriterion("F_DJZT_GX <>", value, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxGreaterThan(String value) {
            addCriterion("F_DJZT_GX >", value, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxGreaterThanOrEqualTo(String value) {
            addCriterion("F_DJZT_GX >=", value, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxLessThan(String value) {
            addCriterion("F_DJZT_GX <", value, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxLessThanOrEqualTo(String value) {
            addCriterion("F_DJZT_GX <=", value, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxLike(String value) {
            addCriterion("F_DJZT_GX like", value, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxNotLike(String value) {
            addCriterion("F_DJZT_GX not like", value, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxIn(List<String> values) {
            addCriterion("F_DJZT_GX in", values, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxNotIn(List<String> values) {
            addCriterion("F_DJZT_GX not in", values, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxBetween(String value1, String value2) {
            addCriterion("F_DJZT_GX between", value1, value2, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFDjztGxNotBetween(String value1, String value2) {
            addCriterion("F_DJZT_GX not between", value1, value2, "fDjztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxIsNull() {
            addCriterion("F_SPZT_GX is null");
            return (Criteria) this;
        }

        public Criteria andFSpztGxIsNotNull() {
            addCriterion("F_SPZT_GX is not null");
            return (Criteria) this;
        }

        public Criteria andFSpztGxEqualTo(String value) {
            addCriterion("F_SPZT_GX =", value, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxNotEqualTo(String value) {
            addCriterion("F_SPZT_GX <>", value, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxGreaterThan(String value) {
            addCriterion("F_SPZT_GX >", value, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxGreaterThanOrEqualTo(String value) {
            addCriterion("F_SPZT_GX >=", value, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxLessThan(String value) {
            addCriterion("F_SPZT_GX <", value, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxLessThanOrEqualTo(String value) {
            addCriterion("F_SPZT_GX <=", value, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxLike(String value) {
            addCriterion("F_SPZT_GX like", value, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxNotLike(String value) {
            addCriterion("F_SPZT_GX not like", value, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxIn(List<String> values) {
            addCriterion("F_SPZT_GX in", values, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxNotIn(List<String> values) {
            addCriterion("F_SPZT_GX not in", values, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxBetween(String value1, String value2) {
            addCriterion("F_SPZT_GX between", value1, value2, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFSpztGxNotBetween(String value1, String value2) {
            addCriterion("F_SPZT_GX not between", value1, value2, "fSpztGx");
            return (Criteria) this;
        }

        public Criteria andFJssjIsNull() {
            addCriterion("F_JSSJ is null");
            return (Criteria) this;
        }

        public Criteria andFJssjIsNotNull() {
            addCriterion("F_JSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFJssjEqualTo(String value) {
            addCriterion("F_JSSJ =", value, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjNotEqualTo(String value) {
            addCriterion("F_JSSJ <>", value, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjGreaterThan(String value) {
            addCriterion("F_JSSJ >", value, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjGreaterThanOrEqualTo(String value) {
            addCriterion("F_JSSJ >=", value, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjLessThan(String value) {
            addCriterion("F_JSSJ <", value, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjLessThanOrEqualTo(String value) {
            addCriterion("F_JSSJ <=", value, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjLike(String value) {
            addCriterion("F_JSSJ like", value, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjNotLike(String value) {
            addCriterion("F_JSSJ not like", value, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjIn(List<String> values) {
            addCriterion("F_JSSJ in", values, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjNotIn(List<String> values) {
            addCriterion("F_JSSJ not in", values, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjBetween(String value1, String value2) {
            addCriterion("F_JSSJ between", value1, value2, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFJssjNotBetween(String value1, String value2) {
            addCriterion("F_JSSJ not between", value1, value2, "fJssj");
            return (Criteria) this;
        }

        public Criteria andFXgsjIsNull() {
            addCriterion("F_XGSJ is null");
            return (Criteria) this;
        }

        public Criteria andFXgsjIsNotNull() {
            addCriterion("F_XGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFXgsjEqualTo(String value) {
            addCriterion("F_XGSJ =", value, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjNotEqualTo(String value) {
            addCriterion("F_XGSJ <>", value, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjGreaterThan(String value) {
            addCriterion("F_XGSJ >", value, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjGreaterThanOrEqualTo(String value) {
            addCriterion("F_XGSJ >=", value, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjLessThan(String value) {
            addCriterion("F_XGSJ <", value, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjLessThanOrEqualTo(String value) {
            addCriterion("F_XGSJ <=", value, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjLike(String value) {
            addCriterion("F_XGSJ like", value, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjNotLike(String value) {
            addCriterion("F_XGSJ not like", value, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjIn(List<String> values) {
            addCriterion("F_XGSJ in", values, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjNotIn(List<String> values) {
            addCriterion("F_XGSJ not in", values, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjBetween(String value1, String value2) {
            addCriterion("F_XGSJ between", value1, value2, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFXgsjNotBetween(String value1, String value2) {
            addCriterion("F_XGSJ not between", value1, value2, "fXgsj");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyIsNull() {
            addCriterion("F_CVT_KEY is null");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyIsNotNull() {
            addCriterion("F_CVT_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyEqualTo(String value) {
            addCriterion("F_CVT_KEY =", value, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyNotEqualTo(String value) {
            addCriterion("F_CVT_KEY <>", value, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyGreaterThan(String value) {
            addCriterion("F_CVT_KEY >", value, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyGreaterThanOrEqualTo(String value) {
            addCriterion("F_CVT_KEY >=", value, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyLessThan(String value) {
            addCriterion("F_CVT_KEY <", value, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyLessThanOrEqualTo(String value) {
            addCriterion("F_CVT_KEY <=", value, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyLike(String value) {
            addCriterion("F_CVT_KEY like", value, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyNotLike(String value) {
            addCriterion("F_CVT_KEY not like", value, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyIn(List<String> values) {
            addCriterion("F_CVT_KEY in", values, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyNotIn(List<String> values) {
            addCriterion("F_CVT_KEY not in", values, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyBetween(String value1, String value2) {
            addCriterion("F_CVT_KEY between", value1, value2, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFCvtKeyNotBetween(String value1, String value2) {
            addCriterion("F_CVT_KEY not between", value1, value2, "fCvtKey");
            return (Criteria) this;
        }

        public Criteria andFSfyzpIsNull() {
            addCriterion("F_SFYZP is null");
            return (Criteria) this;
        }

        public Criteria andFSfyzpIsNotNull() {
            addCriterion("F_SFYZP is not null");
            return (Criteria) this;
        }

        public Criteria andFSfyzpEqualTo(String value) {
            addCriterion("F_SFYZP =", value, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpNotEqualTo(String value) {
            addCriterion("F_SFYZP <>", value, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpGreaterThan(String value) {
            addCriterion("F_SFYZP >", value, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpGreaterThanOrEqualTo(String value) {
            addCriterion("F_SFYZP >=", value, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpLessThan(String value) {
            addCriterion("F_SFYZP <", value, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpLessThanOrEqualTo(String value) {
            addCriterion("F_SFYZP <=", value, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpLike(String value) {
            addCriterion("F_SFYZP like", value, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpNotLike(String value) {
            addCriterion("F_SFYZP not like", value, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpIn(List<String> values) {
            addCriterion("F_SFYZP in", values, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpNotIn(List<String> values) {
            addCriterion("F_SFYZP not in", values, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpBetween(String value1, String value2) {
            addCriterion("F_SFYZP between", value1, value2, "fSfyzp");
            return (Criteria) this;
        }

        public Criteria andFSfyzpNotBetween(String value1, String value2) {
            addCriterion("F_SFYZP not between", value1, value2, "fSfyzp");
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