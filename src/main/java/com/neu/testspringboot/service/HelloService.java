package com.neu.testspringboot.service;

import com.neu.testspringboot.dto.UserLogin;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String verifyUserinfo(UserLogin userLogin){
        String msg;
        System.out.println("username: " + userLogin.getUsername());
        System.out.println("password: " + userLogin.getPassword());
        //if the useranme and passwor is correct then returns 'OK' message
        if("junghoon".equals(userLogin.getUsername()) && "1218".equals(userLogin.getPassword())) {
            msg = "ok";
        } else {
            msg = "error";
        }
        return msg;
    }
}
