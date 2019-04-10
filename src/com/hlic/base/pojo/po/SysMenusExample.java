package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SysMenusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysMenusExample() {
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

        public Criteria andFMenuIdIsNull() {
            addCriterion("f_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andFMenuIdIsNotNull() {
            addCriterion("f_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andFMenuIdEqualTo(String value) {
            addCriterion("f_menu_id =", value, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdNotEqualTo(String value) {
            addCriterion("f_menu_id <>", value, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdGreaterThan(String value) {
            addCriterion("f_menu_id >", value, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_menu_id >=", value, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdLessThan(String value) {
            addCriterion("f_menu_id <", value, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdLessThanOrEqualTo(String value) {
            addCriterion("f_menu_id <=", value, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdLike(String value) {
            addCriterion("f_menu_id like", value, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdNotLike(String value) {
            addCriterion("f_menu_id not like", value, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdIn(List<String> values) {
            addCriterion("f_menu_id in", values, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdNotIn(List<String> values) {
            addCriterion("f_menu_id not in", values, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdBetween(String value1, String value2) {
            addCriterion("f_menu_id between", value1, value2, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuIdNotBetween(String value1, String value2) {
            addCriterion("f_menu_id not between", value1, value2, "fMenuId");
            return (Criteria) this;
        }

        public Criteria andFMenuNameIsNull() {
            addCriterion("f_menu_name is null");
            return (Criteria) this;
        }

        public Criteria andFMenuNameIsNotNull() {
            addCriterion("f_menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andFMenuNameEqualTo(String value) {
            addCriterion("f_menu_name =", value, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameNotEqualTo(String value) {
            addCriterion("f_menu_name <>", value, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameGreaterThan(String value) {
            addCriterion("f_menu_name >", value, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_menu_name >=", value, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameLessThan(String value) {
            addCriterion("f_menu_name <", value, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameLessThanOrEqualTo(String value) {
            addCriterion("f_menu_name <=", value, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameLike(String value) {
            addCriterion("f_menu_name like", value, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameNotLike(String value) {
            addCriterion("f_menu_name not like", value, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameIn(List<String> values) {
            addCriterion("f_menu_name in", values, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameNotIn(List<String> values) {
            addCriterion("f_menu_name not in", values, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameBetween(String value1, String value2) {
            addCriterion("f_menu_name between", value1, value2, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFMenuNameNotBetween(String value1, String value2) {
            addCriterion("f_menu_name not between", value1, value2, "fMenuName");
            return (Criteria) this;
        }

        public Criteria andFDescIsNull() {
            addCriterion("f_desc is null");
            return (Criteria) this;
        }

        public Criteria andFDescIsNotNull() {
            addCriterion("f_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFDescEqualTo(String value) {
            addCriterion("f_desc =", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotEqualTo(String value) {
            addCriterion("f_desc <>", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThan(String value) {
            addCriterion("f_desc >", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThanOrEqualTo(String value) {
            addCriterion("f_desc >=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThan(String value) {
            addCriterion("f_desc <", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThanOrEqualTo(String value) {
            addCriterion("f_desc <=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLike(String value) {
            addCriterion("f_desc like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotLike(String value) {
            addCriterion("f_desc not like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescIn(List<String> values) {
            addCriterion("f_desc in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotIn(List<String> values) {
            addCriterion("f_desc not in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescBetween(String value1, String value2) {
            addCriterion("f_desc between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotBetween(String value1, String value2) {
            addCriterion("f_desc not between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFFuncIdIsNull() {
            addCriterion("f_func_id is null");
            return (Criteria) this;
        }

        public Criteria andFFuncIdIsNotNull() {
            addCriterion("f_func_id is not null");
            return (Criteria) this;
        }

        public Criteria andFFuncIdEqualTo(String value) {
            addCriterion("f_func_id =", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdNotEqualTo(String value) {
            addCriterion("f_func_id <>", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdGreaterThan(String value) {
            addCriterion("f_func_id >", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdGreaterThanOrEqualTo(String value) {
            addCriterion("f_func_id >=", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdLessThan(String value) {
            addCriterion("f_func_id <", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdLessThanOrEqualTo(String value) {
            addCriterion("f_func_id <=", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdLike(String value) {
            addCriterion("f_func_id like", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdNotLike(String value) {
            addCriterion("f_func_id not like", value, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdIn(List<String> values) {
            addCriterion("f_func_id in", values, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdNotIn(List<String> values) {
            addCriterion("f_func_id not in", values, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdBetween(String value1, String value2) {
            addCriterion("f_func_id between", value1, value2, "fFuncId");
            return (Criteria) this;
        }

        public Criteria andFFuncIdNotBetween(String value1, String value2) {
            addCriterion("f_func_id not between", value1, value2, "fFuncId");
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

        public Criteria andFLevelIsNull() {
            addCriterion("f_level is null");
            return (Criteria) this;
        }

        public Criteria andFLevelIsNotNull() {
            addCriterion("f_level is not null");
            return (Criteria) this;
        }

        public Criteria andFLevelEqualTo(Integer value) {
            addCriterion("f_level =", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelNotEqualTo(Integer value) {
            addCriterion("f_level <>", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelGreaterThan(Integer value) {
            addCriterion("f_level >", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_level >=", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelLessThan(Integer value) {
            addCriterion("f_level <", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelLessThanOrEqualTo(Integer value) {
            addCriterion("f_level <=", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelIn(List<Integer> values) {
            addCriterion("f_level in", values, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelNotIn(List<Integer> values) {
            addCriterion("f_level not in", values, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelBetween(Integer value1, Integer value2) {
            addCriterion("f_level between", value1, value2, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("f_level not between", value1, value2, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLeafIsNull() {
            addCriterion("f_leaf is null");
            return (Criteria) this;
        }

        public Criteria andFLeafIsNotNull() {
            addCriterion("f_leaf is not null");
            return (Criteria) this;
        }

        public Criteria andFLeafEqualTo(String value) {
            addCriterion("f_leaf =", value, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafNotEqualTo(String value) {
            addCriterion("f_leaf <>", value, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafGreaterThan(String value) {
            addCriterion("f_leaf >", value, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafGreaterThanOrEqualTo(String value) {
            addCriterion("f_leaf >=", value, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafLessThan(String value) {
            addCriterion("f_leaf <", value, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafLessThanOrEqualTo(String value) {
            addCriterion("f_leaf <=", value, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafLike(String value) {
            addCriterion("f_leaf like", value, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafNotLike(String value) {
            addCriterion("f_leaf not like", value, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafIn(List<String> values) {
            addCriterion("f_leaf in", values, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafNotIn(List<String> values) {
            addCriterion("f_leaf not in", values, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafBetween(String value1, String value2) {
            addCriterion("f_leaf between", value1, value2, "fLeaf");
            return (Criteria) this;
        }

        public Criteria andFLeafNotBetween(String value1, String value2) {
            addCriterion("f_leaf not between", value1, value2, "fLeaf");
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

        public Criteria andFT1IsNull() {
            addCriterion("f_t1 is null");
            return (Criteria) this;
        }

        public Criteria andFT1IsNotNull() {
            addCriterion("f_t1 is not null");
            return (Criteria) this;
        }

        public Criteria andFT1EqualTo(String value) {
            addCriterion("f_t1 =", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1NotEqualTo(String value) {
            addCriterion("f_t1 <>", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1GreaterThan(String value) {
            addCriterion("f_t1 >", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1GreaterThanOrEqualTo(String value) {
            addCriterion("f_t1 >=", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1LessThan(String value) {
            addCriterion("f_t1 <", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1LessThanOrEqualTo(String value) {
            addCriterion("f_t1 <=", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1Like(String value) {
            addCriterion("f_t1 like", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1NotLike(String value) {
            addCriterion("f_t1 not like", value, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1In(List<String> values) {
            addCriterion("f_t1 in", values, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1NotIn(List<String> values) {
            addCriterion("f_t1 not in", values, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1Between(String value1, String value2) {
            addCriterion("f_t1 between", value1, value2, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT1NotBetween(String value1, String value2) {
            addCriterion("f_t1 not between", value1, value2, "fT1");
            return (Criteria) this;
        }

        public Criteria andFT2IsNull() {
            addCriterion("f_t2 is null");
            return (Criteria) this;
        }

        public Criteria andFT2IsNotNull() {
            addCriterion("f_t2 is not null");
            return (Criteria) this;
        }

        public Criteria andFT2EqualTo(String value) {
            addCriterion("f_t2 =", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2NotEqualTo(String value) {
            addCriterion("f_t2 <>", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2GreaterThan(String value) {
            addCriterion("f_t2 >", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2GreaterThanOrEqualTo(String value) {
            addCriterion("f_t2 >=", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2LessThan(String value) {
            addCriterion("f_t2 <", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2LessThanOrEqualTo(String value) {
            addCriterion("f_t2 <=", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2Like(String value) {
            addCriterion("f_t2 like", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2NotLike(String value) {
            addCriterion("f_t2 not like", value, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2In(List<String> values) {
            addCriterion("f_t2 in", values, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2NotIn(List<String> values) {
            addCriterion("f_t2 not in", values, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2Between(String value1, String value2) {
            addCriterion("f_t2 between", value1, value2, "fT2");
            return (Criteria) this;
        }

        public Criteria andFT2NotBetween(String value1, String value2) {
            addCriterion("f_t2 not between", value1, value2, "fT2");
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