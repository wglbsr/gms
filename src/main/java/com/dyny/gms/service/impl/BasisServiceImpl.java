package com.dyny.gms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.BasisMapper;
import com.dyny.gms.db.pojo.Basis;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.BasisService;
import com.dyny.gms.utils.CommonUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author:wanggl
 * @date:2018-10-12
 * @version:1.0.0
 */
@Service
public class BasisServiceImpl extends BaseService implements BasisService {
    private static Logger logger = Logger.getLogger(BasisServiceImpl.class);


    @Autowired
    BasisMapper basisMapper;
    @Autowired
    CacheDao cacheDao;

    private static String BASIS_ID_PREFIX = "MaxBasisId";

    @Override
    public List getBasisByOffset(int offset, String machNo, int samplingInterval, long startTimestamp, long endTimestamp) throws ParseException {
        List<Basis> bisisList = basisMapper.selectByOffset(offset, machNo, samplingInterval, CommonUtil.Date.timestampToDate(startTimestamp), CommonUtil.Date.timestampToDate(endTimestamp));
        logger.info(JSONObject.toJSONString(new Basis()));
        return bisisList;
    }

    @Override
    public Basis getBasisFromCache(String generatorNo) {
        if (!CommonUtil.String.validStr(generatorNo)) {
            return null;
        }
        //1.查找缓存
        Basis basis = cacheDao.get(generatorNo, Basis.class, true);
        if (basis == null) {
            basis = this.getLastBasis(generatorNo);
            if (basis != null) {
                cacheDao.set(generatorNo, basis, Basis.class);
            }
        }
        return basis;
    }

    @Override
    public Basis getLastBasis(String generatorNo) {
        return basisMapper.selectByMachNo(generatorNo);
    }

    @Override
    public List<Integer> getBasisIdListFromCache() {
        List<Integer> result = new ArrayList<>();
        Set<String> keys = cacheDao.getKeys(BASIS_ID_PREFIX + "*");
        for (String key : keys) {
            Integer value = cacheDao.get(key, Integer.class);
            result.add(value);
        }
        return result;
    }

    @Override
    public int saveBasisIdToCache(String generatorNo, Integer id) {
        cacheDao.set(BASIS_ID_PREFIX + generatorNo, id);
        return 1;
    }
}
