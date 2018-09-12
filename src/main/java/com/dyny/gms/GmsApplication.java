package com.dyny.gms;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.servlet.MultipartConfigElement;
import java.util.Properties;

@SpringBootApplication
@EnableTransactionManagement
public class GmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmsApplication.class, args);
    }


    @Value("${import.temp}")
    private String path;

    /**
     * 文件上传临时路径
     */
    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation(path);
        return factory.createMultipartConfig();
    }

}
