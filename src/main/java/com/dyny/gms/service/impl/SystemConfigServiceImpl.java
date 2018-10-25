package com.dyny.gms.service.impl;

import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.CacheMethodMapper;
import com.dyny.gms.db.dao.SystemConfigMapper;
import com.dyny.gms.db.pojo.CacheMethod;
import com.dyny.gms.db.pojo.CacheMethodExample;
import com.dyny.gms.db.pojo.SystemConfig;
import com.dyny.gms.db.pojo.SystemConfigExample;
import com.dyny.gms.service.BaseService;
import com.dyny.gms.service.SystemConfigService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang3.StringUtils;
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
public class SystemConfigServiceImpl extends BaseService implements SystemConfigService {
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
    public String getCacheMethodList(String keyWord, int pageNum, int pageSize) {
        CacheMethodExample cacheMethodExample = new CacheMethodExample();
        if (!StringUtils.isEmpty(keyWord)) {
            cacheMethodExample.or().andDeletedEqualTo(false).andPojoNameLike(super.appendLike(keyWord));
            cacheMethodExample.or().andDeletedEqualTo(false).andPropertyNameLike(super.appendLike(keyWord));
            cacheMethodExample.or().andDeletedEqualTo(false).andMapperIdLike(super.appendLike(keyWord));
        } else {
            cacheMethodExample.or().andDeletedEqualTo(false);
        }
        Page page = PageHelper.startPage(pageNum, pageSize);
        List<CacheMethod> cacheMethodList = cacheMethodMapper.selectByExample(cacheMethodExample);
        int total = (int) page.getTotal();
        return super.getSuccessResult(cacheMethodList, pageNum, pageSize, total);
    }

    @Override
    public int deleteCacheMethodList(int id) {
        return cacheMethodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCacheMethodList(CacheMethod cacheMethod) {
        cacheMethod.setDeleted(false);
        return cacheMethodMapper.updateByPrimaryKeySelective(cacheMethod);
    }

    /**
     * 逻辑删除
     *
     * @param cacheMethod
     * @return
     */
    @Override
    public int insertCacheMethodList(CacheMethod cacheMethod) {
        cacheMethod.setDeleted(true);
        return cacheMethodMapper.updateByPrimaryKeySelective(cacheMethod);
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
