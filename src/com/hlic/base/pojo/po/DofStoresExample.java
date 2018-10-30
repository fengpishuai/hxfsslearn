package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class DofStoresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DofStoresExample() {
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

        public Criteria andStoIdIsNull() {
            addCriterion("STO_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoIdIsNotNull() {
            addCriterion("STO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoIdEqualTo(String value) {
            addCriterion("STO_ID =", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotEqualTo(String value) {
            addCriterion("STO_ID <>", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThan(String value) {
            addCriterion("STO_ID >", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdGreaterThanOrEqualTo(String value) {
            addCriterion("STO_ID >=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThan(String value) {
            addCriterion("STO_ID <", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLessThanOrEqualTo(String value) {
            addCriterion("STO_ID <=", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdLike(String value) {
            addCriterion("STO_ID like", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotLike(String value) {
            addCriterion("STO_ID not like", value, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdIn(List<String> values) {
            addCriterion("STO_ID in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotIn(List<String> values) {
            addCriterion("STO_ID not in", values, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdBetween(String value1, String value2) {
            addCriterion("STO_ID between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoIdNotBetween(String value1, String value2) {
            addCriterion("STO_ID not between", value1, value2, "stoId");
            return (Criteria) this;
        }

        public Criteria andStoCaptionIsNull() {
            addCriterion("STO_CAPTION is null");
            return (Criteria) this;
        }

        public Criteria andStoCaptionIsNotNull() {
            addCriterion("STO_CAPTION is not null");
            return (Criteria) this;
        }

        public Criteria andStoCaptionEqualTo(String value) {
            addCriterion("STO_CAPTION =", value, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionNotEqualTo(String value) {
            addCriterion("STO_CAPTION <>", value, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionGreaterThan(String value) {
            addCriterion("STO_CAPTION >", value, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("STO_CAPTION >=", value, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionLessThan(String value) {
            addCriterion("STO_CAPTION <", value, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionLessThanOrEqualTo(String value) {
            addCriterion("STO_CAPTION <=", value, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionLike(String value) {
            addCriterion("STO_CAPTION like", value, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionNotLike(String value) {
            addCriterion("STO_CAPTION not like", value, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionIn(List<String> values) {
            addCriterion("STO_CAPTION in", values, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionNotIn(List<String> values) {
            addCriterion("STO_CAPTION not in", values, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionBetween(String value1, String value2) {
            addCriterion("STO_CAPTION between", value1, value2, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoCaptionNotBetween(String value1, String value2) {
            addCriterion("STO_CAPTION not between", value1, value2, "stoCaption");
            return (Criteria) this;
        }

        public Criteria andStoIconIsNull() {
            addCriterion("STO_ICON is null");
            return (Criteria) this;
        }

        public Criteria andStoIconIsNotNull() {
            addCriterion("STO_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andStoIconEqualTo(String value) {
            addCriterion("STO_ICON =", value, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconNotEqualTo(String value) {
            addCriterion("STO_ICON <>", value, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconGreaterThan(String value) {
            addCriterion("STO_ICON >", value, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconGreaterThanOrEqualTo(String value) {
            addCriterion("STO_ICON >=", value, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconLessThan(String value) {
            addCriterion("STO_ICON <", value, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconLessThanOrEqualTo(String value) {
            addCriterion("STO_ICON <=", value, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconLike(String value) {
            addCriterion("STO_ICON like", value, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconNotLike(String value) {
            addCriterion("STO_ICON not like", value, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconIn(List<String> values) {
            addCriterion("STO_ICON in", values, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconNotIn(List<String> values) {
            addCriterion("STO_ICON not in", values, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconBetween(String value1, String value2) {
            addCriterion("STO_ICON between", value1, value2, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoIconNotBetween(String value1, String value2) {
            addCriterion("STO_ICON not between", value1, value2, "stoIcon");
            return (Criteria) this;
        }

        public Criteria andStoInterIsNull() {
            addCriterion("STO_INTER is null");
            return (Criteria) this;
        }

        public Criteria andStoInterIsNotNull() {
            addCriterion("STO_INTER is not null");
            return (Criteria) this;
        }

        public Criteria andStoInterEqualTo(String value) {
            addCriterion("STO_INTER =", value, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterNotEqualTo(String value) {
            addCriterion("STO_INTER <>", value, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterGreaterThan(String value) {
            addCriterion("STO_INTER >", value, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterGreaterThanOrEqualTo(String value) {
            addCriterion("STO_INTER >=", value, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterLessThan(String value) {
            addCriterion("STO_INTER <", value, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterLessThanOrEqualTo(String value) {
            addCriterion("STO_INTER <=", value, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterLike(String value) {
            addCriterion("STO_INTER like", value, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterNotLike(String value) {
            addCriterion("STO_INTER not like", value, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterIn(List<String> values) {
            addCriterion("STO_INTER in", values, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterNotIn(List<String> values) {
            addCriterion("STO_INTER not in", values, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterBetween(String value1, String value2) {
            addCriterion("STO_INTER between", value1, value2, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoInterNotBetween(String value1, String value2) {
            addCriterion("STO_INTER not between", value1, value2, "stoInter");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldIsNull() {
            addCriterion("STO_KEY_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldIsNotNull() {
            addCriterion("STO_KEY_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldEqualTo(String value) {
            addCriterion("STO_KEY_FIELD =", value, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldNotEqualTo(String value) {
            addCriterion("STO_KEY_FIELD <>", value, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldGreaterThan(String value) {
            addCriterion("STO_KEY_FIELD >", value, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldGreaterThanOrEqualTo(String value) {
            addCriterion("STO_KEY_FIELD >=", value, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldLessThan(String value) {
            addCriterion("STO_KEY_FIELD <", value, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldLessThanOrEqualTo(String value) {
            addCriterion("STO_KEY_FIELD <=", value, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldLike(String value) {
            addCriterion("STO_KEY_FIELD like", value, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldNotLike(String value) {
            addCriterion("STO_KEY_FIELD not like", value, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldIn(List<String> values) {
            addCriterion("STO_KEY_FIELD in", values, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldNotIn(List<String> values) {
            addCriterion("STO_KEY_FIELD not in", values, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldBetween(String value1, String value2) {
            addCriterion("STO_KEY_FIELD between", value1, value2, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoKeyFieldNotBetween(String value1, String value2) {
            addCriterion("STO_KEY_FIELD not between", value1, value2, "stoKeyField");
            return (Criteria) this;
        }

        public Criteria andStoDofObjIsNull() {
            addCriterion("STO_DOF_OBJ is null");
            return (Criteria) this;
        }

        public Criteria andStoDofObjIsNotNull() {
            addCriterion("STO_DOF_OBJ is not null");
            return (Criteria) this;
        }

        public Criteria andStoDofObjEqualTo(String value) {
            addCriterion("STO_DOF_OBJ =", value, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjNotEqualTo(String value) {
            addCriterion("STO_DOF_OBJ <>", value, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjGreaterThan(String value) {
            addCriterion("STO_DOF_OBJ >", value, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjGreaterThanOrEqualTo(String value) {
            addCriterion("STO_DOF_OBJ >=", value, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjLessThan(String value) {
            addCriterion("STO_DOF_OBJ <", value, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjLessThanOrEqualTo(String value) {
            addCriterion("STO_DOF_OBJ <=", value, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjLike(String value) {
            addCriterion("STO_DOF_OBJ like", value, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjNotLike(String value) {
            addCriterion("STO_DOF_OBJ not like", value, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjIn(List<String> values) {
            addCriterion("STO_DOF_OBJ in", values, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjNotIn(List<String> values) {
            addCriterion("STO_DOF_OBJ not in", values, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjBetween(String value1, String value2) {
            addCriterion("STO_DOF_OBJ between", value1, value2, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoDofObjNotBetween(String value1, String value2) {
            addCriterion("STO_DOF_OBJ not between", value1, value2, "stoDofObj");
            return (Criteria) this;
        }

        public Criteria andStoEditCardIsNull() {
            addCriterion("STO_EDIT_CARD is null");
            return (Criteria) this;
        }

        public Criteria andStoEditCardIsNotNull() {
            addCriterion("STO_EDIT_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andStoEditCardEqualTo(String value) {
            addCriterion("STO_EDIT_CARD =", value, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardNotEqualTo(String value) {
            addCriterion("STO_EDIT_CARD <>", value, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardGreaterThan(String value) {
            addCriterion("STO_EDIT_CARD >", value, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardGreaterThanOrEqualTo(String value) {
            addCriterion("STO_EDIT_CARD >=", value, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardLessThan(String value) {
            addCriterion("STO_EDIT_CARD <", value, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardLessThanOrEqualTo(String value) {
            addCriterion("STO_EDIT_CARD <=", value, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardLike(String value) {
            addCriterion("STO_EDIT_CARD like", value, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardNotLike(String value) {
            addCriterion("STO_EDIT_CARD not like", value, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardIn(List<String> values) {
            addCriterion("STO_EDIT_CARD in", values, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardNotIn(List<String> values) {
            addCriterion("STO_EDIT_CARD not in", values, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardBetween(String value1, String value2) {
            addCriterion("STO_EDIT_CARD between", value1, value2, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoEditCardNotBetween(String value1, String value2) {
            addCriterion("STO_EDIT_CARD not between", value1, value2, "stoEditCard");
            return (Criteria) this;
        }

        public Criteria andStoAccModeIsNull() {
            addCriterion("STO_ACC_MODE is null");
            return (Criteria) this;
        }

        public Criteria andStoAccModeIsNotNull() {
            addCriterion("STO_ACC_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andStoAccModeEqualTo(String value) {
            addCriterion("STO_ACC_MODE =", value, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeNotEqualTo(String value) {
            addCriterion("STO_ACC_MODE <>", value, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeGreaterThan(String value) {
            addCriterion("STO_ACC_MODE >", value, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeGreaterThanOrEqualTo(String value) {
            addCriterion("STO_ACC_MODE >=", value, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeLessThan(String value) {
            addCriterion("STO_ACC_MODE <", value, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeLessThanOrEqualTo(String value) {
            addCriterion("STO_ACC_MODE <=", value, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeLike(String value) {
            addCriterion("STO_ACC_MODE like", value, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeNotLike(String value) {
            addCriterion("STO_ACC_MODE not like", value, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeIn(List<String> values) {
            addCriterion("STO_ACC_MODE in", values, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeNotIn(List<String> values) {
            addCriterion("STO_ACC_MODE not in", values, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeBetween(String value1, String value2) {
            addCriterion("STO_ACC_MODE between", value1, value2, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccModeNotBetween(String value1, String value2) {
            addCriterion("STO_ACC_MODE not between", value1, value2, "stoAccMode");
            return (Criteria) this;
        }

        public Criteria andStoAccIsNull() {
            addCriterion("STO_ACC is null");
            return (Criteria) this;
        }

        public Criteria andStoAccIsNotNull() {
            addCriterion("STO_ACC is not null");
            return (Criteria) this;
        }

        public Criteria andStoAccEqualTo(String value) {
            addCriterion("STO_ACC =", value, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccNotEqualTo(String value) {
            addCriterion("STO_ACC <>", value, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccGreaterThan(String value) {
            addCriterion("STO_ACC >", value, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccGreaterThanOrEqualTo(String value) {
            addCriterion("STO_ACC >=", value, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccLessThan(String value) {
            addCriterion("STO_ACC <", value, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccLessThanOrEqualTo(String value) {
            addCriterion("STO_ACC <=", value, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccLike(String value) {
            addCriterion("STO_ACC like", value, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccNotLike(String value) {
            addCriterion("STO_ACC not like", value, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccIn(List<String> values) {
            addCriterion("STO_ACC in", values, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccNotIn(List<String> values) {
            addCriterion("STO_ACC not in", values, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccBetween(String value1, String value2) {
            addCriterion("STO_ACC between", value1, value2, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoAccNotBetween(String value1, String value2) {
            addCriterion("STO_ACC not between", value1, value2, "stoAcc");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaIsNull() {
            addCriterion("STO_OWNER_BA is null");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaIsNotNull() {
            addCriterion("STO_OWNER_BA is not null");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaEqualTo(String value) {
            addCriterion("STO_OWNER_BA =", value, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaNotEqualTo(String value) {
            addCriterion("STO_OWNER_BA <>", value, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaGreaterThan(String value) {
            addCriterion("STO_OWNER_BA >", value, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaGreaterThanOrEqualTo(String value) {
            addCriterion("STO_OWNER_BA >=", value, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaLessThan(String value) {
            addCriterion("STO_OWNER_BA <", value, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaLessThanOrEqualTo(String value) {
            addCriterion("STO_OWNER_BA <=", value, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaLike(String value) {
            addCriterion("STO_OWNER_BA like", value, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaNotLike(String value) {
            addCriterion("STO_OWNER_BA not like", value, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaIn(List<String> values) {
            addCriterion("STO_OWNER_BA in", values, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaNotIn(List<String> values) {
            addCriterion("STO_OWNER_BA not in", values, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaBetween(String value1, String value2) {
            addCriterion("STO_OWNER_BA between", value1, value2, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoOwnerBaNotBetween(String value1, String value2) {
            addCriterion("STO_OWNER_BA not between", value1, value2, "stoOwnerBa");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeIsNull() {
            addCriterion("STO_SINGLEKEY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeIsNotNull() {
            addCriterion("STO_SINGLEKEY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeEqualTo(String value) {
            addCriterion("STO_SINGLEKEY_MODE =", value, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeNotEqualTo(String value) {
            addCriterion("STO_SINGLEKEY_MODE <>", value, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeGreaterThan(String value) {
            addCriterion("STO_SINGLEKEY_MODE >", value, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeGreaterThanOrEqualTo(String value) {
            addCriterion("STO_SINGLEKEY_MODE >=", value, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeLessThan(String value) {
            addCriterion("STO_SINGLEKEY_MODE <", value, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeLessThanOrEqualTo(String value) {
            addCriterion("STO_SINGLEKEY_MODE <=", value, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeLike(String value) {
            addCriterion("STO_SINGLEKEY_MODE like", value, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeNotLike(String value) {
            addCriterion("STO_SINGLEKEY_MODE not like", value, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeIn(List<String> values) {
            addCriterion("STO_SINGLEKEY_MODE in", values, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeNotIn(List<String> values) {
            addCriterion("STO_SINGLEKEY_MODE not in", values, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeBetween(String value1, String value2) {
            addCriterion("STO_SINGLEKEY_MODE between", value1, value2, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoSinglekeyModeNotBetween(String value1, String value2) {
            addCriterion("STO_SINGLEKEY_MODE not between", value1, value2, "stoSinglekeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrIsNull() {
            addCriterion("STO_KEY_CRTR is null");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrIsNotNull() {
            addCriterion("STO_KEY_CRTR is not null");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrEqualTo(String value) {
            addCriterion("STO_KEY_CRTR =", value, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrNotEqualTo(String value) {
            addCriterion("STO_KEY_CRTR <>", value, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrGreaterThan(String value) {
            addCriterion("STO_KEY_CRTR >", value, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrGreaterThanOrEqualTo(String value) {
            addCriterion("STO_KEY_CRTR >=", value, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrLessThan(String value) {
            addCriterion("STO_KEY_CRTR <", value, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrLessThanOrEqualTo(String value) {
            addCriterion("STO_KEY_CRTR <=", value, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrLike(String value) {
            addCriterion("STO_KEY_CRTR like", value, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrNotLike(String value) {
            addCriterion("STO_KEY_CRTR not like", value, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrIn(List<String> values) {
            addCriterion("STO_KEY_CRTR in", values, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrNotIn(List<String> values) {
            addCriterion("STO_KEY_CRTR not in", values, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrBetween(String value1, String value2) {
            addCriterion("STO_KEY_CRTR between", value1, value2, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrNotBetween(String value1, String value2) {
            addCriterion("STO_KEY_CRTR not between", value1, value2, "stoKeyCrtr");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamIsNull() {
            addCriterion("STO_KEY_CRTR_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamIsNotNull() {
            addCriterion("STO_KEY_CRTR_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamEqualTo(String value) {
            addCriterion("STO_KEY_CRTR_PARAM =", value, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamNotEqualTo(String value) {
            addCriterion("STO_KEY_CRTR_PARAM <>", value, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamGreaterThan(String value) {
            addCriterion("STO_KEY_CRTR_PARAM >", value, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamGreaterThanOrEqualTo(String value) {
            addCriterion("STO_KEY_CRTR_PARAM >=", value, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamLessThan(String value) {
            addCriterion("STO_KEY_CRTR_PARAM <", value, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamLessThanOrEqualTo(String value) {
            addCriterion("STO_KEY_CRTR_PARAM <=", value, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamLike(String value) {
            addCriterion("STO_KEY_CRTR_PARAM like", value, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamNotLike(String value) {
            addCriterion("STO_KEY_CRTR_PARAM not like", value, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamIn(List<String> values) {
            addCriterion("STO_KEY_CRTR_PARAM in", values, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamNotIn(List<String> values) {
            addCriterion("STO_KEY_CRTR_PARAM not in", values, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamBetween(String value1, String value2) {
            addCriterion("STO_KEY_CRTR_PARAM between", value1, value2, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyCrtrParamNotBetween(String value1, String value2) {
            addCriterion("STO_KEY_CRTR_PARAM not between", value1, value2, "stoKeyCrtrParam");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeIsNull() {
            addCriterion("STO_KEY_MODE is null");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeIsNotNull() {
            addCriterion("STO_KEY_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeEqualTo(String value) {
            addCriterion("STO_KEY_MODE =", value, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeNotEqualTo(String value) {
            addCriterion("STO_KEY_MODE <>", value, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeGreaterThan(String value) {
            addCriterion("STO_KEY_MODE >", value, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeGreaterThanOrEqualTo(String value) {
            addCriterion("STO_KEY_MODE >=", value, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeLessThan(String value) {
            addCriterion("STO_KEY_MODE <", value, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeLessThanOrEqualTo(String value) {
            addCriterion("STO_KEY_MODE <=", value, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeLike(String value) {
            addCriterion("STO_KEY_MODE like", value, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeNotLike(String value) {
            addCriterion("STO_KEY_MODE not like", value, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeIn(List<String> values) {
            addCriterion("STO_KEY_MODE in", values, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeNotIn(List<String> values) {
            addCriterion("STO_KEY_MODE not in", values, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeBetween(String value1, String value2) {
            addCriterion("STO_KEY_MODE between", value1, value2, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoKeyModeNotBetween(String value1, String value2) {
            addCriterion("STO_KEY_MODE not between", value1, value2, "stoKeyMode");
            return (Criteria) this;
        }

        public Criteria andStoOrderIsNull() {
            addCriterion("STO_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andStoOrderIsNotNull() {
            addCriterion("STO_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andStoOrderEqualTo(String value) {
            addCriterion("STO_ORDER =", value, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderNotEqualTo(String value) {
            addCriterion("STO_ORDER <>", value, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderGreaterThan(String value) {
            addCriterion("STO_ORDER >", value, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderGreaterThanOrEqualTo(String value) {
            addCriterion("STO_ORDER >=", value, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderLessThan(String value) {
            addCriterion("STO_ORDER <", value, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderLessThanOrEqualTo(String value) {
            addCriterion("STO_ORDER <=", value, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderLike(String value) {
            addCriterion("STO_ORDER like", value, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderNotLike(String value) {
            addCriterion("STO_ORDER not like", value, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderIn(List<String> values) {
            addCriterion("STO_ORDER in", values, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderNotIn(List<String> values) {
            addCriterion("STO_ORDER not in", values, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderBetween(String value1, String value2) {
            addCriterion("STO_ORDER between", value1, value2, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderNotBetween(String value1, String value2) {
            addCriterion("STO_ORDER not between", value1, value2, "stoOrder");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldIsNull() {
            addCriterion("STO_ORDER_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldIsNotNull() {
            addCriterion("STO_ORDER_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldEqualTo(String value) {
            addCriterion("STO_ORDER_FIELD =", value, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldNotEqualTo(String value) {
            addCriterion("STO_ORDER_FIELD <>", value, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldGreaterThan(String value) {
            addCriterion("STO_ORDER_FIELD >", value, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldGreaterThanOrEqualTo(String value) {
            addCriterion("STO_ORDER_FIELD >=", value, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldLessThan(String value) {
            addCriterion("STO_ORDER_FIELD <", value, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldLessThanOrEqualTo(String value) {
            addCriterion("STO_ORDER_FIELD <=", value, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldLike(String value) {
            addCriterion("STO_ORDER_FIELD like", value, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldNotLike(String value) {
            addCriterion("STO_ORDER_FIELD not like", value, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldIn(List<String> values) {
            addCriterion("STO_ORDER_FIELD in", values, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldNotIn(List<String> values) {
            addCriterion("STO_ORDER_FIELD not in", values, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldBetween(String value1, String value2) {
            addCriterion("STO_ORDER_FIELD between", value1, value2, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoOrderFieldNotBetween(String value1, String value2) {
            addCriterion("STO_ORDER_FIELD not between", value1, value2, "stoOrderField");
            return (Criteria) this;
        }

        public Criteria andStoParentIsNull() {
            addCriterion("STO_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andStoParentIsNotNull() {
            addCriterion("STO_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andStoParentEqualTo(String value) {
            addCriterion("STO_PARENT =", value, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentNotEqualTo(String value) {
            addCriterion("STO_PARENT <>", value, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentGreaterThan(String value) {
            addCriterion("STO_PARENT >", value, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentGreaterThanOrEqualTo(String value) {
            addCriterion("STO_PARENT >=", value, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentLessThan(String value) {
            addCriterion("STO_PARENT <", value, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentLessThanOrEqualTo(String value) {
            addCriterion("STO_PARENT <=", value, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentLike(String value) {
            addCriterion("STO_PARENT like", value, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentNotLike(String value) {
            addCriterion("STO_PARENT not like", value, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentIn(List<String> values) {
            addCriterion("STO_PARENT in", values, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentNotIn(List<String> values) {
            addCriterion("STO_PARENT not in", values, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentBetween(String value1, String value2) {
            addCriterion("STO_PARENT between", value1, value2, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentNotBetween(String value1, String value2) {
            addCriterion("STO_PARENT not between", value1, value2, "stoParent");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldIsNull() {
            addCriterion("STO_PARENT_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldIsNotNull() {
            addCriterion("STO_PARENT_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldEqualTo(String value) {
            addCriterion("STO_PARENT_FIELD =", value, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldNotEqualTo(String value) {
            addCriterion("STO_PARENT_FIELD <>", value, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldGreaterThan(String value) {
            addCriterion("STO_PARENT_FIELD >", value, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldGreaterThanOrEqualTo(String value) {
            addCriterion("STO_PARENT_FIELD >=", value, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldLessThan(String value) {
            addCriterion("STO_PARENT_FIELD <", value, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldLessThanOrEqualTo(String value) {
            addCriterion("STO_PARENT_FIELD <=", value, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldLike(String value) {
            addCriterion("STO_PARENT_FIELD like", value, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldNotLike(String value) {
            addCriterion("STO_PARENT_FIELD not like", value, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldIn(List<String> values) {
            addCriterion("STO_PARENT_FIELD in", values, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldNotIn(List<String> values) {
            addCriterion("STO_PARENT_FIELD not in", values, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldBetween(String value1, String value2) {
            addCriterion("STO_PARENT_FIELD between", value1, value2, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoParentFieldNotBetween(String value1, String value2) {
            addCriterion("STO_PARENT_FIELD not between", value1, value2, "stoParentField");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowIsNull() {
            addCriterion("STO_COLLECT_ROW is null");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowIsNotNull() {
            addCriterion("STO_COLLECT_ROW is not null");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowEqualTo(String value) {
            addCriterion("STO_COLLECT_ROW =", value, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowNotEqualTo(String value) {
            addCriterion("STO_COLLECT_ROW <>", value, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowGreaterThan(String value) {
            addCriterion("STO_COLLECT_ROW >", value, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowGreaterThanOrEqualTo(String value) {
            addCriterion("STO_COLLECT_ROW >=", value, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowLessThan(String value) {
            addCriterion("STO_COLLECT_ROW <", value, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowLessThanOrEqualTo(String value) {
            addCriterion("STO_COLLECT_ROW <=", value, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowLike(String value) {
            addCriterion("STO_COLLECT_ROW like", value, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowNotLike(String value) {
            addCriterion("STO_COLLECT_ROW not like", value, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowIn(List<String> values) {
            addCriterion("STO_COLLECT_ROW in", values, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowNotIn(List<String> values) {
            addCriterion("STO_COLLECT_ROW not in", values, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowBetween(String value1, String value2) {
            addCriterion("STO_COLLECT_ROW between", value1, value2, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoCollectRowNotBetween(String value1, String value2) {
            addCriterion("STO_COLLECT_ROW not between", value1, value2, "stoCollectRow");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapIsNull() {
            addCriterion("STO_ENTITYMAP is null");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapIsNotNull() {
            addCriterion("STO_ENTITYMAP is not null");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapEqualTo(String value) {
            addCriterion("STO_ENTITYMAP =", value, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapNotEqualTo(String value) {
            addCriterion("STO_ENTITYMAP <>", value, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapGreaterThan(String value) {
            addCriterion("STO_ENTITYMAP >", value, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapGreaterThanOrEqualTo(String value) {
            addCriterion("STO_ENTITYMAP >=", value, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapLessThan(String value) {
            addCriterion("STO_ENTITYMAP <", value, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapLessThanOrEqualTo(String value) {
            addCriterion("STO_ENTITYMAP <=", value, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapLike(String value) {
            addCriterion("STO_ENTITYMAP like", value, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapNotLike(String value) {
            addCriterion("STO_ENTITYMAP not like", value, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapIn(List<String> values) {
            addCriterion("STO_ENTITYMAP in", values, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapNotIn(List<String> values) {
            addCriterion("STO_ENTITYMAP not in", values, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapBetween(String value1, String value2) {
            addCriterion("STO_ENTITYMAP between", value1, value2, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntitymapNotBetween(String value1, String value2) {
            addCriterion("STO_ENTITYMAP not between", value1, value2, "stoEntitymap");
            return (Criteria) this;
        }

        public Criteria andStoEntityIsNull() {
            addCriterion("STO_ENTITY is null");
            return (Criteria) this;
        }

        public Criteria andStoEntityIsNotNull() {
            addCriterion("STO_ENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andStoEntityEqualTo(String value) {
            addCriterion("STO_ENTITY =", value, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityNotEqualTo(String value) {
            addCriterion("STO_ENTITY <>", value, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityGreaterThan(String value) {
            addCriterion("STO_ENTITY >", value, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityGreaterThanOrEqualTo(String value) {
            addCriterion("STO_ENTITY >=", value, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityLessThan(String value) {
            addCriterion("STO_ENTITY <", value, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityLessThanOrEqualTo(String value) {
            addCriterion("STO_ENTITY <=", value, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityLike(String value) {
            addCriterion("STO_ENTITY like", value, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityNotLike(String value) {
            addCriterion("STO_ENTITY not like", value, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityIn(List<String> values) {
            addCriterion("STO_ENTITY in", values, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityNotIn(List<String> values) {
            addCriterion("STO_ENTITY not in", values, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityBetween(String value1, String value2) {
            addCriterion("STO_ENTITY between", value1, value2, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoEntityNotBetween(String value1, String value2) {
            addCriterion("STO_ENTITY not between", value1, value2, "stoEntity");
            return (Criteria) this;
        }

        public Criteria andStoVersionIsNull() {
            addCriterion("STO_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andStoVersionIsNotNull() {
            addCriterion("STO_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andStoVersionEqualTo(String value) {
            addCriterion("STO_VERSION =", value, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionNotEqualTo(String value) {
            addCriterion("STO_VERSION <>", value, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionGreaterThan(String value) {
            addCriterion("STO_VERSION >", value, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionGreaterThanOrEqualTo(String value) {
            addCriterion("STO_VERSION >=", value, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionLessThan(String value) {
            addCriterion("STO_VERSION <", value, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionLessThanOrEqualTo(String value) {
            addCriterion("STO_VERSION <=", value, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionLike(String value) {
            addCriterion("STO_VERSION like", value, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionNotLike(String value) {
            addCriterion("STO_VERSION not like", value, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionIn(List<String> values) {
            addCriterion("STO_VERSION in", values, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionNotIn(List<String> values) {
            addCriterion("STO_VERSION not in", values, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionBetween(String value1, String value2) {
            addCriterion("STO_VERSION between", value1, value2, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoVersionNotBetween(String value1, String value2) {
            addCriterion("STO_VERSION not between", value1, value2, "stoVersion");
            return (Criteria) this;
        }

        public Criteria andStoSepetableIsNull() {
            addCriterion("STO_SEPETABLE is null");
            return (Criteria) this;
        }

        public Criteria andStoSepetableIsNotNull() {
            addCriterion("STO_SEPETABLE is not null");
            return (Criteria) this;
        }

        public Criteria andStoSepetableEqualTo(String value) {
            addCriterion("STO_SEPETABLE =", value, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableNotEqualTo(String value) {
            addCriterion("STO_SEPETABLE <>", value, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableGreaterThan(String value) {
            addCriterion("STO_SEPETABLE >", value, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableGreaterThanOrEqualTo(String value) {
            addCriterion("STO_SEPETABLE >=", value, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableLessThan(String value) {
            addCriterion("STO_SEPETABLE <", value, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableLessThanOrEqualTo(String value) {
            addCriterion("STO_SEPETABLE <=", value, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableLike(String value) {
            addCriterion("STO_SEPETABLE like", value, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableNotLike(String value) {
            addCriterion("STO_SEPETABLE not like", value, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableIn(List<String> values) {
            addCriterion("STO_SEPETABLE in", values, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableNotIn(List<String> values) {
            addCriterion("STO_SEPETABLE not in", values, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableBetween(String value1, String value2) {
            addCriterion("STO_SEPETABLE between", value1, value2, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepetableNotBetween(String value1, String value2) {
            addCriterion("STO_SEPETABLE not between", value1, value2, "stoSepetable");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixIsNull() {
            addCriterion("STO_SEPE_SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixIsNotNull() {
            addCriterion("STO_SEPE_SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixEqualTo(String value) {
            addCriterion("STO_SEPE_SUFFIX =", value, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixNotEqualTo(String value) {
            addCriterion("STO_SEPE_SUFFIX <>", value, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixGreaterThan(String value) {
            addCriterion("STO_SEPE_SUFFIX >", value, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("STO_SEPE_SUFFIX >=", value, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixLessThan(String value) {
            addCriterion("STO_SEPE_SUFFIX <", value, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixLessThanOrEqualTo(String value) {
            addCriterion("STO_SEPE_SUFFIX <=", value, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixLike(String value) {
            addCriterion("STO_SEPE_SUFFIX like", value, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixNotLike(String value) {
            addCriterion("STO_SEPE_SUFFIX not like", value, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixIn(List<String> values) {
            addCriterion("STO_SEPE_SUFFIX in", values, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixNotIn(List<String> values) {
            addCriterion("STO_SEPE_SUFFIX not in", values, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixBetween(String value1, String value2) {
            addCriterion("STO_SEPE_SUFFIX between", value1, value2, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoSepeSuffixNotBetween(String value1, String value2) {
            addCriterion("STO_SEPE_SUFFIX not between", value1, value2, "stoSepeSuffix");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckIsNull() {
            addCriterion("STO_UNIQUECHECK is null");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckIsNotNull() {
            addCriterion("STO_UNIQUECHECK is not null");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckEqualTo(String value) {
            addCriterion("STO_UNIQUECHECK =", value, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckNotEqualTo(String value) {
            addCriterion("STO_UNIQUECHECK <>", value, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckGreaterThan(String value) {
            addCriterion("STO_UNIQUECHECK >", value, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckGreaterThanOrEqualTo(String value) {
            addCriterion("STO_UNIQUECHECK >=", value, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckLessThan(String value) {
            addCriterion("STO_UNIQUECHECK <", value, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckLessThanOrEqualTo(String value) {
            addCriterion("STO_UNIQUECHECK <=", value, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckLike(String value) {
            addCriterion("STO_UNIQUECHECK like", value, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckNotLike(String value) {
            addCriterion("STO_UNIQUECHECK not like", value, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckIn(List<String> values) {
            addCriterion("STO_UNIQUECHECK in", values, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckNotIn(List<String> values) {
            addCriterion("STO_UNIQUECHECK not in", values, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckBetween(String value1, String value2) {
            addCriterion("STO_UNIQUECHECK between", value1, value2, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckNotBetween(String value1, String value2) {
            addCriterion("STO_UNIQUECHECK not between", value1, value2, "stoUniquecheck");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldIsNull() {
            addCriterion("STO_UNIQUECHECK_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldIsNotNull() {
            addCriterion("STO_UNIQUECHECK_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldEqualTo(String value) {
            addCriterion("STO_UNIQUECHECK_FIELD =", value, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldNotEqualTo(String value) {
            addCriterion("STO_UNIQUECHECK_FIELD <>", value, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldGreaterThan(String value) {
            addCriterion("STO_UNIQUECHECK_FIELD >", value, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldGreaterThanOrEqualTo(String value) {
            addCriterion("STO_UNIQUECHECK_FIELD >=", value, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldLessThan(String value) {
            addCriterion("STO_UNIQUECHECK_FIELD <", value, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldLessThanOrEqualTo(String value) {
            addCriterion("STO_UNIQUECHECK_FIELD <=", value, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldLike(String value) {
            addCriterion("STO_UNIQUECHECK_FIELD like", value, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldNotLike(String value) {
            addCriterion("STO_UNIQUECHECK_FIELD not like", value, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldIn(List<String> values) {
            addCriterion("STO_UNIQUECHECK_FIELD in", values, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldNotIn(List<String> values) {
            addCriterion("STO_UNIQUECHECK_FIELD not in", values, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldBetween(String value1, String value2) {
            addCriterion("STO_UNIQUECHECK_FIELD between", value1, value2, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoUniquecheckFieldNotBetween(String value1, String value2) {
            addCriterion("STO_UNIQUECHECK_FIELD not between", value1, value2, "stoUniquecheckField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldIsNull() {
            addCriterion("STO_CAPTION_FIELD is null");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldIsNotNull() {
            addCriterion("STO_CAPTION_FIELD is not null");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldEqualTo(String value) {
            addCriterion("STO_CAPTION_FIELD =", value, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldNotEqualTo(String value) {
            addCriterion("STO_CAPTION_FIELD <>", value, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldGreaterThan(String value) {
            addCriterion("STO_CAPTION_FIELD >", value, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldGreaterThanOrEqualTo(String value) {
            addCriterion("STO_CAPTION_FIELD >=", value, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldLessThan(String value) {
            addCriterion("STO_CAPTION_FIELD <", value, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldLessThanOrEqualTo(String value) {
            addCriterion("STO_CAPTION_FIELD <=", value, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldLike(String value) {
            addCriterion("STO_CAPTION_FIELD like", value, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldNotLike(String value) {
            addCriterion("STO_CAPTION_FIELD not like", value, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldIn(List<String> values) {
            addCriterion("STO_CAPTION_FIELD in", values, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldNotIn(List<String> values) {
            addCriterion("STO_CAPTION_FIELD not in", values, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldBetween(String value1, String value2) {
            addCriterion("STO_CAPTION_FIELD between", value1, value2, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoCaptionFieldNotBetween(String value1, String value2) {
            addCriterion("STO_CAPTION_FIELD not between", value1, value2, "stoCaptionField");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableIsNull() {
            addCriterion("STO_SQLENABLE is null");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableIsNotNull() {
            addCriterion("STO_SQLENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableEqualTo(String value) {
            addCriterion("STO_SQLENABLE =", value, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableNotEqualTo(String value) {
            addCriterion("STO_SQLENABLE <>", value, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableGreaterThan(String value) {
            addCriterion("STO_SQLENABLE >", value, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableGreaterThanOrEqualTo(String value) {
            addCriterion("STO_SQLENABLE >=", value, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableLessThan(String value) {
            addCriterion("STO_SQLENABLE <", value, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableLessThanOrEqualTo(String value) {
            addCriterion("STO_SQLENABLE <=", value, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableLike(String value) {
            addCriterion("STO_SQLENABLE like", value, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableNotLike(String value) {
            addCriterion("STO_SQLENABLE not like", value, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableIn(List<String> values) {
            addCriterion("STO_SQLENABLE in", values, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableNotIn(List<String> values) {
            addCriterion("STO_SQLENABLE not in", values, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableBetween(String value1, String value2) {
            addCriterion("STO_SQLENABLE between", value1, value2, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqlenableNotBetween(String value1, String value2) {
            addCriterion("STO_SQLENABLE not between", value1, value2, "stoSqlenable");
            return (Criteria) this;
        }

        public Criteria andStoSqltextIsNull() {
            addCriterion("STO_SQLTEXT is null");
            return (Criteria) this;
        }

        public Criteria andStoSqltextIsNotNull() {
            addCriterion("STO_SQLTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andStoSqltextEqualTo(String value) {
            addCriterion("STO_SQLTEXT =", value, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextNotEqualTo(String value) {
            addCriterion("STO_SQLTEXT <>", value, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextGreaterThan(String value) {
            addCriterion("STO_SQLTEXT >", value, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextGreaterThanOrEqualTo(String value) {
            addCriterion("STO_SQLTEXT >=", value, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextLessThan(String value) {
            addCriterion("STO_SQLTEXT <", value, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextLessThanOrEqualTo(String value) {
            addCriterion("STO_SQLTEXT <=", value, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextLike(String value) {
            addCriterion("STO_SQLTEXT like", value, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextNotLike(String value) {
            addCriterion("STO_SQLTEXT not like", value, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextIn(List<String> values) {
            addCriterion("STO_SQLTEXT in", values, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextNotIn(List<String> values) {
            addCriterion("STO_SQLTEXT not in", values, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextBetween(String value1, String value2) {
            addCriterion("STO_SQLTEXT between", value1, value2, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoSqltextNotBetween(String value1, String value2) {
            addCriterion("STO_SQLTEXT not between", value1, value2, "stoSqltext");
            return (Criteria) this;
        }

        public Criteria andStoVariableIsNull() {
            addCriterion("STO_VARIABLE is null");
            return (Criteria) this;
        }

        public Criteria andStoVariableIsNotNull() {
            addCriterion("STO_VARIABLE is not null");
            return (Criteria) this;
        }

        public Criteria andStoVariableEqualTo(String value) {
            addCriterion("STO_VARIABLE =", value, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableNotEqualTo(String value) {
            addCriterion("STO_VARIABLE <>", value, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableGreaterThan(String value) {
            addCriterion("STO_VARIABLE >", value, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableGreaterThanOrEqualTo(String value) {
            addCriterion("STO_VARIABLE >=", value, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableLessThan(String value) {
            addCriterion("STO_VARIABLE <", value, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableLessThanOrEqualTo(String value) {
            addCriterion("STO_VARIABLE <=", value, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableLike(String value) {
            addCriterion("STO_VARIABLE like", value, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableNotLike(String value) {
            addCriterion("STO_VARIABLE not like", value, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableIn(List<String> values) {
            addCriterion("STO_VARIABLE in", values, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableNotIn(List<String> values) {
            addCriterion("STO_VARIABLE not in", values, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableBetween(String value1, String value2) {
            addCriterion("STO_VARIABLE between", value1, value2, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoVariableNotBetween(String value1, String value2) {
            addCriterion("STO_VARIABLE not between", value1, value2, "stoVariable");
            return (Criteria) this;
        }

        public Criteria andStoExpRightIsNull() {
            addCriterion("STO_EXP_RIGHT is null");
            return (Criteria) this;
        }

        public Criteria andStoExpRightIsNotNull() {
            addCriterion("STO_EXP_RIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andStoExpRightEqualTo(String value) {
            addCriterion("STO_EXP_RIGHT =", value, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightNotEqualTo(String value) {
            addCriterion("STO_EXP_RIGHT <>", value, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightGreaterThan(String value) {
            addCriterion("STO_EXP_RIGHT >", value, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightGreaterThanOrEqualTo(String value) {
            addCriterion("STO_EXP_RIGHT >=", value, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightLessThan(String value) {
            addCriterion("STO_EXP_RIGHT <", value, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightLessThanOrEqualTo(String value) {
            addCriterion("STO_EXP_RIGHT <=", value, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightLike(String value) {
            addCriterion("STO_EXP_RIGHT like", value, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightNotLike(String value) {
            addCriterion("STO_EXP_RIGHT not like", value, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightIn(List<String> values) {
            addCriterion("STO_EXP_RIGHT in", values, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightNotIn(List<String> values) {
            addCriterion("STO_EXP_RIGHT not in", values, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightBetween(String value1, String value2) {
            addCriterion("STO_EXP_RIGHT between", value1, value2, "stoExpRight");
            return (Criteria) this;
        }

        public Criteria andStoExpRightNotBetween(String value1, String value2) {
            addCriterion("STO_EXP_RIGHT not between", value1, value2, "stoExpRight");
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