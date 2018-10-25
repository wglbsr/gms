package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarningTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarningTypeExample() {
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

        public Criteria andWarningTypeIsNull() {
            addCriterion("i_warning_type is null");
            return (Criteria) this;
        }

        public Criteria andWarningTypeIsNotNull() {
            addCriterion("i_warning_type is not null");
            return (Criteria) this;
        }

        public Criteria andWarningTypeEqualTo(Integer value) {
            addCriterion("i_warning_type =", value, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeNotEqualTo(Integer value) {
            addCriterion("i_warning_type <>", value, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeGreaterThan(Integer value) {
            addCriterion("i_warning_type >", value, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_warning_type >=", value, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeLessThan(Integer value) {
            addCriterion("i_warning_type <", value, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeLessThanOrEqualTo(Integer value) {
            addCriterion("i_warning_type <=", value, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeIn(List<Integer> values) {
            addCriterion("i_warning_type in", values, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeNotIn(List<Integer> values) {
            addCriterion("i_warning_type not in", values, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeBetween(Integer value1, Integer value2) {
            addCriterion("i_warning_type between", value1, value2, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("i_warning_type not between", value1, value2, "warningType");
            return (Criteria) this;
        }

        public Criteria andWarningNameIsNull() {
            addCriterion("s_warning_name is null");
            return (Criteria) this;
        }

        public Criteria andWarningNameIsNotNull() {
            addCriterion("s_warning_name is not null");
            return (Criteria) this;
        }

        public Criteria andWarningNameEqualTo(String value) {
            addCriterion("s_warning_name =", value, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameNotEqualTo(String value) {
            addCriterion("s_warning_name <>", value, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameGreaterThan(String value) {
            addCriterion("s_warning_name >", value, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_warning_name >=", value, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameLessThan(String value) {
            addCriterion("s_warning_name <", value, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameLessThanOrEqualTo(String value) {
            addCriterion("s_warning_name <=", value, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameLike(String value) {
            addCriterion("s_warning_name like", value, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameNotLike(String value) {
            addCriterion("s_warning_name not like", value, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameIn(List<String> values) {
            addCriterion("s_warning_name in", values, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameNotIn(List<String> values) {
            addCriterion("s_warning_name not in", values, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameBetween(String value1, String value2) {
            addCriterion("s_warning_name between", value1, value2, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningNameNotBetween(String value1, String value2) {
            addCriterion("s_warning_name not between", value1, value2, "warningName");
            return (Criteria) this;
        }

        public Criteria andWarningCodeIsNull() {
            addCriterion("s_warning_code is null");
            return (Criteria) this;
        }

        public Criteria andWarningCodeIsNotNull() {
            addCriterion("s_warning_code is not null");
            return (Criteria) this;
        }

        public Criteria andWarningCodeEqualTo(String value) {
            addCriterion("s_warning_code =", value, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeNotEqualTo(String value) {
            addCriterion("s_warning_code <>", value, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeGreaterThan(String value) {
            addCriterion("s_warning_code >", value, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeGreaterThanOrEqualTo(String value) {
            addCriterion("s_warning_code >=", value, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeLessThan(String value) {
            addCriterion("s_warning_code <", value, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeLessThanOrEqualTo(String value) {
            addCriterion("s_warning_code <=", value, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeLike(String value) {
            addCriterion("s_warning_code like", value, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeNotLike(String value) {
            addCriterion("s_warning_code not like", value, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeIn(List<String> values) {
            addCriterion("s_warning_code in", values, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeNotIn(List<String> values) {
            addCriterion("s_warning_code not in", values, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeBetween(String value1, String value2) {
            addCriterion("s_warning_code between", value1, value2, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningCodeNotBetween(String value1, String value2) {
            addCriterion("s_warning_code not between", value1, value2, "warningCode");
            return (Criteria) this;
        }

        public Criteria andWarningLevelIsNull() {
            addCriterion("i_warning_level is null");
            return (Criteria) this;
        }

        public Criteria andWarningLevelIsNotNull() {
            addCriterion("i_warning_level is not null");
            return (Criteria) this;
        }

        public Criteria andWarningLevelEqualTo(Integer value) {
            addCriterion("i_warning_level =", value, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelNotEqualTo(Integer value) {
            addCriterion("i_warning_level <>", value, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelGreaterThan(Integer value) {
            addCriterion("i_warning_level >", value, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_warning_level >=", value, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelLessThan(Integer value) {
            addCriterion("i_warning_level <", value, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelLessThanOrEqualTo(Integer value) {
            addCriterion("i_warning_level <=", value, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelIn(List<Integer> values) {
            addCriterion("i_warning_level in", values, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelNotIn(List<Integer> values) {
            addCriterion("i_warning_level not in", values, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelBetween(Integer value1, Integer value2) {
            addCriterion("i_warning_level between", value1, value2, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("i_warning_level not between", value1, value2, "warningLevel");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkIsNull() {
            addCriterion("s_warning_remark is null");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkIsNotNull() {
            addCriterion("s_warning_remark is not null");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkEqualTo(String value) {
            addCriterion("s_warning_remark =", value, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkNotEqualTo(String value) {
            addCriterion("s_warning_remark <>", value, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkGreaterThan(String value) {
            addCriterion("s_warning_remark >", value, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("s_warning_remark >=", value, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkLessThan(String value) {
            addCriterion("s_warning_remark <", value, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkLessThanOrEqualTo(String value) {
            addCriterion("s_warning_remark <=", value, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkLike(String value) {
            addCriterion("s_warning_remark like", value, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkNotLike(String value) {
            addCriterion("s_warning_remark not like", value, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkIn(List<String> values) {
            addCriterion("s_warning_remark in", values, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkNotIn(List<String> values) {
            addCriterion("s_warning_remark not in", values, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkBetween(String value1, String value2) {
            addCriterion("s_warning_remark between", value1, value2, "warningRemark");
            return (Criteria) this;
        }

        public Criteria andWarningRemarkNotBetween(String value1, String value2) {
            addCriterion("s_warning_remark not between", value1, value2, "warningRemark");
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

        public Criteria andLimitIsNull() {
            addCriterion("f_limit is null");
            return (Criteria) this;
        }

        public Criteria andLimitIsNotNull() {
            addCriterion("f_limit is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEqualTo(Double value) {
            addCriterion("f_limit =", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotEqualTo(Double value) {
            addCriterion("f_limit <>", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThan(Double value) {
            addCriterion("f_limit >", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("f_limit >=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThan(Double value) {
            addCriterion("f_limit <", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitLessThanOrEqualTo(Double value) {
            addCriterion("f_limit <=", value, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitIn(List<Double> values) {
            addCriterion("f_limit in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotIn(List<Double> values) {
            addCriterion("f_limit not in", values, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitBetween(Double value1, Double value2) {
            addCriterion("f_limit between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andLimitNotBetween(Double value1, Double value2) {
            addCriterion("f_limit not between", value1, value2, "limit");
            return (Criteria) this;
        }

        public Criteria andOverIsNull() {
            addCriterion("b_over is null");
            return (Criteria) this;
        }

        public Criteria andOverIsNotNull() {
            addCriterion("b_over is not null");
            return (Criteria) this;
        }

        public Criteria andOverEqualTo(Boolean value) {
            addCriterion("b_over =", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotEqualTo(Boolean value) {
            addCriterion("b_over <>", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverGreaterThan(Boolean value) {
            addCriterion("b_over >", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverGreaterThanOrEqualTo(Boolean value) {
            addCriterion("b_over >=", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverLessThan(Boolean value) {
            addCriterion("b_over <", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverLessThanOrEqualTo(Boolean value) {
            addCriterion("b_over <=", value, "over");
            return (Criteria) this;
        }

        public Criteria andOverIn(List<Boolean> values) {
            addCriterion("b_over in", values, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotIn(List<Boolean> values) {
            addCriterion("b_over not in", values, "over");
            return (Criteria) this;
        }

        public Criteria andOverBetween(Boolean value1, Boolean value2) {
            addCriterion("b_over between", value1, value2, "over");
            return (Criteria) this;
        }

        public Criteria andOverNotBetween(Boolean value1, Boolean value2) {
            addCriterion("b_over not between", value1, value2, "over");
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