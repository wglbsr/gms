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
        if (operateList == null || operateList.size() == 0) {
            return 0;
        }
        return operateMapper.insertBatch(operateList);
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
    public int insertTimerOperateList(List<String> machNoList,int start,String cmd) {
        List<Operate>operateList = new ArrayList<>();
        return 0;//operateMapper.insertBatch(null);
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


    /**
     * unfinished!!!!!!!!!!
     *
     * @param machineNo
     * @param username
     * @return
     */
    @Override
    public int adjustTimeBtMachNo(String machineNo, String username) {
        String[] cmd = {"84", "08", "14", "yy", "yy", "mm", "dd", "hh", "MM", "ss", "check", "16"};
        List cmdArr = new ArrayList();
        Operate operate = new Operate();
        operate.setCreatTime(new Date());
        operate.setMachNo(machineNo);
        operate.setOpNo(12);
        operate.setDeleted(false);
        operate.setAction(0);
        operate.setCreatPer(username);
        return operateMapper.insert(operate);
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
    public int deleteAllTimerOperateByMachineNoList(List<String> generatorNoList) {
        Operate operate = new Operate();
        OperateExample example = new OperateExample();
        if (generatorNoList.size() == 0) {
            return 0;
        }
        List<Integer> opList = new ArrayList<>();
        opList.add(16);//关机命令编号
        opList.add(13);//开机命令编号
        example.or().andMachNoIn(generatorNoList).andOpNoIn(opList);
        operate.setExecuteId(0);
        operate.setDeleted(true);
        return operateMapper.updateByExampleSelective(operate, example);
    }

    @Override
    public int deleteAllTimerOperateByMachineNo(String generatorNo) {
        List<String> generatorNoList = new ArrayList<>();
        generatorNoList.add(generatorNo);
        return this.deleteAllTimerOperateByMachineNoList(generatorNoList);
    }
}
