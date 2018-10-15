package com.dyny.gms.service.impl;

import com.dyny.gms.db.dao.BasisMapper;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.BasisService;
import com.dyny.gms.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
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
        return basisMapper.selectByOffset(offset, machNo,samplingInterval, Tool.DateUtil.timestampToDate(startTimestamp), Tool.DateUtil.timestampToDate(endTimestamp));
    }
}
