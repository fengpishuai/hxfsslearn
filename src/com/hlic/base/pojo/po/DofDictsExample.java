package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class DofDictsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DofDictsExample() {
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

        public Criteria andDctIdIsNull() {
            addCriterion("DCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDctIdIsNotNull() {
            addCriterion("DCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDctIdEqualTo(String value) {
            addCriterion("DCT_ID =", value, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdNotEqualTo(String value) {
            addCriterion("DCT_ID <>", value, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdGreaterThan(String value) {
            addCriterion("DCT_ID >", value, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_ID >=", value, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdLessThan(String value) {
            addCriterion("DCT_ID <", value, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdLessThanOrEqualTo(String value) {
            addCriterion("DCT_ID <=", value, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdLike(String value) {
            addCriterion("DCT_ID like", value, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdNotLike(String value) {
            addCriterion("DCT_ID not like", value, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdIn(List<String> values) {
            addCriterion("DCT_ID in", values, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdNotIn(List<String> values) {
            addCriterion("DCT_ID not in", values, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdBetween(String value1, String value2) {
            addCriterion("DCT_ID between", value1, value2, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctIdNotBetween(String value1, String value2) {
            addCriterion("DCT_ID not between", value1, value2, "dctId");
            return (Criteria) this;
        }

        public Criteria andDctCaptionIsNull() {
            addCriterion("DCT_CAPTION is null");
            return (Criteria) this;
        }

        public Criteria andDctCaptionIsNotNull() {
            addCriterion("DCT_CAPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDctCaptionEqualTo(String value) {
            addCriterion("DCT_CAPTION =", value, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionNotEqualTo(String value) {
            addCriterion("DCT_CAPTION <>", value, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionGreaterThan(String value) {
            addCriterion("DCT_CAPTION >", value, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_CAPTION >=", value, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionLessThan(String value) {
            addCriterion("DCT_CAPTION <", value, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionLessThanOrEqualTo(String value) {
            addCriterion("DCT_CAPTION <=", value, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionLike(String value) {
            addCriterion("DCT_CAPTION like", value, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionNotLike(String value) {
            addCriterion("DCT_CAPTION not like", value, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionIn(List<String> values) {
            addCriterion("DCT_CAPTION in", values, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionNotIn(List<String> values) {
            addCriterion("DCT_CAPTION not in", values, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionBetween(String value1, String value2) {
            addCriterion("DCT_CAPTION between", value1, value2, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctCaptionNotBetween(String value1, String value2) {
            addCriterion("DCT_CAPTION not between", value1, value2, "dctCaption");
            return (Criteria) this;
        }

        public Criteria andDctIconIsNull() {
            addCriterion("DCT_ICON is null");
            return (Criteria) this;
        }

        public Criteria andDctIconIsNotNull() {
            addCriterion("DCT_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andDctIconEqualTo(String value) {
            addCriterion("DCT_ICON =", value, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconNotEqualTo(String value) {
            addCriterion("DCT_ICON <>", value, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconGreaterThan(String value) {
            addCriterion("DCT_ICON >", value, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_ICON >=", value, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconLessThan(String value) {
            addCriterion("DCT_ICON <", value, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconLessThanOrEqualTo(String value) {
            addCriterion("DCT_ICON <=", value, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconLike(String value) {
            addCriterion("DCT_ICON like", value, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconNotLike(String value) {
            addCriterion("DCT_ICON not like", value, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconIn(List<String> values) {
            addCriterion("DCT_ICON in", values, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconNotIn(List<String> values) {
            addCriterion("DCT_ICON not in", values, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconBetween(String value1, String value2) {
            addCriterion("DCT_ICON between", value1, value2, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctIconNotBetween(String value1, String value2) {
            addCriterion("DCT_ICON not between", value1, value2, "dctIcon");
            return (Criteria) this;
        }

        public Criteria andDctInterIsNull() {
            addCriterion("DCT_INTER is null");
            return (Criteria) this;
        }

        public Criteria andDctInterIsNotNull() {
            addCriterion("DCT_INTER is not null");
            return (Criteria) this;
        }

        public Criteria andDctInterEqualTo(String value) {
            addCriterion("DCT_INTER =", value, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterNotEqualTo(String value) {
            addCriterion("DCT_INTER <>", value, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterGreaterThan(String value) {
            addCriterion("DCT_INTER >", value, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_INTER >=", value, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterLessThan(String value) {
            addCriterion("DCT_INTER <", value, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterLessThanOrEqualTo(String value) {
            addCriterion("DCT_INTER <=", value, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterLike(String value) {
            addCriterion("DCT_INTER like", value, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterNotLike(String value) {
            addCriterion("DCT_INTER not like", value, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterIn(List<String> values) {
            addCriterion("DCT_INTER in", values, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterNotIn(List<String> values) {
            addCriterion("DCT_INTER not in", values, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterBetween(String value1, String value2) {
            addCriterion("DCT_INTER between", value1, value2, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctInterNotBetween(String value1, String value2) {
            addCriterion("DCT_INTER not between", value1, value2, "dctInter");
            return (Criteria) this;
        }

        public Criteria andDctFidIsNull() {
            addCriterion("DCT_FID is null");
            return (Criteria) this;
        }

        public Criteria andDctFidIsNotNull() {
            addCriterion("DCT_FID is not null");
            return (Criteria) this;
        }

        public Criteria andDctFidEqualTo(String value) {
            addCriterion("DCT_FID =", value, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidNotEqualTo(String value) {
            addCriterion("DCT_FID <>", value, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidGreaterThan(String value) {
            addCriterion("DCT_FID >", value, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FID >=", value, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidLessThan(String value) {
            addCriterion("DCT_FID <", value, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidLessThanOrEqualTo(String value) {
            addCriterion("DCT_FID <=", value, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidLike(String value) {
            addCriterion("DCT_FID like", value, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidNotLike(String value) {
            addCriterion("DCT_FID not like", value, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidIn(List<String> values) {
            addCriterion("DCT_FID in", values, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidNotIn(List<String> values) {
            addCriterion("DCT_FID not in", values, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidBetween(String value1, String value2) {
            addCriterion("DCT_FID between", value1, value2, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFidNotBetween(String value1, String value2) {
            addCriterion("DCT_FID not between", value1, value2, "dctFid");
            return (Criteria) this;
        }

        public Criteria andDctFparentIsNull() {
            addCriterion("DCT_FPARENT is null");
            return (Criteria) this;
        }

        public Criteria andDctFparentIsNotNull() {
            addCriterion("DCT_FPARENT is not null");
            return (Criteria) this;
        }

        public Criteria andDctFparentEqualTo(String value) {
            addCriterion("DCT_FPARENT =", value, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentNotEqualTo(String value) {
            addCriterion("DCT_FPARENT <>", value, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentGreaterThan(String value) {
            addCriterion("DCT_FPARENT >", value, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FPARENT >=", value, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentLessThan(String value) {
            addCriterion("DCT_FPARENT <", value, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentLessThanOrEqualTo(String value) {
            addCriterion("DCT_FPARENT <=", value, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentLike(String value) {
            addCriterion("DCT_FPARENT like", value, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentNotLike(String value) {
            addCriterion("DCT_FPARENT not like", value, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentIn(List<String> values) {
            addCriterion("DCT_FPARENT in", values, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentNotIn(List<String> values) {
            addCriterion("DCT_FPARENT not in", values, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentBetween(String value1, String value2) {
            addCriterion("DCT_FPARENT between", value1, value2, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFparentNotBetween(String value1, String value2) {
            addCriterion("DCT_FPARENT not between", value1, value2, "dctFparent");
            return (Criteria) this;
        }

        public Criteria andDctFnameIsNull() {
            addCriterion("DCT_FNAME is null");
            return (Criteria) this;
        }

        public Criteria andDctFnameIsNotNull() {
            addCriterion("DCT_FNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDctFnameEqualTo(String value) {
            addCriterion("DCT_FNAME =", value, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameNotEqualTo(String value) {
            addCriterion("DCT_FNAME <>", value, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameGreaterThan(String value) {
            addCriterion("DCT_FNAME >", value, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FNAME >=", value, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameLessThan(String value) {
            addCriterion("DCT_FNAME <", value, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameLessThanOrEqualTo(String value) {
            addCriterion("DCT_FNAME <=", value, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameLike(String value) {
            addCriterion("DCT_FNAME like", value, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameNotLike(String value) {
            addCriterion("DCT_FNAME not like", value, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameIn(List<String> values) {
            addCriterion("DCT_FNAME in", values, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameNotIn(List<String> values) {
            addCriterion("DCT_FNAME not in", values, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameBetween(String value1, String value2) {
            addCriterion("DCT_FNAME between", value1, value2, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFnameNotBetween(String value1, String value2) {
            addCriterion("DCT_FNAME not between", value1, value2, "dctFname");
            return (Criteria) this;
        }

        public Criteria andDctFlevelIsNull() {
            addCriterion("DCT_FLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDctFlevelIsNotNull() {
            addCriterion("DCT_FLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDctFlevelEqualTo(String value) {
            addCriterion("DCT_FLEVEL =", value, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelNotEqualTo(String value) {
            addCriterion("DCT_FLEVEL <>", value, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelGreaterThan(String value) {
            addCriterion("DCT_FLEVEL >", value, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FLEVEL >=", value, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelLessThan(String value) {
            addCriterion("DCT_FLEVEL <", value, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelLessThanOrEqualTo(String value) {
            addCriterion("DCT_FLEVEL <=", value, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelLike(String value) {
            addCriterion("DCT_FLEVEL like", value, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelNotLike(String value) {
            addCriterion("DCT_FLEVEL not like", value, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelIn(List<String> values) {
            addCriterion("DCT_FLEVEL in", values, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelNotIn(List<String> values) {
            addCriterion("DCT_FLEVEL not in", values, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelBetween(String value1, String value2) {
            addCriterion("DCT_FLEVEL between", value1, value2, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFlevelNotBetween(String value1, String value2) {
            addCriterion("DCT_FLEVEL not between", value1, value2, "dctFlevel");
            return (Criteria) this;
        }

        public Criteria andDctFchildIsNull() {
            addCriterion("DCT_FCHILD is null");
            return (Criteria) this;
        }

        public Criteria andDctFchildIsNotNull() {
            addCriterion("DCT_FCHILD is not null");
            return (Criteria) this;
        }

        public Criteria andDctFchildEqualTo(String value) {
            addCriterion("DCT_FCHILD =", value, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildNotEqualTo(String value) {
            addCriterion("DCT_FCHILD <>", value, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildGreaterThan(String value) {
            addCriterion("DCT_FCHILD >", value, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FCHILD >=", value, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildLessThan(String value) {
            addCriterion("DCT_FCHILD <", value, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildLessThanOrEqualTo(String value) {
            addCriterion("DCT_FCHILD <=", value, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildLike(String value) {
            addCriterion("DCT_FCHILD like", value, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildNotLike(String value) {
            addCriterion("DCT_FCHILD not like", value, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildIn(List<String> values) {
            addCriterion("DCT_FCHILD in", values, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildNotIn(List<String> values) {
            addCriterion("DCT_FCHILD not in", values, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildBetween(String value1, String value2) {
            addCriterion("DCT_FCHILD between", value1, value2, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFchildNotBetween(String value1, String value2) {
            addCriterion("DCT_FCHILD not between", value1, value2, "dctFchild");
            return (Criteria) this;
        }

        public Criteria andDctFnationidIsNull() {
            addCriterion("DCT_FNATIONID is null");
            return (Criteria) this;
        }

        public Criteria andDctFnationidIsNotNull() {
            addCriterion("DCT_FNATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andDctFnationidEqualTo(String value) {
            addCriterion("DCT_FNATIONID =", value, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidNotEqualTo(String value) {
            addCriterion("DCT_FNATIONID <>", value, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidGreaterThan(String value) {
            addCriterion("DCT_FNATIONID >", value, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FNATIONID >=", value, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidLessThan(String value) {
            addCriterion("DCT_FNATIONID <", value, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidLessThanOrEqualTo(String value) {
            addCriterion("DCT_FNATIONID <=", value, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidLike(String value) {
            addCriterion("DCT_FNATIONID like", value, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidNotLike(String value) {
            addCriterion("DCT_FNATIONID not like", value, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidIn(List<String> values) {
            addCriterion("DCT_FNATIONID in", values, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidNotIn(List<String> values) {
            addCriterion("DCT_FNATIONID not in", values, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidBetween(String value1, String value2) {
            addCriterion("DCT_FNATIONID between", value1, value2, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctFnationidNotBetween(String value1, String value2) {
            addCriterion("DCT_FNATIONID not between", value1, value2, "dctFnationid");
            return (Criteria) this;
        }

        public Criteria andDctStrucIsNull() {
            addCriterion("DCT_STRUC is null");
            return (Criteria) this;
        }

        public Criteria andDctStrucIsNotNull() {
            addCriterion("DCT_STRUC is not null");
            return (Criteria) this;
        }

        public Criteria andDctStrucEqualTo(String value) {
            addCriterion("DCT_STRUC =", value, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucNotEqualTo(String value) {
            addCriterion("DCT_STRUC <>", value, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucGreaterThan(String value) {
            addCriterion("DCT_STRUC >", value, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_STRUC >=", value, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucLessThan(String value) {
            addCriterion("DCT_STRUC <", value, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucLessThanOrEqualTo(String value) {
            addCriterion("DCT_STRUC <=", value, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucLike(String value) {
            addCriterion("DCT_STRUC like", value, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucNotLike(String value) {
            addCriterion("DCT_STRUC not like", value, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucIn(List<String> values) {
            addCriterion("DCT_STRUC in", values, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucNotIn(List<String> values) {
            addCriterion("DCT_STRUC not in", values, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucBetween(String value1, String value2) {
            addCriterion("DCT_STRUC between", value1, value2, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctStrucNotBetween(String value1, String value2) {
            addCriterion("DCT_STRUC not between", value1, value2, "dctStruc");
            return (Criteria) this;
        }

        public Criteria andDctDofObjIsNull() {
            addCriterion("DCT_DOF_OBJ is null");
            return (Criteria) this;
        }

        public Criteria andDctDofObjIsNotNull() {
            addCriterion("DCT_DOF_OBJ is not null");
            return (Criteria) this;
        }

        public Criteria andDctDofObjEqualTo(String value) {
            addCriterion("DCT_DOF_OBJ =", value, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjNotEqualTo(String value) {
            addCriterion("DCT_DOF_OBJ <>", value, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjGreaterThan(String value) {
            addCriterion("DCT_DOF_OBJ >", value, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_DOF_OBJ >=", value, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjLessThan(String value) {
            addCriterion("DCT_DOF_OBJ <", value, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjLessThanOrEqualTo(String value) {
            addCriterion("DCT_DOF_OBJ <=", value, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjLike(String value) {
            addCriterion("DCT_DOF_OBJ like", value, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjNotLike(String value) {
            addCriterion("DCT_DOF_OBJ not like", value, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjIn(List<String> values) {
            addCriterion("DCT_DOF_OBJ in", values, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjNotIn(List<String> values) {
            addCriterion("DCT_DOF_OBJ not in", values, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjBetween(String value1, String value2) {
            addCriterion("DCT_DOF_OBJ between", value1, value2, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctDofObjNotBetween(String value1, String value2) {
            addCriterion("DCT_DOF_OBJ not between", value1, value2, "dctDofObj");
            return (Criteria) this;
        }

        public Criteria andDctEditCardIsNull() {
            addCriterion("DCT_EDIT_CARD is null");
            return (Criteria) this;
        }

        public Criteria andDctEditCardIsNotNull() {
            addCriterion("DCT_EDIT_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andDctEditCardEqualTo(String value) {
            addCriterion("DCT_EDIT_CARD =", value, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardNotEqualTo(String value) {
            addCriterion("DCT_EDIT_CARD <>", value, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardGreaterThan(String value) {
            addCriterion("DCT_EDIT_CARD >", value, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_EDIT_CARD >=", value, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardLessThan(String value) {
            addCriterion("DCT_EDIT_CARD <", value, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardLessThanOrEqualTo(String value) {
            addCriterion("DCT_EDIT_CARD <=", value, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardLike(String value) {
            addCriterion("DCT_EDIT_CARD like", value, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardNotLike(String value) {
            addCriterion("DCT_EDIT_CARD not like", value, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardIn(List<String> values) {
            addCriterion("DCT_EDIT_CARD in", values, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardNotIn(List<String> values) {
            addCriterion("DCT_EDIT_CARD not in", values, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardBetween(String value1, String value2) {
            addCriterion("DCT_EDIT_CARD between", value1, value2, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditCardNotBetween(String value1, String value2) {
            addCriterion("DCT_EDIT_CARD not between", value1, value2, "dctEditCard");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeIsNull() {
            addCriterion("DCT_EDIT_TREE is null");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeIsNotNull() {
            addCriterion("DCT_EDIT_TREE is not null");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeEqualTo(String value) {
            addCriterion("DCT_EDIT_TREE =", value, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeNotEqualTo(String value) {
            addCriterion("DCT_EDIT_TREE <>", value, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeGreaterThan(String value) {
            addCriterion("DCT_EDIT_TREE >", value, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_EDIT_TREE >=", value, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeLessThan(String value) {
            addCriterion("DCT_EDIT_TREE <", value, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeLessThanOrEqualTo(String value) {
            addCriterion("DCT_EDIT_TREE <=", value, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeLike(String value) {
            addCriterion("DCT_EDIT_TREE like", value, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeNotLike(String value) {
            addCriterion("DCT_EDIT_TREE not like", value, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeIn(List<String> values) {
            addCriterion("DCT_EDIT_TREE in", values, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeNotIn(List<String> values) {
            addCriterion("DCT_EDIT_TREE not in", values, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeBetween(String value1, String value2) {
            addCriterion("DCT_EDIT_TREE between", value1, value2, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctEditTreeNotBetween(String value1, String value2) {
            addCriterion("DCT_EDIT_TREE not between", value1, value2, "dctEditTree");
            return (Criteria) this;
        }

        public Criteria andDctAccModeIsNull() {
            addCriterion("DCT_ACC_MODE is null");
            return (Criteria) this;
        }

        public Criteria andDctAccModeIsNotNull() {
            addCriterion("DCT_ACC_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andDctAccModeEqualTo(String value) {
            addCriterion("DCT_ACC_MODE =", value, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeNotEqualTo(String value) {
            addCriterion("DCT_ACC_MODE <>", value, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeGreaterThan(String value) {
            addCriterion("DCT_ACC_MODE >", value, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_ACC_MODE >=", value, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeLessThan(String value) {
            addCriterion("DCT_ACC_MODE <", value, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeLessThanOrEqualTo(String value) {
            addCriterion("DCT_ACC_MODE <=", value, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeLike(String value) {
            addCriterion("DCT_ACC_MODE like", value, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeNotLike(String value) {
            addCriterion("DCT_ACC_MODE not like", value, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeIn(List<String> values) {
            addCriterion("DCT_ACC_MODE in", values, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeNotIn(List<String> values) {
            addCriterion("DCT_ACC_MODE not in", values, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeBetween(String value1, String value2) {
            addCriterion("DCT_ACC_MODE between", value1, value2, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccModeNotBetween(String value1, String value2) {
            addCriterion("DCT_ACC_MODE not between", value1, value2, "dctAccMode");
            return (Criteria) this;
        }

        public Criteria andDctAccIsNull() {
            addCriterion("DCT_ACC is null");
            return (Criteria) this;
        }

        public Criteria andDctAccIsNotNull() {
            addCriterion("DCT_ACC is not null");
            return (Criteria) this;
        }

        public Criteria andDctAccEqualTo(String value) {
            addCriterion("DCT_ACC =", value, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccNotEqualTo(String value) {
            addCriterion("DCT_ACC <>", value, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccGreaterThan(String value) {
            addCriterion("DCT_ACC >", value, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_ACC >=", value, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccLessThan(String value) {
            addCriterion("DCT_ACC <", value, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccLessThanOrEqualTo(String value) {
            addCriterion("DCT_ACC <=", value, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccLike(String value) {
            addCriterion("DCT_ACC like", value, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccNotLike(String value) {
            addCriterion("DCT_ACC not like", value, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccIn(List<String> values) {
            addCriterion("DCT_ACC in", values, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccNotIn(List<String> values) {
            addCriterion("DCT_ACC not in", values, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccBetween(String value1, String value2) {
            addCriterion("DCT_ACC between", value1, value2, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctAccNotBetween(String value1, String value2) {
            addCriterion("DCT_ACC not between", value1, value2, "dctAcc");
            return (Criteria) this;
        }

        public Criteria andDctCachIsNull() {
            addCriterion("DCT_CACH is null");
            return (Criteria) this;
        }

        public Criteria andDctCachIsNotNull() {
            addCriterion("DCT_CACH is not null");
            return (Criteria) this;
        }

        public Criteria andDctCachEqualTo(String value) {
            addCriterion("DCT_CACH =", value, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachNotEqualTo(String value) {
            addCriterion("DCT_CACH <>", value, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachGreaterThan(String value) {
            addCriterion("DCT_CACH >", value, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_CACH >=", value, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachLessThan(String value) {
            addCriterion("DCT_CACH <", value, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachLessThanOrEqualTo(String value) {
            addCriterion("DCT_CACH <=", value, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachLike(String value) {
            addCriterion("DCT_CACH like", value, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachNotLike(String value) {
            addCriterion("DCT_CACH not like", value, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachIn(List<String> values) {
            addCriterion("DCT_CACH in", values, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachNotIn(List<String> values) {
            addCriterion("DCT_CACH not in", values, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachBetween(String value1, String value2) {
            addCriterion("DCT_CACH between", value1, value2, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachNotBetween(String value1, String value2) {
            addCriterion("DCT_CACH not between", value1, value2, "dctCach");
            return (Criteria) this;
        }

        public Criteria andDctCachClientIsNull() {
            addCriterion("DCT_CACH_CLIENT is null");
            return (Criteria) this;
        }

        public Criteria andDctCachClientIsNotNull() {
            addCriterion("DCT_CACH_CLIENT is not null");
            return (Criteria) this;
        }

        public Criteria andDctCachClientEqualTo(String value) {
            addCriterion("DCT_CACH_CLIENT =", value, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientNotEqualTo(String value) {
            addCriterion("DCT_CACH_CLIENT <>", value, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientGreaterThan(String value) {
            addCriterion("DCT_CACH_CLIENT >", value, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_CACH_CLIENT >=", value, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientLessThan(String value) {
            addCriterion("DCT_CACH_CLIENT <", value, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientLessThanOrEqualTo(String value) {
            addCriterion("DCT_CACH_CLIENT <=", value, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientLike(String value) {
            addCriterion("DCT_CACH_CLIENT like", value, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientNotLike(String value) {
            addCriterion("DCT_CACH_CLIENT not like", value, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientIn(List<String> values) {
            addCriterion("DCT_CACH_CLIENT in", values, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientNotIn(List<String> values) {
            addCriterion("DCT_CACH_CLIENT not in", values, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientBetween(String value1, String value2) {
            addCriterion("DCT_CACH_CLIENT between", value1, value2, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachClientNotBetween(String value1, String value2) {
            addCriterion("DCT_CACH_CLIENT not between", value1, value2, "dctCachClient");
            return (Criteria) this;
        }

        public Criteria andDctCachModeIsNull() {
            addCriterion("DCT_CACH_MODE is null");
            return (Criteria) this;
        }

        public Criteria andDctCachModeIsNotNull() {
            addCriterion("DCT_CACH_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andDctCachModeEqualTo(String value) {
            addCriterion("DCT_CACH_MODE =", value, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeNotEqualTo(String value) {
            addCriterion("DCT_CACH_MODE <>", value, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeGreaterThan(String value) {
            addCriterion("DCT_CACH_MODE >", value, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_CACH_MODE >=", value, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeLessThan(String value) {
            addCriterion("DCT_CACH_MODE <", value, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeLessThanOrEqualTo(String value) {
            addCriterion("DCT_CACH_MODE <=", value, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeLike(String value) {
            addCriterion("DCT_CACH_MODE like", value, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeNotLike(String value) {
            addCriterion("DCT_CACH_MODE not like", value, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeIn(List<String> values) {
            addCriterion("DCT_CACH_MODE in", values, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeNotIn(List<String> values) {
            addCriterion("DCT_CACH_MODE not in", values, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeBetween(String value1, String value2) {
            addCriterion("DCT_CACH_MODE between", value1, value2, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctCachModeNotBetween(String value1, String value2) {
            addCriterion("DCT_CACH_MODE not between", value1, value2, "dctCachMode");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaIsNull() {
            addCriterion("DCT_OWNER_BA is null");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaIsNotNull() {
            addCriterion("DCT_OWNER_BA is not null");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaEqualTo(String value) {
            addCriterion("DCT_OWNER_BA =", value, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaNotEqualTo(String value) {
            addCriterion("DCT_OWNER_BA <>", value, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaGreaterThan(String value) {
            addCriterion("DCT_OWNER_BA >", value, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_OWNER_BA >=", value, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaLessThan(String value) {
            addCriterion("DCT_OWNER_BA <", value, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaLessThanOrEqualTo(String value) {
            addCriterion("DCT_OWNER_BA <=", value, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaLike(String value) {
            addCriterion("DCT_OWNER_BA like", value, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaNotLike(String value) {
            addCriterion("DCT_OWNER_BA not like", value, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaIn(List<String> values) {
            addCriterion("DCT_OWNER_BA in", values, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaNotIn(List<String> values) {
            addCriterion("DCT_OWNER_BA not in", values, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaBetween(String value1, String value2) {
            addCriterion("DCT_OWNER_BA between", value1, value2, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctOwnerBaNotBetween(String value1, String value2) {
            addCriterion("DCT_OWNER_BA not between", value1, value2, "dctOwnerBa");
            return (Criteria) this;
        }

        public Criteria andDctSychIsNull() {
            addCriterion("DCT_SYCH is null");
            return (Criteria) this;
        }

        public Criteria andDctSychIsNotNull() {
            addCriterion("DCT_SYCH is not null");
            return (Criteria) this;
        }

        public Criteria andDctSychEqualTo(String value) {
            addCriterion("DCT_SYCH =", value, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychNotEqualTo(String value) {
            addCriterion("DCT_SYCH <>", value, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychGreaterThan(String value) {
            addCriterion("DCT_SYCH >", value, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_SYCH >=", value, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychLessThan(String value) {
            addCriterion("DCT_SYCH <", value, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychLessThanOrEqualTo(String value) {
            addCriterion("DCT_SYCH <=", value, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychLike(String value) {
            addCriterion("DCT_SYCH like", value, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychNotLike(String value) {
            addCriterion("DCT_SYCH not like", value, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychIn(List<String> values) {
            addCriterion("DCT_SYCH in", values, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychNotIn(List<String> values) {
            addCriterion("DCT_SYCH not in", values, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychBetween(String value1, String value2) {
            addCriterion("DCT_SYCH between", value1, value2, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychNotBetween(String value1, String value2) {
            addCriterion("DCT_SYCH not between", value1, value2, "dctSych");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleIsNull() {
            addCriterion("DCT_SYCH_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleIsNotNull() {
            addCriterion("DCT_SYCH_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleEqualTo(Integer value) {
            addCriterion("DCT_SYCH_CYCLE =", value, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleNotEqualTo(Integer value) {
            addCriterion("DCT_SYCH_CYCLE <>", value, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleGreaterThan(Integer value) {
            addCriterion("DCT_SYCH_CYCLE >", value, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCT_SYCH_CYCLE >=", value, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleLessThan(Integer value) {
            addCriterion("DCT_SYCH_CYCLE <", value, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleLessThanOrEqualTo(Integer value) {
            addCriterion("DCT_SYCH_CYCLE <=", value, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleIn(List<Integer> values) {
            addCriterion("DCT_SYCH_CYCLE in", values, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleNotIn(List<Integer> values) {
            addCriterion("DCT_SYCH_CYCLE not in", values, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleBetween(Integer value1, Integer value2) {
            addCriterion("DCT_SYCH_CYCLE between", value1, value2, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctSychCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("DCT_SYCH_CYCLE not between", value1, value2, "dctSychCycle");
            return (Criteria) this;
        }

        public Criteria andDctFltModeIsNull() {
            addCriterion("DCT_FLT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andDctFltModeIsNotNull() {
            addCriterion("DCT_FLT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andDctFltModeEqualTo(String value) {
            addCriterion("DCT_FLT_MODE =", value, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeNotEqualTo(String value) {
            addCriterion("DCT_FLT_MODE <>", value, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeGreaterThan(String value) {
            addCriterion("DCT_FLT_MODE >", value, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FLT_MODE >=", value, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeLessThan(String value) {
            addCriterion("DCT_FLT_MODE <", value, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeLessThanOrEqualTo(String value) {
            addCriterion("DCT_FLT_MODE <=", value, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeLike(String value) {
            addCriterion("DCT_FLT_MODE like", value, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeNotLike(String value) {
            addCriterion("DCT_FLT_MODE not like", value, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeIn(List<String> values) {
            addCriterion("DCT_FLT_MODE in", values, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeNotIn(List<String> values) {
            addCriterion("DCT_FLT_MODE not in", values, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeBetween(String value1, String value2) {
            addCriterion("DCT_FLT_MODE between", value1, value2, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltModeNotBetween(String value1, String value2) {
            addCriterion("DCT_FLT_MODE not between", value1, value2, "dctFltMode");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldIsNull() {
            addCriterion("DCT_FLT_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldIsNotNull() {
            addCriterion("DCT_FLT_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldEqualTo(String value) {
            addCriterion("DCT_FLT_FIELD =", value, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldNotEqualTo(String value) {
            addCriterion("DCT_FLT_FIELD <>", value, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldGreaterThan(String value) {
            addCriterion("DCT_FLT_FIELD >", value, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FLT_FIELD >=", value, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldLessThan(String value) {
            addCriterion("DCT_FLT_FIELD <", value, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldLessThanOrEqualTo(String value) {
            addCriterion("DCT_FLT_FIELD <=", value, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldLike(String value) {
            addCriterion("DCT_FLT_FIELD like", value, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldNotLike(String value) {
            addCriterion("DCT_FLT_FIELD not like", value, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldIn(List<String> values) {
            addCriterion("DCT_FLT_FIELD in", values, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldNotIn(List<String> values) {
            addCriterion("DCT_FLT_FIELD not in", values, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldBetween(String value1, String value2) {
            addCriterion("DCT_FLT_FIELD between", value1, value2, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltFieldNotBetween(String value1, String value2) {
            addCriterion("DCT_FLT_FIELD not between", value1, value2, "dctFltField");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyIsNull() {
            addCriterion("DCT_FLT_KEY is null");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyIsNotNull() {
            addCriterion("DCT_FLT_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyEqualTo(String value) {
            addCriterion("DCT_FLT_KEY =", value, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyNotEqualTo(String value) {
            addCriterion("DCT_FLT_KEY <>", value, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyGreaterThan(String value) {
            addCriterion("DCT_FLT_KEY >", value, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FLT_KEY >=", value, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyLessThan(String value) {
            addCriterion("DCT_FLT_KEY <", value, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyLessThanOrEqualTo(String value) {
            addCriterion("DCT_FLT_KEY <=", value, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyLike(String value) {
            addCriterion("DCT_FLT_KEY like", value, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyNotLike(String value) {
            addCriterion("DCT_FLT_KEY not like", value, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyIn(List<String> values) {
            addCriterion("DCT_FLT_KEY in", values, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyNotIn(List<String> values) {
            addCriterion("DCT_FLT_KEY not in", values, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyBetween(String value1, String value2) {
            addCriterion("DCT_FLT_KEY between", value1, value2, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltKeyNotBetween(String value1, String value2) {
            addCriterion("DCT_FLT_KEY not between", value1, value2, "dctFltKey");
            return (Criteria) this;
        }

        public Criteria andDctFltDctIsNull() {
            addCriterion("DCT_FLT_DCT is null");
            return (Criteria) this;
        }

        public Criteria andDctFltDctIsNotNull() {
            addCriterion("DCT_FLT_DCT is not null");
            return (Criteria) this;
        }

        public Criteria andDctFltDctEqualTo(String value) {
            addCriterion("DCT_FLT_DCT =", value, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctNotEqualTo(String value) {
            addCriterion("DCT_FLT_DCT <>", value, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctGreaterThan(String value) {
            addCriterion("DCT_FLT_DCT >", value, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_FLT_DCT >=", value, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctLessThan(String value) {
            addCriterion("DCT_FLT_DCT <", value, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctLessThanOrEqualTo(String value) {
            addCriterion("DCT_FLT_DCT <=", value, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctLike(String value) {
            addCriterion("DCT_FLT_DCT like", value, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctNotLike(String value) {
            addCriterion("DCT_FLT_DCT not like", value, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctIn(List<String> values) {
            addCriterion("DCT_FLT_DCT in", values, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctNotIn(List<String> values) {
            addCriterion("DCT_FLT_DCT not in", values, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctBetween(String value1, String value2) {
            addCriterion("DCT_FLT_DCT between", value1, value2, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctFltDctNotBetween(String value1, String value2) {
            addCriterion("DCT_FLT_DCT not between", value1, value2, "dctFltDct");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapIsNull() {
            addCriterion("DCT_ENTITYMAP is null");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapIsNotNull() {
            addCriterion("DCT_ENTITYMAP is not null");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapEqualTo(String value) {
            addCriterion("DCT_ENTITYMAP =", value, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapNotEqualTo(String value) {
            addCriterion("DCT_ENTITYMAP <>", value, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapGreaterThan(String value) {
            addCriterion("DCT_ENTITYMAP >", value, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_ENTITYMAP >=", value, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapLessThan(String value) {
            addCriterion("DCT_ENTITYMAP <", value, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapLessThanOrEqualTo(String value) {
            addCriterion("DCT_ENTITYMAP <=", value, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapLike(String value) {
            addCriterion("DCT_ENTITYMAP like", value, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapNotLike(String value) {
            addCriterion("DCT_ENTITYMAP not like", value, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapIn(List<String> values) {
            addCriterion("DCT_ENTITYMAP in", values, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapNotIn(List<String> values) {
            addCriterion("DCT_ENTITYMAP not in", values, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapBetween(String value1, String value2) {
            addCriterion("DCT_ENTITYMAP between", value1, value2, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntitymapNotBetween(String value1, String value2) {
            addCriterion("DCT_ENTITYMAP not between", value1, value2, "dctEntitymap");
            return (Criteria) this;
        }

        public Criteria andDctEntityIsNull() {
            addCriterion("DCT_ENTITY is null");
            return (Criteria) this;
        }

        public Criteria andDctEntityIsNotNull() {
            addCriterion("DCT_ENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andDctEntityEqualTo(String value) {
            addCriterion("DCT_ENTITY =", value, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityNotEqualTo(String value) {
            addCriterion("DCT_ENTITY <>", value, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityGreaterThan(String value) {
            addCriterion("DCT_ENTITY >", value, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_ENTITY >=", value, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityLessThan(String value) {
            addCriterion("DCT_ENTITY <", value, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityLessThanOrEqualTo(String value) {
            addCriterion("DCT_ENTITY <=", value, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityLike(String value) {
            addCriterion("DCT_ENTITY like", value, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityNotLike(String value) {
            addCriterion("DCT_ENTITY not like", value, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityIn(List<String> values) {
            addCriterion("DCT_ENTITY in", values, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityNotIn(List<String> values) {
            addCriterion("DCT_ENTITY not in", values, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityBetween(String value1, String value2) {
            addCriterion("DCT_ENTITY between", value1, value2, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctEntityNotBetween(String value1, String value2) {
            addCriterion("DCT_ENTITY not between", value1, value2, "dctEntity");
            return (Criteria) this;
        }

        public Criteria andDctPrefixIsNull() {
            addCriterion("DCT_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andDctPrefixIsNotNull() {
            addCriterion("DCT_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andDctPrefixEqualTo(String value) {
            addCriterion("DCT_PREFIX =", value, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixNotEqualTo(String value) {
            addCriterion("DCT_PREFIX <>", value, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixGreaterThan(String value) {
            addCriterion("DCT_PREFIX >", value, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_PREFIX >=", value, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixLessThan(String value) {
            addCriterion("DCT_PREFIX <", value, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixLessThanOrEqualTo(String value) {
            addCriterion("DCT_PREFIX <=", value, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixLike(String value) {
            addCriterion("DCT_PREFIX like", value, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixNotLike(String value) {
            addCriterion("DCT_PREFIX not like", value, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixIn(List<String> values) {
            addCriterion("DCT_PREFIX in", values, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixNotIn(List<String> values) {
            addCriterion("DCT_PREFIX not in", values, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixBetween(String value1, String value2) {
            addCriterion("DCT_PREFIX between", value1, value2, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctPrefixNotBetween(String value1, String value2) {
            addCriterion("DCT_PREFIX not between", value1, value2, "dctPrefix");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldIsNull() {
            addCriterion("DCT_BIZFIELD is null");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldIsNotNull() {
            addCriterion("DCT_BIZFIELD is not null");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldEqualTo(String value) {
            addCriterion("DCT_BIZFIELD =", value, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldNotEqualTo(String value) {
            addCriterion("DCT_BIZFIELD <>", value, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldGreaterThan(String value) {
            addCriterion("DCT_BIZFIELD >", value, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_BIZFIELD >=", value, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldLessThan(String value) {
            addCriterion("DCT_BIZFIELD <", value, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldLessThanOrEqualTo(String value) {
            addCriterion("DCT_BIZFIELD <=", value, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldLike(String value) {
            addCriterion("DCT_BIZFIELD like", value, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldNotLike(String value) {
            addCriterion("DCT_BIZFIELD not like", value, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldIn(List<String> values) {
            addCriterion("DCT_BIZFIELD in", values, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldNotIn(List<String> values) {
            addCriterion("DCT_BIZFIELD not in", values, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldBetween(String value1, String value2) {
            addCriterion("DCT_BIZFIELD between", value1, value2, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctBizfieldNotBetween(String value1, String value2) {
            addCriterion("DCT_BIZFIELD not between", value1, value2, "dctBizfield");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableIsNull() {
            addCriterion("DCT_KEY_ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableIsNotNull() {
            addCriterion("DCT_KEY_ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableEqualTo(String value) {
            addCriterion("DCT_KEY_ENABLE =", value, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableNotEqualTo(String value) {
            addCriterion("DCT_KEY_ENABLE <>", value, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableGreaterThan(String value) {
            addCriterion("DCT_KEY_ENABLE >", value, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_ENABLE >=", value, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableLessThan(String value) {
            addCriterion("DCT_KEY_ENABLE <", value, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableLessThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_ENABLE <=", value, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableLike(String value) {
            addCriterion("DCT_KEY_ENABLE like", value, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableNotLike(String value) {
            addCriterion("DCT_KEY_ENABLE not like", value, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableIn(List<String> values) {
            addCriterion("DCT_KEY_ENABLE in", values, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableNotIn(List<String> values) {
            addCriterion("DCT_KEY_ENABLE not in", values, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableBetween(String value1, String value2) {
            addCriterion("DCT_KEY_ENABLE between", value1, value2, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyEnableNotBetween(String value1, String value2) {
            addCriterion("DCT_KEY_ENABLE not between", value1, value2, "dctKeyEnable");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldIsNull() {
            addCriterion("DCT_KEY_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldIsNotNull() {
            addCriterion("DCT_KEY_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldEqualTo(String value) {
            addCriterion("DCT_KEY_FIELD =", value, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldNotEqualTo(String value) {
            addCriterion("DCT_KEY_FIELD <>", value, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldGreaterThan(String value) {
            addCriterion("DCT_KEY_FIELD >", value, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_FIELD >=", value, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldLessThan(String value) {
            addCriterion("DCT_KEY_FIELD <", value, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldLessThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_FIELD <=", value, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldLike(String value) {
            addCriterion("DCT_KEY_FIELD like", value, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldNotLike(String value) {
            addCriterion("DCT_KEY_FIELD not like", value, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldIn(List<String> values) {
            addCriterion("DCT_KEY_FIELD in", values, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldNotIn(List<String> values) {
            addCriterion("DCT_KEY_FIELD not in", values, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldBetween(String value1, String value2) {
            addCriterion("DCT_KEY_FIELD between", value1, value2, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyFieldNotBetween(String value1, String value2) {
            addCriterion("DCT_KEY_FIELD not between", value1, value2, "dctKeyField");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrIsNull() {
            addCriterion("DCT_KEY_CRTR is null");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrIsNotNull() {
            addCriterion("DCT_KEY_CRTR is not null");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrEqualTo(String value) {
            addCriterion("DCT_KEY_CRTR =", value, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrNotEqualTo(String value) {
            addCriterion("DCT_KEY_CRTR <>", value, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrGreaterThan(String value) {
            addCriterion("DCT_KEY_CRTR >", value, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_CRTR >=", value, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrLessThan(String value) {
            addCriterion("DCT_KEY_CRTR <", value, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrLessThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_CRTR <=", value, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrLike(String value) {
            addCriterion("DCT_KEY_CRTR like", value, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrNotLike(String value) {
            addCriterion("DCT_KEY_CRTR not like", value, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrIn(List<String> values) {
            addCriterion("DCT_KEY_CRTR in", values, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrNotIn(List<String> values) {
            addCriterion("DCT_KEY_CRTR not in", values, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrBetween(String value1, String value2) {
            addCriterion("DCT_KEY_CRTR between", value1, value2, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrNotBetween(String value1, String value2) {
            addCriterion("DCT_KEY_CRTR not between", value1, value2, "dctKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamIsNull() {
            addCriterion("DCT_KEY_CRTR_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamIsNotNull() {
            addCriterion("DCT_KEY_CRTR_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamEqualTo(String value) {
            addCriterion("DCT_KEY_CRTR_PARAM =", value, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamNotEqualTo(String value) {
            addCriterion("DCT_KEY_CRTR_PARAM <>", value, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamGreaterThan(String value) {
            addCriterion("DCT_KEY_CRTR_PARAM >", value, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_CRTR_PARAM >=", value, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamLessThan(String value) {
            addCriterion("DCT_KEY_CRTR_PARAM <", value, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamLessThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_CRTR_PARAM <=", value, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamLike(String value) {
            addCriterion("DCT_KEY_CRTR_PARAM like", value, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamNotLike(String value) {
            addCriterion("DCT_KEY_CRTR_PARAM not like", value, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamIn(List<String> values) {
            addCriterion("DCT_KEY_CRTR_PARAM in", values, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamNotIn(List<String> values) {
            addCriterion("DCT_KEY_CRTR_PARAM not in", values, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamBetween(String value1, String value2) {
            addCriterion("DCT_KEY_CRTR_PARAM between", value1, value2, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyCrtrParamNotBetween(String value1, String value2) {
            addCriterion("DCT_KEY_CRTR_PARAM not between", value1, value2, "dctKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeIsNull() {
            addCriterion("DCT_KEY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeIsNotNull() {
            addCriterion("DCT_KEY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeEqualTo(String value) {
            addCriterion("DCT_KEY_MODE =", value, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeNotEqualTo(String value) {
            addCriterion("DCT_KEY_MODE <>", value, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeGreaterThan(String value) {
            addCriterion("DCT_KEY_MODE >", value, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_MODE >=", value, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeLessThan(String value) {
            addCriterion("DCT_KEY_MODE <", value, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeLessThanOrEqualTo(String value) {
            addCriterion("DCT_KEY_MODE <=", value, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeLike(String value) {
            addCriterion("DCT_KEY_MODE like", value, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeNotLike(String value) {
            addCriterion("DCT_KEY_MODE not like", value, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeIn(List<String> values) {
            addCriterion("DCT_KEY_MODE in", values, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeNotIn(List<String> values) {
            addCriterion("DCT_KEY_MODE not in", values, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeBetween(String value1, String value2) {
            addCriterion("DCT_KEY_MODE between", value1, value2, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctKeyModeNotBetween(String value1, String value2) {
            addCriterion("DCT_KEY_MODE not between", value1, value2, "dctKeyMode");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoIsNull() {
            addCriterion("DCT_ID_AUTO is null");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoIsNotNull() {
            addCriterion("DCT_ID_AUTO is not null");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoEqualTo(String value) {
            addCriterion("DCT_ID_AUTO =", value, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoNotEqualTo(String value) {
            addCriterion("DCT_ID_AUTO <>", value, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoGreaterThan(String value) {
            addCriterion("DCT_ID_AUTO >", value, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_ID_AUTO >=", value, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoLessThan(String value) {
            addCriterion("DCT_ID_AUTO <", value, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoLessThanOrEqualTo(String value) {
            addCriterion("DCT_ID_AUTO <=", value, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoLike(String value) {
            addCriterion("DCT_ID_AUTO like", value, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoNotLike(String value) {
            addCriterion("DCT_ID_AUTO not like", value, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoIn(List<String> values) {
            addCriterion("DCT_ID_AUTO in", values, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoNotIn(List<String> values) {
            addCriterion("DCT_ID_AUTO not in", values, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoBetween(String value1, String value2) {
            addCriterion("DCT_ID_AUTO between", value1, value2, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctIdAutoNotBetween(String value1, String value2) {
            addCriterion("DCT_ID_AUTO not between", value1, value2, "dctIdAuto");
            return (Criteria) this;
        }

        public Criteria andDctVersionIsNull() {
            addCriterion("DCT_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andDctVersionIsNotNull() {
            addCriterion("DCT_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andDctVersionEqualTo(String value) {
            addCriterion("DCT_VERSION =", value, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionNotEqualTo(String value) {
            addCriterion("DCT_VERSION <>", value, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionGreaterThan(String value) {
            addCriterion("DCT_VERSION >", value, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_VERSION >=", value, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionLessThan(String value) {
            addCriterion("DCT_VERSION <", value, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionLessThanOrEqualTo(String value) {
            addCriterion("DCT_VERSION <=", value, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionLike(String value) {
            addCriterion("DCT_VERSION like", value, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionNotLike(String value) {
            addCriterion("DCT_VERSION not like", value, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionIn(List<String> values) {
            addCriterion("DCT_VERSION in", values, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionNotIn(List<String> values) {
            addCriterion("DCT_VERSION not in", values, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionBetween(String value1, String value2) {
            addCriterion("DCT_VERSION between", value1, value2, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctVersionNotBetween(String value1, String value2) {
            addCriterion("DCT_VERSION not between", value1, value2, "dctVersion");
            return (Criteria) this;
        }

        public Criteria andDctPhytableIsNull() {
            addCriterion("DCT_PHYTABLE is null");
            return (Criteria) this;
        }

        public Criteria andDctPhytableIsNotNull() {
            addCriterion("DCT_PHYTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andDctPhytableEqualTo(String value) {
            addCriterion("DCT_PHYTABLE =", value, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableNotEqualTo(String value) {
            addCriterion("DCT_PHYTABLE <>", value, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableGreaterThan(String value) {
            addCriterion("DCT_PHYTABLE >", value, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_PHYTABLE >=", value, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableLessThan(String value) {
            addCriterion("DCT_PHYTABLE <", value, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableLessThanOrEqualTo(String value) {
            addCriterion("DCT_PHYTABLE <=", value, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableLike(String value) {
            addCriterion("DCT_PHYTABLE like", value, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableNotLike(String value) {
            addCriterion("DCT_PHYTABLE not like", value, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableIn(List<String> values) {
            addCriterion("DCT_PHYTABLE in", values, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableNotIn(List<String> values) {
            addCriterion("DCT_PHYTABLE not in", values, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableBetween(String value1, String value2) {
            addCriterion("DCT_PHYTABLE between", value1, value2, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctPhytableNotBetween(String value1, String value2) {
            addCriterion("DCT_PHYTABLE not between", value1, value2, "dctPhytable");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelIsNull() {
            addCriterion("DCT_STARTLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelIsNotNull() {
            addCriterion("DCT_STARTLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelEqualTo(Integer value) {
            addCriterion("DCT_STARTLEVEL =", value, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelNotEqualTo(Integer value) {
            addCriterion("DCT_STARTLEVEL <>", value, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelGreaterThan(Integer value) {
            addCriterion("DCT_STARTLEVEL >", value, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("DCT_STARTLEVEL >=", value, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelLessThan(Integer value) {
            addCriterion("DCT_STARTLEVEL <", value, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelLessThanOrEqualTo(Integer value) {
            addCriterion("DCT_STARTLEVEL <=", value, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelIn(List<Integer> values) {
            addCriterion("DCT_STARTLEVEL in", values, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelNotIn(List<Integer> values) {
            addCriterion("DCT_STARTLEVEL not in", values, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelBetween(Integer value1, Integer value2) {
            addCriterion("DCT_STARTLEVEL between", value1, value2, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctStartlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("DCT_STARTLEVEL not between", value1, value2, "dctStartlevel");
            return (Criteria) this;
        }

        public Criteria andDctExpRightIsNull() {
            addCriterion("DCT_EXP_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andDctExpRightIsNotNull() {
            addCriterion("DCT_EXP_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andDctExpRightEqualTo(String value) {
            addCriterion("DCT_EXP_RIGHT =", value, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightNotEqualTo(String value) {
            addCriterion("DCT_EXP_RIGHT <>", value, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightGreaterThan(String value) {
            addCriterion("DCT_EXP_RIGHT >", value, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightGreaterThanOrEqualTo(String value) {
            addCriterion("DCT_EXP_RIGHT >=", value, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightLessThan(String value) {
            addCriterion("DCT_EXP_RIGHT <", value, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightLessThanOrEqualTo(String value) {
            addCriterion("DCT_EXP_RIGHT <=", value, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightLike(String value) {
            addCriterion("DCT_EXP_RIGHT like", value, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightNotLike(String value) {
            addCriterion("DCT_EXP_RIGHT not like", value, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightIn(List<String> values) {
            addCriterion("DCT_EXP_RIGHT in", values, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightNotIn(List<String> values) {
            addCriterion("DCT_EXP_RIGHT not in", values, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightBetween(String value1, String value2) {
            addCriterion("DCT_EXP_RIGHT between", value1, value2, "dctExpRight");
            return (Criteria) this;
        }

        public Criteria andDctExpRightNotBetween(String value1, String value2) {
            addCriterion("DCT_EXP_RIGHT not between", value1, value2, "dctExpRight");
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