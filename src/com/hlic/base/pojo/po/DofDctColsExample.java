package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class DofDctColsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DofDctColsExample() {
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

        public Criteria andColPkIsNull() {
            addCriterion("COL_PK is null");
            return (Criteria) this;
        }

        public Criteria andColPkIsNotNull() {
            addCriterion("COL_PK is not null");
            return (Criteria) this;
        }

        public Criteria andColPkEqualTo(String value) {
            addCriterion("COL_PK =", value, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkNotEqualTo(String value) {
            addCriterion("COL_PK <>", value, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkGreaterThan(String value) {
            addCriterion("COL_PK >", value, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkGreaterThanOrEqualTo(String value) {
            addCriterion("COL_PK >=", value, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkLessThan(String value) {
            addCriterion("COL_PK <", value, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkLessThanOrEqualTo(String value) {
            addCriterion("COL_PK <=", value, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkLike(String value) {
            addCriterion("COL_PK like", value, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkNotLike(String value) {
            addCriterion("COL_PK not like", value, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkIn(List<String> values) {
            addCriterion("COL_PK in", values, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkNotIn(List<String> values) {
            addCriterion("COL_PK not in", values, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkBetween(String value1, String value2) {
            addCriterion("COL_PK between", value1, value2, "colPk");
            return (Criteria) this;
        }

        public Criteria andColPkNotBetween(String value1, String value2) {
            addCriterion("COL_PK not between", value1, value2, "colPk");
            return (Criteria) this;
        }

        public Criteria andColDispOrderIsNull() {
            addCriterion("COL_DISP_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andColDispOrderIsNotNull() {
            addCriterion("COL_DISP_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andColDispOrderEqualTo(Integer value) {
            addCriterion("COL_DISP_ORDER =", value, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderNotEqualTo(Integer value) {
            addCriterion("COL_DISP_ORDER <>", value, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderGreaterThan(Integer value) {
            addCriterion("COL_DISP_ORDER >", value, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("COL_DISP_ORDER >=", value, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderLessThan(Integer value) {
            addCriterion("COL_DISP_ORDER <", value, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("COL_DISP_ORDER <=", value, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderIn(List<Integer> values) {
            addCriterion("COL_DISP_ORDER in", values, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderNotIn(List<Integer> values) {
            addCriterion("COL_DISP_ORDER not in", values, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("COL_DISP_ORDER between", value1, value2, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("COL_DISP_ORDER not between", value1, value2, "colDispOrder");
            return (Criteria) this;
        }

        public Criteria andColIdIsNull() {
            addCriterion("COL_ID is null");
            return (Criteria) this;
        }

        public Criteria andColIdIsNotNull() {
            addCriterion("COL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andColIdEqualTo(String value) {
            addCriterion("COL_ID =", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotEqualTo(String value) {
            addCriterion("COL_ID <>", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThan(String value) {
            addCriterion("COL_ID >", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdGreaterThanOrEqualTo(String value) {
            addCriterion("COL_ID >=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThan(String value) {
            addCriterion("COL_ID <", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLessThanOrEqualTo(String value) {
            addCriterion("COL_ID <=", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdLike(String value) {
            addCriterion("COL_ID like", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotLike(String value) {
            addCriterion("COL_ID not like", value, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdIn(List<String> values) {
            addCriterion("COL_ID in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotIn(List<String> values) {
            addCriterion("COL_ID not in", values, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdBetween(String value1, String value2) {
            addCriterion("COL_ID between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColIdNotBetween(String value1, String value2) {
            addCriterion("COL_ID not between", value1, value2, "colId");
            return (Criteria) this;
        }

        public Criteria andColFkDctIsNull() {
            addCriterion("COL_FK_DCT is null");
            return (Criteria) this;
        }

        public Criteria andColFkDctIsNotNull() {
            addCriterion("COL_FK_DCT is not null");
            return (Criteria) this;
        }

        public Criteria andColFkDctEqualTo(String value) {
            addCriterion("COL_FK_DCT =", value, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctNotEqualTo(String value) {
            addCriterion("COL_FK_DCT <>", value, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctGreaterThan(String value) {
            addCriterion("COL_FK_DCT >", value, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctGreaterThanOrEqualTo(String value) {
            addCriterion("COL_FK_DCT >=", value, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctLessThan(String value) {
            addCriterion("COL_FK_DCT <", value, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctLessThanOrEqualTo(String value) {
            addCriterion("COL_FK_DCT <=", value, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctLike(String value) {
            addCriterion("COL_FK_DCT like", value, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctNotLike(String value) {
            addCriterion("COL_FK_DCT not like", value, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctIn(List<String> values) {
            addCriterion("COL_FK_DCT in", values, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctNotIn(List<String> values) {
            addCriterion("COL_FK_DCT not in", values, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctBetween(String value1, String value2) {
            addCriterion("COL_FK_DCT between", value1, value2, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColFkDctNotBetween(String value1, String value2) {
            addCriterion("COL_FK_DCT not between", value1, value2, "colFkDct");
            return (Criteria) this;
        }

        public Criteria andColAppTypeIsNull() {
            addCriterion("COL_APP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andColAppTypeIsNotNull() {
            addCriterion("COL_APP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andColAppTypeEqualTo(String value) {
            addCriterion("COL_APP_TYPE =", value, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeNotEqualTo(String value) {
            addCriterion("COL_APP_TYPE <>", value, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeGreaterThan(String value) {
            addCriterion("COL_APP_TYPE >", value, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COL_APP_TYPE >=", value, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeLessThan(String value) {
            addCriterion("COL_APP_TYPE <", value, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeLessThanOrEqualTo(String value) {
            addCriterion("COL_APP_TYPE <=", value, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeLike(String value) {
            addCriterion("COL_APP_TYPE like", value, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeNotLike(String value) {
            addCriterion("COL_APP_TYPE not like", value, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeIn(List<String> values) {
            addCriterion("COL_APP_TYPE in", values, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeNotIn(List<String> values) {
            addCriterion("COL_APP_TYPE not in", values, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeBetween(String value1, String value2) {
            addCriterion("COL_APP_TYPE between", value1, value2, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColAppTypeNotBetween(String value1, String value2) {
            addCriterion("COL_APP_TYPE not between", value1, value2, "colAppType");
            return (Criteria) this;
        }

        public Criteria andColFkAccessIsNull() {
            addCriterion("COL_FK_ACCESS is null");
            return (Criteria) this;
        }

        public Criteria andColFkAccessIsNotNull() {
            addCriterion("COL_FK_ACCESS is not null");
            return (Criteria) this;
        }

        public Criteria andColFkAccessEqualTo(String value) {
            addCriterion("COL_FK_ACCESS =", value, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessNotEqualTo(String value) {
            addCriterion("COL_FK_ACCESS <>", value, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessGreaterThan(String value) {
            addCriterion("COL_FK_ACCESS >", value, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessGreaterThanOrEqualTo(String value) {
            addCriterion("COL_FK_ACCESS >=", value, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessLessThan(String value) {
            addCriterion("COL_FK_ACCESS <", value, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessLessThanOrEqualTo(String value) {
            addCriterion("COL_FK_ACCESS <=", value, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessLike(String value) {
            addCriterion("COL_FK_ACCESS like", value, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessNotLike(String value) {
            addCriterion("COL_FK_ACCESS not like", value, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessIn(List<String> values) {
            addCriterion("COL_FK_ACCESS in", values, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessNotIn(List<String> values) {
            addCriterion("COL_FK_ACCESS not in", values, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessBetween(String value1, String value2) {
            addCriterion("COL_FK_ACCESS between", value1, value2, "colFkAccess");
            return (Criteria) this;
        }

        public Criteria andColFkAccessNotBetween(String value1, String value2) {
            addCriterion("COL_FK_ACCESS not between", value1, value2, "colFkAccess");
            return (Criteria) this;
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

        public Criteria andColFkIsNull() {
            addCriterion("COL_FK is null");
            return (Criteria) this;
        }

        public Criteria andColFkIsNotNull() {
            addCriterion("COL_FK is not null");
            return (Criteria) this;
        }

        public Criteria andColFkEqualTo(String value) {
            addCriterion("COL_FK =", value, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkNotEqualTo(String value) {
            addCriterion("COL_FK <>", value, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkGreaterThan(String value) {
            addCriterion("COL_FK >", value, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkGreaterThanOrEqualTo(String value) {
            addCriterion("COL_FK >=", value, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkLessThan(String value) {
            addCriterion("COL_FK <", value, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkLessThanOrEqualTo(String value) {
            addCriterion("COL_FK <=", value, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkLike(String value) {
            addCriterion("COL_FK like", value, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkNotLike(String value) {
            addCriterion("COL_FK not like", value, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkIn(List<String> values) {
            addCriterion("COL_FK in", values, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkNotIn(List<String> values) {
            addCriterion("COL_FK not in", values, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkBetween(String value1, String value2) {
            addCriterion("COL_FK between", value1, value2, "colFk");
            return (Criteria) this;
        }

        public Criteria andColFkNotBetween(String value1, String value2) {
            addCriterion("COL_FK not between", value1, value2, "colFk");
            return (Criteria) this;
        }

        public Criteria andColShowmaskIsNull() {
            addCriterion("COL_SHOWMASK is null");
            return (Criteria) this;
        }

        public Criteria andColShowmaskIsNotNull() {
            addCriterion("COL_SHOWMASK is not null");
            return (Criteria) this;
        }

        public Criteria andColShowmaskEqualTo(String value) {
            addCriterion("COL_SHOWMASK =", value, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskNotEqualTo(String value) {
            addCriterion("COL_SHOWMASK <>", value, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskGreaterThan(String value) {
            addCriterion("COL_SHOWMASK >", value, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskGreaterThanOrEqualTo(String value) {
            addCriterion("COL_SHOWMASK >=", value, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskLessThan(String value) {
            addCriterion("COL_SHOWMASK <", value, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskLessThanOrEqualTo(String value) {
            addCriterion("COL_SHOWMASK <=", value, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskLike(String value) {
            addCriterion("COL_SHOWMASK like", value, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskNotLike(String value) {
            addCriterion("COL_SHOWMASK not like", value, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskIn(List<String> values) {
            addCriterion("COL_SHOWMASK in", values, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskNotIn(List<String> values) {
            addCriterion("COL_SHOWMASK not in", values, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskBetween(String value1, String value2) {
            addCriterion("COL_SHOWMASK between", value1, value2, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColShowmaskNotBetween(String value1, String value2) {
            addCriterion("COL_SHOWMASK not between", value1, value2, "colShowmask");
            return (Criteria) this;
        }

        public Criteria andColCaptionIsNull() {
            addCriterion("COL_CAPTION is null");
            return (Criteria) this;
        }

        public Criteria andColCaptionIsNotNull() {
            addCriterion("COL_CAPTION is not null");
            return (Criteria) this;
        }

        public Criteria andColCaptionEqualTo(String value) {
            addCriterion("COL_CAPTION =", value, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionNotEqualTo(String value) {
            addCriterion("COL_CAPTION <>", value, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionGreaterThan(String value) {
            addCriterion("COL_CAPTION >", value, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("COL_CAPTION >=", value, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionLessThan(String value) {
            addCriterion("COL_CAPTION <", value, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionLessThanOrEqualTo(String value) {
            addCriterion("COL_CAPTION <=", value, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionLike(String value) {
            addCriterion("COL_CAPTION like", value, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionNotLike(String value) {
            addCriterion("COL_CAPTION not like", value, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionIn(List<String> values) {
            addCriterion("COL_CAPTION in", values, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionNotIn(List<String> values) {
            addCriterion("COL_CAPTION not in", values, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionBetween(String value1, String value2) {
            addCriterion("COL_CAPTION between", value1, value2, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColCaptionNotBetween(String value1, String value2) {
            addCriterion("COL_CAPTION not between", value1, value2, "colCaption");
            return (Criteria) this;
        }

        public Criteria andColEditmaskIsNull() {
            addCriterion("COL_EDITMASK is null");
            return (Criteria) this;
        }

        public Criteria andColEditmaskIsNotNull() {
            addCriterion("COL_EDITMASK is not null");
            return (Criteria) this;
        }

        public Criteria andColEditmaskEqualTo(String value) {
            addCriterion("COL_EDITMASK =", value, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskNotEqualTo(String value) {
            addCriterion("COL_EDITMASK <>", value, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskGreaterThan(String value) {
            addCriterion("COL_EDITMASK >", value, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskGreaterThanOrEqualTo(String value) {
            addCriterion("COL_EDITMASK >=", value, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskLessThan(String value) {
            addCriterion("COL_EDITMASK <", value, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskLessThanOrEqualTo(String value) {
            addCriterion("COL_EDITMASK <=", value, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskLike(String value) {
            addCriterion("COL_EDITMASK like", value, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskNotLike(String value) {
            addCriterion("COL_EDITMASK not like", value, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskIn(List<String> values) {
            addCriterion("COL_EDITMASK in", values, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskNotIn(List<String> values) {
            addCriterion("COL_EDITMASK not in", values, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskBetween(String value1, String value2) {
            addCriterion("COL_EDITMASK between", value1, value2, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditmaskNotBetween(String value1, String value2) {
            addCriterion("COL_EDITMASK not between", value1, value2, "colEditmask");
            return (Criteria) this;
        }

        public Criteria andColEditStyleIsNull() {
            addCriterion("COL_EDIT_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andColEditStyleIsNotNull() {
            addCriterion("COL_EDIT_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andColEditStyleEqualTo(String value) {
            addCriterion("COL_EDIT_STYLE =", value, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleNotEqualTo(String value) {
            addCriterion("COL_EDIT_STYLE <>", value, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleGreaterThan(String value) {
            addCriterion("COL_EDIT_STYLE >", value, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleGreaterThanOrEqualTo(String value) {
            addCriterion("COL_EDIT_STYLE >=", value, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleLessThan(String value) {
            addCriterion("COL_EDIT_STYLE <", value, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleLessThanOrEqualTo(String value) {
            addCriterion("COL_EDIT_STYLE <=", value, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleLike(String value) {
            addCriterion("COL_EDIT_STYLE like", value, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleNotLike(String value) {
            addCriterion("COL_EDIT_STYLE not like", value, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleIn(List<String> values) {
            addCriterion("COL_EDIT_STYLE in", values, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleNotIn(List<String> values) {
            addCriterion("COL_EDIT_STYLE not in", values, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleBetween(String value1, String value2) {
            addCriterion("COL_EDIT_STYLE between", value1, value2, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColEditStyleNotBetween(String value1, String value2) {
            addCriterion("COL_EDIT_STYLE not between", value1, value2, "colEditStyle");
            return (Criteria) this;
        }

        public Criteria andColTitleIsNull() {
            addCriterion("COL_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andColTitleIsNotNull() {
            addCriterion("COL_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andColTitleEqualTo(String value) {
            addCriterion("COL_TITLE =", value, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleNotEqualTo(String value) {
            addCriterion("COL_TITLE <>", value, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleGreaterThan(String value) {
            addCriterion("COL_TITLE >", value, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleGreaterThanOrEqualTo(String value) {
            addCriterion("COL_TITLE >=", value, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleLessThan(String value) {
            addCriterion("COL_TITLE <", value, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleLessThanOrEqualTo(String value) {
            addCriterion("COL_TITLE <=", value, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleLike(String value) {
            addCriterion("COL_TITLE like", value, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleNotLike(String value) {
            addCriterion("COL_TITLE not like", value, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleIn(List<String> values) {
            addCriterion("COL_TITLE in", values, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleNotIn(List<String> values) {
            addCriterion("COL_TITLE not in", values, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleBetween(String value1, String value2) {
            addCriterion("COL_TITLE between", value1, value2, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColTitleNotBetween(String value1, String value2) {
            addCriterion("COL_TITLE not between", value1, value2, "colTitle");
            return (Criteria) this;
        }

        public Criteria andColUseIsNull() {
            addCriterion("COL_USE is null");
            return (Criteria) this;
        }

        public Criteria andColUseIsNotNull() {
            addCriterion("COL_USE is not null");
            return (Criteria) this;
        }

        public Criteria andColUseEqualTo(String value) {
            addCriterion("COL_USE =", value, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseNotEqualTo(String value) {
            addCriterion("COL_USE <>", value, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseGreaterThan(String value) {
            addCriterion("COL_USE >", value, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseGreaterThanOrEqualTo(String value) {
            addCriterion("COL_USE >=", value, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseLessThan(String value) {
            addCriterion("COL_USE <", value, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseLessThanOrEqualTo(String value) {
            addCriterion("COL_USE <=", value, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseLike(String value) {
            addCriterion("COL_USE like", value, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseNotLike(String value) {
            addCriterion("COL_USE not like", value, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseIn(List<String> values) {
            addCriterion("COL_USE in", values, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseNotIn(List<String> values) {
            addCriterion("COL_USE not in", values, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseBetween(String value1, String value2) {
            addCriterion("COL_USE between", value1, value2, "colUse");
            return (Criteria) this;
        }

        public Criteria andColUseNotBetween(String value1, String value2) {
            addCriterion("COL_USE not between", value1, value2, "colUse");
            return (Criteria) this;
        }

        public Criteria andColInterIsNull() {
            addCriterion("COL_INTER is null");
            return (Criteria) this;
        }

        public Criteria andColInterIsNotNull() {
            addCriterion("COL_INTER is not null");
            return (Criteria) this;
        }

        public Criteria andColInterEqualTo(String value) {
            addCriterion("COL_INTER =", value, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterNotEqualTo(String value) {
            addCriterion("COL_INTER <>", value, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterGreaterThan(String value) {
            addCriterion("COL_INTER >", value, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterGreaterThanOrEqualTo(String value) {
            addCriterion("COL_INTER >=", value, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterLessThan(String value) {
            addCriterion("COL_INTER <", value, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterLessThanOrEqualTo(String value) {
            addCriterion("COL_INTER <=", value, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterLike(String value) {
            addCriterion("COL_INTER like", value, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterNotLike(String value) {
            addCriterion("COL_INTER not like", value, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterIn(List<String> values) {
            addCriterion("COL_INTER in", values, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterNotIn(List<String> values) {
            addCriterion("COL_INTER not in", values, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterBetween(String value1, String value2) {
            addCriterion("COL_INTER between", value1, value2, "colInter");
            return (Criteria) this;
        }

        public Criteria andColInterNotBetween(String value1, String value2) {
            addCriterion("COL_INTER not between", value1, value2, "colInter");
            return (Criteria) this;
        }

        public Criteria andColVisibleIsNull() {
            addCriterion("COL_VISIBLE is null");
            return (Criteria) this;
        }

        public Criteria andColVisibleIsNotNull() {
            addCriterion("COL_VISIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andColVisibleEqualTo(String value) {
            addCriterion("COL_VISIBLE =", value, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleNotEqualTo(String value) {
            addCriterion("COL_VISIBLE <>", value, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleGreaterThan(String value) {
            addCriterion("COL_VISIBLE >", value, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleGreaterThanOrEqualTo(String value) {
            addCriterion("COL_VISIBLE >=", value, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleLessThan(String value) {
            addCriterion("COL_VISIBLE <", value, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleLessThanOrEqualTo(String value) {
            addCriterion("COL_VISIBLE <=", value, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleLike(String value) {
            addCriterion("COL_VISIBLE like", value, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleNotLike(String value) {
            addCriterion("COL_VISIBLE not like", value, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleIn(List<String> values) {
            addCriterion("COL_VISIBLE in", values, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleNotIn(List<String> values) {
            addCriterion("COL_VISIBLE not in", values, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleBetween(String value1, String value2) {
            addCriterion("COL_VISIBLE between", value1, value2, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColVisibleNotBetween(String value1, String value2) {
            addCriterion("COL_VISIBLE not between", value1, value2, "colVisible");
            return (Criteria) this;
        }

        public Criteria andColDefaultIsNull() {
            addCriterion("COL_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andColDefaultIsNotNull() {
            addCriterion("COL_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andColDefaultEqualTo(String value) {
            addCriterion("COL_DEFAULT =", value, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultNotEqualTo(String value) {
            addCriterion("COL_DEFAULT <>", value, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultGreaterThan(String value) {
            addCriterion("COL_DEFAULT >", value, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("COL_DEFAULT >=", value, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultLessThan(String value) {
            addCriterion("COL_DEFAULT <", value, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultLessThanOrEqualTo(String value) {
            addCriterion("COL_DEFAULT <=", value, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultLike(String value) {
            addCriterion("COL_DEFAULT like", value, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultNotLike(String value) {
            addCriterion("COL_DEFAULT not like", value, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultIn(List<String> values) {
            addCriterion("COL_DEFAULT in", values, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultNotIn(List<String> values) {
            addCriterion("COL_DEFAULT not in", values, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultBetween(String value1, String value2) {
            addCriterion("COL_DEFAULT between", value1, value2, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColDefaultNotBetween(String value1, String value2) {
            addCriterion("COL_DEFAULT not between", value1, value2, "colDefault");
            return (Criteria) this;
        }

        public Criteria andColNullIsNull() {
            addCriterion("COL_NULL is null");
            return (Criteria) this;
        }

        public Criteria andColNullIsNotNull() {
            addCriterion("COL_NULL is not null");
            return (Criteria) this;
        }

        public Criteria andColNullEqualTo(String value) {
            addCriterion("COL_NULL =", value, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullNotEqualTo(String value) {
            addCriterion("COL_NULL <>", value, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullGreaterThan(String value) {
            addCriterion("COL_NULL >", value, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullGreaterThanOrEqualTo(String value) {
            addCriterion("COL_NULL >=", value, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullLessThan(String value) {
            addCriterion("COL_NULL <", value, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullLessThanOrEqualTo(String value) {
            addCriterion("COL_NULL <=", value, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullLike(String value) {
            addCriterion("COL_NULL like", value, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullNotLike(String value) {
            addCriterion("COL_NULL not like", value, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullIn(List<String> values) {
            addCriterion("COL_NULL in", values, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullNotIn(List<String> values) {
            addCriterion("COL_NULL not in", values, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullBetween(String value1, String value2) {
            addCriterion("COL_NULL between", value1, value2, "colNull");
            return (Criteria) this;
        }

        public Criteria andColNullNotBetween(String value1, String value2) {
            addCriterion("COL_NULL not between", value1, value2, "colNull");
            return (Criteria) this;
        }

        public Criteria andColShowSizeIsNull() {
            addCriterion("COL_SHOW_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andColShowSizeIsNotNull() {
            addCriterion("COL_SHOW_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andColShowSizeEqualTo(Float value) {
            addCriterion("COL_SHOW_SIZE =", value, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeNotEqualTo(Float value) {
            addCriterion("COL_SHOW_SIZE <>", value, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeGreaterThan(Float value) {
            addCriterion("COL_SHOW_SIZE >", value, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeGreaterThanOrEqualTo(Float value) {
            addCriterion("COL_SHOW_SIZE >=", value, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeLessThan(Float value) {
            addCriterion("COL_SHOW_SIZE <", value, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeLessThanOrEqualTo(Float value) {
            addCriterion("COL_SHOW_SIZE <=", value, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeIn(List<Float> values) {
            addCriterion("COL_SHOW_SIZE in", values, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeNotIn(List<Float> values) {
            addCriterion("COL_SHOW_SIZE not in", values, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeBetween(Float value1, Float value2) {
            addCriterion("COL_SHOW_SIZE between", value1, value2, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColShowSizeNotBetween(Float value1, Float value2) {
            addCriterion("COL_SHOW_SIZE not between", value1, value2, "colShowSize");
            return (Criteria) this;
        }

        public Criteria andColCalcIsNull() {
            addCriterion("COL_CALC is null");
            return (Criteria) this;
        }

        public Criteria andColCalcIsNotNull() {
            addCriterion("COL_CALC is not null");
            return (Criteria) this;
        }

        public Criteria andColCalcEqualTo(String value) {
            addCriterion("COL_CALC =", value, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcNotEqualTo(String value) {
            addCriterion("COL_CALC <>", value, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcGreaterThan(String value) {
            addCriterion("COL_CALC >", value, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcGreaterThanOrEqualTo(String value) {
            addCriterion("COL_CALC >=", value, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcLessThan(String value) {
            addCriterion("COL_CALC <", value, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcLessThanOrEqualTo(String value) {
            addCriterion("COL_CALC <=", value, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcLike(String value) {
            addCriterion("COL_CALC like", value, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcNotLike(String value) {
            addCriterion("COL_CALC not like", value, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcIn(List<String> values) {
            addCriterion("COL_CALC in", values, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcNotIn(List<String> values) {
            addCriterion("COL_CALC not in", values, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcBetween(String value1, String value2) {
            addCriterion("COL_CALC between", value1, value2, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColCalcNotBetween(String value1, String value2) {
            addCriterion("COL_CALC not between", value1, value2, "colCalc");
            return (Criteria) this;
        }

        public Criteria andColExpIsNull() {
            addCriterion("COL_EXP is null");
            return (Criteria) this;
        }

        public Criteria andColExpIsNotNull() {
            addCriterion("COL_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andColExpEqualTo(String value) {
            addCriterion("COL_EXP =", value, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpNotEqualTo(String value) {
            addCriterion("COL_EXP <>", value, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpGreaterThan(String value) {
            addCriterion("COL_EXP >", value, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpGreaterThanOrEqualTo(String value) {
            addCriterion("COL_EXP >=", value, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpLessThan(String value) {
            addCriterion("COL_EXP <", value, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpLessThanOrEqualTo(String value) {
            addCriterion("COL_EXP <=", value, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpLike(String value) {
            addCriterion("COL_EXP like", value, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpNotLike(String value) {
            addCriterion("COL_EXP not like", value, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpIn(List<String> values) {
            addCriterion("COL_EXP in", values, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpNotIn(List<String> values) {
            addCriterion("COL_EXP not in", values, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpBetween(String value1, String value2) {
            addCriterion("COL_EXP between", value1, value2, "colExp");
            return (Criteria) this;
        }

        public Criteria andColExpNotBetween(String value1, String value2) {
            addCriterion("COL_EXP not between", value1, value2, "colExp");
            return (Criteria) this;
        }

        public Criteria andColVtIsNull() {
            addCriterion("COL_VT is null");
            return (Criteria) this;
        }

        public Criteria andColVtIsNotNull() {
            addCriterion("COL_VT is not null");
            return (Criteria) this;
        }

        public Criteria andColVtEqualTo(String value) {
            addCriterion("COL_VT =", value, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtNotEqualTo(String value) {
            addCriterion("COL_VT <>", value, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtGreaterThan(String value) {
            addCriterion("COL_VT >", value, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtGreaterThanOrEqualTo(String value) {
            addCriterion("COL_VT >=", value, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtLessThan(String value) {
            addCriterion("COL_VT <", value, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtLessThanOrEqualTo(String value) {
            addCriterion("COL_VT <=", value, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtLike(String value) {
            addCriterion("COL_VT like", value, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtNotLike(String value) {
            addCriterion("COL_VT not like", value, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtIn(List<String> values) {
            addCriterion("COL_VT in", values, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtNotIn(List<String> values) {
            addCriterion("COL_VT not in", values, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtBetween(String value1, String value2) {
            addCriterion("COL_VT between", value1, value2, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtNotBetween(String value1, String value2) {
            addCriterion("COL_VT not between", value1, value2, "colVt");
            return (Criteria) this;
        }

        public Criteria andColVtRefIsNull() {
            addCriterion("COL_VT_REF is null");
            return (Criteria) this;
        }

        public Criteria andColVtRefIsNotNull() {
            addCriterion("COL_VT_REF is not null");
            return (Criteria) this;
        }

        public Criteria andColVtRefEqualTo(String value) {
            addCriterion("COL_VT_REF =", value, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefNotEqualTo(String value) {
            addCriterion("COL_VT_REF <>", value, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefGreaterThan(String value) {
            addCriterion("COL_VT_REF >", value, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefGreaterThanOrEqualTo(String value) {
            addCriterion("COL_VT_REF >=", value, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefLessThan(String value) {
            addCriterion("COL_VT_REF <", value, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefLessThanOrEqualTo(String value) {
            addCriterion("COL_VT_REF <=", value, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefLike(String value) {
            addCriterion("COL_VT_REF like", value, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefNotLike(String value) {
            addCriterion("COL_VT_REF not like", value, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefIn(List<String> values) {
            addCriterion("COL_VT_REF in", values, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefNotIn(List<String> values) {
            addCriterion("COL_VT_REF not in", values, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefBetween(String value1, String value2) {
            addCriterion("COL_VT_REF between", value1, value2, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefNotBetween(String value1, String value2) {
            addCriterion("COL_VT_REF not between", value1, value2, "colVtRef");
            return (Criteria) this;
        }

        public Criteria andColVtRefColIsNull() {
            addCriterion("COL_VT_REF_COL is null");
            return (Criteria) this;
        }

        public Criteria andColVtRefColIsNotNull() {
            addCriterion("COL_VT_REF_COL is not null");
            return (Criteria) this;
        }

        public Criteria andColVtRefColEqualTo(String value) {
            addCriterion("COL_VT_REF_COL =", value, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColNotEqualTo(String value) {
            addCriterion("COL_VT_REF_COL <>", value, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColGreaterThan(String value) {
            addCriterion("COL_VT_REF_COL >", value, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColGreaterThanOrEqualTo(String value) {
            addCriterion("COL_VT_REF_COL >=", value, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColLessThan(String value) {
            addCriterion("COL_VT_REF_COL <", value, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColLessThanOrEqualTo(String value) {
            addCriterion("COL_VT_REF_COL <=", value, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColLike(String value) {
            addCriterion("COL_VT_REF_COL like", value, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColNotLike(String value) {
            addCriterion("COL_VT_REF_COL not like", value, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColIn(List<String> values) {
            addCriterion("COL_VT_REF_COL in", values, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColNotIn(List<String> values) {
            addCriterion("COL_VT_REF_COL not in", values, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColBetween(String value1, String value2) {
            addCriterion("COL_VT_REF_COL between", value1, value2, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefColNotBetween(String value1, String value2) {
            addCriterion("COL_VT_REF_COL not between", value1, value2, "colVtRefCol");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrIsNull() {
            addCriterion("COL_VT_REF_ATTR is null");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrIsNotNull() {
            addCriterion("COL_VT_REF_ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrEqualTo(String value) {
            addCriterion("COL_VT_REF_ATTR =", value, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrNotEqualTo(String value) {
            addCriterion("COL_VT_REF_ATTR <>", value, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrGreaterThan(String value) {
            addCriterion("COL_VT_REF_ATTR >", value, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrGreaterThanOrEqualTo(String value) {
            addCriterion("COL_VT_REF_ATTR >=", value, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrLessThan(String value) {
            addCriterion("COL_VT_REF_ATTR <", value, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrLessThanOrEqualTo(String value) {
            addCriterion("COL_VT_REF_ATTR <=", value, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrLike(String value) {
            addCriterion("COL_VT_REF_ATTR like", value, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrNotLike(String value) {
            addCriterion("COL_VT_REF_ATTR not like", value, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrIn(List<String> values) {
            addCriterion("COL_VT_REF_ATTR in", values, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrNotIn(List<String> values) {
            addCriterion("COL_VT_REF_ATTR not in", values, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrBetween(String value1, String value2) {
            addCriterion("COL_VT_REF_ATTR between", value1, value2, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColVtRefAttrNotBetween(String value1, String value2) {
            addCriterion("COL_VT_REF_ATTR not between", value1, value2, "colVtRefAttr");
            return (Criteria) this;
        }

        public Criteria andColValiIsNull() {
            addCriterion("COL_VALI is null");
            return (Criteria) this;
        }

        public Criteria andColValiIsNotNull() {
            addCriterion("COL_VALI is not null");
            return (Criteria) this;
        }

        public Criteria andColValiEqualTo(String value) {
            addCriterion("COL_VALI =", value, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiNotEqualTo(String value) {
            addCriterion("COL_VALI <>", value, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiGreaterThan(String value) {
            addCriterion("COL_VALI >", value, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiGreaterThanOrEqualTo(String value) {
            addCriterion("COL_VALI >=", value, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiLessThan(String value) {
            addCriterion("COL_VALI <", value, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiLessThanOrEqualTo(String value) {
            addCriterion("COL_VALI <=", value, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiLike(String value) {
            addCriterion("COL_VALI like", value, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiNotLike(String value) {
            addCriterion("COL_VALI not like", value, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiIn(List<String> values) {
            addCriterion("COL_VALI in", values, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiNotIn(List<String> values) {
            addCriterion("COL_VALI not in", values, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiBetween(String value1, String value2) {
            addCriterion("COL_VALI between", value1, value2, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiNotBetween(String value1, String value2) {
            addCriterion("COL_VALI not between", value1, value2, "colVali");
            return (Criteria) this;
        }

        public Criteria andColValiExpIsNull() {
            addCriterion("COL_VALI_EXP is null");
            return (Criteria) this;
        }

        public Criteria andColValiExpIsNotNull() {
            addCriterion("COL_VALI_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andColValiExpEqualTo(String value) {
            addCriterion("COL_VALI_EXP =", value, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpNotEqualTo(String value) {
            addCriterion("COL_VALI_EXP <>", value, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpGreaterThan(String value) {
            addCriterion("COL_VALI_EXP >", value, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpGreaterThanOrEqualTo(String value) {
            addCriterion("COL_VALI_EXP >=", value, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpLessThan(String value) {
            addCriterion("COL_VALI_EXP <", value, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpLessThanOrEqualTo(String value) {
            addCriterion("COL_VALI_EXP <=", value, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpLike(String value) {
            addCriterion("COL_VALI_EXP like", value, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpNotLike(String value) {
            addCriterion("COL_VALI_EXP not like", value, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpIn(List<String> values) {
            addCriterion("COL_VALI_EXP in", values, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpNotIn(List<String> values) {
            addCriterion("COL_VALI_EXP not in", values, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpBetween(String value1, String value2) {
            addCriterion("COL_VALI_EXP between", value1, value2, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiExpNotBetween(String value1, String value2) {
            addCriterion("COL_VALI_EXP not between", value1, value2, "colValiExp");
            return (Criteria) this;
        }

        public Criteria andColValiMsgIsNull() {
            addCriterion("COL_VALI_MSG is null");
            return (Criteria) this;
        }

        public Criteria andColValiMsgIsNotNull() {
            addCriterion("COL_VALI_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andColValiMsgEqualTo(String value) {
            addCriterion("COL_VALI_MSG =", value, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgNotEqualTo(String value) {
            addCriterion("COL_VALI_MSG <>", value, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgGreaterThan(String value) {
            addCriterion("COL_VALI_MSG >", value, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgGreaterThanOrEqualTo(String value) {
            addCriterion("COL_VALI_MSG >=", value, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgLessThan(String value) {
            addCriterion("COL_VALI_MSG <", value, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgLessThanOrEqualTo(String value) {
            addCriterion("COL_VALI_MSG <=", value, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgLike(String value) {
            addCriterion("COL_VALI_MSG like", value, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgNotLike(String value) {
            addCriterion("COL_VALI_MSG not like", value, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgIn(List<String> values) {
            addCriterion("COL_VALI_MSG in", values, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgNotIn(List<String> values) {
            addCriterion("COL_VALI_MSG not in", values, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgBetween(String value1, String value2) {
            addCriterion("COL_VALI_MSG between", value1, value2, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColValiMsgNotBetween(String value1, String value2) {
            addCriterion("COL_VALI_MSG not between", value1, value2, "colValiMsg");
            return (Criteria) this;
        }

        public Criteria andColRegIsNull() {
            addCriterion("COL_REG is null");
            return (Criteria) this;
        }

        public Criteria andColRegIsNotNull() {
            addCriterion("COL_REG is not null");
            return (Criteria) this;
        }

        public Criteria andColRegEqualTo(String value) {
            addCriterion("COL_REG =", value, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegNotEqualTo(String value) {
            addCriterion("COL_REG <>", value, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegGreaterThan(String value) {
            addCriterion("COL_REG >", value, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegGreaterThanOrEqualTo(String value) {
            addCriterion("COL_REG >=", value, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegLessThan(String value) {
            addCriterion("COL_REG <", value, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegLessThanOrEqualTo(String value) {
            addCriterion("COL_REG <=", value, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegLike(String value) {
            addCriterion("COL_REG like", value, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegNotLike(String value) {
            addCriterion("COL_REG not like", value, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegIn(List<String> values) {
            addCriterion("COL_REG in", values, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegNotIn(List<String> values) {
            addCriterion("COL_REG not in", values, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegBetween(String value1, String value2) {
            addCriterion("COL_REG between", value1, value2, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegNotBetween(String value1, String value2) {
            addCriterion("COL_REG not between", value1, value2, "colReg");
            return (Criteria) this;
        }

        public Criteria andColRegExpIsNull() {
            addCriterion("COL_REG_EXP is null");
            return (Criteria) this;
        }

        public Criteria andColRegExpIsNotNull() {
            addCriterion("COL_REG_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andColRegExpEqualTo(String value) {
            addCriterion("COL_REG_EXP =", value, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpNotEqualTo(String value) {
            addCriterion("COL_REG_EXP <>", value, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpGreaterThan(String value) {
            addCriterion("COL_REG_EXP >", value, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpGreaterThanOrEqualTo(String value) {
            addCriterion("COL_REG_EXP >=", value, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpLessThan(String value) {
            addCriterion("COL_REG_EXP <", value, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpLessThanOrEqualTo(String value) {
            addCriterion("COL_REG_EXP <=", value, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpLike(String value) {
            addCriterion("COL_REG_EXP like", value, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpNotLike(String value) {
            addCriterion("COL_REG_EXP not like", value, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpIn(List<String> values) {
            addCriterion("COL_REG_EXP in", values, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpNotIn(List<String> values) {
            addCriterion("COL_REG_EXP not in", values, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpBetween(String value1, String value2) {
            addCriterion("COL_REG_EXP between", value1, value2, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegExpNotBetween(String value1, String value2) {
            addCriterion("COL_REG_EXP not between", value1, value2, "colRegExp");
            return (Criteria) this;
        }

        public Criteria andColRegMsgIsNull() {
            addCriterion("COL_REG_MSG is null");
            return (Criteria) this;
        }

        public Criteria andColRegMsgIsNotNull() {
            addCriterion("COL_REG_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andColRegMsgEqualTo(String value) {
            addCriterion("COL_REG_MSG =", value, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgNotEqualTo(String value) {
            addCriterion("COL_REG_MSG <>", value, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgGreaterThan(String value) {
            addCriterion("COL_REG_MSG >", value, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgGreaterThanOrEqualTo(String value) {
            addCriterion("COL_REG_MSG >=", value, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgLessThan(String value) {
            addCriterion("COL_REG_MSG <", value, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgLessThanOrEqualTo(String value) {
            addCriterion("COL_REG_MSG <=", value, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgLike(String value) {
            addCriterion("COL_REG_MSG like", value, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgNotLike(String value) {
            addCriterion("COL_REG_MSG not like", value, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgIn(List<String> values) {
            addCriterion("COL_REG_MSG in", values, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgNotIn(List<String> values) {
            addCriterion("COL_REG_MSG not in", values, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgBetween(String value1, String value2) {
            addCriterion("COL_REG_MSG between", value1, value2, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColRegMsgNotBetween(String value1, String value2) {
            addCriterion("COL_REG_MSG not between", value1, value2, "colRegMsg");
            return (Criteria) this;
        }

        public Criteria andColEditableIsNull() {
            addCriterion("COL_EDITABLE is null");
            return (Criteria) this;
        }

        public Criteria andColEditableIsNotNull() {
            addCriterion("COL_EDITABLE is not null");
            return (Criteria) this;
        }

        public Criteria andColEditableEqualTo(String value) {
            addCriterion("COL_EDITABLE =", value, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableNotEqualTo(String value) {
            addCriterion("COL_EDITABLE <>", value, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableGreaterThan(String value) {
            addCriterion("COL_EDITABLE >", value, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableGreaterThanOrEqualTo(String value) {
            addCriterion("COL_EDITABLE >=", value, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableLessThan(String value) {
            addCriterion("COL_EDITABLE <", value, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableLessThanOrEqualTo(String value) {
            addCriterion("COL_EDITABLE <=", value, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableLike(String value) {
            addCriterion("COL_EDITABLE like", value, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableNotLike(String value) {
            addCriterion("COL_EDITABLE not like", value, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableIn(List<String> values) {
            addCriterion("COL_EDITABLE in", values, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableNotIn(List<String> values) {
            addCriterion("COL_EDITABLE not in", values, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableBetween(String value1, String value2) {
            addCriterion("COL_EDITABLE between", value1, value2, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColEditableNotBetween(String value1, String value2) {
            addCriterion("COL_EDITABLE not between", value1, value2, "colEditable");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeIsNull() {
            addCriterion("COL_ELEMENT_TYPE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeIsNotNull() {
            addCriterion("COL_ELEMENT_TYPE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeEqualTo(String value) {
            addCriterion("COL_ELEMENT_TYPE_MODE =", value, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeNotEqualTo(String value) {
            addCriterion("COL_ELEMENT_TYPE_MODE <>", value, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeGreaterThan(String value) {
            addCriterion("COL_ELEMENT_TYPE_MODE >", value, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeGreaterThanOrEqualTo(String value) {
            addCriterion("COL_ELEMENT_TYPE_MODE >=", value, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeLessThan(String value) {
            addCriterion("COL_ELEMENT_TYPE_MODE <", value, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeLessThanOrEqualTo(String value) {
            addCriterion("COL_ELEMENT_TYPE_MODE <=", value, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeLike(String value) {
            addCriterion("COL_ELEMENT_TYPE_MODE like", value, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeNotLike(String value) {
            addCriterion("COL_ELEMENT_TYPE_MODE not like", value, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeIn(List<String> values) {
            addCriterion("COL_ELEMENT_TYPE_MODE in", values, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeNotIn(List<String> values) {
            addCriterion("COL_ELEMENT_TYPE_MODE not in", values, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeBetween(String value1, String value2) {
            addCriterion("COL_ELEMENT_TYPE_MODE between", value1, value2, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeModeNotBetween(String value1, String value2) {
            addCriterion("COL_ELEMENT_TYPE_MODE not between", value1, value2, "colElementTypeMode");
            return (Criteria) this;
        }

        public Criteria andColElementTypeIsNull() {
            addCriterion("COL_ELEMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andColElementTypeIsNotNull() {
            addCriterion("COL_ELEMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andColElementTypeEqualTo(String value) {
            addCriterion("COL_ELEMENT_TYPE =", value, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeNotEqualTo(String value) {
            addCriterion("COL_ELEMENT_TYPE <>", value, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeGreaterThan(String value) {
            addCriterion("COL_ELEMENT_TYPE >", value, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COL_ELEMENT_TYPE >=", value, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeLessThan(String value) {
            addCriterion("COL_ELEMENT_TYPE <", value, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeLessThanOrEqualTo(String value) {
            addCriterion("COL_ELEMENT_TYPE <=", value, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeLike(String value) {
            addCriterion("COL_ELEMENT_TYPE like", value, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeNotLike(String value) {
            addCriterion("COL_ELEMENT_TYPE not like", value, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeIn(List<String> values) {
            addCriterion("COL_ELEMENT_TYPE in", values, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeNotIn(List<String> values) {
            addCriterion("COL_ELEMENT_TYPE not in", values, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeBetween(String value1, String value2) {
            addCriterion("COL_ELEMENT_TYPE between", value1, value2, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColElementTypeNotBetween(String value1, String value2) {
            addCriterion("COL_ELEMENT_TYPE not between", value1, value2, "colElementType");
            return (Criteria) this;
        }

        public Criteria andColEnumIsNull() {
            addCriterion("COL_ENUM is null");
            return (Criteria) this;
        }

        public Criteria andColEnumIsNotNull() {
            addCriterion("COL_ENUM is not null");
            return (Criteria) this;
        }

        public Criteria andColEnumEqualTo(String value) {
            addCriterion("COL_ENUM =", value, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumNotEqualTo(String value) {
            addCriterion("COL_ENUM <>", value, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumGreaterThan(String value) {
            addCriterion("COL_ENUM >", value, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumGreaterThanOrEqualTo(String value) {
            addCriterion("COL_ENUM >=", value, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumLessThan(String value) {
            addCriterion("COL_ENUM <", value, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumLessThanOrEqualTo(String value) {
            addCriterion("COL_ENUM <=", value, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumLike(String value) {
            addCriterion("COL_ENUM like", value, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumNotLike(String value) {
            addCriterion("COL_ENUM not like", value, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumIn(List<String> values) {
            addCriterion("COL_ENUM in", values, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumNotIn(List<String> values) {
            addCriterion("COL_ENUM not in", values, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumBetween(String value1, String value2) {
            addCriterion("COL_ENUM between", value1, value2, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumNotBetween(String value1, String value2) {
            addCriterion("COL_ENUM not between", value1, value2, "colEnum");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyIsNull() {
            addCriterion("COL_ENUM_KEY is null");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyIsNotNull() {
            addCriterion("COL_ENUM_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyEqualTo(String value) {
            addCriterion("COL_ENUM_KEY =", value, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyNotEqualTo(String value) {
            addCriterion("COL_ENUM_KEY <>", value, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyGreaterThan(String value) {
            addCriterion("COL_ENUM_KEY >", value, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyGreaterThanOrEqualTo(String value) {
            addCriterion("COL_ENUM_KEY >=", value, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyLessThan(String value) {
            addCriterion("COL_ENUM_KEY <", value, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyLessThanOrEqualTo(String value) {
            addCriterion("COL_ENUM_KEY <=", value, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyLike(String value) {
            addCriterion("COL_ENUM_KEY like", value, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyNotLike(String value) {
            addCriterion("COL_ENUM_KEY not like", value, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyIn(List<String> values) {
            addCriterion("COL_ENUM_KEY in", values, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyNotIn(List<String> values) {
            addCriterion("COL_ENUM_KEY not in", values, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyBetween(String value1, String value2) {
            addCriterion("COL_ENUM_KEY between", value1, value2, "colEnumKey");
            return (Criteria) this;
        }

        public Criteria andColEnumKeyNotBetween(String value1, String value2) {
            addCriterion("COL_ENUM_KEY not between", value1, value2, "colEnumKey");
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