package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SysFuncExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysFuncExample() {
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

        public Criteria andFBhEqualTo(Integer value) {
            addCriterion("F_BH =", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhNotEqualTo(Integer value) {
            addCriterion("F_BH <>", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhGreaterThan(Integer value) {
            addCriterion("F_BH >", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_BH >=", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhLessThan(Integer value) {
            addCriterion("F_BH <", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhLessThanOrEqualTo(Integer value) {
            addCriterion("F_BH <=", value, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhIn(List<Integer> values) {
            addCriterion("F_BH in", values, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhNotIn(List<Integer> values) {
            addCriterion("F_BH not in", values, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhBetween(Integer value1, Integer value2) {
            addCriterion("F_BH between", value1, value2, "fBh");
            return (Criteria) this;
        }

        public Criteria andFBhNotBetween(Integer value1, Integer value2) {
            addCriterion("F_BH not between", value1, value2, "fBh");
            return (Criteria) this;
        }

        public Criteria andFMcIsNull() {
            addCriterion("f_mc is null");
            return (Criteria) this;
        }

        public Criteria andFMcIsNotNull() {
            addCriterion("f_mc is not null");
            return (Criteria) this;
        }

        public Criteria andFMcEqualTo(String value) {
            addCriterion("f_mc =", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcNotEqualTo(String value) {
            addCriterion("f_mc <>", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcGreaterThan(String value) {
            addCriterion("f_mc >", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcGreaterThanOrEqualTo(String value) {
            addCriterion("f_mc >=", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcLessThan(String value) {
            addCriterion("f_mc <", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcLessThanOrEqualTo(String value) {
            addCriterion("f_mc <=", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcLike(String value) {
            addCriterion("f_mc like", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcNotLike(String value) {
            addCriterion("f_mc not like", value, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcIn(List<String> values) {
            addCriterion("f_mc in", values, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcNotIn(List<String> values) {
            addCriterion("f_mc not in", values, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcBetween(String value1, String value2) {
            addCriterion("f_mc between", value1, value2, "fMc");
            return (Criteria) this;
        }

        public Criteria andFMcNotBetween(String value1, String value2) {
            addCriterion("f_mc not between", value1, value2, "fMc");
            return (Criteria) this;
        }

        public Criteria andFJsIsNull() {
            addCriterion("f_js is null");
            return (Criteria) this;
        }

        public Criteria andFJsIsNotNull() {
            addCriterion("f_js is not null");
            return (Criteria) this;
        }

        public Criteria andFJsEqualTo(Integer value) {
            addCriterion("f_js =", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsNotEqualTo(Integer value) {
            addCriterion("f_js <>", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsGreaterThan(Integer value) {
            addCriterion("f_js >", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_js >=", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsLessThan(Integer value) {
            addCriterion("f_js <", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsLessThanOrEqualTo(Integer value) {
            addCriterion("f_js <=", value, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsIn(List<Integer> values) {
            addCriterion("f_js in", values, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsNotIn(List<Integer> values) {
            addCriterion("f_js not in", values, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsBetween(Integer value1, Integer value2) {
            addCriterion("f_js between", value1, value2, "fJs");
            return (Criteria) this;
        }

        public Criteria andFJsNotBetween(Integer value1, Integer value2) {
            addCriterion("f_js not between", value1, value2, "fJs");
            return (Criteria) this;
        }

        public Criteria andFMxIsNull() {
            addCriterion("f_mx is null");
            return (Criteria) this;
        }

        public Criteria andFMxIsNotNull() {
            addCriterion("f_mx is not null");
            return (Criteria) this;
        }

        public Criteria andFMxEqualTo(String value) {
            addCriterion("f_mx =", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxNotEqualTo(String value) {
            addCriterion("f_mx <>", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxGreaterThan(String value) {
            addCriterion("f_mx >", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxGreaterThanOrEqualTo(String value) {
            addCriterion("f_mx >=", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxLessThan(String value) {
            addCriterion("f_mx <", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxLessThanOrEqualTo(String value) {
            addCriterion("f_mx <=", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxLike(String value) {
            addCriterion("f_mx like", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxNotLike(String value) {
            addCriterion("f_mx not like", value, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxIn(List<String> values) {
            addCriterion("f_mx in", values, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxNotIn(List<String> values) {
            addCriterion("f_mx not in", values, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxBetween(String value1, String value2) {
            addCriterion("f_mx between", value1, value2, "fMx");
            return (Criteria) this;
        }

        public Criteria andFMxNotBetween(String value1, String value2) {
            addCriterion("f_mx not between", value1, value2, "fMx");
            return (Criteria) this;
        }

        public Criteria andFTextIsNull() {
            addCriterion("f_text is null");
            return (Criteria) this;
        }

        public Criteria andFTextIsNotNull() {
            addCriterion("f_text is not null");
            return (Criteria) this;
        }

        public Criteria andFTextEqualTo(String value) {
            addCriterion("f_text =", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextNotEqualTo(String value) {
            addCriterion("f_text <>", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextGreaterThan(String value) {
            addCriterion("f_text >", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextGreaterThanOrEqualTo(String value) {
            addCriterion("f_text >=", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextLessThan(String value) {
            addCriterion("f_text <", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextLessThanOrEqualTo(String value) {
            addCriterion("f_text <=", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextLike(String value) {
            addCriterion("f_text like", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextNotLike(String value) {
            addCriterion("f_text not like", value, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextIn(List<String> values) {
            addCriterion("f_text in", values, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextNotIn(List<String> values) {
            addCriterion("f_text not in", values, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextBetween(String value1, String value2) {
            addCriterion("f_text between", value1, value2, "fText");
            return (Criteria) this;
        }

        public Criteria andFTextNotBetween(String value1, String value2) {
            addCriterion("f_text not between", value1, value2, "fText");
            return (Criteria) this;
        }

        public Criteria andFIconIsNull() {
            addCriterion("f_icon is null");
            return (Criteria) this;
        }

        public Criteria andFIconIsNotNull() {
            addCriterion("f_icon is not null");
            return (Criteria) this;
        }

        public Criteria andFIconEqualTo(String value) {
            addCriterion("f_icon =", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotEqualTo(String value) {
            addCriterion("f_icon <>", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconGreaterThan(String value) {
            addCriterion("f_icon >", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconGreaterThanOrEqualTo(String value) {
            addCriterion("f_icon >=", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLessThan(String value) {
            addCriterion("f_icon <", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLessThanOrEqualTo(String value) {
            addCriterion("f_icon <=", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconLike(String value) {
            addCriterion("f_icon like", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotLike(String value) {
            addCriterion("f_icon not like", value, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconIn(List<String> values) {
            addCriterion("f_icon in", values, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotIn(List<String> values) {
            addCriterion("f_icon not in", values, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconBetween(String value1, String value2) {
            addCriterion("f_icon between", value1, value2, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFIconNotBetween(String value1, String value2) {
            addCriterion("f_icon not between", value1, value2, "fIcon");
            return (Criteria) this;
        }

        public Criteria andFImageIsNull() {
            addCriterion("f_image is null");
            return (Criteria) this;
        }

        public Criteria andFImageIsNotNull() {
            addCriterion("f_image is not null");
            return (Criteria) this;
        }

        public Criteria andFImageEqualTo(String value) {
            addCriterion("f_image =", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageNotEqualTo(String value) {
            addCriterion("f_image <>", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageGreaterThan(String value) {
            addCriterion("f_image >", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageGreaterThanOrEqualTo(String value) {
            addCriterion("f_image >=", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageLessThan(String value) {
            addCriterion("f_image <", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageLessThanOrEqualTo(String value) {
            addCriterion("f_image <=", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageLike(String value) {
            addCriterion("f_image like", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageNotLike(String value) {
            addCriterion("f_image not like", value, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageIn(List<String> values) {
            addCriterion("f_image in", values, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageNotIn(List<String> values) {
            addCriterion("f_image not in", values, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageBetween(String value1, String value2) {
            addCriterion("f_image between", value1, value2, "fImage");
            return (Criteria) this;
        }

        public Criteria andFImageNotBetween(String value1, String value2) {
            addCriterion("f_image not between", value1, value2, "fImage");
            return (Criteria) this;
        }

        public Criteria andFAppIdIsNull() {
            addCriterion("f_app_id is null");
            return (Criteria) this;
        }

        public Criteria andFAppIdIsNotNull() {
            addCriterion("f_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andFAppIdEqualTo(String value) {
            addCriterion("f_app_id =", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdNotEqualTo(String value) {
            addCriterion("f_app_id <>", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdGreaterThan(String value) {
            addCriterion("f_app_id >", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_app_id >=", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdLessThan(String value) {
            addCriterion("f_app_id <", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdLessThanOrEqualTo(String value) {
            addCriterion("f_app_id <=", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdLike(String value) {
            addCriterion("f_app_id like", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdNotLike(String value) {
            addCriterion("f_app_id not like", value, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdIn(List<String> values) {
            addCriterion("f_app_id in", values, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdNotIn(List<String> values) {
            addCriterion("f_app_id not in", values, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdBetween(String value1, String value2) {
            addCriterion("f_app_id between", value1, value2, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFAppIdNotBetween(String value1, String value2) {
            addCriterion("f_app_id not between", value1, value2, "fAppId");
            return (Criteria) this;
        }

        public Criteria andFUrlIsNull() {
            addCriterion("f_url is null");
            return (Criteria) this;
        }

        public Criteria andFUrlIsNotNull() {
            addCriterion("f_url is not null");
            return (Criteria) this;
        }

        public Criteria andFUrlEqualTo(String value) {
            addCriterion("f_url =", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotEqualTo(String value) {
            addCriterion("f_url <>", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlGreaterThan(String value) {
            addCriterion("f_url >", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlGreaterThanOrEqualTo(String value) {
            addCriterion("f_url >=", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLessThan(String value) {
            addCriterion("f_url <", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLessThanOrEqualTo(String value) {
            addCriterion("f_url <=", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlLike(String value) {
            addCriterion("f_url like", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotLike(String value) {
            addCriterion("f_url not like", value, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlIn(List<String> values) {
            addCriterion("f_url in", values, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotIn(List<String> values) {
            addCriterion("f_url not in", values, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlBetween(String value1, String value2) {
            addCriterion("f_url between", value1, value2, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFUrlNotBetween(String value1, String value2) {
            addCriterion("f_url not between", value1, value2, "fUrl");
            return (Criteria) this;
        }

        public Criteria andFParentIsNull() {
            addCriterion("f_parent is null");
            return (Criteria) this;
        }

        public Criteria andFParentIsNotNull() {
            addCriterion("f_parent is not null");
            return (Criteria) this;
        }

        public Criteria andFParentEqualTo(String value) {
            addCriterion("f_parent =", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentNotEqualTo(String value) {
            addCriterion("f_parent <>", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentGreaterThan(String value) {
            addCriterion("f_parent >", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentGreaterThanOrEqualTo(String value) {
            addCriterion("f_parent >=", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentLessThan(String value) {
            addCriterion("f_parent <", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentLessThanOrEqualTo(String value) {
            addCriterion("f_parent <=", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentLike(String value) {
            addCriterion("f_parent like", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentNotLike(String value) {
            addCriterion("f_parent not like", value, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentIn(List<String> values) {
            addCriterion("f_parent in", values, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentNotIn(List<String> values) {
            addCriterion("f_parent not in", values, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentBetween(String value1, String value2) {
            addCriterion("f_parent between", value1, value2, "fParent");
            return (Criteria) this;
        }

        public Criteria andFParentNotBetween(String value1, String value2) {
            addCriterion("f_parent not between", value1, value2, "fParent");
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

        public Criteria andFP1IdIsNull() {
            addCriterion("f_p1_id is null");
            return (Criteria) this;
        }

        public Criteria andFP1IdIsNotNull() {
            addCriterion("f_p1_id is not null");
            return (Criteria) this;
        }

        public Criteria andFP1IdEqualTo(String value) {
            addCriterion("f_p1_id =", value, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdNotEqualTo(String value) {
            addCriterion("f_p1_id <>", value, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdGreaterThan(String value) {
            addCriterion("f_p1_id >", value, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdGreaterThanOrEqualTo(String value) {
            addCriterion("f_p1_id >=", value, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdLessThan(String value) {
            addCriterion("f_p1_id <", value, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdLessThanOrEqualTo(String value) {
            addCriterion("f_p1_id <=", value, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdLike(String value) {
            addCriterion("f_p1_id like", value, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdNotLike(String value) {
            addCriterion("f_p1_id not like", value, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdIn(List<String> values) {
            addCriterion("f_p1_id in", values, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdNotIn(List<String> values) {
            addCriterion("f_p1_id not in", values, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdBetween(String value1, String value2) {
            addCriterion("f_p1_id between", value1, value2, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1IdNotBetween(String value1, String value2) {
            addCriterion("f_p1_id not between", value1, value2, "fP1Id");
            return (Criteria) this;
        }

        public Criteria andFP1ValueIsNull() {
            addCriterion("f_p1_value is null");
            return (Criteria) this;
        }

        public Criteria andFP1ValueIsNotNull() {
            addCriterion("f_p1_value is not null");
            return (Criteria) this;
        }

        public Criteria andFP1ValueEqualTo(String value) {
            addCriterion("f_p1_value =", value, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueNotEqualTo(String value) {
            addCriterion("f_p1_value <>", value, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueGreaterThan(String value) {
            addCriterion("f_p1_value >", value, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueGreaterThanOrEqualTo(String value) {
            addCriterion("f_p1_value >=", value, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueLessThan(String value) {
            addCriterion("f_p1_value <", value, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueLessThanOrEqualTo(String value) {
            addCriterion("f_p1_value <=", value, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueLike(String value) {
            addCriterion("f_p1_value like", value, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueNotLike(String value) {
            addCriterion("f_p1_value not like", value, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueIn(List<String> values) {
            addCriterion("f_p1_value in", values, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueNotIn(List<String> values) {
            addCriterion("f_p1_value not in", values, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueBetween(String value1, String value2) {
            addCriterion("f_p1_value between", value1, value2, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP1ValueNotBetween(String value1, String value2) {
            addCriterion("f_p1_value not between", value1, value2, "fP1Value");
            return (Criteria) this;
        }

        public Criteria andFP2IdIsNull() {
            addCriterion("f_p2_id is null");
            return (Criteria) this;
        }

        public Criteria andFP2IdIsNotNull() {
            addCriterion("f_p2_id is not null");
            return (Criteria) this;
        }

        public Criteria andFP2IdEqualTo(String value) {
            addCriterion("f_p2_id =", value, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdNotEqualTo(String value) {
            addCriterion("f_p2_id <>", value, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdGreaterThan(String value) {
            addCriterion("f_p2_id >", value, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdGreaterThanOrEqualTo(String value) {
            addCriterion("f_p2_id >=", value, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdLessThan(String value) {
            addCriterion("f_p2_id <", value, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdLessThanOrEqualTo(String value) {
            addCriterion("f_p2_id <=", value, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdLike(String value) {
            addCriterion("f_p2_id like", value, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdNotLike(String value) {
            addCriterion("f_p2_id not like", value, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdIn(List<String> values) {
            addCriterion("f_p2_id in", values, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdNotIn(List<String> values) {
            addCriterion("f_p2_id not in", values, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdBetween(String value1, String value2) {
            addCriterion("f_p2_id between", value1, value2, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2IdNotBetween(String value1, String value2) {
            addCriterion("f_p2_id not between", value1, value2, "fP2Id");
            return (Criteria) this;
        }

        public Criteria andFP2ValueIsNull() {
            addCriterion("f_p2_value is null");
            return (Criteria) this;
        }

        public Criteria andFP2ValueIsNotNull() {
            addCriterion("f_p2_value is not null");
            return (Criteria) this;
        }

        public Criteria andFP2ValueEqualTo(String value) {
            addCriterion("f_p2_value =", value, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueNotEqualTo(String value) {
            addCriterion("f_p2_value <>", value, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueGreaterThan(String value) {
            addCriterion("f_p2_value >", value, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueGreaterThanOrEqualTo(String value) {
            addCriterion("f_p2_value >=", value, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueLessThan(String value) {
            addCriterion("f_p2_value <", value, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueLessThanOrEqualTo(String value) {
            addCriterion("f_p2_value <=", value, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueLike(String value) {
            addCriterion("f_p2_value like", value, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueNotLike(String value) {
            addCriterion("f_p2_value not like", value, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueIn(List<String> values) {
            addCriterion("f_p2_value in", values, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueNotIn(List<String> values) {
            addCriterion("f_p2_value not in", values, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueBetween(String value1, String value2) {
            addCriterion("f_p2_value between", value1, value2, "fP2Value");
            return (Criteria) this;
        }

        public Criteria andFP2ValueNotBetween(String value1, String value2) {
            addCriterion("f_p2_value not between", value1, value2, "fP2Value");
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