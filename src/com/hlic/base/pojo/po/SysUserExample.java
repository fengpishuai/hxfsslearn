package com.hlic.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        public Criteria andUsrUsridIsNull() {
            addCriterion("usr_usrid is null");
            return (Criteria) this;
        }

        public Criteria andUsrUsridIsNotNull() {
            addCriterion("usr_usrid is not null");
            return (Criteria) this;
        }

        public Criteria andUsrUsridEqualTo(String value) {
            addCriterion("usr_usrid =", value, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridNotEqualTo(String value) {
            addCriterion("usr_usrid <>", value, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridGreaterThan(String value) {
            addCriterion("usr_usrid >", value, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridGreaterThanOrEqualTo(String value) {
            addCriterion("usr_usrid >=", value, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridLessThan(String value) {
            addCriterion("usr_usrid <", value, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridLessThanOrEqualTo(String value) {
            addCriterion("usr_usrid <=", value, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridLike(String value) {
            addCriterion("usr_usrid like", value, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridNotLike(String value) {
            addCriterion("usr_usrid not like", value, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridIn(List<String> values) {
            addCriterion("usr_usrid in", values, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridNotIn(List<String> values) {
            addCriterion("usr_usrid not in", values, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridBetween(String value1, String value2) {
            addCriterion("usr_usrid between", value1, value2, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrUsridNotBetween(String value1, String value2) {
            addCriterion("usr_usrid not between", value1, value2, "usrUsrid");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNull() {
            addCriterion("usr_name is null");
            return (Criteria) this;
        }

        public Criteria andUsrNameIsNotNull() {
            addCriterion("usr_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsrNameEqualTo(String value) {
            addCriterion("usr_name =", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotEqualTo(String value) {
            addCriterion("usr_name <>", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThan(String value) {
            addCriterion("usr_name >", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameGreaterThanOrEqualTo(String value) {
            addCriterion("usr_name >=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThan(String value) {
            addCriterion("usr_name <", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLessThanOrEqualTo(String value) {
            addCriterion("usr_name <=", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameLike(String value) {
            addCriterion("usr_name like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotLike(String value) {
            addCriterion("usr_name not like", value, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameIn(List<String> values) {
            addCriterion("usr_name in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotIn(List<String> values) {
            addCriterion("usr_name not in", values, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameBetween(String value1, String value2) {
            addCriterion("usr_name between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrNameNotBetween(String value1, String value2) {
            addCriterion("usr_name not between", value1, value2, "usrName");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNull() {
            addCriterion("usr_password is null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIsNotNull() {
            addCriterion("usr_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordEqualTo(String value) {
            addCriterion("usr_password =", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotEqualTo(String value) {
            addCriterion("usr_password <>", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThan(String value) {
            addCriterion("usr_password >", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("usr_password >=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThan(String value) {
            addCriterion("usr_password <", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLessThanOrEqualTo(String value) {
            addCriterion("usr_password <=", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordLike(String value) {
            addCriterion("usr_password like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotLike(String value) {
            addCriterion("usr_password not like", value, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordIn(List<String> values) {
            addCriterion("usr_password in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotIn(List<String> values) {
            addCriterion("usr_password not in", values, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordBetween(String value1, String value2) {
            addCriterion("usr_password between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrPasswordNotBetween(String value1, String value2) {
            addCriterion("usr_password not between", value1, value2, "usrPassword");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1IsNull() {
            addCriterion("usr_email1 is null");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1IsNotNull() {
            addCriterion("usr_email1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1EqualTo(String value) {
            addCriterion("usr_email1 =", value, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1NotEqualTo(String value) {
            addCriterion("usr_email1 <>", value, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1GreaterThan(String value) {
            addCriterion("usr_email1 >", value, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1GreaterThanOrEqualTo(String value) {
            addCriterion("usr_email1 >=", value, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1LessThan(String value) {
            addCriterion("usr_email1 <", value, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1LessThanOrEqualTo(String value) {
            addCriterion("usr_email1 <=", value, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1Like(String value) {
            addCriterion("usr_email1 like", value, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1NotLike(String value) {
            addCriterion("usr_email1 not like", value, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1In(List<String> values) {
            addCriterion("usr_email1 in", values, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1NotIn(List<String> values) {
            addCriterion("usr_email1 not in", values, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1Between(String value1, String value2) {
            addCriterion("usr_email1 between", value1, value2, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail1NotBetween(String value1, String value2) {
            addCriterion("usr_email1 not between", value1, value2, "usrEmail1");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2IsNull() {
            addCriterion("usr_email2 is null");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2IsNotNull() {
            addCriterion("usr_email2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2EqualTo(String value) {
            addCriterion("usr_email2 =", value, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2NotEqualTo(String value) {
            addCriterion("usr_email2 <>", value, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2GreaterThan(String value) {
            addCriterion("usr_email2 >", value, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2GreaterThanOrEqualTo(String value) {
            addCriterion("usr_email2 >=", value, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2LessThan(String value) {
            addCriterion("usr_email2 <", value, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2LessThanOrEqualTo(String value) {
            addCriterion("usr_email2 <=", value, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2Like(String value) {
            addCriterion("usr_email2 like", value, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2NotLike(String value) {
            addCriterion("usr_email2 not like", value, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2In(List<String> values) {
            addCriterion("usr_email2 in", values, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2NotIn(List<String> values) {
            addCriterion("usr_email2 not in", values, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2Between(String value1, String value2) {
            addCriterion("usr_email2 between", value1, value2, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrEmail2NotBetween(String value1, String value2) {
            addCriterion("usr_email2 not between", value1, value2, "usrEmail2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1IsNull() {
            addCriterion("usr_phone1 is null");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1IsNotNull() {
            addCriterion("usr_phone1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1EqualTo(String value) {
            addCriterion("usr_phone1 =", value, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1NotEqualTo(String value) {
            addCriterion("usr_phone1 <>", value, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1GreaterThan(String value) {
            addCriterion("usr_phone1 >", value, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("usr_phone1 >=", value, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1LessThan(String value) {
            addCriterion("usr_phone1 <", value, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1LessThanOrEqualTo(String value) {
            addCriterion("usr_phone1 <=", value, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1Like(String value) {
            addCriterion("usr_phone1 like", value, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1NotLike(String value) {
            addCriterion("usr_phone1 not like", value, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1In(List<String> values) {
            addCriterion("usr_phone1 in", values, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1NotIn(List<String> values) {
            addCriterion("usr_phone1 not in", values, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1Between(String value1, String value2) {
            addCriterion("usr_phone1 between", value1, value2, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone1NotBetween(String value1, String value2) {
            addCriterion("usr_phone1 not between", value1, value2, "usrPhone1");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2IsNull() {
            addCriterion("usr_phone2 is null");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2IsNotNull() {
            addCriterion("usr_phone2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2EqualTo(String value) {
            addCriterion("usr_phone2 =", value, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2NotEqualTo(String value) {
            addCriterion("usr_phone2 <>", value, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2GreaterThan(String value) {
            addCriterion("usr_phone2 >", value, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("usr_phone2 >=", value, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2LessThan(String value) {
            addCriterion("usr_phone2 <", value, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2LessThanOrEqualTo(String value) {
            addCriterion("usr_phone2 <=", value, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2Like(String value) {
            addCriterion("usr_phone2 like", value, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2NotLike(String value) {
            addCriterion("usr_phone2 not like", value, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2In(List<String> values) {
            addCriterion("usr_phone2 in", values, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2NotIn(List<String> values) {
            addCriterion("usr_phone2 not in", values, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2Between(String value1, String value2) {
            addCriterion("usr_phone2 between", value1, value2, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrPhone2NotBetween(String value1, String value2) {
            addCriterion("usr_phone2 not between", value1, value2, "usrPhone2");
            return (Criteria) this;
        }

        public Criteria andUsrAddressIsNull() {
            addCriterion("usr_address is null");
            return (Criteria) this;
        }

        public Criteria andUsrAddressIsNotNull() {
            addCriterion("usr_address is not null");
            return (Criteria) this;
        }

        public Criteria andUsrAddressEqualTo(String value) {
            addCriterion("usr_address =", value, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressNotEqualTo(String value) {
            addCriterion("usr_address <>", value, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressGreaterThan(String value) {
            addCriterion("usr_address >", value, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressGreaterThanOrEqualTo(String value) {
            addCriterion("usr_address >=", value, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressLessThan(String value) {
            addCriterion("usr_address <", value, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressLessThanOrEqualTo(String value) {
            addCriterion("usr_address <=", value, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressLike(String value) {
            addCriterion("usr_address like", value, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressNotLike(String value) {
            addCriterion("usr_address not like", value, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressIn(List<String> values) {
            addCriterion("usr_address in", values, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressNotIn(List<String> values) {
            addCriterion("usr_address not in", values, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressBetween(String value1, String value2) {
            addCriterion("usr_address between", value1, value2, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrAddressNotBetween(String value1, String value2) {
            addCriterion("usr_address not between", value1, value2, "usrAddress");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidIsNull() {
            addCriterion("usr_orgid is null");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidIsNotNull() {
            addCriterion("usr_orgid is not null");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidEqualTo(String value) {
            addCriterion("usr_orgid =", value, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidNotEqualTo(String value) {
            addCriterion("usr_orgid <>", value, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidGreaterThan(String value) {
            addCriterion("usr_orgid >", value, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidGreaterThanOrEqualTo(String value) {
            addCriterion("usr_orgid >=", value, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidLessThan(String value) {
            addCriterion("usr_orgid <", value, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidLessThanOrEqualTo(String value) {
            addCriterion("usr_orgid <=", value, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidLike(String value) {
            addCriterion("usr_orgid like", value, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidNotLike(String value) {
            addCriterion("usr_orgid not like", value, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidIn(List<String> values) {
            addCriterion("usr_orgid in", values, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidNotIn(List<String> values) {
            addCriterion("usr_orgid not in", values, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidBetween(String value1, String value2) {
            addCriterion("usr_orgid between", value1, value2, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrOrgidNotBetween(String value1, String value2) {
            addCriterion("usr_orgid not between", value1, value2, "usrOrgid");
            return (Criteria) this;
        }

        public Criteria andUsrDisableIsNull() {
            addCriterion("usr_disable is null");
            return (Criteria) this;
        }

        public Criteria andUsrDisableIsNotNull() {
            addCriterion("usr_disable is not null");
            return (Criteria) this;
        }

        public Criteria andUsrDisableEqualTo(String value) {
            addCriterion("usr_disable =", value, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableNotEqualTo(String value) {
            addCriterion("usr_disable <>", value, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableGreaterThan(String value) {
            addCriterion("usr_disable >", value, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableGreaterThanOrEqualTo(String value) {
            addCriterion("usr_disable >=", value, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableLessThan(String value) {
            addCriterion("usr_disable <", value, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableLessThanOrEqualTo(String value) {
            addCriterion("usr_disable <=", value, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableLike(String value) {
            addCriterion("usr_disable like", value, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableNotLike(String value) {
            addCriterion("usr_disable not like", value, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableIn(List<String> values) {
            addCriterion("usr_disable in", values, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableNotIn(List<String> values) {
            addCriterion("usr_disable not in", values, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableBetween(String value1, String value2) {
            addCriterion("usr_disable between", value1, value2, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrDisableNotBetween(String value1, String value2) {
            addCriterion("usr_disable not between", value1, value2, "usrDisable");
            return (Criteria) this;
        }

        public Criteria andUsrT01IsNull() {
            addCriterion("usr_t01 is null");
            return (Criteria) this;
        }

        public Criteria andUsrT01IsNotNull() {
            addCriterion("usr_t01 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrT01EqualTo(String value) {
            addCriterion("usr_t01 =", value, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01NotEqualTo(String value) {
            addCriterion("usr_t01 <>", value, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01GreaterThan(String value) {
            addCriterion("usr_t01 >", value, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01GreaterThanOrEqualTo(String value) {
            addCriterion("usr_t01 >=", value, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01LessThan(String value) {
            addCriterion("usr_t01 <", value, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01LessThanOrEqualTo(String value) {
            addCriterion("usr_t01 <=", value, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01Like(String value) {
            addCriterion("usr_t01 like", value, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01NotLike(String value) {
            addCriterion("usr_t01 not like", value, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01In(List<String> values) {
            addCriterion("usr_t01 in", values, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01NotIn(List<String> values) {
            addCriterion("usr_t01 not in", values, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01Between(String value1, String value2) {
            addCriterion("usr_t01 between", value1, value2, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT01NotBetween(String value1, String value2) {
            addCriterion("usr_t01 not between", value1, value2, "usrT01");
            return (Criteria) this;
        }

        public Criteria andUsrT02IsNull() {
            addCriterion("usr_t02 is null");
            return (Criteria) this;
        }

        public Criteria andUsrT02IsNotNull() {
            addCriterion("usr_t02 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrT02EqualTo(String value) {
            addCriterion("usr_t02 =", value, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02NotEqualTo(String value) {
            addCriterion("usr_t02 <>", value, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02GreaterThan(String value) {
            addCriterion("usr_t02 >", value, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02GreaterThanOrEqualTo(String value) {
            addCriterion("usr_t02 >=", value, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02LessThan(String value) {
            addCriterion("usr_t02 <", value, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02LessThanOrEqualTo(String value) {
            addCriterion("usr_t02 <=", value, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02Like(String value) {
            addCriterion("usr_t02 like", value, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02NotLike(String value) {
            addCriterion("usr_t02 not like", value, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02In(List<String> values) {
            addCriterion("usr_t02 in", values, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02NotIn(List<String> values) {
            addCriterion("usr_t02 not in", values, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02Between(String value1, String value2) {
            addCriterion("usr_t02 between", value1, value2, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT02NotBetween(String value1, String value2) {
            addCriterion("usr_t02 not between", value1, value2, "usrT02");
            return (Criteria) this;
        }

        public Criteria andUsrT03IsNull() {
            addCriterion("usr_t03 is null");
            return (Criteria) this;
        }

        public Criteria andUsrT03IsNotNull() {
            addCriterion("usr_t03 is not null");
            return (Criteria) this;
        }

        public Criteria andUsrT03EqualTo(String value) {
            addCriterion("usr_t03 =", value, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03NotEqualTo(String value) {
            addCriterion("usr_t03 <>", value, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03GreaterThan(String value) {
            addCriterion("usr_t03 >", value, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03GreaterThanOrEqualTo(String value) {
            addCriterion("usr_t03 >=", value, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03LessThan(String value) {
            addCriterion("usr_t03 <", value, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03LessThanOrEqualTo(String value) {
            addCriterion("usr_t03 <=", value, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03Like(String value) {
            addCriterion("usr_t03 like", value, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03NotLike(String value) {
            addCriterion("usr_t03 not like", value, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03In(List<String> values) {
            addCriterion("usr_t03 in", values, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03NotIn(List<String> values) {
            addCriterion("usr_t03 not in", values, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03Between(String value1, String value2) {
            addCriterion("usr_t03 between", value1, value2, "usrT03");
            return (Criteria) this;
        }

        public Criteria andUsrT03NotBetween(String value1, String value2) {
            addCriterion("usr_t03 not between", value1, value2, "usrT03");
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