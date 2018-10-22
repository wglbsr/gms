package com.dyny.gms.service.impl;

import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.CacheMethodMapper;
import com.dyny.gms.db.dao.SystemConfigMapper;
import com.dyny.gms.db.pojo.CacheMethod;
import com.dyny.gms.db.pojo.CacheMethodExample;
import com.dyny.gms.db.pojo.SystemConfig;
import com.dyny.gms.db.pojo.SystemConfigExample;
import com.dyny.gms.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author:wanggl
 * @date:2018-10-22
 * @version:1.0.0
 */
@Service
public class SystemConfigServiceImpl implements SystemConfigService {
    @Autowired
    SystemConfigMapper systemConfigMapper;
    @Autowired
    CacheDao cacheDao;
    @Autowired
    CacheMethodMapper cacheMethodMapper;

    @Override
    public int initMybatisInterceptorCache() {
        CacheMethodExample cacheMethodExample = new CacheMethodExample();
        cacheMethodExample.or().andDeletedEqualTo(false);
        List<CacheMethod> cacheMethodList = cacheMethodMapper.selectByExample(cacheMethodExample);
        cacheDao.set(CacheMethod.class.getSimpleName(), cacheMethodList);
        return 1;
    }

    @Override
    public SystemConfig getConfig() {
        SystemConfig systemConfig = cacheDao.get(this.SYSTEM_CONFIG_CACHE, SystemConfig.class);
        if (systemConfig == null) {
            SystemConfigExample systemConfigExample = new SystemConfigExample();
            systemConfigExample.or().andActivatedEqualTo(true);
            List<SystemConfig> systemConfigList = systemConfigMapper.selectByExample(systemConfigExample);
            if (systemConfigList == null || systemConfigList.size() == 0) {
                return null;
            } else {
                systemConfig = systemConfigList.get(0);
                cacheDao.set(this.SYSTEM_CONFIG_CACHE, systemConfig);
            }
        }
        return systemConfig;
    }

    @Override
    public int updateConfig(SystemConfig systemConfig) {
        systemConfig.setModifyTime(new Date());
        int result = systemConfigMapper.updateByPrimaryKeySelective(systemConfig);
        if (result > 0) {
            cacheDao.delete(this.SYSTEM_CONFIG_CACHE);
        }
        return result;
    }

    @Override
    public int createConfig(SystemConfig systemConfig) {
        systemConfig.setCreateTime(new Date());
        systemConfig.setActivated(true);
        return systemConfigMapper.insert(systemConfig);
    }
}
