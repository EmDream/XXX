package com.tydic.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTeleTypeIsNull() {
            addCriterion("TELE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTeleTypeIsNotNull() {
            addCriterion("TELE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTeleTypeEqualTo(String value) {
            addCriterion("TELE_TYPE =", value, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeNotEqualTo(String value) {
            addCriterion("TELE_TYPE <>", value, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeGreaterThan(String value) {
            addCriterion("TELE_TYPE >", value, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TELE_TYPE >=", value, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeLessThan(String value) {
            addCriterion("TELE_TYPE <", value, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeLessThanOrEqualTo(String value) {
            addCriterion("TELE_TYPE <=", value, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeLike(String value) {
            addCriterion("TELE_TYPE like", value, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeNotLike(String value) {
            addCriterion("TELE_TYPE not like", value, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeIn(List<String> values) {
            addCriterion("TELE_TYPE in", values, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeNotIn(List<String> values) {
            addCriterion("TELE_TYPE not in", values, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeBetween(String value1, String value2) {
            addCriterion("TELE_TYPE between", value1, value2, "teleType");
            return (Criteria) this;
        }

        public Criteria andTeleTypeNotBetween(String value1, String value2) {
            addCriterion("TELE_TYPE not between", value1, value2, "teleType");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNull() {
            addCriterion("DEVICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIsNotNull() {
            addCriterion("DEVICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberEqualTo(String value) {
            addCriterion("DEVICE_NUMBER =", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotEqualTo(String value) {
            addCriterion("DEVICE_NUMBER <>", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThan(String value) {
            addCriterion("DEVICE_NUMBER >", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMBER >=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThan(String value) {
            addCriterion("DEVICE_NUMBER <", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_NUMBER <=", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberLike(String value) {
            addCriterion("DEVICE_NUMBER like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotLike(String value) {
            addCriterion("DEVICE_NUMBER not like", value, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberIn(List<String> values) {
            addCriterion("DEVICE_NUMBER in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotIn(List<String> values) {
            addCriterion("DEVICE_NUMBER not in", values, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMBER between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andDeviceNumberNotBetween(String value1, String value2) {
            addCriterion("DEVICE_NUMBER not between", value1, value2, "deviceNumber");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("USER_STATUS =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("USER_STATUS <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("USER_STATUS >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATUS >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("USER_STATUS <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("USER_STATUS <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("USER_STATUS like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("USER_STATUS not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("USER_STATUS in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("USER_STATUS not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("USER_STATUS between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("USER_STATUS not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateIsNull() {
            addCriterion("ACTIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActiveDateIsNotNull() {
            addCriterion("ACTIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveDateEqualTo(Date value) {
            addCriterion("ACTIVE_DATE =", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotEqualTo(Date value) {
            addCriterion("ACTIVE_DATE <>", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateGreaterThan(Date value) {
            addCriterion("ACTIVE_DATE >", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTIVE_DATE >=", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateLessThan(Date value) {
            addCriterion("ACTIVE_DATE <", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateLessThanOrEqualTo(Date value) {
            addCriterion("ACTIVE_DATE <=", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateIn(List<Date> values) {
            addCriterion("ACTIVE_DATE in", values, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotIn(List<Date> values) {
            addCriterion("ACTIVE_DATE not in", values, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateBetween(Date value1, Date value2) {
            addCriterion("ACTIVE_DATE between", value1, value2, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotBetween(Date value1, Date value2) {
            addCriterion("ACTIVE_DATE not between", value1, value2, "activeDate");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagIsNull() {
            addCriterion("PREPAY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagIsNotNull() {
            addCriterion("PREPAY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagEqualTo(String value) {
            addCriterion("PREPAY_FLAG =", value, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagNotEqualTo(String value) {
            addCriterion("PREPAY_FLAG <>", value, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagGreaterThan(String value) {
            addCriterion("PREPAY_FLAG >", value, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PREPAY_FLAG >=", value, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagLessThan(String value) {
            addCriterion("PREPAY_FLAG <", value, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagLessThanOrEqualTo(String value) {
            addCriterion("PREPAY_FLAG <=", value, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagLike(String value) {
            addCriterion("PREPAY_FLAG like", value, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagNotLike(String value) {
            addCriterion("PREPAY_FLAG not like", value, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagIn(List<String> values) {
            addCriterion("PREPAY_FLAG in", values, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagNotIn(List<String> values) {
            addCriterion("PREPAY_FLAG not in", values, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagBetween(String value1, String value2) {
            addCriterion("PREPAY_FLAG between", value1, value2, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andPrepayFlagNotBetween(String value1, String value2) {
            addCriterion("PREPAY_FLAG not between", value1, value2, "prepayFlag");
            return (Criteria) this;
        }

        public Criteria andLocalNetIsNull() {
            addCriterion("LOCAL_NET is null");
            return (Criteria) this;
        }

        public Criteria andLocalNetIsNotNull() {
            addCriterion("LOCAL_NET is not null");
            return (Criteria) this;
        }

        public Criteria andLocalNetEqualTo(String value) {
            addCriterion("LOCAL_NET =", value, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetNotEqualTo(String value) {
            addCriterion("LOCAL_NET <>", value, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetGreaterThan(String value) {
            addCriterion("LOCAL_NET >", value, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetGreaterThanOrEqualTo(String value) {
            addCriterion("LOCAL_NET >=", value, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetLessThan(String value) {
            addCriterion("LOCAL_NET <", value, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetLessThanOrEqualTo(String value) {
            addCriterion("LOCAL_NET <=", value, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetLike(String value) {
            addCriterion("LOCAL_NET like", value, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetNotLike(String value) {
            addCriterion("LOCAL_NET not like", value, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetIn(List<String> values) {
            addCriterion("LOCAL_NET in", values, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetNotIn(List<String> values) {
            addCriterion("LOCAL_NET not in", values, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetBetween(String value1, String value2) {
            addCriterion("LOCAL_NET between", value1, value2, "localNet");
            return (Criteria) this;
        }

        public Criteria andLocalNetNotBetween(String value1, String value2) {
            addCriterion("LOCAL_NET not between", value1, value2, "localNet");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdIsNull() {
            addCriterion("DEVELOP_CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdIsNotNull() {
            addCriterion("DEVELOP_CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdEqualTo(String value) {
            addCriterion("DEVELOP_CHANNEL_ID =", value, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdNotEqualTo(String value) {
            addCriterion("DEVELOP_CHANNEL_ID <>", value, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdGreaterThan(String value) {
            addCriterion("DEVELOP_CHANNEL_ID >", value, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEVELOP_CHANNEL_ID >=", value, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdLessThan(String value) {
            addCriterion("DEVELOP_CHANNEL_ID <", value, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdLessThanOrEqualTo(String value) {
            addCriterion("DEVELOP_CHANNEL_ID <=", value, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdLike(String value) {
            addCriterion("DEVELOP_CHANNEL_ID like", value, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdNotLike(String value) {
            addCriterion("DEVELOP_CHANNEL_ID not like", value, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdIn(List<String> values) {
            addCriterion("DEVELOP_CHANNEL_ID in", values, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdNotIn(List<String> values) {
            addCriterion("DEVELOP_CHANNEL_ID not in", values, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdBetween(String value1, String value2) {
            addCriterion("DEVELOP_CHANNEL_ID between", value1, value2, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andDevelopChannelIdNotBetween(String value1, String value2) {
            addCriterion("DEVELOP_CHANNEL_ID not between", value1, value2, "developChannelId");
            return (Criteria) this;
        }

        public Criteria andProtoFlagIsNull() {
            addCriterion("PROTO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andProtoFlagIsNotNull() {
            addCriterion("PROTO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andProtoFlagEqualTo(String value) {
            addCriterion("PROTO_FLAG =", value, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagNotEqualTo(String value) {
            addCriterion("PROTO_FLAG <>", value, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagGreaterThan(String value) {
            addCriterion("PROTO_FLAG >", value, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PROTO_FLAG >=", value, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagLessThan(String value) {
            addCriterion("PROTO_FLAG <", value, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagLessThanOrEqualTo(String value) {
            addCriterion("PROTO_FLAG <=", value, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagLike(String value) {
            addCriterion("PROTO_FLAG like", value, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagNotLike(String value) {
            addCriterion("PROTO_FLAG not like", value, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagIn(List<String> values) {
            addCriterion("PROTO_FLAG in", values, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagNotIn(List<String> values) {
            addCriterion("PROTO_FLAG not in", values, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagBetween(String value1, String value2) {
            addCriterion("PROTO_FLAG between", value1, value2, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andProtoFlagNotBetween(String value1, String value2) {
            addCriterion("PROTO_FLAG not between", value1, value2, "protoFlag");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusIsNull() {
            addCriterion("SUB_USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusIsNotNull() {
            addCriterion("SUB_USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusEqualTo(String value) {
            addCriterion("SUB_USER_STATUS =", value, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusNotEqualTo(String value) {
            addCriterion("SUB_USER_STATUS <>", value, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusGreaterThan(String value) {
            addCriterion("SUB_USER_STATUS >", value, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_USER_STATUS >=", value, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusLessThan(String value) {
            addCriterion("SUB_USER_STATUS <", value, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusLessThanOrEqualTo(String value) {
            addCriterion("SUB_USER_STATUS <=", value, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusLike(String value) {
            addCriterion("SUB_USER_STATUS like", value, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusNotLike(String value) {
            addCriterion("SUB_USER_STATUS not like", value, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusIn(List<String> values) {
            addCriterion("SUB_USER_STATUS in", values, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusNotIn(List<String> values) {
            addCriterion("SUB_USER_STATUS not in", values, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusBetween(String value1, String value2) {
            addCriterion("SUB_USER_STATUS between", value1, value2, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andSubUserStatusNotBetween(String value1, String value2) {
            addCriterion("SUB_USER_STATUS not between", value1, value2, "subUserStatus");
            return (Criteria) this;
        }

        public Criteria andStopDateIsNull() {
            addCriterion("STOP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStopDateIsNotNull() {
            addCriterion("STOP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStopDateEqualTo(Date value) {
            addCriterion("STOP_DATE =", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotEqualTo(Date value) {
            addCriterion("STOP_DATE <>", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateGreaterThan(Date value) {
            addCriterion("STOP_DATE >", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateGreaterThanOrEqualTo(Date value) {
            addCriterion("STOP_DATE >=", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateLessThan(Date value) {
            addCriterion("STOP_DATE <", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateLessThanOrEqualTo(Date value) {
            addCriterion("STOP_DATE <=", value, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateIn(List<Date> values) {
            addCriterion("STOP_DATE in", values, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotIn(List<Date> values) {
            addCriterion("STOP_DATE not in", values, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateBetween(Date value1, Date value2) {
            addCriterion("STOP_DATE between", value1, value2, "stopDate");
            return (Criteria) this;
        }

        public Criteria andStopDateNotBetween(Date value1, Date value2) {
            addCriterion("STOP_DATE not between", value1, value2, "stopDate");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNull() {
            addCriterion("VALID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNotNull() {
            addCriterion("VALID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidFlagEqualTo(String value) {
            addCriterion("VALID_FLAG =", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotEqualTo(String value) {
            addCriterion("VALID_FLAG <>", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThan(String value) {
            addCriterion("VALID_FLAG >", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_FLAG >=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThan(String value) {
            addCriterion("VALID_FLAG <", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThanOrEqualTo(String value) {
            addCriterion("VALID_FLAG <=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLike(String value) {
            addCriterion("VALID_FLAG like", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotLike(String value) {
            addCriterion("VALID_FLAG not like", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagIn(List<String> values) {
            addCriterion("VALID_FLAG in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotIn(List<String> values) {
            addCriterion("VALID_FLAG not in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagBetween(String value1, String value2) {
            addCriterion("VALID_FLAG between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotBetween(String value1, String value2) {
            addCriterion("VALID_FLAG not between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("PRODUCT_ID like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("PRODUCT_ID not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeIsNull() {
            addCriterion("OPERATORS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeIsNotNull() {
            addCriterion("OPERATORS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeEqualTo(String value) {
            addCriterion("OPERATORS_TYPE =", value, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeNotEqualTo(String value) {
            addCriterion("OPERATORS_TYPE <>", value, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeGreaterThan(String value) {
            addCriterion("OPERATORS_TYPE >", value, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATORS_TYPE >=", value, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeLessThan(String value) {
            addCriterion("OPERATORS_TYPE <", value, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeLessThanOrEqualTo(String value) {
            addCriterion("OPERATORS_TYPE <=", value, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeLike(String value) {
            addCriterion("OPERATORS_TYPE like", value, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeNotLike(String value) {
            addCriterion("OPERATORS_TYPE not like", value, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeIn(List<String> values) {
            addCriterion("OPERATORS_TYPE in", values, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeNotIn(List<String> values) {
            addCriterion("OPERATORS_TYPE not in", values, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeBetween(String value1, String value2) {
            addCriterion("OPERATORS_TYPE between", value1, value2, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andOperatorsTypeNotBetween(String value1, String value2) {
            addCriterion("OPERATORS_TYPE not between", value1, value2, "operatorsType");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdIsNull() {
            addCriterion("MAIN_OFR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdIsNotNull() {
            addCriterion("MAIN_OFR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdEqualTo(String value) {
            addCriterion("MAIN_OFR_ID =", value, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdNotEqualTo(String value) {
            addCriterion("MAIN_OFR_ID <>", value, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdGreaterThan(String value) {
            addCriterion("MAIN_OFR_ID >", value, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_OFR_ID >=", value, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdLessThan(String value) {
            addCriterion("MAIN_OFR_ID <", value, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdLessThanOrEqualTo(String value) {
            addCriterion("MAIN_OFR_ID <=", value, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdLike(String value) {
            addCriterion("MAIN_OFR_ID like", value, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdNotLike(String value) {
            addCriterion("MAIN_OFR_ID not like", value, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdIn(List<String> values) {
            addCriterion("MAIN_OFR_ID in", values, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdNotIn(List<String> values) {
            addCriterion("MAIN_OFR_ID not in", values, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdBetween(String value1, String value2) {
            addCriterion("MAIN_OFR_ID between", value1, value2, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andMainOfrIdNotBetween(String value1, String value2) {
            addCriterion("MAIN_OFR_ID not between", value1, value2, "mainOfrId");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNull() {
            addCriterion("BRAND_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIsNotNull() {
            addCriterion("BRAND_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCodeEqualTo(String value) {
            addCriterion("BRAND_CODE =", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotEqualTo(String value) {
            addCriterion("BRAND_CODE <>", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThan(String value) {
            addCriterion("BRAND_CODE >", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_CODE >=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThan(String value) {
            addCriterion("BRAND_CODE <", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLessThanOrEqualTo(String value) {
            addCriterion("BRAND_CODE <=", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeLike(String value) {
            addCriterion("BRAND_CODE like", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotLike(String value) {
            addCriterion("BRAND_CODE not like", value, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeIn(List<String> values) {
            addCriterion("BRAND_CODE in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotIn(List<String> values) {
            addCriterion("BRAND_CODE not in", values, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeBetween(String value1, String value2) {
            addCriterion("BRAND_CODE between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andBrandCodeNotBetween(String value1, String value2) {
            addCriterion("BRAND_CODE not between", value1, value2, "brandCode");
            return (Criteria) this;
        }

        public Criteria andFlag4gIsNull() {
            addCriterion("FLAG_4G is null");
            return (Criteria) this;
        }

        public Criteria andFlag4gIsNotNull() {
            addCriterion("FLAG_4G is not null");
            return (Criteria) this;
        }

        public Criteria andFlag4gEqualTo(String value) {
            addCriterion("FLAG_4G =", value, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gNotEqualTo(String value) {
            addCriterion("FLAG_4G <>", value, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gGreaterThan(String value) {
            addCriterion("FLAG_4G >", value, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gGreaterThanOrEqualTo(String value) {
            addCriterion("FLAG_4G >=", value, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gLessThan(String value) {
            addCriterion("FLAG_4G <", value, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gLessThanOrEqualTo(String value) {
            addCriterion("FLAG_4G <=", value, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gLike(String value) {
            addCriterion("FLAG_4G like", value, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gNotLike(String value) {
            addCriterion("FLAG_4G not like", value, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gIn(List<String> values) {
            addCriterion("FLAG_4G in", values, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gNotIn(List<String> values) {
            addCriterion("FLAG_4G not in", values, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gBetween(String value1, String value2) {
            addCriterion("FLAG_4G between", value1, value2, "flag4g");
            return (Criteria) this;
        }

        public Criteria andFlag4gNotBetween(String value1, String value2) {
            addCriterion("FLAG_4G not between", value1, value2, "flag4g");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberIsNull() {
            addCriterion("DEVELOP_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberIsNotNull() {
            addCriterion("DEVELOP_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberEqualTo(String value) {
            addCriterion("DEVELOP_NUMBER =", value, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberNotEqualTo(String value) {
            addCriterion("DEVELOP_NUMBER <>", value, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberGreaterThan(String value) {
            addCriterion("DEVELOP_NUMBER >", value, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DEVELOP_NUMBER >=", value, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberLessThan(String value) {
            addCriterion("DEVELOP_NUMBER <", value, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberLessThanOrEqualTo(String value) {
            addCriterion("DEVELOP_NUMBER <=", value, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberLike(String value) {
            addCriterion("DEVELOP_NUMBER like", value, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberNotLike(String value) {
            addCriterion("DEVELOP_NUMBER not like", value, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberIn(List<String> values) {
            addCriterion("DEVELOP_NUMBER in", values, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberNotIn(List<String> values) {
            addCriterion("DEVELOP_NUMBER not in", values, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberBetween(String value1, String value2) {
            addCriterion("DEVELOP_NUMBER between", value1, value2, "developNumber");
            return (Criteria) this;
        }

        public Criteria andDevelopNumberNotBetween(String value1, String value2) {
            addCriterion("DEVELOP_NUMBER not between", value1, value2, "developNumber");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeIsNull() {
            addCriterion("THIRD_CHANNEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeIsNotNull() {
            addCriterion("THIRD_CHANNEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeEqualTo(String value) {
            addCriterion("THIRD_CHANNEL_CODE =", value, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeNotEqualTo(String value) {
            addCriterion("THIRD_CHANNEL_CODE <>", value, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeGreaterThan(String value) {
            addCriterion("THIRD_CHANNEL_CODE >", value, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_CHANNEL_CODE >=", value, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeLessThan(String value) {
            addCriterion("THIRD_CHANNEL_CODE <", value, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("THIRD_CHANNEL_CODE <=", value, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeLike(String value) {
            addCriterion("THIRD_CHANNEL_CODE like", value, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeNotLike(String value) {
            addCriterion("THIRD_CHANNEL_CODE not like", value, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeIn(List<String> values) {
            addCriterion("THIRD_CHANNEL_CODE in", values, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeNotIn(List<String> values) {
            addCriterion("THIRD_CHANNEL_CODE not in", values, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeBetween(String value1, String value2) {
            addCriterion("THIRD_CHANNEL_CODE between", value1, value2, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andThirdChannelCodeNotBetween(String value1, String value2) {
            addCriterion("THIRD_CHANNEL_CODE not between", value1, value2, "thirdChannelCode");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitIsNull() {
            addCriterion("USER_MON_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitIsNotNull() {
            addCriterion("USER_MON_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitEqualTo(BigDecimal value) {
            addCriterion("USER_MON_LIMIT =", value, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitNotEqualTo(BigDecimal value) {
            addCriterion("USER_MON_LIMIT <>", value, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitGreaterThan(BigDecimal value) {
            addCriterion("USER_MON_LIMIT >", value, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_MON_LIMIT >=", value, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitLessThan(BigDecimal value) {
            addCriterion("USER_MON_LIMIT <", value, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_MON_LIMIT <=", value, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitIn(List<BigDecimal> values) {
            addCriterion("USER_MON_LIMIT in", values, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitNotIn(List<BigDecimal> values) {
            addCriterion("USER_MON_LIMIT not in", values, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_MON_LIMIT between", value1, value2, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andUserMonLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_MON_LIMIT not between", value1, value2, "userMonLimit");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagIsNull() {
            addCriterion("MON_LIMIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagIsNotNull() {
            addCriterion("MON_LIMIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagEqualTo(String value) {
            addCriterion("MON_LIMIT_FLAG =", value, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagNotEqualTo(String value) {
            addCriterion("MON_LIMIT_FLAG <>", value, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagGreaterThan(String value) {
            addCriterion("MON_LIMIT_FLAG >", value, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagGreaterThanOrEqualTo(String value) {
            addCriterion("MON_LIMIT_FLAG >=", value, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagLessThan(String value) {
            addCriterion("MON_LIMIT_FLAG <", value, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagLessThanOrEqualTo(String value) {
            addCriterion("MON_LIMIT_FLAG <=", value, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagLike(String value) {
            addCriterion("MON_LIMIT_FLAG like", value, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagNotLike(String value) {
            addCriterion("MON_LIMIT_FLAG not like", value, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagIn(List<String> values) {
            addCriterion("MON_LIMIT_FLAG in", values, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagNotIn(List<String> values) {
            addCriterion("MON_LIMIT_FLAG not in", values, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagBetween(String value1, String value2) {
            addCriterion("MON_LIMIT_FLAG between", value1, value2, "monLimitFlag");
            return (Criteria) this;
        }

        public Criteria andMonLimitFlagNotBetween(String value1, String value2) {
            addCriterion("MON_LIMIT_FLAG not between", value1, value2, "monLimitFlag");
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