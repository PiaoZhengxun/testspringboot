package com.neu.testspringboot.service;

import com.neu.testspringboot.dao.UserInfoDAO;
import com.neu.testspringboot.dto.Message;
import com.neu.testspringboot.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    UserInfoDAO userInfoDAO;

    public Message findAll(){
        Message message = new Message();
        List<UserInfo> list = userInfoDAO.findAll();

        if (list.size() < 1) {
            message.setStatusCode(400);
            message.setMsg("error");
        } else {
            message.setStatusCode(200);
            message.setMsg("OK");
            message.setObj(list);
        }

        return message;
    }
}
