package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CCustomerExample() {
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

        public Criteria andCusNoIsNull() {
            addCriterion("cus_no is null");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNotNull() {
            addCriterion("cus_no is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoEqualTo(String value) {
            addCriterion("cus_no =", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotEqualTo(String value) {
            addCriterion("cus_no <>", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThan(String value) {
            addCriterion("cus_no >", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThanOrEqualTo(String value) {
            addCriterion("cus_no >=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThan(String value) {
            addCriterion("cus_no <", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThanOrEqualTo(String value) {
            addCriterion("cus_no <=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLike(String value) {
            addCriterion("cus_no like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotLike(String value) {
            addCriterion("cus_no not like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIn(List<String> values) {
            addCriterion("cus_no in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotIn(List<String> values) {
            addCriterion("cus_no not in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoBetween(String value1, String value2) {
            addCriterion("cus_no between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotBetween(String value1, String value2) {
            addCriterion("cus_no not between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusPerIsNull() {
            addCriterion("cus_per is null");
            return (Criteria) this;
        }

        public Criteria andCusPerIsNotNull() {
            addCriterion("cus_per is not null");
            return (Criteria) this;
        }

        public Criteria andCusPerEqualTo(String value) {
            addCriterion("cus_per =", value, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerNotEqualTo(String value) {
            addCriterion("cus_per <>", value, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerGreaterThan(String value) {
            addCriterion("cus_per >", value, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerGreaterThanOrEqualTo(String value) {
            addCriterion("cus_per >=", value, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerLessThan(String value) {
            addCriterion("cus_per <", value, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerLessThanOrEqualTo(String value) {
            addCriterion("cus_per <=", value, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerLike(String value) {
            addCriterion("cus_per like", value, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerNotLike(String value) {
            addCriterion("cus_per not like", value, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerIn(List<String> values) {
            addCriterion("cus_per in", values, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerNotIn(List<String> values) {
            addCriterion("cus_per not in", values, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerBetween(String value1, String value2) {
            addCriterion("cus_per between", value1, value2, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusPerNotBetween(String value1, String value2) {
            addCriterion("cus_per not between", value1, value2, "cusPer");
            return (Criteria) this;
        }

        public Criteria andCusTelIsNull() {
            addCriterion("cus_tel is null");
            return (Criteria) this;
        }

        public Criteria andCusTelIsNotNull() {
            addCriterion("cus_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCusTelEqualTo(String value) {
            addCriterion("cus_tel =", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotEqualTo(String value) {
            addCriterion("cus_tel <>", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelGreaterThan(String value) {
            addCriterion("cus_tel >", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelGreaterThanOrEqualTo(String value) {
            addCriterion("cus_tel >=", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLessThan(String value) {
            addCriterion("cus_tel <", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLessThanOrEqualTo(String value) {
            addCriterion("cus_tel <=", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLike(String value) {
            addCriterion("cus_tel like", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotLike(String value) {
            addCriterion("cus_tel not like", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelIn(List<String> values) {
            addCriterion("cus_tel in", values, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotIn(List<String> values) {
            addCriterion("cus_tel not in", values, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelBetween(String value1, String value2) {
            addCriterion("cus_tel between", value1, value2, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotBetween(String value1, String value2) {
            addCriterion("cus_tel not between", value1, value2, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusAddIsNull() {
            addCriterion("cus_add is null");
            return (Criteria) this;
        }

        public Criteria andCusAddIsNotNull() {
            addCriterion("cus_add is not null");
            return (Criteria) this;
        }

        public Criteria andCusAddEqualTo(String value) {
            addCriterion("cus_add =", value, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddNotEqualTo(String value) {
            addCriterion("cus_add <>", value, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddGreaterThan(String value) {
            addCriterion("cus_add >", value, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddGreaterThanOrEqualTo(String value) {
            addCriterion("cus_add >=", value, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddLessThan(String value) {
            addCriterion("cus_add <", value, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddLessThanOrEqualTo(String value) {
            addCriterion("cus_add <=", value, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddLike(String value) {
            addCriterion("cus_add like", value, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddNotLike(String value) {
            addCriterion("cus_add not like", value, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddIn(List<String> values) {
            addCriterion("cus_add in", values, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddNotIn(List<String> values) {
            addCriterion("cus_add not in", values, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddBetween(String value1, String value2) {
            addCriterion("cus_add between", value1, value2, "cusAdd");
            return (Criteria) this;
        }

        public Criteria andCusAddNotBetween(String value1, String value2) {
            addCriterion("cus_add not between", value1, value2, "cusAdd");
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

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andItem1IsNull() {
            addCriterion("item1 is null");
            return (Criteria) this;
        }

        public Criteria andItem1IsNotNull() {
            addCriterion("item1 is not null");
            return (Criteria) this;
        }

        public Criteria andItem1EqualTo(String value) {
            addCriterion("item1 =", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotEqualTo(String value) {
            addCriterion("item1 <>", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThan(String value) {
            addCriterion("item1 >", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1GreaterThanOrEqualTo(String value) {
            addCriterion("item1 >=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThan(String value) {
            addCriterion("item1 <", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1LessThanOrEqualTo(String value) {
            addCriterion("item1 <=", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1Like(String value) {
            addCriterion("item1 like", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotLike(String value) {
            addCriterion("item1 not like", value, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1In(List<String> values) {
            addCriterion("item1 in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotIn(List<String> values) {
            addCriterion("item1 not in", values, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1Between(String value1, String value2) {
            addCriterion("item1 between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem1NotBetween(String value1, String value2) {
            addCriterion("item1 not between", value1, value2, "item1");
            return (Criteria) this;
        }

        public Criteria andItem2IsNull() {
            addCriterion("item2 is null");
            return (Criteria) this;
        }

        public Criteria andItem2IsNotNull() {
            addCriterion("item2 is not null");
            return (Criteria) this;
        }

        public Criteria andItem2EqualTo(String value) {
            addCriterion("item2 =", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotEqualTo(String value) {
            addCriterion("item2 <>", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThan(String value) {
            addCriterion("item2 >", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2GreaterThanOrEqualTo(String value) {
            addCriterion("item2 >=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThan(String value) {
            addCriterion("item2 <", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2LessThanOrEqualTo(String value) {
            addCriterion("item2 <=", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2Like(String value) {
            addCriterion("item2 like", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotLike(String value) {
            addCriterion("item2 not like", value, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2In(List<String> values) {
            addCriterion("item2 in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotIn(List<String> values) {
            addCriterion("item2 not in", values, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2Between(String value1, String value2) {
            addCriterion("item2 between", value1, value2, "item2");
            return (Criteria) this;
        }

        public Criteria andItem2NotBetween(String value1, String value2) {
            addCriterion("item2 not between", value1, value2, "item2");
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