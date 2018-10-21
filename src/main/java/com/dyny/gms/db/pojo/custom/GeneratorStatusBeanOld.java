package com.dyny.gms.db.pojo.custom;

import com.alibaba.fastjson.annotation.JSONField;
import com.dyny.gms.db.pojo.Basis;
import com.dyny.gms.db.pojo.Generator;
import com.dyny.gms.db.pojo.Station;
import com.dyny.gms.utils.CommonUtil;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author:wanggl
 * @date:2018-10-19
 * @version:1.0.0
 */
public class GeneratorStatusBeanOld {
    public String Acity_electricity;
    public String Expr1;
    public Boolean activated;
    public BigDecimal al_voltage;
    public int boardVersion;
    public BigDecimal external_temperature;
    public String fuel_type;
    public String generatorName;
    public String generatorNo;
    //    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    public String inter_time;
    public float lank_level;
    public float lank_per;
    public Boolean load_mode;
    public BigDecimal maintain_time;
    public BigDecimal output_voltage;
    public Boolean pro_mode;
    public BigDecimal st_co;
    public BigDecimal st_current;
    public String st_state;
    public BigDecimal st_voltag;
    public BigDecimal start_Voltage;
    public String state1;
    public String stationLatitude;
    public String stationLongitude;
    public String stationName;
    public String stationType;
    public int sum_time;
    public int sys_mode;

    public GeneratorStatusBeanOld(Generator generator, Basis basis, Station station) {
        this.generatorName = generator.getMachName();
        this.generatorNo = generator.getMachNo();
        this.fuel_type = generator.getFuelType();
        this.stationType = generator.getMachType();
        this.output_voltage = basis.getOutputVoltage();
        this.st_current = BigDecimal.valueOf(basis.getStCurrent().floatValue() / 10);
        this.start_Voltage = generator.getStartVoltage();
        this.al_voltage = basis.getAlVoltage();
        this.st_voltag = basis.getStVoltage();
        this.external_temperature = basis.getCabinetTemperature();
        this.st_co = basis.getStCo();
        this.st_state = basis.getState() ? "休眠" : "发电";
        this.state1 = this.isOnline(basis.getInterTime()) ? "休眠" : "发电";
        this.Acity_electricity = basis.getCityElectricity() ? "停电" : "市电";
        this.sum_time = generator.getTotalGenerateTime();
        this.maintain_time = generator.getMaintainTime();
        this.pro_mode = basis.getProMode();
        this.inter_time = CommonUtil.Date.getDateStringByPattern(basis.getInterTime(), "yyyy-MM-dd HH:mm:ss");
        this.lank_per = basis.getLankLevel().floatValue() > 100 ? 100 : basis.getLankLevel().floatValue();
        this.lank_level = this.lank_per * generator.getVolumeno().floatValue() / 100;
        this.activated = generator.getActivated();
        this.Expr1 = "";
        if (station != null) {
            this.stationLatitude = station.getStationLatitude();
            this.stationLongitude = station.getStationLongitude();
            this.stationName = station.getStationName();
            this.stationType = station.getStationType();
        }
        this.sys_mode = basis.getSysMode();
        this.load_mode = basis.getLoadMode();
        this.boardVersion = generator.getBoardVersion();
    }


    private boolean isOnline(Date date) {
        Date now = new Date();
        date.getTime();
        return now.getTime() - date.getTime() <= 180000;
    }


}
