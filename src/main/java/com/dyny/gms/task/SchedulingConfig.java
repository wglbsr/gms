package com.dyny.gms.task;

import com.dyny.gms.db.dao.GeneratorMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;

/**
 * 定时任务
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
    private final Logger logger = Logger.getLogger(SchedulingConfig.class);


    @Autowired
    GeneratorMapper generatorMapper;

    @Scheduled(cron = "0 0 4 * * ? ") // 每天凌晨四点计算发电时间
    public void calculateGenerateTime() {
        int size = generatorMapper.calculateGenerateTimeToMach();
        int size2 = generatorMapper.calculateGenerateTimeToApTime();
        logger.info("计算c_mach表发电时间任务完成，影响行数:" + size);
        logger.info("计算ap_time表电时间任务完成，影响行数:" + size2);
    }


    @Value("${export.excel}")
    private String excelExportPath;

    @Value("${import.excel}")
    private String excelImportPath;

    @Value("${export.delete.timeout}")
    private long timeout;

    @Scheduled(cron = "0 0 2 * * ? ") // 每天凌晨2点删除超时的文件
    public void deleteExcelFile() {
        this.deleteFileByDir(excelExportPath);
        this.deleteFileByDir(excelImportPath);
    }

    private void deleteFileByDir(String excelExportPath) {
        logger.info("开始执行删除超时文件任务");
        File file = new File(excelExportPath);
        int fileCnt = 0;
        if (!file.isDirectory()) {
            logger.info("目录不存在");
            return;
        }
        for (File temp : file.listFiles()) {
            if (temp.isFile() && System.currentTimeMillis() - temp.lastModified() > this.timeout) {//超时删除
                logger.info("文件名:" + temp.getName());
                temp.delete();
                fileCnt++;
            }
        }
        logger.info("删除超时文件任务完成，影响行数:" + fileCnt);
    }
}
