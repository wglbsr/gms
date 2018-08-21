package com.dyny.gms.task;

import com.dyny.gms.db.dao.GeneratorMapper;
import com.dyny.gms.utils.Tool;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;
import java.sql.Timestamp;

/**
 * 定时任务
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    private final Logger logger = Logger.getLogger(SchedulingConfig.class);


    @Autowired
    GeneratorMapper generatorMapper;

    @Scheduled(cron = "* * 4 * * ? ") // 每天凌晨四点计算发电时间
    public void getToken() {

        int size = generatorMapper.calculateGenerateTime();
        logger.info("计算发电时间任务完成，影响行数:" + size);
    }


    @Value("${export.excel}")
    private String excelPath;

    @Value("${export.delete.timeout}")
    private long timeout;

    @Scheduled(cron = "* * 2 * * ? ") // 每天凌晨2点删除超时的文件
    public void deleteExcelFile() {
        File file = new File(excelPath);
        int fileCnt = 0;
        if (!file.isDirectory()) {
            logger.info("目录不存在");
            return;
        }
        for (File temp : file.listFiles()) {
            if (temp.isFile() && System.currentTimeMillis() - temp.lastModified() > this.timeout) {//超时删除
                temp.delete();
                fileCnt++;
            }
        }
        logger.info("删除超时文件任务完成，影响行数:" + fileCnt);
    }
}
