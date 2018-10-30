package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SysUserRoleFuncExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserRoleFuncExample() {
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

        public Criteria andFUseridIsNull() {
            addCriterion("f_userid is null");
            return (Criteria) this;
        }

        public Criteria andFUseridIsNotNull() {
            addCriterion("f_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFUseridEqualTo(String value) {
            addCriterion("f_userid =", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotEqualTo(String value) {
            addCriterion("f_userid <>", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThan(String value) {
            addCriterion("f_userid >", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThanOrEqualTo(String value) {
            addCriterion("f_userid >=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThan(String value) {
            addCriterion("f_userid <", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThanOrEqualTo(String value) {
            addCriterion("f_userid <=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLike(String value) {
            addCriterion("f_userid like", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotLike(String value) {
            addCriterion("f_userid not like", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridIn(List<String> values) {
            addCriterion("f_userid in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotIn(List<String> values) {
            addCriterion("f_userid not in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridBetween(String value1, String value2) {
            addCriterion("f_userid between", value1, value2, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotBetween(String value1, String value2) {
            addCriterion("f_userid not between", value1, value2, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFFuncidIsNull() {
            addCriterion("f_funcid is null");
            return (Criteria) this;
        }

        public Criteria andFFuncidIsNotNull() {
            addCriterion("f_funcid is not null");
            return (Criteria) this;
        }

        public Criteria andFFuncidEqualTo(String value) {
            addCriterion("f_funcid =", value, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidNotEqualTo(String value) {
            addCriterion("f_funcid <>", value, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidGreaterThan(String value) {
            addCriterion("f_funcid >", value, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidGreaterThanOrEqualTo(String value) {
            addCriterion("f_funcid >=", value, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidLessThan(String value) {
            addCriterion("f_funcid <", value, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidLessThanOrEqualTo(String value) {
            addCriterion("f_funcid <=", value, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidLike(String value) {
            addCriterion("f_funcid like", value, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidNotLike(String value) {
            addCriterion("f_funcid not like", value, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidIn(List<String> values) {
            addCriterion("f_funcid in", values, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidNotIn(List<String> values) {
            addCriterion("f_funcid not in", values, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidBetween(String value1, String value2) {
            addCriterion("f_funcid between", value1, value2, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFFuncidNotBetween(String value1, String value2) {
            addCriterion("f_funcid not between", value1, value2, "fFuncid");
            return (Criteria) this;
        }

        public Criteria andFDisableIsNull() {
            addCriterion("f_disable is null");
            return (Criteria) this;
        }

        public Criteria andFDisableIsNotNull() {
            addCriterion("f_disable is not null");
            return (Criteria) this;
        }

        public Criteria andFDisableEqualTo(String value) {
            addCriterion("f_disable =", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableNotEqualTo(String value) {
            addCriterion("f_disable <>", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableGreaterThan(String value) {
            addCriterion("f_disable >", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableGreaterThanOrEqualTo(String value) {
            addCriterion("f_disable >=", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableLessThan(String value) {
            addCriterion("f_disable <", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableLessThanOrEqualTo(String value) {
            addCriterion("f_disable <=", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableLike(String value) {
            addCriterion("f_disable like", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableNotLike(String value) {
            addCriterion("f_disable not like", value, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableIn(List<String> values) {
            addCriterion("f_disable in", values, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableNotIn(List<String> values) {
            addCriterion("f_disable not in", values, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableBetween(String value1, String value2) {
            addCriterion("f_disable between", value1, value2, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFDisableNotBetween(String value1, String value2) {
            addCriterion("f_disable not between", value1, value2, "fDisable");
            return (Criteria) this;
        }

        public Criteria andFRoleidIsNull() {
            addCriterion("f_roleid is null");
            return (Criteria) this;
        }

        public Criteria andFRoleidIsNotNull() {
            addCriterion("f_roleid is not null");
            return (Criteria) this;
        }

        public Criteria andFRoleidEqualTo(String value) {
            addCriterion("f_roleid =", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidNotEqualTo(String value) {
            addCriterion("f_roleid <>", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidGreaterThan(String value) {
            addCriterion("f_roleid >", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("f_roleid >=", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidLessThan(String value) {
            addCriterion("f_roleid <", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidLessThanOrEqualTo(String value) {
            addCriterion("f_roleid <=", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidLike(String value) {
            addCriterion("f_roleid like", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidNotLike(String value) {
            addCriterion("f_roleid not like", value, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidIn(List<String> values) {
            addCriterion("f_roleid in", values, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidNotIn(List<String> values) {
            addCriterion("f_roleid not in", values, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidBetween(String value1, String value2) {
            addCriterion("f_roleid between", value1, value2, "fRoleid");
            return (Criteria) this;
        }

        public Criteria andFRoleidNotBetween(String value1, String value2) {
            addCriterion("f_roleid not between", value1, value2, "fRoleid");
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