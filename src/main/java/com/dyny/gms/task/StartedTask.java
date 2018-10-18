package com.dyny.gms.task;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 启动任务
 */
@Component
@Order(1)
public class StartedTask implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {


    }

}
