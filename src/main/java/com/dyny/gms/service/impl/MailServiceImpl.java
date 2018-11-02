package com.dyny.gms.service.impl;

import com.dyny.gms.exception.GlobalExceptionHandler;
import com.dyny.gms.service.MailService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @project: gms
 * @description: 邮件相关Service
 * @author: wanggl
 * @create: 2018-11-02 09:57
 **/
@Service
public class MailServiceImpl implements MailService {
    private static Logger logger = Logger.getLogger(MailServiceImpl.class);

    @Autowired
    private JavaMailSender javaMailSender;


    @Value("${system.mail.default.receiver}")
    private String receiver;
    @Value("${spring.mail.username}")
    private String sender;


    @Override
    public boolean sendTo(String title, String content, String[] receiverList) {
        MimeMessage message = null;
        if (receiverList == null || receiverList.length == 0) {
            receiverList = receiver.split(",");
        }
        try {
            message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(sender);
            helper.setSubject(title);
            helper.setText(content, true);
            for (String temp : receiverList) {
                helper.setTo(temp);
                logger.info("发送异常警告邮件给:" + temp);
                javaMailSender.send(message);
            }
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }

    }
}
