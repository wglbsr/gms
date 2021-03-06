package com.dyny.gms.db.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LankExample() {
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

        public Criteria andStIdIsNull() {
            addCriterion("st_id is null");
            return (Criteria) this;
        }

        public Criteria andStIdIsNotNull() {
            addCriterion("st_id is not null");
            return (Criteria) this;
        }

        public Criteria andStIdEqualTo(Integer value) {
            addCriterion("st_id =", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotEqualTo(Integer value) {
            addCriterion("st_id <>", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThan(Integer value) {
            addCriterion("st_id >", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_id >=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThan(Integer value) {
            addCriterion("st_id <", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdLessThanOrEqualTo(Integer value) {
            addCriterion("st_id <=", value, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdIn(List<Integer> values) {
            addCriterion("st_id in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotIn(List<Integer> values) {
            addCriterion("st_id not in", values, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdBetween(Integer value1, Integer value2) {
            addCriterion("st_id between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStIdNotBetween(Integer value1, Integer value2) {
            addCriterion("st_id not between", value1, value2, "stId");
            return (Criteria) this;
        }

        public Criteria andStNoIsNull() {
            addCriterion("st_no is null");
            return (Criteria) this;
        }

        public Criteria andStNoIsNotNull() {
            addCriterion("st_no is not null");
            return (Criteria) this;
        }

        public Criteria andStNoEqualTo(String value) {
            addCriterion("st_no =", value, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoNotEqualTo(String value) {
            addCriterion("st_no <>", value, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoGreaterThan(String value) {
            addCriterion("st_no >", value, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoGreaterThanOrEqualTo(String value) {
            addCriterion("st_no >=", value, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoLessThan(String value) {
            addCriterion("st_no <", value, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoLessThanOrEqualTo(String value) {
            addCriterion("st_no <=", value, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoLike(String value) {
            addCriterion("st_no like", value, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoNotLike(String value) {
            addCriterion("st_no not like", value, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoIn(List<String> values) {
            addCriterion("st_no in", values, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoNotIn(List<String> values) {
            addCriterion("st_no not in", values, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoBetween(String value1, String value2) {
            addCriterion("st_no between", value1, value2, "stNo");
            return (Criteria) this;
        }

        public Criteria andStNoNotBetween(String value1, String value2) {
            addCriterion("st_no not between", value1, value2, "stNo");
            return (Criteria) this;
        }

        public Criteria andMachNoIsNull() {
            addCriterion("mach_no is null");
            return (Criteria) this;
        }

        public Criteria andMachNoIsNotNull() {
            addCriterion("mach_no is not null");
            return (Criteria) this;
        }

        public Criteria andMachNoEqualTo(String value) {
            addCriterion("mach_no =", value, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoNotEqualTo(String value) {
            addCriterion("mach_no <>", value, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoGreaterThan(String value) {
            addCriterion("mach_no >", value, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoGreaterThanOrEqualTo(String value) {
            addCriterion("mach_no >=", value, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoLessThan(String value) {
            addCriterion("mach_no <", value, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoLessThanOrEqualTo(String value) {
            addCriterion("mach_no <=", value, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoLike(String value) {
            addCriterion("mach_no like", value, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoNotLike(String value) {
            addCriterion("mach_no not like", value, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoIn(List<String> values) {
            addCriterion("mach_no in", values, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoNotIn(List<String> values) {
            addCriterion("mach_no not in", values, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoBetween(String value1, String value2) {
            addCriterion("mach_no between", value1, value2, "machNo");
            return (Criteria) this;
        }

        public Criteria andMachNoNotBetween(String value1, String value2) {
            addCriterion("mach_no not between", value1, value2, "machNo");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andStartNumIsNull() {
            addCriterion("start_num is null");
            return (Criteria) this;
        }

        public Criteria andStartNumIsNotNull() {
            addCriterion("start_num is not null");
            return (Criteria) this;
        }

        public Criteria andStartNumEqualTo(BigDecimal value) {
            addCriterion("start_num =", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotEqualTo(BigDecimal value) {
            addCriterion("start_num <>", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumGreaterThan(BigDecimal value) {
            addCriterion("start_num >", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_num >=", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumLessThan(BigDecimal value) {
            addCriterion("start_num <", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_num <=", value, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumIn(List<BigDecimal> values) {
            addCriterion("start_num in", values, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotIn(List<BigDecimal> values) {
            addCriterion("start_num not in", values, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_num between", value1, value2, "startNum");
            return (Criteria) this;
        }

        public Criteria andStartNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_num not between", value1, value2, "startNum");
            return (Criteria) this;
        }

        public Criteria andEndNumIsNull() {
            addCriterion("end_num is null");
            return (Criteria) this;
        }

        public Criteria andEndNumIsNotNull() {
            addCriterion("end_num is not null");
            return (Criteria) this;
        }

        public Criteria andEndNumEqualTo(BigDecimal value) {
            addCriterion("end_num =", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumNotEqualTo(BigDecimal value) {
            addCriterion("end_num <>", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumGreaterThan(BigDecimal value) {
            addCriterion("end_num >", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("end_num >=", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumLessThan(BigDecimal value) {
            addCriterion("end_num <", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("end_num <=", value, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumIn(List<BigDecimal> values) {
            addCriterion("end_num in", values, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumNotIn(List<BigDecimal> values) {
            addCriterion("end_num not in", values, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_num between", value1, value2, "endNum");
            return (Criteria) this;
        }

        public Criteria andEndNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("end_num not between", value1, value2, "endNum");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoIsNull() {
            addCriterion("sum_volumeno is null");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoIsNotNull() {
            addCriterion("sum_volumeno is not null");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoEqualTo(BigDecimal value) {
            addCriterion("sum_volumeno =", value, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoNotEqualTo(BigDecimal value) {
            addCriterion("sum_volumeno <>", value, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoGreaterThan(BigDecimal value) {
            addCriterion("sum_volumeno >", value, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_volumeno >=", value, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoLessThan(BigDecimal value) {
            addCriterion("sum_volumeno <", value, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_volumeno <=", value, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoIn(List<BigDecimal> values) {
            addCriterion("sum_volumeno in", values, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoNotIn(List<BigDecimal> values) {
            addCriterion("sum_volumeno not in", values, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_volumeno between", value1, value2, "sumVolumeno");
            return (Criteria) this;
        }

        public Criteria andSumVolumenoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_volumeno not between", value1, value2, "sumVolumeno");
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