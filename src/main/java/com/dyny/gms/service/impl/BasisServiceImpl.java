package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.BasisMapper;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.BasisService;
import com.dyny.gms.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

/**
 * @author:wanggl
 * @date:2018-10-12
 * @version:1.0.0
 */
@Service
public class BasisServiceImpl extends BaseService implements BasisService {
    @Autowired
    BasisMapper basisMapper;

    @Override
    public List getBasisByOffset(int offset, String machNo,int samplingInterval, long startTimestamp, long endTimestamp) throws ParseException {
        return basisMapper.selectByOffset(offset, machNo,samplingInterval, CommonUtil.DateUtil.timestampToDate(startTimestamp), CommonUtil.DateUtil.timestampToDate(endTimestamp));
    }
}
