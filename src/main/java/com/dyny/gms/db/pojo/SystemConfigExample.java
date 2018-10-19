package com.dyny.gms.db.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SystemConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemConfigExample() {
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

        public Criteria andOnilneTimeoutIsNull() {
            addCriterion("i_onilne_timeout is null");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutIsNotNull() {
            addCriterion("i_onilne_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutEqualTo(Integer value) {
            addCriterion("i_onilne_timeout =", value, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutNotEqualTo(Integer value) {
            addCriterion("i_onilne_timeout <>", value, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutGreaterThan(Integer value) {
            addCriterion("i_onilne_timeout >", value, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_onilne_timeout >=", value, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutLessThan(Integer value) {
            addCriterion("i_onilne_timeout <", value, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("i_onilne_timeout <=", value, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutIn(List<Integer> values) {
            addCriterion("i_onilne_timeout in", values, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutNotIn(List<Integer> values) {
            addCriterion("i_onilne_timeout not in", values, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("i_onilne_timeout between", value1, value2, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andOnilneTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("i_onilne_timeout not between", value1, value2, "onilneTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutIsNull() {
            addCriterion("i_refresh_timeout is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutIsNotNull() {
            addCriterion("i_refresh_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutEqualTo(Integer value) {
            addCriterion("i_refresh_timeout =", value, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutNotEqualTo(Integer value) {
            addCriterion("i_refresh_timeout <>", value, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutGreaterThan(Integer value) {
            addCriterion("i_refresh_timeout >", value, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_refresh_timeout >=", value, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutLessThan(Integer value) {
            addCriterion("i_refresh_timeout <", value, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("i_refresh_timeout <=", value, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutIn(List<Integer> values) {
            addCriterion("i_refresh_timeout in", values, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutNotIn(List<Integer> values) {
            addCriterion("i_refresh_timeout not in", values, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("i_refresh_timeout between", value1, value2, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andRefreshTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("i_refresh_timeout not between", value1, value2, "refreshTimeout");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNull() {
            addCriterion("s_config_name is null");
            return (Criteria) this;
        }

        public Criteria andConfigNameIsNotNull() {
            addCriterion("s_config_name is not null");
            return (Criteria) this;
        }

        public Criteria andConfigNameEqualTo(String value) {
            addCriterion("s_config_name =", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotEqualTo(String value) {
            addCriterion("s_config_name <>", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThan(String value) {
            addCriterion("s_config_name >", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_config_name >=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThan(String value) {
            addCriterion("s_config_name <", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLessThanOrEqualTo(String value) {
            addCriterion("s_config_name <=", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameLike(String value) {
            addCriterion("s_config_name like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotLike(String value) {
            addCriterion("s_config_name not like", value, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameIn(List<String> values) {
            addCriterion("s_config_name in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotIn(List<String> values) {
            addCriterion("s_config_name not in", values, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameBetween(String value1, String value2) {
            addCriterion("s_config_name between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andConfigNameNotBetween(String value1, String value2) {
            addCriterion("s_config_name not between", value1, value2, "configName");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutIsNull() {
            addCriterion("i_alarm_timeout is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutIsNotNull() {
            addCriterion("i_alarm_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutEqualTo(Integer value) {
            addCriterion("i_alarm_timeout =", value, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutNotEqualTo(Integer value) {
            addCriterion("i_alarm_timeout <>", value, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutGreaterThan(Integer value) {
            addCriterion("i_alarm_timeout >", value, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_alarm_timeout >=", value, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutLessThan(Integer value) {
            addCriterion("i_alarm_timeout <", value, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutLessThanOrEqualTo(Integer value) {
            addCriterion("i_alarm_timeout <=", value, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutIn(List<Integer> values) {
            addCriterion("i_alarm_timeout in", values, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutNotIn(List<Integer> values) {
            addCriterion("i_alarm_timeout not in", values, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutBetween(Integer value1, Integer value2) {
            addCriterion("i_alarm_timeout between", value1, value2, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeoutNotBetween(Integer value1, Integer value2) {
            addCriterion("i_alarm_timeout not between", value1, value2, "alarmTimeout");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoIsNull() {
            addCriterion("s_copyright_info is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoIsNotNull() {
            addCriterion("s_copyright_info is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoEqualTo(String value) {
            addCriterion("s_copyright_info =", value, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoNotEqualTo(String value) {
            addCriterion("s_copyright_info <>", value, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoGreaterThan(String value) {
            addCriterion("s_copyright_info >", value, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoGreaterThanOrEqualTo(String value) {
            addCriterion("s_copyright_info >=", value, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoLessThan(String value) {
            addCriterion("s_copyright_info <", value, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoLessThanOrEqualTo(String value) {
            addCriterion("s_copyright_info <=", value, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoLike(String value) {
            addCriterion("s_copyright_info like", value, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoNotLike(String value) {
            addCriterion("s_copyright_info not like", value, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoIn(List<String> values) {
            addCriterion("s_copyright_info in", values, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoNotIn(List<String> values) {
            addCriterion("s_copyright_info not in", values, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoBetween(String value1, String value2) {
            addCriterion("s_copyright_info between", value1, value2, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCopyrightInfoNotBetween(String value1, String value2) {
            addCriterion("s_copyright_info not between", value1, value2, "copyrightInfo");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("s_company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("s_company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("s_company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("s_company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("s_company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("s_company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("s_company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("s_company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("s_company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("s_company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("s_company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("s_company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("s_company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("s_company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("s_company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("s_company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("s_company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("s_company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("s_company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("s_company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("s_company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("s_company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("s_company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("s_company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("s_company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("s_company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("s_company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("s_company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("s_contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("s_contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("s_contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("s_contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("s_contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("s_contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("s_contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("s_contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("s_contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("s_contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("s_contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("s_contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("s_contact_name not between", value1, value2, "contactName");
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