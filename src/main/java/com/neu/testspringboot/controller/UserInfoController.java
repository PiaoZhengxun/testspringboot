package com.neu.testspringboot.controller;

import com.neu.testspringboot.dto.Message;
import com.neu.testspringboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {


    @Autowired
    UserInfoService userInfoService;

    @GetMapping("searchUsersInfo")
    public Message searchAll(){

        Message message = userInfoService.findAll();

        return message;

    }

}
