package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class WdRptqueryFilterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WdRptqueryFilterExample() {
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

        public Criteria andFParamNameIsNull() {
            addCriterion("F_PARAM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFParamNameIsNotNull() {
            addCriterion("F_PARAM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFParamNameEqualTo(String value) {
            addCriterion("F_PARAM_NAME =", value, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameNotEqualTo(String value) {
            addCriterion("F_PARAM_NAME <>", value, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameGreaterThan(String value) {
            addCriterion("F_PARAM_NAME >", value, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_PARAM_NAME >=", value, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameLessThan(String value) {
            addCriterion("F_PARAM_NAME <", value, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameLessThanOrEqualTo(String value) {
            addCriterion("F_PARAM_NAME <=", value, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameLike(String value) {
            addCriterion("F_PARAM_NAME like", value, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameNotLike(String value) {
            addCriterion("F_PARAM_NAME not like", value, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameIn(List<String> values) {
            addCriterion("F_PARAM_NAME in", values, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameNotIn(List<String> values) {
            addCriterion("F_PARAM_NAME not in", values, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameBetween(String value1, String value2) {
            addCriterion("F_PARAM_NAME between", value1, value2, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamNameNotBetween(String value1, String value2) {
            addCriterion("F_PARAM_NAME not between", value1, value2, "fParamName");
            return (Criteria) this;
        }

        public Criteria andFParamDescIsNull() {
            addCriterion("F_PARAM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andFParamDescIsNotNull() {
            addCriterion("F_PARAM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andFParamDescEqualTo(String value) {
            addCriterion("F_PARAM_DESC =", value, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescNotEqualTo(String value) {
            addCriterion("F_PARAM_DESC <>", value, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescGreaterThan(String value) {
            addCriterion("F_PARAM_DESC >", value, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescGreaterThanOrEqualTo(String value) {
            addCriterion("F_PARAM_DESC >=", value, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescLessThan(String value) {
            addCriterion("F_PARAM_DESC <", value, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescLessThanOrEqualTo(String value) {
            addCriterion("F_PARAM_DESC <=", value, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescLike(String value) {
            addCriterion("F_PARAM_DESC like", value, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescNotLike(String value) {
            addCriterion("F_PARAM_DESC not like", value, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescIn(List<String> values) {
            addCriterion("F_PARAM_DESC in", values, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescNotIn(List<String> values) {
            addCriterion("F_PARAM_DESC not in", values, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescBetween(String value1, String value2) {
            addCriterion("F_PARAM_DESC between", value1, value2, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamDescNotBetween(String value1, String value2) {
            addCriterion("F_PARAM_DESC not between", value1, value2, "fParamDesc");
            return (Criteria) this;
        }

        public Criteria andFParamExpIsNull() {
            addCriterion("F_PARAM_EXP is null");
            return (Criteria) this;
        }

        public Criteria andFParamExpIsNotNull() {
            addCriterion("F_PARAM_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andFParamExpEqualTo(String value) {
            addCriterion("F_PARAM_EXP =", value, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpNotEqualTo(String value) {
            addCriterion("F_PARAM_EXP <>", value, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpGreaterThan(String value) {
            addCriterion("F_PARAM_EXP >", value, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpGreaterThanOrEqualTo(String value) {
            addCriterion("F_PARAM_EXP >=", value, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpLessThan(String value) {
            addCriterion("F_PARAM_EXP <", value, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpLessThanOrEqualTo(String value) {
            addCriterion("F_PARAM_EXP <=", value, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpLike(String value) {
            addCriterion("F_PARAM_EXP like", value, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpNotLike(String value) {
            addCriterion("F_PARAM_EXP not like", value, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpIn(List<String> values) {
            addCriterion("F_PARAM_EXP in", values, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpNotIn(List<String> values) {
            addCriterion("F_PARAM_EXP not in", values, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpBetween(String value1, String value2) {
            addCriterion("F_PARAM_EXP between", value1, value2, "fParamExp");
            return (Criteria) this;
        }

        public Criteria andFParamExpNotBetween(String value1, String value2) {
            addCriterion("F_PARAM_EXP not between", value1, value2, "fParamExp");
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

        public Criteria andFRequiredIsNull() {
            addCriterion("F_REQUIRED is null");
            return (Criteria) this;
        }

        public Criteria andFRequiredIsNotNull() {
            addCriterion("F_REQUIRED is not null");
            return (Criteria) this;
        }

        public Criteria andFRequiredEqualTo(String value) {
            addCriterion("F_REQUIRED =", value, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredNotEqualTo(String value) {
            addCriterion("F_REQUIRED <>", value, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredGreaterThan(String value) {
            addCriterion("F_REQUIRED >", value, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("F_REQUIRED >=", value, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredLessThan(String value) {
            addCriterion("F_REQUIRED <", value, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredLessThanOrEqualTo(String value) {
            addCriterion("F_REQUIRED <=", value, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredLike(String value) {
            addCriterion("F_REQUIRED like", value, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredNotLike(String value) {
            addCriterion("F_REQUIRED not like", value, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredIn(List<String> values) {
            addCriterion("F_REQUIRED in", values, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredNotIn(List<String> values) {
            addCriterion("F_REQUIRED not in", values, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredBetween(String value1, String value2) {
            addCriterion("F_REQUIRED between", value1, value2, "fRequired");
            return (Criteria) this;
        }

        public Criteria andFRequiredNotBetween(String value1, String value2) {
            addCriterion("F_REQUIRED not between", value1, value2, "fRequired");
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

        public Criteria andFOptExpIsNull() {
            addCriterion("F_OPT_EXP is null");
            return (Criteria) this;
        }

        public Criteria andFOptExpIsNotNull() {
            addCriterion("F_OPT_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andFOptExpEqualTo(String value) {
            addCriterion("F_OPT_EXP =", value, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpNotEqualTo(String value) {
            addCriterion("F_OPT_EXP <>", value, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpGreaterThan(String value) {
            addCriterion("F_OPT_EXP >", value, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpGreaterThanOrEqualTo(String value) {
            addCriterion("F_OPT_EXP >=", value, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpLessThan(String value) {
            addCriterion("F_OPT_EXP <", value, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpLessThanOrEqualTo(String value) {
            addCriterion("F_OPT_EXP <=", value, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpLike(String value) {
            addCriterion("F_OPT_EXP like", value, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpNotLike(String value) {
            addCriterion("F_OPT_EXP not like", value, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpIn(List<String> values) {
            addCriterion("F_OPT_EXP in", values, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpNotIn(List<String> values) {
            addCriterion("F_OPT_EXP not in", values, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpBetween(String value1, String value2) {
            addCriterion("F_OPT_EXP between", value1, value2, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFOptExpNotBetween(String value1, String value2) {
            addCriterion("F_OPT_EXP not between", value1, value2, "fOptExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpIsNull() {
            addCriterion("F_USE_EXP is null");
            return (Criteria) this;
        }

        public Criteria andFUseExpIsNotNull() {
            addCriterion("F_USE_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andFUseExpEqualTo(String value) {
            addCriterion("F_USE_EXP =", value, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpNotEqualTo(String value) {
            addCriterion("F_USE_EXP <>", value, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpGreaterThan(String value) {
            addCriterion("F_USE_EXP >", value, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpGreaterThanOrEqualTo(String value) {
            addCriterion("F_USE_EXP >=", value, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpLessThan(String value) {
            addCriterion("F_USE_EXP <", value, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpLessThanOrEqualTo(String value) {
            addCriterion("F_USE_EXP <=", value, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpLike(String value) {
            addCriterion("F_USE_EXP like", value, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpNotLike(String value) {
            addCriterion("F_USE_EXP not like", value, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpIn(List<String> values) {
            addCriterion("F_USE_EXP in", values, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpNotIn(List<String> values) {
            addCriterion("F_USE_EXP not in", values, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpBetween(String value1, String value2) {
            addCriterion("F_USE_EXP between", value1, value2, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFUseExpNotBetween(String value1, String value2) {
            addCriterion("F_USE_EXP not between", value1, value2, "fUseExp");
            return (Criteria) this;
        }

        public Criteria andFOptIsNull() {
            addCriterion("F_OPT is null");
            return (Criteria) this;
        }

        public Criteria andFOptIsNotNull() {
            addCriterion("F_OPT is not null");
            return (Criteria) this;
        }

        public Criteria andFOptEqualTo(String value) {
            addCriterion("F_OPT =", value, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptNotEqualTo(String value) {
            addCriterion("F_OPT <>", value, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptGreaterThan(String value) {
            addCriterion("F_OPT >", value, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptGreaterThanOrEqualTo(String value) {
            addCriterion("F_OPT >=", value, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptLessThan(String value) {
            addCriterion("F_OPT <", value, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptLessThanOrEqualTo(String value) {
            addCriterion("F_OPT <=", value, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptLike(String value) {
            addCriterion("F_OPT like", value, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptNotLike(String value) {
            addCriterion("F_OPT not like", value, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptIn(List<String> values) {
            addCriterion("F_OPT in", values, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptNotIn(List<String> values) {
            addCriterion("F_OPT not in", values, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptBetween(String value1, String value2) {
            addCriterion("F_OPT between", value1, value2, "fOpt");
            return (Criteria) this;
        }

        public Criteria andFOptNotBetween(String value1, String value2) {
            addCriterion("F_OPT not between", value1, value2, "fOpt");
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