package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApCollarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApCollarExample() {
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

        public Criteria andCoNoIsNull() {
            addCriterion("co_no is null");
            return (Criteria) this;
        }

        public Criteria andCoNoIsNotNull() {
            addCriterion("co_no is not null");
            return (Criteria) this;
        }

        public Criteria andCoNoEqualTo(String value) {
            addCriterion("co_no =", value, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoNotEqualTo(String value) {
            addCriterion("co_no <>", value, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoGreaterThan(String value) {
            addCriterion("co_no >", value, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoGreaterThanOrEqualTo(String value) {
            addCriterion("co_no >=", value, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoLessThan(String value) {
            addCriterion("co_no <", value, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoLessThanOrEqualTo(String value) {
            addCriterion("co_no <=", value, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoLike(String value) {
            addCriterion("co_no like", value, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoNotLike(String value) {
            addCriterion("co_no not like", value, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoIn(List<String> values) {
            addCriterion("co_no in", values, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoNotIn(List<String> values) {
            addCriterion("co_no not in", values, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoBetween(String value1, String value2) {
            addCriterion("co_no between", value1, value2, "coNo");
            return (Criteria) this;
        }

        public Criteria andCoNoNotBetween(String value1, String value2) {
            addCriterion("co_no not between", value1, value2, "coNo");
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

        public Criteria andCoTimeIsNull() {
            addCriterion("co_time is null");
            return (Criteria) this;
        }

        public Criteria andCoTimeIsNotNull() {
            addCriterion("co_time is not null");
            return (Criteria) this;
        }

        public Criteria andCoTimeEqualTo(Date value) {
            addCriterion("co_time =", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeNotEqualTo(Date value) {
            addCriterion("co_time <>", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeGreaterThan(Date value) {
            addCriterion("co_time >", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("co_time >=", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeLessThan(Date value) {
            addCriterion("co_time <", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeLessThanOrEqualTo(Date value) {
            addCriterion("co_time <=", value, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeIn(List<Date> values) {
            addCriterion("co_time in", values, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeNotIn(List<Date> values) {
            addCriterion("co_time not in", values, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeBetween(Date value1, Date value2) {
            addCriterion("co_time between", value1, value2, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoTimeNotBetween(Date value1, Date value2) {
            addCriterion("co_time not between", value1, value2, "coTime");
            return (Criteria) this;
        }

        public Criteria andCoPerIsNull() {
            addCriterion("co_per is null");
            return (Criteria) this;
        }

        public Criteria andCoPerIsNotNull() {
            addCriterion("co_per is not null");
            return (Criteria) this;
        }

        public Criteria andCoPerEqualTo(String value) {
            addCriterion("co_per =", value, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerNotEqualTo(String value) {
            addCriterion("co_per <>", value, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerGreaterThan(String value) {
            addCriterion("co_per >", value, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerGreaterThanOrEqualTo(String value) {
            addCriterion("co_per >=", value, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerLessThan(String value) {
            addCriterion("co_per <", value, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerLessThanOrEqualTo(String value) {
            addCriterion("co_per <=", value, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerLike(String value) {
            addCriterion("co_per like", value, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerNotLike(String value) {
            addCriterion("co_per not like", value, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerIn(List<String> values) {
            addCriterion("co_per in", values, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerNotIn(List<String> values) {
            addCriterion("co_per not in", values, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerBetween(String value1, String value2) {
            addCriterion("co_per between", value1, value2, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoPerNotBetween(String value1, String value2) {
            addCriterion("co_per not between", value1, value2, "coPer");
            return (Criteria) this;
        }

        public Criteria andCoTelIsNull() {
            addCriterion("co_tel is null");
            return (Criteria) this;
        }

        public Criteria andCoTelIsNotNull() {
            addCriterion("co_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCoTelEqualTo(String value) {
            addCriterion("co_tel =", value, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelNotEqualTo(String value) {
            addCriterion("co_tel <>", value, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelGreaterThan(String value) {
            addCriterion("co_tel >", value, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelGreaterThanOrEqualTo(String value) {
            addCriterion("co_tel >=", value, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelLessThan(String value) {
            addCriterion("co_tel <", value, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelLessThanOrEqualTo(String value) {
            addCriterion("co_tel <=", value, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelLike(String value) {
            addCriterion("co_tel like", value, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelNotLike(String value) {
            addCriterion("co_tel not like", value, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelIn(List<String> values) {
            addCriterion("co_tel in", values, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelNotIn(List<String> values) {
            addCriterion("co_tel not in", values, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelBetween(String value1, String value2) {
            addCriterion("co_tel between", value1, value2, "coTel");
            return (Criteria) this;
        }

        public Criteria andCoTelNotBetween(String value1, String value2) {
            addCriterion("co_tel not between", value1, value2, "coTel");
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

        public Criteria andCoAddIsNull() {
            addCriterion("co_add is null");
            return (Criteria) this;
        }

        public Criteria andCoAddIsNotNull() {
            addCriterion("co_add is not null");
            return (Criteria) this;
        }

        public Criteria andCoAddEqualTo(String value) {
            addCriterion("co_add =", value, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddNotEqualTo(String value) {
            addCriterion("co_add <>", value, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddGreaterThan(String value) {
            addCriterion("co_add >", value, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddGreaterThanOrEqualTo(String value) {
            addCriterion("co_add >=", value, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddLessThan(String value) {
            addCriterion("co_add <", value, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddLessThanOrEqualTo(String value) {
            addCriterion("co_add <=", value, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddLike(String value) {
            addCriterion("co_add like", value, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddNotLike(String value) {
            addCriterion("co_add not like", value, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddIn(List<String> values) {
            addCriterion("co_add in", values, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddNotIn(List<String> values) {
            addCriterion("co_add not in", values, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddBetween(String value1, String value2) {
            addCriterion("co_add between", value1, value2, "coAdd");
            return (Criteria) this;
        }

        public Criteria andCoAddNotBetween(String value1, String value2) {
            addCriterion("co_add not between", value1, value2, "coAdd");
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