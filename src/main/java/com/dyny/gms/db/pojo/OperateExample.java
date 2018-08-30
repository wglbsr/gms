package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OperateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperateExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andOpNoIsNull() {
            addCriterion("op_no is null");
            return (Criteria) this;
        }

        public Criteria andOpNoIsNotNull() {
            addCriterion("op_no is not null");
            return (Criteria) this;
        }

        public Criteria andOpNoEqualTo(Integer value) {
            addCriterion("op_no =", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoNotEqualTo(Integer value) {
            addCriterion("op_no <>", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoGreaterThan(Integer value) {
            addCriterion("op_no >", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("op_no >=", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoLessThan(Integer value) {
            addCriterion("op_no <", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoLessThanOrEqualTo(Integer value) {
            addCriterion("op_no <=", value, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoIn(List<Integer> values) {
            addCriterion("op_no in", values, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoNotIn(List<Integer> values) {
            addCriterion("op_no not in", values, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoBetween(Integer value1, Integer value2) {
            addCriterion("op_no between", value1, value2, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNoNotBetween(Integer value1, Integer value2) {
            addCriterion("op_no not between", value1, value2, "opNo");
            return (Criteria) this;
        }

        public Criteria andOpNumIsNull() {
            addCriterion("op_num is null");
            return (Criteria) this;
        }

        public Criteria andOpNumIsNotNull() {
            addCriterion("op_num is not null");
            return (Criteria) this;
        }

        public Criteria andOpNumEqualTo(String value) {
            addCriterion("op_num =", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumNotEqualTo(String value) {
            addCriterion("op_num <>", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumGreaterThan(String value) {
            addCriterion("op_num >", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumGreaterThanOrEqualTo(String value) {
            addCriterion("op_num >=", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumLessThan(String value) {
            addCriterion("op_num <", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumLessThanOrEqualTo(String value) {
            addCriterion("op_num <=", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumLike(String value) {
            addCriterion("op_num like", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumNotLike(String value) {
            addCriterion("op_num not like", value, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumIn(List<String> values) {
            addCriterion("op_num in", values, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumNotIn(List<String> values) {
            addCriterion("op_num not in", values, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumBetween(String value1, String value2) {
            addCriterion("op_num between", value1, value2, "opNum");
            return (Criteria) this;
        }

        public Criteria andOpNumNotBetween(String value1, String value2) {
            addCriterion("op_num not between", value1, value2, "opNum");
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

        public Criteria andCreatPerIsNull() {
            addCriterion("creat_per is null");
            return (Criteria) this;
        }

        public Criteria andCreatPerIsNotNull() {
            addCriterion("creat_per is not null");
            return (Criteria) this;
        }

        public Criteria andCreatPerEqualTo(String value) {
            addCriterion("creat_per =", value, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerNotEqualTo(String value) {
            addCriterion("creat_per <>", value, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerGreaterThan(String value) {
            addCriterion("creat_per >", value, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerGreaterThanOrEqualTo(String value) {
            addCriterion("creat_per >=", value, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerLessThan(String value) {
            addCriterion("creat_per <", value, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerLessThanOrEqualTo(String value) {
            addCriterion("creat_per <=", value, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerLike(String value) {
            addCriterion("creat_per like", value, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerNotLike(String value) {
            addCriterion("creat_per not like", value, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerIn(List<String> values) {
            addCriterion("creat_per in", values, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerNotIn(List<String> values) {
            addCriterion("creat_per not in", values, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerBetween(String value1, String value2) {
            addCriterion("creat_per between", value1, value2, "creatPer");
            return (Criteria) this;
        }

        public Criteria andCreatPerNotBetween(String value1, String value2) {
            addCriterion("creat_per not between", value1, value2, "creatPer");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(Integer value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(Integer value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(Integer value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(Integer value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(Integer value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(Integer value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<Integer> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<Integer> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(Integer value1, Integer value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(Integer value1, Integer value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andExecuteIdIsNull() {
            addCriterion("i_execute_id is null");
            return (Criteria) this;
        }

        public Criteria andExecuteIdIsNotNull() {
            addCriterion("i_execute_id is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteIdEqualTo(Integer value) {
            addCriterion("i_execute_id =", value, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdNotEqualTo(Integer value) {
            addCriterion("i_execute_id <>", value, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdGreaterThan(Integer value) {
            addCriterion("i_execute_id >", value, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_execute_id >=", value, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdLessThan(Integer value) {
            addCriterion("i_execute_id <", value, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_execute_id <=", value, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdIn(List<Integer> values) {
            addCriterion("i_execute_id in", values, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdNotIn(List<Integer> values) {
            addCriterion("i_execute_id not in", values, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdBetween(Integer value1, Integer value2) {
            addCriterion("i_execute_id between", value1, value2, "executeId");
            return (Criteria) this;
        }

        public Criteria andExecuteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_execute_id not between", value1, value2, "executeId");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeIsNull() {
            addCriterion("t_actual_execute_time is null");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeIsNotNull() {
            addCriterion("t_actual_execute_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeEqualTo(Date value) {
            addCriterionForJDBCTime("t_actual_execute_time =", value, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("t_actual_execute_time <>", value, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("t_actual_execute_time >", value, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("t_actual_execute_time >=", value, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeLessThan(Date value) {
            addCriterionForJDBCTime("t_actual_execute_time <", value, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("t_actual_execute_time <=", value, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeIn(List<Date> values) {
            addCriterionForJDBCTime("t_actual_execute_time in", values, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("t_actual_execute_time not in", values, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("t_actual_execute_time between", value1, value2, "actualExecuteTime");
            return (Criteria) this;
        }

        public Criteria andActualExecuteTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("t_actual_execute_time not between", value1, value2, "actualExecuteTime");
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