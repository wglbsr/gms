package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUserNoIsNull() {
            addCriterion("user_no is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("user_no is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("user_no =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("user_no <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("user_no >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("user_no >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("user_no <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("user_no <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("user_no like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("user_no not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("user_no in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("user_no not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("user_no between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("user_no not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNull() {
            addCriterion("user_pass is null");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNotNull() {
            addCriterion("user_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUserPassEqualTo(String value) {
            addCriterion("user_pass =", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotEqualTo(String value) {
            addCriterion("user_pass <>", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThan(String value) {
            addCriterion("user_pass >", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThanOrEqualTo(String value) {
            addCriterion("user_pass >=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThan(String value) {
            addCriterion("user_pass <", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThanOrEqualTo(String value) {
            addCriterion("user_pass <=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLike(String value) {
            addCriterion("user_pass like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotLike(String value) {
            addCriterion("user_pass not like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassIn(List<String> values) {
            addCriterion("user_pass in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotIn(List<String> values) {
            addCriterion("user_pass not in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassBetween(String value1, String value2) {
            addCriterion("user_pass between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotBetween(String value1, String value2) {
            addCriterion("user_pass not between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserCusIsNull() {
            addCriterion("user_cus is null");
            return (Criteria) this;
        }

        public Criteria andUserCusIsNotNull() {
            addCriterion("user_cus is not null");
            return (Criteria) this;
        }

        public Criteria andUserCusEqualTo(String value) {
            addCriterion("user_cus =", value, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusNotEqualTo(String value) {
            addCriterion("user_cus <>", value, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusGreaterThan(String value) {
            addCriterion("user_cus >", value, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusGreaterThanOrEqualTo(String value) {
            addCriterion("user_cus >=", value, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusLessThan(String value) {
            addCriterion("user_cus <", value, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusLessThanOrEqualTo(String value) {
            addCriterion("user_cus <=", value, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusLike(String value) {
            addCriterion("user_cus like", value, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusNotLike(String value) {
            addCriterion("user_cus not like", value, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusIn(List<String> values) {
            addCriterion("user_cus in", values, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusNotIn(List<String> values) {
            addCriterion("user_cus not in", values, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusBetween(String value1, String value2) {
            addCriterion("user_cus between", value1, value2, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserCusNotBetween(String value1, String value2) {
            addCriterion("user_cus not between", value1, value2, "userCus");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andParentCusNoIsNull() {
            addCriterion("s_parent_cus_no is null");
            return (Criteria) this;
        }

        public Criteria andParentCusNoIsNotNull() {
            addCriterion("s_parent_cus_no is not null");
            return (Criteria) this;
        }

        public Criteria andParentCusNoEqualTo(String value) {
            addCriterion("s_parent_cus_no =", value, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoNotEqualTo(String value) {
            addCriterion("s_parent_cus_no <>", value, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoGreaterThan(String value) {
            addCriterion("s_parent_cus_no >", value, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoGreaterThanOrEqualTo(String value) {
            addCriterion("s_parent_cus_no >=", value, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoLessThan(String value) {
            addCriterion("s_parent_cus_no <", value, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoLessThanOrEqualTo(String value) {
            addCriterion("s_parent_cus_no <=", value, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoLike(String value) {
            addCriterion("s_parent_cus_no like", value, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoNotLike(String value) {
            addCriterion("s_parent_cus_no not like", value, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoIn(List<String> values) {
            addCriterion("s_parent_cus_no in", values, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoNotIn(List<String> values) {
            addCriterion("s_parent_cus_no not in", values, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoBetween(String value1, String value2) {
            addCriterion("s_parent_cus_no between", value1, value2, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andParentCusNoNotBetween(String value1, String value2) {
            addCriterion("s_parent_cus_no not between", value1, value2, "parentCusNo");
            return (Criteria) this;
        }

        public Criteria andUsernameCnIsNull() {
            addCriterion("s_username_cn is null");
            return (Criteria) this;
        }

        public Criteria andUsernameCnIsNotNull() {
            addCriterion("s_username_cn is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameCnEqualTo(String value) {
            addCriterion("s_username_cn =", value, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnNotEqualTo(String value) {
            addCriterion("s_username_cn <>", value, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnGreaterThan(String value) {
            addCriterion("s_username_cn >", value, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnGreaterThanOrEqualTo(String value) {
            addCriterion("s_username_cn >=", value, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnLessThan(String value) {
            addCriterion("s_username_cn <", value, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnLessThanOrEqualTo(String value) {
            addCriterion("s_username_cn <=", value, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnLike(String value) {
            addCriterion("s_username_cn like", value, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnNotLike(String value) {
            addCriterion("s_username_cn not like", value, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnIn(List<String> values) {
            addCriterion("s_username_cn in", values, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnNotIn(List<String> values) {
            addCriterion("s_username_cn not in", values, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnBetween(String value1, String value2) {
            addCriterion("s_username_cn between", value1, value2, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andUsernameCnNotBetween(String value1, String value2) {
            addCriterion("s_username_cn not between", value1, value2, "usernameCn");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("d_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("d_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("d_create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("d_create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("d_create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("d_create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("d_create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("d_create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("d_create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("b_deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("b_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("b_deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("b_deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("b_deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("b_deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("b_deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("b_deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("b_deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("b_deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("b_deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("b_deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("d_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("d_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("d_modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("d_modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("d_modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("d_modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("d_modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("d_modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("d_modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("d_modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("d_modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("d_modify_time not between", value1, value2, "modifyTime");
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