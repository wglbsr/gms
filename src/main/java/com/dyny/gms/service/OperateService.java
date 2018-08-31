package com.dyny.gms.service;

import com.dyny.gms.db.pojo.Operate;

import java.util.List;


public interface OperateService {
    int insertOperate(Operate operate);

    int insertTimerOperateList(List<Operate> operateList);

    Operate getOperate(Operate operate);

    List getOperateList(Operate operate);

    int deleteOperate(Operate operate);

    int insertOperate(List<Operate> operateList);

    int updateOperate(Operate operate);

    int getMaxOperateExeId(Operate operate);

    List getTimerOperateList(Operate operate);

    int deleteAllTimerOperateByMachineNo(String customerNo);

    int adjustTimeBtMachNo(String machineNo, String username);
}
