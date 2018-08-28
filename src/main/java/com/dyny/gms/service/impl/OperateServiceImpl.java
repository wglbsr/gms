package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.OperateMapper;
import com.dyny.gms.db.pojo.Operate;
import com.dyny.gms.db.pojo.OperateExample;
import com.dyny.gms.service.OperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OperateServiceImpl implements OperateService {
    @Autowired
    OperateMapper operateMapper;

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
        return operateMapper.deleteByPrimaryKey(operate.getId());
    }

    @Override
    public Operate getOperate(Operate operate) {
        return operateMapper.selectByPrimaryKey(operate.getId());
    }


    @Override
    public List getOperateList(Operate operate) {
        OperateExample example = new OperateExample();
        OperateExample.Criteria criteria = example.createCriteria();
        criteria.andActualExecuteTimeGreaterThan(new Date());
        criteria.andMachNoEqualTo(operate.getMachNo());
        criteria.andActualExecuteTimeIsNotNull();
        return operateMapper.selectByExample(example);
    }
}
