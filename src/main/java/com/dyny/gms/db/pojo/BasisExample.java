package com.dyny.gms.db.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasisExample() {
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

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSysModeIsNull() {
            addCriterion("sys_mode is null");
            return (Criteria) this;
        }

        public Criteria andSysModeIsNotNull() {
            addCriterion("sys_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSysModeEqualTo(Integer value) {
            addCriterion("sys_mode =", value, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeNotEqualTo(Integer value) {
            addCriterion("sys_mode <>", value, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeGreaterThan(Integer value) {
            addCriterion("sys_mode >", value, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_mode >=", value, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeLessThan(Integer value) {
            addCriterion("sys_mode <", value, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeLessThanOrEqualTo(Integer value) {
            addCriterion("sys_mode <=", value, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeIn(List<Integer> values) {
            addCriterion("sys_mode in", values, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeNotIn(List<Integer> values) {
            addCriterion("sys_mode not in", values, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeBetween(Integer value1, Integer value2) {
            addCriterion("sys_mode between", value1, value2, "sysMode");
            return (Criteria) this;
        }

        public Criteria andSysModeNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_mode not between", value1, value2, "sysMode");
            return (Criteria) this;
        }

        public Criteria andProModeIsNull() {
            addCriterion("pro_mode is null");
            return (Criteria) this;
        }

        public Criteria andProModeIsNotNull() {
            addCriterion("pro_mode is not null");
            return (Criteria) this;
        }

        public Criteria andProModeEqualTo(Boolean value) {
            addCriterion("pro_mode =", value, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeNotEqualTo(Boolean value) {
            addCriterion("pro_mode <>", value, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeGreaterThan(Boolean value) {
            addCriterion("pro_mode >", value, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pro_mode >=", value, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeLessThan(Boolean value) {
            addCriterion("pro_mode <", value, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeLessThanOrEqualTo(Boolean value) {
            addCriterion("pro_mode <=", value, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeIn(List<Boolean> values) {
            addCriterion("pro_mode in", values, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeNotIn(List<Boolean> values) {
            addCriterion("pro_mode not in", values, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeBetween(Boolean value1, Boolean value2) {
            addCriterion("pro_mode between", value1, value2, "proMode");
            return (Criteria) this;
        }

        public Criteria andProModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pro_mode not between", value1, value2, "proMode");
            return (Criteria) this;
        }

        public Criteria andLankLevelIsNull() {
            addCriterion("lank_level is null");
            return (Criteria) this;
        }

        public Criteria andLankLevelIsNotNull() {
            addCriterion("lank_level is not null");
            return (Criteria) this;
        }

        public Criteria andLankLevelEqualTo(BigDecimal value) {
            addCriterion("lank_level =", value, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelNotEqualTo(BigDecimal value) {
            addCriterion("lank_level <>", value, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelGreaterThan(BigDecimal value) {
            addCriterion("lank_level >", value, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lank_level >=", value, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelLessThan(BigDecimal value) {
            addCriterion("lank_level <", value, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lank_level <=", value, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelIn(List<BigDecimal> values) {
            addCriterion("lank_level in", values, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelNotIn(List<BigDecimal> values) {
            addCriterion("lank_level not in", values, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lank_level between", value1, value2, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andLankLevelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lank_level not between", value1, value2, "lankLevel");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureIsNull() {
            addCriterion("cabinet_temperature is null");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureIsNotNull() {
            addCriterion("cabinet_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureEqualTo(BigDecimal value) {
            addCriterion("cabinet_temperature =", value, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureNotEqualTo(BigDecimal value) {
            addCriterion("cabinet_temperature <>", value, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureGreaterThan(BigDecimal value) {
            addCriterion("cabinet_temperature >", value, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cabinet_temperature >=", value, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureLessThan(BigDecimal value) {
            addCriterion("cabinet_temperature <", value, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cabinet_temperature <=", value, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureIn(List<BigDecimal> values) {
            addCriterion("cabinet_temperature in", values, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureNotIn(List<BigDecimal> values) {
            addCriterion("cabinet_temperature not in", values, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cabinet_temperature between", value1, value2, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andCabinetTemperatureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cabinet_temperature not between", value1, value2, "cabinetTemperature");
            return (Criteria) this;
        }

        public Criteria andStCurrentIsNull() {
            addCriterion("st_current is null");
            return (Criteria) this;
        }

        public Criteria andStCurrentIsNotNull() {
            addCriterion("st_current is not null");
            return (Criteria) this;
        }

        public Criteria andStCurrentEqualTo(BigDecimal value) {
            addCriterion("st_current =", value, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentNotEqualTo(BigDecimal value) {
            addCriterion("st_current <>", value, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentGreaterThan(BigDecimal value) {
            addCriterion("st_current >", value, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("st_current >=", value, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentLessThan(BigDecimal value) {
            addCriterion("st_current <", value, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("st_current <=", value, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentIn(List<BigDecimal> values) {
            addCriterion("st_current in", values, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentNotIn(List<BigDecimal> values) {
            addCriterion("st_current not in", values, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("st_current between", value1, value2, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andStCurrentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("st_current not between", value1, value2, "stCurrent");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureIsNull() {
            addCriterion("external_temperature is null");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureIsNotNull() {
            addCriterion("external_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureEqualTo(BigDecimal value) {
            addCriterion("external_temperature =", value, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureNotEqualTo(BigDecimal value) {
            addCriterion("external_temperature <>", value, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureGreaterThan(BigDecimal value) {
            addCriterion("external_temperature >", value, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("external_temperature >=", value, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureLessThan(BigDecimal value) {
            addCriterion("external_temperature <", value, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("external_temperature <=", value, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureIn(List<BigDecimal> values) {
            addCriterion("external_temperature in", values, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureNotIn(List<BigDecimal> values) {
            addCriterion("external_temperature not in", values, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("external_temperature between", value1, value2, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andExternalTemperatureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("external_temperature not between", value1, value2, "externalTemperature");
            return (Criteria) this;
        }

        public Criteria andStVoltageIsNull() {
            addCriterion("st_voltage is null");
            return (Criteria) this;
        }

        public Criteria andStVoltageIsNotNull() {
            addCriterion("st_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andStVoltageEqualTo(BigDecimal value) {
            addCriterion("st_voltage =", value, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageNotEqualTo(BigDecimal value) {
            addCriterion("st_voltage <>", value, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageGreaterThan(BigDecimal value) {
            addCriterion("st_voltage >", value, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("st_voltage >=", value, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageLessThan(BigDecimal value) {
            addCriterion("st_voltage <", value, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("st_voltage <=", value, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageIn(List<BigDecimal> values) {
            addCriterion("st_voltage in", values, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageNotIn(List<BigDecimal> values) {
            addCriterion("st_voltage not in", values, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("st_voltage between", value1, value2, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andStVoltageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("st_voltage not between", value1, value2, "stVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageIsNull() {
            addCriterion("al_voltage is null");
            return (Criteria) this;
        }

        public Criteria andAlVoltageIsNotNull() {
            addCriterion("al_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andAlVoltageEqualTo(BigDecimal value) {
            addCriterion("al_voltage =", value, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageNotEqualTo(BigDecimal value) {
            addCriterion("al_voltage <>", value, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageGreaterThan(BigDecimal value) {
            addCriterion("al_voltage >", value, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("al_voltage >=", value, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageLessThan(BigDecimal value) {
            addCriterion("al_voltage <", value, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("al_voltage <=", value, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageIn(List<BigDecimal> values) {
            addCriterion("al_voltage in", values, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageNotIn(List<BigDecimal> values) {
            addCriterion("al_voltage not in", values, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("al_voltage between", value1, value2, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andAlVoltageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("al_voltage not between", value1, value2, "alVoltage");
            return (Criteria) this;
        }

        public Criteria andCityElectricityIsNull() {
            addCriterion("city_electricity is null");
            return (Criteria) this;
        }

        public Criteria andCityElectricityIsNotNull() {
            addCriterion("city_electricity is not null");
            return (Criteria) this;
        }

        public Criteria andCityElectricityEqualTo(Boolean value) {
            addCriterion("city_electricity =", value, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityNotEqualTo(Boolean value) {
            addCriterion("city_electricity <>", value, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityGreaterThan(Boolean value) {
            addCriterion("city_electricity >", value, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityGreaterThanOrEqualTo(Boolean value) {
            addCriterion("city_electricity >=", value, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityLessThan(Boolean value) {
            addCriterion("city_electricity <", value, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityLessThanOrEqualTo(Boolean value) {
            addCriterion("city_electricity <=", value, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityIn(List<Boolean> values) {
            addCriterion("city_electricity in", values, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityNotIn(List<Boolean> values) {
            addCriterion("city_electricity not in", values, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityBetween(Boolean value1, Boolean value2) {
            addCriterion("city_electricity between", value1, value2, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCityElectricityNotBetween(Boolean value1, Boolean value2) {
            addCriterion("city_electricity not between", value1, value2, "cityElectricity");
            return (Criteria) this;
        }

        public Criteria andCabinetStateIsNull() {
            addCriterion("cabinet_state is null");
            return (Criteria) this;
        }

        public Criteria andCabinetStateIsNotNull() {
            addCriterion("cabinet_state is not null");
            return (Criteria) this;
        }

        public Criteria andCabinetStateEqualTo(Boolean value) {
            addCriterion("cabinet_state =", value, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateNotEqualTo(Boolean value) {
            addCriterion("cabinet_state <>", value, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateGreaterThan(Boolean value) {
            addCriterion("cabinet_state >", value, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cabinet_state >=", value, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLessThan(Boolean value) {
            addCriterion("cabinet_state <", value, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateLessThanOrEqualTo(Boolean value) {
            addCriterion("cabinet_state <=", value, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateIn(List<Boolean> values) {
            addCriterion("cabinet_state in", values, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateNotIn(List<Boolean> values) {
            addCriterion("cabinet_state not in", values, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateBetween(Boolean value1, Boolean value2) {
            addCriterion("cabinet_state between", value1, value2, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andCabinetStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cabinet_state not between", value1, value2, "cabinetState");
            return (Criteria) this;
        }

        public Criteria andStTimeIsNull() {
            addCriterion("st_time is null");
            return (Criteria) this;
        }

        public Criteria andStTimeIsNotNull() {
            addCriterion("st_time is not null");
            return (Criteria) this;
        }

        public Criteria andStTimeEqualTo(Date value) {
            addCriterion("st_time =", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeNotEqualTo(Date value) {
            addCriterion("st_time <>", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeGreaterThan(Date value) {
            addCriterion("st_time >", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("st_time >=", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeLessThan(Date value) {
            addCriterion("st_time <", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeLessThanOrEqualTo(Date value) {
            addCriterion("st_time <=", value, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeIn(List<Date> values) {
            addCriterion("st_time in", values, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeNotIn(List<Date> values) {
            addCriterion("st_time not in", values, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeBetween(Date value1, Date value2) {
            addCriterion("st_time between", value1, value2, "stTime");
            return (Criteria) this;
        }

        public Criteria andStTimeNotBetween(Date value1, Date value2) {
            addCriterion("st_time not between", value1, value2, "stTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andSumPowerIsNull() {
            addCriterion("sum_power is null");
            return (Criteria) this;
        }

        public Criteria andSumPowerIsNotNull() {
            addCriterion("sum_power is not null");
            return (Criteria) this;
        }

        public Criteria andSumPowerEqualTo(BigDecimal value) {
            addCriterion("sum_power =", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerNotEqualTo(BigDecimal value) {
            addCriterion("sum_power <>", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerGreaterThan(BigDecimal value) {
            addCriterion("sum_power >", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_power >=", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerLessThan(BigDecimal value) {
            addCriterion("sum_power <", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_power <=", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerIn(List<BigDecimal> values) {
            addCriterion("sum_power in", values, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerNotIn(List<BigDecimal> values) {
            addCriterion("sum_power not in", values, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_power between", value1, value2, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_power not between", value1, value2, "sumPower");
            return (Criteria) this;
        }

        public Criteria andNumTimeIsNull() {
            addCriterion("num_time is null");
            return (Criteria) this;
        }

        public Criteria andNumTimeIsNotNull() {
            addCriterion("num_time is not null");
            return (Criteria) this;
        }

        public Criteria andNumTimeEqualTo(String value) {
            addCriterion("num_time =", value, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeNotEqualTo(String value) {
            addCriterion("num_time <>", value, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeGreaterThan(String value) {
            addCriterion("num_time >", value, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeGreaterThanOrEqualTo(String value) {
            addCriterion("num_time >=", value, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeLessThan(String value) {
            addCriterion("num_time <", value, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeLessThanOrEqualTo(String value) {
            addCriterion("num_time <=", value, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeLike(String value) {
            addCriterion("num_time like", value, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeNotLike(String value) {
            addCriterion("num_time not like", value, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeIn(List<String> values) {
            addCriterion("num_time in", values, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeNotIn(List<String> values) {
            addCriterion("num_time not in", values, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeBetween(String value1, String value2) {
            addCriterion("num_time between", value1, value2, "numTime");
            return (Criteria) this;
        }

        public Criteria andNumTimeNotBetween(String value1, String value2) {
            addCriterion("num_time not between", value1, value2, "numTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeIsNull() {
            addCriterion("on_time is null");
            return (Criteria) this;
        }

        public Criteria andOnTimeIsNotNull() {
            addCriterion("on_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnTimeEqualTo(String value) {
            addCriterion("on_time =", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotEqualTo(String value) {
            addCriterion("on_time <>", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeGreaterThan(String value) {
            addCriterion("on_time >", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeGreaterThanOrEqualTo(String value) {
            addCriterion("on_time >=", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLessThan(String value) {
            addCriterion("on_time <", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLessThanOrEqualTo(String value) {
            addCriterion("on_time <=", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeLike(String value) {
            addCriterion("on_time like", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotLike(String value) {
            addCriterion("on_time not like", value, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeIn(List<String> values) {
            addCriterion("on_time in", values, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotIn(List<String> values) {
            addCriterion("on_time not in", values, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeBetween(String value1, String value2) {
            addCriterion("on_time between", value1, value2, "onTime");
            return (Criteria) this;
        }

        public Criteria andOnTimeNotBetween(String value1, String value2) {
            addCriterion("on_time not between", value1, value2, "onTime");
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

        public Criteria andMaintainTimeEqualTo(String value) {
            addCriterion("maintain_time =", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotEqualTo(String value) {
            addCriterion("maintain_time <>", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeGreaterThan(String value) {
            addCriterion("maintain_time >", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeGreaterThanOrEqualTo(String value) {
            addCriterion("maintain_time >=", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLessThan(String value) {
            addCriterion("maintain_time <", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLessThanOrEqualTo(String value) {
            addCriterion("maintain_time <=", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeLike(String value) {
            addCriterion("maintain_time like", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotLike(String value) {
            addCriterion("maintain_time not like", value, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeIn(List<String> values) {
            addCriterion("maintain_time in", values, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotIn(List<String> values) {
            addCriterion("maintain_time not in", values, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeBetween(String value1, String value2) {
            addCriterion("maintain_time between", value1, value2, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMaintainTimeNotBetween(String value1, String value2) {
            addCriterion("maintain_time not between", value1, value2, "maintainTime");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureIsNull() {
            addCriterion("mainboard_temperature is null");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureIsNotNull() {
            addCriterion("mainboard_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureEqualTo(BigDecimal value) {
            addCriterion("mainboard_temperature =", value, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureNotEqualTo(BigDecimal value) {
            addCriterion("mainboard_temperature <>", value, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureGreaterThan(BigDecimal value) {
            addCriterion("mainboard_temperature >", value, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mainboard_temperature >=", value, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureLessThan(BigDecimal value) {
            addCriterion("mainboard_temperature <", value, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mainboard_temperature <=", value, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureIn(List<BigDecimal> values) {
            addCriterion("mainboard_temperature in", values, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureNotIn(List<BigDecimal> values) {
            addCriterion("mainboard_temperature not in", values, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mainboard_temperature between", value1, value2, "mainboardTemperature");
            return (Criteria) this;
        }

        public Criteria andMainboardTemperatureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mainboard_temperature not between", value1, value2, "mainboardTemperature");
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

        public Criteria andStCoIsNull() {
            addCriterion("st_co is null");
            return (Criteria) this;
        }

        public Criteria andStCoIsNotNull() {
            addCriterion("st_co is not null");
            return (Criteria) this;
        }

        public Criteria andStCoEqualTo(BigDecimal value) {
            addCriterion("st_co =", value, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoNotEqualTo(BigDecimal value) {
            addCriterion("st_co <>", value, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoGreaterThan(BigDecimal value) {
            addCriterion("st_co >", value, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("st_co >=", value, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoLessThan(BigDecimal value) {
            addCriterion("st_co <", value, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("st_co <=", value, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoIn(List<BigDecimal> values) {
            addCriterion("st_co in", values, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoNotIn(List<BigDecimal> values) {
            addCriterion("st_co not in", values, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("st_co between", value1, value2, "stCo");
            return (Criteria) this;
        }

        public Criteria andStCoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("st_co not between", value1, value2, "stCo");
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

        public Criteria andOutputVoltageIsNull() {
            addCriterion("output_voltage is null");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageIsNotNull() {
            addCriterion("output_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageEqualTo(BigDecimal value) {
            addCriterion("output_voltage =", value, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageNotEqualTo(BigDecimal value) {
            addCriterion("output_voltage <>", value, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageGreaterThan(BigDecimal value) {
            addCriterion("output_voltage >", value, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("output_voltage >=", value, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageLessThan(BigDecimal value) {
            addCriterion("output_voltage <", value, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("output_voltage <=", value, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageIn(List<BigDecimal> values) {
            addCriterion("output_voltage in", values, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageNotIn(List<BigDecimal> values) {
            addCriterion("output_voltage not in", values, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("output_voltage between", value1, value2, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andOutputVoltageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("output_voltage not between", value1, value2, "outputVoltage");
            return (Criteria) this;
        }

        public Criteria andLoadModeIsNull() {
            addCriterion("load_mode is null");
            return (Criteria) this;
        }

        public Criteria andLoadModeIsNotNull() {
            addCriterion("load_mode is not null");
            return (Criteria) this;
        }

        public Criteria andLoadModeEqualTo(Boolean value) {
            addCriterion("load_mode =", value, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeNotEqualTo(Boolean value) {
            addCriterion("load_mode <>", value, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeGreaterThan(Boolean value) {
            addCriterion("load_mode >", value, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("load_mode >=", value, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeLessThan(Boolean value) {
            addCriterion("load_mode <", value, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeLessThanOrEqualTo(Boolean value) {
            addCriterion("load_mode <=", value, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeIn(List<Boolean> values) {
            addCriterion("load_mode in", values, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeNotIn(List<Boolean> values) {
            addCriterion("load_mode not in", values, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeBetween(Boolean value1, Boolean value2) {
            addCriterion("load_mode between", value1, value2, "loadMode");
            return (Criteria) this;
        }

        public Criteria andLoadModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("load_mode not between", value1, value2, "loadMode");
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