package com.dyny.gms.exception;

import com.dyny.gms.controller.commonController.BaseController;
import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.service.MailService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @project: gms
 * @description: 全局异常记录
 * @author: wanggl
 * @create: 2018-11-02 09:19
 **/
@ControllerAdvice
public class GlobalExceptionHandler extends BaseController {
    private static Logger logger = Logger.getLogger(GlobalExceptionHandler.class);
    private static final String CACHE_MAIL_SENT_KEY = "ErrorMessageMailSent";
    private static final String CACHE_MAIL_SENT_VALUE = "1";

    @Autowired
    MailService mailService;
    @Autowired
    private CacheDao cacheDao;

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String errorRecorder(Exception e) throws InterruptedException {
        String errorMsg = e.getMessage();
        logger.error(errorMsg);
        String val = cacheDao.get(CACHE_MAIL_SENT_KEY);
        if (!CACHE_MAIL_SENT_VALUE.equals(val)) {
            mailService.sendTo("异常警告", errorMsg, null);
            cacheDao.set(CACHE_MAIL_SENT_KEY, CACHE_MAIL_SENT_VALUE);
        }
        return super.getErrorMsg(errorMsg);
    }


}
