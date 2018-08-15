package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnumerationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnumerationExample() {
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
            addCriterion("i_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("i_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Byte value) {
            addCriterion("i_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Byte value) {
            addCriterion("i_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Byte value) {
            addCriterion("i_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("i_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Byte value) {
            addCriterion("i_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Byte value) {
            addCriterion("i_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Byte> values) {
            addCriterion("i_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Byte> values) {
            addCriterion("i_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Byte value1, Byte value2) {
            addCriterion("i_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Byte value1, Byte value2) {
            addCriterion("i_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextIsNull() {
            addCriterion("s_enum_value_text is null");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextIsNotNull() {
            addCriterion("s_enum_value_text is not null");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextEqualTo(String value) {
            addCriterion("s_enum_value_text =", value, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextNotEqualTo(String value) {
            addCriterion("s_enum_value_text <>", value, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextGreaterThan(String value) {
            addCriterion("s_enum_value_text >", value, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextGreaterThanOrEqualTo(String value) {
            addCriterion("s_enum_value_text >=", value, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextLessThan(String value) {
            addCriterion("s_enum_value_text <", value, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextLessThanOrEqualTo(String value) {
            addCriterion("s_enum_value_text <=", value, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextLike(String value) {
            addCriterion("s_enum_value_text like", value, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextNotLike(String value) {
            addCriterion("s_enum_value_text not like", value, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextIn(List<String> values) {
            addCriterion("s_enum_value_text in", values, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextNotIn(List<String> values) {
            addCriterion("s_enum_value_text not in", values, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextBetween(String value1, String value2) {
            addCriterion("s_enum_value_text between", value1, value2, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueTextNotBetween(String value1, String value2) {
            addCriterion("s_enum_value_text not between", value1, value2, "enumValueText");
            return (Criteria) this;
        }

        public Criteria andEnumValueIsNull() {
            addCriterion("i_enum_value is null");
            return (Criteria) this;
        }

        public Criteria andEnumValueIsNotNull() {
            addCriterion("i_enum_value is not null");
            return (Criteria) this;
        }

        public Criteria andEnumValueEqualTo(Byte value) {
            addCriterion("i_enum_value =", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueNotEqualTo(Byte value) {
            addCriterion("i_enum_value <>", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueGreaterThan(Byte value) {
            addCriterion("i_enum_value >", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueGreaterThanOrEqualTo(Byte value) {
            addCriterion("i_enum_value >=", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueLessThan(Byte value) {
            addCriterion("i_enum_value <", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueLessThanOrEqualTo(Byte value) {
            addCriterion("i_enum_value <=", value, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueIn(List<Byte> values) {
            addCriterion("i_enum_value in", values, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueNotIn(List<Byte> values) {
            addCriterion("i_enum_value not in", values, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueBetween(Byte value1, Byte value2) {
            addCriterion("i_enum_value between", value1, value2, "enumValue");
            return (Criteria) this;
        }

        public Criteria andEnumValueNotBetween(Byte value1, Byte value2) {
            addCriterion("i_enum_value not between", value1, value2, "enumValue");
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

        public Criteria andModifyUserIsNull() {
            addCriterion("i_modify_user is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("i_modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(Integer value) {
            addCriterion("i_modify_user =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(Integer value) {
            addCriterion("i_modify_user <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(Integer value) {
            addCriterion("i_modify_user >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_modify_user >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(Integer value) {
            addCriterion("i_modify_user <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(Integer value) {
            addCriterion("i_modify_user <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<Integer> values) {
            addCriterion("i_modify_user in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<Integer> values) {
            addCriterion("i_modify_user not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(Integer value1, Integer value2) {
            addCriterion("i_modify_user between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(Integer value1, Integer value2) {
            addCriterion("i_modify_user not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("i_create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("i_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("i_create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("i_create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("i_create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("i_create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("i_create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("i_create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("i_create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("i_create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("i_create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andColumnKeyIsNull() {
            addCriterion("s_column_key is null");
            return (Criteria) this;
        }

        public Criteria andColumnKeyIsNotNull() {
            addCriterion("s_column_key is not null");
            return (Criteria) this;
        }

        public Criteria andColumnKeyEqualTo(String value) {
            addCriterion("s_column_key =", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyNotEqualTo(String value) {
            addCriterion("s_column_key <>", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyGreaterThan(String value) {
            addCriterion("s_column_key >", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyGreaterThanOrEqualTo(String value) {
            addCriterion("s_column_key >=", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyLessThan(String value) {
            addCriterion("s_column_key <", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyLessThanOrEqualTo(String value) {
            addCriterion("s_column_key <=", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyLike(String value) {
            addCriterion("s_column_key like", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyNotLike(String value) {
            addCriterion("s_column_key not like", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyIn(List<String> values) {
            addCriterion("s_column_key in", values, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyNotIn(List<String> values) {
            addCriterion("s_column_key not in", values, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyBetween(String value1, String value2) {
            addCriterion("s_column_key between", value1, value2, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyNotBetween(String value1, String value2) {
            addCriterion("s_column_key not between", value1, value2, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnTextIsNull() {
            addCriterion("s_column_text is null");
            return (Criteria) this;
        }

        public Criteria andColumnTextIsNotNull() {
            addCriterion("s_column_text is not null");
            return (Criteria) this;
        }

        public Criteria andColumnTextEqualTo(String value) {
            addCriterion("s_column_text =", value, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextNotEqualTo(String value) {
            addCriterion("s_column_text <>", value, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextGreaterThan(String value) {
            addCriterion("s_column_text >", value, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextGreaterThanOrEqualTo(String value) {
            addCriterion("s_column_text >=", value, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextLessThan(String value) {
            addCriterion("s_column_text <", value, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextLessThanOrEqualTo(String value) {
            addCriterion("s_column_text <=", value, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextLike(String value) {
            addCriterion("s_column_text like", value, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextNotLike(String value) {
            addCriterion("s_column_text not like", value, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextIn(List<String> values) {
            addCriterion("s_column_text in", values, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextNotIn(List<String> values) {
            addCriterion("s_column_text not in", values, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextBetween(String value1, String value2) {
            addCriterion("s_column_text between", value1, value2, "columnText");
            return (Criteria) this;
        }

        public Criteria andColumnTextNotBetween(String value1, String value2) {
            addCriterion("s_column_text not between", value1, value2, "columnText");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("s_remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("s_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("s_remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("s_remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("s_remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("s_remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("s_remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("s_remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("s_remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("s_remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("s_remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("s_remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("s_remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("s_remark not between", value1, value2, "remark");
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