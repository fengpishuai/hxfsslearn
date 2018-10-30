package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class DctEnumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DctEnumExample() {
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

        public Criteria andFBhIsNull() {
            addCriterion("F_BH is null");
            return (Criteria) this;
        }

        public Criteria andFBhIsNotNull() {
            addCriterion("F_BH is not null");
            return (Criteria) this;
        }

        public Criteria andFBhEqualTo(String value) {
            addCriterion("F_BH =", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhNotEqualTo(String value) {
            addCriterion("F_BH <>", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhGreaterThan(String value) {
            addCriterion("F_BH >", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhGreaterThanOrEqualTo(String value) {
            addCriterion("F_BH >=", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhLessThan(String value) {
            addCriterion("F_BH <", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhLessThanOrEqualTo(String value) {
            addCriterion("F_BH <=", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhLike(String value) {
            addCriterion("F_BH like", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhNotLike(String value) {
            addCriterion("F_BH not like", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhIn(List<String> values) {
            addCriterion("F_BH in", values, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhNotIn(List<String> values) {
            addCriterion("F_BH not in", values, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhBetween(String value1, String value2) {
            addCriterion("F_BH between", value1, value2, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhNotBetween(String value1, String value2) {
            addCriterion("F_BH not between", value1, value2, "fBh");
            return (Criteria) this;
        }

        public Criteria andFNhIsNull() {
            addCriterion("F_NH is null");
            return (Criteria) this;
        }

        public Criteria andFNhIsNotNull() {
            addCriterion("F_NH is not null");
            return (Criteria) this;
        }

        public Criteria andFNhEqualTo(String value) {
            addCriterion("F_NH =", value, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhNotEqualTo(String value) {
            addCriterion("F_NH <>", value, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhGreaterThan(String value) {
            addCriterion("F_NH >", value, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhGreaterThanOrEqualTo(String value) {
            addCriterion("F_NH >=", value, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhLessThan(String value) {
            addCriterion("F_NH <", value, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhLessThanOrEqualTo(String value) {
            addCriterion("F_NH <=", value, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhLike(String value) {
            addCriterion("F_NH like", value, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhNotLike(String value) {
            addCriterion("F_NH not like", value, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhIn(List<String> values) {
            addCriterion("F_NH in", values, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhNotIn(List<String> values) {
            addCriterion("F_NH not in", values, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhBetween(String value1, String value2) {
            addCriterion("F_NH between", value1, value2, "fNh");
            return (Criteria) this;
        }

        public Criteria andFNhNotBetween(String value1, String value2) {
            addCriterion("F_NH not between", value1, value2, "fNh");
            return (Criteria) this;
        }

        public Criteria andFMcIsNull() {
            addCriterion("F_MC is null");
            return (Criteria) this;
        }

        public Criteria andFMcIsNotNull() {
            addCriterion("F_MC is not null");
            return (Criteria) this;
        }

        public Criteria andFMcEqualTo(String value) {
            addCriterion("F_MC =", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcNotEqualTo(String value) {
            addCriterion("F_MC <>", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcGreaterThan(String value) {
            addCriterion("F_MC >", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcGreaterThanOrEqualTo(String value) {
            addCriterion("F_MC >=", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcLessThan(String value) {
            addCriterion("F_MC <", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcLessThanOrEqualTo(String value) {
            addCriterion("F_MC <=", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcLike(String value) {
            addCriterion("F_MC like", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcNotLike(String value) {
            addCriterion("F_MC not like", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcIn(List<String> values) {
            addCriterion("F_MC in", values, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcNotIn(List<String> values) {
            addCriterion("F_MC not in", values, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcBetween(String value1, String value2) {
            addCriterion("F_MC between", value1, value2, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcNotBetween(String value1, String value2) {
            addCriterion("F_MC not between", value1, value2, "fMc");
            return (Criteria) this;
        }

        public Criteria andFJsIsNull() {
            addCriterion("F_JS is null");
            return (Criteria) this;
        }

        public Criteria andFJsIsNotNull() {
            addCriterion("F_JS is not null");
            return (Criteria) this;
        }

        public Criteria andFJsEqualTo(Integer value) {
            addCriterion("F_JS =", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsNotEqualTo(Integer value) {
            addCriterion("F_JS <>", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsGreaterThan(Integer value) {
            addCriterion("F_JS >", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_JS >=", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsLessThan(Integer value) {
            addCriterion("F_JS <", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsLessThanOrEqualTo(Integer value) {
            addCriterion("F_JS <=", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsIn(List<Integer> values) {
            addCriterion("F_JS in", values, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsNotIn(List<Integer> values) {
            addCriterion("F_JS not in", values, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsBetween(Integer value1, Integer value2) {
            addCriterion("F_JS between", value1, value2, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsNotBetween(Integer value1, Integer value2) {
            addCriterion("F_JS not between", value1, value2, "fJs");
            return (Criteria) this;
        }

        public Criteria andFMxIsNull() {
            addCriterion("F_MX is null");
            return (Criteria) this;
        }

        public Criteria andFMxIsNotNull() {
            addCriterion("F_MX is not null");
            return (Criteria) this;
        }

        public Criteria andFMxEqualTo(String value) {
            addCriterion("F_MX =", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxNotEqualTo(String value) {
            addCriterion("F_MX <>", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxGreaterThan(String value) {
            addCriterion("F_MX >", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxGreaterThanOrEqualTo(String value) {
            addCriterion("F_MX >=", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxLessThan(String value) {
            addCriterion("F_MX <", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxLessThanOrEqualTo(String value) {
            addCriterion("F_MX <=", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxLike(String value) {
            addCriterion("F_MX like", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxNotLike(String value) {
            addCriterion("F_MX not like", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxIn(List<String> values) {
            addCriterion("F_MX in", values, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxNotIn(List<String> values) {
            addCriterion("F_MX not in", values, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxBetween(String value1, String value2) {
            addCriterion("F_MX between", value1, value2, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxNotBetween(String value1, String value2) {
            addCriterion("F_MX not between", value1, value2, "fMx");
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

        public Criteria andFT4IsNull() {
            addCriterion("F_T4 is null");
            return (Criteria) this;
        }

        public Criteria andFT4IsNotNull() {
            addCriterion("F_T4 is not null");
            return (Criteria) this;
        }

        public Criteria andFT4EqualTo(String value) {
            addCriterion("F_T4 =", value, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4NotEqualTo(String value) {
            addCriterion("F_T4 <>", value, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4GreaterThan(String value) {
            addCriterion("F_T4 >", value, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4GreaterThanOrEqualTo(String value) {
            addCriterion("F_T4 >=", value, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4LessThan(String value) {
            addCriterion("F_T4 <", value, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4LessThanOrEqualTo(String value) {
            addCriterion("F_T4 <=", value, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4Like(String value) {
            addCriterion("F_T4 like", value, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4NotLike(String value) {
            addCriterion("F_T4 not like", value, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4In(List<String> values) {
            addCriterion("F_T4 in", values, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4NotIn(List<String> values) {
            addCriterion("F_T4 not in", values, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4Between(String value1, String value2) {
            addCriterion("F_T4 between", value1, value2, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT4NotBetween(String value1, String value2) {
            addCriterion("F_T4 not between", value1, value2, "fT4");
            return (Criteria) this;
        }

        public Criteria andFT5IsNull() {
            addCriterion("F_T5 is null");
            return (Criteria) this;
        }

        public Criteria andFT5IsNotNull() {
            addCriterion("F_T5 is not null");
            return (Criteria) this;
        }

        public Criteria andFT5EqualTo(String value) {
            addCriterion("F_T5 =", value, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5NotEqualTo(String value) {
            addCriterion("F_T5 <>", value, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5GreaterThan(String value) {
            addCriterion("F_T5 >", value, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5GreaterThanOrEqualTo(String value) {
            addCriterion("F_T5 >=", value, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5LessThan(String value) {
            addCriterion("F_T5 <", value, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5LessThanOrEqualTo(String value) {
            addCriterion("F_T5 <=", value, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5Like(String value) {
            addCriterion("F_T5 like", value, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5NotLike(String value) {
            addCriterion("F_T5 not like", value, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5In(List<String> values) {
            addCriterion("F_T5 in", values, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5NotIn(List<String> values) {
            addCriterion("F_T5 not in", values, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5Between(String value1, String value2) {
            addCriterion("F_T5 between", value1, value2, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT5NotBetween(String value1, String value2) {
            addCriterion("F_T5 not between", value1, value2, "fT5");
            return (Criteria) this;
        }

        public Criteria andFT6IsNull() {
            addCriterion("F_T6 is null");
            return (Criteria) this;
        }

        public Criteria andFT6IsNotNull() {
            addCriterion("F_T6 is not null");
            return (Criteria) this;
        }

        public Criteria andFT6EqualTo(String value) {
            addCriterion("F_T6 =", value, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6NotEqualTo(String value) {
            addCriterion("F_T6 <>", value, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6GreaterThan(String value) {
            addCriterion("F_T6 >", value, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6GreaterThanOrEqualTo(String value) {
            addCriterion("F_T6 >=", value, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6LessThan(String value) {
            addCriterion("F_T6 <", value, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6LessThanOrEqualTo(String value) {
            addCriterion("F_T6 <=", value, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6Like(String value) {
            addCriterion("F_T6 like", value, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6NotLike(String value) {
            addCriterion("F_T6 not like", value, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6In(List<String> values) {
            addCriterion("F_T6 in", values, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6NotIn(List<String> values) {
            addCriterion("F_T6 not in", values, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6Between(String value1, String value2) {
            addCriterion("F_T6 between", value1, value2, "fT6");
            return (Criteria) this;
        }

        public Criteria andFT6NotBetween(String value1, String value2) {
            addCriterion("F_T6 not between", value1, value2, "fT6");
            return (Criteria) this;
        }

        public Criteria andFN1IsNull() {
            addCriterion("F_N1 is null");
            return (Criteria) this;
        }

        public Criteria andFN1IsNotNull() {
            addCriterion("F_N1 is not null");
            return (Criteria) this;
        }

        public Criteria andFN1EqualTo(Integer value) {
            addCriterion("F_N1 =", value, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1NotEqualTo(Integer value) {
            addCriterion("F_N1 <>", value, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1GreaterThan(Integer value) {
            addCriterion("F_N1 >", value, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1GreaterThanOrEqualTo(Integer value) {
            addCriterion("F_N1 >=", value, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1LessThan(Integer value) {
            addCriterion("F_N1 <", value, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1LessThanOrEqualTo(Integer value) {
            addCriterion("F_N1 <=", value, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1In(List<Integer> values) {
            addCriterion("F_N1 in", values, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1NotIn(List<Integer> values) {
            addCriterion("F_N1 not in", values, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1Between(Integer value1, Integer value2) {
            addCriterion("F_N1 between", value1, value2, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN1NotBetween(Integer value1, Integer value2) {
            addCriterion("F_N1 not between", value1, value2, "fN1");
            return (Criteria) this;
        }

        public Criteria andFN2IsNull() {
            addCriterion("F_N2 is null");
            return (Criteria) this;
        }

        public Criteria andFN2IsNotNull() {
            addCriterion("F_N2 is not null");
            return (Criteria) this;
        }

        public Criteria andFN2EqualTo(String value) {
            addCriterion("F_N2 =", value, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2NotEqualTo(String value) {
            addCriterion("F_N2 <>", value, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2GreaterThan(String value) {
            addCriterion("F_N2 >", value, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2GreaterThanOrEqualTo(String value) {
            addCriterion("F_N2 >=", value, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2LessThan(String value) {
            addCriterion("F_N2 <", value, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2LessThanOrEqualTo(String value) {
            addCriterion("F_N2 <=", value, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2Like(String value) {
            addCriterion("F_N2 like", value, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2NotLike(String value) {
            addCriterion("F_N2 not like", value, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2In(List<String> values) {
            addCriterion("F_N2 in", values, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2NotIn(List<String> values) {
            addCriterion("F_N2 not in", values, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2Between(String value1, String value2) {
            addCriterion("F_N2 between", value1, value2, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN2NotBetween(String value1, String value2) {
            addCriterion("F_N2 not between", value1, value2, "fN2");
            return (Criteria) this;
        }

        public Criteria andFN3IsNull() {
            addCriterion("F_N3 is null");
            return (Criteria) this;
        }

        public Criteria andFN3IsNotNull() {
            addCriterion("F_N3 is not null");
            return (Criteria) this;
        }

        public Criteria andFN3EqualTo(String value) {
            addCriterion("F_N3 =", value, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3NotEqualTo(String value) {
            addCriterion("F_N3 <>", value, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3GreaterThan(String value) {
            addCriterion("F_N3 >", value, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3GreaterThanOrEqualTo(String value) {
            addCriterion("F_N3 >=", value, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3LessThan(String value) {
            addCriterion("F_N3 <", value, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3LessThanOrEqualTo(String value) {
            addCriterion("F_N3 <=", value, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3Like(String value) {
            addCriterion("F_N3 like", value, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3NotLike(String value) {
            addCriterion("F_N3 not like", value, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3In(List<String> values) {
            addCriterion("F_N3 in", values, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3NotIn(List<String> values) {
            addCriterion("F_N3 not in", values, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3Between(String value1, String value2) {
            addCriterion("F_N3 between", value1, value2, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN3NotBetween(String value1, String value2) {
            addCriterion("F_N3 not between", value1, value2, "fN3");
            return (Criteria) this;
        }

        public Criteria andFN4IsNull() {
            addCriterion("F_N4 is null");
            return (Criteria) this;
        }

        public Criteria andFN4IsNotNull() {
            addCriterion("F_N4 is not null");
            return (Criteria) this;
        }

        public Criteria andFN4EqualTo(String value) {
            addCriterion("F_N4 =", value, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4NotEqualTo(String value) {
            addCriterion("F_N4 <>", value, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4GreaterThan(String value) {
            addCriterion("F_N4 >", value, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4GreaterThanOrEqualTo(String value) {
            addCriterion("F_N4 >=", value, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4LessThan(String value) {
            addCriterion("F_N4 <", value, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4LessThanOrEqualTo(String value) {
            addCriterion("F_N4 <=", value, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4Like(String value) {
            addCriterion("F_N4 like", value, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4NotLike(String value) {
            addCriterion("F_N4 not like", value, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4In(List<String> values) {
            addCriterion("F_N4 in", values, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4NotIn(List<String> values) {
            addCriterion("F_N4 not in", values, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4Between(String value1, String value2) {
            addCriterion("F_N4 between", value1, value2, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN4NotBetween(String value1, String value2) {
            addCriterion("F_N4 not between", value1, value2, "fN4");
            return (Criteria) this;
        }

        public Criteria andFN5IsNull() {
            addCriterion("F_N5 is null");
            return (Criteria) this;
        }

        public Criteria andFN5IsNotNull() {
            addCriterion("F_N5 is not null");
            return (Criteria) this;
        }

        public Criteria andFN5EqualTo(String value) {
            addCriterion("F_N5 =", value, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5NotEqualTo(String value) {
            addCriterion("F_N5 <>", value, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5GreaterThan(String value) {
            addCriterion("F_N5 >", value, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5GreaterThanOrEqualTo(String value) {
            addCriterion("F_N5 >=", value, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5LessThan(String value) {
            addCriterion("F_N5 <", value, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5LessThanOrEqualTo(String value) {
            addCriterion("F_N5 <=", value, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5Like(String value) {
            addCriterion("F_N5 like", value, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5NotLike(String value) {
            addCriterion("F_N5 not like", value, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5In(List<String> values) {
            addCriterion("F_N5 in", values, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5NotIn(List<String> values) {
            addCriterion("F_N5 not in", values, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5Between(String value1, String value2) {
            addCriterion("F_N5 between", value1, value2, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN5NotBetween(String value1, String value2) {
            addCriterion("F_N5 not between", value1, value2, "fN5");
            return (Criteria) this;
        }

        public Criteria andFN6IsNull() {
            addCriterion("F_N6 is null");
            return (Criteria) this;
        }

        public Criteria andFN6IsNotNull() {
            addCriterion("F_N6 is not null");
            return (Criteria) this;
        }

        public Criteria andFN6EqualTo(String value) {
            addCriterion("F_N6 =", value, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6NotEqualTo(String value) {
            addCriterion("F_N6 <>", value, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6GreaterThan(String value) {
            addCriterion("F_N6 >", value, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6GreaterThanOrEqualTo(String value) {
            addCriterion("F_N6 >=", value, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6LessThan(String value) {
            addCriterion("F_N6 <", value, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6LessThanOrEqualTo(String value) {
            addCriterion("F_N6 <=", value, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6Like(String value) {
            addCriterion("F_N6 like", value, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6NotLike(String value) {
            addCriterion("F_N6 not like", value, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6In(List<String> values) {
            addCriterion("F_N6 in", values, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6NotIn(List<String> values) {
            addCriterion("F_N6 not in", values, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6Between(String value1, String value2) {
            addCriterion("F_N6 between", value1, value2, "fN6");
            return (Criteria) this;
        }

        public Criteria andFN6NotBetween(String value1, String value2) {
            addCriterion("F_N6 not between", value1, value2, "fN6");
            return (Criteria) this;
        }

        public Criteria andFParentIsNull() {
            addCriterion("F_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andFParentIsNotNull() {
            addCriterion("F_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andFParentEqualTo(String value) {
            addCriterion("F_PARENT =", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentNotEqualTo(String value) {
            addCriterion("F_PARENT <>", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentGreaterThan(String value) {
            addCriterion("F_PARENT >", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentGreaterThanOrEqualTo(String value) {
            addCriterion("F_PARENT >=", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentLessThan(String value) {
            addCriterion("F_PARENT <", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentLessThanOrEqualTo(String value) {
            addCriterion("F_PARENT <=", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentLike(String value) {
            addCriterion("F_PARENT like", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentNotLike(String value) {
            addCriterion("F_PARENT not like", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentIn(List<String> values) {
            addCriterion("F_PARENT in", values, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentNotIn(List<String> values) {
            addCriterion("F_PARENT not in", values, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentBetween(String value1, String value2) {
            addCriterion("F_PARENT between", value1, value2, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentNotBetween(String value1, String value2) {
            addCriterion("F_PARENT not between", value1, value2, "fParent");
            return (Criteria) this;
        }

        public Criteria andFUtimeIsNull() {
            addCriterion("F_UTIME is null");
            return (Criteria) this;
        }

        public Criteria andFUtimeIsNotNull() {
            addCriterion("F_UTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFUtimeEqualTo(String value) {
            addCriterion("F_UTIME =", value, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeNotEqualTo(String value) {
            addCriterion("F_UTIME <>", value, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeGreaterThan(String value) {
            addCriterion("F_UTIME >", value, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeGreaterThanOrEqualTo(String value) {
            addCriterion("F_UTIME >=", value, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeLessThan(String value) {
            addCriterion("F_UTIME <", value, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeLessThanOrEqualTo(String value) {
            addCriterion("F_UTIME <=", value, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeLike(String value) {
            addCriterion("F_UTIME like", value, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeNotLike(String value) {
            addCriterion("F_UTIME not like", value, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeIn(List<String> values) {
            addCriterion("F_UTIME in", values, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeNotIn(List<String> values) {
            addCriterion("F_UTIME not in", values, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeBetween(String value1, String value2) {
            addCriterion("F_UTIME between", value1, value2, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUtimeNotBetween(String value1, String value2) {
            addCriterion("F_UTIME not between", value1, value2, "fUtime");
            return (Criteria) this;
        }

        public Criteria andFUseIsNull() {
            addCriterion("F_USE is null");
            return (Criteria) this;
        }

        public Criteria andFUseIsNotNull() {
            addCriterion("F_USE is not null");
            return (Criteria) this;
        }

        public Criteria andFUseEqualTo(String value) {
            addCriterion("F_USE =", value, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseNotEqualTo(String value) {
            addCriterion("F_USE <>", value, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseGreaterThan(String value) {
            addCriterion("F_USE >", value, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseGreaterThanOrEqualTo(String value) {
            addCriterion("F_USE >=", value, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseLessThan(String value) {
            addCriterion("F_USE <", value, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseLessThanOrEqualTo(String value) {
            addCriterion("F_USE <=", value, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseLike(String value) {
            addCriterion("F_USE like", value, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseNotLike(String value) {
            addCriterion("F_USE not like", value, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseIn(List<String> values) {
            addCriterion("F_USE in", values, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseNotIn(List<String> values) {
            addCriterion("F_USE not in", values, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseBetween(String value1, String value2) {
            addCriterion("F_USE between", value1, value2, "fUse");
            return (Criteria) this;
        }

        public Criteria andFUseNotBetween(String value1, String value2) {
            addCriterion("F_USE not between", value1, value2, "fUse");
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