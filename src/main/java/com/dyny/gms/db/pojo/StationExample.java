package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationExample() {
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

        public Criteria andStationNameIsNull() {
            addCriterion("s_station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("s_station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("s_station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("s_station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("s_station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("s_station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("s_station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("s_station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("s_station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("s_station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("s_station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("s_station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("s_station_name not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNull() {
            addCriterion("s_station_no is null");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNotNull() {
            addCriterion("s_station_no is not null");
            return (Criteria) this;
        }

        public Criteria andStationNoEqualTo(String value) {
            addCriterion("s_station_no =", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotEqualTo(String value) {
            addCriterion("s_station_no <>", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThan(String value) {
            addCriterion("s_station_no >", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("s_station_no >=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThan(String value) {
            addCriterion("s_station_no <", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThanOrEqualTo(String value) {
            addCriterion("s_station_no <=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLike(String value) {
            addCriterion("s_station_no like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotLike(String value) {
            addCriterion("s_station_no not like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoIn(List<String> values) {
            addCriterion("s_station_no in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotIn(List<String> values) {
            addCriterion("s_station_no not in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoBetween(String value1, String value2) {
            addCriterion("s_station_no between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotBetween(String value1, String value2) {
            addCriterion("s_station_no not between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateIsNull() {
            addCriterion("s_station_coordinate is null");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateIsNotNull() {
            addCriterion("s_station_coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateEqualTo(String value) {
            addCriterion("s_station_coordinate =", value, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateNotEqualTo(String value) {
            addCriterion("s_station_coordinate <>", value, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateGreaterThan(String value) {
            addCriterion("s_station_coordinate >", value, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("s_station_coordinate >=", value, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateLessThan(String value) {
            addCriterion("s_station_coordinate <", value, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateLessThanOrEqualTo(String value) {
            addCriterion("s_station_coordinate <=", value, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateLike(String value) {
            addCriterion("s_station_coordinate like", value, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateNotLike(String value) {
            addCriterion("s_station_coordinate not like", value, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateIn(List<String> values) {
            addCriterion("s_station_coordinate in", values, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateNotIn(List<String> values) {
            addCriterion("s_station_coordinate not in", values, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateBetween(String value1, String value2) {
            addCriterion("s_station_coordinate between", value1, value2, "stationCoordinate");
            return (Criteria) this;
        }

        public Criteria andStationCoordinateNotBetween(String value1, String value2) {
            addCriterion("s_station_coordinate not between", value1, value2, "stationCoordinate");
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

        public Criteria andCreatorIsNull() {
            addCriterion("i_creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("i_creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Integer value) {
            addCriterion("i_creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Integer value) {
            addCriterion("i_creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Integer value) {
            addCriterion("i_creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Integer value) {
            addCriterion("i_creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Integer value) {
            addCriterion("i_creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Integer> values) {
            addCriterion("i_creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Integer> values) {
            addCriterion("i_creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Integer value1, Integer value2) {
            addCriterion("i_creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Integer value1, Integer value2) {
            addCriterion("i_creator not between", value1, value2, "creator");
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

        public Criteria andModifierIsNull() {
            addCriterion("i_modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("i_modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Integer value) {
            addCriterion("i_modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Integer value) {
            addCriterion("i_modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Integer value) {
            addCriterion("i_modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Integer value) {
            addCriterion("i_modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Integer value) {
            addCriterion("i_modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Integer> values) {
            addCriterion("i_modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Integer> values) {
            addCriterion("i_modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Integer value1, Integer value2) {
            addCriterion("i_modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Integer value1, Integer value2) {
            addCriterion("i_modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("i_status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("i_status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("i_status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("i_status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("i_status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("i_status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("i_status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("i_status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("i_status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("i_status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("i_status not between", value1, value2, "status");
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

        public Criteria andStationAddressIsNull() {
            addCriterion("s_station_address is null");
            return (Criteria) this;
        }

        public Criteria andStationAddressIsNotNull() {
            addCriterion("s_station_address is not null");
            return (Criteria) this;
        }

        public Criteria andStationAddressEqualTo(String value) {
            addCriterion("s_station_address =", value, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressNotEqualTo(String value) {
            addCriterion("s_station_address <>", value, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressGreaterThan(String value) {
            addCriterion("s_station_address >", value, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressGreaterThanOrEqualTo(String value) {
            addCriterion("s_station_address >=", value, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressLessThan(String value) {
            addCriterion("s_station_address <", value, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressLessThanOrEqualTo(String value) {
            addCriterion("s_station_address <=", value, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressLike(String value) {
            addCriterion("s_station_address like", value, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressNotLike(String value) {
            addCriterion("s_station_address not like", value, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressIn(List<String> values) {
            addCriterion("s_station_address in", values, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressNotIn(List<String> values) {
            addCriterion("s_station_address not in", values, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressBetween(String value1, String value2) {
            addCriterion("s_station_address between", value1, value2, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andStationAddressNotBetween(String value1, String value2) {
            addCriterion("s_station_address not between", value1, value2, "stationAddress");
            return (Criteria) this;
        }

        public Criteria andAdministratorIsNull() {
            addCriterion("i_administrator is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorIsNotNull() {
            addCriterion("i_administrator is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorEqualTo(Integer value) {
            addCriterion("i_administrator =", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorNotEqualTo(Integer value) {
            addCriterion("i_administrator <>", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorGreaterThan(Integer value) {
            addCriterion("i_administrator >", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_administrator >=", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorLessThan(Integer value) {
            addCriterion("i_administrator <", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorLessThanOrEqualTo(Integer value) {
            addCriterion("i_administrator <=", value, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorIn(List<Integer> values) {
            addCriterion("i_administrator in", values, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorNotIn(List<Integer> values) {
            addCriterion("i_administrator not in", values, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorBetween(Integer value1, Integer value2) {
            addCriterion("i_administrator between", value1, value2, "administrator");
            return (Criteria) this;
        }

        public Criteria andAdministratorNotBetween(Integer value1, Integer value2) {
            addCriterion("i_administrator not between", value1, value2, "administrator");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNull() {
            addCriterion("s_station_type is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNotNull() {
            addCriterion("s_station_type is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeEqualTo(String value) {
            addCriterion("s_station_type =", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotEqualTo(String value) {
            addCriterion("s_station_type <>", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThan(String value) {
            addCriterion("s_station_type >", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("s_station_type >=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThan(String value) {
            addCriterion("s_station_type <", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThanOrEqualTo(String value) {
            addCriterion("s_station_type <=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLike(String value) {
            addCriterion("s_station_type like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotLike(String value) {
            addCriterion("s_station_type not like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeIn(List<String> values) {
            addCriterion("s_station_type in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotIn(List<String> values) {
            addCriterion("s_station_type not in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeBetween(String value1, String value2) {
            addCriterion("s_station_type between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotBetween(String value1, String value2) {
            addCriterion("s_station_type not between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStartVoltageIsNull() {
            addCriterion("i_start_voltage is null");
            return (Criteria) this;
        }

        public Criteria andStartVoltageIsNotNull() {
            addCriterion("i_start_voltage is not null");
            return (Criteria) this;
        }

        public Criteria andStartVoltageEqualTo(Integer value) {
            addCriterion("i_start_voltage =", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotEqualTo(Integer value) {
            addCriterion("i_start_voltage <>", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageGreaterThan(Integer value) {
            addCriterion("i_start_voltage >", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_start_voltage >=", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageLessThan(Integer value) {
            addCriterion("i_start_voltage <", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageLessThanOrEqualTo(Integer value) {
            addCriterion("i_start_voltage <=", value, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageIn(List<Integer> values) {
            addCriterion("i_start_voltage in", values, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotIn(List<Integer> values) {
            addCriterion("i_start_voltage not in", values, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageBetween(Integer value1, Integer value2) {
            addCriterion("i_start_voltage between", value1, value2, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andStartVoltageNotBetween(Integer value1, Integer value2) {
            addCriterion("i_start_voltage not between", value1, value2, "startVoltage");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNull() {
            addCriterion("s_customer_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("s_customer_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("s_customer_no =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("s_customer_no <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("s_customer_no >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("s_customer_no >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("s_customer_no <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("s_customer_no <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("s_customer_no like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("s_customer_no not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("s_customer_no in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("s_customer_no not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("s_customer_no between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("s_customer_no not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoIsNull() {
            addCriterion("s_unit_no is null");
            return (Criteria) this;
        }

        public Criteria andUnitNoIsNotNull() {
            addCriterion("s_unit_no is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNoEqualTo(String value) {
            addCriterion("s_unit_no =", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotEqualTo(String value) {
            addCriterion("s_unit_no <>", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoGreaterThan(String value) {
            addCriterion("s_unit_no >", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoGreaterThanOrEqualTo(String value) {
            addCriterion("s_unit_no >=", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLessThan(String value) {
            addCriterion("s_unit_no <", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLessThanOrEqualTo(String value) {
            addCriterion("s_unit_no <=", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLike(String value) {
            addCriterion("s_unit_no like", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotLike(String value) {
            addCriterion("s_unit_no not like", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoIn(List<String> values) {
            addCriterion("s_unit_no in", values, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotIn(List<String> values) {
            addCriterion("s_unit_no not in", values, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoBetween(String value1, String value2) {
            addCriterion("s_unit_no between", value1, value2, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotBetween(String value1, String value2) {
            addCriterion("s_unit_no not between", value1, value2, "unitNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoIsNull() {
            addCriterion("s_operator_no is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNoIsNotNull() {
            addCriterion("s_operator_no is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNoEqualTo(String value) {
            addCriterion("s_operator_no =", value, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoNotEqualTo(String value) {
            addCriterion("s_operator_no <>", value, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoGreaterThan(String value) {
            addCriterion("s_operator_no >", value, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoGreaterThanOrEqualTo(String value) {
            addCriterion("s_operator_no >=", value, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoLessThan(String value) {
            addCriterion("s_operator_no <", value, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoLessThanOrEqualTo(String value) {
            addCriterion("s_operator_no <=", value, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoLike(String value) {
            addCriterion("s_operator_no like", value, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoNotLike(String value) {
            addCriterion("s_operator_no not like", value, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoIn(List<String> values) {
            addCriterion("s_operator_no in", values, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoNotIn(List<String> values) {
            addCriterion("s_operator_no not in", values, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoBetween(String value1, String value2) {
            addCriterion("s_operator_no between", value1, value2, "operatorNo");
            return (Criteria) this;
        }

        public Criteria andOperatorNoNotBetween(String value1, String value2) {
            addCriterion("s_operator_no not between", value1, value2, "operatorNo");
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

        public Criteria andStationLatitudeIsNull() {
            addCriterion("s_station_latitude is null");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeIsNotNull() {
            addCriterion("s_station_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeEqualTo(String value) {
            addCriterion("s_station_latitude =", value, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeNotEqualTo(String value) {
            addCriterion("s_station_latitude <>", value, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeGreaterThan(String value) {
            addCriterion("s_station_latitude >", value, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("s_station_latitude >=", value, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeLessThan(String value) {
            addCriterion("s_station_latitude <", value, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeLessThanOrEqualTo(String value) {
            addCriterion("s_station_latitude <=", value, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeLike(String value) {
            addCriterion("s_station_latitude like", value, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeNotLike(String value) {
            addCriterion("s_station_latitude not like", value, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeIn(List<String> values) {
            addCriterion("s_station_latitude in", values, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeNotIn(List<String> values) {
            addCriterion("s_station_latitude not in", values, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeBetween(String value1, String value2) {
            addCriterion("s_station_latitude between", value1, value2, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLatitudeNotBetween(String value1, String value2) {
            addCriterion("s_station_latitude not between", value1, value2, "stationLatitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeIsNull() {
            addCriterion("s_station_longitude is null");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeIsNotNull() {
            addCriterion("s_station_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeEqualTo(String value) {
            addCriterion("s_station_longitude =", value, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeNotEqualTo(String value) {
            addCriterion("s_station_longitude <>", value, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeGreaterThan(String value) {
            addCriterion("s_station_longitude >", value, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("s_station_longitude >=", value, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeLessThan(String value) {
            addCriterion("s_station_longitude <", value, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeLessThanOrEqualTo(String value) {
            addCriterion("s_station_longitude <=", value, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeLike(String value) {
            addCriterion("s_station_longitude like", value, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeNotLike(String value) {
            addCriterion("s_station_longitude not like", value, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeIn(List<String> values) {
            addCriterion("s_station_longitude in", values, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeNotIn(List<String> values) {
            addCriterion("s_station_longitude not in", values, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeBetween(String value1, String value2) {
            addCriterion("s_station_longitude between", value1, value2, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andStationLongitudeNotBetween(String value1, String value2) {
            addCriterion("s_station_longitude not between", value1, value2, "stationLongitude");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNull() {
            addCriterion("i_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitIdIsNotNull() {
            addCriterion("i_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitIdEqualTo(Integer value) {
            addCriterion("i_unit_id =", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotEqualTo(Integer value) {
            addCriterion("i_unit_id <>", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThan(Integer value) {
            addCriterion("i_unit_id >", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_unit_id >=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThan(Integer value) {
            addCriterion("i_unit_id <", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("i_unit_id <=", value, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdIn(List<Integer> values) {
            addCriterion("i_unit_id in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotIn(List<Integer> values) {
            addCriterion("i_unit_id not in", values, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("i_unit_id between", value1, value2, "unitId");
            return (Criteria) this;
        }

        public Criteria andUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("i_unit_id not between", value1, value2, "unitId");
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