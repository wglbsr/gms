package com.dyny.gms.task;

import com.dyny.gms.db.dao.GeneratorMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    private final Logger logger = Logger.getLogger(SchedulingConfig.class);


    @Autowired
    GeneratorMapper generatorMapper;

    @Scheduled(cron = "* * 4 * * ? ") // 每10S执行一次
    public void getToken() {

        int size = generatorMapper.calculateGenerateTime();
        logger.info("计算发电时间任务完成，影响行数:" + size);
    }
}
