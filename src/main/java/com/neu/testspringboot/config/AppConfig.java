package com.neu.testspringboot.config;

import com.neu.testspringboot.dao.HelloDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean("helloDaoBean")
    @Scope("prototype")
    public HelloDao helloDao() {
        HelloDao helloDao = HelloDao.getHelloDaoInstance();
        System.out.println("Call THIS METHOD");
//        HelloDao helloDao = new HelloDao();
        helloDao.ObjectName = "HelloDayByConfig";
        return helloDao;
    }
}
