package com.neu.testspringboot.service;

import com.neu.testspringboot.dao.HelloDao;
import com.neu.testspringboot.dto.UserLogin;
import com.neu.testspringboot.dto.UserStatus;
import com.neu.testspringboot.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

//    @Autowired
//    HelloDao helloDao;

    static HelloDao helloDao = HelloDao.getHelloDaoInstance();

    public String verifyUserInfo1(UserLogin userLogin){
        String msg;
        System.out.println("username: " + userLogin.getUserName());
        System.out.println("password: " + userLogin.getPassword());
        //if the useranme and passwor is correct then returns 'OK' message
        if("junghoon".equals(userLogin.getUserName()) && "1218".equals(userLogin.getPassword())) {
            msg = "ok";
        } else {
            msg = "error";
        }
        return msg + " Way 1";
    }

    public String verifyUserInfo2(UserLogin userLogin){
        String msg = "";
        System.out.println("username: " + userLogin.getUserName());
        System.out.println("password: " + userLogin.getPassword());
        UserStatus userStatus = helloDao.verifyUserInfoWay2(userLogin);
        //if the useranme and passwor is correct then returns 'OK' message
        if(userStatus != null) {
            msg = "ok";
        } else {
            msg = "error";
        }
        return msg + " Way 2";
    }

    public String verifyUserInfo3(UserLogin userLogin){
        String msg = "";
        System.out.println("username: " + userLogin.getUserName());
        System.out.println("password: " + userLogin.getPassword());
        int num = helloDao.verifyUserInfoWay3(userLogin);
        //if the useranme and passwor is correct then returns 'OK' message
        if(num == 1) {
            msg = "ok";
        } else {
            msg = "error";
        }
        return msg + " Way 3";
    }
}
