package com.dyny.gms.service.impl;

import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.WarningMapper;
import com.dyny.gms.db.dao.WarningTypeMapper;
import com.dyny.gms.db.pojo.Warning;
import com.dyny.gms.db.pojo.WarningType;
import com.dyny.gms.db.pojo.WarningTypeExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.SystemConfigService;
import com.dyny.gms.service.WarningService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author:wanggl
 * @date:2018-10-23
 * @version:1.0.0
 */
@Service
public class WarningServiceImpl extends BaseService implements WarningService {
    @Autowired
    WarningMapper warningMapper;
    @Autowired
    CacheDao cacheDao;
    @Autowired
    SystemConfigService systemConfigService;
    @Autowired
    WarningTypeMapper warningTypeMapper;


    @Override
    public List<Warning> getRealTimeAlarmInfo(String customerNo) {
        return null;
    }

    @Override
    public List<Map> getWarningTypeCnt(String generatorNo) {
        return warningMapper.selectActionCount(generatorNo);
    }

    @Override
    public String getWarningTypeList(int id, int pageNum, int pageSize) {
        if (id == 0 && (pageNum <= 0 || pageSize <= 0)) {
            List allWarningType = cacheDao.getList(CACHE_WARNING_TYPE_LIST_KEY, WarningType.class);
            if (allWarningType == null || allWarningType.size() == 0) {
                allWarningType = this.getAllWarningType();
            }
            return super.getSuccessResult(allWarningType);
        }
        WarningTypeExample warningTypeExample = new WarningTypeExample();
        if (id > 0) {
            warningTypeExample.or().andIdEqualTo(id);
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        List result = warningTypeMapper.selectByExample(warningTypeExample);
        int total = (int) page.getTotal();
        return super.getSuccessResult(result, pageNum, pageSize, total);
    }

    @Override
    public int createWarningType(WarningType warningType) {
        warningType.setCreateTime(new Date());
        return warningTypeMapper.insertSelective(warningType);
    }

    @Override
    public int updateWarningType(WarningType warningType) {
        warningType.setModifyTime(new Date());
        return warningTypeMapper.updateByPrimaryKeySelective(warningType);
    }

    @Override
    public int deleteWarningType(int id) {
        return warningTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void loadWarningTypeToCache() {
        cacheDao.set(CACHE_WARNING_TYPE_LIST_KEY, this.getAllWarningType());
    }

    @Override
    public List<WarningType> getAllWarningType() {
        WarningTypeExample warningTypeExample = new WarningTypeExample();
        List result = warningTypeMapper.selectByExample(warningTypeExample);
        return result;
    }

    @Override
    public int checkWarningType(int warningType) {
        WarningTypeExample warningTypeExample = new WarningTypeExample();
        warningTypeExample.or().andWarningTypeEqualTo(warningType);
        List result = warningTypeMapper.selectByExample(warningTypeExample);
        return result != null && result.size() > 0 ? 1 : 0;
    }

    @Override
    public int checkWarningCode(String warningCode) {
        WarningTypeExample warningTypeExample = new WarningTypeExample();
        warningTypeExample.or().andWarningCodeEqualTo(warningCode);
        List result = warningTypeMapper.selectByExample(warningTypeExample);
        return result != null && result.size() > 0 ? 1 : 0;
    }
}
