package com.dyny.gms.exception;

import com.dyny.gms.controller.commonController.BaseController;
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
    @Autowired
    MailService mailService;

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String errorRecorder(Exception e) throws InterruptedException {
        String errorMsg = e.getMessage();
        logger.error(errorMsg);
        mailService.sendTo("异常警告", errorMsg, null);
        return super.getErrorMsg(errorMsg);
    }


}
