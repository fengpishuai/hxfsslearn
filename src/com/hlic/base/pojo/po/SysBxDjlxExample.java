package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SysBxDjlxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBxDjlxExample() {
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

        public Criteria andFNoteIsNull() {
            addCriterion("F_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andFNoteIsNotNull() {
            addCriterion("F_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andFNoteEqualTo(String value) {
            addCriterion("F_NOTE =", value, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteNotEqualTo(String value) {
            addCriterion("F_NOTE <>", value, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteGreaterThan(String value) {
            addCriterion("F_NOTE >", value, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteGreaterThanOrEqualTo(String value) {
            addCriterion("F_NOTE >=", value, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteLessThan(String value) {
            addCriterion("F_NOTE <", value, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteLessThanOrEqualTo(String value) {
            addCriterion("F_NOTE <=", value, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteLike(String value) {
            addCriterion("F_NOTE like", value, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteNotLike(String value) {
            addCriterion("F_NOTE not like", value, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteIn(List<String> values) {
            addCriterion("F_NOTE in", values, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteNotIn(List<String> values) {
            addCriterion("F_NOTE not in", values, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteBetween(String value1, String value2) {
            addCriterion("F_NOTE between", value1, value2, "fNote");
            return (Criteria) this;
        }

        public Criteria andFNoteNotBetween(String value1, String value2) {
            addCriterion("F_NOTE not between", value1, value2, "fNote");
            return (Criteria) this;
        }

        public Criteria andFPurlIsNull() {
            addCriterion("F_PURL is null");
            return (Criteria) this;
        }

        public Criteria andFPurlIsNotNull() {
            addCriterion("F_PURL is not null");
            return (Criteria) this;
        }

        public Criteria andFPurlEqualTo(String value) {
            addCriterion("F_PURL =", value, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlNotEqualTo(String value) {
            addCriterion("F_PURL <>", value, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlGreaterThan(String value) {
            addCriterion("F_PURL >", value, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlGreaterThanOrEqualTo(String value) {
            addCriterion("F_PURL >=", value, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlLessThan(String value) {
            addCriterion("F_PURL <", value, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlLessThanOrEqualTo(String value) {
            addCriterion("F_PURL <=", value, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlLike(String value) {
            addCriterion("F_PURL like", value, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlNotLike(String value) {
            addCriterion("F_PURL not like", value, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlIn(List<String> values) {
            addCriterion("F_PURL in", values, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlNotIn(List<String> values) {
            addCriterion("F_PURL not in", values, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlBetween(String value1, String value2) {
            addCriterion("F_PURL between", value1, value2, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFPurlNotBetween(String value1, String value2) {
            addCriterion("F_PURL not between", value1, value2, "fPurl");
            return (Criteria) this;
        }

        public Criteria andFYwlxIsNull() {
            addCriterion("F_YWLX is null");
            return (Criteria) this;
        }

        public Criteria andFYwlxIsNotNull() {
            addCriterion("F_YWLX is not null");
            return (Criteria) this;
        }

        public Criteria andFYwlxEqualTo(String value) {
            addCriterion("F_YWLX =", value, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxNotEqualTo(String value) {
            addCriterion("F_YWLX <>", value, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxGreaterThan(String value) {
            addCriterion("F_YWLX >", value, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxGreaterThanOrEqualTo(String value) {
            addCriterion("F_YWLX >=", value, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxLessThan(String value) {
            addCriterion("F_YWLX <", value, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxLessThanOrEqualTo(String value) {
            addCriterion("F_YWLX <=", value, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxLike(String value) {
            addCriterion("F_YWLX like", value, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxNotLike(String value) {
            addCriterion("F_YWLX not like", value, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxIn(List<String> values) {
            addCriterion("F_YWLX in", values, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxNotIn(List<String> values) {
            addCriterion("F_YWLX not in", values, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxBetween(String value1, String value2) {
            addCriterion("F_YWLX between", value1, value2, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFYwlxNotBetween(String value1, String value2) {
            addCriterion("F_YWLX not between", value1, value2, "fYwlx");
            return (Criteria) this;
        }

        public Criteria andFStoIdIsNull() {
            addCriterion("F_STO_ID is null");
            return (Criteria) this;
        }

        public Criteria andFStoIdIsNotNull() {
            addCriterion("F_STO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFStoIdEqualTo(String value) {
            addCriterion("F_STO_ID =", value, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdNotEqualTo(String value) {
            addCriterion("F_STO_ID <>", value, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdGreaterThan(String value) {
            addCriterion("F_STO_ID >", value, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_STO_ID >=", value, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdLessThan(String value) {
            addCriterion("F_STO_ID <", value, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdLessThanOrEqualTo(String value) {
            addCriterion("F_STO_ID <=", value, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdLike(String value) {
            addCriterion("F_STO_ID like", value, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdNotLike(String value) {
            addCriterion("F_STO_ID not like", value, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdIn(List<String> values) {
            addCriterion("F_STO_ID in", values, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdNotIn(List<String> values) {
            addCriterion("F_STO_ID not in", values, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdBetween(String value1, String value2) {
            addCriterion("F_STO_ID between", value1, value2, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFStoIdNotBetween(String value1, String value2) {
            addCriterion("F_STO_ID not between", value1, value2, "fStoId");
            return (Criteria) this;
        }

        public Criteria andFSftyIsNull() {
            addCriterion("F_SFTY is null");
            return (Criteria) this;
        }

        public Criteria andFSftyIsNotNull() {
            addCriterion("F_SFTY is not null");
            return (Criteria) this;
        }

        public Criteria andFSftyEqualTo(String value) {
            addCriterion("F_SFTY =", value, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyNotEqualTo(String value) {
            addCriterion("F_SFTY <>", value, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyGreaterThan(String value) {
            addCriterion("F_SFTY >", value, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyGreaterThanOrEqualTo(String value) {
            addCriterion("F_SFTY >=", value, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyLessThan(String value) {
            addCriterion("F_SFTY <", value, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyLessThanOrEqualTo(String value) {
            addCriterion("F_SFTY <=", value, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyLike(String value) {
            addCriterion("F_SFTY like", value, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyNotLike(String value) {
            addCriterion("F_SFTY not like", value, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyIn(List<String> values) {
            addCriterion("F_SFTY in", values, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyNotIn(List<String> values) {
            addCriterion("F_SFTY not in", values, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyBetween(String value1, String value2) {
            addCriterion("F_SFTY between", value1, value2, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFSftyNotBetween(String value1, String value2) {
            addCriterion("F_SFTY not between", value1, value2, "fSfty");
            return (Criteria) this;
        }

        public Criteria andFBzIdIsNull() {
            addCriterion("F_BZ_ID is null");
            return (Criteria) this;
        }

        public Criteria andFBzIdIsNotNull() {
            addCriterion("F_BZ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFBzIdEqualTo(String value) {
            addCriterion("F_BZ_ID =", value, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdNotEqualTo(String value) {
            addCriterion("F_BZ_ID <>", value, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdGreaterThan(String value) {
            addCriterion("F_BZ_ID >", value, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_BZ_ID >=", value, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdLessThan(String value) {
            addCriterion("F_BZ_ID <", value, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdLessThanOrEqualTo(String value) {
            addCriterion("F_BZ_ID <=", value, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdLike(String value) {
            addCriterion("F_BZ_ID like", value, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdNotLike(String value) {
            addCriterion("F_BZ_ID not like", value, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdIn(List<String> values) {
            addCriterion("F_BZ_ID in", values, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdNotIn(List<String> values) {
            addCriterion("F_BZ_ID not in", values, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdBetween(String value1, String value2) {
            addCriterion("F_BZ_ID between", value1, value2, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFBzIdNotBetween(String value1, String value2) {
            addCriterion("F_BZ_ID not between", value1, value2, "fBzId");
            return (Criteria) this;
        }

        public Criteria andFYskzIsNull() {
            addCriterion("F_YSKZ is null");
            return (Criteria) this;
        }

        public Criteria andFYskzIsNotNull() {
            addCriterion("F_YSKZ is not null");
            return (Criteria) this;
        }

        public Criteria andFYskzEqualTo(String value) {
            addCriterion("F_YSKZ =", value, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzNotEqualTo(String value) {
            addCriterion("F_YSKZ <>", value, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzGreaterThan(String value) {
            addCriterion("F_YSKZ >", value, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzGreaterThanOrEqualTo(String value) {
            addCriterion("F_YSKZ >=", value, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzLessThan(String value) {
            addCriterion("F_YSKZ <", value, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzLessThanOrEqualTo(String value) {
            addCriterion("F_YSKZ <=", value, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzLike(String value) {
            addCriterion("F_YSKZ like", value, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzNotLike(String value) {
            addCriterion("F_YSKZ not like", value, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzIn(List<String> values) {
            addCriterion("F_YSKZ in", values, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzNotIn(List<String> values) {
            addCriterion("F_YSKZ not in", values, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzBetween(String value1, String value2) {
            addCriterion("F_YSKZ between", value1, value2, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFYskzNotBetween(String value1, String value2) {
            addCriterion("F_YSKZ not between", value1, value2, "fYskz");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutIsNull() {
            addCriterion("F_EDT_LAYOUT is null");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutIsNotNull() {
            addCriterion("F_EDT_LAYOUT is not null");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutEqualTo(String value) {
            addCriterion("F_EDT_LAYOUT =", value, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutNotEqualTo(String value) {
            addCriterion("F_EDT_LAYOUT <>", value, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutGreaterThan(String value) {
            addCriterion("F_EDT_LAYOUT >", value, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutGreaterThanOrEqualTo(String value) {
            addCriterion("F_EDT_LAYOUT >=", value, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutLessThan(String value) {
            addCriterion("F_EDT_LAYOUT <", value, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutLessThanOrEqualTo(String value) {
            addCriterion("F_EDT_LAYOUT <=", value, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutLike(String value) {
            addCriterion("F_EDT_LAYOUT like", value, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutNotLike(String value) {
            addCriterion("F_EDT_LAYOUT not like", value, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutIn(List<String> values) {
            addCriterion("F_EDT_LAYOUT in", values, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutNotIn(List<String> values) {
            addCriterion("F_EDT_LAYOUT not in", values, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutBetween(String value1, String value2) {
            addCriterion("F_EDT_LAYOUT between", value1, value2, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFEdtLayoutNotBetween(String value1, String value2) {
            addCriterion("F_EDT_LAYOUT not between", value1, value2, "fEdtLayout");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1IsNull() {
            addCriterion("F_PRT_LAYOUT1 is null");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1IsNotNull() {
            addCriterion("F_PRT_LAYOUT1 is not null");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1EqualTo(String value) {
            addCriterion("F_PRT_LAYOUT1 =", value, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1NotEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT1 <>", value, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1GreaterThan(String value) {
            addCriterion("F_PRT_LAYOUT1 >", value, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1GreaterThanOrEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT1 >=", value, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1LessThan(String value) {
            addCriterion("F_PRT_LAYOUT1 <", value, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1LessThanOrEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT1 <=", value, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1Like(String value) {
            addCriterion("F_PRT_LAYOUT1 like", value, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1NotLike(String value) {
            addCriterion("F_PRT_LAYOUT1 not like", value, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1In(List<String> values) {
            addCriterion("F_PRT_LAYOUT1 in", values, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1NotIn(List<String> values) {
            addCriterion("F_PRT_LAYOUT1 not in", values, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1Between(String value1, String value2) {
            addCriterion("F_PRT_LAYOUT1 between", value1, value2, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout1NotBetween(String value1, String value2) {
            addCriterion("F_PRT_LAYOUT1 not between", value1, value2, "fPrtLayout1");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2IsNull() {
            addCriterion("F_PRT_LAYOUT2 is null");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2IsNotNull() {
            addCriterion("F_PRT_LAYOUT2 is not null");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2EqualTo(String value) {
            addCriterion("F_PRT_LAYOUT2 =", value, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2NotEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT2 <>", value, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2GreaterThan(String value) {
            addCriterion("F_PRT_LAYOUT2 >", value, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2GreaterThanOrEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT2 >=", value, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2LessThan(String value) {
            addCriterion("F_PRT_LAYOUT2 <", value, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2LessThanOrEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT2 <=", value, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2Like(String value) {
            addCriterion("F_PRT_LAYOUT2 like", value, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2NotLike(String value) {
            addCriterion("F_PRT_LAYOUT2 not like", value, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2In(List<String> values) {
            addCriterion("F_PRT_LAYOUT2 in", values, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2NotIn(List<String> values) {
            addCriterion("F_PRT_LAYOUT2 not in", values, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2Between(String value1, String value2) {
            addCriterion("F_PRT_LAYOUT2 between", value1, value2, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout2NotBetween(String value1, String value2) {
            addCriterion("F_PRT_LAYOUT2 not between", value1, value2, "fPrtLayout2");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3IsNull() {
            addCriterion("F_PRT_LAYOUT3 is null");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3IsNotNull() {
            addCriterion("F_PRT_LAYOUT3 is not null");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3EqualTo(String value) {
            addCriterion("F_PRT_LAYOUT3 =", value, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3NotEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT3 <>", value, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3GreaterThan(String value) {
            addCriterion("F_PRT_LAYOUT3 >", value, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3GreaterThanOrEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT3 >=", value, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3LessThan(String value) {
            addCriterion("F_PRT_LAYOUT3 <", value, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3LessThanOrEqualTo(String value) {
            addCriterion("F_PRT_LAYOUT3 <=", value, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3Like(String value) {
            addCriterion("F_PRT_LAYOUT3 like", value, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3NotLike(String value) {
            addCriterion("F_PRT_LAYOUT3 not like", value, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3In(List<String> values) {
            addCriterion("F_PRT_LAYOUT3 in", values, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3NotIn(List<String> values) {
            addCriterion("F_PRT_LAYOUT3 not in", values, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3Between(String value1, String value2) {
            addCriterion("F_PRT_LAYOUT3 between", value1, value2, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFPrtLayout3NotBetween(String value1, String value2) {
            addCriterion("F_PRT_LAYOUT3 not between", value1, value2, "fPrtLayout3");
            return (Criteria) this;
        }

        public Criteria andFLyxtIsNull() {
            addCriterion("F_LYXT is null");
            return (Criteria) this;
        }

        public Criteria andFLyxtIsNotNull() {
            addCriterion("F_LYXT is not null");
            return (Criteria) this;
        }

        public Criteria andFLyxtEqualTo(String value) {
            addCriterion("F_LYXT =", value, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtNotEqualTo(String value) {
            addCriterion("F_LYXT <>", value, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtGreaterThan(String value) {
            addCriterion("F_LYXT >", value, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtGreaterThanOrEqualTo(String value) {
            addCriterion("F_LYXT >=", value, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtLessThan(String value) {
            addCriterion("F_LYXT <", value, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtLessThanOrEqualTo(String value) {
            addCriterion("F_LYXT <=", value, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtLike(String value) {
            addCriterion("F_LYXT like", value, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtNotLike(String value) {
            addCriterion("F_LYXT not like", value, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtIn(List<String> values) {
            addCriterion("F_LYXT in", values, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtNotIn(List<String> values) {
            addCriterion("F_LYXT not in", values, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtBetween(String value1, String value2) {
            addCriterion("F_LYXT between", value1, value2, "fLyxt");
            return (Criteria) this;
        }

        public Criteria andFLyxtNotBetween(String value1, String value2) {
            addCriterion("F_LYXT not between", value1, value2, "fLyxt");
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