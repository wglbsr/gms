package com.dyny.gms.db.interceptor;

import com.dyny.gms.db.cachce.CacheDao;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author:wanggl
 * @date:2018-10-18
 * @version:1.0.0
 */
@Intercepts({
        @Signature(type = Executor.class,
                method = "update",
                args = {MappedStatement.class, Object.class})})
public class ModifyInterceptor implements Interceptor {
    private static Logger logger = Logger.getLogger(ModifyInterceptor.class);

    @Autowired
    CacheDao cacheDao;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        return this.afterHandler(invocation);
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }


    /**
     * 在目标更新后删除缓存中对应的数据,避免脏读
     * 目前只能处理单个更新/删除,若批量的情况目前的解决方案是整个表更新到缓存
     * @param invocation
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private Object afterHandler(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        Method method = invocation.getMethod();
        Object[] args = invocation.getArgs();
        MappedStatement mappedStatement = (MappedStatement) args[0];
        Object mapperArgs =  args[1];
        String mapperId = mappedStatement.getId();
        Object result = invocation.proceed();
        int intResult = (int) result;
        if (intResult > 0) {
            List<String> interceptList = new ArrayList<>();
            interceptList.contains(mapperId);
        }

        return result;
    }
}
