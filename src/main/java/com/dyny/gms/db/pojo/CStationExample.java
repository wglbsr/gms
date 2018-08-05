package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CStationExample() {
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

        public Criteria andStNameIsNull() {
            addCriterion("st_name is null");
            return (Criteria) this;
        }

        public Criteria andStNameIsNotNull() {
            addCriterion("st_name is not null");
            return (Criteria) this;
        }

        public Criteria andStNameEqualTo(String value) {
            addCriterion("st_name =", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotEqualTo(String value) {
            addCriterion("st_name <>", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThan(String value) {
            addCriterion("st_name >", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameGreaterThanOrEqualTo(String value) {
            addCriterion("st_name >=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThan(String value) {
            addCriterion("st_name <", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLessThanOrEqualTo(String value) {
            addCriterion("st_name <=", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameLike(String value) {
            addCriterion("st_name like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotLike(String value) {
            addCriterion("st_name not like", value, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameIn(List<String> values) {
            addCriterion("st_name in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotIn(List<String> values) {
            addCriterion("st_name not in", values, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameBetween(String value1, String value2) {
            addCriterion("st_name between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStNameNotBetween(String value1, String value2) {
            addCriterion("st_name not between", value1, value2, "stName");
            return (Criteria) this;
        }

        public Criteria andStUnitIsNull() {
            addCriterion("st_unit is null");
            return (Criteria) this;
        }

        public Criteria andStUnitIsNotNull() {
            addCriterion("st_unit is not null");
            return (Criteria) this;
        }

        public Criteria andStUnitEqualTo(String value) {
            addCriterion("st_unit =", value, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitNotEqualTo(String value) {
            addCriterion("st_unit <>", value, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitGreaterThan(String value) {
            addCriterion("st_unit >", value, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitGreaterThanOrEqualTo(String value) {
            addCriterion("st_unit >=", value, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitLessThan(String value) {
            addCriterion("st_unit <", value, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitLessThanOrEqualTo(String value) {
            addCriterion("st_unit <=", value, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitLike(String value) {
            addCriterion("st_unit like", value, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitNotLike(String value) {
            addCriterion("st_unit not like", value, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitIn(List<String> values) {
            addCriterion("st_unit in", values, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitNotIn(List<String> values) {
            addCriterion("st_unit not in", values, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitBetween(String value1, String value2) {
            addCriterion("st_unit between", value1, value2, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStUnitNotBetween(String value1, String value2) {
            addCriterion("st_unit not between", value1, value2, "stUnit");
            return (Criteria) this;
        }

        public Criteria andStTypeIsNull() {
            addCriterion("st_type is null");
            return (Criteria) this;
        }

        public Criteria andStTypeIsNotNull() {
            addCriterion("st_type is not null");
            return (Criteria) this;
        }

        public Criteria andStTypeEqualTo(Byte value) {
            addCriterion("st_type =", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeNotEqualTo(Byte value) {
            addCriterion("st_type <>", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeGreaterThan(Byte value) {
            addCriterion("st_type >", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("st_type >=", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeLessThan(Byte value) {
            addCriterion("st_type <", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeLessThanOrEqualTo(Byte value) {
            addCriterion("st_type <=", value, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeIn(List<Byte> values) {
            addCriterion("st_type in", values, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeNotIn(List<Byte> values) {
            addCriterion("st_type not in", values, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeBetween(Byte value1, Byte value2) {
            addCriterion("st_type between", value1, value2, "stType");
            return (Criteria) this;
        }

        public Criteria andStTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("st_type not between", value1, value2, "stType");
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

        public Criteria andStCoordinateIsNull() {
            addCriterion("st_coordinate is null");
            return (Criteria) this;
        }

        public Criteria andStCoordinateIsNotNull() {
            addCriterion("st_coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andStCoordinateEqualTo(String value) {
            addCriterion("st_coordinate =", value, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateNotEqualTo(String value) {
            addCriterion("st_coordinate <>", value, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateGreaterThan(String value) {
            addCriterion("st_coordinate >", value, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("st_coordinate >=", value, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateLessThan(String value) {
            addCriterion("st_coordinate <", value, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateLessThanOrEqualTo(String value) {
            addCriterion("st_coordinate <=", value, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateLike(String value) {
            addCriterion("st_coordinate like", value, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateNotLike(String value) {
            addCriterion("st_coordinate not like", value, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateIn(List<String> values) {
            addCriterion("st_coordinate in", values, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateNotIn(List<String> values) {
            addCriterion("st_coordinate not in", values, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateBetween(String value1, String value2) {
            addCriterion("st_coordinate between", value1, value2, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStCoordinateNotBetween(String value1, String value2) {
            addCriterion("st_coordinate not between", value1, value2, "stCoordinate");
            return (Criteria) this;
        }

        public Criteria andStAddIsNull() {
            addCriterion("st_add is null");
            return (Criteria) this;
        }

        public Criteria andStAddIsNotNull() {
            addCriterion("st_add is not null");
            return (Criteria) this;
        }

        public Criteria andStAddEqualTo(String value) {
            addCriterion("st_add =", value, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddNotEqualTo(String value) {
            addCriterion("st_add <>", value, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddGreaterThan(String value) {
            addCriterion("st_add >", value, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddGreaterThanOrEqualTo(String value) {
            addCriterion("st_add >=", value, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddLessThan(String value) {
            addCriterion("st_add <", value, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddLessThanOrEqualTo(String value) {
            addCriterion("st_add <=", value, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddLike(String value) {
            addCriterion("st_add like", value, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddNotLike(String value) {
            addCriterion("st_add not like", value, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddIn(List<String> values) {
            addCriterion("st_add in", values, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddNotIn(List<String> values) {
            addCriterion("st_add not in", values, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddBetween(String value1, String value2) {
            addCriterion("st_add between", value1, value2, "stAdd");
            return (Criteria) this;
        }

        public Criteria andStAddNotBetween(String value1, String value2) {
            addCriterion("st_add not between", value1, value2, "stAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddIsNull() {
            addCriterion("unit_add is null");
            return (Criteria) this;
        }

        public Criteria andUnitAddIsNotNull() {
            addCriterion("unit_add is not null");
            return (Criteria) this;
        }

        public Criteria andUnitAddEqualTo(String value) {
            addCriterion("unit_add =", value, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddNotEqualTo(String value) {
            addCriterion("unit_add <>", value, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddGreaterThan(String value) {
            addCriterion("unit_add >", value, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddGreaterThanOrEqualTo(String value) {
            addCriterion("unit_add >=", value, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddLessThan(String value) {
            addCriterion("unit_add <", value, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddLessThanOrEqualTo(String value) {
            addCriterion("unit_add <=", value, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddLike(String value) {
            addCriterion("unit_add like", value, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddNotLike(String value) {
            addCriterion("unit_add not like", value, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddIn(List<String> values) {
            addCriterion("unit_add in", values, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddNotIn(List<String> values) {
            addCriterion("unit_add not in", values, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddBetween(String value1, String value2) {
            addCriterion("unit_add between", value1, value2, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andUnitAddNotBetween(String value1, String value2) {
            addCriterion("unit_add not between", value1, value2, "unitAdd");
            return (Criteria) this;
        }

        public Criteria andStPer1IsNull() {
            addCriterion("st_per1 is null");
            return (Criteria) this;
        }

        public Criteria andStPer1IsNotNull() {
            addCriterion("st_per1 is not null");
            return (Criteria) this;
        }

        public Criteria andStPer1EqualTo(String value) {
            addCriterion("st_per1 =", value, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1NotEqualTo(String value) {
            addCriterion("st_per1 <>", value, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1GreaterThan(String value) {
            addCriterion("st_per1 >", value, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1GreaterThanOrEqualTo(String value) {
            addCriterion("st_per1 >=", value, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1LessThan(String value) {
            addCriterion("st_per1 <", value, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1LessThanOrEqualTo(String value) {
            addCriterion("st_per1 <=", value, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1Like(String value) {
            addCriterion("st_per1 like", value, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1NotLike(String value) {
            addCriterion("st_per1 not like", value, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1In(List<String> values) {
            addCriterion("st_per1 in", values, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1NotIn(List<String> values) {
            addCriterion("st_per1 not in", values, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1Between(String value1, String value2) {
            addCriterion("st_per1 between", value1, value2, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPer1NotBetween(String value1, String value2) {
            addCriterion("st_per1 not between", value1, value2, "stPer1");
            return (Criteria) this;
        }

        public Criteria andStPertel1IsNull() {
            addCriterion("st_pertel1 is null");
            return (Criteria) this;
        }

        public Criteria andStPertel1IsNotNull() {
            addCriterion("st_pertel1 is not null");
            return (Criteria) this;
        }

        public Criteria andStPertel1EqualTo(String value) {
            addCriterion("st_pertel1 =", value, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1NotEqualTo(String value) {
            addCriterion("st_pertel1 <>", value, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1GreaterThan(String value) {
            addCriterion("st_pertel1 >", value, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1GreaterThanOrEqualTo(String value) {
            addCriterion("st_pertel1 >=", value, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1LessThan(String value) {
            addCriterion("st_pertel1 <", value, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1LessThanOrEqualTo(String value) {
            addCriterion("st_pertel1 <=", value, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1Like(String value) {
            addCriterion("st_pertel1 like", value, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1NotLike(String value) {
            addCriterion("st_pertel1 not like", value, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1In(List<String> values) {
            addCriterion("st_pertel1 in", values, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1NotIn(List<String> values) {
            addCriterion("st_pertel1 not in", values, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1Between(String value1, String value2) {
            addCriterion("st_pertel1 between", value1, value2, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPertel1NotBetween(String value1, String value2) {
            addCriterion("st_pertel1 not between", value1, value2, "stPertel1");
            return (Criteria) this;
        }

        public Criteria andStPer2IsNull() {
            addCriterion("st_per2 is null");
            return (Criteria) this;
        }

        public Criteria andStPer2IsNotNull() {
            addCriterion("st_per2 is not null");
            return (Criteria) this;
        }

        public Criteria andStPer2EqualTo(String value) {
            addCriterion("st_per2 =", value, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2NotEqualTo(String value) {
            addCriterion("st_per2 <>", value, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2GreaterThan(String value) {
            addCriterion("st_per2 >", value, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2GreaterThanOrEqualTo(String value) {
            addCriterion("st_per2 >=", value, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2LessThan(String value) {
            addCriterion("st_per2 <", value, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2LessThanOrEqualTo(String value) {
            addCriterion("st_per2 <=", value, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2Like(String value) {
            addCriterion("st_per2 like", value, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2NotLike(String value) {
            addCriterion("st_per2 not like", value, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2In(List<String> values) {
            addCriterion("st_per2 in", values, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2NotIn(List<String> values) {
            addCriterion("st_per2 not in", values, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2Between(String value1, String value2) {
            addCriterion("st_per2 between", value1, value2, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPer2NotBetween(String value1, String value2) {
            addCriterion("st_per2 not between", value1, value2, "stPer2");
            return (Criteria) this;
        }

        public Criteria andStPertel2IsNull() {
            addCriterion("st_pertel2 is null");
            return (Criteria) this;
        }

        public Criteria andStPertel2IsNotNull() {
            addCriterion("st_pertel2 is not null");
            return (Criteria) this;
        }

        public Criteria andStPertel2EqualTo(String value) {
            addCriterion("st_pertel2 =", value, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2NotEqualTo(String value) {
            addCriterion("st_pertel2 <>", value, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2GreaterThan(String value) {
            addCriterion("st_pertel2 >", value, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2GreaterThanOrEqualTo(String value) {
            addCriterion("st_pertel2 >=", value, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2LessThan(String value) {
            addCriterion("st_pertel2 <", value, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2LessThanOrEqualTo(String value) {
            addCriterion("st_pertel2 <=", value, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2Like(String value) {
            addCriterion("st_pertel2 like", value, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2NotLike(String value) {
            addCriterion("st_pertel2 not like", value, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2In(List<String> values) {
            addCriterion("st_pertel2 in", values, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2NotIn(List<String> values) {
            addCriterion("st_pertel2 not in", values, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2Between(String value1, String value2) {
            addCriterion("st_pertel2 between", value1, value2, "stPertel2");
            return (Criteria) this;
        }

        public Criteria andStPertel2NotBetween(String value1, String value2) {
            addCriterion("st_pertel2 not between", value1, value2, "stPertel2");
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

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNull() {
            addCriterion("stop_time is null");
            return (Criteria) this;
        }

        public Criteria andStopTimeIsNotNull() {
            addCriterion("stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andStopTimeEqualTo(Double value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(Double value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(Double value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(Double value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(Double value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<Double> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<Double> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(Double value1, Double value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(Double value1, Double value2) {
            addCriterion("stop_time not between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStartVoltageIsNull() {
            addCriterion("start_Voltage is null");
            return (Criteria) this;
        }

        public Criteria andStartVoltageIsNotNull() {
            addCriterion("start_Voltage is not null");
            return (Criteria) this;
        }

        public Criteria andStartVoltageEqualTo(Double value) {
            addCriterion("start_Voltage =", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotEqualTo(Double value) {
            addCriterion("start_Voltage <>", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageGreaterThan(Double value) {
            addCriterion("start_Voltage >", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageGreaterThanOrEqualTo(Double value) {
            addCriterion("start_Voltage >=", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageLessThan(Double value) {
            addCriterion("start_Voltage <", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageLessThanOrEqualTo(Double value) {
            addCriterion("start_Voltage <=", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageIn(List<Double> values) {
            addCriterion("start_Voltage in", values, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotIn(List<Double> values) {
            addCriterion("start_Voltage not in", values, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageBetween(Double value1, Double value2) {
            addCriterion("start_Voltage between", value1, value2, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotBetween(Double value1, Double value2) {
            addCriterion("start_Voltage not between", value1, value2, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeIsNull() {
            addCriterion("maintain_time is null");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeIsNotNull() {
            addCriterion("maintain_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeEqualTo(Double value) {
            addCriterion("maintain_time =", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotEqualTo(Double value) {
            addCriterion("maintain_time <>", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeGreaterThan(Double value) {
            addCriterion("maintain_time >", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("maintain_time >=", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLessThan(Double value) {
            addCriterion("maintain_time <", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLessThanOrEqualTo(Double value) {
            addCriterion("maintain_time <=", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeIn(List<Double> values) {
            addCriterion("maintain_time in", values, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotIn(List<Double> values) {
            addCriterion("maintain_time not in", values, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeBetween(Double value1, Double value2) {
            addCriterion("maintain_time between", value1, value2, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotBetween(Double value1, Double value2) {
            addCriterion("maintain_time not between", value1, value2, "maintainTime");
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

        public Criteria andItem3IsNull() {
            addCriterion("item3 is null");
            return (Criteria) this;
        }

        public Criteria andItem3IsNotNull() {
            addCriterion("item3 is not null");
            return (Criteria) this;
        }

        public Criteria andItem3EqualTo(String value) {
            addCriterion("item3 =", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotEqualTo(String value) {
            addCriterion("item3 <>", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3GreaterThan(String value) {
            addCriterion("item3 >", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3GreaterThanOrEqualTo(String value) {
            addCriterion("item3 >=", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3LessThan(String value) {
            addCriterion("item3 <", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3LessThanOrEqualTo(String value) {
            addCriterion("item3 <=", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3Like(String value) {
            addCriterion("item3 like", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotLike(String value) {
            addCriterion("item3 not like", value, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3In(List<String> values) {
            addCriterion("item3 in", values, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotIn(List<String> values) {
            addCriterion("item3 not in", values, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3Between(String value1, String value2) {
            addCriterion("item3 between", value1, value2, "item3");
            return (Criteria) this;
        }

        public Criteria andItem3NotBetween(String value1, String value2) {
            addCriterion("item3 not between", value1, value2, "item3");
            return (Criteria) this;
        }

        public Criteria andItem4IsNull() {
            addCriterion("item4 is null");
            return (Criteria) this;
        }

        public Criteria andItem4IsNotNull() {
            addCriterion("item4 is not null");
            return (Criteria) this;
        }

        public Criteria andItem4EqualTo(String value) {
            addCriterion("item4 =", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotEqualTo(String value) {
            addCriterion("item4 <>", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4GreaterThan(String value) {
            addCriterion("item4 >", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4GreaterThanOrEqualTo(String value) {
            addCriterion("item4 >=", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4LessThan(String value) {
            addCriterion("item4 <", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4LessThanOrEqualTo(String value) {
            addCriterion("item4 <=", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4Like(String value) {
            addCriterion("item4 like", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotLike(String value) {
            addCriterion("item4 not like", value, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4In(List<String> values) {
            addCriterion("item4 in", values, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotIn(List<String> values) {
            addCriterion("item4 not in", values, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4Between(String value1, String value2) {
            addCriterion("item4 between", value1, value2, "item4");
            return (Criteria) this;
        }

        public Criteria andItem4NotBetween(String value1, String value2) {
            addCriterion("item4 not between", value1, value2, "item4");
            return (Criteria) this;
        }

        public Criteria andItem5IsNull() {
            addCriterion("item5 is null");
            return (Criteria) this;
        }

        public Criteria andItem5IsNotNull() {
            addCriterion("item5 is not null");
            return (Criteria) this;
        }

        public Criteria andItem5EqualTo(String value) {
            addCriterion("item5 =", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotEqualTo(String value) {
            addCriterion("item5 <>", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5GreaterThan(String value) {
            addCriterion("item5 >", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5GreaterThanOrEqualTo(String value) {
            addCriterion("item5 >=", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5LessThan(String value) {
            addCriterion("item5 <", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5LessThanOrEqualTo(String value) {
            addCriterion("item5 <=", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5Like(String value) {
            addCriterion("item5 like", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotLike(String value) {
            addCriterion("item5 not like", value, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5In(List<String> values) {
            addCriterion("item5 in", values, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotIn(List<String> values) {
            addCriterion("item5 not in", values, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5Between(String value1, String value2) {
            addCriterion("item5 between", value1, value2, "item5");
            return (Criteria) this;
        }

        public Criteria andItem5NotBetween(String value1, String value2) {
            addCriterion("item5 not between", value1, value2, "item5");
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