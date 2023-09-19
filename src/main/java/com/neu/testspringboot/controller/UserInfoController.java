package com.neu.testspringboot.controller;

import com.neu.testspringboot.dto.Message;
import com.neu.testspringboot.dto.Message2;
import com.neu.testspringboot.dto.Message3;
import com.neu.testspringboot.dto.Message4;
import com.neu.testspringboot.service.UserInfoService;
import com.neu.testspringboot.service.serviceImpl.UserInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {


    @Autowired
    UserInfoService userInfoService;

    @GetMapping("searchUsersInfo")
    public Message searchAll(){
        userInfoService.sayHello();
        Message message = userInfoService.findAll();

        return message;

    }

    @GetMapping("searchUsersInfo2")
    public Message2 searchAll2(){
        userInfoService.sayHello();
        Message2 message = userInfoService.findAll2();
        return message;
    }

    @GetMapping("searchUsersInfo3")
    public Message3 searchAll3(){
        userInfoService.sayHello();
        Message3 message = userInfoService.findAll3();
        return message;
    }

    @GetMapping("searchUsersInfo4")
    public Message4 searchAll4(){
        userInfoService.sayHello();
        Message4 message = userInfoService.findAll4();
        return message;
    }

}
