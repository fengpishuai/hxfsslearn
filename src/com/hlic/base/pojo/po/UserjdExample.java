package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class UserjdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserjdExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andDzIsNull() {
            addCriterion("dz is null");
            return (Criteria) this;
        }

        public Criteria andDzIsNotNull() {
            addCriterion("dz is not null");
            return (Criteria) this;
        }

        public Criteria andDzEqualTo(String value) {
            addCriterion("dz =", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotEqualTo(String value) {
            addCriterion("dz <>", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThan(String value) {
            addCriterion("dz >", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzGreaterThanOrEqualTo(String value) {
            addCriterion("dz >=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThan(String value) {
            addCriterion("dz <", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLessThanOrEqualTo(String value) {
            addCriterion("dz <=", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzLike(String value) {
            addCriterion("dz like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotLike(String value) {
            addCriterion("dz not like", value, "dz");
            return (Criteria) this;
        }

        public Criteria andDzIn(List<String> values) {
            addCriterion("dz in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotIn(List<String> values) {
            addCriterion("dz not in", values, "dz");
            return (Criteria) this;
        }

        public Criteria andDzBetween(String value1, String value2) {
            addCriterion("dz between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andDzNotBetween(String value1, String value2) {
            addCriterion("dz not between", value1, value2, "dz");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("yzbm is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("yzbm is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("yzbm =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("yzbm <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("yzbm >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("yzbm >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("yzbm <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("yzbm <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("yzbm like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("yzbm not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("yzbm in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("yzbm not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("yzbm between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("yzbm not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andXlrIsNull() {
            addCriterion("xlr is null");
            return (Criteria) this;
        }

        public Criteria andXlrIsNotNull() {
            addCriterion("xlr is not null");
            return (Criteria) this;
        }

        public Criteria andXlrEqualTo(String value) {
            addCriterion("xlr =", value, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrNotEqualTo(String value) {
            addCriterion("xlr <>", value, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrGreaterThan(String value) {
            addCriterion("xlr >", value, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrGreaterThanOrEqualTo(String value) {
            addCriterion("xlr >=", value, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrLessThan(String value) {
            addCriterion("xlr <", value, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrLessThanOrEqualTo(String value) {
            addCriterion("xlr <=", value, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrLike(String value) {
            addCriterion("xlr like", value, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrNotLike(String value) {
            addCriterion("xlr not like", value, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrIn(List<String> values) {
            addCriterion("xlr in", values, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrNotIn(List<String> values) {
            addCriterion("xlr not in", values, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrBetween(String value1, String value2) {
            addCriterion("xlr between", value1, value2, "xlr");
            return (Criteria) this;
        }

        public Criteria andXlrNotBetween(String value1, String value2) {
            addCriterion("xlr not between", value1, value2, "xlr");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("dh is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("dh is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("dh =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("dh <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("dh >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("dh >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("dh <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("dh <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("dh like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("dh not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("dh in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("dh not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("dh between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("dh not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andCzIsNull() {
            addCriterion("cz is null");
            return (Criteria) this;
        }

        public Criteria andCzIsNotNull() {
            addCriterion("cz is not null");
            return (Criteria) this;
        }

        public Criteria andCzEqualTo(String value) {
            addCriterion("cz =", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotEqualTo(String value) {
            addCriterion("cz <>", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThan(String value) {
            addCriterion("cz >", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThanOrEqualTo(String value) {
            addCriterion("cz >=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThan(String value) {
            addCriterion("cz <", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThanOrEqualTo(String value) {
            addCriterion("cz <=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLike(String value) {
            addCriterion("cz like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotLike(String value) {
            addCriterion("cz not like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzIn(List<String> values) {
            addCriterion("cz in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotIn(List<String> values) {
            addCriterion("cz not in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzBetween(String value1, String value2) {
            addCriterion("cz between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotBetween(String value1, String value2) {
            addCriterion("cz not between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNull() {
            addCriterion("dzyx is null");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNotNull() {
            addCriterion("dzyx is not null");
            return (Criteria) this;
        }

        public Criteria andDzyxEqualTo(String value) {
            addCriterion("dzyx =", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotEqualTo(String value) {
            addCriterion("dzyx <>", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThan(String value) {
            addCriterion("dzyx >", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThanOrEqualTo(String value) {
            addCriterion("dzyx >=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThan(String value) {
            addCriterion("dzyx <", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThanOrEqualTo(String value) {
            addCriterion("dzyx <=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLike(String value) {
            addCriterion("dzyx like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotLike(String value) {
            addCriterion("dzyx not like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxIn(List<String> values) {
            addCriterion("dzyx in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotIn(List<String> values) {
            addCriterion("dzyx not in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxBetween(String value1, String value2) {
            addCriterion("dzyx between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotBetween(String value1, String value2) {
            addCriterion("dzyx not between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andWzIsNull() {
            addCriterion("wz is null");
            return (Criteria) this;
        }

        public Criteria andWzIsNotNull() {
            addCriterion("wz is not null");
            return (Criteria) this;
        }

        public Criteria andWzEqualTo(String value) {
            addCriterion("wz =", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotEqualTo(String value) {
            addCriterion("wz <>", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThan(String value) {
            addCriterion("wz >", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThanOrEqualTo(String value) {
            addCriterion("wz >=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThan(String value) {
            addCriterion("wz <", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThanOrEqualTo(String value) {
            addCriterion("wz <=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLike(String value) {
            addCriterion("wz like", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotLike(String value) {
            addCriterion("wz not like", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzIn(List<String> values) {
            addCriterion("wz in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotIn(List<String> values) {
            addCriterion("wz not in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzBetween(String value1, String value2) {
            addCriterion("wz between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotBetween(String value1, String value2) {
            addCriterion("wz not between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNull() {
            addCriterion("vchar1 is null");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNotNull() {
            addCriterion("vchar1 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar1EqualTo(String value) {
            addCriterion("vchar1 =", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotEqualTo(String value) {
            addCriterion("vchar1 <>", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThan(String value) {
            addCriterion("vchar1 >", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThanOrEqualTo(String value) {
            addCriterion("vchar1 >=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThan(String value) {
            addCriterion("vchar1 <", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThanOrEqualTo(String value) {
            addCriterion("vchar1 <=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Like(String value) {
            addCriterion("vchar1 like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotLike(String value) {
            addCriterion("vchar1 not like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1In(List<String> values) {
            addCriterion("vchar1 in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotIn(List<String> values) {
            addCriterion("vchar1 not in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Between(String value1, String value2) {
            addCriterion("vchar1 between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotBetween(String value1, String value2) {
            addCriterion("vchar1 not between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNull() {
            addCriterion("vchar2 is null");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNotNull() {
            addCriterion("vchar2 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar2EqualTo(String value) {
            addCriterion("vchar2 =", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotEqualTo(String value) {
            addCriterion("vchar2 <>", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThan(String value) {
            addCriterion("vchar2 >", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThanOrEqualTo(String value) {
            addCriterion("vchar2 >=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThan(String value) {
            addCriterion("vchar2 <", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThanOrEqualTo(String value) {
            addCriterion("vchar2 <=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Like(String value) {
            addCriterion("vchar2 like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotLike(String value) {
            addCriterion("vchar2 not like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2In(List<String> values) {
            addCriterion("vchar2 in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotIn(List<String> values) {
            addCriterion("vchar2 not in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Between(String value1, String value2) {
            addCriterion("vchar2 between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotBetween(String value1, String value2) {
            addCriterion("vchar2 not between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNull() {
            addCriterion("vchar3 is null");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNotNull() {
            addCriterion("vchar3 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar3EqualTo(String value) {
            addCriterion("vchar3 =", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotEqualTo(String value) {
            addCriterion("vchar3 <>", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThan(String value) {
            addCriterion("vchar3 >", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThanOrEqualTo(String value) {
            addCriterion("vchar3 >=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThan(String value) {
            addCriterion("vchar3 <", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThanOrEqualTo(String value) {
            addCriterion("vchar3 <=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Like(String value) {
            addCriterion("vchar3 like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotLike(String value) {
            addCriterion("vchar3 not like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3In(List<String> values) {
            addCriterion("vchar3 in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotIn(List<String> values) {
            addCriterion("vchar3 not in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Between(String value1, String value2) {
            addCriterion("vchar3 between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotBetween(String value1, String value2) {
            addCriterion("vchar3 not between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andDqIsNull() {
            addCriterion("dq is null");
            return (Criteria) this;
        }

        public Criteria andDqIsNotNull() {
            addCriterion("dq is not null");
            return (Criteria) this;
        }

        public Criteria andDqEqualTo(String value) {
            addCriterion("dq =", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotEqualTo(String value) {
            addCriterion("dq <>", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqGreaterThan(String value) {
            addCriterion("dq >", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqGreaterThanOrEqualTo(String value) {
            addCriterion("dq >=", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLessThan(String value) {
            addCriterion("dq <", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLessThanOrEqualTo(String value) {
            addCriterion("dq <=", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqLike(String value) {
            addCriterion("dq like", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotLike(String value) {
            addCriterion("dq not like", value, "dq");
            return (Criteria) this;
        }

        public Criteria andDqIn(List<String> values) {
            addCriterion("dq in", values, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotIn(List<String> values) {
            addCriterion("dq not in", values, "dq");
            return (Criteria) this;
        }

        public Criteria andDqBetween(String value1, String value2) {
            addCriterion("dq between", value1, value2, "dq");
            return (Criteria) this;
        }

        public Criteria andDqNotBetween(String value1, String value2) {
            addCriterion("dq not between", value1, value2, "dq");
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