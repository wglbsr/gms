package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.OperateMapper;
import com.dyny.gms.db.pojo.Operate;
import com.dyny.gms.db.pojo.OperateExample;
import com.dyny.gms.service.OperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OperateServiceImpl implements OperateService {
    @Autowired
    OperateMapper operateMapper;
    private static Integer START_GENGERATOR = 13;
    private static Integer STOP_GENGERATOR = 16;


    @Override
    public int insertOperate(Operate operate) {
        return operateMapper.insert(operate);
    }


    @Override
    public int insertOperate(List<Operate> operateList) {
        int re = 0;
        for (Operate operate : operateList) {
            re += operateMapper.insert(operate);
        }
        return re;
    }

    @Override
    public int deleteOperate(Operate operate) {
        return operateMapper.updateByPrimaryKeySelective(operate);
    }

    @Override
    public int getMaxOperateExeId(Operate operate) {
        return operateMapper.selectMaxExeIdByMachNo(operate.getMachNo());
    }

    @Override
    public int insertTimerOperateList(List<Operate> operateList) {
        if (operateList == null || operateList.size() == 0) {
            return 0;
        }
//        int maxExeId = operateMapper.selectMaxExeIdByMachNo(operateList.get(0).getMachNo());
//        for (Operate operate : operateList) {
//            maxExeId++;
//            operate.setExecuteId(maxExeId % 255);
//        }
        return operateMapper.insertBatch(operateList);
    }

    @Override
    public Operate getOperate(Operate operate) {
        return operateMapper.selectByPrimaryKey(operate.getId());
    }

    @Override
    public int updateOperate(Operate operate) {
        return operateMapper.updateByPrimaryKeySelective(operate);
    }


    @Override
    public List getOperateList(Operate operate) {
        OperateExample example = new OperateExample();
        OperateExample.Criteria criteria = example.createCriteria();
        criteria.andMachNoEqualTo(operate.getMachNo());
        criteria.andDeletedEqualTo(false);
        criteria.andExecuteIdIsNotNull();
        return operateMapper.selectByExample(example);
    }

    @Override
    public List getTimerOperateList(Operate operate) {
        OperateExample example = new OperateExample();
        OperateExample.Criteria criteria = example.createCriteria();
        criteria.andMachNoEqualTo(operate.getMachNo());
        List list = new ArrayList();
        list.add(START_GENGERATOR);
        list.add(STOP_GENGERATOR);
        criteria.andOpNoIn(list);
        criteria.andDeletedEqualTo(false);
        criteria.andExecuteIdIsNotNull();
        return operateMapper.selectByExample(example);
    }

    @Override
    public int deleteAllTimerOperateByMachineNo(String machineNo) {
        Operate operate = new Operate();
        OperateExample example = new OperateExample();
        example.or().andMachNoEqualTo(machineNo);
        operate.setExecuteId(0);
        operate.setDeleted(true);
        return operateMapper.updateByExampleSelective(operate, example);
    }
}
