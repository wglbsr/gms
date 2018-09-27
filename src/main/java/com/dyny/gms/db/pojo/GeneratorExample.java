package com.dyny.gms.db.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GeneratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GeneratorExample() {
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

        public Criteria andMachNameIsNull() {
            addCriterion("mach_name is null");
            return (Criteria) this;
        }

        public Criteria andMachNameIsNotNull() {
            addCriterion("mach_name is not null");
            return (Criteria) this;
        }

        public Criteria andMachNameEqualTo(String value) {
            addCriterion("mach_name =", value, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameNotEqualTo(String value) {
            addCriterion("mach_name <>", value, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameGreaterThan(String value) {
            addCriterion("mach_name >", value, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameGreaterThanOrEqualTo(String value) {
            addCriterion("mach_name >=", value, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameLessThan(String value) {
            addCriterion("mach_name <", value, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameLessThanOrEqualTo(String value) {
            addCriterion("mach_name <=", value, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameLike(String value) {
            addCriterion("mach_name like", value, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameNotLike(String value) {
            addCriterion("mach_name not like", value, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameIn(List<String> values) {
            addCriterion("mach_name in", values, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameNotIn(List<String> values) {
            addCriterion("mach_name not in", values, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameBetween(String value1, String value2) {
            addCriterion("mach_name between", value1, value2, "machName");
            return (Criteria) this;
        }

        public Criteria andMachNameNotBetween(String value1, String value2) {
            addCriterion("mach_name not between", value1, value2, "machName");
            return (Criteria) this;
        }

        public Criteria andMachTypeIsNull() {
            addCriterion("mach_type is null");
            return (Criteria) this;
        }

        public Criteria andMachTypeIsNotNull() {
            addCriterion("mach_type is not null");
            return (Criteria) this;
        }

        public Criteria andMachTypeEqualTo(String value) {
            addCriterion("mach_type =", value, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeNotEqualTo(String value) {
            addCriterion("mach_type <>", value, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeGreaterThan(String value) {
            addCriterion("mach_type >", value, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mach_type >=", value, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeLessThan(String value) {
            addCriterion("mach_type <", value, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeLessThanOrEqualTo(String value) {
            addCriterion("mach_type <=", value, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeLike(String value) {
            addCriterion("mach_type like", value, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeNotLike(String value) {
            addCriterion("mach_type not like", value, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeIn(List<String> values) {
            addCriterion("mach_type in", values, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeNotIn(List<String> values) {
            addCriterion("mach_type not in", values, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeBetween(String value1, String value2) {
            addCriterion("mach_type between", value1, value2, "machType");
            return (Criteria) this;
        }

        public Criteria andMachTypeNotBetween(String value1, String value2) {
            addCriterion("mach_type not between", value1, value2, "machType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("fuel_type is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("fuel_type is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("fuel_type =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("fuel_type <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("fuel_type >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fuel_type >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("fuel_type <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("fuel_type <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("fuel_type like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("fuel_type not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("fuel_type in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("fuel_type not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("fuel_type between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("fuel_type not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("use_type is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("use_type is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(String value) {
            addCriterion("use_type =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(String value) {
            addCriterion("use_type <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(String value) {
            addCriterion("use_type >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("use_type >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(String value) {
            addCriterion("use_type <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(String value) {
            addCriterion("use_type <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLike(String value) {
            addCriterion("use_type like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotLike(String value) {
            addCriterion("use_type not like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<String> values) {
            addCriterion("use_type in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<String> values) {
            addCriterion("use_type not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(String value1, String value2) {
            addCriterion("use_type between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(String value1, String value2) {
            addCriterion("use_type not between", value1, value2, "useType");
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

        public Criteria andModelNoIsNull() {
            addCriterion("model_no is null");
            return (Criteria) this;
        }

        public Criteria andModelNoIsNotNull() {
            addCriterion("model_no is not null");
            return (Criteria) this;
        }

        public Criteria andModelNoEqualTo(String value) {
            addCriterion("model_no =", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotEqualTo(String value) {
            addCriterion("model_no <>", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoGreaterThan(String value) {
            addCriterion("model_no >", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoGreaterThanOrEqualTo(String value) {
            addCriterion("model_no >=", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLessThan(String value) {
            addCriterion("model_no <", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLessThanOrEqualTo(String value) {
            addCriterion("model_no <=", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLike(String value) {
            addCriterion("model_no like", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotLike(String value) {
            addCriterion("model_no not like", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoIn(List<String> values) {
            addCriterion("model_no in", values, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotIn(List<String> values) {
            addCriterion("model_no not in", values, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoBetween(String value1, String value2) {
            addCriterion("model_no between", value1, value2, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotBetween(String value1, String value2) {
            addCriterion("model_no not between", value1, value2, "modelNo");
            return (Criteria) this;
        }

        public Criteria andVenderNameIsNull() {
            addCriterion("vender_name is null");
            return (Criteria) this;
        }

        public Criteria andVenderNameIsNotNull() {
            addCriterion("vender_name is not null");
            return (Criteria) this;
        }

        public Criteria andVenderNameEqualTo(String value) {
            addCriterion("vender_name =", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameNotEqualTo(String value) {
            addCriterion("vender_name <>", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameGreaterThan(String value) {
            addCriterion("vender_name >", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("vender_name >=", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameLessThan(String value) {
            addCriterion("vender_name <", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameLessThanOrEqualTo(String value) {
            addCriterion("vender_name <=", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameLike(String value) {
            addCriterion("vender_name like", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameNotLike(String value) {
            addCriterion("vender_name not like", value, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameIn(List<String> values) {
            addCriterion("vender_name in", values, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameNotIn(List<String> values) {
            addCriterion("vender_name not in", values, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameBetween(String value1, String value2) {
            addCriterion("vender_name between", value1, value2, "venderName");
            return (Criteria) this;
        }

        public Criteria andVenderNameNotBetween(String value1, String value2) {
            addCriterion("vender_name not between", value1, value2, "venderName");
            return (Criteria) this;
        }

        public Criteria andPowerNumIsNull() {
            addCriterion("power_num is null");
            return (Criteria) this;
        }

        public Criteria andPowerNumIsNotNull() {
            addCriterion("power_num is not null");
            return (Criteria) this;
        }

        public Criteria andPowerNumEqualTo(BigDecimal value) {
            addCriterion("power_num =", value, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumNotEqualTo(BigDecimal value) {
            addCriterion("power_num <>", value, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumGreaterThan(BigDecimal value) {
            addCriterion("power_num >", value, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("power_num >=", value, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumLessThan(BigDecimal value) {
            addCriterion("power_num <", value, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("power_num <=", value, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumIn(List<BigDecimal> values) {
            addCriterion("power_num in", values, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumNotIn(List<BigDecimal> values) {
            addCriterion("power_num not in", values, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power_num between", value1, value2, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPowerNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power_num not between", value1, value2, "powerNum");
            return (Criteria) this;
        }

        public Criteria andPurchTimeIsNull() {
            addCriterion("Purch_time is null");
            return (Criteria) this;
        }

        public Criteria andPurchTimeIsNotNull() {
            addCriterion("Purch_time is not null");
            return (Criteria) this;
        }

        public Criteria andPurchTimeEqualTo(Date value) {
            addCriterion("Purch_time =", value, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeNotEqualTo(Date value) {
            addCriterion("Purch_time <>", value, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeGreaterThan(Date value) {
            addCriterion("Purch_time >", value, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Purch_time >=", value, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeLessThan(Date value) {
            addCriterion("Purch_time <", value, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeLessThanOrEqualTo(Date value) {
            addCriterion("Purch_time <=", value, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeIn(List<Date> values) {
            addCriterion("Purch_time in", values, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeNotIn(List<Date> values) {
            addCriterion("Purch_time not in", values, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeBetween(Date value1, Date value2) {
            addCriterion("Purch_time between", value1, value2, "purchTime");
            return (Criteria) this;
        }

        public Criteria andPurchTimeNotBetween(Date value1, Date value2) {
            addCriterion("Purch_time not between", value1, value2, "purchTime");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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

        public Criteria andVerNoIsNull() {
            addCriterion("ver_no is null");
            return (Criteria) this;
        }

        public Criteria andVerNoIsNotNull() {
            addCriterion("ver_no is not null");
            return (Criteria) this;
        }

        public Criteria andVerNoEqualTo(String value) {
            addCriterion("ver_no =", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoNotEqualTo(String value) {
            addCriterion("ver_no <>", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoGreaterThan(String value) {
            addCriterion("ver_no >", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoGreaterThanOrEqualTo(String value) {
            addCriterion("ver_no >=", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoLessThan(String value) {
            addCriterion("ver_no <", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoLessThanOrEqualTo(String value) {
            addCriterion("ver_no <=", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoLike(String value) {
            addCriterion("ver_no like", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoNotLike(String value) {
            addCriterion("ver_no not like", value, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoIn(List<String> values) {
            addCriterion("ver_no in", values, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoNotIn(List<String> values) {
            addCriterion("ver_no not in", values, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoBetween(String value1, String value2) {
            addCriterion("ver_no between", value1, value2, "verNo");
            return (Criteria) this;
        }

        public Criteria andVerNoNotBetween(String value1, String value2) {
            addCriterion("ver_no not between", value1, value2, "verNo");
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

        public Criteria andMaintainTimeEqualTo(BigDecimal value) {
            addCriterion("maintain_time =", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotEqualTo(BigDecimal value) {
            addCriterion("maintain_time <>", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeGreaterThan(BigDecimal value) {
            addCriterion("maintain_time >", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("maintain_time >=", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLessThan(BigDecimal value) {
            addCriterion("maintain_time <", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("maintain_time <=", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeIn(List<BigDecimal> values) {
            addCriterion("maintain_time in", values, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotIn(List<BigDecimal> values) {
            addCriterion("maintain_time not in", values, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintain_time between", value1, value2, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("maintain_time not between", value1, value2, "maintainTime");
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

        public Criteria andStopTimeEqualTo(BigDecimal value) {
            addCriterion("stop_time =", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotEqualTo(BigDecimal value) {
            addCriterion("stop_time <>", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThan(BigDecimal value) {
            addCriterion("stop_time >", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stop_time >=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThan(BigDecimal value) {
            addCriterion("stop_time <", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stop_time <=", value, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeIn(List<BigDecimal> values) {
            addCriterion("stop_time in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotIn(List<BigDecimal> values) {
            addCriterion("stop_time not in", values, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stop_time between", value1, value2, "stopTime");
            return (Criteria) this;
        }

        public Criteria andStopTimeNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andStartVoltageEqualTo(BigDecimal value) {
            addCriterion("start_Voltage =", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotEqualTo(BigDecimal value) {
            addCriterion("start_Voltage <>", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageGreaterThan(BigDecimal value) {
            addCriterion("start_Voltage >", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("start_Voltage >=", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageLessThan(BigDecimal value) {
            addCriterion("start_Voltage <", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("start_Voltage <=", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageIn(List<BigDecimal> values) {
            addCriterion("start_Voltage in", values, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotIn(List<BigDecimal> values) {
            addCriterion("start_Voltage not in", values, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_Voltage between", value1, value2, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("start_Voltage not between", value1, value2, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andVolumenoIsNull() {
            addCriterion("volumeno is null");
            return (Criteria) this;
        }

        public Criteria andVolumenoIsNotNull() {
            addCriterion("volumeno is not null");
            return (Criteria) this;
        }

        public Criteria andVolumenoEqualTo(BigDecimal value) {
            addCriterion("volumeno =", value, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoNotEqualTo(BigDecimal value) {
            addCriterion("volumeno <>", value, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoGreaterThan(BigDecimal value) {
            addCriterion("volumeno >", value, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("volumeno >=", value, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoLessThan(BigDecimal value) {
            addCriterion("volumeno <", value, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("volumeno <=", value, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoIn(List<BigDecimal> values) {
            addCriterion("volumeno in", values, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoNotIn(List<BigDecimal> values) {
            addCriterion("volumeno not in", values, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volumeno between", value1, value2, "volumeno");
            return (Criteria) this;
        }

        public Criteria andVolumenoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("volumeno not between", value1, value2, "volumeno");
            return (Criteria) this;
        }

        public Criteria andGprsnoIsNull() {
            addCriterion("gprsno is null");
            return (Criteria) this;
        }

        public Criteria andGprsnoIsNotNull() {
            addCriterion("gprsno is not null");
            return (Criteria) this;
        }

        public Criteria andGprsnoEqualTo(String value) {
            addCriterion("gprsno =", value, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoNotEqualTo(String value) {
            addCriterion("gprsno <>", value, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoGreaterThan(String value) {
            addCriterion("gprsno >", value, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoGreaterThanOrEqualTo(String value) {
            addCriterion("gprsno >=", value, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoLessThan(String value) {
            addCriterion("gprsno <", value, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoLessThanOrEqualTo(String value) {
            addCriterion("gprsno <=", value, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoLike(String value) {
            addCriterion("gprsno like", value, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoNotLike(String value) {
            addCriterion("gprsno not like", value, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoIn(List<String> values) {
            addCriterion("gprsno in", values, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoNotIn(List<String> values) {
            addCriterion("gprsno not in", values, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoBetween(String value1, String value2) {
            addCriterion("gprsno between", value1, value2, "gprsno");
            return (Criteria) this;
        }

        public Criteria andGprsnoNotBetween(String value1, String value2) {
            addCriterion("gprsno not between", value1, value2, "gprsno");
            return (Criteria) this;
        }

        public Criteria andMaintainDateIsNull() {
            addCriterion("maintain_date is null");
            return (Criteria) this;
        }

        public Criteria andMaintainDateIsNotNull() {
            addCriterion("maintain_date is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainDateEqualTo(Date value) {
            addCriterion("maintain_date =", value, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateNotEqualTo(Date value) {
            addCriterion("maintain_date <>", value, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateGreaterThan(Date value) {
            addCriterion("maintain_date >", value, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateGreaterThanOrEqualTo(Date value) {
            addCriterion("maintain_date >=", value, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateLessThan(Date value) {
            addCriterion("maintain_date <", value, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateLessThanOrEqualTo(Date value) {
            addCriterion("maintain_date <=", value, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateIn(List<Date> values) {
            addCriterion("maintain_date in", values, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateNotIn(List<Date> values) {
            addCriterion("maintain_date not in", values, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateBetween(Date value1, Date value2) {
            addCriterion("maintain_date between", value1, value2, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainDateNotBetween(Date value1, Date value2) {
            addCriterion("maintain_date not between", value1, value2, "maintainDate");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIsNull() {
            addCriterion("maintain_num is null");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIsNotNull() {
            addCriterion("maintain_num is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainNumEqualTo(Integer value) {
            addCriterion("maintain_num =", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotEqualTo(Integer value) {
            addCriterion("maintain_num <>", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumGreaterThan(Integer value) {
            addCriterion("maintain_num >", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintain_num >=", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumLessThan(Integer value) {
            addCriterion("maintain_num <", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumLessThanOrEqualTo(Integer value) {
            addCriterion("maintain_num <=", value, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumIn(List<Integer> values) {
            addCriterion("maintain_num in", values, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotIn(List<Integer> values) {
            addCriterion("maintain_num not in", values, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumBetween(Integer value1, Integer value2) {
            addCriterion("maintain_num between", value1, value2, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andMaintainNumNotBetween(Integer value1, Integer value2) {
            addCriterion("maintain_num not between", value1, value2, "maintainNum");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeIsNull() {
            addCriterion("i_total_generate_time is null");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeIsNotNull() {
            addCriterion("i_total_generate_time is not null");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeEqualTo(Integer value) {
            addCriterion("i_total_generate_time =", value, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeNotEqualTo(Integer value) {
            addCriterion("i_total_generate_time <>", value, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeGreaterThan(Integer value) {
            addCriterion("i_total_generate_time >", value, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_total_generate_time >=", value, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeLessThan(Integer value) {
            addCriterion("i_total_generate_time <", value, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("i_total_generate_time <=", value, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeIn(List<Integer> values) {
            addCriterion("i_total_generate_time in", values, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeNotIn(List<Integer> values) {
            addCriterion("i_total_generate_time not in", values, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeBetween(Integer value1, Integer value2) {
            addCriterion("i_total_generate_time between", value1, value2, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("i_total_generate_time not between", value1, value2, "totalGenerateTime");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntIsNull() {
            addCriterion("i_total_generate_cnt is null");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntIsNotNull() {
            addCriterion("i_total_generate_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntEqualTo(Integer value) {
            addCriterion("i_total_generate_cnt =", value, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntNotEqualTo(Integer value) {
            addCriterion("i_total_generate_cnt <>", value, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntGreaterThan(Integer value) {
            addCriterion("i_total_generate_cnt >", value, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_total_generate_cnt >=", value, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntLessThan(Integer value) {
            addCriterion("i_total_generate_cnt <", value, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntLessThanOrEqualTo(Integer value) {
            addCriterion("i_total_generate_cnt <=", value, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntIn(List<Integer> values) {
            addCriterion("i_total_generate_cnt in", values, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntNotIn(List<Integer> values) {
            addCriterion("i_total_generate_cnt not in", values, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntBetween(Integer value1, Integer value2) {
            addCriterion("i_total_generate_cnt between", value1, value2, "totalGenerateCnt");
            return (Criteria) this;
        }

        public Criteria andTotalGenerateCntNotBetween(Integer value1, Integer value2) {
            addCriterion("i_total_generate_cnt not between", value1, value2, "totalGenerateCnt");
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

        public Criteria andActivatedIsNull() {
            addCriterion("b_activated is null");
            return (Criteria) this;
        }

        public Criteria andActivatedIsNotNull() {
            addCriterion("b_activated is not null");
            return (Criteria) this;
        }

        public Criteria andActivatedEqualTo(Boolean value) {
            addCriterion("b_activated =", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotEqualTo(Boolean value) {
            addCriterion("b_activated <>", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedGreaterThan(Boolean value) {
            addCriterion("b_activated >", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("b_activated >=", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedLessThan(Boolean value) {
            addCriterion("b_activated <", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedLessThanOrEqualTo(Boolean value) {
            addCriterion("b_activated <=", value, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedIn(List<Boolean> values) {
            addCriterion("b_activated in", values, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotIn(List<Boolean> values) {
            addCriterion("b_activated not in", values, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedBetween(Boolean value1, Boolean value2) {
            addCriterion("b_activated between", value1, value2, "activated");
            return (Criteria) this;
        }

        public Criteria andActivatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("b_activated not between", value1, value2, "activated");
            return (Criteria) this;
        }

        public Criteria andBoardVersionIsNull() {
            addCriterion("i_board_version is null");
            return (Criteria) this;
        }

        public Criteria andBoardVersionIsNotNull() {
            addCriterion("i_board_version is not null");
            return (Criteria) this;
        }

        public Criteria andBoardVersionEqualTo(Integer value) {
            addCriterion("i_board_version =", value, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionNotEqualTo(Integer value) {
            addCriterion("i_board_version <>", value, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionGreaterThan(Integer value) {
            addCriterion("i_board_version >", value, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_board_version >=", value, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionLessThan(Integer value) {
            addCriterion("i_board_version <", value, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionLessThanOrEqualTo(Integer value) {
            addCriterion("i_board_version <=", value, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionIn(List<Integer> values) {
            addCriterion("i_board_version in", values, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionNotIn(List<Integer> values) {
            addCriterion("i_board_version not in", values, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionBetween(Integer value1, Integer value2) {
            addCriterion("i_board_version between", value1, value2, "boardVersion");
            return (Criteria) this;
        }

        public Criteria andBoardVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("i_board_version not between", value1, value2, "boardVersion");
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