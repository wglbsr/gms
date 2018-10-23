package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WarningExample() {
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

        public Criteria andActionTypeIsNull() {
            addCriterion("action_type is null");
            return (Criteria) this;
        }

        public Criteria andActionTypeIsNotNull() {
            addCriterion("action_type is not null");
            return (Criteria) this;
        }

        public Criteria andActionTypeEqualTo(Integer value) {
            addCriterion("action_type =", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotEqualTo(Integer value) {
            addCriterion("action_type <>", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThan(Integer value) {
            addCriterion("action_type >", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("action_type >=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThan(Integer value) {
            addCriterion("action_type <", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("action_type <=", value, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeIn(List<Integer> values) {
            addCriterion("action_type in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotIn(List<Integer> values) {
            addCriterion("action_type not in", values, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeBetween(Integer value1, Integer value2) {
            addCriterion("action_type between", value1, value2, "actionType");
            return (Criteria) this;
        }

        public Criteria andActionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("action_type not between", value1, value2, "actionType");
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

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andSeeIsNull() {
            addCriterion("see is null");
            return (Criteria) this;
        }

        public Criteria andSeeIsNotNull() {
            addCriterion("see is not null");
            return (Criteria) this;
        }

        public Criteria andSeeEqualTo(Boolean value) {
            addCriterion("see =", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeNotEqualTo(Boolean value) {
            addCriterion("see <>", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeGreaterThan(Boolean value) {
            addCriterion("see >", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("see >=", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeLessThan(Boolean value) {
            addCriterion("see <", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeLessThanOrEqualTo(Boolean value) {
            addCriterion("see <=", value, "see");
            return (Criteria) this;
        }

        public Criteria andSeeIn(List<Boolean> values) {
            addCriterion("see in", values, "see");
            return (Criteria) this;
        }

        public Criteria andSeeNotIn(List<Boolean> values) {
            addCriterion("see not in", values, "see");
            return (Criteria) this;
        }

        public Criteria andSeeBetween(Boolean value1, Boolean value2) {
            addCriterion("see between", value1, value2, "see");
            return (Criteria) this;
        }

        public Criteria andSeeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("see not between", value1, value2, "see");
            return (Criteria) this;
        }

        public Criteria andInterTimeIsNull() {
            addCriterion("inter_time is null");
            return (Criteria) this;
        }

        public Criteria andInterTimeIsNotNull() {
            addCriterion("inter_time is not null");
            return (Criteria) this;
        }

        public Criteria andInterTimeEqualTo(Date value) {
            addCriterion("inter_time =", value, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeNotEqualTo(Date value) {
            addCriterion("inter_time <>", value, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeGreaterThan(Date value) {
            addCriterion("inter_time >", value, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("inter_time >=", value, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeLessThan(Date value) {
            addCriterion("inter_time <", value, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeLessThanOrEqualTo(Date value) {
            addCriterion("inter_time <=", value, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeIn(List<Date> values) {
            addCriterion("inter_time in", values, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeNotIn(List<Date> values) {
            addCriterion("inter_time not in", values, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeBetween(Date value1, Date value2) {
            addCriterion("inter_time between", value1, value2, "interTime");
            return (Criteria) this;
        }

        public Criteria andInterTimeNotBetween(Date value1, Date value2) {
            addCriterion("inter_time not between", value1, value2, "interTime");
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