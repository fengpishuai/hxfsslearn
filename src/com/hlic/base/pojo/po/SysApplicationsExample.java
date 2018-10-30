package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SysApplicationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysApplicationsExample() {
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

        public Criteria andFCaptionIsNull() {
            addCriterion("F_CAPTION is null");
            return (Criteria) this;
        }

        public Criteria andFCaptionIsNotNull() {
            addCriterion("F_CAPTION is not null");
            return (Criteria) this;
        }

        public Criteria andFCaptionEqualTo(String value) {
            addCriterion("F_CAPTION =", value, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionNotEqualTo(String value) {
            addCriterion("F_CAPTION <>", value, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionGreaterThan(String value) {
            addCriterion("F_CAPTION >", value, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("F_CAPTION >=", value, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionLessThan(String value) {
            addCriterion("F_CAPTION <", value, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionLessThanOrEqualTo(String value) {
            addCriterion("F_CAPTION <=", value, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionLike(String value) {
            addCriterion("F_CAPTION like", value, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionNotLike(String value) {
            addCriterion("F_CAPTION not like", value, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionIn(List<String> values) {
            addCriterion("F_CAPTION in", values, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionNotIn(List<String> values) {
            addCriterion("F_CAPTION not in", values, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionBetween(String value1, String value2) {
            addCriterion("F_CAPTION between", value1, value2, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFCaptionNotBetween(String value1, String value2) {
            addCriterion("F_CAPTION not between", value1, value2, "fCaption");
            return (Criteria) this;
        }

        public Criteria andFIconIsNull() {
            addCriterion("F_ICON is null");
            return (Criteria) this;
        }

        public Criteria andFIconIsNotNull() {
            addCriterion("F_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andFIconEqualTo(String value) {
            addCriterion("F_ICON =", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotEqualTo(String value) {
            addCriterion("F_ICON <>", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconGreaterThan(String value) {
            addCriterion("F_ICON >", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconGreaterThanOrEqualTo(String value) {
            addCriterion("F_ICON >=", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLessThan(String value) {
            addCriterion("F_ICON <", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLessThanOrEqualTo(String value) {
            addCriterion("F_ICON <=", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLike(String value) {
            addCriterion("F_ICON like", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotLike(String value) {
            addCriterion("F_ICON not like", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconIn(List<String> values) {
            addCriterion("F_ICON in", values, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotIn(List<String> values) {
            addCriterion("F_ICON not in", values, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconBetween(String value1, String value2) {
            addCriterion("F_ICON between", value1, value2, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotBetween(String value1, String value2) {
            addCriterion("F_ICON not between", value1, value2, "fIcon");
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

        public Criteria andFIconLIsNull() {
            addCriterion("F_ICON_L is null");
            return (Criteria) this;
        }

        public Criteria andFIconLIsNotNull() {
            addCriterion("F_ICON_L is not null");
            return (Criteria) this;
        }

        public Criteria andFIconLEqualTo(String value) {
            addCriterion("F_ICON_L =", value, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLNotEqualTo(String value) {
            addCriterion("F_ICON_L <>", value, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLGreaterThan(String value) {
            addCriterion("F_ICON_L >", value, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLGreaterThanOrEqualTo(String value) {
            addCriterion("F_ICON_L >=", value, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLLessThan(String value) {
            addCriterion("F_ICON_L <", value, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLLessThanOrEqualTo(String value) {
            addCriterion("F_ICON_L <=", value, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLLike(String value) {
            addCriterion("F_ICON_L like", value, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLNotLike(String value) {
            addCriterion("F_ICON_L not like", value, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLIn(List<String> values) {
            addCriterion("F_ICON_L in", values, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLNotIn(List<String> values) {
            addCriterion("F_ICON_L not in", values, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLBetween(String value1, String value2) {
            addCriterion("F_ICON_L between", value1, value2, "fIconL");
            return (Criteria) this;
        }

        public Criteria andFIconLNotBetween(String value1, String value2) {
            addCriterion("F_ICON_L not between", value1, value2, "fIconL");
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