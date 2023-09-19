package com.neu.testspringboot.controller;

import com.neu.testspringboot.dto.UserLogin;
import com.neu.testspringboot.service.serviceImpl.HelloServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @Resource(name= "helloServiceImpl")
    HelloServiceImpl helloService;

    @PostMapping("/verifyUserInfo1")
    public String verifyUserInfo1(@RequestBody UserLogin userLogin){
        String msg = helloService.verifyUserInfo1(userLogin);
        return msg;
    }

    @PostMapping("/verifyUserInfo2")
    public String verifyUserInfo2(@RequestBody UserLogin userLogin){
        String msg = helloService.verifyUserInfo2(userLogin);
        return msg;
    }

    @PostMapping("/verifyUserInfo3")
    public String verifyUserInfo3(@RequestBody UserLogin userLogin){
        String msg = helloService.verifyUserInfo3(userLogin);
        return msg;
    }

    //get username and password from URL
    @PostMapping("/verifyUserInfo")
    public String verifyUserInfo(@RequestBody UserLogin userLogin){
        String msg = helloService.verifyUserInfo1(userLogin);
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
