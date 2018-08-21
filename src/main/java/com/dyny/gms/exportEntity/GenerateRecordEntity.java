package com.dyny.gms.exportEntity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.dyny.gms.utils.Tool;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GenerateRecordEntity {


    public static List<GenerateRecordEntity> parseObjectToGenerateRecordEntity(List<Map> result) {
        List<GenerateRecordEntity> list = new ArrayList<GenerateRecordEntity>();
        for (Map temp : result) {
            GenerateRecordEntity entity = new GenerateRecordEntity();
            entity.setEnd_time((String) temp.get("end_time"));
            entity.setStart_time((String) temp.get("start_time"));
            entity.setMach_name((String) temp.get("mach_name"));
            entity.setMach_no((String) temp.get("mach_no"));
            entity.setNum_time(Integer.valueOf((String) temp.get("num_time")));
            list.add(entity);
        }
        return list;
    }


    public GenerateRecordEntity() {
        mach_name = null;
    }

    public String getMach_no() {
        return mach_no;
    }

    public void setMach_no(String mach_no) {
        this.mach_no = mach_no;
    }

    public String getMach_name() {
        return mach_name;
    }

    public void setMach_name(String mach_name) {
        this.mach_name = mach_name;
    }

    public String getStart_time() {
        return start_time;
    }


    public void setStart_time(long start_time) {
        this.start_time = Tool.DateUtil.timestampToStr(start_time);
    }

    public void setEnd_time(long end_time) {
        this.end_time = Tool.DateUtil.timestampToStr(end_time);
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getEnd_time() {
        return end_time;
    }


    public int getNum_time() {
        return num_time;
    }

    public void setNum_time(int num_time) {
        this.num_time = num_time;
    }

    @Excel(name = "油机编码", width = 30, isImportField = "true_st")
    private String mach_no = null;
    @Excel(name = "油机/基站名称", width = 30, isImportField = "true_st")
    private String mach_name;
    @Excel(name = "开始发电时间", width = 30, isImportField = "true_st")
    private String start_time = null;
    @Excel(name = "结束发电时间", width = 30, isImportField = "true_st")
    private String end_time = null;
    @Excel(name = "发电时长(分钟)", width = 30, isImportField = "true_st", isStatistics = true)
    private int num_time = 0;

}
