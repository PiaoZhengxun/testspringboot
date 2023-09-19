package com.neu.testspringboot.service.serviceImpl;

import com.neu.testspringboot.dao.daoImpl.UserInfoDaoImpl;
import com.neu.testspringboot.dto.Message;
import com.neu.testspringboot.dto.Message2;
import com.neu.testspringboot.dto.Message3;
import com.neu.testspringboot.dto.Message4;
import com.neu.testspringboot.entity.UserInfo;
import com.neu.testspringboot.service.UserInfoService;
import com.neu.testspringboot.service.baseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl extends BaseServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDaoImpl userInfoDAO;

    public Message findAll(){

        userInfoDAO.sayHello();

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

    @Override
    public Message2 findAll2() {

        Message2 message2 = null;
        List<UserInfo> list = userInfoDAO.findAll();

        if (list.size() < 1) {
            message2 = new Message2(400, "error", null);
        } else {
            message2 = new Message2(200,"ok",list);
        }

        return message2;
    }

    @Override
    public Message3 findAll3() {

        List<UserInfo> list = userInfoDAO.findAll();

        if (list.size() < 1) {
            return Message3.getMessage3(400, "error", null);
        } else {
            return Message3.getMessage3(200,"ok",list);
        }
    }

    @Override
    public Message4 findAll4() {

        List<UserInfo> list = userInfoDAO.findAll();

        if (list.size() < 1) {
            return Message4.notFind("ERROR");
        } else {
            return Message4.ok("ok", list);
        }
    }
}
