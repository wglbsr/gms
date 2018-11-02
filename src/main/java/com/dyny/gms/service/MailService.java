package com.dyny.gms.service;

public interface MailService {

    boolean sendTo(String title, String content, String[] receiverList);
}
