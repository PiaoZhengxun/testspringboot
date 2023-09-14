package com.neu.testspringboot.controller;

import com.neu.testspringboot.dto.UserLogin;
import com.neu.testspringboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    //get username and password from URL
    @PostMapping("/verifyUserinfo")
    public String verifyUserinfo(@RequestBody UserLogin userLogin){
        String msg = helloService.verifyUserinfo(userLogin);
        return msg;
    }

    @GetMapping("/sayHello")
    public String showHellp(){
        String msg = "Hello !";
        return msg;
    }

    @GetMapping("/showUsername")
    public String showUsername(String username){
        String msg = "Hello " + username;
        return msg;
    }

    @GetMapping("/showUsernameAge")
    public String showUsernameAge(@RequestParam("user") String username, int age){
        String msg = "Hello name: " + username + ", age: " +age;
        return msg;
    }
}
