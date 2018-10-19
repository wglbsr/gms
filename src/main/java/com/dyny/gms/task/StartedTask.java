package com.dyny.gms.task;

import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.dao.CacheMethodMapper;
import com.dyny.gms.db.interceptor.ModifyInterceptor;
import com.dyny.gms.db.pojo.CacheMethod;
import com.dyny.gms.db.pojo.CacheMethodExample;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 启动任务
 */
@Component
@Order(1)
public class StartedTask implements ApplicationRunner {
    private static Logger logger = Logger.getLogger(StartedTask.class);

    @Autowired
    CacheMethodMapper cacheMethodMapper;
    @Autowired
    CacheDao cacheDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.initCacheMethod();
    }

    private void initCacheMethod() {
        CacheMethodExample cacheMethodExample = new CacheMethodExample();
        cacheMethodExample.or().andDeletedEqualTo(false);
        List<CacheMethod> cacheMethodList = cacheMethodMapper.selectByExample(cacheMethodExample);
        cacheDao.set(CacheMethod.class.getSimpleName(), cacheMethodList);
        logger.info("加载缓存");
    }

}
